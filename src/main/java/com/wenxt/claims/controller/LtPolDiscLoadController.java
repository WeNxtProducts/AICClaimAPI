package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.service.LtPolDiscLoadService;

@RestController
@RequestMapping("/polDiscLoad")
public class LtPolDiscLoadController {
	
	@Autowired
	private LtPolDiscLoadService polDiscLoadService;
	
	@PostMapping("/save")
	public String createPolBroketr(@RequestBody ProposalEntryRequest proposalEntryRequest) {
		return polDiscLoadService.createPolDiscLoad(proposalEntryRequest);
	}
	
	@PostMapping("/polDiscLoadUpdate/{polDiscLoadId}")
	public String updatePolDiscLoad(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable Integer polDiscLoadId) {
		return polDiscLoadService.updatePolDiscLoad(proposalEntryRequest, polDiscLoadId);
	}
	
	@PostMapping("/deletePolBroker/{polDiscLoadId}")
	public String deletePolDiscLoad(@PathVariable Integer polDiscLoadId) {
		return polDiscLoadService.deletePolDiscLoadById(polDiscLoadId);
	}
	
	@PostMapping("/getPolDiscLoadByid")
	public String getPolDiscLoadByid(@RequestParam Integer polDiscLoadId) {
		try {
		return polDiscLoadService.getPolDiscLoadByid(polDiscLoadId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
