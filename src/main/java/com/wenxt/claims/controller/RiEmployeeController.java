package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.RIRequestDTO;
import com.wenxt.claims.service.RiEmployeeService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/riEmployee")
public class RiEmployeeController {
	
	@Autowired
	private RiEmployeeService riEmpService;
	
	@PostMapping("/save")
	public String save(@RequestBody RIRequestDTO riRequest, HttpServletRequest request) {
		return riEmpService.save(riRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody RIRequestDTO riRequest, @PathVariable Integer tranId, HttpServletRequest request) {
		return riEmpService.update(riRequest, tranId, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Integer tranId, HttpServletRequest request) {
		return riEmpService.delete(tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId, HttpServletRequest request) {
		return riEmpService.get(tranId);
	}

}
