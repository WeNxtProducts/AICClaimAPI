package com.wenxt.claims.service;

import com.wenxt.claims.model.ClaimsRequestDTO;

public interface LtClaimEstimateService {

	String createLtClaimEst(ClaimsRequestDTO claimsRequestDTO);

//	String getAllLtClaimEstlist() throws SQLException;

	String getLtClaimEstById(Long ce_TRAN_id);

	String deleteLtClaimEstByid(Long ce_TRAN_id);

}
