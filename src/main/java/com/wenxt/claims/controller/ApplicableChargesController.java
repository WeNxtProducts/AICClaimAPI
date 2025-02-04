package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProductMasterRequest;
import com.wenxt.claims.service.ApplicableChargeService;
import com.wenxt.claims.service.WithdrawalSetupService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/applCharges")
public class ApplicableChargesController {
	
	@Autowired
	private ApplicableChargeService applChargeService;
	
	@PostMapping("/save")
	public String save(@RequestBody ProductMasterRequest prodMasterRequest, HttpServletRequest request) {
		return applChargeService.save(prodMasterRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody ProductMasterRequest prodMasterRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return applChargeService.update(prodMasterRequest, tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId) {
		return applChargeService.get(tranId);
	}

}
