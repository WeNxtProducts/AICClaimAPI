package com.wenxt.claims.service;

import com.wenxt.claims.model.ProductMasterRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface ProdMasterService {

	String save(ProductMasterRequest prodMasterRequest, HttpServletRequest request);

	String update(ProductMasterRequest prodMasterRequest, String tranId, HttpServletRequest request);

	String get(String tranId);

}
