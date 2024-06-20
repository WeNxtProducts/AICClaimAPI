package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wenxt.claims.model.ClaimRequestDTO;
import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.model.LT_CLAIM;
import com.wenxt.claims.model.LtClaimHdr;
import com.wenxt.claims.model.ProcedureInput;
import com.wenxt.claims.repository.LtClaimHdrRepo;
import com.wenxt.claims.repository.LtClaimRepository;
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
			claim.setCH_REF_NO(claimsRequestDTO.getCH_REF_NO());
			claim.setCH_LOSS_DT(dateConverter(claimsRequestDTO.getCH_LOSS_DT()));
			claim.setCH_INTIM_DT(dateConverter(claimsRequestDTO.getCH_INTIM_DT()));
			claim.setCH_INS_DT(new Date());
			
			LtClaimHdr savedClaimDetails = ltClaimHdrRepo.save(claim);
			
			Map<String, String> inputMap = new HashMap<>();
			inputMap.put("P_CH_TRAN_ID", savedClaimDetails.getCH_TRAN_ID().toString());
			
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
			response.put(statusCode, successCode);
			response.put(messageCode, "Claim Details Saved Successfully");
			response.put(dataCode, dataObj);
			
		}catch(Exception e) {
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
				response.put(messageCode, "Claim Details Deleted Successfully");
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
					response.put(messageCode, "Claim Details Updated Successfully");
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

}
