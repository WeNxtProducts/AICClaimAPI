package com.wenxt.claims.service;

import com.wenxt.claims.model.ClaimsRequestDTO;

import jakarta.servlet.http.HttpServletRequest;

public interface LtDocToDoListService {

	String saveDocToDoList(ClaimsRequestDTO claimsRequestDTO, HttpServletRequest request);

	String updateDocToDoList(Integer tranId, ClaimsRequestDTO claimsRequestDTO);

	String getDocToDoList(Integer tranId) throws Exception;

	String deleteDocToDoList(Integer tranId);

}
