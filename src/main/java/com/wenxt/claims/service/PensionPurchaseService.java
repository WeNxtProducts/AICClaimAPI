package com.wenxt.claims.service;

import com.wenxt.claims.model.PolicyRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface PensionPurchaseService {

	String save(PolicyRequest policyRequest, HttpServletRequest request);

	String update(PolicyRequest policyRequest, Integer tranId, HttpServletRequest request);

	String get(Integer tranId);

}
