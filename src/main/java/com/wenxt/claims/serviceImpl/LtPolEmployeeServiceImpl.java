package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LT_POL_EMPLOYEE;
import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.repository.LtPolEmployeeRepository;
import com.wenxt.claims.service.LtPolEmployeeService;

import jakarta.persistence.Column;

@Service
public class LtPolEmployeeServiceImpl implements LtPolEmployeeService {
	
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
	private LtPolEmployeeRepository polEmployeeRepo;

	@Override
	public String createPolEmployee(ProposalEntryRequest proposalEntryRequest, Integer tranId) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_POL_EMPLOYEE polEmployee = new LT_POL_EMPLOYEE();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			if(proposalEntryRequest.getPolEmployeeDetails() != null) {
			fieldMaps.put("frontForm", proposalEntryRequest.getPolEmployeeDetails().getFormFields());
			}else {
				fieldMaps.put("frontForm", proposalEntryRequest.getPolEmployeeDetails().getFormFields());
			}
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setPolEmployeeFields(polEmployee, entry.getValue());
			}

			try {
				List<LT_POL_EMPLOYEE> primaryEmployee = polEmployeeRepo.getPrimaryEmployee(tranId);
				
				if(primaryEmployee.size() >= 1 && proposalEntryRequest.getPolEmployeeDetails().getFormFields().get("PEMP_MEMBER_TYPE").equals("P")) {
					response.put(statusCode, errorCode);
					response.put(messageCode, "Primary Details Exists Already");
					return response.toString();
				}else if(primaryEmployee.size() == 0 && proposalEntryRequest.getPolEmployeeDetails().getFormFields().get("PEMP_MEMBER_TYPE").equals("S")) {
					response.put(statusCode, errorCode);
					response.put(messageCode, "Primary Details Is Mandatory");
					return response.toString();
				}
				polEmployee.setPEMP_INS_DT(new Date(System.currentTimeMillis()));
				polEmployee.setPEMP_POL_TRAN_ID(tranId);
				LT_POL_EMPLOYEE savedPolEmployeeDetails = polEmployeeRepo.save(polEmployee);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Pol Employee Details Created Successfully");
				data.put("Id", savedPolEmployeeDetails.getPEMP_TRAN_ID());
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

	private void setPolEmployeeFields(LT_POL_EMPLOYEE polEmployee, Map<String, String> value)throws Exception {
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setPolEmployeeField(polEmployee, entry.getKey(), entry.getValue());
		}
	}

	private void setPolEmployeeField(LT_POL_EMPLOYEE polEmployee, String key, String value)throws Exception {
		try {
			Field field = LT_POL_EMPLOYEE.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = LT_POL_EMPLOYEE.class.getMethod(setterMethodName, fieldType);
				setter.invoke(polEmployee, convertedValue);
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
		} else {
			return value;
		}
	}

	private Object dateTimeConverter(String dateString, Class<?> type) {
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
	public String updatePolEmployee(ProposalEntryRequest proposalEntryRequest, Integer polEmpId) {
		JSONObject response = new JSONObject();

		try {
			Optional<LT_POL_EMPLOYEE> optionalUser = polEmployeeRepo.findById(polEmpId);
			LT_POL_EMPLOYEE polEmployee = optionalUser.get();
			if (polEmployee != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", proposalEntryRequest.getPolEmployeeDetails().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setPolEmployeeFields(polEmployee, entry.getValue());
				}

				try {
					polEmployee.setPEMP_MOD_DT(new Date(System.currentTimeMillis()));
					LT_POL_EMPLOYEE savedPolEmployeeDetails = polEmployeeRepo.save(polEmployee);
					response.put(statusCode, successCode);
					response.put(messageCode, "Pol Employee Details Updated Successfully");
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
	public String deletePolEmployeeById(Integer polEmpId) {
		try {
			Optional<LT_POL_EMPLOYEE> optionalEntity = polEmployeeRepo.findById(polEmpId);

			if (optionalEntity.isPresent()) {
				polEmployeeRepo.deleteById(polEmpId);

				JSONObject response = new JSONObject();
				response.put(statusCode, successCode);
				response.put(messageCode, "Record with ID " + polEmpId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put(statusCode, errorCode);
				response.put(messageCode, "Record with ID " + polEmpId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put(statusCode, errorCode);
			response.put(messageCode, "Error deleting record with ID " + polEmpId + ": " + e.getMessage());
			return response.toString();
		}
	}
	
	@Override
	public String getPolEmployeeByid(Integer polEmpId) throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_POL_EMPLOYEE> optionalUser = polEmployeeRepo.findById(polEmpId);
		LT_POL_EMPLOYEE polEmployee = optionalUser.get();
		if (polEmployee != null) {
			for (int i = 0; i < polEmployee.getClass().getDeclaredFields().length; i++) {
				Field field = polEmployee.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(polEmployee);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
	}

}
