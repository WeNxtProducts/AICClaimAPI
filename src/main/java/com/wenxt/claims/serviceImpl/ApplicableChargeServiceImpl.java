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

import com.wenxt.claims.model.APPL_CHARGES;
import com.wenxt.claims.model.ProductMasterRequest;
import com.wenxt.claims.repository.ApplicableChargeRepository;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.ApplicableChargeService;
import com.wenxt.claims.service.CommonService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class ApplicableChargeServiceImpl implements ApplicableChargeService {
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private ApplicableChargeRepository applChargeRepo;
	
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
	public String save(ProductMasterRequest prodMasterRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			APPL_CHARGES applCharges = new APPL_CHARGES();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", prodMasterRequest.getApplicableCharges().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(applCharges, APPL_CHARGES.class, entry.getValue());
			}

			try {
				APPL_CHARGES savedApplChargesDetails = applChargeRepo.save(applCharges);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Applicable Charges Details created successfully");
				data.put("Id", savedApplChargesDetails.getAPCH_SYS_ID());
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
			Optional<APPL_CHARGES> optionalUser = applChargeRepo.findById(tranId);
			APPL_CHARGES applCharges = optionalUser.get();
			if (applCharges != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
					fieldMaps.put("frontForm", prodMasterRequest.getApplicableCharges().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (applCharges, APPL_CHARGES.class, entry.getValue());
				}

				try {
					APPL_CHARGES savedApplChargesDetails = applChargeRepo.save(applCharges);
					response.put(statusCode, successCode);
					response.put(messageCode, "Applicable Charges Details Updated Successfully");
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
		Optional<APPL_CHARGES> optionalUser = applChargeRepo.findById(tranId);
		APPL_CHARGES applCharges = optionalUser.get();
		if (applCharges != null) {
			for (int i = 0; i < applCharges.getClass().getDeclaredFields().length; i++) {
				Field field = applCharges.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(applCharges);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Applicable Charges Details Fetched Successfully");
			response.put(dataCode, inputObject);
		}
		}catch(Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

}
