package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.model.LT_CLAIM_ESTIMATE;
import com.wenxt.claims.repository.LtClaimEstimateRepository;
import com.wenxt.claims.service.LtClaimEstimateService;

import jakarta.persistence.Column;

@Service
public class LtClaimEstimateServiceImpl implements LtClaimEstimateService{

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
	
	@Autowired
	private LtClaimEstimateRepository claimEstrepo;
//
//	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
//	private static final String USERNAME = "admin";
//	private static final String PASSWORD = "D3Vt3aM#92";
//
//	@Value("${insert.message.ltclaimEST}")
//	private String getallltClaimeEST;

	@Override
	public String createLtClaimEst(ClaimsRequestDTO claimsRequestDTO, Integer tranId) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_CLAIM_ESTIMATE claimEstimate = new LT_CLAIM_ESTIMATE();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", claimsRequestDTO.getClaimEstimate().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setClaimEstimateFields(claimEstimate, entry.getValue());
			}

			try {
				claimEstimate.setCE_COVER_SEL_YN("Y");
				claimEstimate.setCE_CLM_TRAN_ID(tranId);
				claimEstimate.setCE_FRZ_FLAG("N");
				LT_CLAIM_ESTIMATE savedClaimDetails = claimEstrepo.save(claimEstimate);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Claim Cover Details Successfully");
				data.put("Id", savedClaimDetails.getCE_TRAN_ID());
				response.put(dataCode, data);
			} catch (Exception e) {
				response.put(statusCode, errorCode);
				response.put(messageCode, "An error occurred: " + e.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}
	
	private void setClaimEstimateFields(LT_CLAIM_ESTIMATE claim, Map<String, String> fields) throws Exception {
		for (Map.Entry<String, String> entry : fields.entrySet()) {
			setClaimEstimateField(claim, entry.getKey(), entry.getValue());
		}
	}
	
	private void setClaimEstimateField(LT_CLAIM_ESTIMATE user, String fieldName, String value) throws Exception {
		try {
			Field field = LT_CLAIM_ESTIMATE.class.getDeclaredField(fieldName);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + fieldName;
			if (value != null && !value.isEmpty()) {
				Method setter = LT_CLAIM_ESTIMATE.class.getMethod(setterMethodName, fieldType);
				setter.invoke(user, convertedValue);
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
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
		} else {
			return value;
		}
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
//	public String getAllLtClaimEstlist() throws SQLException {
//		String query = "SELECT ce_TRAN_id, ce_claim_TRAN_id, ce_est_setl_unit, ce_est_no_of_units, ce_lc_est_amt, ce_fc_est_amt, ce_lc_prem_os, ce_fc_prem_os, ce_lc_loan_os, ce_fc_loan_os, ce_lc_loan_int, ce_fc_loan_int, ce_lc_acc_profit, ce_fc_acc_profit, ce_lc_net_est_amt, ce_fc_net_est_amt, ce_act_setl_unit, ce_act_no_of_units, ce_setl_start_dt, ce_lc_paid_amt, ce_fc_paid_amt, ce_ref_no, ce_remarks, ce_frz_flag, ce_close_flag, ce_INS_id, ce_INS_dt, ce_MOD_id, ce_MOD_dt, ce_lc_prem_os_int, ce_fc_prem_os_int, ce_unit_lc_amt, ce_unit_fc_amt, ce_unpaid_prem_flag, ce_total_chrg_amt, ce_cash_back_fc_value, ce_cash_back_lc_value, ce_fc_excess_amt, ce_lc_excess_amt, ce_asst_sepr_pup_amt, ce_asst_sepr_new_sa, ce_asst_sepr_bon FROM lt_claim_estimate";
//
//		
//		
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
//		List<LT_CLAIM_ESTIMATE> exceptions = claimEstrepo.findAll();
//
//		JSONObject response = new JSONObject();
//		response.put("Status", "SUCCESS");
//		response.put("Message", getallltClaimeEST);
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

	@Override
	public String getLtClaimEstById(Integer ce_TRAN_id) throws IllegalArgumentException, IllegalAccessException {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_CLAIM_ESTIMATE> optionalUser = claimEstrepo.findById(ce_TRAN_id);
		LT_CLAIM_ESTIMATE claim = optionalUser.get();
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
	public String deleteLtClaimEstByid(Integer ce_TRAN_id) {
		try {
			Optional<LT_CLAIM_ESTIMATE> optionalEntity = claimEstrepo.findById(ce_TRAN_id);

			if (optionalEntity.isPresent()) {
				claimEstrepo.deleteById(ce_TRAN_id);

				JSONObject response = new JSONObject();
				response.put(statusCode, successCode);
				response.put(messageCode, "Record with ID " + ce_TRAN_id + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put(statusCode, errorCode);
				response.put(messageCode, "Record with ID " + ce_TRAN_id + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put(statusCode, errorCode);
			response.put(messageCode, "Error deleting record with ID " + ce_TRAN_id + ": " + e.getMessage());
			return response.toString();
		}
	}
	
	@Override
	public String updateLtClaimEstimate(ClaimsRequestDTO claimsRequestDTO, Integer claim_Id) {
		JSONObject response = new JSONObject();

		try {
			Integer claimCoverId = claim_Id;
			Optional<LT_CLAIM_ESTIMATE> optionalUser = claimEstrepo.findById(claimCoverId);
			LT_CLAIM_ESTIMATE claim = optionalUser.get();
			if (claim != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", claimsRequestDTO.getClaimEstimate().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setClaimEstimateFields (claim, entry.getValue());
				}

				try {
					LT_CLAIM_ESTIMATE savedClaimDetails = claimEstrepo.save(claim);
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

}
