package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ClaimsRequestDTO;
import com.wenxt.claims.service.LtClaimChargesService;
import com.wenxt.claims.service.LtClaimCheckListService;

@RestController
@RequestMapping("/claimCheckList")
public class LtClaimCheckListCotroller {
	
	@Autowired
	private LtClaimCheckListService claimCheckListService;

	@PostMapping("/claimCheckListSave")
	public String createClaimCheckList(@RequestBody ClaimsRequestDTO claimsRequestDTO) {
		return claimCheckListService.createClaimCheckList(claimsRequestDTO);
	}
	
	@GetMapping("getclaimCheckListByid")
	public String getClaimCheckListById(@RequestParam Integer DTLS_TRAN_ID) {
		try {
		return claimCheckListService.getClaimCheckListById(DTLS_TRAN_ID);
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	@PostMapping("/deleteClaimCheckList/{DTLS_TRAN_ID}")
	public String deleteLtClaimCheckListByid(@PathVariable Integer DTLS_TRAN_ID) {
		return claimCheckListService.deleteLtClaimCheckListByid(DTLS_TRAN_ID);
	}
	
	@PostMapping("/claimCheckListUpdate/{claim_id}")
	public String updateLtClaimCheckList(@RequestBody ClaimsRequestDTO claimsRequestDTO, @PathVariable Integer DTLS_TRAN_ID) {
		return claimCheckListService.updateLtClaimCheckList(claimsRequestDTO, DTLS_TRAN_ID);
	}

}
