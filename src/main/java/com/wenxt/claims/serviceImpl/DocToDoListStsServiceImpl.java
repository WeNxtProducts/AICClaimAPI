package com.wenxt.claims.serviceImpl;

import java.util.Date;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LtDocTodoListStatus;
import com.wenxt.claims.model.SaveDocToDoList;
import com.wenxt.claims.repository.LtDocToDoListRepo;
import com.wenxt.claims.service.DocToDoListStsService;

@Service
public class DocToDoListStsServiceImpl implements DocToDoListStsService {
	
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
	private LtDocToDoListRepo docToDoListRepo;

	@Override
	public String saveStatus(SaveDocToDoList saveDocListRequest) {
		JSONObject response = new JSONObject();
		
		try {
		for(int i=0; i<saveDocListRequest.getDoListRequest().size(); i++) {
			LtDocTodoListStatus docToDoListStatus = new LtDocTodoListStatus();
			
			docToDoListStatus.setDTLS_QUOT_TRAN_ID(saveDocListRequest.getDoListRequest().get(i).getDTLS_QUOT_TRAN_ID());
			docToDoListStatus.setDTLS_TODO_LIST_ITEM(saveDocListRequest.getDoListRequest().get(i).getDTLS_TODO_LIST_ITEM());
			docToDoListStatus.setDTLS_APPR_STS(saveDocListRequest.getDoListRequest().get(i).getDTLS_APPR_STS());
			docToDoListStatus.setDTLS_INS_DT(new Date());
			docToDoListStatus.setDTLS_GROUP_CODE("CHKLST");
			
			docToDoListRepo.save(docToDoListStatus);
		}
		response.put(statusCode, successCode);
		response.put(messageCode, "Documents Status Saved Successfully");
		
		return response.toString();
		}catch(Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getLocalizedMessage());
			
			return response.toString();
		}
	}

	@Override
	public String updateStatus(SaveDocToDoList saveDocListRequest) {
		JSONObject response = new JSONObject();
		
		try {
		for(int i=0; i<saveDocListRequest.getDoListRequest().size(); i++) {
			LtDocTodoListStatus docToDoListStatus = docToDoListRepo.getById(saveDocListRequest.getDoListRequest().get(i).getDTLS_TRAN_ID());

			docToDoListStatus.setDTLS_APPR_STS(saveDocListRequest.getDoListRequest().get(i).getDTLS_APPR_STS());
			docToDoListStatus.setDTLS_MOD_DT(new Date());
			
			docToDoListRepo.save(docToDoListStatus);
		}
		response.put(statusCode, successCode);
		response.put(messageCode, "Documents Status Saved Successfully");
		
		return response.toString();
		}catch(Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getLocalizedMessage());
			
			return response.toString();
		}
	}

}
