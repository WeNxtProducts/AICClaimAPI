package com.wenxt.claims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.InsuranceCoverageDTO;
import com.wenxt.claims.model.LTQuoteRequest;
import com.wenxt.claims.model.QuoteLoginRequest;
import com.wenxt.claims.service.LtQuoteService;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/ltQuoteDetails")
public class LTQuoteController {

	@Autowired
	private LtQuoteService ltQuoteService;

	@PostMapping("/save")
	public String save(@RequestBody LTQuoteRequest ltQuoteRequest, HttpServletRequest request) {
		return ltQuoteService.save(ltQuoteRequest, request);
	}

	@PostMapping("/get")
	public String get(@RequestParam Long tranId, HttpServletRequest request) throws IllegalArgumentException, IllegalAccessException {
		return ltQuoteService.getLTQuoteById(tranId, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody LTQuoteRequest ltQuoteRequest, @PathVariable Long tranId, HttpServletRequest request) {
		return ltQuoteService.update(ltQuoteRequest, tranId, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Long tranId, HttpServletRequest servletRequest) {
		return ltQuoteService.delete(tranId, servletRequest);
	}
	
	@PostMapping("/updateLtQuotCoverData")
    public String updateLtQuotCoverData(@RequestBody List<InsuranceCoverageDTO> coverages, HttpServletRequest request) {
		
		return ltQuoteService.updateLtQuotCoverData(coverages, request);
      
    }
	
	@PostMapping("/createLogin")
	public String createLogin(@RequestBody QuoteLoginRequest quoteLoginRequest, HttpServletRequest request) {
		return ltQuoteService.createLogin(quoteLoginRequest, request);
	}
	
	@PostMapping("/triggerOTP")
	public String triggerOTP(@RequestParam String userName, HttpServletRequest request) {
		return ltQuoteService.triggerOTP(userName, request);
	}

}
