package com.wenxt.claims.service;

import com.wenxt.claims.model.LTQquotBeneficiaryRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface LtqquotBeneficiaryService {

	String getById(Long tranId) throws IllegalArgumentException, IllegalAccessException;

	String delete(Long tranId, HttpServletRequest servletRequest);

	String save(LTQquotBeneficiaryRequest ltQquotBeneficiaryRequest, Integer tranId, HttpServletRequest request);

	String update(LTQquotBeneficiaryRequest ltQuoteRequest, Long tranId, HttpServletRequest request);

}
