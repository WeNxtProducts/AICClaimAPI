package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.LTQquotDiscLoadRequest;
import com.wenxt.claims.service.LTQquotDiscLoadService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/ltQquotDiscLoad")
public class LTQquotDiscLoadController {
	
	
	@Autowired
	private  LTQquotDiscLoadService ltQquotDiscLoadService; 
	@PostMapping("/save")
	public String save(@RequestBody LTQquotDiscLoadRequest ltQquotDiscLoadRequest, HttpServletRequest request) {
		return ltQquotDiscLoadService.save(ltQquotDiscLoadRequest, request);
	}

	@PostMapping("/get")
	public String get(@RequestParam Long tranId) throws IllegalArgumentException, IllegalAccessException {
		return ltQquotDiscLoadService.getLTQquoteDiscById(tranId);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody LTQquotDiscLoadRequest ltQuoteRequest, @PathVariable Long tranId, HttpServletRequest request) {
		return ltQquotDiscLoadService.update(ltQuoteRequest, tranId, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Long tranId, HttpServletRequest servletRequest) {
		return ltQquotDiscLoadService.delete(tranId, servletRequest);
	}
}
