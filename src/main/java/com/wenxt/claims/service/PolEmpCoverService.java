package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

public interface PolEmpCoverService {

	String createPolEmpCover(ProposalEntryRequest proposalEntryRequest, Integer tranId, Integer emptranId);

	String updatePolEmpCover(ProposalEntryRequest proposalEntryRequest, Integer polEmpCoverId);

	String deletePolEmpCoverById(Integer polEmpCoverId);

	String getPolEmpCoverByid(Integer polEmpCoverId) throws Exception;

}
