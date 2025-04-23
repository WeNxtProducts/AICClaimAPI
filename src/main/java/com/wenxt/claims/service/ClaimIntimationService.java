package com.wenxt.claims.service;

import com.wenxt.claims.model.FormFieldsDTO;
import com.wenxt.claims.model.QuickQuoteRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface ClaimIntimationService {

	String save(QuickQuoteRequest claimIntimation, HttpServletRequest request);

	String update(QuickQuoteRequest quickQuoteRequest, Integer tranId, HttpServletRequest request);

	String get(Integer tranId, HttpServletRequest request)throws Exception;

	String delete(Integer tranId, HttpServletRequest request);

}
