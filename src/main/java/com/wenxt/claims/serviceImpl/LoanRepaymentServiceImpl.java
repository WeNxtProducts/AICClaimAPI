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
import com.wenxt.claims.model.LT_LOAN_REPAYMENT;
import com.wenxt.claims.model.LoanRequest;
import com.wenxt.claims.repository.LoanRepymtRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.LoanRepaymentService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class LoanRepaymentServiceImpl implements LoanRepaymentService {
	
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
	private LoanRepymtRepository loanRepymtRepo;

	@Override
	public String save(LoanRequest loanRequest, HttpServletRequest servletRequest) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_LOAN_REPAYMENT loanRepymt = new LT_LOAN_REPAYMENT();
			
			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", loanRequest.getLoanRepymt().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(loanRepymt, LT_LOAN_REPAYMENT.class, entry.getValue());
			}

			try {
				LT_LOAN_REPAYMENT savedLoanRepymtDetails = loanRepymtRepo.save(loanRepymt);
				response.put(statusCode, successCode);
				response.put(messageCode,
						 "Loan Repayment Details created successfully");
				data.put("Id", savedLoanRepymtDetails.getLR_TRAN_ID());
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
			Optional<LT_LOAN_REPAYMENT> optionalUser = loanRepymtRepo.findById(tranId);
			LT_LOAN_REPAYMENT loanRepymt = optionalUser.get();
			if (loanRepymt != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				if(loanRequest.getLoanRepymt() != null) {
					fieldMaps.put("frontForm", loanRequest.getLoanRepymt().getFormFields());
					}
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields (loanRepymt, LT_LOAN_REPAYMENT.class, entry.getValue());
				}

				try {
					LT_LOAN_REPAYMENT savedLoanRepymtDetails = loanRepymtRepo.save(loanRepymt);
					response.put(statusCode, successCode);
					response.put(messageCode, "Loan Repayment Details Updated Successfully");
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
			Optional<LT_LOAN_REPAYMENT> optionalEntity = loanRepymtRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				loanRepymtRepo.deleteById(tranId);

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
	public String get(Integer tranId, HttpServletRequest servletRequest)throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_LOAN_REPAYMENT> optionalUser = loanRepymtRepo.findById(tranId);
		LT_LOAN_REPAYMENT loan = optionalUser.get();
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
		return inputObject.toString();
		}

}
