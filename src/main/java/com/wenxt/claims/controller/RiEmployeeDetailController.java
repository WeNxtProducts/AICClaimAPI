package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.RIRequestDTO;
import com.wenxt.claims.service.RiEmployeeDetailService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/riEmpDtl")
public class RiEmployeeDetailController {
	
	@Autowired
	private RiEmployeeDetailService riEmpDtlService;
	
	@PostMapping("/save")
	public String save(@RequestBody RIRequestDTO riRequest, HttpServletRequest request) {
		return riEmpDtlService.save(riRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody RIRequestDTO riRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return riEmpDtlService.update(riRequest, tranId, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Integer tranId, HttpServletRequest request) {
		return riEmpDtlService.delete(tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId, HttpServletRequest request) {
		return riEmpDtlService.get(tranId, request);
	}

}
