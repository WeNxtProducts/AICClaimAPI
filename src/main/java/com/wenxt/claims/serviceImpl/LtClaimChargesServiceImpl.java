package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.model.LT_CLAIM_CHARGES;
import com.wenxt.claims.repository.LtClaimChargesRepository;
import com.wenxt.claims.service.LtClaimChargesService;

import jakarta.persistence.Column;

@Service
public class LtClaimChargesServiceImpl implements LtClaimChargesService {

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
	private LtClaimChargesRepository ltclaimChrgsrepo;

//	private static final String JDBC_URL = "jdbc:mysql://baseapi.cr4u8emg2x3o.eu-north-1.rds.amazonaws.com:3306/baseapi";
//	private static final String USERNAME = "admin";
//	private static final String PASSWORD = "D3Vt3aM#92";
//
//	@Value("${insert.message.claimChgrs}")
//	private String getallclaimChgrs;

	@Override
	public String createClaimCharges(ClaimsRequestDTO claimsRequestDTO, Integer tranId) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
//			Long claimCoverId = Long.parseLong(claimsRequestDTO.getClaimCover().getFormFields().get("CCD_TRAN_ID"));
//			Optional<LT_CLAIM_COVER_DTLS> optionalUser = ccdtlsrepo.findById(claimCoverId);
//			LT_CLAIM_COVER_DTLS claim = optionalUser.orElse(new LT_CLAIM_COVER_DTLS());
			LT_CLAIM_CHARGES claim = new LT_CLAIM_CHARGES();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", claimsRequestDTO.getClaimCharges().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setClaimChargesFields(claim, entry.getValue());
			}

			try {
				claim.setCC_CHRG_SEL_YN("Y");
				claim.setCC_CLAIM_TRAN_ID(tranId);
				LT_CLAIM_CHARGES savedClaimDetails = ltclaimChrgsrepo.save(claim);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Claim Charges Details Added Successfully");
				data.put("Id", savedClaimDetails.getCC_TRAN_ID());
				response.put("data", data);
			} catch (Exception e) {
				response.put("statusCode", errorCode);
				response.put("message", "An error occurred: " + e.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}
	
	private void setClaimChargesFields(LT_CLAIM_CHARGES claim, Map<String, String> fields) throws Exception {
		for (Map.Entry<String, String> entry : fields.entrySet()) {
			setClaimChargesField(claim, entry.getKey(), entry.getValue());
		}
	}
	
	private void setClaimChargesField(LT_CLAIM_CHARGES user, String fieldName, String value) throws Exception {
		try {
			Field field = LT_CLAIM_CHARGES.class.getDeclaredField(fieldName);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + fieldName;
			if (value != null && !value.isEmpty()) {
				Method setter = LT_CLAIM_CHARGES.class.getMethod(setterMethodName, fieldType);
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
		} else if (fieldType.equals(BigDecimal.class) && value.isEmpty() == false && value != null) {
			return new BigDecimal(value);
		} else if(fieldType.equals(Date.class) && value.isEmpty() == false && value != null){
			return dateConverter(value);
		} else {
			return value;
		}
	}
	
	private Object dateConverter(String value) {		
	String dateStr = value;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date date = null;
	try {
		date = sdf.parse(dateStr);
	} catch (Exception e) {
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
//	public String getAllClaimChargeslist() throws SQLException {
//		String query = "SELECT cben_TRAN_id,cben_claim_TRAN_id,cben_cp_TRAN_id,cben_pben_TRAN_id,cben_bnf_type,cben_relation_code,cben_bnf_name,cben_bnf_name_bl,cben_perc,cben_INS_id,cben_INS_dt,cben_MOD_id,cben_MOD_dt,cben_lc_paid_amt,cben_fc_paid_amt,cben_bank_code,cben_acct_code,cben_ref_id1,cben_ref_id2,cben_address1,cben_address2,cben_address3,cben_stat_code,cben_postal_code,cben_city_code,cben_address4,cben_address5,cben_remarks,cben_catg_code,cben_age,cben_guardian_name,cben_micr_code,cben_divn_code,cben_sr_no,cben_dob,cben_bnf_code,cben_flex_01,cben_flex_02,cben_flex_03,cben_flex_04,cben_flex_05,cben_flex_06 FROM lt_claim_beneficiary";
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
//		List<LT_CLAIM_CHARGES> exceptions = ltclaimChrgsrepo.findAll();
//
//		JSONObject response = new JSONObject();
//		response.put("Status", "SUCCESS");
//		response.put("Message", getallclaimChgrs);
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

	@Override
	public String getClaimChargesById(Integer cc_TRAN_id) throws IllegalArgumentException, IllegalAccessException {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_CLAIM_CHARGES> optionalUser = ltclaimChrgsrepo.findById(cc_TRAN_id);
		LT_CLAIM_CHARGES claim = optionalUser.get();
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
	public String deleteClaimChargesByid(Integer cc_TRAN_id) {
		try {
			Optional<LT_CLAIM_CHARGES> optionalEntity = ltclaimChrgsrepo.findById(cc_TRAN_id);

			if (optionalEntity.isPresent()) {
				ltclaimChrgsrepo.deleteById(cc_TRAN_id);

				JSONObject response = new JSONObject();
				response.put(statusCode, successCode);
				response.put(messageCode, "Record with ID " + cc_TRAN_id + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put(statusCode, errorCode);
				response.put(messageCode, "Record with ID " + cc_TRAN_id + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put(statusCode, errorCode);
			response.put(messageCode, "Error deleting record with ID " + cc_TRAN_id + ": " + e.getMessage());
			return response.toString();
		}
	}
	
	@Override
	public String updateLtClaimCharges(ClaimsRequestDTO claimsRequestDTO, Integer claim_Id) {
		JSONObject response = new JSONObject();

		try {
			Integer claimCoverId = claim_Id;
			Optional<LT_CLAIM_CHARGES> optionalUser = ltclaimChrgsrepo.findById(claimCoverId);
			LT_CLAIM_CHARGES claim = optionalUser.get();
			if (claim != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", claimsRequestDTO.getClaimCharges().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setClaimChargesFields(claim, entry.getValue());
				}

				try {
					LT_CLAIM_CHARGES savedClaimDetails = ltclaimChrgsrepo.save(claim);
					response.put(statusCode, successCode);
					response.put(messageCode, "Claim Charges Details Updated Successfully");
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
