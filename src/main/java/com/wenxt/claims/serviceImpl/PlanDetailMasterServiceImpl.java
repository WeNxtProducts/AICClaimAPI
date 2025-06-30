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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wenxt.claims.model.LM_PROD_APPL_PLAN_DTL;
import com.wenxt.claims.model.LT_CLMEND_INTIMATION;
import com.wenxt.claims.model.PlanMasterRequest;
import com.wenxt.claims.repository.PlanDetailMasterRepository;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.PlanDetailMasterService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class PlanDetailMasterServiceImpl implements PlanDetailMasterService {
	
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
	
	@Autowired
	private CommonService commonService;

	@Autowired
	private PlanDetailMasterRepository planDtlMasterRepo;
	
	@Override
	public String save(PlanMasterRequest planMasterRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			LM_PROD_APPL_PLAN_DTL planDtlMaster = new LM_PROD_APPL_PLAN_DTL();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", planMasterRequest.getPlanDetail().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(planDtlMaster, LM_PROD_APPL_PLAN_DTL.class, entry.getValue());
			}

			try {
				LM_PROD_APPL_PLAN_DTL savedPlanDtlMasterDetails = planDtlMasterRepo.save(planDtlMaster);
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
	public String update(PlanMasterRequest planMasterRequest, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			Optional<LM_PROD_APPL_PLAN_DTL> optionalUser = planDtlMasterRepo.findById(tranId);
			LM_PROD_APPL_PLAN_DTL planDtlMaster = optionalUser.get();
			if (planDtlMaster != null) {
//				System.out.println("INSIDE");
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
//				if(riRequest.getRiPremAllocDtl() != null) {
					fieldMaps.put("frontForm", planMasterRequest.getPlanDetail().getFormFields());
//					}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (planDtlMaster, LM_PROD_APPL_PLAN_DTL.class, entry.getValue());
				}

				try {
					LM_PROD_APPL_PLAN_DTL savedPlanDtlMasterDetails = planDtlMasterRepo.save(planDtlMaster);
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
	public String get(Integer tranId)throws Exception {
		JSONObject response = new JSONObject();
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LM_PROD_APPL_PLAN_DTL> optionalUser = planDtlMasterRepo.findById(tranId);
		LM_PROD_APPL_PLAN_DTL planDetailMaster = optionalUser.get();
		if (planDetailMaster != null) {
			response.put(statusCode, successCode);
			response.put(messageCode, "Claim Intimation Details Fetched Successfully");
			for (int i = 0; i < planDetailMaster.getClass().getDeclaredFields().length; i++) {
				Field field = planDetailMaster.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
//				if (field.isAnnotationPresent(Column.class)) {
//					Annotation annotation = field.getAnnotation(Column.class);
//					Column column = (Column) annotation;
//					Object value = field.get(planDetailMaster);
//					columnName = column.name();
//					inputObject.put(columnName, value);
//				}
				JsonProperty jsonProperty = field.getAnnotation(JsonProperty.class);
				if (jsonProperty != null && !jsonProperty.value().isEmpty()) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(planDetailMaster);
				    columnName = jsonProperty.value();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
	}

}
