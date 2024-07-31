package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ReceiptRequest;
import com.wenxt.claims.service.ReceiptProcessService;

@RestController
@RequestMapping("/receiptProcess")
public class ReceiptProcessController {
	
	@Autowired
	private ReceiptProcessService receiptProcessService;
	
	@PostMapping("/save")
	public String saveReceiptProcess(@RequestBody ReceiptRequest receiptRequest) {
		return receiptProcessService.save(receiptRequest);
	}
	
	@PostMapping("/update/{tranId}")
	public String updateReceiptProcess(@RequestBody ReceiptRequest receiptRequest, @PathVariable Integer tranId) {
		return receiptProcessService.update(receiptRequest, tranId);
	}
	
	@PostMapping("/delete/{tranId}")
	public String deleteReceiptProcess(@PathVariable Integer tranId) {
		return receiptProcessService.delete(tranId);
	}
	
	@PostMapping("/get")
	public String getReceiptProcess(@RequestParam Integer tranId) {
		try {
			return receiptProcessService.get(tranId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}

