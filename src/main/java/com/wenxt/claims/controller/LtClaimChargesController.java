package com.wenxt.claims.controller;

import java.sql.SQLException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.LT_CLAIM_CHARGES;
import com.wenxt.claims.service.LtClaimChargesService;

@RestController
@RequestMapping("/claimchrgs")
public class LtClaimChargesController {
	
	@Autowired
	private LtClaimChargesService claimchrgstservice;

	@PostMapping("/claimchrgs_creates")
	public String createClaimCharges(@RequestBody LT_CLAIM_CHARGES ltclaimChrgs) {
		return claimchrgstservice.createClaimCharges(ltclaimChrgs);
	}

//	@GetMapping("/claimchrgs_List")
//	public String getAllClaimChargeslist() throws JSONException, SQLException {
//		return claimchrgstservice.getAllClaimChargeslist();
//	}

	@GetMapping("getclaimchrgsByid/{cc_TRAN_id}")
	public String getClaimChargesById(@PathVariable Long cc_TRAN_id) {
		return claimchrgstservice.getClaimChargesById(cc_TRAN_id);

	}

	@DeleteMapping("/deleteclaimchrgsByid/{cc_TRAN_id}")
	public String deleteClaimChargesByid(@PathVariable Long cc_TRAN_id) {
		return claimchrgstservice.deleteClaimChargesByid(cc_TRAN_id);
	}

}
