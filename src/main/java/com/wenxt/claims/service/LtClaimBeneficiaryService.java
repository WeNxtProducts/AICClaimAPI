package com.wenxt.claims.service;

import com.wenxt.claims.model.ClaimsRequestDTO;

public interface LtClaimBeneficiaryService {

	String createLtClaimBfcry(ClaimsRequestDTO claimsRequestDTO);

//	String getAllLtClaimBfcrylist() throws SQLException;

	String getLtClaimBfcryById(Long cben_pben_TRAN_id);

	String deleteLtClaimBfcryByid(Long cben_pben_TRAN_id);

}
