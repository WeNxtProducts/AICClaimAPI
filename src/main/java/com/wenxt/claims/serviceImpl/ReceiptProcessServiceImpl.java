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

import com.wenxt.claims.model.LT_RCPT_PROCESS;
import com.wenxt.claims.model.ReceiptRequest;
import com.wenxt.claims.repository.ReceiptProcessRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.ReceiptProcessService;

import jakarta.persistence.Column;

@Service
public class ReceiptProcessServiceImpl implements ReceiptProcessService {
	
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
	private ReceiptProcessRepository receiptProcessRepo;

	@Override
	public String save(ReceiptRequest receiptRequest) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_RCPT_PROCESS receiptProcess = new LT_RCPT_PROCESS();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			if(receiptRequest.getReceiptHeader() != null) {
			fieldMaps.put("frontForm", receiptRequest.getReceiptProcess().getFormFields());
			}else {
				fieldMaps.put("frontForm", receiptRequest.getReceiptProcess().getFormFields());
			}
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(receiptProcess, receiptProcess.getClass(), entry.getValue());
			}

			try {
				receiptProcess.setRP_INS_DT(new Date(System.currentTimeMillis()));
				LT_RCPT_PROCESS savedReceiptHeaderDetails = receiptProcessRepo.save(receiptProcess);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Receipt Process Details Saved Successfully");
				data.put("Id", savedReceiptHeaderDetails.getRP_TRAN_ID());
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
			Optional<LT_RCPT_PROCESS> optionalUser = receiptProcessRepo.findById(tranId);
			LT_RCPT_PROCESS receiptProcess = optionalUser.get();
			if (receiptProcess != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", receiptRequest.getReceiptProcess().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(receiptProcess, receiptProcess.getClass(), entry.getValue());
				}

				try {
					receiptProcess.setRP_MOD_DT(new Date(System.currentTimeMillis()));
					LT_RCPT_PROCESS savedReceiptHeaderDetails = receiptProcessRepo.save(receiptProcess);
					response.put(statusCode, successCode);
					response.put(messageCode, "Receipt Process Details Updated Successfully");
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
			Optional<LT_RCPT_PROCESS> optionalEntity = receiptProcessRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				JSONObject response = new JSONObject();
				
				receiptProcessRepo.delete(optionalEntity.get());
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
		Optional<LT_RCPT_PROCESS> optionalUser = receiptProcessRepo.findById(tranId);
		LT_RCPT_PROCESS receiptProcess = optionalUser.get();
		if (receiptProcess != null) {
			for (int i = 0; i < receiptProcess.getClass().getDeclaredFields().length; i++) {
				Field field = receiptProcess.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(receiptProcess);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
	}

}

