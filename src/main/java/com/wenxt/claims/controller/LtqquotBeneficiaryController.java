package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.LTQquotBeneficiaryRequest;
import com.wenxt.claims.service.LtqquotBeneficiaryService;

import jakarta.servlet.http.HttpServletRequest;
@RestController
@RequestMapping("/ltQuoteBeneficiary")
public class LtqquotBeneficiaryController {
@Autowired
private LtqquotBeneficiaryService ltqquotBeneficiaryService;

@PostMapping("/save/{tranId}")
public String save(@RequestBody LTQquotBeneficiaryRequest ltQquotBeneficiaryRequest, @PathVariable Integer tranId, HttpServletRequest request) {
	return ltqquotBeneficiaryService.save(ltQquotBeneficiaryRequest, tranId, request);
}

@PostMapping("/get")
public String get(@RequestParam Long tranId) throws IllegalArgumentException, IllegalAccessException {
	return ltqquotBeneficiaryService.getById(tranId);
}

@PostMapping("/update/{tranId}")
public String update(@RequestBody LTQquotBeneficiaryRequest ltQuoteRequest, @PathVariable Long tranId, HttpServletRequest request) {
	return ltqquotBeneficiaryService.update(ltQuoteRequest, tranId, request);
}

@PostMapping("/delete/{tranId}")
public String delete(@PathVariable Long tranId, HttpServletRequest servletRequest) {
	return ltqquotBeneficiaryService.delete(tranId, servletRequest);
}
}
