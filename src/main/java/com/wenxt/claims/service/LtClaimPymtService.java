package com.example.aicbaseCrud.service;

import java.sql.SQLException;

import com.example.aicbaseCrud.model.LT_CLAIM_PYMT;

public interface LtClaimPymtService {

	String createClaimPymt(LT_CLAIM_PYMT claimpymt);

//	String getAllClaimPymtlist() throws SQLException;

	String getClaimPymtById(Long cpTRANId);

	String deleteClaimPymtByid(Long cpTRANId);

}
