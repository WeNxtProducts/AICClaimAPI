package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface LtPolBeneficiaryService {

	String createPolBeneficiary(ProposalEntryRequest proposalEntryRequest, Integer tranId, Integer poltranId, HttpServletRequest request);

	String updatePolBeneficiary(ProposalEntryRequest proposalEntryRequest, Integer polBeneficiaryId, HttpServletRequest request);

	String deletePolBeneficiaryById(Integer polBeneficiaryId);

	String getPolBeneficiaryById(Integer polBeneficiaryId) throws Exception;

}
