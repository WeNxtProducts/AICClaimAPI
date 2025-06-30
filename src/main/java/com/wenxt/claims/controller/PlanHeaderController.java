package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.PlanMasterRequest;
import com.wenxt.claims.service.PlanHeaderService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/polHeader")
public class PlanHeaderController {
	
	@Autowired
	private PlanHeaderService planHeaderService;
	
	@PostMapping("/save")
	public String save(@RequestBody PlanMasterRequest planMasterRequest, HttpServletRequest request) {
		return planHeaderService.save(planMasterRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody PlanMasterRequest planMasterRequest, @PathVariable Long tranId, HttpServletRequest request) {
		return planHeaderService.update(planMasterRequest, tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Long tranId) {
		return planHeaderService.get(tranId);
	}

}
