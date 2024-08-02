package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LT_POL_DISCLOAD;
import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.repository.LtPolDiscLoadRepository;
import com.wenxt.claims.service.LtPolDiscLoadService;

import jakarta.persistence.Column;

@Service
public class LtPolDiscLoadServiceImpl implements LtPolDiscLoadService {
	
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
	private LtPolDiscLoadRepository polDiscLoadRepo;

	@Override
	public String createPolDiscLoad(ProposalEntryRequest proposalEntryRequest, Integer tranId) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_POL_DISCLOAD polDiscLoad = new LT_POL_DISCLOAD();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			if(proposalEntryRequest.getPolDiscLoad() != null) {
			fieldMaps.put("frontForm", proposalEntryRequest.getPolDiscLoad().getFormFields());
			}else {
				fieldMaps.put("frontForm", proposalEntryRequest.getPolDiscLoad().getFormFields());
			}
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setPolDiscLoadFields(polDiscLoad, entry.getValue());
			}

			try {
				polDiscLoad.setPDL_POL_TRAN_ID(tranId);
				polDiscLoad.setPDL_INS_DT(new Date(System.currentTimeMillis()));
				LT_POL_DISCLOAD savedPolDiscLoadDetails = polDiscLoadRepo.save(polDiscLoad);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Pol Disc Load Details Created Successfully");
				data.put("Id", savedPolDiscLoadDetails.getPDL_TRAN_ID());
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

	private void setPolDiscLoadFields(LT_POL_DISCLOAD polDiscLoad, Map<String, String> value)throws Exception {
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setPolDiscLoadField(polDiscLoad, entry.getKey(), entry.getValue());
		}
	}

	private void setPolDiscLoadField(LT_POL_DISCLOAD polDiscLoad, String key, String value)throws Exception {
		try {
			Field field = LT_POL_DISCLOAD.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = LT_POL_DISCLOAD.class.getMethod(setterMethodName, fieldType);
				setter.invoke(polDiscLoad, convertedValue);
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
			return dateTimeConverter(value, fieldType);
		} else if (fieldType.equals(Date.class) && value.isEmpty() == false && value != null) {
			return dateTimeConverter(value, fieldType);
		} else if (fieldType.equals(Long.class) && value.isEmpty() == false && value != null) {
			return Long.parseLong(value);
		} else if (fieldType.equals(BigDecimal.class) && value.isEmpty() == false && value != null) {
			BigDecimal bigDecimal = new BigDecimal(value);
			Object obj = bigDecimal;
			return bigDecimal;
		} else {
			return value;
		}
	}
	
	private Object dateTimeConverter(String dateString, Class<?> type){
		SimpleDateFormat dateFormat;
		if (type.equals(Date.class)) {
			dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		} else if (type.equals(Timestamp.class)) {
			dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		} else {
			throw new IllegalArgumentException("Unsupported date type: " + type);
		}
 
		try {
			Date parsedDate = (Date) dateFormat.parse(dateString);
			if (type.equals(Date.class)) {
				return type.cast(parsedDate);
			} else if (type.equals(Timestamp.class)) {
				return type.cast(new Timestamp(parsedDate.getTime()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
 
		return null;
	}
	@Override
	public String updatePolDiscLoad(ProposalEntryRequest proposalEntryRequest, Integer polDiscLoadId) {
		JSONObject response = new JSONObject();

		try {
			Optional<LT_POL_DISCLOAD> optionalUser = polDiscLoadRepo.findById(polDiscLoadId);
			LT_POL_DISCLOAD polDiscLoad = optionalUser.get();
			if (polDiscLoad != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", proposalEntryRequest.getPolDiscLoad().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setPolDiscLoadFields(polDiscLoad, entry.getValue());
				}

				try {
					polDiscLoad.setPDL_MOD_DT(new Date(System.currentTimeMillis()));
					LT_POL_DISCLOAD savedPolDiscLoadDetails = polDiscLoadRepo.save(polDiscLoad);
					response.put(statusCode, successCode);
					response.put(messageCode, "Pol Disc Load Details Updated Successfully");
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
	public String deletePolDiscLoadById(Integer polDiscLoadId) {
		try {
			Optional<LT_POL_DISCLOAD> polDiscLoadDetails = polDiscLoadRepo.findById(polDiscLoadId);

			if (polDiscLoadDetails.isPresent()) {
				polDiscLoadRepo.deleteById(polDiscLoadId);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + polDiscLoadId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + polDiscLoadId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + polDiscLoadId + ": " + e.getMessage());
			return response.toString();
		}
	}
	
	@Override
	public String getPolDiscLoadByid(Integer polDiscLoadId) throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_POL_DISCLOAD> optionalUser = polDiscLoadRepo.findById(polDiscLoadId);
		LT_POL_DISCLOAD polDiscLoad = optionalUser.get();
		if (polDiscLoad != null) {
			for (int i = 0; i < polDiscLoad.getClass().getDeclaredFields().length; i++) {
				Field field = polDiscLoad.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(polDiscLoad);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
	}

}
