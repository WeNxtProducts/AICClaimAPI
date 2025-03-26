package com.wenxt.claims.serviceImpl;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LTQquotDiscLoad;
import com.wenxt.claims.model.LTQquotDiscLoadRequest;
import com.wenxt.claims.repository.LTQquotDiscLoadReposiroty;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.LTQquotDiscLoadService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class LTQquotDiscLoadServiceImpl  implements LTQquotDiscLoadService	{
	@Autowired
	private CommonService commonService;

	@Autowired
	private LTQquotDiscLoadReposiroty ltQquotDiscLoadReposiroty;

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
	public String save(LTQquotDiscLoadRequest ltQquotDiscLoadRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();

		try {
			LTQquotDiscLoad ltQuote = new LTQquotDiscLoad();
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", ltQquotDiscLoadRequest.getQuotDiscLoadDetails().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(ltQuote, LTQquotDiscLoad.class, entry.getValue());
			}
			try {
				System.out.println(ltQuote);
				LTQquotDiscLoad savedLT_QuotDiscData = ltQquotDiscLoadReposiroty.save(ltQuote);
				response.put(statusCode, successCode);
				response.put(messageCode, "LTQuotDiscLoad Details created successfully");
				data.put("Id", savedLT_QuotDiscData.getQQDL_TRAN_ID());
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
	public String getLTQquoteDiscById(Long tranId) throws IllegalArgumentException, IllegalAccessException {
		JSONObject response = new JSONObject();
		Optional<LTQquotDiscLoad> optionalUser = ltQquotDiscLoadReposiroty.findById(tranId);

		if (optionalUser.isEmpty()) {
			response.put(statusCode, errorCode);
			response.put(messageCode, "LTquoteDiscLoadData not found");
			return response.toString();
		}

		LTQquotDiscLoad quoteData = optionalUser.get();
		JSONObject dataObject = new JSONObject();

		for (Field field : quoteData.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(Column.class)) {
				Column column = field.getAnnotation(Column.class);
				Object value = field.get(quoteData);
				if (value != null) {
					dataObject.put(column.name(), value);
				}
			}
		}

		response.put(statusCode, successCode);
		response.put(dataCode, dataObject);
		response.put(messageCode, "LTquoteDiscLoadData Fetched Successfully");

		return response.toString();
	}

	@Override
	public String update(LTQquotDiscLoadRequest ltQuoteRequest, Long tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		try {
			Optional<LTQquotDiscLoad> optionalUser = ltQquotDiscLoadReposiroty.findById(tranId);
			if (optionalUser.isEmpty()) {
				response.put(statusCode, errorCode);
				response.put(messageCode, "LTquoteDiscLoad Data not found");
				return response.toString();
			}
			LTQquotDiscLoad quoteData = optionalUser.get();
			if (quoteData != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				if (ltQuoteRequest.getQuotDiscLoadDetails() != null) {
					fieldMaps.put("frontForm", ltQuoteRequest.getQuotDiscLoadDetails().getFormFields());
				}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(quoteData, LTQquotDiscLoad.class, entry.getValue());
				}

				try {
					LTQquotDiscLoad saveLT_QuotedData = ltQquotDiscLoadReposiroty.save(quoteData);
					response.put(statusCode, successCode);
					response.put(messageCode, "LTQ quoteDis Load  Details Updated Successfully");
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
	public String delete(Long tranId, HttpServletRequest servletRequest) {
		try {
			Optional<LTQquotDiscLoad> optionalEntity = ltQquotDiscLoadReposiroty.findById(tranId);

			if (optionalEntity.isPresent()) {
				ltQquotDiscLoadReposiroty.deleteById(tranId);

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
