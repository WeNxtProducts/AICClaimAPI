package com.wenxt.claims.controller.Endorsement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.Endorsement.EndorsementRequest;
import com.wenxt.claims.service.EndorsementService.BeneficiaryService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/endtBenf")
public class EndorsementBenficiaryController {
	
	@Autowired
	private BeneficiaryService endtBenfService;
	
	@PostMapping("/save")
	public String save(@RequestBody EndorsementRequest endtRequest, HttpServletRequest request) {
		return endtBenfService.save(endtRequest, request);
	}
	
	@PostMapping("/update/{tranId}")
	public String update(@PathVariable Integer tranId, @RequestBody EndorsementRequest endtRequest, HttpServletRequest request) {
		return endtBenfService.update(tranId, endtRequest, request);
	}
	
	@PostMapping("/delete/{tranId}")
	public String delete(@PathVariable Integer tranId, HttpServletRequest request) {
		return endtBenfService.delete(tranId, request);
	}
	
	@PostMapping("/get")
	public String get(@RequestParam Integer tranId, HttpServletRequest request) {
		try {
		return endtBenfService.get(tranId, request);
		}catch(Exception e) {
			return e.getMessage();
		}
	}

}
