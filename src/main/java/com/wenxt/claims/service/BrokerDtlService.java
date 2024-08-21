package com.wenxt.claims.service;

import com.wenxt.claims.model.BrokerRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface BrokerDtlService {

	String save(BrokerRequest brokerRequest, HttpServletRequest request);

	String update(BrokerRequest brokerRequest, Integer tranId, HttpServletRequest request);

	String delete(Integer tranId, HttpServletRequest request);

	String get(Integer tranId, HttpServletRequest request) throws Exception;

}
