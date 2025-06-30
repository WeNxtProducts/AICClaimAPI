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

import com.wenxt.claims.model.LT_POL_PLAN_DTL;
import com.wenxt.claims.model.LT_POL_PLAN_HDR;
import com.wenxt.claims.model.PlanMasterRequest;
import com.wenxt.claims.repository.PlanDetailRepository;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.PlanDetailService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class PlanDetailServiceImpl implements PlanDetailService {
	
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
	private PlanDetailRepository planDetailRepo;
	
	@Override
	public String save(PlanMasterRequest planMasterRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			LT_POL_PLAN_DTL planDetail = new LT_POL_PLAN_DTL();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", planMasterRequest.getPlanDetail().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(planDetail, LT_POL_PLAN_DTL.class, entry.getValue());
			}

			try {
				LT_POL_PLAN_DTL savedPlanDetailDetails = planDetailRepo.save(planDetail);
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
	public String update(PlanMasterRequest planMasterRequest, Long tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			Optional<LT_POL_PLAN_DTL> optionalUser = planDetailRepo.findById((Long)tranId);
			LT_POL_PLAN_DTL planDetail = optionalUser.get();
			if (planDetail != null) {
//				System.out.println("INSIDE");
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
//				if(riRequest.getRiPremAllocDtl() != null) {
					fieldMaps.put("frontForm", planMasterRequest.getPlanDetail().getFormFields());
//					}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (planDetail, LT_POL_PLAN_DTL.class, entry.getValue());
				}

				try {
					LT_POL_PLAN_DTL savedPlanDetailDetails = planDetailRepo.save(planDetail);
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
	public String get(Long tranId) {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject response = new JSONObject();
		JSONObject inputObject = new JSONObject();
		try {
		Optional<LT_POL_PLAN_DTL> optionalUser = planDetailRepo.findById(tranId);
		LT_POL_PLAN_DTL planDetail = optionalUser.get();
		if (planDetail != null) {
			for (int i = 0; i < planDetail.getClass().getDeclaredFields().length; i++) {
				Field field = planDetail.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(planDetail);
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
