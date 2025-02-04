package com.wenxt.claims.service;

import com.wenxt.claims.model.ProductMasterRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface ApplicableChargeService {

	String save(ProductMasterRequest prodMasterRequest, HttpServletRequest request);

	String update(ProductMasterRequest prodMasterRequest, Integer tranId, HttpServletRequest request);

	String get(Integer tranId);

}
