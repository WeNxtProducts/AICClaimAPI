package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.service.LtClaimService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/ltclaim")
public class LtClaimController {

	@Autowired
	private LtClaimService ltclaimservice;

//	@PostMapping("/ltclaim_creates")
//	public String createLtClaim(@RequestBody LT_CLAIM ltclaim) {
//		return ltclaimservice.createLtClaim(ltclaim);
//	}

//	@GetMapping("/ltclaim_List")
//	public String getAllLtClaimlist() throws JSONException, SQLException {
//		return ltclaimservice.getAllLtClaimlist();
//	}

	@PostMapping("/getltclaimByid")
	public String getLtClaimById(@RequestParam Integer claim_TRAN_id, HttpServletRequest request) {
		try {
		return ltclaimservice.getLtClaimById(claim_TRAN_id, request);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

	@PostMapping("/deleteClaim/{claim_TRAN_id}")
	public String deleteLtClaimByid(@PathVariable Integer claim_TRAN_id) {
		System.out.println("IN");
		return ltclaimservice.deleteLtClaimByid(claim_TRAN_id);
	}
	
	@PostMapping("/claimSave")
	public String createLtClaim(@RequestBody ClaimsRequestDTO claimsRequestDTO) {
		return ltclaimservice.createLtClaim(claimsRequestDTO);
	}
	
	@PostMapping("/claimUpdate/{claim_id}")
	public String updateLtClaim(@RequestBody ClaimsRequestDTO claimsRequestDTO, @PathVariable Integer claim_id) {
		return ltclaimservice.updateLtClaim(claimsRequestDTO, claim_id);
	}

}
