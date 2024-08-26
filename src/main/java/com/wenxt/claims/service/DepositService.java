package com.wenxt.claims.service;

import com.wenxt.claims.model.ReceiptRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface DepositService {

	String save(ReceiptRequest receiptRequest, HttpServletRequest request);

	String update(ReceiptRequest receiptRequest, Integer tranId, HttpServletRequest request);

	String delete(Integer tranId, HttpServletRequest request);

	String get(Integer tranId, HttpServletRequest request) throws Exception;

}
