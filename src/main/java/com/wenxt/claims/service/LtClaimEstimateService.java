package com.wenxt.claims.service;

import com.wenxt.claims.model.ClaimsRequestDTO;

public interface LtClaimEstimateService {

	String createLtClaimEst(ClaimsRequestDTO claimsRequestDTO);

//	String getAllLtClaimEstlist() throws SQLException;

	String getLtClaimEstById(Integer ce_TRAN_id);

	String deleteLtClaimEstByid(Integer ce_TRAN_id);

	String updateLtClaimEstimate(ClaimsRequestDTO claimsRequestDTO, Integer claim_Id);

}
