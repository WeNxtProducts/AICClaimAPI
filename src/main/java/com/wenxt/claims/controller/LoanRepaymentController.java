package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.LoanRequest;
import com.wenxt.claims.service.LoanRepaymentService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/loanRepymnt")
public class LoanRepaymentController {
	
	@Autowired
	private LoanRepaymentService loanRepaymtService;

	@PostMapping("/save")
	public String save(@RequestBody LoanRequest loanRequest, HttpServletRequest servletRequest) {
		return loanRepaymtService.save(loanRequest, servletRequest);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody LoanRequest loanRequest, @PathVariable Integer tranId, HttpServletRequest servletRequest) {
		return loanRepaymtService.update(loanRequest, tranId, servletRequest);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable  Integer tranId, HttpServletRequest servletRequest) {
		return loanRepaymtService.delete(tranId, servletRequest);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId, HttpServletRequest servletRequest) {
		try {
		return loanRepaymtService.get(tranId, servletRequest);
		}catch(Exception e) {
			return e.getMessage();
		}
	}
}
