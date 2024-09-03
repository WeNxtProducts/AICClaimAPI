package com.wenxt.claims.service;

import java.sql.ResultSet;

import org.elasticsearch.index.query.QueryBuilder;

public interface ElasticSearchProxy {
	
	public ResultSet search(QueryBuilder query, String tableName, String orderColumn, Integer limit, Integer offset)throws Exception;

}
