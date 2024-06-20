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
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.model.LtDocTodoListStatus;
import com.wenxt.claims.repository.LtDocToDoListRepo;
import com.wenxt.claims.service.LtDocToDoListService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class LtDocToDoListServiceImpl implements LtDocToDoListService {

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
	private LtDocToDoListRepo ltDocToDoListRepo;

	@Override
	public String saveDocToDoList(ClaimsRequestDTO claimsRequestDTO, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
//			Long claimCoverId = Long.parseLong(claimsRequestDTO.getClaimCover().getFormFields().get("CCD_TRAN_ID"));
//			Optional<LT_CLAIM_COVER_DTLS> optionalUser = ccdtlsrepo.findById(claimCoverId);
//			LT_CLAIM_COVER_DTLS claim = optionalUser.orElse(new LT_CLAIM_COVER_DTLS());
			LtDocTodoListStatus toDoList = new LtDocTodoListStatus();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", claimsRequestDTO.getClaimDocToDoList().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setLtDocToDoListFields(toDoList, entry.getValue());
			}

			try {
				String userId = "";
				Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
				if (principal instanceof UserDetails) {
					userId = ((UserDetails) principal).getUsername();
				}
				toDoList.setDTLS_INS_ID(userId);
				toDoList.setDTLS_INS_DT(new Date());
				LtDocTodoListStatus savedToDoListDetails = ltDocToDoListRepo.save(toDoList);
				response.put(statusCode, successCode);
				response.put(messageCode, "User created successfully");
				data.put("Id", savedToDoListDetails.getDTLS_TRAN_ID());
				response.put("data", data);
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

	private void setLtDocToDoListFields(LtDocTodoListStatus docList, Map<String, String> value) throws Exception {
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setLtDocToDoListField(docList, entry.getKey(), entry.getValue());
		}
	}

	private void setLtDocToDoListField(LtDocTodoListStatus docList, String key, String value) throws Exception {
		try {
			Field field = LtDocTodoListStatus.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = LtDocTodoListStatus.class.getMethod(setterMethodName, fieldType);
				setter.invoke(docList, convertedValue);
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
		} else if (fieldType.equals(Date.class) && value.isEmpty() == false && value != null) {
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

	@Override
	public String updateDocToDoList(Integer tranId, ClaimsRequestDTO claimsRequestDTO) {
		JSONObject response = new JSONObject();

		try {
			Optional<LtDocTodoListStatus> optionalUser = ltDocToDoListRepo.findById(tranId);
			LtDocTodoListStatus docToDoList = optionalUser.get();
			if (docToDoList != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", claimsRequestDTO.getClaimDocToDoList().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setLtDocToDoListFields(docToDoList, entry.getValue());
				}

				try {
					String userId = "";
					Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
					if (principal instanceof UserDetails) {
						userId = ((UserDetails) principal).getUsername();
					}
					docToDoList.setDTLS_MOD_ID(userId);
					docToDoList.setDTLS_MOD_DT(new Date());
					LtDocTodoListStatus savedltDocToDoListDetails = ltDocToDoListRepo.save(docToDoList);
					response.put(statusCode, successCode);
					response.put(messageCode, "Claim Details Updated Successfully");
				} catch (Exception e) {
					response.put(statusCode, errorCode);
					response.put(messageCode, "An error occurred: " + e.getMessage());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put(statusCode, errorCode);
			response.put(messageCode, "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	@Override
	public String getDocToDoList(Integer tranId) throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LtDocTodoListStatus> optionalUser = ltDocToDoListRepo.findById(tranId);
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
	public String deleteDocToDoList(Integer tranId) {
		try {
			Optional<LtDocTodoListStatus> optionalEntity = ltDocToDoListRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				ltDocToDoListRepo.deleteById(tranId);

				JSONObject response = new JSONObject();
				response.put(statusCode, successCode);
				response.put(messageCode, "Record with ID " + tranId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put(statusCode, errorCode);
				response.put(messageCode, "Record with ID " + tranId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put(statusCode, errorCode);
			response.put(messageCode, "Error deleting record with ID " + tranId + ": " + e.getMessage());
			return response.toString();
		}
	}

}
