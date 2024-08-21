package com.wenxt.claims.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.flowable.engine.runtime.ProcessInstance;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ProposalForwarding implements JavaDelegate {
	
	@Value("${string.baseApi.path}")
	private String baseAPIPath;

	@Autowired
	private RuntimeService runtimeService;

	@Override
	public void execute(DelegateExecution execution) {
		String token = (String) execution.getVariable("Token");
		
	}

}
