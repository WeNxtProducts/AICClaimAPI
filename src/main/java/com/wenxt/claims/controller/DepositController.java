package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ReceiptRequest;
import com.wenxt.claims.service.DepositService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/deposit")
public class DepositController {
	
	@Autowired
	private DepositService depositService;
	
	@PostMapping("/save")
	public String save(@RequestBody ReceiptRequest receiptRequest, HttpServletRequest request) {
		return depositService.save(receiptRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody ReceiptRequest receiptRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return depositService.update(receiptRequest, tranId, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Integer tranId, HttpServletRequest request) {
		return depositService.delete(tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId, HttpServletRequest request) {
		try {
			return depositService.get(tranId, request);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
