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
		
		Map<String, Object> queryParams = new HashMap<>();

		Map<String, Object> body = new HashMap<>();
		body.put("queryParams", queryParams);

		JSONObject jsonBody = new JSONObject(body);
		String requestBody = jsonBody.toString();
		
		String url = "http://localhost:8098/common/getMapQuery?queryId=171";
		HttpHeaders headers = new HttpHeaders();
		RestTemplate restTemplate = new RestTemplate();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer " + token);
		HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
		JSONObject object = new JSONObject(responseEntity.getBody());

		JSONArray jsonArray = (JSONArray) object.getJSONArray("Data");
		List<String> values = new ArrayList<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			Iterator<String> keys = ((JSONObject) jsonArray.get(i)).keys();
			while (keys.hasNext()) {
				String key = keys.next();
				Object value = ((JSONObject) jsonArray.get(i)).get(key);

				values.add(value.toString());
			}
		}
		execution.setVariable("assignee", values);
		
	}

}
