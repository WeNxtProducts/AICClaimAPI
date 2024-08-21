package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

public interface MedExFeeDtlService {

	String saveMedExFeeDtl(ProposalEntryRequest proposalEntryRequest, Integer tranId, Integer emptranId, Integer mhtranId);

	String updateMedExFeeDtl(ProposalEntryRequest proposalEntryRequest, Integer tranId);

	String deleteMedicalDetails(Integer tranId);

	String getMedicalDetails(Integer tranId)throws Exception;

}
