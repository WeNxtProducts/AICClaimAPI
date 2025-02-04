package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.service.WorkFlowService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/task")
public class WorkFlowController {
	
	@Autowired
	private WorkFlowService workFlowService;
	
	@PostMapping("/completeTask")
	public String completeUnderwriting(@RequestParam Integer tranId, HttpServletRequest request) {
		return workFlowService.completeTask(tranId, request);
	}
	
	@PostMapping("/deleteTask")
	public String deleteTask(HttpServletRequest request) {
		return workFlowService.deleteTask(request);
	}
	
	@PostMapping("/get")
	public void getTask(@RequestParam Integer tranId, HttpServletRequest request) {
		workFlowService.getTask(tranId, request);
	}

}