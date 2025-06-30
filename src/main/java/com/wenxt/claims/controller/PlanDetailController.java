package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.PlanMasterRequest;
import com.wenxt.claims.service.PlanDetailService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/planDetail")
public class PlanDetailController {
	
	@Autowired
	private PlanDetailService planDetailService;
	
	@PostMapping("/save")
	public String save(@RequestBody PlanMasterRequest planMasterRequest, HttpServletRequest request) {
		return planDetailService.save(planMasterRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody PlanMasterRequest planMasterRequest, @PathVariable Long tranId, HttpServletRequest request) {
		return planDetailService.update(planMasterRequest, tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Long tranId) {
		return planDetailService.get(tranId);
	}

}
