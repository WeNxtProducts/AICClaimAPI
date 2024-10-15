package com.wenxt.claims.service;

import com.wenxt.claims.model.RIRequestDTO;

import jakarta.servlet.http.HttpServletRequest;

public interface RiPremAllocHeadService {

	String save(RIRequestDTO riRequestDTO, HttpServletRequest request);

	String update(RIRequestDTO riRequestDTO, Integer tranId, HttpServletRequest request);

	String delete(Integer tranId, HttpServletRequest request);

	String get(Integer tranId, HttpServletRequest request);

}
