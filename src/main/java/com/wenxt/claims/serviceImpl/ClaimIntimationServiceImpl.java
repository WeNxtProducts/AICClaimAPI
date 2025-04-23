package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LT_CLMEND_INTIMATION;
import com.wenxt.claims.model.LT_Quote;
import com.wenxt.claims.model.QuickQuoteRequest;
import com.wenxt.claims.repository.ClaimIntimationRepository;
import com.wenxt.claims.service.ClaimIntimationService;
import com.wenxt.claims.service.CommonService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class ClaimIntimationServiceImpl implements ClaimIntimationService {
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private ClaimIntimationRepository claimIntimRepo;
	
	@Value("${spring.message.code}")
	private String messageCode;

	@Value("${spring.status.code}")
	private String statusCode;

	@Value("${spring.data.code}")
	private String dataCode;

	@Value("${spring.success.code}")
	private String successCode;

	@Value("${spring.warning.code}")
	private String warningCode;

	@Value("${spring.error.code}")
	private String errorCode;

	@Override
	public String save(QuickQuoteRequest claimIntimation, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_CLMEND_INTIMATION claimIntim = new LT_CLMEND_INTIMATION();
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", claimIntimation.getClaimIntimation().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(claimIntim, LT_CLMEND_INTIMATION.class, entry.getValue());
			}
			try {
				claimIntim.setCI_INS_DT(new Date());
				LT_CLMEND_INTIMATION claimInt = claimIntimRepo.save(claimIntim);

				response.put(statusCode, successCode);
				response.put(messageCode, "Claim Intimation Details created successfully");
				data.put("Id", claimInt.getCI_TRAN_ID());
//				data.put("POL_NO", pDocNo);
				response.put("data", data);
			} catch (Exception e) {
				e.printStackTrace();
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
	public String update(QuickQuoteRequest quickQuoteRequest, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		try {
			Optional<LT_CLMEND_INTIMATION> optionalUser = claimIntimRepo.findById(tranId);
			if (optionalUser.isEmpty()) {
				response.put(statusCode, errorCode);
				response.put(messageCode, "Claim Intimation Details not found");
				return response.toString();
			}
			LT_CLMEND_INTIMATION claimIntimData = optionalUser.get();
			if (claimIntimData != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				if (quickQuoteRequest.getClaimIntimation() != null) {
					fieldMaps.put("frontForm", quickQuoteRequest.getClaimIntimation().getFormFields());
				}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(claimIntimData, LT_CLMEND_INTIMATION.class, entry.getValue());
				}

				try {
					LT_CLMEND_INTIMATION saveClaimIntimData = claimIntimRepo.save(claimIntimData);
					response.put(statusCode, successCode);
					response.put(messageCode, "Claim Intimation Details Updated Successfully");
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
	public String get(Integer tranId, HttpServletRequest request)throws Exception {
		JSONObject response = new JSONObject();
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_CLMEND_INTIMATION> optionalUser = claimIntimRepo.findById(tranId);
		LT_CLMEND_INTIMATION claimIntimation = optionalUser.get();
		if (claimIntimation != null) {
			response.put(statusCode, successCode);
			response.put(messageCode, "Claim Intimation Details Fetched Successfully");
			for (int i = 0; i < claimIntimation.getClass().getDeclaredFields().length; i++) {
				Field field = claimIntimation.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(claimIntimation);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
			response.put(dataCode, inputObject);
		}
//		System.out.println(inputObject);
		return response.toString();
	}

	@Override
	public String delete(Integer tranId, HttpServletRequest request) {
		try {
			Optional<LT_CLMEND_INTIMATION> optionalEntity = claimIntimRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				claimIntimRepo.deleteById(tranId);

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

}
