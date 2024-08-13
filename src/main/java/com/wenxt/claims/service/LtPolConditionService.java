package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface LtPolConditionService {

	String createPolCondition(ProposalEntryRequest proposalEntryRequest, Integer tranId, HttpServletRequest request);

	String updatePolCondition(ProposalEntryRequest proposalEntryRequest, Integer polChargeId, HttpServletRequest request);

	String deletePolConditionById(Integer polChargeId, HttpServletRequest request);

	String getPolConditionById(Integer polChargeId) throws Exception;

}
