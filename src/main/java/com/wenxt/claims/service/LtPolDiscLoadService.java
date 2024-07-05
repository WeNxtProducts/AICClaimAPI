package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

public interface LtPolDiscLoadService {

	String createPolDiscLoad(ProposalEntryRequest proposalEntryRequest);

	String updatePolDiscLoad(ProposalEntryRequest proposalEntryRequest, Integer polDiscLoadId);

	String deletePolDiscLoadById(Integer polDiscLoadId);

	String getPolDiscLoadByid(Integer polDiscLoadId) throws Exception;

}
