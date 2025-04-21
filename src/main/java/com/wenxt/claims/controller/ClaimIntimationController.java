package com.wenxt.claims.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.QuickQuoteRequest;
import com.wenxt.claims.service.ClaimIntimationService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/claimIntimation")
public class ClaimIntimationController {
	
	private ClaimIntimationService claimIntimationService;
	
	@PostMapping("/save")
	public String save(@RequestBody QuickQuoteRequest quickQuoteRequest, HttpServletRequest request) {
		return claimIntimationService.save(quickQuoteRequest.getClaimIntimation(), request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody QuickQuoteRequest quickQuoteRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return claimIntimationService.update(quickQuoteRequest, tranId, request);
	}
	
	@PostMapping("/get")
	public String get() {
		return claimIntimationService.get();
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Integer tranId, HttpServletRequest request) {
		return claimIntimationService.delete(tranId, request);
	}

}
