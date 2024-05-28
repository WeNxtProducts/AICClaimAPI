package com.wenxt.claims.service;

import com.wenxt.claims.model.ClaimsRequestDTO;

public interface LtClaimBeneficiaryService {

	String createLtClaimBfcry(ClaimsRequestDTO claimsRequestDTO);

//	String getAllLtClaimBfcrylist() throws SQLException;

	String getLtClaimBfcryById(Integer cben_pben_TRAN_id) throws IllegalArgumentException, IllegalAccessException;

	String deleteLtClaimBfcryByid(Integer cben_pben_TRAN_id);

	String updateLtClaimBeneficiary(ClaimsRequestDTO claimsRequestDTO, Integer claim_Id);

}
