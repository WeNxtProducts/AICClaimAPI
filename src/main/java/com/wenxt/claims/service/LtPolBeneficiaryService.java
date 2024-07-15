package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

public interface LtPolBeneficiaryService {

	String createPolBeneficiary(ProposalEntryRequest proposalEntryRequest, Integer tranId);

	String updatePolBeneficiary(ProposalEntryRequest proposalEntryRequest, Integer polBeneficiaryId);

	String deletePolBeneficiaryById(Integer polBeneficiaryId);

	String getPolBeneficiaryById(Integer polBeneficiaryId) throws Exception;

}
