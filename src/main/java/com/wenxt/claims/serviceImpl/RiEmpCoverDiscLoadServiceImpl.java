package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LT_RI_EMP_CVR_DISC_LOAD;
import com.wenxt.claims.model.RIRequestDTO;
import com.wenxt.claims.repository.RiEmpCvrDiscLoadRepository;
import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.RiEmpCoverDiscLoadService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class RiEmpCoverDiscLoadServiceImpl implements RiEmpCoverDiscLoadService {

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
	private JwtService jwtService;

	@Autowired
	private RiEmpCvrDiscLoadRepository riEmpCvrDiscLoadRepo;

	@Override
	public String save(RIRequestDTO riRequestDTO, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			LT_RI_EMP_CVR_DISC_LOAD empCoverDiscLoad = new LT_RI_EMP_CVR_DISC_LOAD();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", riRequestDTO.getRiEmpCoverDiscLoad().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(empCoverDiscLoad, LT_RI_EMP_CVR_DISC_LOAD.class, entry.getValue());
			}

			try {
				AuthRequest userDetails = jwtService.getLoggedInDetails(token);
				empCoverDiscLoad.setRCDL_INS_DT(new Date(System.currentTimeMillis()));
				empCoverDiscLoad.setRCDL_INS_ID(userDetails.getUsername());
				LT_RI_EMP_CVR_DISC_LOAD savedRiEmployeeCoverDiscLoadDetails = riEmpCvrDiscLoadRepo.save(empCoverDiscLoad);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Employee Cover DiscLoad Details created successfully");
				data.put("Id", savedRiEmployeeCoverDiscLoadDetails.getRCDL_TRAN_ID());
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
	public String update(RIRequestDTO riRequestDTO, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			Optional<LT_RI_EMP_CVR_DISC_LOAD> optionalUser = riEmpCvrDiscLoadRepo.findById(tranId);
			LT_RI_EMP_CVR_DISC_LOAD empCoverDiscLoad = optionalUser.get();
			if (empCoverDiscLoad != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", riRequestDTO.getRiEmpCoverDiscLoad().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (empCoverDiscLoad, LT_RI_EMP_CVR_DISC_LOAD.class, entry.getValue());
				}

				try {
					AuthRequest userDetails = jwtService.getLoggedInDetails(token);
					empCoverDiscLoad.setRCDL_MOD_DT(new Date(System.currentTimeMillis()));
					empCoverDiscLoad.setRCDL_MOD_ID(userDetails.getUsername());
					LT_RI_EMP_CVR_DISC_LOAD savedRiEmployeeCoverDiscLoadDetails = riEmpCvrDiscLoadRepo.save(empCoverDiscLoad);
					response.put(statusCode, successCode);
					response.put(messageCode, "Employee Cover DsicLoad Details Updated Successfully");
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
			Optional<LT_RI_EMP_CVR_DISC_LOAD> optionalEntity = riEmpCvrDiscLoadRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				riEmpCvrDiscLoadRepo.deleteById(tranId);

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
		Optional<LT_RI_EMP_CVR_DISC_LOAD> optionalUser = riEmpCvrDiscLoadRepo.findById(tranId);
		LT_RI_EMP_CVR_DISC_LOAD empCoverDiscLoad = optionalUser.get();
		if (empCoverDiscLoad != null) {
			for (int i = 0; i < empCoverDiscLoad.getClass().getDeclaredFields().length; i++) {
				Field field = empCoverDiscLoad.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(empCoverDiscLoad);
					columnName = column.name();
					if (value != null && field.getType().equals(Date.class)) {
		                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		                String formattedDate = dateFormat.format((Date) value);
		                inputObject.put(columnName, formattedDate);
		            } else {
		                inputObject.put(columnName, value);
		            }
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Employee Cover DiscLoad Details Fetched Successfully");
			response.put(dataCode, inputObject);
		}
		}catch(Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

}
