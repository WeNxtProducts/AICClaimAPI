package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ReceiptRequest;
import com.wenxt.claims.model.SearchRequestDTO;
import com.wenxt.claims.service.ReceiptHeaderService;

import co.elastic.clients.elasticsearch.core.SearchRequest;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/receiptHdr")
public class ReceiptHeaderController {
	
	@Autowired
	private ReceiptHeaderService receiptHeaderService;
	
	@PostMapping("/save")
	public String saveReceiptHeader(@RequestBody ReceiptRequest receiptRequest, HttpServletRequest request) {
		return receiptHeaderService.save(receiptRequest, request);
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
	
	@PostMapping("/search")
	public String searchReceiptHeader(@RequestBody SearchRequestDTO searchRequest, HttpServletRequest request) {
		try {
			return receiptHeaderService.searchReceiptHeader(searchRequest, request);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}

