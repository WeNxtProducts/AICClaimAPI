package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
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
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.model.LT_CLAIM_BENEFICIARY;
import com.wenxt.claims.repository.LtClaimBeneficiaryRepository;
import com.wenxt.claims.service.LtClaimBeneficiaryService;

import jakarta.persistence.Column;

@Service
public class LtClaimBeneficiaryServiceImpl implements LtClaimBeneficiaryService {

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
	private LtClaimBeneficiaryRepository ltclaimbnfcryrepo;

	@Override
	public String createLtClaimBfcry(ClaimsRequestDTO claimsRequestDTO) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_CLAIM_BENEFICIARY claim = new LT_CLAIM_BENEFICIARY();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", claimsRequestDTO.getClaimBeneficiary().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setClaimBeneficiaryFields(claim, entry.getValue());
			}

			try {
				LT_CLAIM_BENEFICIARY savedClaimDetails = ltclaimbnfcryrepo.save(claim);
				response.put(statusCode, successCode);
				response.put(messageCode, "User created successfully");
				data.put("Id", savedClaimDetails.getCBEN_TRAN_ID());
				response.put(dataCode, data);
			} catch (Exception e) {
				response.put(statusCode, errorCode);
				response.put(messageCode, "An error occurred: " + e.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put(statusCode, errorCode);
			response.put(messageCode, "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	private void setClaimBeneficiaryFields(LT_CLAIM_BENEFICIARY claim, Map<String, String> fields) throws Exception {
		for (Map.Entry<String, String> entry : fields.entrySet()) {
			setClaimBeneficiaryField(claim, entry.getKey(), entry.getValue());
		}
	}

	private void setClaimBeneficiaryField(LT_CLAIM_BENEFICIARY user, String fieldName, String value) throws Exception {
		try {
			Field field = LT_CLAIM_BENEFICIARY.class.getDeclaredField(fieldName);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + fieldName;
			if (value != null && !value.isEmpty()) {
				Method setter = LT_CLAIM_BENEFICIARY.class.getMethod(setterMethodName, fieldType);
				setter.invoke(user, convertedValue);
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

	private Object convertStringToObject(String value, Class<?> fieldType) {
		if (fieldType.equals(Integer.class) && value.isEmpty() == false && value != null) {
			return Integer.parseInt(value);
		}

		else if (fieldType.equals(Long.class) && value != null && !value.isEmpty()) {
			return Long.parseLong(value);
		} else if (fieldType.equals(Double.class) && value.isEmpty() == false && value != null) {
			return Double.parseDouble(value);
		} else if (fieldType.equals(Short.class) && value.isEmpty() == false && value != null) {
			return Short.parseShort(value);
		} else if (fieldType.equals(LocalDateTime.class) && value.isEmpty() == false && value != null) {
			return dateTimeConverter(value);
		}

		else if (fieldType.equals(Date.class) && value.isEmpty() == false && value != null) {
			return dateConverter(value);
		}

		else {
			return value;
		}
	}

	public Object dateConverter(String value) {
		String dateStr = value;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException | java.text.ParseException e) {
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

	@Override
	public String getLtClaimBfcryById(Integer cben_pben_TRAN_id)
			throws IllegalArgumentException, IllegalAccessException {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_CLAIM_BENEFICIARY> optionalUser = ltclaimbnfcryrepo.findById(cben_pben_TRAN_id);
		LT_CLAIM_BENEFICIARY claim = optionalUser.get();
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
	public String deleteLtClaimBfcryByid(Integer cben_pben_TRAN_id) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		try {
			Optional<LT_CLAIM_BENEFICIARY> optionalEntity = ltclaimbnfcryrepo.findById(cben_pben_TRAN_id);

			if (optionalEntity.isPresent()) {
				ltclaimbnfcryrepo.deleteById(cben_pben_TRAN_id);

				response.put(statusCode, successCode);
				data.put("Id", cben_pben_TRAN_id);
				response.put(messageCode, "Record with ID " + cben_pben_TRAN_id + " deleted successfully");
				response.put(dataCode, data);
				return response.toString();

			} else {				
				response.put(statusCode, errorCode);
				response.put(messageCode, "Record with ID " + cben_pben_TRAN_id + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, "Error deleting record with ID " + cben_pben_TRAN_id + ": " + e.getMessage());
			return response.toString();
		}
	}

	@Override
	public String updateLtClaimBeneficiary(ClaimsRequestDTO claimsRequestDTO, Integer claim_Id) {

		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			Integer claimTrainid = claim_Id;
			Optional<LT_CLAIM_BENEFICIARY> savedClaimDetails = ltclaimbnfcryrepo.findById(claimTrainid);

			if (savedClaimDetails.isPresent()) {
				LT_CLAIM_BENEFICIARY saveClaim = savedClaimDetails.get();

				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", claimsRequestDTO.getClaimBeneficiary().getFormFields());

				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setClaimBeneficiaryFields(saveClaim, entry.getValue());
				}

				ltclaimbnfcryrepo.save(saveClaim);
				response.put(statusCode, successCode);
				data.put("Id", savedClaimDetails.get().getCBEN_TRAN_ID());
				response.put(messageCode, "Claim Details Updated Successfully");
				response.put(dataCode, data);
			} else {
				response.put(statusCode, errorCode);
				response.put(messageCode, "Claim with the provided ID not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put(statusCode, errorCode);
			response.put(messageCode, "An error occurred: " + e.getMessage());
		}

		return response.toString();

	}

}