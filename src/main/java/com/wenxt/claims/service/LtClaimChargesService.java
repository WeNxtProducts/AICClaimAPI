package com.wenxt.claims.service;

import com.wenxt.claims.model.ClaimsRequestDTO;

public interface LtClaimChargesService {

	String createClaimCharges(ClaimsRequestDTO claimsRequestDTO);

//	String getAllClaimChargeslist() throws SQLException;

	String getClaimChargesById(Integer cc_TRAN_id) throws IllegalArgumentException, IllegalAccessException;

	String deleteClaimChargesByid(Integer cc_TRAN_id);

	String updateLtClaimCharges(ClaimsRequestDTO claimsRequestDTO, Integer claim_Id);

}
