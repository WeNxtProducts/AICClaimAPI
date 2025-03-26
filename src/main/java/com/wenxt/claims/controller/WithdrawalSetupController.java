package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProductMasterRequest;
import com.wenxt.claims.service.ProdMasterService;
import com.wenxt.claims.service.WithdrawalSetupService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/wdrasetup")
public class WithdrawalSetupController {
	
	@Autowired
	private WithdrawalSetupService wdraSetupService;
	
	@PostMapping("/save/{productId}")
	public String save(@RequestBody ProductMasterRequest prodMasterRequest, @PathVariable String productId, HttpServletRequest request) {
		return wdraSetupService.save(prodMasterRequest, productId, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody ProductMasterRequest prodMasterRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return wdraSetupService.update(prodMasterRequest, tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId) {
		return wdraSetupService.get(tranId);
	}

}
