package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.PlanMasterRequest;
import com.wenxt.claims.service.PlanDetailMasterService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/planDetailMaster")
public class PlanDetailMasterController {
	
	@Autowired
	private PlanDetailMasterService planDetailMasterService;
	
	@PostMapping("/save")
	public String save(@RequestBody PlanMasterRequest planMasterRequest, HttpServletRequest request) {
		return planDetailMasterService.save(planMasterRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody PlanMasterRequest planMasterRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return planDetailMasterService.update(planMasterRequest, tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId) {
		try {
		return planDetailMasterService.get(tranId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
