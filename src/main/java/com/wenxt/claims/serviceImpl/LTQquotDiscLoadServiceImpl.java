package com.wenxt.claims.serviceImpl;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wenxt.claims.dao.CommonDao;
import com.wenxt.claims.model.GetQuestionnaireResponse;
import com.wenxt.claims.model.LTQquotDiscLoad;
import com.wenxt.claims.model.LTQquotDiscLoadRequest;
import com.wenxt.claims.model.LT_DOC_TODO_LIST_STATUS_DTL;
import com.wenxt.claims.model.LtDocTodoListStatus;
import com.wenxt.claims.model.QueryParametersDTO;
import com.wenxt.claims.model.SuQuestionsDTo;
import com.wenxt.claims.model.SubQuestionResult;
import com.wenxt.claims.repository.DocToDoListStatusDtlRepository;
import com.wenxt.claims.repository.LTQquotDiscLoadReposiroty;
import com.wenxt.claims.repository.LtDocToDoListRepo;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.LTQquotDiscLoadService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class LTQquotDiscLoadServiceImpl implements LTQquotDiscLoadService {
	@Autowired
	private CommonService commonService;

	@Autowired
	private LTQquotDiscLoadReposiroty ltQquotDiscLoadReposiroty;

	@Autowired
	private LtDocToDoListRepo docToDoListRepo;

	@Autowired
	private DocToDoListStatusDtlRepository docToDoListDtlRepo;

	@Autowired
	private CommonDao commonDao;

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

	@Override
	public String save(LTQquotDiscLoadRequest ltQquotDiscLoadRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();

		try {
			LTQquotDiscLoad ltQuote = new LTQquotDiscLoad();
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", ltQquotDiscLoadRequest.getQuotDiscLoadDetails().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(ltQuote, LTQquotDiscLoad.class, entry.getValue());
			}
			try {
				System.out.println(ltQuote);
				LTQquotDiscLoad savedLT_QuotDiscData = ltQquotDiscLoadReposiroty.save(ltQuote);
				response.put(statusCode, successCode);
				response.put(messageCode, "LTQuotDiscLoad Details created successfully");
				data.put("Id", savedLT_QuotDiscData.getQQDL_TRAN_ID());
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
	public String getLTQquoteDiscById(Long tranId) throws IllegalArgumentException, IllegalAccessException {
		JSONObject response = new JSONObject();
		Optional<LTQquotDiscLoad> optionalUser = ltQquotDiscLoadReposiroty.findById(tranId);

		if (optionalUser.isEmpty()) {
			response.put(statusCode, errorCode);
			response.put(messageCode, "LTquoteDiscLoadData not found");
			return response.toString();
		}

		LTQquotDiscLoad quoteData = optionalUser.get();
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
		response.put(messageCode, "LTquoteDiscLoadData Fetched Successfully");

		return response.toString();
	}

	@Override
	public String update(LTQquotDiscLoadRequest ltQuoteRequest, Long tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		try {
			Optional<LTQquotDiscLoad> optionalUser = ltQquotDiscLoadReposiroty.findById(tranId);
			if (optionalUser.isEmpty()) {
				response.put(statusCode, errorCode);
				response.put(messageCode, "LTquoteDiscLoad Data not found");
				return response.toString();
			}
			LTQquotDiscLoad quoteData = optionalUser.get();
			if (quoteData != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				if (ltQuoteRequest.getQuotDiscLoadDetails() != null) {
					fieldMaps.put("frontForm", ltQuoteRequest.getQuotDiscLoadDetails().getFormFields());
				}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(quoteData, LTQquotDiscLoad.class, entry.getValue());
				}

				try {
					LTQquotDiscLoad saveLT_QuotedData = ltQquotDiscLoadReposiroty.save(quoteData);
					response.put(statusCode, successCode);
					response.put(messageCode, "LTQ quoteDis Load  Details Updated Successfully");
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
			Optional<LTQquotDiscLoad> optionalEntity = ltQquotDiscLoadReposiroty.findById(tranId);

			if (optionalEntity.isPresent()) {
				ltQquotDiscLoadReposiroty.deleteById(tranId);

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
	public String getQuestionnaire(QueryParametersDTO queryParams, HttpServletRequest request) {

		JSONObject response = new JSONObject();

		String docListQuery = "SELECT * FROM LM_DOC_TODO_LIST WHERE DTL_DS_TYPE = :DTL_DS_TYPE AND DTL_DS_CODE = :DTL_DS_CODE AND DTL_DTG_GROUP_CODE = :DTL_DTG_GROUP_CODE";

		String subQuestionsQuery = "SELECT * FROM LM_DOC_TODO_LIST_DTL WHERE DTLD_DTL_REF_NO = :refNo AND DTLD_FLAG = :flag";

		List<Map<String, Object>> result = commonDao.getMapQuery(docListQuery, queryParams.getQueryParameters());

		List<GetQuestionnaireResponse> finalResult = new ArrayList<>();
		if (!result.isEmpty()) {
			GetQuestionnaireResponse questionResponse = new GetQuestionnaireResponse();
			for (int i = 0; i < result.size(); i++) {
				questionResponse = new GetQuestionnaireResponse();
				questionResponse.setId(result.get(i).get("DTL_REF_NO"));
				questionResponse.setLabel(result.get(i).get("DTL_TODO_LIST_ITEM").toString());

				Map<String, Object> subQuestionParams = new HashMap<>();
				subQuestionParams.put("refNo", result.get(i).get("DTL_REF_NO"));
				subQuestionParams.put("flag", "Y");

				List<Map<String, Object>> subQuestionResult = commonDao.getMapQuery(subQuestionsQuery,
						subQuestionParams);

				SubQuestionResult subQuestionsRes = new SubQuestionResult();

				List<SuQuestionsDTo> YesQuestions = new ArrayList<>();
				for (int j = 0; j < subQuestionResult.size(); j++) {

					Object qIdValue = subQuestionResult.get(j).get("DTLD_TRAN_ID");
					int qId = ((BigDecimal) qIdValue).intValue();
					SuQuestionsDTo subQuestionDTO = new SuQuestionsDTo();

					subQuestionDTO.setId(qId);
					subQuestionDTO.setQuest(subQuestionResult.get(j).get("DTLD_TODO_LIST_ITEM").toString());

					YesQuestions.add(subQuestionDTO);
				}
				subQuestionsRes.setYes(YesQuestions);

				Map<String, Object> noSubQuestionParams = new HashMap<>();
				noSubQuestionParams.put("refNo", result.get(i).get("DTL_REF_NO"));
				noSubQuestionParams.put("flag", "N");

				List<Map<String, Object>> noSubQuestionResult = commonDao.getMapQuery(subQuestionsQuery,
						noSubQuestionParams);
				List<SuQuestionsDTo> NoQuestions = new ArrayList<>();
				for (int k = 0; k < noSubQuestionResult.size(); k++) {

					Object qIdValue = subQuestionResult.get(k).get("DTLD_TRAN_ID");
					int qId = ((BigDecimal) qIdValue).intValue();
					SuQuestionsDTo subQuestionDTO = new SuQuestionsDTo();

					subQuestionDTO.setId(qId);
					subQuestionDTO.setQuest(noSubQuestionResult.get(k).get("DTLD_TODO_LIST_ITEM").toString());

					NoQuestions.add(subQuestionDTO);
				}
				subQuestionsRes.setNo(NoQuestions);
				questionResponse.setQuestions(subQuestionsRes);
				finalResult.add(questionResponse);
			}

			if (finalResult.size() >= 1) {
				response.put(statusCode, successCode);
				response.put(messageCode, "Get Question");
				response.put(dataCode, finalResult);
			}
		}

		return response.toString();
	}

	@Override
	@Transactional
	public String saveQuestionnaire(List<GetQuestionnaireResponse> getQuestionnaireRequest,
			HttpServletRequest request) {
		JSONObject response = new JSONObject();

		try {
			for (int i = 0; i < getQuestionnaireRequest.size(); i++) {
				LtDocTodoListStatus masterQuestion = new LtDocTodoListStatus();

				masterQuestion.setDTLS_QUOT_TRAN_ID(getQuestionnaireRequest.get(i).getQuotTranId());
				masterQuestion.setDTLS_TODO_LIST_ITEM(getQuestionnaireRequest.get(i).getLabel());
				masterQuestion.setDTLS_APPR_STS(getQuestionnaireRequest.get(i).getYesOrNo());
				masterQuestion.setDTLS_INS_DT(new Date());
				masterQuestion.setDTLS_DOC_REC_DT(new Date());

				LtDocTodoListStatus saved = docToDoListRepo.save(masterQuestion);

				if (getQuestionnaireRequest.get(i).getInQuestions() != null) {
					if (getQuestionnaireRequest.get(i).getInQuestions().get(0).getYes() != null) {
						for (int j = 0; j < getQuestionnaireRequest.get(i).getInQuestions().get(0).getYes()
								.size(); j++) {
							LT_DOC_TODO_LIST_STATUS_DTL docToDoListStatusDtl = new LT_DOC_TODO_LIST_STATUS_DTL();
							docToDoListStatusDtl.setDTLSD_TODO_LIST_ITEM(
									getQuestionnaireRequest.get(i).getInQuestions().get(0).getYes().get(j).getQuest());
							docToDoListStatusDtl.setDTLSD_VALUE(
									getQuestionnaireRequest.get(i).getInQuestions().get(0).getYes().get(j).getValue());
							docToDoListStatusDtl.setDTLSD_INS_DT(new Date());
							docToDoListStatusDtl.setDTLSD_DTLS_TRAN_ID(masterQuestion.getDTLS_QUOT_TRAN_ID());

							System.out.println("staus id" + masterQuestion.getDTLS_QUOT_TRAN_ID());
							System.out.println("staus id" + saved.getDTLS_QUOT_TRAN_ID());

							LT_DOC_TODO_LIST_STATUS_DTL status = docToDoListDtlRepo.save(docToDoListStatusDtl);
						}
					}

					if (getQuestionnaireRequest.get(i).getInQuestions().get(0).getNo() != null) {
						for (int k = 0; k < getQuestionnaireRequest.get(i).getInQuestions().get(0).getNo()
								.size(); k++) {
							LT_DOC_TODO_LIST_STATUS_DTL docToDoListStatusDtl = new LT_DOC_TODO_LIST_STATUS_DTL();
							docToDoListStatusDtl.setDTLSD_TODO_LIST_ITEM(
									getQuestionnaireRequest.get(i).getInQuestions().get(0).getNo().get(k).getQuest());
							docToDoListStatusDtl.setDTLSD_VALUE(
									getQuestionnaireRequest.get(i).getInQuestions().get(0).getNo().get(k).getValue());
							docToDoListStatusDtl.setDTLSD_INS_DT(new Date());
							docToDoListStatusDtl.setDTLSD_DTLS_TRAN_ID(masterQuestion.getDTLS_QUOT_TRAN_ID());

							LT_DOC_TODO_LIST_STATUS_DTL status = docToDoListDtlRepo.save(docToDoListStatusDtl);
						}
					}
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Questionnaire Fetched Successfully");
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getLocalizedMessage());
		}
		return response.toString();
	}

	@Override
	public String getQuestionnaireWithValues(Integer tranId, HttpServletRequest request) {

		JSONObject response = new JSONObject();

		String docListQuery = "SELECT * FROM LT_DOC_TODO_LIST_STATUS WHERE DTLS_QUOT_TRAN_ID = :tranId";

		String subQuestionsQuery = "SELECT DTLSD_TRAN_ID,DTLSD_DTLS_TRAN_ID,DTLSD_TODO_LIST_ITEM,DTLSD_VALUE FROM LT_DOC_TODO_LIST_STATUS_DTL WHERE DTLSD_DTLS_TRAN_ID = :sysId";

		Map<String, Object> queryParams = new HashMap<>();
		queryParams.put("tranId", tranId);

		List<Map<String, Object>> result = commonDao.getMapQuery(docListQuery, queryParams);

		List<GetQuestionnaireResponse> finalResult = new ArrayList<>();
		if (!result.isEmpty()) {
			GetQuestionnaireResponse questionResponse = new GetQuestionnaireResponse();
			for (int i = 0; i < result.size(); i++) {
				questionResponse = new GetQuestionnaireResponse();
				questionResponse.setId(result.get(i).get("DTLS_TRAN_ID"));
				questionResponse.setLabel(result.get(i).get("DTLS_TODO_LIST_ITEM").toString());
				questionResponse.setYesOrNo(result.get(i).get("DTLS_APPR_STS").toString());

				Map<String, Object> subQuestionParams = new HashMap<>();
				subQuestionParams.put("sysId", result.get(i).get("DTLS_QUOT_TRAN_ID"));
//				subQuestionParams.put("flag", "Y");

				List<Map<String, Object>> subQuestionResult = commonDao.getMapQuery(subQuestionsQuery,
						subQuestionParams);

				SubQuestionResult subQuestionsRes = new SubQuestionResult();

				List<SuQuestionsDTo> YesQuestions = new ArrayList<>();
				for (int j = 0; j < subQuestionResult.size(); j++) {

					Object qIdValue = subQuestionResult.get(j).get("DTLSD_DTLS_TRAN_ID");
					int qId = ((BigDecimal) qIdValue).intValue();
					SuQuestionsDTo subQuestionDTO = new SuQuestionsDTo();

					subQuestionDTO.setId(qId);
					subQuestionDTO.setValue(subQuestionResult.get(j).get("DTLSD_VALUE").toString());
					subQuestionDTO.setQuest(subQuestionResult.get(j).get("DTLSD_TODO_LIST_ITEM").toString());

					YesQuestions.add(subQuestionDTO);
				}
				subQuestionsRes.setYes(YesQuestions);

				Map<String, Object> noSubQuestionParams = new HashMap<>();
				noSubQuestionParams.put("sysId", result.get(i).get("DTLS_QUOT_TRAN_ID"));
//				noSubQuestionParams.put("flag", "N");

				List<Map<String, Object>> noSubQuestionResult = commonDao.getMapQuery(subQuestionsQuery,
						noSubQuestionParams);
				List<SuQuestionsDTo> NoQuestions = new ArrayList<>();
				for (int k = 0; k < noSubQuestionResult.size(); k++) {

					Object qIdValue = subQuestionResult.get(k).get("DTLSD_DTLS_TRAN_ID");
					int qId = ((BigDecimal) qIdValue).intValue();
					SuQuestionsDTo subQuestionDTO = new SuQuestionsDTo();

					subQuestionDTO.setId(qId);
					subQuestionDTO.setValue(subQuestionResult.get(k).get("DTLSD_VALUE").toString());				
					subQuestionDTO.setQuest(noSubQuestionResult.get(k).get("DTLSD_TODO_LIST_ITEM").toString());

					NoQuestions.add(subQuestionDTO);
				}
				subQuestionsRes.setNo(NoQuestions);
				questionResponse.setQuestions(subQuestionsRes);
				finalResult.add(questionResponse);
			}

			if (finalResult.size() >= 1) {
				response.put(statusCode, successCode);
				response.put(messageCode, "Get Question");
				response.put(dataCode, finalResult);
			}
		}

		return response.toString();
	}

}
