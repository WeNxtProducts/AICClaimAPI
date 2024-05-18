package com.wenxt.claims.service;

import com.wenxt.claims.model.ClaimsRequestDTO;

public interface LtClaimCoverDtlsService {

	String createCcdtls(ClaimsRequestDTO claimRequestDTO);

//	String getAllCcdtlslist() throws SQLException;

	String getCcdtlsById(Long ccd_TRAN_id);

	String deleteCcdtlsByid(Long ccd_TRAN_id);

}
