package com.wenxt.claims.service;

import com.wenxt.claims.model.PlanMasterRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface PlanDetailService {

	String save(PlanMasterRequest planMasterRequest, HttpServletRequest request);

	String update(PlanMasterRequest planMasterRequest, Long tranId, HttpServletRequest request);

	String get(Long tranId);

}
