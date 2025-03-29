package com.wenxt.claims.serviceImpl;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wenxt.claims.model.InsuranceCoverageDTO;
import com.wenxt.claims.model.LTQuoteRequest;
import com.wenxt.claims.model.LT_Quote;
import com.wenxt.claims.model.ProcedureInput;
import com.wenxt.claims.repository.LTQQuotApplCoverRepository;
import com.wenxt.claims.repository.LT_QuoteRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.LtQuoteService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class LtQuoteServiceImpl implements LtQuoteService {

	@Autowired
	private CommonService commonService;

	@Autowired
	private LT_QuoteRepository ltQuoteRepository;
	
	@Autowired
	private LTQQuotApplCoverRepository ltqQuotApplCoverRepository;

	@Value("${spring.message.code}")
	private String messageCode;

	@Value("${spring.status.code}")
	private String statusCode;

	@Value("${spring.data.code}")
	private String dataCode;

	@Value("${spring.success.code}")
	private String successCode;

	@Value("${spring.warning.code}")
	private String warningCode;

	@Value("${spring.error.code}")
	private String errorCode;
	
	@Value("${string.baseApi.path}")
	private String baseDocPath;

	@Override
	public String save(LTQuoteRequest ltQuoteRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

//		String authorizationHeader = request.getHeader("Authorization");
//		String token = authorizationHeader.substring(7).trim();

		try {
			LT_Quote ltQuote = new LT_Quote();
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", ltQuoteRequest.getQuoteDetails().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(ltQuote, LT_Quote.class, entry.getValue());
			}
			try {
				System.out.println(ltQuote);
				String dobString = ltQuoteRequest.getQuoteDetails().getFormFields().get("QUOT_DOB");
				if (dobString != null && !dobString.isEmpty()) {
					SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
					inputFormat.setLenient(false);
					Date dob = inputFormat.parse(dobString);
					SimpleDateFormat oracleFormat = new SimpleDateFormat("dd/MM/yyyy");
					String formattedDob = oracleFormat.format(dob);
					Integer calculateAge = ltQuoteRepository.calculateAge(formattedDob);
					ltQuote.setQUOT_AGE(calculateAge);
				}
		        Date insDate = new Date();
		        SimpleDateFormat formatters = new SimpleDateFormat("dd-MM-yy");
		        String formattedDates = formatters.format(insDate);
		        ltQuote.setQUOT_INS_DT(insDate);
		        ltQuote.setQUOT_MOD_DT(insDate);
				System.out.println(ltQuote.getQUOT_FC_SA());
				ltQuote.setQUOT_LC_SA(ltQuote.getQUOT_FC_SA());
				LT_Quote savedLT_QuoteData = ltQuoteRepository.save(ltQuote);

				Map<String, Object> inputMap = new HashMap<>();
				inputMap.put("P_TRAN_ID", savedLT_QuoteData.getQUOT_TRAN_ID());
				/**** . Calculate Quotation Premium ****/
				ProcedureInput input = new ProcedureInput();
				input.setInParams(inputMap);

				String url = baseDocPath + "common/invokeProcedure?procedureName=" + "P_QUOT_PREM";
				HttpHeaders headers = new HttpHeaders();
				RestTemplate restTemplate = new RestTemplate();
				headers.setContentType(MediaType.APPLICATION_JSON);
				// headers.set("Authorization", "Bearer " + token);
				HttpEntity<ProcedureInput> requestEntity = new HttpEntity<>(input, headers);
				ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
				/******* Get QuotNO Procedure *****/
				JSONObject dataObj = new JSONObject();
				dataObj.put("Id", savedLT_QuoteData.getQUOT_TRAN_ID());
				response.put(statusCode, successCode);
				response.put(messageCode, "LTQuote Details created successfully");
				data.put("Id", savedLT_QuoteData.getQUOT_TRAN_ID());
				response.put("data", data);
				
		        Date date = new Date();
		        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		        String formattedDate = formatter.format(date);
		        
		        System.out.println(formattedDate);
				
				Map<String, Object> inputMaps = new HashMap<>();
				inputMaps.put("P_DNS_TYPE", "1");
				inputMaps.put("P_DNS_CODE", "QT");
				inputMaps.put("P_DIVN_CODE", "001");
				inputMaps.put("P_CLASS_CODE", "1");
				inputMaps.put("P_PROP_DT", formattedDate);
				inputMaps.put("P_DOC_NO_FN", null);
				inputMaps.put("P_BLOCK_NAME", null);
				inputMaps.put("P_DUMMY_YN", "N");
				inputMaps.put("P_PROD_TYPE", savedLT_QuoteData.getQUOT_PROD_CODE());
				inputMaps.put("P_CLAIM_YEAR", null);
				inputMaps.put("P_CLAIM_TYPE", null);
				inputMaps.put("P_CUST_CODE", null);
				/**** . Calculate Quotation Premium ****/
				ProcedureInput inputs = new ProcedureInput();
				inputs.setInParams(inputMaps);

				String url2 = baseDocPath + "common/invokeProcedure?procedureName=" + "WNP_GEN_DOC_NO";
//				HttpHeaders headers = new HttpHeaders();
//				RestTemplate restTemplate = new RestTemplate();
				headers.setContentType(MediaType.APPLICATION_JSON);
				// headers.set("Authorization", "Bearer " + token);
				HttpEntity<ProcedureInput> requestEntity2 = new HttpEntity<>(inputs, headers);
				ResponseEntity<String> responseEntity2 = restTemplate.postForEntity(url2, requestEntity2, String.class);
				
				System.out.println(responseEntity2.getBody());
				/******* Get QuotNO Procedure *****/
				dataObj = new JSONObject();
				dataObj.put("Id", savedLT_QuoteData.getQUOT_TRAN_ID());
				response.put(statusCode, successCode);
				response.put(messageCode, "LTQuote Details created successfully");
				data.put("Id", savedLT_QuoteData.getQUOT_TRAN_ID());
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
	public String getLTQuoteById(Long itQuoteId) throws IllegalArgumentException, IllegalAccessException {
		JSONObject response = new JSONObject();
		Optional<LT_Quote> optionalUser = ltQuoteRepository.findById(itQuoteId);

		if (optionalUser.isEmpty()) {
			response.put(statusCode, errorCode);
			response.put(messageCode, "LTquoteData not found");
			return response.toString();
		}

		LT_Quote quoteData = optionalUser.get();
		JSONObject dataObject = new JSONObject();

		for (Field field : quoteData.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(Column.class)) {
				Column column = field.getAnnotation(Column.class);
				Object value = field.get(quoteData);
				if (value != null) {
					dataObject.put(column.name(), value);
				}
			}
		}

		response.put(statusCode, successCode);
		response.put(dataCode, dataObject);
		response.put(messageCode, "LTquoteData Fetched Successfully");

		return response.toString();
	}

	@Override
	public String update(LTQuoteRequest ltQuoteRequest, Long tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		try {
			Optional<LT_Quote> optionalUser = ltQuoteRepository.findById(tranId);
			if (optionalUser.isEmpty()) {
				response.put(statusCode, errorCode);
				response.put(messageCode, "LTquoteData not found");
				return response.toString();
			}
			LT_Quote quoteData = optionalUser.get();
			if (quoteData != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				if (ltQuoteRequest.getQuoteDetails() != null) {
					fieldMaps.put("frontForm", ltQuoteRequest.getQuoteDetails().getFormFields());
				}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(quoteData, LT_Quote.class, entry.getValue());
				}

				try {
					LT_Quote saveLT_QuotedData = ltQuoteRepository.save(quoteData);
					response.put(statusCode, successCode);
					response.put(messageCode, "Loan Details Updated Successfully");
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
	public String delete(Long tranId, HttpServletRequest servletRequest) {
		try {
			Optional<LT_Quote> optionalEntity = ltQuoteRepository.findById(tranId);

			if (optionalEntity.isPresent()) {
				ltQuoteRepository.deleteById(tranId);

				JSONObject response = new JSONObject();
				response.put(statusCode, successCode);
				response.put(messageCode, "Record with ID " + tranId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put(statusCode, errorCode);
				response.put(messageCode, "Record with ID " + tranId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			
			JSONObject response = new JSONObject();
			response.put(statusCode, errorCode);
			response.put(messageCode, "Error deleting record with ID " + tranId + ": " + e.getMessage());
			return response.toString();
		}
	}

	@Override
	public String updateLtQuotCoverData(List<InsuranceCoverageDTO> coverages) {
		JSONObject response = new JSONObject();
		try {
			for (InsuranceCoverageDTO coverageDTO : coverages) {
				ltqQuotApplCoverRepository.findById(coverageDTO.getQqacTranId()).ifPresent(coverData -> {
					try {
						coverData.setQQAC_SELECT_YN(coverageDTO.getQqacSelectYn());
						coverData.setQQAC_FC_SA(
								coverageDTO.getQqacFcSa() != null ? new BigDecimal(coverageDTO.getQqacFcSa())
										: BigDecimal.ZERO);
						ltqQuotApplCoverRepository.save(coverData);
					} catch (Exception e) {
						System.err.println("Error updating coverage for TRAN_ID: " + coverageDTO.getQqacTranId());
						e.printStackTrace();
					}
				});
			}
			Integer result = ltqQuotApplCoverRepository.getSumAssured(coverages.get(0).getId());
			response.put(statusCode, successCode);
			response.put(messageCode, "Insurance coverages updated successfully!");
			response.put(dataCode, result);
			return response.toString();
		} catch (Exception e) {
			e.printStackTrace();
			 response.put("statusCode", errorCode);
	            response.put("messageCode", "Failed to update insurance coverages!");
		}
		return response.toString();
	}

	
}
