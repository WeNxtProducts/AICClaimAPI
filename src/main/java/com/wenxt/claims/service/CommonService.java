package com.wenxt.claims.service;

import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public interface CommonService {
	
	public void setFields(Object instance, Class<?> clazz, Map<String, String> value) throws Exception;

}
