package com.wenxt.claims.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.service.LtPolBeneficiaryService;

@RestController
@RequestMapping("/polBeneficiary")
public class LtPolBeneficiaryController {
	
	@Autowired
	private LtPolBeneficiaryService polBeneficiaryService;
	
	@PostMapping({"/save/{tranId}", "/save/{tranId}/{poltranId}"})
	public String createPolBeneficiary(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable("tranId") Integer tranId, @PathVariable("poltranId") Optional<Integer> poltranId) {
		return polBeneficiaryService.createPolBeneficiary(proposalEntryRequest, tranId, poltranId.orElse(null));
	}
	
	@PostMapping("/polBeneficiaryUpdate/{polBeneficiaryId}")
	public String updatePolBeneficiary(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable("polBeneficiaryId") Integer polBeneficiaryId) {
		return polBeneficiaryService.updatePolBeneficiary(proposalEntryRequest, polBeneficiaryId);
	}
	
	@PostMapping("/deletePolBeneficiary/{polBeneficiaryId}")
	public String deletePolBeneficiary(@PathVariable("polBeneficiaryId") Integer polBeneficiaryId) {
		return polBeneficiaryService.deletePolBeneficiaryById(polBeneficiaryId);
	}
	
	@PostMapping("/getPolBeneficiaryById")
	public String getPolBeneficiaryById(@RequestParam("polBeneficiaryId") Integer polBeneficiaryId) {
		try {
		return polBeneficiaryService.getPolBeneficiaryById(polBeneficiaryId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
