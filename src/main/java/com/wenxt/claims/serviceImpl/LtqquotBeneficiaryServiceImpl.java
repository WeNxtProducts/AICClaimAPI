package com.wenxt.claims.serviceImpl;

import java.util.HashMap;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LTQuoteRequest;
import com.wenxt.claims.model.LT_Quote;
import com.wenxt.claims.repository.LT_QuoteRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.LtQuoteService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;
import java.util.Map;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LTQquotBeneficiary;
import com.wenxt.claims.model.LTQquotBeneficiaryRequest;
import com.wenxt.claims.model.LT_Quote;
import com.wenxt.claims.repository.LTQquotBeneficiaryRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.LtqquotBeneficiaryService;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class LtqquotBeneficiaryServiceImpl implements LtqquotBeneficiaryService	 {
	@Autowired
	private CommonService commonService;

	@Autowired
	private LTQquotBeneficiaryRepository ltQquotBeneficiaryRepository;

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
	public String save(LTQquotBeneficiaryRequest ltQquotBeneficiaryRequest, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();

		try {
			LTQquotBeneficiary quotBeneficiary = new LTQquotBeneficiary();
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", ltQquotBeneficiaryRequest.getLtqquotBeneficiary().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(quotBeneficiary, LTQquotBeneficiary.class, entry.getValue());
			}
			try {
				System.out.println(quotBeneficiary);
				quotBeneficiary.setQBEN_QUOT_TRAN_ID((long) tranId);
			 LTQquotBeneficiary save = ltQquotBeneficiaryRepository.save(quotBeneficiary);
				response.put(statusCode, successCode);
				response.put(messageCode, "LTQquotBeneficiary Details created successfully");
				data.put("Id", save.getQBEN_TRAN_ID());
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
	public String getById(Long tranId) throws IllegalArgumentException, IllegalAccessException {
		JSONObject response = new JSONObject();
		Optional<LTQquotBeneficiary> optionalUser = ltQquotBeneficiaryRepository.findById(tranId);

		if (optionalUser.isEmpty()) {
			response.put(statusCode, errorCode);
			response.put(messageCode, "LTquoteBeneficiaryData not found");
			return response.toString();
		}

		LTQquotBeneficiary quoteData = optionalUser.get();
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
		response.put(messageCode, "LTquoteBeneficiaryData Fetched Successfully");

		return response.toString();
	}

	@Override
	public String update(LTQquotBeneficiaryRequest ltQquotBeneficiaryRequest, Long tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		try {
			Optional<LTQquotBeneficiary> optionalUser = ltQquotBeneficiaryRepository.findById(tranId);
			if (optionalUser.isEmpty()) {
				response.put(statusCode, errorCode);
				response.put(messageCode, "LTquoteData not found");
				return response.toString();
			}
			LTQquotBeneficiary quoteData = optionalUser.get();
			if (quoteData != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				if (ltQquotBeneficiaryRequest.getLtqquotBeneficiary() != null) {
					fieldMaps.put("frontForm", ltQquotBeneficiaryRequest.getLtqquotBeneficiary().getFormFields());
				}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(quoteData, LTQquotBeneficiary.class, entry.getValue());
				}

				try {
					LTQquotBeneficiary saveLT_QuotedBenficiaryData = ltQquotBeneficiaryRepository.save(quoteData);
					response.put(statusCode, successCode);
					response.put(messageCode, "ltQquotBeneficiary Updated Successfully");
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
			Optional<LTQquotBeneficiary> optionalEntity = ltQquotBeneficiaryRepository.findById(tranId);

			if (optionalEntity.isPresent()) {
				ltQquotBeneficiaryRepository.deleteById(tranId);

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
