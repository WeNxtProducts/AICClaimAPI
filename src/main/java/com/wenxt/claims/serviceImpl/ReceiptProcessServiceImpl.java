package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.FormFieldsDTO;
import com.wenxt.claims.model.LT_POL_BROKER;
import com.wenxt.claims.model.LT_RCPT_PROCESS;
import com.wenxt.claims.model.ReceiptRequest;
import com.wenxt.claims.repository.ReceiptProcessRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.ReceiptProcessService;

import jakarta.persistence.Column;

@Service
public class ReceiptProcessServiceImpl implements ReceiptProcessService {
	
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
	private CommonService commonService;
	
	@Autowired
	private ReceiptProcessRepository receiptProcessRepo;

	@Override
	public String save(ReceiptRequest receiptRequest) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_RCPT_PROCESS receiptProcess = new LT_RCPT_PROCESS();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			for(FormFieldsDTO formFieldsDTO : receiptRequest.getReceiptProcess()) {
				receiptProcess = new LT_RCPT_PROCESS();
				fieldMaps = new HashMap<>();
			if(formFieldsDTO != null) {
			fieldMaps.put("frontForm", formFieldsDTO.getFormFields());
			}
			
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setReceiptProcessFields(receiptProcess, entry.getValue());
			}

				receiptProcess.setRP_INS_DT(new Date(System.currentTimeMillis()));
//				receiptProcess.setRP_TRA(tranId);
				LT_RCPT_PROCESS savedReceiptProcessDetails = receiptProcessRepo.save(receiptProcess);
			}
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Pol Broker Details Created Successfully");
				response.put(dataCode, data);
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	private void setReceiptProcessFields(LT_RCPT_PROCESS receiptProcess, Map<String, String> value)throws Exception {
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setReceiptProcessField(receiptProcess, entry.getKey(), entry.getValue());
		}
	}

	private void setReceiptProcessField(LT_RCPT_PROCESS receiptProcess, String key, String value)throws Exception {
		try {
			Field field = LT_RCPT_PROCESS.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = LT_RCPT_PROCESS.class.getMethod(setterMethodName, fieldType);
				setter.invoke(receiptProcess, convertedValue);
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

	private Object dateConverter(String value) {
		String dateStr = value;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = (Date) sdf.parse(dateStr);
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
	public String update(ReceiptRequest receiptRequest, Integer tranId) {
		JSONObject response = new JSONObject();

		try {
//			List<LT_RCPT_PROCESS> receiptProcess = receiptProcessRepo.findByPolId(polBrokerId);
			Optional<LT_RCPT_PROCESS> receiptProcesss = Optional.ofNullable(new LT_RCPT_PROCESS());
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			for (FormFieldsDTO formFieldsDTO : receiptRequest.getReceiptProcess()) {
				if (formFieldsDTO.getFormFields().get("RP_TRAN_ID") != null) {
					receiptProcesss = receiptProcessRepo
							.findByIdAndPolNo(Integer.parseInt(formFieldsDTO.getFormFields().get("RP_TRAN_ID")), formFieldsDTO.getFormFields().get("RP_POL_NO"));
					LT_RCPT_PROCESS receiptProcess = receiptProcesss.get();
					fieldMaps = new HashMap<>();
					if (receiptProcess != null) {
						fieldMaps.put("frontForm", formFieldsDTO.getFormFields());
						for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
							setReceiptProcessFields(receiptProcess, entry.getValue());
						}

						receiptProcess.setRP_MOD_DT(new Date(System.currentTimeMillis()));
						LT_RCPT_PROCESS savedReceiptProcessDetails = receiptProcessRepo.save(receiptProcess);
					}
				} else {
//					LT_R polbroker = new LT_POL_BROKER();
//					for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
//						setPolBrokerFields(polbroker, entry.getValue());
//					}
//
//					polbroker.setPBRK_INS_DT(new Date(System.currentTimeMillis()));
//					LT_POL_BROKER savedPolBrokerDetails = receiptProcessRepo.save(polbroker);
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Pol Broker Details Updated Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	@Override
	public String delete(Integer tranId) {
		try {
			Optional<LT_RCPT_PROCESS> optionalEntity = receiptProcessRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				JSONObject response = new JSONObject();
				
				receiptProcessRepo.delete(optionalEntity.get());
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

	@Override
	public String get(Integer tranId)throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_RCPT_PROCESS> optionalUser = receiptProcessRepo.findById(tranId);
		LT_RCPT_PROCESS receiptProcess = optionalUser.get();
		if (receiptProcess != null) {
			for (int i = 0; i < receiptProcess.getClass().getDeclaredFields().length; i++) {
				Field field = receiptProcess.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(receiptProcess);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
	}

}

