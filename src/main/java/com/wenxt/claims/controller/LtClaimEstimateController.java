package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.service.LtClaimEstimateService;

@RestController
@RequestMapping("/claimest")
public class LtClaimEstimateController {
	
	@Autowired
	private LtClaimEstimateService claimestservice;

	@PostMapping("/claimEstSave/{tranId}")
	public String createLtClaimEst(@RequestBody ClaimsRequestDTO claimsRequestDTO, @PathVariable Integer tranId) {
		return claimestservice.createLtClaimEst(claimsRequestDTO, tranId);
	}

//	@GetMapping("/claimest_List")
//	public String getAllLtClaimEstlist() throws JSONException, SQLException {
//		return claimestservice.getAllLtClaimEstlist();
//	}

	@PostMapping("getclaimestByid")
	public String getLtClaimEstById(@RequestParam Integer ce_TRAN_id) {
		try {
		return claimestservice.getLtClaimEstById(ce_TRAN_id);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

	@PostMapping("/deleteclaimestByid/{ce_TRAN_id}")
	public String deleteLtClaimEstByid(@PathVariable Integer ce_TRAN_id) {
		return claimestservice.deleteLtClaimEstByid(ce_TRAN_id);
	}

	@PostMapping("/updateLtClaimEstimate/{ClaimestID}")
	public String updateLtClaimEstimate(@RequestBody ClaimsRequestDTO claimsRequestDTO, @PathVariable Integer ClaimestID) {
		return claimestservice.updateLtClaimEstimate(claimsRequestDTO, ClaimestID);
	}
	
	

}
