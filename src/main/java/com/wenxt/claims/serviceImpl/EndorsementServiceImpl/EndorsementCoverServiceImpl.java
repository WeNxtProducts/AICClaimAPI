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
import com.wenxt.claims.model.Endorsement.LT_ENDT_REQ_COVER;
import com.wenxt.claims.repository.Endorsement.EndtCoverRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.EndorsementService.EndorsementCoverService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class EndorsementCoverServiceImpl implements EndorsementCoverService {
	
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
	private EndtCoverRepository endtCoverRepo;

	@Override
	public String save(EndorsementRequest endtRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_ENDT_REQ_COVER endtCover = new LT_ENDT_REQ_COVER();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", endtRequest.getEndtCover().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(endtCover, LT_ENDT_REQ_COVER.class, entry.getValue());
			}

			try {
				LT_ENDT_REQ_COVER savedEndtCoverDetails = endtCoverRepo.save(endtCover);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Endoorsement Cover created successfully");
				data.put("Id", savedEndtCoverDetails.getPEC_TRAN_ID());
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
			Optional<LT_ENDT_REQ_COVER> optionalUser = endtCoverRepo.findById(tranId);
			LT_ENDT_REQ_COVER endtCover = optionalUser.get();
			if (endtCover != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				if(endtRequest.getEndtCover() != null) {
					fieldMaps.put("frontForm", endtRequest.getEndtCover().getFormFields());
					}else {
						fieldMaps.put("frontForm", endtRequest.getEndtCover().getFormFields());
					}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (endtCover, LT_ENDT_REQ_COVER.class, entry.getValue());
				}

				try {
					LT_ENDT_REQ_COVER savedEndtCoverDetails = endtCoverRepo.save(endtCover);
					response.put(statusCode, successCode);
					response.put(messageCode, "Endorsement Cover Details Updated Successfully");
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
			Optional<LT_ENDT_REQ_COVER> optionalEntity = endtCoverRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				endtCoverRepo.deleteById(tranId);

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
	public String get(Integer tranId, HttpServletRequest request)throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_ENDT_REQ_COVER> optionalUser = endtCoverRepo.findById(tranId);
		LT_ENDT_REQ_COVER endtCover = optionalUser.get();
		if (endtCover != null) {
			for (int i = 0; i < endtCover.getClass().getDeclaredFields().length; i++) {
				Field field = endtCover.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(endtCover);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
		}

}
