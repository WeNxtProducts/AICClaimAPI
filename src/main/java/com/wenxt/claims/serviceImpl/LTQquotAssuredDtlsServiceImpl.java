package com.wenxt.claims.serviceImpl;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LTQquotAssuredDtls;
import com.wenxt.claims.model.LTQquotAssuredDtlsRequest;
import com.wenxt.claims.model.LT_Quote;
import com.wenxt.claims.repository.LTQQuotAssuredDLTSRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.LTQquotAssuredDtlsService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;
@Service
public class LTQquotAssuredDtlsServiceImpl implements LTQquotAssuredDtlsService {

	@Autowired
	private CommonService commonService;

	@Autowired
	private LTQQuotAssuredDLTSRepository ltQQuotAssuredDLTSRepository;

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
	public String save(LTQquotAssuredDtlsRequest ltquotAssuredDtlsRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();

		try {
			LTQquotAssuredDtls ltQquotAssuredDtls = new LTQquotAssuredDtls();
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", ltquotAssuredDtlsRequest.getLtqquotAssuredDtls().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(ltQquotAssuredDtls, LTQquotAssuredDtls.class, entry.getValue());
			}
			try {
				System.out.println(ltQquotAssuredDtls);
				LTQquotAssuredDtls savedLTQquotAssuredDtlsData = ltQQuotAssuredDLTSRepository.save(ltQquotAssuredDtls);
				response.put(statusCode, successCode);
				response.put(messageCode, "LTQuote Assured Details created successfully");
				data.put("Id", savedLTQquotAssuredDtlsData.getQQAD_TRAN_ID());
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
	public String getById(Long itQuoteId) throws IllegalArgumentException, IllegalAccessException {
		JSONObject response = new JSONObject();
		Optional<LTQquotAssuredDtls> ltQquotAssuredDtlsData = ltQQuotAssuredDLTSRepository.findById(itQuoteId);

		if (ltQquotAssuredDtlsData.isEmpty()) {
			response.put(statusCode, errorCode);
			response.put(messageCode, "ltQQuotAssuredDLTSData not found");
			return response.toString();
		}

		LTQquotAssuredDtls quoteData = ltQquotAssuredDtlsData.get();
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
		response.put(messageCode, "ltQQuotAssuredDLTSData Fetched Successfully");

		return response.toString();
	}

	@Override
	public String update(LTQquotAssuredDtlsRequest ltquotAssuredDtlsRequest, Long tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		try {
			Optional<LTQquotAssuredDtls> optionalUser = ltQQuotAssuredDLTSRepository.findById(tranId);
			if (optionalUser.isEmpty()) {
				response.put(statusCode, errorCode);
				response.put(messageCode, "LTquoteData not found");
				return response.toString();
			}
			LTQquotAssuredDtls quoteData = optionalUser.get();
			if (quoteData != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				if (ltquotAssuredDtlsRequest.getLtqquotAssuredDtls() != null) {
					fieldMaps.put("frontForm", ltquotAssuredDtlsRequest.getLtqquotAssuredDtls().getFormFields());
				}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(quoteData, LTQquotAssuredDtls.class, entry.getValue());
				}

				try {
					LTQquotAssuredDtls saveLT_QuotedData = ltQQuotAssuredDLTSRepository.save(quoteData);
					response.put(statusCode, successCode);
					response.put(messageCode, "Quote Assured Details Updated Successfully");
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
			Optional<LTQquotAssuredDtls> optionalEntity = ltQQuotAssuredDLTSRepository.findById(tranId);

			if (optionalEntity.isPresent()) {
				ltQQuotAssuredDLTSRepository.deleteById(tranId);

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
