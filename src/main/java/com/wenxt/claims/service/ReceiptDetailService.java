package com.wenxt.claims.service;

import com.wenxt.claims.model.ReceiptRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface ReceiptDetailService {

	String save(ReceiptRequest receiptRequest, HttpServletRequest request);

	String update(ReceiptRequest receiptRequest, Integer tranId);

	String delete(Integer tranId);

	String get(Integer tranId) throws Exception;

}
