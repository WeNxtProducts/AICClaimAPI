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
import com.wenxt.claims.model.LT_RI_EMPLOYEE_DTL;
import com.wenxt.claims.model.RIRequestDTO;
import com.wenxt.claims.repository.RiEmployeeDetailRepository;
import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.RiEmployeeDetailService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class RiEmployeeDetailServiceImpl implements RiEmployeeDetailService {

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
	private RiEmployeeDetailRepository riEmpDtlRepo;
	
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
			LT_RI_EMPLOYEE_DTL riEmployeeDtl = new LT_RI_EMPLOYEE_DTL();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", riRequest.getRiEmployeeDtl().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(riEmployeeDtl, LT_RI_EMPLOYEE_DTL.class, entry.getValue());
			}

			try {
				AuthRequest userDetails = jwtService.getLoggedInDetails(token);
				riEmployeeDtl.setRED_INS_DT(new Date(System.currentTimeMillis()));
				riEmployeeDtl.setRED_INS_ID(userDetails.getUsername());
				LT_RI_EMPLOYEE_DTL savedRiEmployeeDetails = riEmpDtlRepo.save(riEmployeeDtl);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Employee Details created successfully");
				data.put("Id", savedRiEmployeeDetails.getRED_TRAN_ID());
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
			Optional<LT_RI_EMPLOYEE_DTL> optionalUser = riEmpDtlRepo.findById(tranId);
			LT_RI_EMPLOYEE_DTL riEmployeeDtl = optionalUser.get();
			if (riEmployeeDtl != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
//				if(riRequest.getRiPremAllocDtl() != null) {
//					fieldMaps.put("frontForm", riRequest.getRiEmployeeDtl().getFormFields());
//					}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (riEmployeeDtl, LT_RI_EMPLOYEE_DTL.class, entry.getValue());
				}

				try {
					AuthRequest userDetails = jwtService.getLoggedInDetails(token);
					riEmployeeDtl.setRED_MOD_DT(new Date(System.currentTimeMillis()));
					riEmployeeDtl.setRED_MOD_ID(userDetails.getUsername());
					LT_RI_EMPLOYEE_DTL savedriEmployeeDetails = riEmpDtlRepo.save(riEmployeeDtl);
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
			Optional<LT_RI_EMPLOYEE_DTL> optionalEntity = riEmpDtlRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				riEmpDtlRepo.deleteById(tranId);

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
	public String get(Integer tranId, HttpServletRequest request) {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject response = new JSONObject();
		JSONObject inputObject = new JSONObject();
		try {
		Optional<LT_RI_EMPLOYEE_DTL> optionalUser = riEmpDtlRepo.findById(tranId);
		LT_RI_EMPLOYEE_DTL riEmployeeDtl = optionalUser.get();
		if (riEmployeeDtl != null) {
			for (int i = 0; i < riEmployeeDtl.getClass().getDeclaredFields().length; i++) {
				Field field = riEmployeeDtl.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(riEmployeeDtl);
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
