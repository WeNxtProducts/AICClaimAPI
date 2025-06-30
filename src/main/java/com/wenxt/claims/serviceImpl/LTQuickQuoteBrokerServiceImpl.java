package com.wenxt.claims.serviceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LTQuickQuoteRequest;
import com.wenxt.claims.model.LT_QQUOT_BROK_DTL;
import com.wenxt.claims.model.LT_QQUOT_BROK_HDR;
import com.wenxt.claims.repository.LTQuickQuoteBrokerDetailRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.LTQuickQuoteBrokerDetailService;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class LTQuickQuoteBrokerServiceImpl implements LTQuickQuoteBrokerDetailService {

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
	private LTQuickQuoteBrokerDetailRepository qqBrokerDetailRepo;
	
	@Override
	public String save(LTQuickQuoteRequest quickQuoteRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		try {
			LT_QQUOT_BROK_DTL quickQuoteBrokerDetail = new LT_QQUOT_BROK_DTL();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", quickQuoteRequest.getQuickQuoteBrokerDetail().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(quickQuoteBrokerDetail, LT_QQUOT_BROK_DTL.class, entry.getValue());
			}

			LT_QQUOT_BROK_DTL savedquickQuoteBrokerDetails = qqBrokerDetailRepo.save(quickQuoteBrokerDetail);

			data.put("Id", savedquickQuoteBrokerDetails.getQQBD_TRAN_ID());
			response.put(statusCode, successCode);
			response.put(messageCode, "Quick Quote Broker Detail Data Saved Successfully");
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
			Optional<LT_QQUOT_BROK_DTL> savedQuickQuoteBrokerDetails = qqBrokerDetailRepo.findById(tranId);

			if (savedQuickQuoteBrokerDetails.isPresent()) {
				LT_QQUOT_BROK_DTL saveQuickQuoteBrokerDetail = savedQuickQuoteBrokerDetails.get();

				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", quickQuoteRequest.getQuickQuoteBrokerDetail().getFormFields());

				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(saveQuickQuoteBrokerDetail, LT_QQUOT_BROK_DTL.class, entry.getValue());
				}

				qqBrokerDetailRepo.save(saveQuickQuoteBrokerDetail);
				response.put(statusCode, successCode);
				data.put("Id", savedQuickQuoteBrokerDetails.get().getQQBD_TRAN_ID());
				response.put(messageCode, "Quick Quote Broker Detail Data Updated Successfully");
				response.put(dataCode, data);
			} else {
				response.put(statusCode, errorCode);
				response.put(messageCode, "Quick Quote Broker Details with Given ID not found");
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
			Optional<LT_QQUOT_BROK_DTL> optionalEntity = qqBrokerDetailRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				qqBrokerDetailRepo.deleteById(tranId);

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
