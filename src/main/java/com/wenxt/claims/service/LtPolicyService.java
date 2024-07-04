package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

public interface LtPolicyService {

	String createPolicy(ProposalEntryRequest proposalEntryRequest);

	String updatePolicy(ProposalEntryRequest proposalEntryRequest, Integer policy_id);

	String deletePolicyByid(Integer policy_id);

}
