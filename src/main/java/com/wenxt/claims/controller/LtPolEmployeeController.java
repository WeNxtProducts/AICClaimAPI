package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.service.LtPolEmployeeService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/polEmployee")
public class LtPolEmployeeController {
	
	@Autowired
	private LtPolEmployeeService polEmployeeService;
	
	@PostMapping("/save/{tranId}")
	public String createPolicy(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable("tranId") Integer tranId, HttpServletRequest request) {
		return polEmployeeService.createPolEmployee(proposalEntryRequest, tranId, request);
	}
	
	@PostMapping("/polEmployeeUpdate/{polEmpId}")
	public String updatePolEmployee(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable("polEmpId") Integer polEmpId, HttpServletRequest request) {
		return polEmployeeService.updatePolEmployee(proposalEntryRequest, polEmpId, request);
	}
	
	@PostMapping("/deletePolEmployee/{polEmpId}")
	public String deletePolEmployee(@PathVariable("polEmpId") Integer polEmpId) {
		return polEmployeeService.deletePolEmployeeById(polEmpId);
	}
	
	@PostMapping("/getPolEmployeeByid")
	public String getPolEmployeeByid(@RequestParam("polEmpId") Integer polEmpId) {
		try {
		return polEmployeeService.getPolEmployeeByid(polEmpId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
