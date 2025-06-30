package com.wenxt.claims.serviceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LTQuickQuoteRequest;
import com.wenxt.claims.model.LT_QQUOT_APPL_CHARGE;
import com.wenxt.claims.repository.LTQuickQuoteApplChargeRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.LTQuickQuoteApplChargeService;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class LTQuickQuoteApplChargeServiceImpl implements LTQuickQuoteApplChargeService {

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
	private LTQuickQuoteApplChargeRepository qqApplChargeRepo;
	
	@Override
	public String save(LTQuickQuoteRequest quickQuoteRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		try {
			LT_QQUOT_APPL_CHARGE quickQuoteApplCharge = new LT_QQUOT_APPL_CHARGE();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", quickQuoteRequest.getQuickQuoteApplCharge().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(quickQuoteApplCharge, LT_QQUOT_APPL_CHARGE.class, entry.getValue());
			}

			LT_QQUOT_APPL_CHARGE savedquickQuoteApplChargeDetails = qqApplChargeRepo.save(quickQuoteApplCharge);

			data.put("Id", savedquickQuoteApplChargeDetails.getQQAC_TRAN_ID());
			response.put(statusCode, successCode);
			response.put(messageCode, "Quick Quote Applicable Charge Data Saved Successfully");
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
			Optional<LT_QQUOT_APPL_CHARGE> savedQuickQuoteApplChargeDetails = qqApplChargeRepo.findById(tranId);

			if (savedQuickQuoteApplChargeDetails.isPresent()) {
				LT_QQUOT_APPL_CHARGE saveQuickQuoteApplCharge = savedQuickQuoteApplChargeDetails.get();

				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", quickQuoteRequest.getQuickQuoteApplCharge().getFormFields());

				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(saveQuickQuoteApplCharge, LT_QQUOT_APPL_CHARGE.class, entry.getValue());
				}

				qqApplChargeRepo.save(saveQuickQuoteApplCharge);
				response.put(statusCode, successCode);
				data.put("Id", savedQuickQuoteApplChargeDetails.get().getQQAC_TRAN_ID());
				response.put(messageCode, "Quick Quote Applicable Charge Data Updated Successfully");
				response.put(dataCode, data);
			} else {
				response.put(statusCode, errorCode);
				response.put(messageCode, "Quick Quote Applicable Charge Details with Given ID not found");
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
			Optional<LT_QQUOT_APPL_CHARGE> optionalEntity = qqApplChargeRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				qqApplChargeRepo.deleteById(tranId);

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
