package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;

public interface LtPolEmployeeService {

	String createPolEmployee(ProposalEntryRequest proposalEntryRequest);

	String updatePolEmployee(ProposalEntryRequest proposalEntryRequest, Integer polEmpId);

	String deletePolEmployeeById(Integer polEmpId);

}
