package com.wenxt.claims.service;

import com.wenxt.claims.model.LoanRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface LoanRepaymentService {

	String save(LoanRequest loanRequest, HttpServletRequest servletRequest);

	String update(LoanRequest loanRequest, Integer tranId, HttpServletRequest servletRequest);

	String delete(Integer tranId, HttpServletRequest servletRequest);

	String get(Integer tranId, HttpServletRequest servletRequest) throws Exception;

}
