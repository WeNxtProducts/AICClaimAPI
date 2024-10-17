package com.wenxt.claims.service;

import com.wenxt.claims.model.DeleteBrokerRequest;
import com.wenxt.claims.model.ProposalEntryRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface LtPolBrokerService {

	String createPolBroker(ProposalEntryRequest proposalEntryRequest, Integer tranId, HttpServletRequest request);

	String updatePolBroker(ProposalEntryRequest proposalEntryRequest);

	String deletePolBrokerById(DeleteBrokerRequest deleteBrokerRequest);

	String getPolBrokerById(Integer polBrokerId, HttpServletRequest request) throws Exception;

}
