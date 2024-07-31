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
	
	@PostMapping("/save/{tranId}")
	public String createPolBroketr(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable("tranId") Integer tranId) {
		return polDiscLoadService.createPolDiscLoad(proposalEntryRequest, tranId);
	}
	
	@PostMapping("/polDiscLoadUpdate/{polDiscLoadId}")
	public String updatePolDiscLoad(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable("polDiscLoadId") Integer polDiscLoadId) {
		return polDiscLoadService.updatePolDiscLoad(proposalEntryRequest, polDiscLoadId);
	}
	
	@PostMapping("/deletePolBroker/{polDiscLoadId}")
	public String deletePolDiscLoad(@PathVariable("polDiscLoadId") Integer polDiscLoadId) {
		return polDiscLoadService.deletePolDiscLoadById(polDiscLoadId);
	}
	
	@PostMapping("/getPolDiscLoadByid")
	public String getPolDiscLoadByid(@RequestParam("polDiscLoadId") Integer polDiscLoadId) {
		try {
		return polDiscLoadService.getPolDiscLoadByid(polDiscLoadId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
