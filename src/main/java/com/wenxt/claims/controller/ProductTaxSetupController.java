package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProductMasterRequest;
import com.wenxt.claims.service.InterestMasterService;
import com.wenxt.claims.service.ProductTaxSetupService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/prodTaxSetup")
public class ProductTaxSetupController {
	
	@Autowired
	private ProductTaxSetupService prodTaxSetupService;
	
	@PostMapping("/save")
	public String save(@RequestBody ProductMasterRequest prodMasterRequest, HttpServletRequest request) {
		return prodTaxSetupService.save(prodMasterRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody ProductMasterRequest prodMasterRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return prodTaxSetupService.update(prodMasterRequest, tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId) {
		return prodTaxSetupService.get(tranId);
	}

}
