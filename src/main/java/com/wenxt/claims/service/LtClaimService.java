package com.wenxt.claims.service;

import java.sql.SQLException;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.model.LT_CLAIM;

import jakarta.servlet.http.HttpServletRequest;

public interface LtClaimService {

	String createLtClaim(ClaimsRequestDTO claimsRequestDto);

//	String getAllLtClaimlist() throws SQLException;

	String getLtClaimById(Integer claim_TRAN_id, HttpServletRequest request) throws IllegalArgumentException, IllegalAccessException;

	String deleteLtClaimByid(Integer claim_TRAN_id);

	String updateLtClaim(ClaimsRequestDTO claimsRequestDTO, Integer claim_id);

}
