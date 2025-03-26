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

import com.wenxt.claims.model.ProductMasterRequest;
import com.wenxt.claims.model.WITHDRAWAL_SETUP;
import com.wenxt.claims.repository.WithdrawalSetupRepository;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.WithdrawalSetupService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class WithdrawalSetupServiceImpl implements WithdrawalSetupService {
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private WithdrawalSetupRepository wdraSetupRepo;
	
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
	public String save(ProductMasterRequest prodMasterRequest, String productId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			WITHDRAWAL_SETUP wdraSetup = new WITHDRAWAL_SETUP();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", prodMasterRequest.getWithdrawalSetup().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(wdraSetup, WITHDRAWAL_SETUP.class, entry.getValue());
			}

			try {
				wdraSetup.setWDRA_PROD_CODE(productId);
				WITHDRAWAL_SETUP savedWdraSetupDetails = wdraSetupRepo.save(wdraSetup);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Withdrawal Setup Details created successfully");
				data.put("Id", savedWdraSetupDetails.getWDRA_SYS_ID());
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
	public String update(ProductMasterRequest prodMasterRequest, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			Optional<WITHDRAWAL_SETUP> optionalUser = wdraSetupRepo.findById(tranId);
			WITHDRAWAL_SETUP wdraSetup = optionalUser.get();
			if (wdraSetup != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
//				if(riRequest.getRiPremAllocDtl() != null) {
					fieldMaps.put("frontForm", prodMasterRequest.getWithdrawalSetup().getFormFields());
//					}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (wdraSetup, WITHDRAWAL_SETUP.class, entry.getValue());
				}

				try {
					WITHDRAWAL_SETUP savedWdraSetupDetails = wdraSetupRepo.save(wdraSetup);
					response.put(statusCode, successCode);
					response.put(messageCode, "Withdrawal Setup Details Updated Successfully");
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
		Optional<WITHDRAWAL_SETUP> optionalUser = wdraSetupRepo.findById(tranId);
		WITHDRAWAL_SETUP wdraSetup = optionalUser.get();
		if (wdraSetup != null) {
			for (int i = 0; i < wdraSetup.getClass().getDeclaredFields().length; i++) {
				Field field = wdraSetup.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(wdraSetup);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Withdraw Setup Details Fetched Successfully");
			response.put(dataCode, inputObject);
		}
		}catch(Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

}
