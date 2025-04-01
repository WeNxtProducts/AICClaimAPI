package com.wenxt.claims.service;

import java.util.List;

import com.wenxt.claims.model.GetQuestionnaireResponse;
import com.wenxt.claims.model.LTQquotDiscLoadRequest;
import com.wenxt.claims.model.QueryParametersDTO;

import jakarta.servlet.http.HttpServletRequest;

public interface LTQquotDiscLoadService {

	String save(LTQquotDiscLoadRequest ltQquotDiscLoadRequest, HttpServletRequest request);

	String getLTQquoteDiscById(Long tranId) throws IllegalArgumentException, IllegalAccessException;

	String update(LTQquotDiscLoadRequest ltQuoteRequest, Long tranId, HttpServletRequest request);

	String delete(Long tranId, HttpServletRequest servletRequest);

	String getQuestionnaire(QueryParametersDTO queryParams, HttpServletRequest request);

	String saveQuestionnaire(List<GetQuestionnaireResponse> getQuestionnaireRequest, HttpServletRequest request);

	String getQuestionnaireWithValues(Integer tranId, HttpServletRequest request);

}
