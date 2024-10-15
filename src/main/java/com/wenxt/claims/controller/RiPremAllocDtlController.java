package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.RIRequestDTO;
import com.wenxt.claims.service.RiPremAllocDtlService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/riPremAllocDtl")
public class RiPremAllocDtlController {
	
	@Autowired
	private RiPremAllocDtlService premAllocDtlService;
	
	@PostMapping("/save")
	public String save(@RequestBody RIRequestDTO riRequest, HttpServletRequest request) {
		return premAllocDtlService.save(riRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody RIRequestDTO riRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return premAllocDtlService.update(riRequest, tranId, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Integer tranId, HttpServletRequest request) {
		return premAllocDtlService.delete(tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId, HttpServletRequest request) {
		return premAllocDtlService.get(tranId, request);
	}

}
