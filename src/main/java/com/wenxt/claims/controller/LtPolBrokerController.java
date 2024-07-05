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

@RestController
@RequestMapping("/polBroker")
public class LtPolBrokerController {
	
	@Autowired
	private LtPolBrokerService polBrokerService;
	
	@PostMapping("/save")
	public String createPolBroketr(@RequestBody ProposalEntryRequest proposalEntryRequest) {
		return polBrokerService.createPolBroker(proposalEntryRequest);
	}
	
	@PostMapping("/polBrokerUpdate/{polBrokerId}")
	public String updatePolBroker(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable Integer polBrokerId) {
		return polBrokerService.updatePolBroker(proposalEntryRequest, polBrokerId);
	}
	
	@PostMapping("/deletePolBroker/{polBrokerId}")
	public String deletePolBroker(@PathVariable Integer polBrokerId) {
		return polBrokerService.deletePolBrokerById(polBrokerId);
	}
	
	@PostMapping("/getPolBrokerByid")
	public String getPolBrokerById(@RequestParam Integer polBrokerId) {
		try {
		return polBrokerService.getPolBrokerById(polBrokerId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
