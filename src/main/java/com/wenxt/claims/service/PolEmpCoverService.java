package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface PolEmpCoverService {

	String createPolEmpCover(ProposalEntryRequest proposalEntryRequest, Integer tranId, Integer emptranId, HttpServletRequest request);

	String updatePolEmpCover(ProposalEntryRequest proposalEntryRequest, Integer polEmpCoverId, HttpServletRequest request);

	String deletePolEmpCoverById(Integer polEmpCoverId);

	String getPolEmpCoverByid(Integer polEmpCoverId) throws Exception;

}
