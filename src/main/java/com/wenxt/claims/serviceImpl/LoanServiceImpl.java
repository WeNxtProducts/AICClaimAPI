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
import com.wenxt.claims.model.LoanRequest;
import com.wenxt.claims.model.Endorsement.LT_ENDT_REQ_POL;
import com.wenxt.claims.repository.LoanRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.LoanService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class LoanServiceImpl implements LoanService {
	
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
	private LoanRepository loanRepo;

	@Override
	public String save(LoanRequest loanRequest, HttpServletRequest servletRequest) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_LOAN loan = new LT_LOAN();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", loanRequest.getLoan().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(loan, LT_LOAN.class, entry.getValue());
			}

			try {
				LT_LOAN savedLoanDetails = loanRepo.save(loan);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Loan Details created successfully");
				data.put("Id", savedLoanDetails.getLOAN_TRAN_ID());
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
	public String update(LoanRequest loanRequest, Integer tranId, HttpServletRequest servletRequest) {
		JSONObject response = new JSONObject();

		try {
			Optional<LT_LOAN> optionalUser = loanRepo.findById(tranId);
			LT_LOAN loan = optionalUser.get();
			if (loan != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				if(loanRequest.getLoan() != null) {
					fieldMaps.put("frontForm", loanRequest.getLoan().getFormFields());
					}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (loan, LT_LOAN.class, entry.getValue());
				}

				try {
					LT_LOAN savedLoanDetails = loanRepo.save(loan);
					response.put(statusCode, successCode);
					response.put(messageCode, "Loan Details Updated Successfully");
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
	public String delete(Integer tranId, HttpServletRequest servletRequest) {
		try {
			Optional<LT_LOAN> optionalEntity = loanRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				loanRepo.deleteById(tranId);

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
	public String get(Integer tranId, HttpServletRequest request) throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject response = new JSONObject();
		JSONObject inputObject = new JSONObject();
		Optional<LT_LOAN> optionalUser = loanRepo.findById(tranId);
		LT_LOAN loan = optionalUser.get();
		if (loan != null) {
			for (int i = 0; i < loan.getClass().getDeclaredFields().length; i++) {
				Field field = loan.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(loan);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		response.put(statusCode, successCode);
		response.put(dataCode, inputObject);
		response.put(messageCode, "Loan Details Fetched Successfully");
		return inputObject.toString();
		}

}
