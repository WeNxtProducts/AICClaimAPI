package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.service.LtDocToDoListService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/docToDoList")
public class LtDocToDoListController {
	
	@Autowired
	private LtDocToDoListService ltDocToDoListService;
	
	@PostMapping("/saveDocToDoList")
	public String saveDocToDoList(@RequestBody ClaimsRequestDTO claimsRequestDTO, HttpServletRequest request) {
		return ltDocToDoListService.saveDocToDoList(claimsRequestDTO, request);
	}
	
	@PostMapping("/updateDocToDoList/{tranId}")
	public String updateDocToDoList(@PathVariable Integer tranId, @RequestBody ClaimsRequestDTO claimsRequestDTO) {
		return ltDocToDoListService.updateDocToDoList(tranId, claimsRequestDTO);
	}
	
	@PostMapping("/getLtDocToDoList")
	public String getDocToDoList(@RequestParam Integer tranId) {
		try {
			return ltDocToDoListService.getDocToDoList(tranId);
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	@PostMapping("/deleteLtDocToDoList/{tranId}")
	public String deleteLtDocToDoList(@PathVariable Integer tranId) {
		return ltDocToDoListService.deleteDocToDoList(tranId);
	}

}
