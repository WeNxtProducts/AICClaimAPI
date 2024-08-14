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

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/polEmpCover")
public class LtPolEmpCoverController {
	
	@Autowired
	private PolEmpCoverService polEmpCoverService;
	
	@PostMapping("/save/{tranId}/{emptranId}")
	public String createPolEmpCover(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable("tranId") Integer tranId, @PathVariable("emptranId")
			 Integer emptranId, HttpServletRequest request) {
		return polEmpCoverService.createPolEmpCover(proposalEntryRequest, tranId, emptranId, request);
	}
	
	@PostMapping("/polEmpCoverUpdate/{polEmpCoverId}")
	public String updatePolEmpCover(@RequestBody ProposalEntryRequest proposalEntryRequest, @PathVariable("polEmpCoverId") Integer polEmpCoverId, HttpServletRequest request) {
		return polEmpCoverService.updatePolEmpCover(proposalEntryRequest, polEmpCoverId, request);
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
