package com.wenxt.claims.serviceImpl.EndorsementServiceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.Endorsement.EndorsementRequest;
import com.wenxt.claims.model.Endorsement.LT_ENDT_REQ_BENF;
import com.wenxt.claims.model.Endorsement.LT_ENDT_REQ_COVER;
import com.wenxt.claims.repository.Endorsement.EndtBeneficiaryRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.EndorsementService.BeneficiaryService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {
	
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
	private EndtBeneficiaryRepository endtBenfRepo;
	
	@Override
	public String save(EndorsementRequest endtRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_ENDT_REQ_BENF endtBenf = new LT_ENDT_REQ_BENF();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", endtRequest.getEndtBenf().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(endtBenf, LT_ENDT_REQ_BENF.class, entry.getValue());
			}

			try {
				LT_ENDT_REQ_BENF savedEndtBenfDetails = endtBenfRepo.save(endtBenf);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Endoorsement Beneficiary created successfully");
				data.put("Id", savedEndtBenfDetails.getPGBEN_TRAN_ID());
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
	public String update(Integer tranId, EndorsementRequest endtRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		try {
			Optional<LT_ENDT_REQ_BENF> optionalUser = endtBenfRepo.findById(tranId);
			LT_ENDT_REQ_BENF endtBenf = optionalUser.get();
			if (endtBenf != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				if(endtRequest.getEndtBenf() != null) {
					fieldMaps.put("frontForm", endtRequest.getEndtBenf().getFormFields());
					}else {
						fieldMaps.put("frontForm", endtRequest.getEndtBenf().getFormFields());
					}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (endtBenf, LT_ENDT_REQ_BENF.class, entry.getValue());
				}

				try {
					LT_ENDT_REQ_BENF savedEndtBenfDetails = endtBenfRepo.save(endtBenf);
					response.put(statusCode, successCode);
					response.put(messageCode, "Endorsement Beneficiary Details Updated Successfully");
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
	public String delete(Integer tranId, HttpServletRequest request) {
		try {
			Optional<LT_ENDT_REQ_BENF> optionalEntity = endtBenfRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				endtBenfRepo.deleteById(tranId);

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
	public String get(Integer tranId, HttpServletRequest request) throws Exception{
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_ENDT_REQ_BENF> optionalUser = endtBenfRepo.findById(tranId);
		LT_ENDT_REQ_BENF endtBenf = optionalUser.get();
		if (endtBenf != null) {
			for (int i = 0; i < endtBenf.getClass().getDeclaredFields().length; i++) {
				Field field = endtBenf.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(endtBenf);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
		}

}
