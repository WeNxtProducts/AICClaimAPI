package com.wenxt.claims.service;

import java.sql.SQLException;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.model.LT_CLAIM_CHARGES;

public interface LtClaimChargesService {

	String createClaimCharges(ClaimsRequestDTO claimsRequestDTO);

//	String getAllClaimChargeslist() throws SQLException;

	String getClaimChargesById(Integer cc_TRAN_id);

	String deleteClaimChargesByid(Integer cc_TRAN_id);

	String updateLtClaimCharges(ClaimsRequestDTO claimsRequestDTO, Integer claim_Id);

}
