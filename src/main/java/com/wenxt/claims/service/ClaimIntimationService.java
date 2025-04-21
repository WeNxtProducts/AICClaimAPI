package com.wenxt.claims.service;

import com.wenxt.claims.model.FormFieldsDTO;
import com.wenxt.claims.model.QuickQuoteRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface ClaimIntimationService {

	String save(FormFieldsDTO claimIntimation, HttpServletRequest request);

	String update(QuickQuoteRequest quickQuoteRequest, Integer tranId, HttpServletRequest request);

	String get();

	String delete(Integer tranId, HttpServletRequest request);

}
