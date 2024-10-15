package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.RIRequestDTO;
import com.wenxt.claims.service.RiPremAllocHeadService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/riPremAllocHead")
public class RiPremAllocHeadController {
	
	@Autowired
	private RiPremAllocHeadService riPremAllocHeadService;
	
	@PostMapping("/save")
	public String save(@RequestBody RIRequestDTO riRequestDTO, HttpServletRequest request) {
		return riPremAllocHeadService.save(riRequestDTO, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody RIRequestDTO riRequestDTO, @PathVariable Integer tranId, HttpServletRequest request) {
		return riPremAllocHeadService.update(riRequestDTO, tranId, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Integer tranId, HttpServletRequest request) {
		return riPremAllocHeadService.delete(tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId, HttpServletRequest request) {
		return riPremAllocHeadService.get(tranId, request);
	}

}
