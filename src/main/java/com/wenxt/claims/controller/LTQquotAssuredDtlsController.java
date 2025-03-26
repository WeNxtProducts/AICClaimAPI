package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.LTQquotAssuredDtlsRequest;
import com.wenxt.claims.service.LTQquotAssuredDtlsService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/ltQquotAssuredDtls")
public class LTQquotAssuredDtlsController {
	@Autowired
	private LTQquotAssuredDtlsService ltQuoteService;

	@PostMapping("/save")
	public String save(@RequestBody LTQquotAssuredDtlsRequest ltquotAssuredDtlsRequest, HttpServletRequest request) {
		return ltQuoteService.save(ltquotAssuredDtlsRequest, request);
	}

	@PostMapping("/get")
	public String get(@RequestParam Long tranId) throws IllegalArgumentException, IllegalAccessException {
		return ltQuoteService.getById(tranId);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody LTQquotAssuredDtlsRequest ltquotAssuredDtlsRequest, @PathVariable Long tranId, HttpServletRequest request) {
		return ltQuoteService.update(ltquotAssuredDtlsRequest, tranId, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Long tranId, HttpServletRequest servletRequest) {
		return ltQuoteService.delete(tranId, servletRequest);
	}
}
