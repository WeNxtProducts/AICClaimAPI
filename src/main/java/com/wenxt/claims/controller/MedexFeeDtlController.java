package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.service.MedExFeeDtlService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/medexFeeDtl")
public class MedexFeeDtlController {
	
	@Autowired
	private MedExFeeDtlService feeDtlService;
	
	@PostMapping("/save/{tranId}/{emptranId}/{mhtranId}")
	public String saveMedExFeeDtl(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable("tranId") Integer tranId, 
			@PathVariable("emptranId") Integer emptranId, @PathVariable("mhtranId") Integer mhtranId, HttpServletRequest request) {
		return feeDtlService.saveMedExFeeDtl(proposalEntryRequest, tranId, emptranId, mhtranId, request);
	}
	
	@PostMapping("/updateMedExFeeDtl/{tranId}")
	public String updateMedExFeeDtl(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable("tranId") Integer tranId) {
		return feeDtlService.updateMedExFeeDtl(proposalEntryRequest, tranId);
	}
	
	@PostMapping("/deleteMedDtl/{tranId}")
	public String deleteMedicalDetails(@PathVariable("tranId") Integer tranId) {
		return feeDtlService.deleteMedicalDetails(tranId);
	}
	
	@PostMapping("/getMedDtl")
	public String getMedicalDetails(@RequestParam("tranId") Integer tranId) {
		try {
		return feeDtlService.getMedicalDetails(tranId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
