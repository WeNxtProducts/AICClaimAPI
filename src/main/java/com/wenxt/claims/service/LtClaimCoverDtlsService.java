package com.wenxt.claims.service;

import java.sql.SQLException;

import com.wenxt.claims.model.LT_CLAIM_COVER_DTLS;

public interface LtClaimCoverDtlsService {

	String createCcdtls(LT_CLAIM_COVER_DTLS ltccdtls);

//	String getAllCcdtlslist() throws SQLException;

	String getCcdtlsById(Long ccd_TRAN_id);

	String deleteCcdtlsByid(Long ccd_TRAN_id);

}
