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

import com.wenxt.claims.model.LT_POL_CONDITION;
import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.repository.LtPolConditionRepository;
import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.LtPolConditionService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class LtPolConditionServiceImpl implements LtPolConditionService {
	
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
	private LtPolConditionRepository polConditionRepo;
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private JwtService jwtService;

	@Override
	public String createPolCondition(ProposalEntryRequest proposalEntryRequest, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		
		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		
		AuthRequest authRequest = jwtService.getLoggedInDetails(token);
		try {
			LT_POL_CONDITION polCondition = new LT_POL_CONDITION();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			if (proposalEntryRequest.getConditions() != null) {
				fieldMaps.put("frontForm", proposalEntryRequest.getConditions().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
//					System.out.println(entry.getValue());
					commonService.setFields(polCondition, LT_POL_CONDITION.class, entry.getValue());
				}
			} 

			try {
//				System.out.println(polCondition.getPCOND_REC_TYPE() + "*");
				polCondition.setPCOND_POL_TRAN_ID(tranId);
				polCondition.setPCOND_INS_ID(authRequest.getUsername());
				polCondition.setPCOND_INS_DT(new Date(System.currentTimeMillis()));
				LT_POL_CONDITION savedPolConditionDetails = polConditionRepo.save(polCondition);
				response.put(statusCode, successCode);
				response.put(messageCode, "Policy Details Created Successfully");
			} catch (Exception e) {
				e.printStackTrace();
				response.put(statusCode, errorCode);
				response.put(messageCode, "An error occurred: " + e.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	@Override
	public String updatePolCondition(ProposalEntryRequest proposalEntryRequest, Integer polConditionId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		try {
			Optional<LT_POL_CONDITION> optionalUser = polConditionRepo.findById(polConditionId);
			LT_POL_CONDITION polCondition = optionalUser.get();
			if (polCondition != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", proposalEntryRequest.getConditions().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(polCondition, LT_POL_CONDITION.class, entry.getValue());
				}

				try {
					LT_POL_CONDITION savedPolConditionDetails = polConditionRepo.save(polCondition);
					response.put(statusCode, successCode);
					response.put(messageCode, "Policy Details Updated Successfully");
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
	public String deletePolConditionById(Integer polConditionId, HttpServletRequest request) {
		try {
			Optional<LT_POL_CONDITION> polConditionDetails = polConditionRepo.findById(polConditionId);

			if (polConditionDetails.isPresent()) {
				polConditionRepo.deleteById(polConditionId);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + polConditionId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + polConditionId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + polConditionId + ": " + e.getMessage());
			return response.toString();
		}
	}

	@Override
	public String getPolConditionById(Integer polConditionId) throws Exception{
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_POL_CONDITION> optionalUser = polConditionRepo.findById(polConditionId);
		LT_POL_CONDITION polCondition = optionalUser.get();
		if (polCondition != null) {
			for (int i = 0; i < polCondition.getClass().getDeclaredFields().length; i++) {
				Field field = polCondition.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(polCondition);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
	}

}
