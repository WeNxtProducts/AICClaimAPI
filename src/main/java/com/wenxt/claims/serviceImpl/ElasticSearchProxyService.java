package com.wenxt.claims.serviceImpl;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wenxt.claims.service.ElasticSearchProxy;

@Service
public class ElasticSearchProxyService implements ElasticSearchProxy {

    private Connection connection;
    
    @Autowired
    private DataSource dataSource;

    public ElasticSearchProxyService() throws SQLException {
        this.connection = DriverManager.getConnection(
            "jdbc:oracle:thin:@//192.168.1.155:1521/orcl", 
            "LIFE_DEV", 
            "LIFE_DEV"
        );
    }

    private List<String> getColumnNames(String tableName) throws SQLException {
        List<String> columns = new ArrayList<>();
        DatabaseMetaData metaData = connection.getMetaData();
        ResultSet resultSet = metaData.getColumns(null, null, tableName.toUpperCase(), null);
        while (resultSet.next()) {
            columns.add(resultSet.getString("COLUMN_NAME"));
        }
        return columns;
    }

    private String translateQuery(QueryBuilder queryBuilder, String tableName, String orderColumn, Integer limit, Integer offset, String where, Object value) throws SQLException {
        List<String> columns = getColumnNames(tableName);
        String searchValue = ((org.elasticsearch.index.query.MatchQueryBuilder) queryBuilder).value().toString();

        StringBuilder sql = new StringBuilder("SELECT * FROM " + tableName + " WHERE ");
        if(where != null && value != null) {
        	sql.append(where + " = " + value + " AND (");
        }
        for (int i = 0; i < columns.size(); i++) {
            sql.append(columns.get(i)).append(" LIKE '%").append(searchValue).append("%'");
            if (i < columns.size() - 1) {
                sql.append(" OR ");
            }
            if(i == columns.size() - 1) {
            	if(where != null && value != null) {
            		sql.append(")");
            	}
            	sql.append(" ORDER BY "+ orderColumn  + " DESC OFFSET " + offset + " ROWS FETCH NEXT " + limit + " ROWS ONLY" );
            }
        }
        System.out.println(sql.toString());
        return sql.toString();
    }

    private ResultSet executeSQL(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }

    @Override
    public ResultSet search(QueryBuilder queryBuilder, String tableName, String orderColumn, Integer limit, Integer offset, String where, Object value) throws SQLException {
        String sql = translateQuery(queryBuilder, tableName, orderColumn, limit, offset, where, value);
        return executeSQL(sql);
    }
}

