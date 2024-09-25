package com.wenxt.claims.controller.Endorsement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.Endorsement.EndorsementRequest;
import com.wenxt.claims.service.EndorsementService.PolicyService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/endtPol")
public class EndorsementPolicyController {
	
	@Autowired
	private PolicyService endtPolService;
	
	@PostMapping("/save")
	public String save(@RequestBody EndorsementRequest endtRequest, HttpServletRequest request) {
		return endtPolService.save(endtRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@PathVariable Integer tranId, @RequestBody EndorsementRequest endtRequest, HttpServletRequest request) {
		return endtPolService.update(tranId, endtRequest, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Integer tranId, HttpServletRequest request) {
		return endtPolService.delete(tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId, HttpServletRequest request) {
		try {
		return endtPolService.get(tranId, request);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
