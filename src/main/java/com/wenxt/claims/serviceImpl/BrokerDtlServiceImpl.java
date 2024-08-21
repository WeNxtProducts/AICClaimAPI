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

import com.wenxt.claims.model.BrokerRequest;
import com.wenxt.claims.model.LT_POL_BROKER_DTL;
import com.wenxt.claims.repository.BrokerDetailRepository;
import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.BrokerDtlService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class BrokerDtlServiceImpl implements BrokerDtlService {
	
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
	private JwtService jwtService;
	
	@Autowired
	private BrokerDetailRepository brokerDetailRepository;
	
	@Override
	public String save(BrokerRequest brokerRequest, HttpServletRequest request) {
		
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		
		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			LT_POL_BROKER_DTL polBrokerDetails = new LT_POL_BROKER_DTL();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			if (brokerRequest.getBrokerDetails() != null) {
				fieldMaps.put("frontForm", brokerRequest.getBrokerDetails().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
						setPolBrokerDetailFields(polBrokerDetails, LT_POL_BROKER_DTL.class, entry.getValue());
				}
			}
				
				AuthRequest authRequest = jwtService.getLoggedInDetails(token);
				
				polBrokerDetails.setPOBD_INS_DT(new Date(System.currentTimeMillis()));
				polBrokerDetails.setPOBD_INS_ID(authRequest.getUsername());
				LT_POL_BROKER_DTL savedPolBrokerDetails = brokerDetailRepository.save(polBrokerDetails);
				response.put(statusCode, successCode);
				response.put(messageCode, "Policy Broker Details Created Successfully");
			} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	private void setPolBrokerDetailFields(LT_POL_BROKER_DTL polBrokerDetails, Class<LT_POL_BROKER_DTL> clazz,
			Map<String, String> value) throws Exception{
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setPolBrokerDetailField(polBrokerDetails, clazz, entry.getKey(), entry.getValue());
		}		
	}

	private void setPolBrokerDetailField(LT_POL_BROKER_DTL polBrokerDetails, Class<LT_POL_BROKER_DTL> clazz, String key,
			String value) throws Exception{
		try {
			Field field = clazz.getDeclaredField(key);
			field.setAccessible(true);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = clazz.getMethod(setterMethodName, fieldType);
				setter.invoke(polBrokerDetails, convertedValue);
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
	public String update(BrokerRequest brokerRequest, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		
		AuthRequest userDetails = jwtService.getLoggedInDetails(token);
		try {
			Optional<LT_POL_BROKER_DTL> optionalUser = brokerDetailRepository.findById(tranId);
			LT_POL_BROKER_DTL brokerDetails = optionalUser.get();
			if (brokerDetails != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", brokerRequest.getBrokerDetails().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setPolBrokerDetailFields(brokerDetails, LT_POL_BROKER_DTL.class, entry.getValue());
				}

					brokerDetails.setPOBD_MOD_DT(new Date(System.currentTimeMillis()));
					brokerDetails.setPOBD_MOD_ID(userDetails.getUsername());
					LT_POL_BROKER_DTL policyBrokerDetails = brokerDetailRepository.save(brokerDetails);
					response.put(statusCode, successCode);
					response.put(messageCode, "Policy Broker Details Updated Successfully");
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	@Override
	public String delete(Integer tranId, HttpServletRequest request) {
		try {
			Optional<LT_POL_BROKER_DTL> polBrokerDetails = brokerDetailRepository.findById(tranId);

			if (polBrokerDetails.isPresent()) {
				brokerDetailRepository.deleteById(tranId);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + tranId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + tranId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + tranId + ": " + e.getMessage());
			return response.toString();
		}
	}

	@Override
	public String get(Integer tranId, HttpServletRequest request) throws Exception{
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_POL_BROKER_DTL> optionalUser = brokerDetailRepository.findById(tranId);
		LT_POL_BROKER_DTL brokerDetails = optionalUser.get();
		if (brokerDetails != null) {
			for (int i = 0; i < brokerDetails.getClass().getDeclaredFields().length; i++) {
				Field field = brokerDetails.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(brokerDetails);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
	}

}
