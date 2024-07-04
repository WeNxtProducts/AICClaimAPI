package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.service.LtPolicyService;

@RestController
@RequestMapping("/policy")
public class LtPolicyController {
	
	@Autowired
	private LtPolicyService policyService;
	
	@PostMapping("/save")
	public String createPolicy(@RequestBody ProposalEntryRequest proposalEntryRequest) {
		return policyService.createPolicy(proposalEntryRequest);
	}
	
	@PostMapping("/policyUpdate/{policy_id}")
	public String updateLtClaim(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable Integer policy_id) {
		return policyService.updatePolicy(proposalEntryRequest, policy_id);
	}
	
	@PostMapping("/deletePolicy/{policy_id}")
	public String deleteLtClaimByid(@PathVariable Integer policy_id) {
		return policyService.deletePolicyByid(policy_id);
	}

}
