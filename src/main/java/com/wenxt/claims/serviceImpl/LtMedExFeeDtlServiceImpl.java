package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LT_LOAN;
import com.wenxt.claims.model.LT_MEDEX_FEE_DTL;
import com.wenxt.claims.model.LtmedFeeRequest;
import com.wenxt.claims.repository.LtMedExFeeDtlRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.LtMedExFeeDtlService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class LtMedExFeeDtlServiceImpl implements LtMedExFeeDtlService {

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
	private LtMedExFeeDtlRepository ltfeeDtlRepository;

	@Autowired
	private CommonService commonService;

	@Override
	public String saveMedExFeeDtl(LtmedFeeRequest medRequest, HttpServletRequest servletRequest) {

		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_MEDEX_FEE_DTL medFeeDtl = new LT_MEDEX_FEE_DTL();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", medRequest.getMedFee().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(medFeeDtl, LT_MEDEX_FEE_DTL.class, entry.getValue());
			}

			try {
				LT_MEDEX_FEE_DTL saveMedDetails = ltfeeDtlRepository.save(medFeeDtl);
				response.put(statusCode, successCode);
				response.put(messageCode, "Medical fee Details created successfully");
				data.put("Id", saveMedDetails.getMFD_TRAN_ID());
				response.put("data", data);
			} catch (Exception e) {
				response.put("statusCode", errorCode);
				response.put("message", "An error occurred: " + e.getMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();

	}

	@Override
	public String updateMedfee(LtmedFeeRequest medRequest, Integer tranId, HttpServletRequest servletRequest) {

		JSONObject response = new JSONObject();

		try {
			Optional<LT_MEDEX_FEE_DTL> optionalUser = ltfeeDtlRepository.findById(tranId);
			LT_MEDEX_FEE_DTL medFee = optionalUser.get();
			if (medFee != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				if (medRequest.getMedFee() != null) {
					fieldMaps.put("frontForm", medRequest.getMedFee().getFormFields());
				}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(medFee, LT_MEDEX_FEE_DTL.class, entry.getValue());
				}

				try {
					LT_MEDEX_FEE_DTL savedLoanDetails = ltfeeDtlRepository.save(medFee);
					response.put(statusCode, successCode);
					response.put(messageCode, "Medical Fee Details Updated Successfully");
				} catch (Exception e) {
					response.put(statusCode, errorCode);
					response.put(messageCode, "An error occurred: " + e.getMessage());
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
	public String deleteMedfee(Integer tranId, HttpServletRequest servletRequest) {

		try {
			Optional<LT_MEDEX_FEE_DTL> optionalEntity = ltfeeDtlRepository.findById(tranId);

			if (optionalEntity.isPresent()) {
				ltfeeDtlRepository.deleteById(tranId);

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
	public String getMedFee(Integer tranId, HttpServletRequest request) throws IllegalArgumentException, IllegalAccessException {

		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject response = new JSONObject();
		JSONObject inputObject = new JSONObject();
		Optional<LT_MEDEX_FEE_DTL> optionalUser = ltfeeDtlRepository.findById(tranId);
		LT_MEDEX_FEE_DTL medfee = optionalUser.get();
		if (medfee != null) {
			for (int i = 0; i < medfee.getClass().getDeclaredFields().length; i++) {
				Field field = medfee.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(medfee);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		response.put(statusCode, successCode);
		response.put(dataCode, inputObject);
		response.put(messageCode, "Medical Fee Details Fetched Successfully");
		return response.toString();

	}

}
