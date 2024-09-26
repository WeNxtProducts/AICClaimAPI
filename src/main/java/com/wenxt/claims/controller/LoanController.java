package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.LoanRequest;
import com.wenxt.claims.service.LoanService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/loan")
public class LoanController {
	
	@Autowired
	private LoanService loanService;
	
	@PostMapping("/save")
	public String save(@RequestBody LoanRequest loanRequest, HttpServletRequest servletRequest) {
		return loanService.save(loanRequest, servletRequest);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody LoanRequest loanRequest, @PathVariable Integer tranId, HttpServletRequest servletRequest) {
		return loanService.update(loanRequest, tranId, servletRequest);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Integer tranId, HttpServletRequest servletRequest) {
		return loanService.delete(tranId, servletRequest);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId, HttpServletRequest request) {
		try {
		return loanService.get(tranId, request);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
