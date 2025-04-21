package com.wenxt.claims.serviceImpl;

import org.springframework.stereotype.Service;

import com.wenxt.claims.model.FormFieldsDTO;
import com.wenxt.claims.model.QuickQuoteRequest;
import com.wenxt.claims.service.ClaimIntimationService;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class ClaimIntimationServiceImpl implements ClaimIntimationService {

	@Override
	public String save(FormFieldsDTO claimIntimation, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(QuickQuoteRequest quickQuoteRequest, Integer tranId, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(Integer tranId, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
