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

import com.wenxt.claims.model.LT_RCPT_DTL;
import com.wenxt.claims.model.LT_RCPT_HDR;
import com.wenxt.claims.model.ReceiptRequest;
import com.wenxt.claims.repository.ReceiptDetailRepository;
import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.ReceiptDetailService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class ReceiptDetailServiceImpl implements ReceiptDetailService {
	
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
	private ReceiptDetailRepository receiptDetailRepo;
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired 
	private CommonService commonService;

	@Override
	public String save(ReceiptRequest receiptRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			LT_RCPT_DTL receiptDetail = new LT_RCPT_DTL();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			if(receiptRequest.getReceiptHeader() != null) {
			fieldMaps.put("frontForm", receiptRequest.getReceiptHeader().getFormFields());
			}else {
				fieldMaps.put("frontForm", receiptRequest.getReceiptDetails().getFormFields());
			}
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(receiptDetail, receiptDetail.getClass(), entry.getValue());
			}

			try {
				AuthRequest userDetails = jwtService.getLoggedInDetails(token);
				receiptDetail.setRD_INS_DT(new Date(System.currentTimeMillis()));
				receiptDetail.setRD_INS_ID(userDetails.getUsername());
				LT_RCPT_DTL savedReceiptDetails = receiptDetailRepo.save(receiptDetail);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Receipt Header Details Saved Successfully");
				data.put("Id", savedReceiptDetails.getRD_TRAN_ID());
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
			Optional<LT_RCPT_DTL> optionalUser = receiptDetailRepo.findById(tranId);
			LT_RCPT_DTL receiptDetail = optionalUser.get();
			if (receiptDetail != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", receiptRequest.getReceiptDetails().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(receiptDetail, receiptDetail.getClass(), entry.getValue());
				}

				try {
					receiptDetail.setRD_MOD_DT(new Date(System.currentTimeMillis()));
					LT_RCPT_DTL savedReceiptDetails = receiptDetailRepo.save(receiptDetail);
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
			Optional<LT_RCPT_DTL> optionalEntity = receiptDetailRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				receiptDetailRepo.deleteById(tranId);

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
	public String get(Integer tranId)throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		JSONObject response = new JSONObject();
		Optional<LT_RCPT_DTL> optionalUser = receiptDetailRepo.findById(tranId);
		LT_RCPT_DTL receiptHeader = optionalUser.get();
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

}
