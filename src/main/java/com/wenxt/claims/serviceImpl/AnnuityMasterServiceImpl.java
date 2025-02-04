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

import com.wenxt.claims.model.ANNUITY_MASTER;
import com.wenxt.claims.model.INTEREST_MASTER;
import com.wenxt.claims.model.ProductMasterRequest;
import com.wenxt.claims.repository.AnnuityMasterRepository;
import com.wenxt.claims.repository.InterestMasterRepository;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.AnnuityMasterService;
import com.wenxt.claims.service.CommonService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class AnnuityMasterServiceImpl implements AnnuityMasterService {
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private AnnuityMasterRepository annuityMasterRepo;
	
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
			ANNUITY_MASTER annuityMaster = new ANNUITY_MASTER();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", prodMasterRequest.getAnnuityMaster().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(annuityMaster, ANNUITY_MASTER.class, entry.getValue());
			}

			try {
				ANNUITY_MASTER savedAnnuityMasterDetails = annuityMasterRepo.save(annuityMaster);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Annuity Master Details created successfully");
				data.put("Id", savedAnnuityMasterDetails.getANNU_SYS_ID());
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
			Optional<ANNUITY_MASTER> optionalUser = annuityMasterRepo.findById(tranId);
			ANNUITY_MASTER annuityMaster = optionalUser.get();
			if (annuityMaster != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
					fieldMaps.put("frontForm", prodMasterRequest.getAnnuityMaster().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (annuityMaster, ANNUITY_MASTER.class, entry.getValue());
				}

				try {
					ANNUITY_MASTER savedAnnuityMasterDetails = annuityMasterRepo.save(annuityMaster);
					response.put(statusCode, successCode);
					response.put(messageCode, "Annuity Master Details Updated Successfully");
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
		Optional<ANNUITY_MASTER> optionalUser = annuityMasterRepo.findById(tranId);
		ANNUITY_MASTER annuityMaster = optionalUser.get();
		if (annuityMaster != null) {
			for (int i = 0; i < annuityMaster.getClass().getDeclaredFields().length; i++) {
				Field field = annuityMaster.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(annuityMaster);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Annuity Master Details Fetched Successfully");
			response.put(dataCode, inputObject);
		}
		}catch(Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

}
