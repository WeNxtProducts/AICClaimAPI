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

import com.wenxt.claims.model.LM_GP_YR_EN_PRO_DET;
import com.wenxt.claims.model.LM_GP_YR_EN_PRO_HDR;
import com.wenxt.claims.model.ProcessingRequest;
import com.wenxt.claims.repository.YearEndProDetRepository;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.YearEndProDetService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class YearEndProDetServiceImpl implements YearEndProDetService {
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private YearEndProDetRepository yrEndProDetRepo;
	
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
			LM_GP_YR_EN_PRO_DET yrEndProDet = new LM_GP_YR_EN_PRO_DET();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", processingRequest.getYearEndProDet().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(yrEndProDet, LM_GP_YR_EN_PRO_DET.class, entry.getValue());
			}

			try {
				LM_GP_YR_EN_PRO_DET savedYrEndProDetDetails = yrEndProDetRepo.save(yrEndProDet);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Year End Processing Details created successfully");
				data.put("Id", savedYrEndProDetDetails.getPYPD_SYS_ID());
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
			Optional<LM_GP_YR_EN_PRO_DET> optionalUser = yrEndProDetRepo.findById(tranId);
			LM_GP_YR_EN_PRO_DET yrEndProDet = optionalUser.get();
			if (yrEndProDet != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
					fieldMaps.put("frontForm", processingRequest.getYearEndProDet().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (yrEndProDet, LM_GP_YR_EN_PRO_DET.class, entry.getValue());
				}

				try {
					LM_GP_YR_EN_PRO_DET savedYrEndProDetDetails = yrEndProDetRepo.save(yrEndProDet);
					response.put(statusCode, successCode);
					response.put(messageCode, "Year End Processing Details Updated Successfully");
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
		Optional<LM_GP_YR_EN_PRO_DET> optionalUser = yrEndProDetRepo.findById(tranId);
		LM_GP_YR_EN_PRO_DET yrEndProDet = optionalUser.get();
		if (yrEndProDet != null) {
			for (int i = 0; i < yrEndProDet.getClass().getDeclaredFields().length; i++) {
				Field field = yrEndProDet.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(yrEndProDet);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Year End Processing Details Fetched Successfully");
			response.put(dataCode, inputObject);
		}
		}catch(Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

}
