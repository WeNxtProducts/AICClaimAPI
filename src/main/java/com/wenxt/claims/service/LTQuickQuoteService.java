package com.wenxt.claims.service;

import com.wenxt.claims.model.EmployeeValidationsRequest;
import com.wenxt.claims.model.LTQuickQuoteRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface LTQuickQuoteService {

	String save(LTQuickQuoteRequest quickQuoteRequest, HttpServletRequest request);

	String update(LTQuickQuoteRequest quickQuoteRequest, Long tranId, HttpServletRequest request);

	String delete(Long tranId, HttpServletRequest request);

	String get();

	String employeeValidation(EmployeeValidationsRequest employeeExcel, HttpServletRequest request);

}
