package com.wenxt.claims.serviceImpl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LT_CLAIM_ESTIMATE;
import com.wenxt.claims.model.LT_POLICY;
import com.wenxt.claims.model.LT_POL_CHARGE;
import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.repository.LtPolChargeRepository;
import com.wenxt.claims.service.LtPolChargeService;

@Service
public class LtPolChargeServiceImpl implements LtPolChargeService {
	
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
	private LtPolChargeRepository polChargeRepo;

	@Override
	public String createPolCharge(ProposalEntryRequest proposalEntryRequest) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_POL_CHARGE polCharge = new LT_POL_CHARGE();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			if(proposalEntryRequest.getPolicyDetails() != null) {
			fieldMaps.put("frontForm", proposalEntryRequest.getPolChargeDetails().getFormFields());
			}else {
				fieldMaps.put("frontForm", proposalEntryRequest.getPolChargeDetails().getFormFields());
			}
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setPolChargeFields(polCharge, entry.getValue());
			}

			try {
				LT_POL_CHARGE savedPolChargeDetails = polChargeRepo.save(polCharge);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Policy Charge Details Saved Successfully");
				data.put("Id", savedPolChargeDetails.getPCHRG_TRAN_ID());
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

	private void setPolChargeFields(LT_POL_CHARGE polCharge, Map<String, String> value)throws Exception {
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setPolChargeField(polCharge, entry.getKey(), entry.getValue());
		}
	}

	private void setPolChargeField(LT_POL_CHARGE polCharge, String key, String value)throws Exception {
		try {
			Field field = LT_POL_CHARGE.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = LT_POL_CHARGE.class.getMethod(setterMethodName, fieldType);
				setter.invoke(polCharge, convertedValue);
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

	private Object convertStringToObject(String value, Class<?> fieldType) {
		if (fieldType.equals(Integer.class) && value.isEmpty() == false && value != null) {
			return Integer.parseInt(value);
		} else if (fieldType.equals(Double.class) && value.isEmpty() == false && value != null) {
			return Double.parseDouble(value);
		} else if (fieldType.equals(Short.class) && value.isEmpty() == false && value != null) {
			return Short.parseShort(value);
		} else if (fieldType.equals(LocalDateTime.class) && value.isEmpty() == false && value != null) {
			return dateTimeConverter(value, fieldType);
		} else if (fieldType.equals(Date.class) && value.isEmpty() == false && value != null) {
			return dateTimeConverter(value, fieldType);
		} else if (fieldType.equals(Long.class) && value.isEmpty() == false && value != null) {
			return Long.parseLong(value);
		} else {
			return value;
		}
	}

	private Object dateTimeConverter(String dateString, Class<?> type) {
		SimpleDateFormat dateFormat;
		if (type.equals(Date.class)) {
			dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		} else if (type.equals(Timestamp.class)) {
			dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		} else {
			throw new IllegalArgumentException("Unsupported date type: " + type);
		}
 
		try {
			Date parsedDate = (Date) dateFormat.parse(dateString);
			if (type.equals(Date.class)) {
				return type.cast(parsedDate);
			} else if (type.equals(Timestamp.class)) {
				return type.cast(new Timestamp(parsedDate.getTime()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
 
		return null;
	}

	@Override
	public String updatePolCharge(ProposalEntryRequest proposalEntryRequest, Integer polChargeId) {
		JSONObject response = new JSONObject();

		try {
			Optional<LT_POL_CHARGE> optionalUser = polChargeRepo.findById(polChargeId);
			LT_POL_CHARGE polCharge = optionalUser.get();
			if (polCharge != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", proposalEntryRequest.getPolicyDetails().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setPolChargeFields(polCharge, entry.getValue());
				}

				try {
					LT_POL_CHARGE savedPolChargeDetails = polChargeRepo.save(polCharge);
					response.put(statusCode, successCode);
					response.put(messageCode, "Policy Charge Details Updated Successfully");
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
	public String deletePolChargeById(Integer polBeneficiaryId) {
		try {
			Optional<LT_POL_CHARGE> optionalEntity = polChargeRepo.findById(polBeneficiaryId);

			if (optionalEntity.isPresent()) {
				polChargeRepo.deleteById(polBeneficiaryId);

				JSONObject response = new JSONObject();
				response.put(statusCode, successCode);
				response.put(messageCode, "Record with ID " + polBeneficiaryId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put(statusCode, errorCode);
				response.put(messageCode, "Record with ID " + polBeneficiaryId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put(statusCode, errorCode);
			response.put(messageCode, "Error deleting record with ID " + polBeneficiaryId + ": " + e.getMessage());
			return response.toString();
		}
	}

}
