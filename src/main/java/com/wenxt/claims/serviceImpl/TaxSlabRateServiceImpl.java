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

import com.wenxt.claims.model.LM_GP_TAX_SLAB_RATE;
import com.wenxt.claims.model.PROD_TAX_SETUP;
import com.wenxt.claims.model.ProductMasterRequest;
import com.wenxt.claims.repository.ProductTaxSetupRepository;
import com.wenxt.claims.repository.TaxSlabRateRepository;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.TaxSlabRateService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class TaxSlabRateServiceImpl implements TaxSlabRateService {
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private TaxSlabRateRepository taxSlabRateRepo;
	
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
			LM_GP_TAX_SLAB_RATE taxSlabRate = new LM_GP_TAX_SLAB_RATE();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", prodMasterRequest.getTaxSlabRate().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(taxSlabRate, LM_GP_TAX_SLAB_RATE.class, entry.getValue());
			}

			try {
				LM_GP_TAX_SLAB_RATE savedtaxSlabRateDetails = taxSlabRateRepo.save(taxSlabRate);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Tax Slab Rate Details created successfully");
				data.put("Id", savedtaxSlabRateDetails.getPTSR_SYS_ID());
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
			Optional<LM_GP_TAX_SLAB_RATE> optionalUser = taxSlabRateRepo.findById(tranId);
			LM_GP_TAX_SLAB_RATE taxSlabRate = optionalUser.get();
			if (taxSlabRate != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
					fieldMaps.put("frontForm", prodMasterRequest.getTaxSlabRate().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (taxSlabRate, LM_GP_TAX_SLAB_RATE.class, entry.getValue());
				}

				try {
					LM_GP_TAX_SLAB_RATE savedTaxSlabRateDetails = taxSlabRateRepo.save(taxSlabRate);
					response.put(statusCode, successCode);
					response.put(messageCode, "Tax Slab Rate Details Updated Successfully");
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
		Optional<LM_GP_TAX_SLAB_RATE> optionalUser = taxSlabRateRepo.findById(tranId);
		LM_GP_TAX_SLAB_RATE taxSlabRate = optionalUser.get();
		if (taxSlabRate != null) {
			for (int i = 0; i < taxSlabRate.getClass().getDeclaredFields().length; i++) {
				Field field = taxSlabRate.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(taxSlabRate);
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
