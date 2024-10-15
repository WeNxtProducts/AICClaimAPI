package com.wenxt.claims.service;

import com.wenxt.claims.model.RIRequestDTO;

import jakarta.servlet.http.HttpServletRequest;

public interface RiEmployeeDetailService {

	String save(RIRequestDTO riRequest, HttpServletRequest request);

	String update(RIRequestDTO riRequest, Integer tranId, HttpServletRequest request);

	String delete(Integer tranId, HttpServletRequest request);

	String get(Integer tranId, HttpServletRequest request);

}
