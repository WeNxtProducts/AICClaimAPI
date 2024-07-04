package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

public interface LtPolBeneficiaryService {

	String createPolBeneficiary(ProposalEntryRequest proposalEntryRequest);

	String updatePolBeneficiary(ProposalEntryRequest proposalEntryRequest, Integer polBeneficiaryId);

	String deletePolBeneficiaryById(Integer polBeneficiaryId);

}
