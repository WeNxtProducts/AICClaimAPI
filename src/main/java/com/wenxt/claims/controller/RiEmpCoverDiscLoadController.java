package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.RIRequestDTO;
import com.wenxt.claims.service.RiEmpCoverDiscLoadService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/riEmpCvrDiscLoad")
public class RiEmpCoverDiscLoadController {
	
	@Autowired
	private RiEmpCoverDiscLoadService riEmpCvrDiscLoadService;
	
	@PostMapping("/save")
	public String save(@RequestBody RIRequestDTO riRequestDTO, HttpServletRequest request) {
		return riEmpCvrDiscLoadService.save(riRequestDTO, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@RequestBody RIRequestDTO riRequestDTO, @PathVariable Integer tranId, HttpServletRequest request) {
		return riEmpCvrDiscLoadService.update(riRequestDTO, tranId, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Integer tranId, HttpServletRequest  request) {
		return riEmpCvrDiscLoadService.delete(tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId, HttpServletRequest request) {
		return riEmpCvrDiscLoadService.get(tranId, request);
	}
}
