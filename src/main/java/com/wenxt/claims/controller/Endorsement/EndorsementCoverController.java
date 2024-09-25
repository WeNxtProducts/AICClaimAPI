package com.wenxt.claims.controller.Endorsement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.Endorsement.EndorsementRequest;
import com.wenxt.claims.service.EndorsementService.EndorsementCoverService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/endtCover")
public class EndorsementCoverController {
	
	@Autowired
	private EndorsementCoverService endtCoverService;
	
	@PostMapping("/save")
	public String save(@RequestBody EndorsementRequest endtRequest, HttpServletRequest request) {
		return endtCoverService.save(endtRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@PathVariable Integer tranId, @RequestBody EndorsementRequest endtRequest, HttpServletRequest request) {
		return endtCoverService.update(tranId, endtRequest, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Integer tranId, HttpServletRequest request) {
		return endtCoverService.delete(tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId, HttpServletRequest request) {
		try {
		return endtCoverService.get(tranId, request);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
