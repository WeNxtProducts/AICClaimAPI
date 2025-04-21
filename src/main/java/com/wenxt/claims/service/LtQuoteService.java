package com.wenxt.claims.service;

import java.util.List;

import com.wenxt.claims.model.InsuranceCoverageDTO;
import com.wenxt.claims.model.LTQuoteRequest;
import com.wenxt.claims.model.QuoteLoginRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface LtQuoteService {

	String save(LTQuoteRequest ltQuoteRequest, HttpServletRequest request);

	String getLTQuoteById(Long tranId, HttpServletRequest request) throws IllegalArgumentException, IllegalAccessException;

	String update(LTQuoteRequest ltQuoteRequest, Long tranId, HttpServletRequest request);

	String delete(Long tranId, HttpServletRequest servletRequest);

	String updateLtQuotCoverData(List<InsuranceCoverageDTO> coverages, HttpServletRequest request);

	String createLogin(QuoteLoginRequest quoteLoginRequest, HttpServletRequest request);

	String triggerOTP(String userName, HttpServletRequest request);

//	String createLogin(String customerCode, HttpServletRequest request);



}
