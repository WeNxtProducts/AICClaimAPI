package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ClaimRequestDTO;
import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.service.LtClaimService;

import jakarta.servlet.http.HttpServletRequest;
import oracle.jdbc.proxy.annotation.Post;

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
		return ltclaimservice.deleteLtClaimByid(claim_TRAN_id);
	}
	
	@PostMapping("/claimSave")
	public String createLtClaim(@RequestBody ClaimRequestDTO claimsRequestDTO, HttpServletRequest request) {
		return ltclaimservice.createLtClaim(claimsRequestDTO, request);
	}
	
	@PostMapping("/claimUpdate/{claim_id}")
	public String updateLtClaim(@RequestBody ClaimsRequestDTO claimsRequestDTO, @PathVariable Integer claim_id) {
		return ltclaimservice.updateLtClaim(claimsRequestDTO, claim_id);
	}
	
	@GetMapping("/getListOfPolicies")
	public String getListOfPolicies(@RequestParam Integer sysId) {
		return ltclaimservice.getListOfPolicies(sysId);
	}
	
	@GetMapping("/getClaimHeader/{tranId}")
	public String getClaimHeader(@PathVariable Integer tranId) {
		try {
		return ltclaimservice.getClaimHeader(tranId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	@PostMapping("/getClaimHistory")
	public String getClaimHistory(@RequestParam Integer tranId, HttpServletRequest request) {
		try {
		return ltclaimservice.getClaimHistory(tranId, request);
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	@PostMapping("/claimDeductionsave")
	public String claimDeductionsave(@RequestParam String CD_WAIVE_PREM_INT, @RequestParam String CD_WAIVE_LOAN_INT, @RequestParam Integer tranId) {
		try {
		return ltclaimservice.claimDeductionsave(CD_WAIVE_PREM_INT, CD_WAIVE_LOAN_INT, tranId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	@GetMapping("/claimHdrGet")
	public String getClaimHdrDetails(@RequestParam Integer tranId) {
		try {
			return ltclaimservice.getClaimHdrDetails(tranId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	@PostMapping("/claimHdrDelete")
	public String deleteClaimHdrDetails(@RequestParam Integer tranId) {
		try {
			return ltclaimservice.deleteClaimHdrDetails(tranId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	@PostMapping("/saveClaimFlagDetails")
	public String saveClaimFlagDetails(@RequestParam Integer tranId, @RequestParam String CLM_STATUS, @RequestParam String CLM_STATUS_CODE, @RequestParam String FreezeFlag) {
		return ltclaimservice.saveClaimFlagDetails(tranId, CLM_STATUS, CLM_STATUS_CODE, FreezeFlag);
	}	
}
