package com.wenxt.claims.service;

import java.util.Map;

public interface CommonService {
	
	public void setFields(Object instance, Class<?> clazz, Map<String, String> value) throws Exception;

}
