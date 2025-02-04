package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LM_GP_WDRA_DETAILS;
import com.wenxt.claims.model.ProcessingRequest;
import com.wenxt.claims.repository.WithdrawDetailsRepository;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.WithdrawDetailsService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class WithdrawDetailsServiceImpl implements WithdrawDetailsService {
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private WithdrawDetailsRepository wdraDetailsRepo;
	
	@Autowired
	private JwtService jwtService;
	
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

	@Override
	public String save(ProcessingRequest processingRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			LM_GP_WDRA_DETAILS wdraDetails = new LM_GP_WDRA_DETAILS();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", processingRequest.getWdraDetails().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(wdraDetails, LM_GP_WDRA_DETAILS.class, entry.getValue());
			}

			try {
				LM_GP_WDRA_DETAILS savedWithdrawDetails = wdraDetailsRepo.save(wdraDetails);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Withdrawn Details created successfully");
				data.put("Id", savedWithdrawDetails.getPWDD_SYS_ID());
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
	public String update(ProcessingRequest processingRequest, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			Optional<LM_GP_WDRA_DETAILS> optionalUser = wdraDetailsRepo.findById(tranId);
			LM_GP_WDRA_DETAILS wdraDetails = optionalUser.get();
			if (wdraDetails != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
					fieldMaps.put("frontForm", processingRequest.getWdraDetails().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (wdraDetails, LM_GP_WDRA_DETAILS.class, entry.getValue());
				}

				try {
					LM_GP_WDRA_DETAILS savedWithdrawDetails = wdraDetailsRepo.save(wdraDetails);
					response.put(statusCode, successCode);
					response.put(messageCode, "Withdraw Details Updated Successfully");
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
	public String get(Integer tranId) {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject response = new JSONObject();
		JSONObject inputObject = new JSONObject();
		try {
		Optional<LM_GP_WDRA_DETAILS> optionalUser = wdraDetailsRepo.findById(tranId);
		LM_GP_WDRA_DETAILS wdraDetails = optionalUser.get();
		if (wdraDetails != null) {
			for (int i = 0; i < wdraDetails.getClass().getDeclaredFields().length; i++) {
				Field field = wdraDetails.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(wdraDetails);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Withdraw Details Fetched Successfully");
			response.put(dataCode, inputObject);
		}
		}catch(Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

}
