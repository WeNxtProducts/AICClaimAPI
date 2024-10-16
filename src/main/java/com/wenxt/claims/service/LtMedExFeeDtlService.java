package com.wenxt.claims.service;

import com.wenxt.claims.model.LtmedFeeRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface LtMedExFeeDtlService {

	String saveMedExFeeDtl(LtmedFeeRequest medRequest, HttpServletRequest servletRequest);

	String updateMedfee(LtmedFeeRequest medRequest, Integer tranId, HttpServletRequest servletRequest);

	String deleteMedfee(Integer tranId, HttpServletRequest servletRequest);

	String getMedFee(Integer tranId, HttpServletRequest request) throws Exception;

}
