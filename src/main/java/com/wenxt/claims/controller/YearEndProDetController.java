package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProcessingRequest;
import com.wenxt.claims.service.YearEndProDetService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/yearEndProDet")
public class YearEndProDetController {
	
	@Autowired
	private YearEndProDetService yrEndProDetService;
	
	@PostMapping("/save")
	public String save(@RequestBody ProcessingRequest processingRequest, HttpServletRequest request) {
		return yrEndProDetService.save(processingRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody ProcessingRequest processingRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return yrEndProDetService.update(processingRequest, tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId) {
		return yrEndProDetService.get(tranId);
	}

}
