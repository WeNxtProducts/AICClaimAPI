package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wenxt.claims.model.LT_RCPT_HDR;
import com.wenxt.claims.model.ReceiptRequest;
import com.wenxt.claims.model.SearchRequestDTO;
import com.wenxt.claims.repository.ReceiptHeaderRepository;
import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.ElasticSearchProxy;
import com.wenxt.claims.service.ReceiptHeaderService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class ReceiptHeaderServiceImpl implements ReceiptHeaderService {
	
	@Value("${spring.message.code}")
	private String messageCode;

	@Value("${spring.status.code}")
	private String statusCode;

	@Value("${spring.data.code}")
	private String dataCode;
	
	@Value("${spring.success.code}")
	private String successCode;

	@Value("${spring.error.code}")
	private String errorCode;

	@Value("${spring.warning.code}")
	private String warningCode;	
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private ReceiptHeaderRepository receiptHeaderRepo;
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private ElasticSearchProxy elasticSearch;

	@Override
	public String save(ReceiptRequest receiptRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			LT_RCPT_HDR receiptHeader = new LT_RCPT_HDR();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			if(receiptRequest.getReceiptHeader() != null) {
			fieldMaps.put("frontForm", receiptRequest.getReceiptHeader().getFormFields());
			}else {
				fieldMaps.put("frontForm", receiptRequest.getReceiptHeader().getFormFields());
			}
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(receiptHeader, receiptHeader.getClass(), entry.getValue());
			}

			try {
				AuthRequest userDetails = jwtService.getLoggedInDetails(token);
				receiptHeader.setRH_INS_DT(new Date(System.currentTimeMillis()));
				receiptHeader.setRH_INS_ID(userDetails.getUsername());
				LT_RCPT_HDR savedReceiptHeaderDetails = receiptHeaderRepo.save(receiptHeader);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Receipt Header Details Saved Successfully");
				data.put("Id", savedReceiptHeaderDetails.getRH_TRAN_ID());
				response.put(dataCode, data);
			} catch (Exception e) {
				response.put(statusCode, errorCode);
				response.put(messageCode, "An error occurred: " + e.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	@Override
	public String update(ReceiptRequest receiptRequest, Integer tranId) {
		JSONObject response = new JSONObject();

		try {
			Optional<LT_RCPT_HDR> optionalUser = receiptHeaderRepo.findById(tranId);
			LT_RCPT_HDR receiptHeader = optionalUser.get();
			if (receiptHeader != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", receiptRequest.getReceiptHeader().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(receiptHeader, receiptHeader.getClass(), entry.getValue());
				}

				try {
					receiptHeader.setRH_MOD_DT(new Date(System.currentTimeMillis()));
					receiptHeader.setRH_FLEX_03("Y");
					LT_RCPT_HDR savedReceiptHeaderDetails = receiptHeaderRepo.save(receiptHeader);
					response.put(statusCode, successCode);
					response.put(messageCode, "Receipt Header Details Updated Successfully");
				} catch (Exception e) {
					response.put("statusCode", errorCode);
					response.put("message", "An error occurred: " + e.getMessage());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	@Override
	public String delete(Integer tranId) {
		try {
			Optional<LT_RCPT_HDR> optionalEntity = receiptHeaderRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				receiptHeaderRepo.deleteById(tranId);

				JSONObject response = new JSONObject();
				response.put(statusCode, successCode);
				response.put(messageCode, "Record with ID " + tranId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put(statusCode, errorCode);
				response.put(messageCode, "Record with ID " + tranId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put(statusCode, errorCode);
			response.put(messageCode, "Error deleting record with ID " + tranId + ": " + e.getMessage());
			return response.toString();
		}
	}

	@Override
	public String get(Integer tranId) throws Exception{
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		JSONObject response = new JSONObject();
		Optional<LT_RCPT_HDR> optionalUser = receiptHeaderRepo.findById(tranId);
		LT_RCPT_HDR receiptHeader = optionalUser.get();
		if (receiptHeader != null) {
			for (int i = 0; i < receiptHeader.getClass().getDeclaredFields().length; i++) {
				Field field = receiptHeader.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(receiptHeader);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
			response.put(statusCode, successCode);
			response.put(dataCode, inputObject);
			response.put(messageCode, "Receipt Header Details Fetched Successfully");
		}else {
			response.put(statusCode, errorCode);
			response.put(messageCode, "No Record found for Id " + tranId);
		}

		return response.toString();
	}

	@Override
	public String searchReceiptHeader(SearchRequestDTO searchRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		QueryBuilder query = QueryBuilders.matchQuery("_all", searchRequest.getSearchTerm());
		
		if(searchRequest.getOffset() == 1) {
			searchRequest.setOffset(0);
		}

		try {
			String url = "http://localhost:8098/common/getlistingdata?queryId="+searchRequest.getQueryId()
			+"&limit="+searchRequest.getLimit()+"&offset="+searchRequest.getOffset();
			HttpHeaders headers = new HttpHeaders();
			RestTemplate restTemplate = new RestTemplate();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("Authorization", "Bearer " + token);
			HttpEntity<String> requestEntity = new HttpEntity<>(headers);
			ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
			JSONObject resultObject = new JSONObject(responseEntity.getBody());

//			System.out.println(resultObject);
			JSONArray jsonArray = (JSONArray) resultObject.getJSONArray("Data");
			
			ResultSet results = elasticSearch.search(query, "LT_RCPT_HDR", "RH_TRAN_ID", searchRequest.getLimit(), searchRequest.getOffset());

			JSONObject object = new JSONObject();
			List<JSONObject> resultList = new ArrayList();
			while (results.next()) {
				object = new JSONObject();
				ResultSetMetaData metaData = results.getMetaData();
					object.put("ID", results.getObject("RH_TRAN_ID"));
					object.put("Reference_No", results.getObject("RH_BATCH_NO"));
					object.put("Receipt_Basis", results.getObject("RH_RCPT_BAS"));
					object.put("Basis_Value", results.getObject("RH_REP_RCPT_REF_NO"));
					
					resultList.add(object);
			}
			
			response.put(messageCode, "Search Results Fetched Successfully");
			response.put("Heading", resultObject.get("Heading"));
			response.put(dataCode, resultList);
			response.put("Count", results.getFetchSize());
			response.put(statusCode, successCode);
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

}
