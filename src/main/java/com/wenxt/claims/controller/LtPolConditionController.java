package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.service.LtPolConditionService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/condition")
public class LtPolConditionController {
	
	@Autowired
	private LtPolConditionService polConditionService;
	
	@PostMapping("/save/{tranId}")
	public String createPolCondition(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable("tranId") Integer tranId, HttpServletRequest request) {
		return polConditionService.createPolCondition(proposalEntryRequest, tranId, request);
	}
	
	@PostMapping("/update/{polConditionId}")
	public String updatePolCondition(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable("polConditionId") Integer polConditionId, HttpServletRequest request) {
		return polConditionService.updatePolCondition(proposalEntryRequest, polConditionId, request);
	}
	
	@PostMapping("/delete/{polConditionId}")
	public String deletePolCharge(@PathVariable("polConditionId") Integer polConditionId, HttpServletRequest request) {
		return polConditionService.deletePolConditionById(polConditionId, request);
	}
	
	@PostMapping("/getPolChargeByid")
	public String getLtClaimEstById(@RequestParam("polChargeId") Integer polChargeId) {
		try {
		return polConditionService.getPolConditionById(polChargeId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
