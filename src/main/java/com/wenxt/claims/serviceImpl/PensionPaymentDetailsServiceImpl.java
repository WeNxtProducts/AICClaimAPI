package com.wenxt.claims.serviceImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LM_GP_PYMT_DETAILS;
import com.wenxt.claims.model.LM_GP_WDRA_DETAILS;
import com.wenxt.claims.model.ProcessingRequest;
import com.wenxt.claims.repository.PensionPaymentDetailsRepository;
import com.wenxt.claims.repository.WithdrawDetailsRepository;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.PensionPaymentDetailsService;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class PensionPaymentDetailsServiceImpl implements PensionPaymentDetailsService {
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private PensionPaymentDetailsRepository pensPymtDtlsRepo;
	
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
	public String save(ProcessingRequest processingRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			LM_GP_PYMT_DETAILS pensPymtDtls = new LM_GP_PYMT_DETAILS();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", processingRequest.getPymtDetails().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(pensPymtDtls, LM_GP_PYMT_DETAILS.class, entry.getValue());
			}

			try {
				LM_GP_PYMT_DETAILS savedPensPymtDtls = pensPymtDtlsRepo.save(pensPymtDtls);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Pension Payment Details created successfully");
				data.put("Id", savedPensPymtDtls.getPPTD_SYS_ID());
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
	public String update(ProcessingRequest processingRequest, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			Optional<LM_GP_PYMT_DETAILS> optionalUser = pensPymtDtlsRepo.findById(tranId);
			LM_GP_PYMT_DETAILS pensPymtDtls = optionalUser.get();
			if (pensPymtDtls != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
					fieldMaps.put("frontForm", processingRequest.getPymtDetails().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (pensPymtDtls, LM_GP_PYMT_DETAILS.class, entry.getValue());
				}

				try {
					LM_GP_PYMT_DETAILS savedPensPymtDtls = pensPymtDtlsRepo.save(pensPymtDtls);
					response.put(statusCode, successCode);
					response.put(messageCode, "Pension Payment Details Updated Successfully");
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
		// TODO Auto-generated method stub
		return null;
	}

}
