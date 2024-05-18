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
import com.wenxt.claims.service.LtClaimCoverDtlsService;

@RestController
@RequestMapping("/ccdtls")
public class LtClaimCoverDtlsController {
	
	@Autowired
	private LtClaimCoverDtlsService ccdtlservice;
	
	@PostMapping("/claimCoverSave")
	public String createCcdtls(@RequestBody ClaimsRequestDTO claimRequestDTO) {
		return ccdtlservice.createCcdtls(claimRequestDTO);
	}

//	@GetMapping("/ccdtls_List")
//	public String getAllCcdtlslist() throws JSONException, SQLException {
//		return ccdtlservice.getAllCcdtlslist();
//	}

	@GetMapping("getccdtlsByid/{ccd_TRAN_id}")
	public String getCcdtlsById(@PathVariable Long ccd_TRAN_id) {
		return ccdtlservice.getCcdtlsById(ccd_TRAN_id);

	}

	@DeleteMapping("/deletesccdtlsByid/{ccd_TRAN_id}")
	public String deleteCcdtlsByid(@PathVariable Long ccd_TRAN_id) {
		return ccdtlservice.deleteCcdtlsByid(ccd_TRAN_id);
	}

}
