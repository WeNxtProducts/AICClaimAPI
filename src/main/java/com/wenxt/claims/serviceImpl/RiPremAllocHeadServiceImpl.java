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

import com.wenxt.claims.model.LT_RI_PREM_ALLOC_HEAD;
import com.wenxt.claims.model.RIRequestDTO;
import com.wenxt.claims.repository.RiPremAllocHeadRepository;
import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.RiPremAllocHeadService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class RiPremAllocHeadServiceImpl implements RiPremAllocHeadService {
	
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
	private RiPremAllocHeadRepository premAllocHeadRepo;
	
	@Autowired
	private JwtService jwtService;
	
	public String save(RIRequestDTO riRequestDTO, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			LT_RI_PREM_ALLOC_HEAD premAlloc = new LT_RI_PREM_ALLOC_HEAD();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", riRequestDTO.getRiPremAllocHead().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(premAlloc, LT_RI_PREM_ALLOC_HEAD.class, entry.getValue());
			}

			try {
				AuthRequest userDetails = jwtService.getLoggedInDetails(token);
				premAlloc.setRPAH_INS_DT(new Date(System.currentTimeMillis()));
				premAlloc.setRPAH_INS_ID(userDetails.getUsername());
				LT_RI_PREM_ALLOC_HEAD savedRiPremAllocHeadDetails = premAllocHeadRepo.save(premAlloc);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Premium Allocation Head Details created successfully");
				data.put("Id", savedRiPremAllocHeadDetails.getRPAH_TRAN_ID());
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
	public String update(RIRequestDTO riRequestDTO, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		
		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			Optional<LT_RI_PREM_ALLOC_HEAD> optionalUser = premAllocHeadRepo.findById(tranId);
			LT_RI_PREM_ALLOC_HEAD premAlloc = optionalUser.get();
			if (premAlloc != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				if(riRequestDTO.getRiPremAllocHead() != null) {
					fieldMaps.put("frontForm", riRequestDTO.getRiPremAllocHead().getFormFields());
					}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (premAlloc, LT_RI_PREM_ALLOC_HEAD.class, entry.getValue());
				}

				try {
					AuthRequest userDetails = jwtService.getLoggedInDetails(token);
					premAlloc.setRPAH_MOD_DT(new Date(System.currentTimeMillis()));
					premAlloc.setRPAH_MOD_ID(userDetails.getUsername());
					LT_RI_PREM_ALLOC_HEAD savedpremAllocDetails = premAllocHeadRepo.save(premAlloc);
					response.put(statusCode, successCode);
					response.put(messageCode, "Premium Allocation Details Updated Successfully");
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
			Optional<LT_RI_PREM_ALLOC_HEAD> optionalEntity = premAllocHeadRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				premAllocHeadRepo.deleteById(tranId);

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
	public String get(Integer tranId, HttpServletRequest request) {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject response = new JSONObject();
		JSONObject inputObject = new JSONObject();
		try {
		Optional<LT_RI_PREM_ALLOC_HEAD> optionalUser = premAllocHeadRepo.findById(tranId);
		LT_RI_PREM_ALLOC_HEAD premAlloc = optionalUser.get();
		if (premAlloc != null) {
			for (int i = 0; i < premAlloc.getClass().getDeclaredFields().length; i++) {
				Field field = premAlloc.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(premAlloc);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
			response.put(statusCode, successCode);
			response.put(messageCode, "Premium Allocation Values Fetched Successfully");
			response.put(dataCode, inputObject);
		}
		}catch(Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

}
