package com.wenxt.claims.serviceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LTQuickQuoteRequest;
import com.wenxt.claims.model.LT_QQUOT_CONDITION;
import com.wenxt.claims.repository.LTQuickQuoteConditionRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.LTQuickQuoteConditionService;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class LTQuickQuoteConditionServiceImpl implements LTQuickQuoteConditionService {

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
	private LTQuickQuoteConditionRepository quickQuoteConditionRepo;
	
	@Override
	public String save(LTQuickQuoteRequest quickQuoteRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		try {
			LT_QQUOT_CONDITION quickQuoteCondition = new LT_QQUOT_CONDITION();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", quickQuoteRequest.getQuickQuoteCondition().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(quickQuoteCondition, LT_QQUOT_CONDITION.class, entry.getValue());
			}

			LT_QQUOT_CONDITION savedquickQuoteConditionDetails = quickQuoteConditionRepo.save(quickQuoteCondition);

			data.put("Id", savedquickQuoteConditionDetails.getQQCOND_TRAN_ID());
			response.put(statusCode, successCode);
			response.put(messageCode, "Quick Quote Condition Data Saved Successfully");
			response.put(dataCode, data);
			return response.toString();
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getLocalizedMessage());
			return response.toString();
		}
	}

	@Override
	public String update(LTQuickQuoteRequest quickQuoteRequest, Long tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		try {
			Optional<LT_QQUOT_CONDITION> savedQuickQuoteConditionDetails = quickQuoteConditionRepo.findById(tranId);

			if (savedQuickQuoteConditionDetails.isPresent()) {
				LT_QQUOT_CONDITION saveQuickQuoteCondition = savedQuickQuoteConditionDetails.get();

				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", quickQuoteRequest.getQuickQuoteCondition().getFormFields());

				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(saveQuickQuoteCondition, LT_QQUOT_CONDITION.class, entry.getValue());
				}

				quickQuoteConditionRepo.save(saveQuickQuoteCondition);
				response.put(statusCode, successCode);
				data.put("Id", savedQuickQuoteConditionDetails.get().getQQCOND_TRAN_ID());
				response.put(messageCode, "Quick Quote Condition Data Updated Successfully");
				response.put(dataCode, data);
			} else {
				response.put(statusCode, errorCode);
				response.put(messageCode, "Quick Quote Condition Details with Given ID not found");
			}
			return response.toString();
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getLocalizedMessage());
			return response.toString();
		}
	}

	@Override
	public String delete(Long tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		try {
			Optional<LT_QQUOT_CONDITION> optionalEntity = quickQuoteConditionRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				quickQuoteConditionRepo.deleteById(tranId);

				response.put(statusCode, successCode);
				response.put(messageCode, "Record with ID " + tranId + " deleted successfully");

			} else {
				response.put(statusCode, errorCode);
				response.put(messageCode, "Record with ID " + tranId + " not found");
			}
			return response.toString();
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getLocalizedMessage());
			return response.toString();
		}
	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return null;
	}

}
