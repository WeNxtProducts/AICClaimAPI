package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.PolicyRequest;
import com.wenxt.claims.model.ProductMasterRequest;
import com.wenxt.claims.service.SummaryService;
import com.wenxt.claims.service.TaxSlabRateService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/summary")
public class SummaryController {
	
	@Autowired
	private SummaryService suummaryService;
	
	@PostMapping("/save")
	public String save(@RequestBody PolicyRequest policyRequest, HttpServletRequest request) {
		return suummaryService.save(policyRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody PolicyRequest policyRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return suummaryService.update(policyRequest, tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId) {
		return suummaryService.get(tranId);
	}

}
