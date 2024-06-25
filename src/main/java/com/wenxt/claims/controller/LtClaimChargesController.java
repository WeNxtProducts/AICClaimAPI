package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.service.LtClaimChargesService;

@RestController
@RequestMapping("/claimchrgs")
public class LtClaimChargesController {
	
	@Autowired
	private LtClaimChargesService claimchrgstservice;

	@PostMapping("/claimChrgsSave/{tranId}")
	public String createClaimCharges(@RequestBody ClaimsRequestDTO claimsRequestDTO, @PathVariable Integer tranId) {
		return claimchrgstservice.createClaimCharges(claimsRequestDTO, tranId);
	}

//	@GetMapping("/claimchrgs_List")
//	public String getAllClaimChargeslist() throws JSONException, SQLException {
//		return claimchrgstservice.getAllClaimChargeslist();
//	}

	@PostMapping("/getclaimchrgsByid")
	public String getClaimChargesById(@RequestParam Integer cc_TRAN_id) {
		try {
		return claimchrgstservice.getClaimChargesById(cc_TRAN_id);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

	@PostMapping("/deleteclaimchrgsByid/{cc_TRAN_id}")
	public String deleteClaimChargesByid(@PathVariable Integer cc_TRAN_id) {
		return claimchrgstservice.deleteClaimChargesByid(cc_TRAN_id);
	}
	
	@PostMapping("/updateClaimCharges/{cc_TRAN_id}")
	public String updateClaimChargesByid(@PathVariable Integer cc_TRAN_id, @RequestBody ClaimsRequestDTO claimsRequestDTO) {
		return claimchrgstservice.updateLtClaimCharges(claimsRequestDTO, cc_TRAN_id);
	}

}
