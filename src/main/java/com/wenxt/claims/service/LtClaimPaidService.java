package com.wenxt.claims.service;

import com.wenxt.claims.model.ClaimsRequestDTO;

public interface LtClaimPaidService {

	String saveClaimPaid(ClaimsRequestDTO claimsRequestDTO, Integer cp_id);

}
