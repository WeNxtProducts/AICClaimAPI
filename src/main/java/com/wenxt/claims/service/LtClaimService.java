package com.wenxt.claims.service;

import com.wenxt.claims.model.ClaimRequestDTO;
import com.wenxt.claims.model.ClaimsRequestDTO;

import jakarta.servlet.http.HttpServletRequest;

public interface LtClaimService {

	String createLtClaim(ClaimRequestDTO claimsRequestDTO, HttpServletRequest request);

//	String getAllLtClaimlist() throws SQLException;

	String getLtClaimById(Integer claim_TRAN_id, HttpServletRequest request) throws IllegalArgumentException, IllegalAccessException;

	String deleteLtClaimByid(Integer claim_TRAN_id);

	String updateLtClaim(ClaimsRequestDTO claimsRequestDTO, Integer claim_id);

	String getListOfPolicies(Integer sysId);

	String getClaimHeader(Integer tranId) throws Exception;

	String getClaimHistory(Integer tranId, HttpServletRequest request) throws Exception;

}
