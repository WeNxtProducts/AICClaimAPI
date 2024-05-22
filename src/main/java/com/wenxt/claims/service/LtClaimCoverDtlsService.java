package com.wenxt.claims.service;

import com.wenxt.claims.model.ClaimsRequestDTO;

public interface LtClaimCoverDtlsService {

	String createCcdtls(ClaimsRequestDTO claimRequestDTO);

//	String getAllCcdtlslist() throws SQLException;

	String getCcdtlsById(Integer ccd_TRAN_id);

	String deleteCcdtlsByid(Integer ccd_TRAN_id);

	String updateLtClaimCover(ClaimsRequestDTO claimsRequestDTO, Integer claim_Id);

}
