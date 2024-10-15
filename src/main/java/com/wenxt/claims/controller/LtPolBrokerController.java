package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	
	@PostMapping("/polBrokerUpdate/{polBrokerId}")
	public String updatePolBroker(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable Integer polBrokerId) {
		return polBrokerService.updatePolBroker(proposalEntryRequest, polBrokerId);
	}
	
	@PostMapping("/delete/{polBrokerId}/{parentId}")
	public String deletePolBroker(@PathVariable Integer polBrokerId, @PathVariable Integer parentId) {
		return polBrokerService.deletePolBrokerById(polBrokerId, parentId);
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
