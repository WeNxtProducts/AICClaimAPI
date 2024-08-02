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
import com.wenxt.claims.model.LT_CLAIM_CHARGES;
import com.wenxt.claims.model.LtDocTodoListStatus;
import com.wenxt.claims.repository.LtClaimCheckListRepository;
import com.wenxt.claims.service.LtClaimCheckListService;

import jakarta.persistence.Column;

@Service
public class LtClaimCheckListServiceImpl implements LtClaimCheckListService{
	
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
	private LtClaimCheckListRepository claimCheckListRepo;

	@Override
	public String createClaimCheckList(ClaimsRequestDTO claimsRequestDTO) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
//			Long claimCoverId = Long.parseLong(claimsRequestDTO.getClaimCover().getFormFields().get("CCD_TRAN_ID"));
//			Optional<LT_CLAIM_COVER_DTLS> optionalUser = ccdtlsrepo.findById(claimCoverId);
//			LT_CLAIM_COVER_DTLS claim = optionalUser.orElse(new LT_CLAIM_COVER_DTLS());
			LtDocTodoListStatus claim = new LtDocTodoListStatus();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", claimsRequestDTO.getClaimCheckList().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setClaimCheckListFields(claim, entry.getValue());
			}

			try {
				LtDocTodoListStatus savedClaimDetails = claimCheckListRepo.save(claim);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Claim Checlist Details Saved successfully");
				data.put("Id", savedClaimDetails.getDTLS_TRAN_ID());
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
	
	private void setClaimCheckListFields(LtDocTodoListStatus claim, Map<String, String> fields) throws Exception {
		for (Map.Entry<String, String> entry : fields.entrySet()) {
			setClaimCheckListField(claim, entry.getKey(), entry.getValue());
		}
	}
	
	private void setClaimCheckListField(LtDocTodoListStatus user, String fieldName, String value) throws Exception {
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

	@Override
	public String getClaimCheckListById(Integer dTLS_TRAN_ID) throws IllegalArgumentException, IllegalAccessException {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LtDocTodoListStatus> optionalUser = claimCheckListRepo.findById(dTLS_TRAN_ID);
		LtDocTodoListStatus claim = optionalUser.get();
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
	public String deleteLtClaimCheckListByid(Integer dTLS_TRAN_ID) {
		try {
			Optional<LtDocTodoListStatus> optionalEntity = claimCheckListRepo.findById(dTLS_TRAN_ID);

			if (optionalEntity.isPresent()) {
				claimCheckListRepo.deleteById(dTLS_TRAN_ID);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + dTLS_TRAN_ID + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + dTLS_TRAN_ID + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + dTLS_TRAN_ID + ": " + e.getMessage());
			return response.toString();
		}
	}

	@Override
	public String updateLtClaimCheckList(ClaimsRequestDTO claimsRequestDTO, Integer dTLS_TRAN_ID) {
		JSONObject response = new JSONObject();

		try {
			Integer claimCheckListId = dTLS_TRAN_ID;
			Optional<LtDocTodoListStatus> optionalUser = claimCheckListRepo.findById(claimCheckListId);
			LtDocTodoListStatus claim = optionalUser.get();
			if (claim != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", claimsRequestDTO.getCheckList().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setClaimCheckListFields(claim, entry.getValue());
				}

				try {
					LtDocTodoListStatus savedClaimDetails = claimCheckListRepo.save(claim);
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
