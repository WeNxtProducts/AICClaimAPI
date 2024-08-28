package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LT_RCPT_HDR;
import com.wenxt.claims.model.ReceiptRequest;
import com.wenxt.claims.repository.ReceiptHeaderRepository;
import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
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
		}
		return inputObject.toString();
	}

}
