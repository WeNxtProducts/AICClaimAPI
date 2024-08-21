package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wenxt.claims.model.LT_INSTALL_HDR;
import com.wenxt.claims.model.LT_POLICY;
import com.wenxt.claims.model.ReceiptRequest;
import com.wenxt.claims.repository.InstallHdrRepository;
import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.InstallHdrService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class InstallHdrServiceImpl implements InstallHdrService {

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
	private JwtService jwtService;
	
	@Autowired
	private InstallHdrRepository installHdrRepo;
	
	@Autowired
	private CommonService commonService;
	
	@Override
	public String save(ReceiptRequest receiptRequest, HttpServletRequest request) {
		
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		
		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			LT_INSTALL_HDR installHeader = new LT_INSTALL_HDR();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			if (receiptRequest.getInstallHdr() != null) {
				fieldMaps.put("frontForm", receiptRequest.getInstallHdr().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {					
					commonService.setFields(installHeader, LT_INSTALL_HDR.class, entry.getValue());
				}
			}
				
				AuthRequest authRequest = jwtService.getLoggedInDetails(token);
				
				installHeader.setIH_INS_DT(new Date(System.currentTimeMillis()));
				installHeader.setIH_INS_UID(authRequest.getUsername());
				LT_INSTALL_HDR savedInstallHdrDetails = installHdrRepo.save(installHeader);
				response.put(statusCode, successCode);
				response.put(messageCode, "Install Header Details Created Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	@Override
	public String update(ReceiptRequest receiptRequest, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		
		AuthRequest userDetails = jwtService.getLoggedInDetails(token);
		try {
			Optional<LT_INSTALL_HDR> optionalUser = installHdrRepo.findById(tranId);
			LT_INSTALL_HDR installHeader = optionalUser.get();
			if (installHeader != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", receiptRequest.getInstallHdr().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(installHeader, LT_INSTALL_HDR.class, entry.getValue());
				}

				try {
					installHeader.setIH_MOD_DT(new Date(System.currentTimeMillis()));
					installHeader.setIH_MOD_UID(userDetails.getUsername());
					LT_INSTALL_HDR savedInstallHeader = installHdrRepo.save(installHeader);
					response.put(statusCode, successCode);
					response.put(messageCode, "Install Header Details Updated Successfully");
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
			Optional<LT_INSTALL_HDR> installHdrDetails = installHdrRepo.findById(tranId);

			if (installHdrDetails.isPresent()) {
				installHdrRepo.deleteById(tranId);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + tranId + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + tranId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + tranId + ": " + e.getMessage());
			return response.toString();
		}
	}

	@Override
	public String get(Integer tranId)throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_INSTALL_HDR> optionalUser = installHdrRepo.findById(tranId);
		LT_INSTALL_HDR installHdr = optionalUser.get();
		if (installHdr != null) {
			for (int i = 0; i < installHdr.getClass().getDeclaredFields().length; i++) {
				Field field = installHdr.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(installHdr);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
	}

}
