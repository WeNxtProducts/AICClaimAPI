package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.LTQuickQuoteRequest;
import com.wenxt.claims.service.LTQuickQuoteBrokerHeaderService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/qqBrokerHeader")
public class LTQuickQuoteBrokerHeaderController {
	
	@Autowired
	private LTQuickQuoteBrokerHeaderService quickQuoteBrokerHeaderService;
	
	@PostMapping("/save")
	public String save(@RequestBody LTQuickQuoteRequest quickQuoteRequest, HttpServletRequest request) {
		return quickQuoteBrokerHeaderService.save(quickQuoteRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody LTQuickQuoteRequest quickQuoteRequest, @PathVariable Long tranId, HttpServletRequest request) {
		return quickQuoteBrokerHeaderService.update(quickQuoteRequest, tranId, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Long tranId, HttpServletRequest request) {
		return quickQuoteBrokerHeaderService.delete(tranId, request);
	}
	
	@PostMapping("/get")
	public String get() {
		return quickQuoteBrokerHeaderService.get();
	}

}
