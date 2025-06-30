package com.wenxt.claims.service;

import com.wenxt.claims.model.PlanMasterRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface PlanDetailMasterService {

	String save(PlanMasterRequest planMasterRequest, HttpServletRequest request);

	String update(PlanMasterRequest planMasterRequest, Integer tranId, HttpServletRequest request);

	String get(Integer tranId) throws Exception;

}
