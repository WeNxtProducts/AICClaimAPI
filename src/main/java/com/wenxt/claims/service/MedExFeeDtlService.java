package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface MedExFeeDtlService {

	String saveMedExFeeDtl(ProposalEntryRequest proposalEntryRequest, Integer tranId, Integer emptranId, Integer mhtranId, HttpServletRequest request);

	String updateMedExFeeDtl(ProposalEntryRequest proposalEntryRequest, Integer tranId);

	String deleteMedicalDetails(Integer tranId);

	String getMedicalDetails(Integer tranId)throws Exception;

}
