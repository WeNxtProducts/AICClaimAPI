package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.service.LtPolBeneficiaryService;
import com.wenxt.claims.service.LtPolEmployeeService;

@RestController
@RequestMapping("/polBeneficiary")
public class LtPolBeneficiaryController {
	
	@Autowired
	private LtPolBeneficiaryService polBeneficiaryService;
	
	@PostMapping("/save")
	public String createPolBeneficiary(@RequestBody ProposalEntryRequest proposalEntryRequest) {
		return polBeneficiaryService.createPolBeneficiary(proposalEntryRequest);
	}
	
	@PostMapping("/polBeneficiaryUpdate/{polBeneficiaryId}")
	public String updatePolBeneficiary(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable Integer polBeneficiaryId) {
		return polBeneficiaryService.updatePolBeneficiary(proposalEntryRequest, polBeneficiaryId);
	}
	
	@PostMapping("/deletePolBeneficiary/{polBeneficiaryId}")
	public String deletePolBeneficiary(@PathVariable Integer polBeneficiaryId) {
		return polBeneficiaryService.deletePolBeneficiaryById(polBeneficiaryId);
	}

}
