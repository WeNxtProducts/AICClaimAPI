package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.LTQuickQuoteRequest;
import com.wenxt.claims.service.LTQuickQuoteBrokerDetailService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/qqBrokerDetail")
public class LTQuickQuoteBrokerDetailController {
	
	@Autowired
	private LTQuickQuoteBrokerDetailService quickQuoteBrokerDetailService;
	
	@PostMapping("/save")
	public String save(@RequestBody LTQuickQuoteRequest quickQuoteRequest, HttpServletRequest request) {
		return quickQuoteBrokerDetailService.save(quickQuoteRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody LTQuickQuoteRequest quickQuoteRequest, @PathVariable Long tranId, HttpServletRequest request) {
		return quickQuoteBrokerDetailService.update(quickQuoteRequest, tranId, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Long tranId, HttpServletRequest request) {
		return quickQuoteBrokerDetailService.delete(tranId, request);
	}
	
	@PostMapping("/get")
	public String get() {
		return quickQuoteBrokerDetailService.get();
	}

}
