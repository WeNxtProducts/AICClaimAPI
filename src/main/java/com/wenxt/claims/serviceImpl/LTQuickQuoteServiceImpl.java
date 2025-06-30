package com.wenxt.claims.serviceImpl;

import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wenxt.claims.model.EmployeeDTO;
import com.wenxt.claims.model.EmployeeValidationsRequest;
import com.wenxt.claims.model.LTQuickQuoteRequest;
import com.wenxt.claims.model.LT_QUICK_QUOTE;
import com.wenxt.claims.repository.LTQuickQuoteRepository;
import com.wenxt.claims.service.CommonService;
import com.wenxt.claims.service.LTQuickQuoteService;
import com.wenxt.claims.utils.ExcelUtils;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class LTQuickQuoteServiceImpl implements LTQuickQuoteService {
	
	static ExcelUtils utils = new ExcelUtils();

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
	private LTQuickQuoteRepository quickQuoteRepo;

	@Override
	public String save(LTQuickQuoteRequest quickQuoteRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		try {
			LT_QUICK_QUOTE quickQuote = new LT_QUICK_QUOTE();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			fieldMaps.put("frontForm", quickQuoteRequest.getQuickQuoteDetails().getFormFields());
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				commonService.setFields(quickQuote, LT_QUICK_QUOTE.class, entry.getValue());
			}

			LT_QUICK_QUOTE savedquickQuoteDetails = quickQuoteRepo.save(quickQuote);

			data.put("Id", savedquickQuoteDetails.getQUOT_TRAN_ID());
			response.put(statusCode, successCode);
			response.put(messageCode, "Quick Quote Data Saved Successfully");
			response.put(dataCode, data);
			return response.toString();
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getLocalizedMessage());
			return response.toString();
		}
	}

	@Override
	public String update(LTQuickQuoteRequest quickQuoteRequest, Long tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		try {
			Optional<LT_QUICK_QUOTE> savedQuickQuoteDetails = quickQuoteRepo.findById(tranId);

			if (savedQuickQuoteDetails.isPresent()) {
				LT_QUICK_QUOTE saveQuickQuote = savedQuickQuoteDetails.get();

				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", quickQuoteRequest.getQuickQuoteDetails().getFormFields());

				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					commonService.setFields(saveQuickQuote, LT_QUICK_QUOTE.class, entry.getValue());
				}

				quickQuoteRepo.save(saveQuickQuote);
				response.put(statusCode, successCode);
				data.put("Id", savedQuickQuoteDetails.get().getQUOT_TRAN_ID());
				response.put(messageCode, "Quick Quote Data Updated Successfully");
				response.put(dataCode, data);
			} else {
				response.put(statusCode, errorCode);
				response.put(messageCode, "Quick Quote Details with Given ID not found");
			}
			return response.toString();
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getLocalizedMessage());
			return response.toString();
		}
	}

	@Override
	public String delete(Long tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		try {
			Optional<LT_QUICK_QUOTE> optionalEntity = quickQuoteRepo.findById(tranId);

			if (optionalEntity.isPresent()) {
				quickQuoteRepo.deleteById(tranId);

				response.put(statusCode, successCode);
				response.put(messageCode, "Record with ID " + tranId + " deleted successfully");

			} else {
				response.put(statusCode, errorCode);
				response.put(messageCode, "Record with ID " + tranId + " not found");
			}
			return response.toString();
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getLocalizedMessage());
			return response.toString();
		}
	}

	@Override
	public String get() {
		JSONObject response = new JSONObject();
		try {

			response.put(statusCode, successCode);
			response.put(messageCode, "Quick Quote Data Fetched Successfully");
			return response.toString();
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getLocalizedMessage());
			return response.toString();
		}
	}

	@Override
	public String employeeValidation(EmployeeValidationsRequest employeeExcel, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		try {
			byte[] decodedBytes = Base64.getDecoder().decode(employeeExcel.getBase64File());
			try (Workbook workbook = new XSSFWorkbook(new ByteArrayInputStream(decodedBytes))) {
				Map<String, JSONObject> jsonObjects = new HashMap<>();
				Map<String, List<Map<String, JSONObject>>> listCovers = new HashMap<>();

//            	List<Map<String, JSONObject>> listJsonObjects = new ArrayList<>();
////            	System.out.println(employeeExcel.getPlans().size());
//            	for(int k=0; k< employeeExcel.getPlans().size(); k++) {
//            		List<PlanDetailsDTO> resList = quickQuoteRepo.findCoverDetails(employeeExcel.getPlans().get(k));
//            		listJsonObjects = new ArrayList<>();
////            		System.out.println(resList.size());
//            		for(PlanDetailsDTO planDet : resList) {
//            			JSONObject jsonObject = new JSONObject();
//            			jsonObject.put("coverCode", planDet.getCoverCode());
//            			jsonObject.put("saType", planDet.getSaType());
//            			            			
//            			jsonObjects.put(planDet.getCoverCode(), jsonObject);
//            		}
//            		listJsonObjects.add(jsonObjects);
//            		listCovers.put(employeeExcel.getPlans().get(k), listJsonObjects);
//            	}
//        		listCovers.put(employeeExcel.getPlans().get(k), listJsonObjects);

//            	System.out.println(listCovers);

				Sheet sheet = workbook.getSheetAt(0);
				
				List<EmployeeDTO> employeesList = new ArrayList<>();

				int rejectedEmployees = 0;
				int acceptedEmployees = 0;
				for (int i = 1; i <= sheet.getLastRowNum(); i++) {
					Row row = sheet.getRow(i);
					if (row == null)
						continue;
					EmployeeDTO emp = new EmployeeDTO();
//					System.out.println(utils.getCellAsString(row, 1));
					
					emp.setSrno(utils.getCellAsInteger(row, 0));
					emp.setEmpId(utils.getCellAsString(row, 1));
					emp.setEmployeeName(row.getCell(2).getStringCellValue());
					emp.setGender(utils.getCellAsString(row, 4));
//					emp.setEmployeeName(utils.getCellAsString(row, 2));
					emp.setPempOccCode(utils.getCellAsString(row, 3));
//					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//					String dateStr = utils.getCellAsString(row, 5); // e.g. "1995-07-09"
//					Date date = sdf.parse(dateStr);
					emp.setEmpDob(utils.getCellAsDateString(row, 5));
//					dateStr = utils.getCellAsString(row, 6);
//					date = sdf.parse(dateStr);
					emp.setEmpEntryDt(utils.getCellAsDateString(row, 6));
					emp.setEmpSalary(utils.getCellAsInteger(row, 7));
					emp.setPempEmpId(utils.getCellAsString(row, 8));
					emp.setPempRelnCode(utils.getCellAsString(row, 9));
					emp.setPempRefNo(utils.getCellAsString(row, 10));
					emp.setPempUpdStatus(utils.getCellAsString(row, 11));
					emp.setPempExitDt(utils.getCellAsDateString(row, 12));
					emp.setPempGrpFlag(utils.getCellAsString(row, 13));
					emp.setPempCvrCode1(utils.getCellAsString(row, 14));
					emp.setEmpCvrSa1(utils.getCellAsString(row, 15));
					emp.setPempCvrCode2(utils.getCellAsString(row, 16));
					emp.setPempCvrSa2(utils.getCellAsString(row, 17));
					emp.setPempCvrCode3(utils.getCellAsString(row, 18));
					emp.setPempCvrSa3(utils.getCellAsString(row, 19));
					emp.setPempCvrCode4(utils.getCellAsString(row, 20));
					emp.setPempCvrSa4(utils.getCellAsString(row, 21));
					emp.setPempCvrCode5(utils.getCellAsString(row, 22));
					emp.setPempCvrSa5(utils.getCellAsString(row, 23));
					emp.setPempCvrCode6(utils.getCellAsString(row, 24));
					emp.setPempCvrSa6(utils.getCellAsString(row, 25));
					emp.setPempCvrCode7(utils.getCellAsString(row, 26));
					emp.setPempCvrSa7(utils.getCellAsString(row, 27));
					emp.setPempCvrCode8(utils.getCellAsString(row, 28));
					emp.setPempCvrSa8(utils.getCellAsString(row, 39));
					emp.setPempCvrCode9(utils.getCellAsString(row, 30));
					emp.setPempCvrSa9(utils.getCellAsString(row, 31));
					emp.setPempCvrCode10(utils.getCellAsString(row, 32));
					emp.setPempCvrSa10(utils.getCellAsString(row, 33));
					emp.setPempMaritalStatus(utils.getCellAsString(row, 34));
					emp.setPempLocCode(utils.getCellAsString(row, 35));
					emp.setPempStatus(utils.getCellAsString(row, 36));
					emp.setEmpOccCatg(utils.getCellAsString(row, 37));
					emp.setPempRefId1(utils.getCellAsString(row, 38));
					emp.setPempProfitRate(utils.getCellAsDouble(row, 39));
					emp.setPempProfitRatePer(utils.getCellAsDouble(row, 40));
					emp.setPempLoanTerm(utils.getCellAsString(row, 41));
					emp.setPempParentId(utils.getCellAsString(row, 42));
					emp.setPempMemberType(utils.getCellAsString(row, 43));
					emp.setEmpPlanCode(utils.getCellAsString(row, 44));
					emp.setPempNoOfChild(utils.getCellAsString(row, 45));
					emp.setPempNoOfDep(utils.getCellAsString(row, 46));
					emp.setPempHeight(utils.getCellAsString(row, 47));
					emp.setPempHeightUnit(utils.getCellAsString(row, 48));
					emp.setPempWeight(utils.getCellAsString(row, 49));
					emp.setPempWeightUnit(utils.getCellAsString(row, 50));
					emp.setPempCoverYn(utils.getCellAsString(row, 51));
					emp.setPempEmpStatus(utils.getCellAsString(row, 52));
					emp.setPempEmpNation(utils.getCellAsString(row, 53));
					emp.setPempMop(utils.getCellAsString(row, 54));
					emp.setPempFlex01(utils.getCellAsString(row, 55));
					emp.setPempInceptionDt(utils.getCellAsDateString(row, 56));
					emp.setPempInterestRate(utils.getCellAsDouble(row, 57));
					emp.setPempCertNo(utils.getCellAsString(row, 58));
					emp.setPempFixedSa(utils.getCellAsDouble(row, 59));
					emp.setPempNetSal(utils.getCellAsDouble(row, 60));
					
					employeesList.add(emp);
//                  employees.add(emp);
//                  System.out.println(utils.getCellAsString(row, 44) + " * " + utils.getCellAsString(row, 45));
//					boolean trueFalseFlag = true;
					// Validation One
					// Either Salary, Net Salary and Fixed Sum Assured any one should be not null
					// and above than zero
//                    Double d = Double.parseDouble(utils.getCellAsString(row, 7));
//                    Integer intVal = d.intValue();
//                    System.out.println(intVal);
//                    System.out.println(Double.parseDouble(utils.getCellAsString(row, 7)));
//                    if((utils.getCellAsString(row, 7) != null && Double.parseDouble(utils.getCellAsString(row, 7)) > 0) ||
//                       (utils.getCellAsString(row, 59) != null && Double.parseDouble(utils.getCellAsString(row, 59)) > 0) || 
//                       (utils.getCellAsString(row, 60) != null && Double.parseDouble(utils.getCellAsString(row, 60)) > 0)) {
//                    	acceptedEmployees = acceptedEmployees + 1;
//                    	trueFalseFlag = true;
//                    }else {
//                    	trueFalseFlag = false;
//                    	rejectedEmployees = rejectedEmployees + 1;
//                    	continue;
//                    }

//					trueFalseFlag = validationBasedOnSaType(row, trueFalseFlag, listCovers);

//                    System.out.println(i + " * " + trueFalseFlag);
				}
				ObjectMapper mapper = new ObjectMapper();
		        String json = mapper.writeValueAsString(employeesList);
				System.out.println(json);
//                System.out.println(acceptedEmployees + " * " + rejectedEmployees);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

//	private boolean validationBasedOnSaType(Row row, boolean trueFalseFlag,
//			Map<String, List<Map<String, JSONObject>>> listCovers) {
//
////		System.out.println(utils.getCellAsString(row, 44) + listCovers);
//		if (utils.getCellAsString(row, 44) != null) {
//			for (Map<String, JSONObject> list : listCovers.get(utils.getCellAsString(row, 44))) {
//				System.out.println("FOR: " + list);
//			}
//		}
//		return false;
//	}

}
