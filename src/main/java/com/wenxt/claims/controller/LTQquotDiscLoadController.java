package com.wenxt.claims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.GetQuestionnaireResponse;
import com.wenxt.claims.model.LTQquotDiscLoadRequest;
import com.wenxt.claims.model.QueryParametersDTO;
import com.wenxt.claims.model.SaveQuestionnaireRequest;
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
	
	@PostMapping("/getQuestionnaire")
	public String getQuestionnaire(@RequestBody QueryParametersDTO queryParams,HttpServletRequest request) {
		return ltQquotDiscLoadService.getQuestionnaire(queryParams, request);
	}
	
	@PostMapping("/saveQuestionnaire")
	public String saveQuestionnaire(@RequestBody SaveQuestionnaireRequest getQuestionnaireRequest, HttpServletRequest request) {
//		System.out.println(getQuestionnaireRequest.getSaveQuestions().size());
		return ltQquotDiscLoadService.saveQuestionnaire(getQuestionnaireRequest.getSaveQuestions(), request);
	}
	
	@PostMapping("/getQuestionnaireWithValues")
	public String getQuestionnaireWithValues(@RequestBody QueryParametersDTO queryParams,HttpServletRequest request) {
		System.out.println("IN");
		return ltQquotDiscLoadService.getQuestionnaireWithValues(queryParams, request);
	}
	
	@PostMapping("/updateQuestionnaireWithValues")
	public String updateQuestionnaireWithValues(@RequestBody SaveQuestionnaireRequest getQuestionnaireRequest,HttpServletRequest request) {
		return ltQquotDiscLoadService.updateQuestionnaireWithValues(getQuestionnaireRequest.getSaveQuestions(), request);
	}
}
