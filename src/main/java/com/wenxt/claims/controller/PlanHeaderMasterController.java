package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.PlanMasterRequest;
import com.wenxt.claims.model.ProductMasterRequest;
import com.wenxt.claims.service.PlanHeaderMasterService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/planHeaderMaster")
public class PlanHeaderMasterController {
	
	@Autowired
	private PlanHeaderMasterService planHeaderMasterService;
	
	@PostMapping("/save")
	public String save(@RequestBody PlanMasterRequest planMasterRequest, HttpServletRequest request) {
		return planHeaderMasterService.save(planMasterRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody PlanMasterRequest planMasterRequest, @PathVariable Long tranId, HttpServletRequest request) {
		return planHeaderMasterService.update(planMasterRequest, tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Long tranId) {
		return planHeaderMasterService.get(tranId);
	}

}
