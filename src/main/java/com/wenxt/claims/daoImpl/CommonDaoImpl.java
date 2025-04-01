package com.wenxt.claims.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.dao.CommonDao;

@Repository
public class CommonDaoImpl implements CommonDao {
	
	@Autowired
	private NamedParameterJdbcTemplate namedTemplate;

	@Override
	public List<Map<String, Object>> getMapQuery(String docListQuery, Map<String, Object> queryParams) {
		String sql = docListQuery;

		List<Map<String, Object>> rows = namedTemplate.queryForList(sql, queryParams);

		return rows;
	}

}
