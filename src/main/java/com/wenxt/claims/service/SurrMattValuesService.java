package com.wenxt.claims.service;

import com.wenxt.claims.model.SurrMattValuesRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface SurrMattValuesService {

	String save(SurrMattValuesRequest surrMattValuesRequest, HttpServletRequest servletRequest);
	
	String update(SurrMattValuesRequest surrMattValuesRequest, Integer tranId, HttpServletRequest servletRequest);

	String delete(Integer tranId, HttpServletRequest servletRequest);

	String get(Integer tranId, HttpServletRequest servletRequest) throws Exception;

}
