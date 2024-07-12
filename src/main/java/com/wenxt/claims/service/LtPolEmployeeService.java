package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

public interface LtPolEmployeeService {

	String createPolEmployee(ProposalEntryRequest proposalEntryRequest, Integer tranId);

	String updatePolEmployee(ProposalEntryRequest proposalEntryRequest, Integer polEmpId);

	String deletePolEmployeeById(Integer polEmpId);

	String getPolEmployeeByid(Integer polEmpId) throws Exception;

}
