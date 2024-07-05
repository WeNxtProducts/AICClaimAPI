package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProposalEntryRequest;
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
	
	@PostMapping("/polChargeUpdate/{polChargeId}")
	public String updatePolCharge(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable Integer polChargeId) {
		return polChargeService.updatePolCharge(proposalEntryRequest, polChargeId);
	}
	
	@PostMapping("/deletePolCharge/{polChargeId}")
	public String deletePolCharge(@PathVariable Integer polChargeId) {
		return polChargeService.deletePolChargeById(polChargeId);
	}
	
	@PostMapping("/getPolChargeByid")
	public String getLtClaimEstById(@RequestParam Integer polChargeId) {
		try {
		return polChargeService.getPolChargeById(polChargeId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
