package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProductMasterRequest;
import com.wenxt.claims.service.TaxSlabSetupService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/taxSlabSetup")
public class TaxSlabSetupController {
	
	@Autowired
	private TaxSlabSetupService taxSlabSetupService;
	
	@PostMapping("/save")
	public String save(@RequestBody ProductMasterRequest prodMasterRequest, HttpServletRequest request) {
		return taxSlabSetupService.save(prodMasterRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody ProductMasterRequest prodMasterRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return taxSlabSetupService.update(prodMasterRequest, tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId) {
		return taxSlabSetupService.get(tranId);
	}

}
