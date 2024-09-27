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

import com.wenxt.claims.model.LT_LOAN_REPAYMENT;
import com.wenxt.claims.model.LT_SURR_MAT_VALUES;
import com.wenxt.claims.model.SurrMattValuesRequest;
import com.wenxt.claims.repository.SurrMattValuesRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.SurrMattValuesService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class SurrMattValuesServiceImpl implements SurrMattValuesService {
	
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
	private SurrMattValuesRepository surrMattValuesRepo;
	
	@Override
	public String save(SurrMattValuesRequest surrMattValuesRequest, HttpServletRequest servletRequest) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_SURR_MAT_VALUES surrMat = new LT_SURR_MAT_VALUES();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", surrMattValuesRequest.getSurrMattValues().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(surrMat, LT_SURR_MAT_VALUES.class, entry.getValue());
			}

			try {
				LT_SURR_MAT_VALUES savedSurrMatDetails = surrMattValuesRepo.save(surrMat);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Surrender Maturity Details created successfully");
				data.put("Id", savedSurrMatDetails.getSMV_TRAN_ID());
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
	public String update(SurrMattValuesRequest surrMattValuesRequest, Integer tranId,
			HttpServletRequest servletRequest) {
		JSONObject response = new JSONObject();

		try {
			Optional<LT_SURR_MAT_VALUES> optionalUser = surrMattValuesRepo.findById(tranId);
			LT_SURR_MAT_VALUES surrMat = optionalUser.get();
			if (surrMat != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				if(surrMattValuesRequest.getSurrMattValues() != null) {
					fieldMaps.put("frontForm", surrMattValuesRequest.getSurrMattValues().getFormFields());
					}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (surrMat, LT_SURR_MAT_VALUES.class, entry.getValue());
				}

				try {
					LT_SURR_MAT_VALUES savedSurrMatDetails = surrMattValuesRepo.save(surrMat);
					response.put(statusCode, successCode);
					response.put(messageCode, "Surrender Maturity Details Updated Successfully");
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
	public String delete(Integer tranId, HttpServletRequest servletRequest) {
		try {
			Optional<LT_SURR_MAT_VALUES> optionalEntity = surrMattValuesRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				surrMattValuesRepo.deleteById(tranId);

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
	public String get(Integer tranId, HttpServletRequest servletRequest)throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_SURR_MAT_VALUES> optionalUser = surrMattValuesRepo.findById(tranId);
		LT_SURR_MAT_VALUES surrMat = optionalUser.get();
		if (surrMat != null) {
			for (int i = 0; i < surrMat.getClass().getDeclaredFields().length; i++) {
				Field field = surrMat.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(surrMat);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
		}

}
