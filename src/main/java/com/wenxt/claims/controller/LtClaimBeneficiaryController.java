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

import com.wenxt.claims.model.LT_CLAIM_BENEFICIARY;
import com.wenxt.claims.service.LtClaimBeneficiaryService;

@RestController
@RequestMapping("claimBfcry")
public class LtClaimBeneficiaryController {

	@Autowired
	private LtClaimBeneficiaryService claimBfcryservice;

	@PostMapping("/claimBfcry_creates")
	public String createLtClaimBfcry(@RequestBody LT_CLAIM_BENEFICIARY ltclaimBfcry) {
		return claimBfcryservice.createLtClaimBfcry(ltclaimBfcry);
	}
//
//	@GetMapping("/claimBfcry_List")
//	public String getAllLtClaimBfcrylist() throws JSONException, SQLException {
//		return claimBfcryservice.getAllLtClaimBfcrylist();
//	}

	@GetMapping("getltclaimBfcryByid/{cben_pben_TRAN_id}")
	public String getLtClaimBfcryById(@PathVariable Long cben_pben_TRAN_id) {
		return claimBfcryservice.getLtClaimBfcryById(cben_pben_TRAN_id);

	}

	@DeleteMapping("/deletesclaimBfcryByid/{cben_pben_TRAN_id}")
	public String deleteLtClaimBfcryByid(@PathVariable Long cben_pben_TRAN_id) {
		return claimBfcryservice.deleteLtClaimBfcryByid(cben_pben_TRAN_id);
	}

}
