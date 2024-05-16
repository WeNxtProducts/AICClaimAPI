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

import com.wenxt.claims.model.LT_CLAIM_ESTIMATE;
import com.wenxt.claims.service.LtClaimEstimateService;

@RestController
@RequestMapping("/claimest")
public class LtClaimEstimateController {
	
	@Autowired
	private LtClaimEstimateService claimestservice;

	@PostMapping("/claimest_creates")
	public String createLtClaimEst(@RequestBody LT_CLAIM_ESTIMATE ltclaimest) {
		return claimestservice.createLtClaimEst(ltclaimest);
	}

//	@GetMapping("/claimest_List")
//	public String getAllLtClaimEstlist() throws JSONException, SQLException {
//		return claimestservice.getAllLtClaimEstlist();
//	}

	@GetMapping("getclaimestByid/{ce_TRAN_id}")
	public String getLtClaimEstById(@PathVariable Long ce_TRAN_id) {
		return claimestservice.getLtClaimEstById(ce_TRAN_id);

	}

	@DeleteMapping("/deleteclaimestByid/{ce_TRAN_id}")
	public String deleteLtClaimEstByid(@PathVariable Long ce_TRAN_id) {
		return claimestservice.deleteLtClaimEstByid(ce_TRAN_id);
	}


	
	

}
