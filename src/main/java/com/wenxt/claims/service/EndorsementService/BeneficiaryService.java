package com.wenxt.claims.service.EndorsementService;

import com.wenxt.claims.model.Endorsement.EndorsementRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface BeneficiaryService {

	String save(EndorsementRequest endtRequest, HttpServletRequest request);

	String update(Integer tranId, EndorsementRequest endtRequest, HttpServletRequest request);

	String delete(Integer tranId, HttpServletRequest request);

	String get(Integer tranId, HttpServletRequest request) throws Exception;

}
