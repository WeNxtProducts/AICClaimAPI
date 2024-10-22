package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
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

import com.wenxt.claims.model.LT_MEDEX_DTL;
import com.wenxt.claims.model.LT_MEDEX_FEE_DTL;
import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.repository.MedExDtlRepository;
import com.wenxt.claims.repository.MedExFeeDtlRepository;
import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.MedExFeeDtlService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class MedExFeeDtlServiceImpl implements MedExFeeDtlService {
	
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
	private MedExFeeDtlRepository feeDtlRepository;
	
	@Autowired
	private MedExDtlRepository medExDtlRepo;
	
	@Autowired
	private JwtService jwtService;

	@Override
	public String saveMedExFeeDtl(ProposalEntryRequest proposalEntryRequest, Integer tranId, Integer emptranId, Integer mhtranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_MEDEX_FEE_DTL medicalDetails = new LT_MEDEX_FEE_DTL();
			LT_MEDEX_DTL medDetails = new LT_MEDEX_DTL();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			if(proposalEntryRequest.getMedicalDetails() != null) {
			fieldMaps.put("frontForm", proposalEntryRequest.getMedicalDetails().getFormFields());
			}else {
				fieldMaps.put("frontForm", proposalEntryRequest.getMedicalDetails().getFormFields());
			}
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setmedicalFeeDetailsFields(medicalDetails, entry.getValue());
				setmedicalDetailsFields(medDetails, entry.getValue());
			}

			try {
				String authorizationHeader = request.getHeader("Authorization");
				String token = authorizationHeader.substring(7).trim();
				AuthRequest userDetails = jwtService.getLoggedInDetails(token);

				
				medDetails.setMD_INS_DT(new Date(System.currentTimeMillis()));
				medDetails.setMD_POL_TRAN_ID(tranId);
				medDetails.setMD_PEMP_TRAN_ID(emptranId);
				medDetails.setMD_MH_TRAN_ID(mhtranId);
				medDetails.setMD_INS_ID(userDetails.getUsername());
				LT_MEDEX_DTL savedMedicalDetails = medExDtlRepo.save(medDetails);
				
				
				medicalDetails.setMFD_INS_DT(new Date(System.currentTimeMillis()));
				medicalDetails.setMFD_POL_TRAN_ID(tranId);
				medicalDetails.setMFD_MH_TRAN_ID(mhtranId);
				medicalDetails.setMFD_PEMP_TRAN_ID(emptranId);
				medicalDetails.setMFD_INS_ID(userDetails.getUsername());
				medicalDetails.setMFD_MD_TRAN_ID(savedMedicalDetails.getMD_TRAN_ID());

				LT_MEDEX_FEE_DTL savedmedicalDetails = feeDtlRepository.save(medicalDetails);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Medical Details Created Successfully");
				data.put("Id", savedmedicalDetails.getMFD_TRAN_ID());
				response.put(dataCode, data);
			} catch (Exception e) {
				response.put(statusCode, errorCode);
				response.put(messageCode, "An error occurred: " + e.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put(statusCode, errorCode);
			response.put(messageCode, "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	private void setmedicalFeeDetailsFields(LT_MEDEX_FEE_DTL medicalDetails, Map<String, String> value)throws Exception {
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setmedicalFeeDetailsField(medicalDetails, entry.getKey(), entry.getValue());
		}
	}

	private void setmedicalFeeDetailsField(LT_MEDEX_FEE_DTL medicalDetails, String key, String value)throws Exception {
		try {
			Field field = LT_MEDEX_FEE_DTL.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = LT_MEDEX_FEE_DTL.class.getMethod(setterMethodName, fieldType);
				setter.invoke(medicalDetails, convertedValue);
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
	
	private void setmedicalDetailsFields(LT_MEDEX_DTL medicalDetails, Map<String, String> value)throws Exception {
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setmedicalDetailsField(medicalDetails, entry.getKey(), entry.getValue());
		}
	}

	private void setmedicalDetailsField(LT_MEDEX_DTL medicalDetails, String key, String value)throws Exception {
		try {
			Field field = LT_MEDEX_DTL.class.getDeclaredField(key);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = LT_MEDEX_DTL.class.getMethod(setterMethodName, fieldType);
				setter.invoke(medicalDetails, convertedValue);
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String updateMedExFeeDtl(ProposalEntryRequest proposalEntryRequest, Integer tranId) {
		JSONObject response = new JSONObject();

		try {
			Optional<LT_MEDEX_DTL> optionalUser = medExDtlRepo.findById(tranId);
			Optional<LT_MEDEX_FEE_DTL> feeDetail = feeDtlRepository.findByMedId(tranId);
			LT_MEDEX_FEE_DTL feeDetails = feeDetail.get();
			LT_MEDEX_DTL medicalDetails = optionalUser.get();
			if (medicalDetails != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", proposalEntryRequest.getMedicalDetails().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setmedicalDetailsFields(medicalDetails, entry.getValue());
					if(feeDetails != null) {
						setmedicalFeeDetailsFields(feeDetails, entry.getValue());
					}
				}

				try {
					medicalDetails.setMD_MOD_DT(new Date(System.currentTimeMillis()));
					feeDetails.setMFD_MOD_DT(new Date(System.currentTimeMillis()));
					feeDtlRepository.save(feeDetails);
					LT_MEDEX_DTL savedMedicalDetails = medExDtlRepo.save(medicalDetails);
					response.put(statusCode, successCode);
					response.put(messageCode, "Pol Employee Details Updated Successfully");
				} catch (Exception e) {
					response.put("statusCode", errorCode);
					response.put("message", "An error occurred: " + e.getMessage());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put(statusCode, errorCode);
			response.put(messageCode, "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	@Override
	public String deleteMedicalDetails(Integer tranId) {
		try {
			Optional<LT_MEDEX_DTL> medicalDetails = medExDtlRepo.findById(tranId);

			if (medicalDetails.isPresent()) {
				Optional<LT_MEDEX_FEE_DTL> feeDetails = feeDtlRepository.findByMedId(tranId);
//				if(feeDetails.isPresent()) {
//					feeDtlRepository.deleteById(feeDetails.get().getMFD_TRAN_ID());
//				}
				medExDtlRepo.deleteById(tranId);

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
	public String getMedicalDetails(Integer tranId)throws Exception {
		System.out.println("TRANID: " + tranId);
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject response = new JSONObject();
		JSONObject inputObject = new JSONObject();
		Optional<LT_MEDEX_DTL> optionalUser = medExDtlRepo.findById(tranId);
		Optional<LT_MEDEX_FEE_DTL> feeDetail = feeDtlRepository.findByMedId(tranId);
		LT_MEDEX_FEE_DTL feeDetails = feeDetail.get();
		LT_MEDEX_DTL medicalDetails = optionalUser.get();
		if (medicalDetails != null) {
			System.out.println("IN IF");
			for (int i = 0; i < medicalDetails.getClass().getDeclaredFields().length; i++) {
				Field field = medicalDetails.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(medicalDetails);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
			if(feeDetails != null) {
				for (int i = 0; i < feeDetails.getClass().getDeclaredFields().length; i++) {
					Field field = feeDetails.getClass().getDeclaredFields()[i];
					field.setAccessible(true);
					String columnName = null;
					if (field.isAnnotationPresent(Column.class)) {
						Annotation annotation = field.getAnnotation(Column.class);
						Column column = (Column) annotation;
						Object value = field.get(feeDetails);
						columnName = column.name();
						inputObject.put(columnName, value);
					}
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Medical Details Fetched Successfully");
			response.put(dataCode, inputObject);
			return inputObject.toString();
		}else {
			response.put(statusCode, errorCode);
			response.put(messageCode, "NoValue Found");
		}
		return response.toString();
	}
	
	

}
