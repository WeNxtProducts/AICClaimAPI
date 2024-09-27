package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.SurrMattValuesRequest;
import com.wenxt.claims.service.SurrMattValuesService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/surrMattValues")
public class SurrMattValuesController {
	
	@Autowired
	private SurrMattValuesService surrMattValuesService;
	
	@PostMapping("/save")
	public String save(@RequestBody SurrMattValuesRequest surrMattValuesRequest, HttpServletRequest servletRequest) {
		return surrMattValuesService.save(surrMattValuesRequest, servletRequest);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody SurrMattValuesRequest surrMattValuesRequest, @PathVariable Integer tranId, HttpServletRequest servletRequest) {
		return surrMattValuesService.update(surrMattValuesRequest, tranId, servletRequest);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Integer tranId, HttpServletRequest servletRequest) {
		return surrMattValuesService.delete(tranId, servletRequest);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId, HttpServletRequest servletRequest) {
		try {
		return surrMattValuesService.get(tranId, servletRequest);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
