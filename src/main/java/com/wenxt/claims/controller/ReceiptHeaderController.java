package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ReceiptRequest;
import com.wenxt.claims.service.ReceiptHeaderService;

@RestController
@RequestMapping("/receiptHdr")
public class ReceiptHeaderController {
	
	@Autowired
	private ReceiptHeaderService receiptHeaderService;
	
	@PostMapping("/save")
	public String saveReceiptHeader(@RequestBody ReceiptRequest receiptRequest) {
		return receiptHeaderService.save(receiptRequest);
	}
	
	@PostMapping("/update/{tranId}")
	public String updateReceiptHeader(@RequestBody ReceiptRequest receiptRequest, @PathVariable Integer tranId) {
		return receiptHeaderService.update(receiptRequest, tranId);
	}
	
	@PostMapping("/delete/{tranId}")
	public String deleteReceiptHeader(@PathVariable Integer tranId) {
		return receiptHeaderService.delete(tranId);
	}
	
	@PostMapping("/get")
	public String getReceiptHeader(@RequestParam Integer tranId) {
		try {
		return receiptHeaderService.get(tranId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}

