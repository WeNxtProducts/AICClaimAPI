package com.wenxt.claims.service;

import jakarta.servlet.http.HttpServletRequest;

public interface WorkFlowService {

	String completeTask(Integer tranId, HttpServletRequest request);

	String deleteTask(HttpServletRequest request);

	Object getTask(Integer tranId, HttpServletRequest request);

}