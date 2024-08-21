package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ReceiptRequest;
import com.wenxt.claims.service.InstallHdrService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/installHdr")
public class InstallHdrController {
	
	@Autowired
	private InstallHdrService installHdrService;
	
	@PostMapping("/save")
	public String saveInstallHdr(@RequestBody ReceiptRequest receiptRequest, HttpServletRequest request) {
		return installHdrService.save(receiptRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String updateInstallHdr(@RequestBody ReceiptRequest receiptRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return installHdrService.update(receiptRequest, tranId, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String deleteInstallHdr(@PathVariable Integer tranId) {
		return installHdrService.delete(tranId);
	}
	
	@PostMapping("/get")
	public String getInstallHdr(@RequestParam Integer tranId) {
		try {
		return installHdrService.get(tranId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
