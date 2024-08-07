package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
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

import com.wenxt.claims.model.LT_POL_BENEFICIARY;
import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.repository.LtPolBeneficiaryRepository;
import com.wenxt.claims.service.LtPolBeneficiaryService;

import jakarta.persistence.Column;

@Service
public class LtPolBeneficiaryServiceImpl implements LtPolBeneficiaryService {
	
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
	private LtPolBeneficiaryRepository polBeneficiaryRepo;

	@Override
	public String createPolBeneficiary(ProposalEntryRequest proposalEntryRequest, Integer tranId, Integer poltranId) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_POL_BENEFICIARY polBeneficiary = new LT_POL_BENEFICIARY();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			if(proposalEntryRequest.getPolBeneficiaryDetails() != null) {
			fieldMaps.put("frontForm", proposalEntryRequest.getPolBeneficiaryDetails().getFormFields());
			}else {
				fieldMaps.put("frontForm", proposalEntryRequest.getPolBeneficiaryDetails().getFormFields());
			}
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setPolBeneficiaryFields(polBeneficiary, entry.getValue());
			}

			try {
				polBeneficiary.setPGBEN_POL_TRAN_ID(tranId);
				if(poltranId != null) {
				polBeneficiary.setPGBEN_PEMP_TRAN_ID(poltranId);
				}
				polBeneficiary.setPGBEN_INS_DT(new Date(System.currentTimeMillis()));
				LT_POL_BENEFICIARY savedPolBeneficiaryDetails = polBeneficiaryRepo.save(polBeneficiary);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Policy Beneficiary Details Saved Successfully");
				data.put("Id", savedPolBeneficiaryDetails.getPGBEN_TRAN_ID());
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
	
	private void setPolBeneficiaryFields(LT_POL_BENEFICIARY polBeneficiary, Map<String, String> value)throws Exception {
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setPolBeneficiaryField(polBeneficiary, entry.getKey(), entry.getValue());
		}
	}

	private void setPolBeneficiaryField(LT_POL_BENEFICIARY polBeneficiary, String key, String value)throws Exception {
		try {
			Field field = LT_POL_BENEFICIARY.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = LT_POL_BENEFICIARY.class.getMethod(setterMethodName, fieldType);
				setter.invoke(polBeneficiary, convertedValue);
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
	public String updatePolBeneficiary(ProposalEntryRequest proposalEntryRequest, Integer polBeneficiaryId) {
		JSONObject response = new JSONObject();

		try {
			Optional<LT_POL_BENEFICIARY> optionalUser = polBeneficiaryRepo.findById(polBeneficiaryId);
			LT_POL_BENEFICIARY polBeneficiary = optionalUser.get();
			if (polBeneficiary != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", proposalEntryRequest.getPolBeneficiaryDetails().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setPolBeneficiaryFields(polBeneficiary, entry.getValue());
				}

				try {
					polBeneficiary.setPGBEN_MOD_DT(new Date(System.currentTimeMillis()));
					LT_POL_BENEFICIARY savedPolChargeDetails = polBeneficiaryRepo.save(polBeneficiary);
					response.put(statusCode, successCode);
					response.put(messageCode, "Policy Beneficiary Details Updated Successfully");
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
	public String deletePolBeneficiaryById(Integer polBeneficiaryId) {
		try {
			Optional<LT_POL_BENEFICIARY> optionalEntity = polBeneficiaryRepo.findById(polBeneficiaryId);

			if (optionalEntity.isPresent()) {
				polBeneficiaryRepo.deleteById(polBeneficiaryId);

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

	@Override
	public String getPolBeneficiaryById(Integer polBeneficiaryId)throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_POL_BENEFICIARY> optionalUser = polBeneficiaryRepo.findById(polBeneficiaryId);
		LT_POL_BENEFICIARY polBeneficiary = optionalUser.get();
		if (polBeneficiary != null) {
			for (int i = 0; i < polBeneficiary.getClass().getDeclaredFields().length; i++) {
				Field field = polBeneficiary.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(polBeneficiary);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
		}

}
