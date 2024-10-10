package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.BrokerResult;
import com.wenxt.claims.model.BrokerResultDTO;
import com.wenxt.claims.model.FormFieldsDTO;
import com.wenxt.claims.model.LT_POL_BROKER;
import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.repository.LtPolBrokerRepository;
import com.wenxt.claims.service.LtPolBrokerService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class LtPolBrokerServiceImpl implements LtPolBrokerService {
	
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
	private LtPolBrokerRepository polBrokerRepo;

	@Override
	public String createPolBroker(ProposalEntryRequest proposalEntryRequest, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_POL_BROKER polBroker = new LT_POL_BROKER();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			for(FormFieldsDTO formFieldsDTO : proposalEntryRequest.getPolBrokerDetails()) {
				polBroker = new LT_POL_BROKER();
				fieldMaps = new HashMap<>();
			if(formFieldsDTO != null) {
			fieldMaps.put("frontForm", formFieldsDTO.getFormFields());
			}
			
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setPolBrokerFields(polBroker, entry.getValue());
			}

				polBroker.setPBRK_INS_DT(new Date(System.currentTimeMillis()));
				polBroker.setPBRK_POL_TRAN_ID(tranId);
				LT_POL_BROKER savedPolBrokerDetails = polBrokerRepo.save(polBroker);
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

	private void setPolBrokerFields(LT_POL_BROKER polBroker, Map<String, String> value)throws Exception {
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setPolBrokerField(polBroker, entry.getKey(), entry.getValue());
		}
	}

	private void setPolBrokerField(LT_POL_BROKER polBroker, String key, String value)throws Exception {
		try {
			Field field = LT_POL_BROKER.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = LT_POL_BROKER.class.getMethod(setterMethodName, fieldType);
				setter.invoke(polBroker, convertedValue);
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
	public String updatePolBroker(ProposalEntryRequest proposalEntryRequest, Integer polBrokerId) {
		JSONObject response = new JSONObject();

		try {
			List<LT_POL_BROKER> brokerList = polBrokerRepo.findByPolId(polBrokerId);
			Optional<LT_POL_BROKER> polBroker = Optional.ofNullable(new LT_POL_BROKER());
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			for (FormFieldsDTO formFieldsDTO : proposalEntryRequest.getPolBrokerDetails()) {
				if (formFieldsDTO.getFormFields().get("PBRK_TRAN_ID") != null) {
					polBroker = polBrokerRepo
							.findById(Integer.parseInt(formFieldsDTO.getFormFields().get("PBRK_TRAN_ID")));
					LT_POL_BROKER polbroker = polBroker.get();
					fieldMaps = new HashMap<>();
					if (polbroker != null) {
						fieldMaps.put("frontForm", formFieldsDTO.getFormFields());
						for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
							setPolBrokerFields(polbroker, entry.getValue());
						}

						polbroker.setPBRK_MOD_DT(new Date(System.currentTimeMillis()));
						LT_POL_BROKER savedPolBrokerDetails = polBrokerRepo.save(polbroker);
					}
				} else {
					LT_POL_BROKER polbroker = new LT_POL_BROKER();
					for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
						setPolBrokerFields(polbroker, entry.getValue());
					}

					polbroker.setPBRK_INS_DT(new Date(System.currentTimeMillis()));
					LT_POL_BROKER savedPolBrokerDetails = polBrokerRepo.save(polbroker);
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
	public String deletePolBrokerById(Integer polBrokerId) {
		try {
			Optional<LT_POL_BROKER> polBrokerDetails = polBrokerRepo.findById(polBrokerId);

			if (polBrokerDetails.isPresent()) {
				polBrokerRepo.deleteById(polBrokerId);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + polBrokerId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + polBrokerId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + polBrokerId + ": " + e.getMessage());
			return response.toString();
		}
	}
	
	@Override
	public String getPolBrokerById(Integer polBrokerId, HttpServletRequest request) throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		JSONObject innerObject = new JSONObject();
		JSONObject outerObject = new JSONObject();
		JSONObject result = new JSONObject();
		List<JSONObject> resultList = new ArrayList<>();
		List<LT_POL_BROKER> brokerList = polBrokerRepo.findByPolId(polBrokerId);
		for (LT_POL_BROKER broker : brokerList) {
			LT_POL_BROKER polBroker = broker;
			if (polBroker != null) {
				inputObject = new JSONObject();
				for (int i = 0; i < polBroker.getClass().getDeclaredFields().length; i++) {
					innerObject = new JSONObject();
					Field field = polBroker.getClass().getDeclaredFields()[i];
					field.setAccessible(true);
					String columnName = null;
					if (field.isAnnotationPresent(Column.class)) {
						Annotation annotation = field.getAnnotation(Column.class);
						Column column = (Column) annotation;
						Object value = field.get(polBroker);
						columnName = column.name();
						inputObject.put(columnName, value);
					}
				}
				innerObject.put("formFields", inputObject);
				resultList.add(innerObject);
			}
		}
		
		BrokerResultDTO brokerResult = new BrokerResultDTO();
		BrokerResult bResult = new BrokerResult();
		List<BrokerResult> brokerResults = new ArrayList<>();
		List<LT_POL_BROKER> childerns = new ArrayList<>();
		for (LT_POL_BROKER data : brokerList) {
			if (data.getPBRK_PARENT_CODE() == null) {
				LT_POL_BROKER brok = data;
				childerns = new ArrayList<>();
					for(LT_POL_BROKER child : brokerList) {
						if(child.getPBRK_PARENT_CODE() != null && child.getPBRK_PARENT_CODE().equals(data.getPBRK_BRK_CODE())) {
							childerns.add(child);
						}
					}
//					brok = data;
					brok.setChildren(childerns);
//					brokerResults.add(brok);
					bResult.setFormFields(brok);
					brokerResults.add(bResult);

			}
		}

		brokerResult.setPolBrokerDetails(brokerResults);

		JSONObject newJ = new JSONObject(brokerResult);
		result.put(statusCode, successCode);
		result.put(messageCode, "Pol Broker Details Fetched Successfully");
//		outerObject.put("polBrokerDetails", resultList);
		result.put(dataCode, newJ);
		return result.toString();
	}

}
