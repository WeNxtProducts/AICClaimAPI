package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.http.HttpHost;
import org.elasticsearch.action.DocWriteResponse.Result;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wenxt.claims.model.ClaimRequestDTO;
import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.model.LT_CLAIM;
import com.wenxt.claims.model.LhClaimEstimate;
import com.wenxt.claims.model.LtClaimDed;
import com.wenxt.claims.model.LtClaimHdr;
import com.wenxt.claims.model.ProcedureInput;
import com.wenxt.claims.model.SearchRequestDTO;
import com.wenxt.claims.repository.ClaimDeducRepo;
import com.wenxt.claims.repository.ClaimHistoryRepo;
import com.wenxt.claims.repository.LtClaimHdrRepo;
import com.wenxt.claims.repository.LtClaimRepository;
import com.wenxt.claims.service.ElasticSearchProxy;
import com.wenxt.claims.service.LtClaimService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class LtClaimServiceImpl implements LtClaimService {

	@Value("${spring.message.code}")
	private String messageCode;

	@Value("${spring.status.code}")
	private String statusCode;

	@Value("${spring.data.code}")
	private String dataCode;

	@Value("${spring.success.code}")
	private String successCode;

	@Value("${spring.error.code}")
	private String errorCode;

	@Value("${spring.warning.code}")
	private String warningCode;
	
	@Value("${string.baseApi.path}")
	private String baseDocPath;

	@Autowired
	private LtClaimRepository ltclaimrepo;
	
	@Autowired
	private LtClaimHdrRepo ltClaimHdrRepo;
	
	@Autowired
	private ClaimHistoryRepo claimHistoryRepo;
	
	@Autowired
	private ClaimDeducRepo claimDedRepo;
	
	@Autowired
	private ElasticSearchProxy elasticSearch;

//	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
//	private static final String USERNAME = "admin";
//	private static final String PASSWORD = "D3Vt3aM#92";
//
//	@Value("${insert.message.ltclaim}")
//	private String getallltClaim;

	@Override
	public String createLtClaim(ClaimRequestDTO claimsRequestDTO, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LtClaimHdr claim = new LtClaimHdr();

			claim.setCH_CLAIM_BAS(claimsRequestDTO.getCH_CLAIM_BAS());
			claim.setCH_CLAIM_BAS_VAL(claimsRequestDTO.getCH_CLAIM_BAS_VAL());
			claim.setCH_CLAIM_TYPE(claimsRequestDTO.getCH_CLAIM_TYPE());
			claim.setCH_ASSR_CODE(claimsRequestDTO.getASSURED_CODE());
			claim.setCH_REF_NO(claimsRequestDTO.getCH_REF_NO());
			claim.setCH_LOSS_DT(dateConverter(claimsRequestDTO.getCH_LOSS_DT()));
			claim.setCH_INTIM_DT(dateConverter(claimsRequestDTO.getCH_INTIM_DT()));
			claim.setCH_INS_DT(new Date());
			claim.setCH_PEMP_ID(claimsRequestDTO.getCH_PEMP_ID());

			Map<String, Object> claimHdrFields = new HashMap<>();
			claimHdrFields.put("Claim_Basis", claimsRequestDTO.getCH_CLAIM_BAS());
			claimHdrFields.put("Basis_Value", claimsRequestDTO.getCH_CLAIM_BAS_VAL());
			claimHdrFields.put("Claim_Type", claimsRequestDTO.getCH_CLAIM_TYPE());
			claimHdrFields.put("Reference_No", claimsRequestDTO.getCH_REF_NO());
			claimHdrFields.put("Loss_Date", dateConverter(claimsRequestDTO.getCH_LOSS_DT()));
			claimHdrFields.put("Intimation_Date", dateConverter(claimsRequestDTO.getCH_INTIM_DT()));
			claimHdrFields.put("CH_INS_DT", new Date());

			LtClaimHdr savedClaimDetails = ltClaimHdrRepo.save(claim);
			

//			RestClientBuilder builder = RestClient.builder(new HttpHost("localhost", 9200, "http"));
//			RestHighLevelClient client = new RestHighLevelClient(builder);
//
//			IndexRequest req = new IndexRequest("claimheader").id(savedClaimDetails.getCH_TRAN_ID().toString())
//					.source(claimHdrFields);
//
//			IndexResponse res = client.index(req, RequestOptions.DEFAULT);
//
//			if (res.getResult() == Result.CREATED) {
//				System.out.println("Document indexed successfully!");
//			} else {
//				System.out.println("DOCUMENT NOT INDEXED");
//			}
//
//			client.close();

			Map<String, Object> inputMap = new HashMap<>();
			inputMap.put("P_CH_TRAN_ID", savedClaimDetails.getCH_TRAN_ID());

			ProcedureInput input = new ProcedureInput();
			input.setInParams(inputMap);

			String authorizationHeader = request.getHeader("Authorization");
			String token = authorizationHeader.substring(7).trim();
			String url = baseDocPath + "common/invokeProcedure?procedureName=" + "P_POPULATE_ELIGIBLE_POL";
			HttpHeaders headers = new HttpHeaders();
			RestTemplate restTemplate = new RestTemplate();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("Authorization", "Bearer " + token);
			HttpEntity<ProcedureInput> requestEntity = new HttpEntity<>(input, headers);
			ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
			JSONObject dataObj = new JSONObject();
			dataObj.put("Id", savedClaimDetails.getCH_TRAN_ID());
			LtClaimHdr claimHdrDetails = ltClaimHdrRepo.getById(savedClaimDetails.getCH_TRAN_ID());
			dataObj.put("CH_REF_NO", claimHdrDetails.getCH_REF_NO());
			response.put(statusCode, successCode);
			response.put(messageCode, "Claim Details Saved Successfully");
			response.put(dataCode, dataObj);

		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}

		return response.toString();
	}

	private void setClaimFields(LT_CLAIM claim, Map<String, String> fields) throws Exception {
		for (Map.Entry<String, String> entry : fields.entrySet()) {
			setClaimField(claim, entry.getKey(), entry.getValue());
		}
	}

	private void setClaimField(LT_CLAIM user, String fieldName, String value) throws Exception {
		try {
			Field field = LT_CLAIM.class.getDeclaredField(fieldName);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + fieldName;
			if (value != null && !value.isEmpty()) {
				Method setter = LT_CLAIM.class.getMethod(setterMethodName, fieldType);
				setter.invoke(user, convertedValue);
			}
		} catch (NoSuchFieldException e) {
//			e.printStackTrace();
		}
	}

	private Object convertStringToObject(String value, Class<?> fieldType) {
		if (fieldType.equals(Integer.class) && value.isEmpty() == false && value != null) {
			return Integer.parseInt(value);
		} else if (fieldType.equals(Double.class) && value.isEmpty() == false && value != null) {
			return Double.parseDouble(value);
		} else if (fieldType.equals(Short.class) && value.isEmpty() == false && value != null) {
			return Short.parseShort(value);
		} else if (fieldType.equals(LocalDateTime.class) && value.isEmpty() == false && value != null) {
			return dateTimeConverter(value);
		} else if (fieldType.equals(Date.class) && value.isEmpty() == false && value != null) {
			return dateConverter(value);
		} else {
			return value;
		}
	}

	private Date dateConverter(String value) {
		String dateStr = value;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return date;
	}

	private Object dateTimeConverter(String value) {
		String dateString = value;
		if (value.length() > 10) {
			dateString = value.substring(0, 10);
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalTime defaultTime = LocalTime.of(0, 0, 0);
		LocalDate localDate = LocalDate.parse(dateString, formatter);
		LocalDateTime dateTime = LocalDateTime.of(localDate, defaultTime);
		String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime parsedDateTime = LocalDateTime.parse(formattedDateTime, formatters);
		return parsedDateTime;
	}

//	@Override
//	public String getAllLtClaimlist() throws SQLException {
//		String query = "SELECT claim_TRAN_id,claim_pol_TRAN_id,claim_pol_no,claim_ds_code,claim_poad_serial_no,claim_assr_code,claim_curr_code,claim_exch_rate,claim_loss_dt,claim_intm_dt,claim_no,claim_type,claim_remarks,claim_ref_no,claim_pay_to,claim_close_flag,claim_status,claim_frz_flag,claim_INS_id,claim_INS_dt,claim_MOD_id,claim_MOD_dt,claim_cust_code,claim_accnt_pay_code,claim_addl_status,claim_rev_res_flag,claim_resv_amt,claim_util_amt,claim_apprv_dt,claim_apprv_status,claim_unit_sell_yn,claim_reopen_dt,claim_reopen_reason,claim_pol_valid_yn,claim_med_code,claim_lc_rla_amount,claim_pci_ref_no,claim_lc_wak_amt,claim_lc_serv_fee,claim_lc_risk_prem,claim_dis_cert_dt,claim_med_exp_dt,claim_sickness_dt,claim_excl_typ,claim_excl_reason,claim_memb_code,claim_diseases_code,claim_diseases_remarks,claim_assrd_ref_id1,claim_fee_hospitals,claim_icd_diseases_dtl,claim_hosp_addm_dt,claim_hosp_dschg_dt,clm_excl_yn,claim_claimant_code,claim_int_email,claim_int_mobile,claim_pay_method,claim_pay_rate FROM lt_claim";
//		ResultSet headerResultSet = executeQuery(query);
//
//		JSONObject header = new JSONObject();
//		ResultSetMetaData rsmd = headerResultSet.getMetaData();
//		int columnCount = rsmd.getColumnCount();
//		for (int i = 1; i <= columnCount; i++) {
//			String columnName = rsmd.getColumnName(i);
//			header.put(columnName, columnName);
//		}
//
//		List<LT_CLAIM> exceptions = ltclaimrepo.findAll();
//
//		JSONObject response = new JSONObject();
//		response.put("Status", "SUCCESS");
//		response.put("Message", getallltClaim);
//		response.put("Heading", header);
//		response.put("Data", exceptions);
//
//		return response.toString();
//
//	}
//
//	private ResultSet executeQuery(String query) throws SQLException {
//		try {
//			// Load the MySQL JDBC driver
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//
//		// Establish a connection
//		Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
//
//		// Create a statement
//		Statement statement = connection.createStatement();
//
//		// Execute the query and return the result set
//		return statement.executeQuery(query);
//	}
//
//
	@Override
	public String getLtClaimById(Integer claim_TRAN_id, HttpServletRequest request)
			throws IllegalArgumentException, IllegalAccessException {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_CLAIM> optionalUser = ltclaimrepo.findById(claim_TRAN_id);
		LT_CLAIM claim = optionalUser.get();
		if (claim != null) {
			for (int i = 0; i < claim.getClass().getDeclaredFields().length; i++) {
				Field field = claim.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(claim);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
	}

	@Override
	public String deleteLtClaimByid(Integer claim_TRAN_id) {
		JSONObject response = new JSONObject();
		try {
			Optional<LT_CLAIM> optionalUser = ltclaimrepo.findById(claim_TRAN_id);
			LT_CLAIM claim = optionalUser.get();
			if (claim != null) {
				ltclaimrepo.deleteById(claim_TRAN_id);
				response.put(statusCode, successCode);
				response.put(messageCode, "Claim Cover Details Deleted Successfully");
			}
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

	@Override
	public String updateLtClaim(ClaimsRequestDTO claimsRequestDTO, Integer claim_Id) {
		JSONObject response = new JSONObject();

		try {
			Integer claimCoverId = claim_Id;
			Optional<LT_CLAIM> optionalUser = ltclaimrepo.findById(claimCoverId);
			LT_CLAIM claim = optionalUser.get();
			if (claim != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", claimsRequestDTO.getFrontForm().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setClaimFields(claim, entry.getValue());
				}

				try {
					LT_CLAIM savedClaimDetails = ltclaimrepo.save(claim);
					response.put(statusCode, successCode);
					response.put(messageCode, "Claim Cover Details Updated Successfully");
				} catch (Exception e) {
					response.put("statusCode", errorCode);
					response.put("message", "An error occurred: " + e.getMessage());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	@Override
	public String getListOfPolicies(Integer sysId) {
		JSONObject response = new JSONObject();
			try {
				
				List<String> listOfPolicyNumbers = ltclaimrepo.getListOfPolicies(sysId);
				
				JSONObject dataObj = new JSONObject();
				dataObj.put("Id", sysId);
				dataObj.put("Policy_Numbers", listOfPolicyNumbers);
				response.put(statusCode, successCode);
				response.put(messageCode, "List Of Policies Fetched Successfully");
				response.put(dataCode, dataObj);
			}catch(Exception e) {
				response.put(statusCode, errorCode);
				response.put(messageCode, e.getMessage());
			}
		return response.toString();
	}

	@Override
	public String getClaimHeader(Integer tranId) throws Exception{
		JSONObject inputObject = new JSONObject();
		Optional<LtClaimHdr> optionalUser = ltClaimHdrRepo.findById(tranId);
		LtClaimHdr claim = optionalUser.get();
		if (claim != null) {
			for (int i = 0; i < claim.getClass().getDeclaredFields().length; i++) {
				Field field = claim.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(claim);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
	}

	@Override
	public String getClaimHistory(Integer tranId, HttpServletRequest request) throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LhClaimEstimate> optionalUser = claimHistoryRepo.findById(tranId);
		LhClaimEstimate claim = optionalUser.get();
		if (claim != null) {
			for (int i = 0; i < claim.getClass().getDeclaredFields().length; i++) {
				Field field = claim.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(claim);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
	}

	@Override
	public String claimDeductionsave(String cD_WAIVE_PREM_INT, String cD_WAIVE_LOAN_INT, Integer tranId)throws Exception {
		JSONObject response = new JSONObject();
		Optional<LtClaimDed> optionalUser = claimDedRepo.findById(tranId);
		LtClaimDed claim = optionalUser.get();
		if (claim != null) {
			claim.setCD_WAIVE_PREM_INT(cD_WAIVE_PREM_INT);
			claim.setCD_WAIVE_LOAN_INT(cD_WAIVE_LOAN_INT);
			
			claimDedRepo.save(claim);
			response.put(statusCode, successCode);
			response.put(messageCode, "Claim Deduction Flag Details Updated Successsfully");
		}
		return response.toString();
	}

	@Override
	public String getClaimHdrDetails(Integer tranId) throws Exception {
		JSONObject response = new JSONObject();
		JSONObject inputObject = new JSONObject();
		
		Optional<LtClaimHdr> claimHeader = ltClaimHdrRepo.findById(tranId);
		LtClaimHdr claimHeaderDetails = claimHeader.get();
		if(claimHeaderDetails != null) {
			for (int i = 0; i < claimHeaderDetails.getClass().getDeclaredFields().length; i++) {
				Field field = claimHeaderDetails.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(claimHeaderDetails);
					columnName = column.name();
		            if (value != null && field.getType().equals(Date.class)) {
		                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		                String formattedDate = dateFormat.format((Date) value);
		                inputObject.put(columnName, formattedDate);
		            } else {
		                inputObject.put(columnName, value);
		            }
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "The Claim Header Details Fetched Successfully");
			response.put(dataCode, inputObject);
		}else {
			response.put(statusCode, errorCode);
			response.put(messageCode, "No Such record present");
		}
		return response.toString();
	}

	@Override
	public String deleteClaimHdrDetails(Integer tranId) {
		JSONObject response = new JSONObject();
		try {
			Optional<LtClaimHdr> optionalUser = ltClaimHdrRepo.findById(tranId);
			LtClaimHdr claim = optionalUser.get();
			if (claim != null) {
				ltClaimHdrRepo.deleteById(tranId);
				response.put(statusCode, successCode);
				response.put(messageCode, "Claim Header Details Deleted Successfully");
			}
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

	@Override
	public String saveClaimFlagDetails(Integer tranId, String cLM_STATUS, String cLM_STATUS_CODE, String freezeFlag) {
		JSONObject response = new JSONObject();
		try {
			Optional<LT_CLAIM> optionalUser = ltclaimrepo.findById(tranId);
			LT_CLAIM claim = optionalUser.get();
			if (claim != null) {
				claim.setCLM_STATUS(cLM_STATUS_CODE);
				claim.setCLM_STA_CODE(cLM_STATUS);
				claim.setCLM_FRZ_YN(freezeFlag);
				ltclaimrepo.save(claim);
				response.put(statusCode, successCode);
				response.put(messageCode, "Claim Flag Details Updated Successfully");
			}
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

	@Override
	public String search(SearchRequestDTO searchRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		QueryBuilder query = QueryBuilders.matchQuery("_all", searchRequest.getSearchTerm());
		
		if(searchRequest.getOffset() == 1) {
			searchRequest.setOffset(0);
		}

		try {
			String url = "http://localhost:8098/common/getlistingdata?queryId="+searchRequest.getQueryId()
			+"&limit="+searchRequest.getLimit()+"&offset="+searchRequest.getOffset();
			HttpHeaders headers = new HttpHeaders();
			RestTemplate restTemplate = new RestTemplate();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("Authorization", "Bearer " + token);
			HttpEntity<String> requestEntity = new HttpEntity<>(headers);
			ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
			JSONObject resultObject = new JSONObject(responseEntity.getBody());

//			System.out.println(resultObject);
			JSONArray jsonArray = (JSONArray) resultObject.getJSONArray("Data");
			
			ResultSet results = elasticSearch.search(query, "LT_CLAIM_HDR", "CH_TRAN_ID", searchRequest.getLimit(), searchRequest.getOffset()
					, null, null);

			JSONObject object = new JSONObject();
			List<JSONObject> resultList = new ArrayList();
			while (results.next()) {
				object = new JSONObject();
				ResultSetMetaData metaData = results.getMetaData();
					object.put("ID", results.getObject("CH_TRAN_ID"));
					object.put("Status", results.getObject("CH_STATUS"));
					object.put("Intimation_Date", results.getObject("CH_INTIM_DT"));
					object.put("Loss_Date", results.getObject("CH_LOSS_DT"));
					object.put("Basis_Value", results.getObject("CH_CLAIM_BAS_VAL"));
					object.put("Claim_Basis", results.getObject("CH_CLAIM_BAS"));
					object.put("Claim_Type", results.getObject("CH_CLAIM_TYPE"));
					object.put("Reference_No", results.getObject("CH_REF_NO"));
					
					resultList.add(object);
			}
			
			response.put(messageCode, "Search Results Fetched Successfully");
			response.put("Heading", resultObject.get("Heading"));
			response.put(dataCode, resultList);
			response.put("Count", results.getFetchSize());
			response.put(statusCode, successCode);
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

}
