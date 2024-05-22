package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.service.LtClaimEstimateService;

import oracle.jdbc.proxy.annotation.Post;

@RestController
@RequestMapping("/claimest")
public class LtClaimEstimateController {
	
	@Autowired
	private LtClaimEstimateService claimestservice;

	@PostMapping("/claimEstSave")
	public String createLtClaimEst(@RequestBody ClaimsRequestDTO claimsRequestDTO) {
		return claimestservice.createLtClaimEst(claimsRequestDTO);
	}

//	@GetMapping("/claimest_List")
//	public String getAllLtClaimEstlist() throws JSONException, SQLException {
//		return claimestservice.getAllLtClaimEstlist();
//	}

	@GetMapping("getclaimestByid/{ce_TRAN_id}")
	public String getLtClaimEstById(@PathVariable Integer ce_TRAN_id) {
		return claimestservice.getLtClaimEstById(ce_TRAN_id);

	}

	@DeleteMapping("/deleteclaimestByid/{ce_TRAN_id}")
	public String deleteLtClaimEstByid(@PathVariable Integer ce_TRAN_id) {
		return claimestservice.deleteLtClaimEstByid(ce_TRAN_id);
	}

	@PostMapping("/uupdateLtClaimEstimate/{ClaimestID}")
	public String updateLtClaimEstimate(@RequestBody ClaimsRequestDTO claimsRequestDTO, @PathVariable Integer ClaimestID) {
		return claimestservice.updateLtClaimEstimate(claimsRequestDTO, ClaimestID);
	}
	
	

}
