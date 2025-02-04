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

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/ProdMaster")
public class ProdMasterController {
	
	@Autowired
	private ProdMasterService prodMasterService;
	
	@PostMapping("/save")
	public String save(@RequestBody ProductMasterRequest prodMasterRequest, HttpServletRequest request) {
		return prodMasterService.save(prodMasterRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody ProductMasterRequest prodMasterRequest, @PathVariable String tranId, HttpServletRequest request) {
		return prodMasterService.update(prodMasterRequest, tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam String tranId) {
		return prodMasterService.get(tranId);
	}

}
