package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

public interface LtPolBrokerService {

	String createPolBroker(ProposalEntryRequest proposalEntryRequest);

	String updatePolBroker(ProposalEntryRequest proposalEntryRequest, Integer polBrokerId);

	String deletePolBrokerById(Integer polBrokerId);

	String getPolBrokerById(Integer polBrokerId) throws Exception;

}
