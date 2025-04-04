package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LT_POLICY;
import com.wenxt.claims.model.LT_POL_EMPLOYEE;
import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.repository.LtPolEmployeeRepository;
import com.wenxt.claims.repository.LtPolicyRepository;
import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.LtPolEmployeeService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

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
	
	@Autowired
	private LtPolicyRepository policyRepo;
	
	@Autowired
	private JwtService jwtService;

	@Override
	public String createPolEmployee(ProposalEntryRequest proposalEntryRequest, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		
		AuthRequest userDetails = jwtService.getLoggedInDetails(token);
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
				polEmployee.setPEMP_INS_ID(userDetails.getUsername());
				polEmployee.setPEMP_LC_SA(polEmployee.getPEMP_FC_SA());
				polEmployee.setPEMP_POL_TRAN_ID(tranId);
				polEmployee.setPEMP_HEIGHT_UNIT("Cms");
				polEmployee.setPEMP_WEIGHT_UNIT("Kg");
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
	public String updatePolEmployee(ProposalEntryRequest proposalEntryRequest, Integer polEmpId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		
		AuthRequest userDetails = jwtService.getLoggedInDetails(token);
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
					
					Optional<LT_POLICY> optPolicy = policyRepo.findById(polEmployee.getPEMP_POL_TRAN_ID());
					LT_POLICY policy = optPolicy.get();
					
					if(policy != null) {
						policy.setPOL_FLEX_02("N");
						
						policyRepo.save(policy);
					}
					
					polEmployee.setPEMP_LC_SA(polEmployee.getPEMP_FC_SA());
					polEmployee.setPEMP_INS_ID(userDetails.getUsername());
					polEmployee.setPEMP_MOD_ID(userDetails.getUsername());
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
			System.out.println(optionalEntity.get().getPEMP_MEMBER_TYPE());
			if (optionalEntity.isPresent() && !optionalEntity.get().getPEMP_MEMBER_TYPE().equals("P")) {
				polEmployeeRepo.deleteById(polEmpId);

				JSONObject response = new JSONObject();
				response.put(statusCode, successCode);
				response.put(messageCode, "Record with ID " + polEmpId + " deleted successfully");
				return response.toString();

			}else if(optionalEntity.isPresent() && optionalEntity.get().getPEMP_MEMBER_TYPE().equals("P")) {
				JSONObject response = new JSONObject();
				response.put(statusCode, errorCode);
				response.put(messageCode, "Primary Details Cannot be deleted");
				return response.toString();
				
			}else {
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
