package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProcessingRequest;
import com.wenxt.claims.service.WithdrawProHdrService;
import com.wenxt.claims.service.YearEndProcessHdrService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/wdraProHdr")
public class WithdrawProHeaderController {
	
	@Autowired
	private WithdrawProHdrService wdraProHdrService;
	
	@PostMapping("/save")
	public String save(@RequestBody ProcessingRequest processingRequest, HttpServletRequest request) {
		return wdraProHdrService.save(processingRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody ProcessingRequest processingRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return wdraProHdrService.update(processingRequest, tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId) {
		return wdraProHdrService.get(tranId);
	}

}
