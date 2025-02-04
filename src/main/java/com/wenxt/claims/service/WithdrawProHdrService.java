package com.wenxt.claims.service;

import com.wenxt.claims.model.ProcessingRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface WithdrawProHdrService {

	String save(ProcessingRequest processingRequest, HttpServletRequest request);

	String update(ProcessingRequest processingRequest, Integer tranId, HttpServletRequest request);

	String get(Integer tranId);

}
