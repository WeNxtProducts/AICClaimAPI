package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

public interface LtPolChargeService {

	String createPolCharge(ProposalEntryRequest proposalEntryRequest);

	String updatePolCharge(ProposalEntryRequest proposalEntryRequest, Integer polBeneficiaryId);

	String deletePolChargeById(Integer polBeneficiaryId);

	String getPolChargeById(Integer polChargeId) throws Exception;

}
