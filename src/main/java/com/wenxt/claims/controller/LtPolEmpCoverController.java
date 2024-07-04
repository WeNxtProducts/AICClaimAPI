package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.service.LtPolEmployeeService;
import com.wenxt.claims.service.PolEmpCoverService;

@RestController
@RequestMapping("/polEmpCover")
public class LtPolEmpCoverController {
	
	@Autowired
	private PolEmpCoverService polEmpCoverService;
	
	@PostMapping("/save")
	public String createPolEmpCover(@RequestBody ProposalEntryRequest proposalEntryRequest) {
		return polEmpCoverService.createPolEmpCover(proposalEntryRequest);
	}
	
	@PostMapping("/polEmpCoverUpdate/{polEmpCoverId}")
	public String updatePolEmpCover(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable Integer polEmpCoverId) {
		return polEmpCoverService.updatePolEmpCover(proposalEntryRequest, polEmpCoverId);
	}
	
	@PostMapping("/deletePolEmpCover/{polEmpCoverId}")
	public String deletePolEmpCover(@PathVariable Integer polEmpCoverId) {
		return polEmpCoverService.deletePolEmpCoverById(polEmpCoverId);
	}

}
