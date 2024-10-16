package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.LtmedFeeRequest;
import com.wenxt.claims.service.LtMedExFeeDtlService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/LtmedexFeeDtl")
public class LtMedexFeeDtlController {

	@Autowired
	private LtMedExFeeDtlService LtmedfeeDtlService;

	@PostMapping("/save")
	public String saveMedExFeeDtl(@RequestBody LtmedFeeRequest medRequest, HttpServletRequest servletRequest) {
		return LtmedfeeDtlService.saveMedExFeeDtl(medRequest, servletRequest);
	}

	@PostMapping("/update/{tranId}")
	public String updateMedfee(@RequestBody LtmedFeeRequest medRequest, @PathVariable Integer tranId,
			HttpServletRequest servletRequest) {
		return LtmedfeeDtlService.updateMedfee(medRequest, tranId, servletRequest);
	}

	@PostMapping("/delete/{tranId}")
	public String deleteMedfee(@PathVariable Integer tranId, HttpServletRequest servletRequest) {
		return LtmedfeeDtlService.deleteMedfee(tranId, servletRequest);
	}

	@PostMapping("/get")
	public String getMedFee(@RequestParam Integer tranId, HttpServletRequest request) {
		try {
			return LtmedfeeDtlService.getMedFee(tranId, request);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}
