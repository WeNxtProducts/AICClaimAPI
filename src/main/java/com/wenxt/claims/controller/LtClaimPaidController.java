package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.service.LtClaimPaidService;

@RestController
@RequestMapping("/claimPaid")
public class LtClaimPaidController {
	
	@Autowired
	private LtClaimPaidService claimPaidService;
	
	@PostMapping("/save/{cp_id}")
	public String updateClaimPaid(@RequestBody ClaimsRequestDTO claimsRequestDTO, @PathVariable Integer cp_id) {
		return claimPaidService.saveClaimPaid(claimsRequestDTO, cp_id);
	}

}
