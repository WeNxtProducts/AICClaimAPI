package com.wenxt.claims.flowableService;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.serviceImpl.CommonServiceImpl;

@Service
public class DefaultValues implements JavaDelegate {
	
	@Autowired
	private JwtService jwtService = new JwtService();
	
	@Autowired
	private CommonService commonService = new CommonServiceImpl();
	
	static final String baseAPIPath = "http://localhost:8098/";

	@Override
	public void execute(DelegateExecution execution) {

		String condition = (String) execution.getVariable("process");

		if (condition.equals("create")) {
			executeCreateDefaultValuesTask(execution);
		} else if (condition.equals("update")) {
			executeUpdateValuesTask();
		}

	}

	private void executeUpdateValuesTask() {}

	private void executeCreateDefaultValuesTask(DelegateExecution execution) {
		try {
			Object instance = execution.getVariable("instance");
			Integer queryId = (Integer) execution.getVariable("queryId");

			AuthRequest loggedInDetails = jwtService.getLoggedInDetails((String) execution.getVariable("token"));

			Map<String, Object> queryParams = new HashMap<>();

			Map<String, Object> body = new HashMap<>();
			body.put("queryParams", queryParams);

			JSONObject jsonBody = new JSONObject(body);
			String requestBody = jsonBody.toString();

			String url = baseAPIPath + "common/getMapQuery?queryId=" + queryId;
			HttpHeaders headers = new HttpHeaders();
			RestTemplate restTemplate = new RestTemplate();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("Authorization", "Bearer " + (String) execution.getVariable("token"));
			HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);
			ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
			JSONObject object = new JSONObject(responseEntity.getBody());

			JSONArray jsonArray = (JSONArray) object.getJSONArray("Data");

			Map<String, String> values = new HashMap<>();
			for (int i = 0; i < jsonArray.length(); i++) {
				Iterator<String> keys = ((JSONObject) jsonArray.get(i)).keys();
				while (keys.hasNext()) {
					String key = keys.next();
					Object value = ((JSONObject) jsonArray.get(i)).get(key);

					values.put(key, value.toString());
				}
			}

			Class<?> clazz = Class.forName((String) execution.getVariable("class"));
			commonService.setFields(instance, clazz, values);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
