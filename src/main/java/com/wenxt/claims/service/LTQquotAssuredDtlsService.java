package com.wenxt.claims.service;

import com.wenxt.claims.model.LTQquotAssuredDtlsRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface LTQquotAssuredDtlsService {

	String save(LTQquotAssuredDtlsRequest ltquotAssuredDtlsRequest, HttpServletRequest request);

	String getById(Long tranId) throws IllegalArgumentException, IllegalAccessException;

	String update(LTQquotAssuredDtlsRequest ltquotAssuredDtlsRequest, Long tranId, HttpServletRequest request);

	String delete(Long tranId, HttpServletRequest servletRequest);

}
