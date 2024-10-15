package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LT_RI_EMPLOYEE;
import com.wenxt.claims.model.RIRequestDTO;
import com.wenxt.claims.repository.RiEmployeeRepository;
import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.RiEmployeeService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class RiEmployeeServiceImpl implements RiEmployeeService {
	
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
	private RiEmployeeRepository riEmpRepo;
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private JwtService jwtService;

	@Override
	public String save(RIRequestDTO riRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			LT_RI_EMPLOYEE riEmployee = new LT_RI_EMPLOYEE();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", riRequest.getRiEmployee().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(riEmployee, LT_RI_EMPLOYEE.class, entry.getValue());
			}

			try {
				AuthRequest userDetails = jwtService.getLoggedInDetails(token);
				riEmployee.setRE_INS_DT(new Date(System.currentTimeMillis()));
				riEmployee.setRE_INS_ID(userDetails.getUsername());
				LT_RI_EMPLOYEE savedRiEmployeeDetails = riEmpRepo.save(riEmployee);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Employee Details created successfully");
				data.put("Id", savedRiEmployeeDetails.getRE_TRAN_ID());
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

	@Override
	public String update(RIRequestDTO riRequest, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			Optional<LT_RI_EMPLOYEE> optionalUser = riEmpRepo.findById(tranId);
			LT_RI_EMPLOYEE riEmployee = optionalUser.get();
			if (riEmployee != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				if(riRequest.getRiPremAllocDtl() != null) {
					fieldMaps.put("frontForm", riRequest.getRiEmployee().getFormFields());
					}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (riEmployee, LT_RI_EMPLOYEE.class, entry.getValue());
				}

				try {
					AuthRequest userDetails = jwtService.getLoggedInDetails(token);
					riEmployee.setRE_MOD_DT(new Date(System.currentTimeMillis()));
					riEmployee.setRE_MOD_UID(userDetails.getUsername());
					LT_RI_EMPLOYEE savedriEmployeeDetails = riEmpRepo.save(riEmployee);
					response.put(statusCode, successCode);
					response.put(messageCode, "Employee Details Updated Successfully");
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
	public String delete(Integer tranId, HttpServletRequest request) {
		try {
			Optional<LT_RI_EMPLOYEE> optionalEntity = riEmpRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				riEmpRepo.deleteById(tranId);

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

	@Override
	public String get(Integer tranId) {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject response = new JSONObject();
		JSONObject inputObject = new JSONObject();
		try {
		Optional<LT_RI_EMPLOYEE> optionalUser = riEmpRepo.findById(tranId);
		LT_RI_EMPLOYEE riEmployee = optionalUser.get();
		if (riEmployee != null) {
			for (int i = 0; i < riEmployee.getClass().getDeclaredFields().length; i++) {
				Field field = riEmployee.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(riEmployee);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Employee Details Fetched Successfully");
			response.put(dataCode, inputObject);
		}
		}catch(Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

}
