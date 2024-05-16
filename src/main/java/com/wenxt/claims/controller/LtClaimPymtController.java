package com.example.aicbaseCrud.controller;

import java.sql.SQLException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aicbaseCrud.model.LT_CLAIM_PYMT;
import com.example.aicbaseCrud.service.LtClaimPymtService;

@RestController
@RequestMapping("claimpymt")
public class LtClaimPymtController {

	@Autowired
	private LtClaimPymtService claimpymtservice;

	@PostMapping("/claimpymt_creates")
	public String createClaimPymt(@RequestBody LT_CLAIM_PYMT claimpymt) {
		return claimpymtservice.createClaimPymt(claimpymt);
	}

//	@GetMapping("/claimpymt_List")
//	public String getAllClaimPymtlist() throws JSONException, SQLException {
//		return claimpymtservice.getAllClaimPymtlist();
//	}

	@GetMapping("getclaimpymtByid/{cp_TRAN_id}")
	public String getClaimPymtById(@PathVariable Long cp_TRAN_id) {
		return claimpymtservice.getClaimPymtById(cp_TRAN_id);

	}

	@DeleteMapping("/deleteclaimpymtByid/{cp_TRAN_id}")
	public String deleteClaimPymtByid(@PathVariable Long cp_TRAN_id) {
		return claimpymtservice.deleteClaimPymtByid(cp_TRAN_id);
	}

}
