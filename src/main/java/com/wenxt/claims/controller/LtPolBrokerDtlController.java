package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.BrokerRequest;
import com.wenxt.claims.service.BrokerDtlService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/polBrokerDtl")
public class LtPolBrokerDtlController {
	
	@Autowired
	private BrokerDtlService brokerDtlService;
	
	@PostMapping("/save")
	public String save(@RequestBody BrokerRequest brokerRequest, HttpServletRequest request) {
		return brokerDtlService.save(brokerRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody BrokerRequest brokerRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return brokerDtlService.update(brokerRequest, tranId, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Integer tranId, HttpServletRequest request) {
		return brokerDtlService.delete(tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId, HttpServletRequest request) {
		try {
		return brokerDtlService.get(tranId, request);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
