package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.DeleteBrokerRequest;
import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.service.LtPolBrokerService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/polBroker")
public class LtPolBrokerController {
	
	@Autowired
	private LtPolBrokerService polBrokerService;
	
	@PostMapping("/save/{tranId}")
	public String createPolBroketr(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return polBrokerService.createPolBroker(proposalEntryRequest, tranId, request);
	}
	
	@PostMapping("/polBrokerUpdate")
	public String updatePolBroker(@RequestBody ProposalEntryRequest proposalEntryRequest) {
		return polBrokerService.updatePolBroker(proposalEntryRequest);
	}
	
	@PostMapping("/delete")
	public String deletePolBroker(@RequestBody DeleteBrokerRequest deleteBrokerRequest) {
		return polBrokerService.deletePolBrokerById(deleteBrokerRequest);
	}
	
	@PostMapping("/getPolBrokerByid")
	public String getPolBrokerById(@RequestParam Integer tranId, HttpServletRequest request) {
		try {
		return polBrokerService.getPolBrokerById(tranId, request);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
