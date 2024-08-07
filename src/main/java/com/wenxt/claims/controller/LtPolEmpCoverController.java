package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.service.PolEmpCoverService;

@RestController
@RequestMapping("/polEmpCover")
public class LtPolEmpCoverController {
	
	@Autowired
	private PolEmpCoverService polEmpCoverService;
	
	@PostMapping("/save/{tranId}/{emptranId}")
	public String createPolEmpCover(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable("tranId") Integer tranId, @PathVariable("emptranId")
			 Integer emptranId) {
		return polEmpCoverService.createPolEmpCover(proposalEntryRequest, tranId, emptranId);
	}
	
	@PostMapping("/polEmpCoverUpdate/{polEmpCoverId}")
	public String updatePolEmpCover(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable("polEmpCoverId") Integer polEmpCoverId) {
		return polEmpCoverService.updatePolEmpCover(proposalEntryRequest, polEmpCoverId);
	}
	
	@PostMapping("/deletePolEmpCover/{polEmpCoverId}")
	public String deletePolEmpCover(@PathVariable("polEmpCoverId") Integer polEmpCoverId) {
		return polEmpCoverService.deletePolEmpCoverById(polEmpCoverId);
	}
	
	@PostMapping("/getPolEmpCoverByid")
	public String getPolEmpCoverByid(@RequestParam("polEmpCoverId") Integer polEmpCoverId) {
		try {
		return polEmpCoverService.getPolEmpCoverByid(polEmpCoverId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
