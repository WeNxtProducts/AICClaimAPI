package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.EmployeeValidationsRequest;
import com.wenxt.claims.model.LTQuickQuoteRequest;
import com.wenxt.claims.service.LTQuickQuoteService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/quickQuote")
public class LTQuickQuoteController {
	
	@Autowired
	private LTQuickQuoteService quickQuoteService;
	
	@PostMapping("/save")
	public String save(@RequestBody LTQuickQuoteRequest quickQuoteRequest, HttpServletRequest request) {
		return quickQuoteService.save(quickQuoteRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody LTQuickQuoteRequest quickQuoteRequest, @PathVariable Long tranId, HttpServletRequest request) {
		return quickQuoteService.update(quickQuoteRequest, tranId, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Long tranId, HttpServletRequest request) {
		return quickQuoteService.delete(tranId, request);
	}
	
	@PostMapping("/get")
	public String get() {
		return quickQuoteService.get();
	}
	
	@PostMapping("/employeeValidation")
	public String employeeValidation(@RequestBody EmployeeValidationsRequest employeeExcel, HttpServletRequest request) {
		return quickQuoteService.employeeValidation(employeeExcel, request);
	}

}
