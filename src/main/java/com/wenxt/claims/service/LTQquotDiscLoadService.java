package com.wenxt.claims.service;

import com.wenxt.claims.model.LTQquotDiscLoadRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface LTQquotDiscLoadService {

	String save(LTQquotDiscLoadRequest ltQquotDiscLoadRequest, HttpServletRequest request);

	String getLTQquoteDiscById(Long tranId) throws IllegalArgumentException, IllegalAccessException;

	String update(LTQquotDiscLoadRequest ltQuoteRequest, Long tranId, HttpServletRequest request);

	String delete(Long tranId, HttpServletRequest servletRequest);

}
