package com.wenxt.claims.dao;

import java.util.List;
import java.util.Map;

public interface CommonDao {

	List<Map<String, Object>> getMapQuery(String docListQuery, Map<String, Object> queryParams);

}
