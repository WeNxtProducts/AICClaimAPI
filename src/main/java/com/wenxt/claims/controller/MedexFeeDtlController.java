package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.service.MedExFeeDtlService;

@RestController
@RequestMapping("/medexFeeDtl")
public class MedexFeeDtlController {
	
	@Autowired
	private MedExFeeDtlService feeDtlService;
	
	@PostMapping("/save/{tranId}/{emptranId}/{headertranId}")
	public String saveMedExFeeDtl(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable Integer tranId, 
			@PathVariable Integer emptranId, @PathVariable Integer headertranId) {
		return feeDtlService.saveMedExFeeDtl(proposalEntryRequest, tranId, emptranId, headertranId);
	}
	
	@PostMapping("/updateMedExFeeDtl/{tranId}")
	public String updateMedExFeeDtl(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable Integer tranId) {
		return feeDtlService.updateMedExFeeDtl(proposalEntryRequest, tranId);
	}
	
	@PostMapping("/deleteMedDtl/{tranId}")
	public String deleteMedicalDetails(@PathVariable Integer tranId) {
		return feeDtlService.deleteMedicalDetails(tranId);
	}
	
	@GetMapping("/getMedDtl")
	public String getMedicalDetails(@RequestParam Integer tranId) {
		try {
		return feeDtlService.getMedicalDetails(tranId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
