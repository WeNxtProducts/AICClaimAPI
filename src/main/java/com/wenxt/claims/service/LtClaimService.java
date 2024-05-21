package com.wenxt.claims.service;

import java.sql.SQLException;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.model.LT_CLAIM;

public interface LtClaimService {

	String createLtClaim(ClaimsRequestDTO claimsRequestDto);

//	String getAllLtClaimlist() throws SQLException;

	String getLtClaimById(Long claim_TRAN_id);

	String deleteLtClaimByid(Integer claim_TRAN_id);

	String updateLtClaim(ClaimsRequestDTO claimsRequestDTO);

}
