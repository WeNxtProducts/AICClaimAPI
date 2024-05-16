package com.wenxt.claims.service;

import java.sql.SQLException;

import com.wenxt.claims.model.LT_CLAIM_BENEFICIARY;

public interface LtClaimBeneficiaryService {

	String createLtClaimBfcry(LT_CLAIM_BENEFICIARY ltclaimBfcry);

//	String getAllLtClaimBfcrylist() throws SQLException;

	String getLtClaimBfcryById(Long cben_pben_TRAN_id);

	String deleteLtClaimBfcryByid(Long cben_pben_TRAN_id);

}
