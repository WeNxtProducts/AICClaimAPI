package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.SaveDocToDoList;
import com.wenxt.claims.service.DocToDoListStsService;

@RestController
@RequestMapping("/docList")
public class DocToDoListController {
	
	@Autowired
	private DocToDoListStsService docToDoListService;
	
	@PostMapping("/saveDocList")
	public String saveDocToDoList(@RequestBody SaveDocToDoList saveDocListRequest) {
		return docToDoListService.saveStatus(saveDocListRequest);
	}
	
	@PostMapping("/updateDocList")
	public String updateeDocToDoList(@RequestBody SaveDocToDoList saveDocListRequest) {
		return docToDoListService.updateStatus(saveDocListRequest);
	}


}
