package com.wenxt.claims.service;

import com.wenxt.claims.model.ClaimsRequestDTO;

public interface LtClaimCheckListService {

	String createClaimCheckList(ClaimsRequestDTO claimsRequestDTO);

	String getClaimCheckListById(Integer dTLS_TRAN_ID) throws IllegalArgumentException, IllegalAccessException;

	String deleteLtClaimCheckListByid(Integer dTLS_TRAN_ID);

	String updateLtClaimCheckList(ClaimsRequestDTO claimsRequestDTO, Integer dTLS_TRAN_ID);

}
