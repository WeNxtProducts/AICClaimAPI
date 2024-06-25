package com.wenxt.claims.service;

import com.wenxt.claims.model.ClaimsRequestDTO;

public interface LtClaimEstimateService {

	String createLtClaimEst(ClaimsRequestDTO claimsRequestDTO, Integer tranId);

//	String getAllLtClaimEstlist() throws SQLException;

	String getLtClaimEstById(Integer ce_TRAN_id) throws IllegalArgumentException, IllegalAccessException;

	String deleteLtClaimEstByid(Integer ce_TRAN_id);

	String updateLtClaimEstimate(ClaimsRequestDTO claimsRequestDTO, Integer claim_Id);

}
