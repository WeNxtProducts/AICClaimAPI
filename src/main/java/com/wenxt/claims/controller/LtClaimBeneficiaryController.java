package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.service.LtClaimBeneficiaryService;

@RestController
@RequestMapping("claimBfcry")
public class LtClaimBeneficiaryController {

	@Autowired
	private LtClaimBeneficiaryService claimBfcryservice;

	@PostMapping("/claimBfcry_creates/{tranId}")
	public String createLtClaimBfcry(@RequestBody ClaimsRequestDTO claimsRequestDTO, @PathVariable Integer tranId) {
		return claimBfcryservice.createLtClaimBfcry(claimsRequestDTO, tranId);
	}
//
//	@GetMapping("/claimBfcry_List")
//	public String getAllLtClaimBfcrylist() throws JSONException, SQLException {
//		return claimBfcryservice.getAllLtClaimBfcrylist();
//	}

	@PostMapping("getltclaimBfcryByid")
	public String getLtClaimBfcryById(@RequestParam Integer cben_pben_TRAN_id) {
		try {
			return claimBfcryservice.getLtClaimBfcryById(cben_pben_TRAN_id);
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@PostMapping("/deletesclaimBfcryByid/{cben_pben_TRAN_id}")
	public String deleteLtClaimBfcryByid(@PathVariable Integer cben_pben_TRAN_id) {
		return claimBfcryservice.deleteLtClaimBfcryByid(cben_pben_TRAN_id);
	}

	@PostMapping("/updateLtClaimBeneficiary/{claimBenId}")
	public String updateLtClaimBeneficiary(@RequestBody ClaimsRequestDTO claimsRequestDTO,
			@PathVariable Integer claimBenId) {
		return claimBfcryservice.updateLtClaimBeneficiary(claimsRequestDTO, claimBenId);
	}

}
