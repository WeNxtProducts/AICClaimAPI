package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

import jakarta.servlet.http.HttpServletRequest;

public interface LtPolEmployeeService {

	String createPolEmployee(ProposalEntryRequest proposalEntryRequest, Integer tranId, HttpServletRequest request);

	String updatePolEmployee(ProposalEntryRequest proposalEntryRequest, Integer polEmpId, HttpServletRequest request);

	String deletePolEmployeeById(Integer polEmpId);

	String getPolEmployeeByid(Integer polEmpId) throws Exception;

}
