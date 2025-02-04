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

import com.wenxt.claims.model.LM_GP_VESTING_SCALE;
import com.wenxt.claims.model.PolicyRequest;
import com.wenxt.claims.repository.VestingScaleRepository;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.VestingScaleService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class VestingScaleServiceImpl implements VestingScaleService {
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private VestingScaleRepository vestingScaleRepo;
	
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
	public String save(PolicyRequest policyRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			LM_GP_VESTING_SCALE vestingScale = new LM_GP_VESTING_SCALE();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", policyRequest.getVestingScale().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(vestingScale, LM_GP_VESTING_SCALE.class, entry.getValue());
			}

			try {
				LM_GP_VESTING_SCALE savedVestingScaleDetails = vestingScaleRepo.save(vestingScale);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Tax Slab Rate Details created successfully");
				data.put("Id", savedVestingScaleDetails.getPVSC_SYS_ID());
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
	public String update(PolicyRequest policyRequest, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			Optional<LM_GP_VESTING_SCALE> optionalUser = vestingScaleRepo.findById(tranId);
			LM_GP_VESTING_SCALE vestingScale = optionalUser.get();
			if (vestingScale != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
					fieldMaps.put("frontForm", policyRequest.getVestingScale().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (vestingScale, LM_GP_VESTING_SCALE.class, entry.getValue());
				}

				try {
					LM_GP_VESTING_SCALE savedVestigScaleeDetails = vestingScaleRepo.save(vestingScale);
					response.put(statusCode, successCode);
					response.put(messageCode, "Vesting Scale Details Updated Successfully");
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
		Optional<LM_GP_VESTING_SCALE> optionalUser = vestingScaleRepo.findById(tranId);
		LM_GP_VESTING_SCALE vestingScale = optionalUser.get();
		if (vestingScale != null) {
			for (int i = 0; i < vestingScale.getClass().getDeclaredFields().length; i++) {
				Field field = vestingScale.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(vestingScale);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Tax Slab Rate Details Fetched Successfully");
			response.put(dataCode, inputObject);
		}
		}catch(Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

}
