package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.service.LtPolBeneficiaryService;
import com.wenxt.claims.service.LtPolChargeService;

@RestController
@RequestMapping("/polCharge")
public class LtPolChargeController {
	
	@Autowired
	private LtPolChargeService polChargeService;
	
	@PostMapping("/save")
	public String createPolCharge(@RequestBody ProposalEntryRequest proposalEntryRequest) {
		return polChargeService.createPolCharge(proposalEntryRequest);
	}
	
	@PostMapping("/polBeneficiaryUpdate/{polBeneficiaryId}")
	public String updatePolBeneficiary(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable Integer polBeneficiaryId) {
		return polChargeService.updatePolCharge(proposalEntryRequest, polBeneficiaryId);
	}
	
	@PostMapping("/deletePolBeneficiary/{polBeneficiaryId}")
	public String deletePolBeneficiary(@PathVariable Integer polBeneficiaryId) {
		return polChargeService.deletePolChargeById(polBeneficiaryId);
	}

}
