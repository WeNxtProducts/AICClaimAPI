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

import com.wenxt.claims.model.LM_PRODUCT;
import com.wenxt.claims.model.PRODUCT_MASTER;
import com.wenxt.claims.model.ProductMasterRequest;
import com.wenxt.claims.repository.ProductMasterRepository;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.ProdMasterService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class ProdMasterServiceImpl implements ProdMasterService {
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private ProductMasterRepository prodMasterRepo;
	
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
			LM_PRODUCT prodMaster = new LM_PRODUCT();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", prodMasterRequest.getProductMaster().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(prodMaster, LM_PRODUCT.class, entry.getValue());
			}

			try {
				LM_PRODUCT savedProductMasterDetails = prodMasterRepo.save(prodMaster);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Product Details created successfully");
//				data.put("Id", savedProductMasterDetails.getPROD_SYS());
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
	public String update(ProductMasterRequest prodMasterRequest, String tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			Optional<LM_PRODUCT> optionalUser = prodMasterRepo.findById(tranId);
			LM_PRODUCT prodMaster = optionalUser.get();
			if (prodMaster != null) {
				System.out.println("INSIDE");
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
//				if(riRequest.getRiPremAllocDtl() != null) {
					fieldMaps.put("frontForm", prodMasterRequest.getProductMaster().getFormFields());
//					}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (prodMaster, LM_PRODUCT.class, entry.getValue());
				}

				try {
					LM_PRODUCT savedProductMasterDetails = prodMasterRepo.save(prodMaster);
					response.put(statusCode, successCode);
					response.put(messageCode, "Product Details Updated Successfully");
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
	public String get(String tranId) {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject response = new JSONObject();
		JSONObject inputObject = new JSONObject();
		try {
		Optional<LM_PRODUCT> optionalUser = prodMasterRepo.findById(tranId);
		LM_PRODUCT prodMaster = optionalUser.get();
		if (prodMaster != null) {
			for (int i = 0; i < prodMaster.getClass().getDeclaredFields().length; i++) {
				Field field = prodMaster.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(prodMaster);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Product Details Fetched Successfully");
			response.put(dataCode, inputObject);
		}
		}catch(Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

}
