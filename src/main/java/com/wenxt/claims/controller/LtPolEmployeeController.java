package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.service.LtPolEmployeeService;

@RestController
@RequestMapping("/polEmployee")
public class LtPolEmployeeController {
	
	@Autowired
	private LtPolEmployeeService polEmployeeService;
	
	@PostMapping("/save")
	public String createPolicy(@RequestBody ProposalEntryRequest proposalEntryRequest) {
		return polEmployeeService.createPolEmployee(proposalEntryRequest);
	}
	
	@PostMapping("/polEmployeeUpdate/{polEmpId}")
	public String updatePolEmployee(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable Integer polEmpId) {
		return polEmployeeService.updatePolEmployee(proposalEntryRequest, polEmpId);
	}
	
	@PostMapping("/deletePolEmployee/{polEmpId}")
	public String deletePolEmployee(@PathVariable Integer polEmpId) {
		return polEmployeeService.deletePolEmployeeById(polEmpId);
	}

}
