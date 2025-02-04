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

import com.wenxt.claims.model.PROD_FACTORS;
import com.wenxt.claims.model.ProductMasterRequest;
import com.wenxt.claims.repository.ProductFactorRepository;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.ProductFactorService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class ProductFactorServiceImpl implements ProductFactorService {
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private ProductFactorRepository prodFactRepo;
	
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
			PROD_FACTORS prodFactor = new PROD_FACTORS();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", prodMasterRequest.getProdFactor().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(prodFactor, PROD_FACTORS.class, entry.getValue());
			}

			try {
				PROD_FACTORS savedProdFactDetails = prodFactRepo.save(prodFactor);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Product Factor Details created successfully");
				data.put("Id", savedProdFactDetails.getFACT_SYS_ID());
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
			Optional<PROD_FACTORS> optionalUser = prodFactRepo.findById(tranId);
			PROD_FACTORS prodFact = optionalUser.get();
			if (prodFact != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
					fieldMaps.put("frontForm", prodMasterRequest.getProdFactor().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (prodFact, PROD_FACTORS.class, entry.getValue());
				}

				try {
					PROD_FACTORS savedProdFactDetails = prodFactRepo.save(prodFact);
					response.put(statusCode, successCode);
					response.put(messageCode, "Product Factor Details Updated Successfully");
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
		Optional<PROD_FACTORS> optionalUser = prodFactRepo.findById(tranId);
		PROD_FACTORS prodFact = optionalUser.get();
		if (prodFact != null) {
			for (int i = 0; i < prodFact.getClass().getDeclaredFields().length; i++) {
				Field field = prodFact.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(prodFact);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Product Factor Details Fetched Successfully");
			response.put(dataCode, inputObject);
		}
		}catch(Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

}
