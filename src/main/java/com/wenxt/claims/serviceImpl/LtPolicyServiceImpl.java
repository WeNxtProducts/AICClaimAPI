package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.flowable.engine.HistoryService;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngines;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.flowable.task.api.TaskQuery;
import org.flowable.task.api.history.HistoricTaskInstanceQuery;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.ParseException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wenxt.claims.model.LT_POLICY;
import com.wenxt.claims.model.LT_POL_STATUS;
import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.model.SearchRequestDTO;
import com.wenxt.claims.repository.LtPolicyRepository;
import com.wenxt.claims.repository.PolStatusRepository;
import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.ElasticSearchProxy;
import com.wenxt.claims.service.LtPolicyService;

import jakarta.persistence.Column;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class LtPolicyServiceImpl implements LtPolicyService {

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
	private LtPolicyRepository ltPolicyRepo;

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private TaskService taskService;

	@Autowired
	private JwtService jwtService;

	@Autowired
	private HistoryService historyService;
	
	@Autowired
	private PolStatusRepository polStatusRepo;
	
	@Autowired
	private ElasticSearchProxy elasticSearch;

	@Override
	public String createPolicy(ProposalEntryRequest proposalEntryRequest, HttpServletRequest request) {
		
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();
		
		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		try {
			LT_POLICY policy = new LT_POLICY();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			if (proposalEntryRequest.getPolicyDetails() != null) {
				fieldMaps.put("frontForm", proposalEntryRequest.getPolicyDetails().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					Map<String, String> policyDetailsMap = entry.getValue();

					Map<String, Object> queryParams = new HashMap<>();
					queryParams.put("CustCode", policyDetailsMap.get("POL_CUST_CODE"));
					
					Map<String, Object> body = new HashMap<>();
					body.put("queryParams", queryParams);

					JSONObject jsonBody = new JSONObject(body);
					String requestBody = jsonBody.toString();
					
					String url = "http://localhost:8098/common/getMapQuery?queryId=185";
					HttpHeaders headers = new HttpHeaders();
					RestTemplate restTemplate = new RestTemplate();
					headers.setContentType(MediaType.APPLICATION_JSON);
					headers.set("Authorization", "Bearer " + token);
					HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);
					ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
					
					JSONObject object = new JSONObject(responseEntity.getBody());

					JSONArray jsonArray = (JSONArray) object.getJSONArray("Data");
					List<String> values = new ArrayList<>();
					for (int i = 0; i < jsonArray.length(); i++) {
						Iterator<String> keys = ((JSONObject) jsonArray.get(i)).keys();
						while (keys.hasNext()) { 
							String key = keys.next();
							Object value = ((JSONObject) jsonArray.get(i)).get(key);
							policyDetailsMap.put(key, value.toString());
						}
					}
					
					
					setPolicyFields(policy, LT_POLICY.class, policyDetailsMap);
				}
				fieldMaps.put("frontForm", proposalEntryRequest.getInParams());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setPolicyFields(policy, LT_POLICY.class, entry.getValue());
				}
			} 
//			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
//				setPolicyFields(policy, LT_POLICY.class, entry.getValue());
//			}
				Map<String, Object> variables = new HashMap<>();
				variables.put("instance", policy);
				variables.put("queryId", 158);
				variables.put("class", LT_POLICY.class.getName());
				variables.put("token", token);
				variables.put("process", "create");
				
				AuthRequest authRequest = jwtService.getLoggedInDetails(token);
				
				//setting divn, dept & company details
				policy.setPOL_DIVN_CODE(authRequest.getDivision());
				policy.setPOL_DEPT_CODE(authRequest.getDepartment());
				policy.setPOL_COMP_CODE(authRequest.getCompany());
				
				//setting ins id & ins dt 
				policy.setPOL_INS_DT(new Date(System.currentTimeMillis()));
				policy.setPOL_INS_ID(authRequest.getUsername());
				
				//other values to be set while saving
				policy.setPOL_ISSUE_DT(new Date(System.currentTimeMillis()));
				policy.setPOL_LC_SA(policy.getPOL_FC_SA());
				policy.setPOL_LC_ANN_SAL(policy.getPOL_FC_ANN_SAL());
				policy.setPOL_SA_EXCH_RATE(1);
				policy.setPOL_CUST_EXCH_RATE(1);
				policy.setPOL_CUST_CURR_CODE(policy.getPOL_SA_CURR_CODE());
				if(policy.getPOL_ASSR_CUST_FLAG().equals("Yes")) {
					policy.setPOL_ASSRD_REF_ID(policy.getPOL_CUST_REF_ID());
				}else if(policy.getPOL_ASSR_CUST_FLAG().equals("No")){
					Map<String, Object> queryParams = new HashMap<>();
					queryParams.put("CustCode", policy.getPOL_ASSR_CODE());
					
					Map<String, Object> body = new HashMap<>();
					body.put("queryParams", queryParams);

					JSONObject jsonBody = new JSONObject(body);
					String requestBody = jsonBody.toString();
					
					String url = "http://localhost:8098/common/getMapQuery?queryId=191";
					HttpHeaders headers = new HttpHeaders();
					RestTemplate restTemplate = new RestTemplate();
					headers.setContentType(MediaType.APPLICATION_JSON);
					headers.set("Authorization", "Bearer " + token);
					HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);
					ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
					
					JSONObject object = new JSONObject(responseEntity.getBody());

					JSONArray jsonArray = (JSONArray) object.getJSONArray("Data");
					List<String> values = new ArrayList<>();
					for (int i = 0; i < jsonArray.length(); i++) {
						Iterator<String> keys = ((JSONObject) jsonArray.get(i)).keys();
						while (keys.hasNext()) { 
							String key = keys.next();
							Object value = ((JSONObject) jsonArray.get(i)).get(key);
							policy.setPOL_ASSRD_REF_ID(value.toString());
						}
					}
				}
				
//				policy.setPOL_CUST_ADDRESS_1(values.get(0));
							
//				ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("TestProcess", variables);
//
//				Task task = taskService.createTaskQuery().processInstanceId(processInstance.getId()).singleResult();
////				policy = (LT_POLICY) runtimeService.getVariable(processInstance.getId(), "instance");
//				Map<String, Object> taskVariables = new HashMap<>();
//				taskVariables.put("decision", "yes");
//				taskService.complete(task.getId(), taskVariables);

				LT_POLICY savedPolicyDetails = ltPolicyRepo.save(policy);
				response.put(statusCode, successCode);
				response.put(messageCode, "Policy Details Created Successfully");
				data.put("Id", savedPolicyDetails.getPOL_TRAN_ID());
				data.put("P_POL_END_NO_IDX",
						savedPolicyDetails.getPOL_END_NO_IDX() != null ? savedPolicyDetails.getPOL_END_NO_IDX() : "");
				data.put("P_POL_DS_CODE",
						savedPolicyDetails.getPOL_DS_CODE() != null ? savedPolicyDetails.getPOL_DS_CODE() : "");
				data.put("P_POL_DS_TYPE",
						savedPolicyDetails.getPOL_DS_TYPE() != null ? savedPolicyDetails.getPOL_DS_TYPE() : "");
				data.put("PROPOSAL_NO", savedPolicyDetails.getPOL_NO() != null ? savedPolicyDetails.getPOL_NO() : "");
				response.put(dataCode, data);
		} catch (Exception e) {
			e.printStackTrace();
			response.put("statusCode", errorCode);
			response.put("message", "An error occurred: " + e.getMessage());
		}

		return response.toString();
	}

	private void setPolicyFields(Object policy, Class<?> clazz, Map<String, String> value) throws Exception {
		for (Map.Entry<String, String> entry : value.entrySet()) {
			setPolicyField(policy, clazz, entry.getKey(), entry.getValue());
		}
	}

	private void setPolicyField(Object policy, Class<?> clazz, String key, String value) throws Exception {
		try {
			Field field = clazz.getDeclaredField(key);
			field.setAccessible(true);
			Class<?> fieldType = field.getType();
			Object convertedValue = convertStringToObject(value, fieldType);
			String setterMethodName = "set" + key;
			if (value != null && !value.isEmpty()) {
				Method setter = clazz.getMethod(setterMethodName, fieldType);
				setter.invoke(policy, convertedValue);
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
			return dateTimeConverter(value);
		} else if (fieldType.equals(Date.class) && value.isEmpty() == false && value != null) {
			return dateConverter(value);
		} else if (fieldType.equals(Long.class) && value.isEmpty() == false && value != null) {
			return Long.parseLong(value);
		} else {
			return value;
		}
	}

	public Object dateConverter(String value) {
		String dateStr = value;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = (Date) sdf.parse(dateStr);
		} catch (ParseException | java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return date;
	}

	private Object dateTimeConverter(String value) {
		String dateString = value;
		if (value.length() > 10) {
			dateString = value.substring(0, 10);
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalTime defaultTime = LocalTime.of(0, 0, 0);
		LocalDate localDate = LocalDate.parse(dateString, formatter);
		LocalDateTime dateTime = LocalDateTime.of(localDate, defaultTime);
		String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime parsedDateTime = LocalDateTime.parse(formattedDateTime, formatters);
		return parsedDateTime;
	}

	@Override
	public String updatePolicy(ProposalEntryRequest proposalEntryRequest, Integer policy_id,
			HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		
		AuthRequest userDetails = jwtService.getLoggedInDetails(token);
		try {
			Optional<LT_POLICY> optionalUser = ltPolicyRepo.findById(policy_id);
			LT_POLICY policy = optionalUser.get();
			if (policy != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", proposalEntryRequest.getPolicyDetails().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					Map<String, String> policyDetailsMap = entry.getValue();

					Map<String, Object> queryParams = new HashMap<>();
					queryParams.put("CustCode", policyDetailsMap.get("POL_CUST_CODE"));
					
					Map<String, Object> body = new HashMap<>();
					body.put("queryParams", queryParams);

					JSONObject jsonBody = new JSONObject(body);
					String requestBody = jsonBody.toString();
					
					String url = "http://localhost:8098/common/getMapQuery?queryId=185";
					HttpHeaders headers = new HttpHeaders();
					RestTemplate restTemplate = new RestTemplate();
					headers.setContentType(MediaType.APPLICATION_JSON);
					headers.set("Authorization", "Bearer " + token);
					HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);
					ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
					
					JSONObject object = new JSONObject(responseEntity.getBody());

					JSONArray jsonArray = (JSONArray) object.getJSONArray("Data");
					List<String> values = new ArrayList<>();
					for (int i = 0; i < jsonArray.length(); i++) {
						Iterator<String> keys = ((JSONObject) jsonArray.get(i)).keys();
						while (keys.hasNext()) { 
							String key = keys.next();
							Object value = ((JSONObject) jsonArray.get(i)).get(key);
							policyDetailsMap.put(key, value.toString());
						}
					}
					

					setPolicyFields(policy, LT_POLICY.class, entry.getValue());
				}

				try {

					if(policy.getPOL_ASSR_CUST_FLAG().equals("Yes")) {
						policy.setPOL_ASSRD_REF_ID(policy.getPOL_CUST_REF_ID());
					}else if(policy.getPOL_ASSR_CUST_FLAG().equals("No")){
						Map<String, Object> queryParams = new HashMap<>();
						queryParams.put("CustCode", policy.getPOL_ASSR_CODE());
						
						Map<String, Object> body = new HashMap<>();
						body.put("queryParams", queryParams);

						JSONObject jsonBody = new JSONObject(body);
						String requestBody = jsonBody.toString();
						
						String url = "http://localhost:8098/common/getMapQuery?queryId=191";
						HttpHeaders headers = new HttpHeaders();
						RestTemplate restTemplate = new RestTemplate();
						headers.setContentType(MediaType.APPLICATION_JSON);
						headers.set("Authorization", "Bearer " + token);
						HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);
						ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
						
						JSONObject object = new JSONObject(responseEntity.getBody());

						JSONArray jsonArray = (JSONArray) object.getJSONArray("Data");
						List<String> values = new ArrayList<>();
						for (int i = 0; i < jsonArray.length(); i++) {
							Iterator<String> keys = ((JSONObject) jsonArray.get(i)).keys();
							while (keys.hasNext()) { 
								String key = keys.next();
								Object value = ((JSONObject) jsonArray.get(i)).get(key);
								policy.setPOL_ASSRD_REF_ID(value.toString());
							}
						}
					}

					policy.setPOL_MOD_DT(new Date(System.currentTimeMillis()));
					policy.setPOL_MOD_ID(userDetails.getUsername());
					policy.setPOL_FLEX_02("N");
					LT_POLICY savedPolicyDetails = ltPolicyRepo.save(policy);
					response.put(statusCode, successCode);
					response.put(messageCode, "Policy Details Updated Successfully");
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
	public String deletePolicyByid(Integer policy_id) {
		try {
			Optional<LT_POLICY> policyDetails = ltPolicyRepo.findById(policy_id);

			if (policyDetails.isPresent()) {
				ltPolicyRepo.deleteById(policy_id);

				JSONObject response = new JSONObject();
				response.put("Status", "SUCCESS");
				response.put("Message", "Record with ID " + policy_id + " deleted successfully");
				return response.toString();

			} else {
				JSONObject response = new JSONObject();
				response.put("Status", "ERROR");
				response.put("Message", "Record with ID " + policy_id + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			JSONObject response = new JSONObject();
			response.put("Status", "ERROR");
			response.put("Message", "Error deleting record with ID " + policy_id + ": " + e.getMessage());
			return response.toString();
		}
	}

	@Override
	public String getPolicyByid(Integer policyId) throws Exception {
		Map<String, Object> parametermap = new HashMap<String, Object>();
		JSONObject inputObject = new JSONObject();
		Optional<LT_POLICY> optionalUser = ltPolicyRepo.findById(policyId);
		LT_POLICY policy = optionalUser.get();
		if (policy != null) {
			for (int i = 0; i < policy.getClass().getDeclaredFields().length; i++) {
				Field field = policy.getClass().getDeclaredFields()[i];
				field.setAccessible(true);
				String columnName = null;
				if (field.isAnnotationPresent(Column.class)) {
					Annotation annotation = field.getAnnotation(Column.class);
					Column column = (Column) annotation;
					Object value = field.get(policy);
					columnName = column.name();
					inputObject.put(columnName, value);
				}
			}
		}
		return inputObject.toString();
	}

	@Override
	public String assignTask(HttpServletRequest request) {
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

		TaskService taskService = processEngine.getTaskService();

//        List<Task> tasks = taskService.createTaskQuery().list();

		RuntimeService runtimeService = processEngine.getRuntimeService();
		long processInstanceCount = runtimeService.createProcessInstanceQuery().processDefinitionKey("TestProcess")
				.count();

		if (processInstanceCount <= 0) {
			Map<String, Object> variables = new HashMap<>();
			variables.put("process", "update");
			ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("TestProcess", variables);
		}

		List<ProcessInstance> instances = runtimeService.createProcessInstanceQuery()
				.processDefinitionKey("TestProcess").active().list();

		String header = request.getHeader("Authorization");
		String token = null;
		if (header != null && header.startsWith("Bearer ")) {
			token = header.substring(7);
		}
		AuthRequest loggedInDetails = jwtService.getLoggedInDetails(token);

		List<Task> tasks = taskService.createTaskQuery().processDefinitionKey("TestProcess").list();

		for (Task task : tasks) {
			if ("User Task".equals(task.getName())) {
				String userId = loggedInDetails.getUsername();
				taskService.setAssignee(task.getId(), userId);
			}
		}
		return null;
	}

	@Override
	public String getTasks(HttpServletRequest request) {
		TaskService taskService = ProcessEngines.getDefaultProcessEngine().getTaskService();

		String header = request.getHeader("Authorization");
		String token = null;
		if (header != null && header.startsWith("Bearer ")) {
			token = header.substring(7);
		}
		AuthRequest loggedInDetails = jwtService.getLoggedInDetails(token);

		String userId = loggedInDetails.getUsername();

		TaskQuery query = taskService.createTaskQuery().taskAssignee(userId);
		List<Task> tasks = query.list();

		for (Task task : tasks) {
			System.out.println("Task ID: " + task.getId() + ", Task Name: " + task.getName() + ", Assignee Name: "
					+ task.getAssignee());
			System.out.println("VARIABLES: " + runtimeService.getVariables(task.getProcessInstanceId()));
		}
		return null;
	}

	@Override
	public String activeTasks(HttpServletRequest request) {
		String header = request.getHeader("Authorization");
		String token = null;
		if (header != null && header.startsWith("Bearer ")) {
			token = header.substring(7);
		}
		AuthRequest loggedInDetails = jwtService.getLoggedInDetails(token);

		String userId = loggedInDetails.getUsername();
		TaskQuery query = taskService.createTaskQuery().active().taskAssignee(userId);

		System.out.println("ACTIVE TASKS SIZE OF USER: " + userId + " is " + query.list().size());
		return null;
	}

	@Override
	public String completedTasks(HttpServletRequest request) {
		String header = request.getHeader("Authorization");
		String token = null;
		if (header != null && header.startsWith("Bearer ")) {
			token = header.substring(7);
		}
		AuthRequest loggedInDetails = jwtService.getLoggedInDetails(token);

		String userId = loggedInDetails.getUsername();
		HistoricTaskInstanceQuery query = historyService.createHistoricTaskInstanceQuery().finished()
				.taskAssignee(userId);

		System.out.println(query.list().size());

		System.out.println(query.list().get(0).getAssignee() + "*" + query.list().get(0).getName());
		return null;
	}

	@Override
	public String assigMultipleTask(HttpServletRequest request) {
		List<String> assignees = Arrays.asList("CLJO");
		Map<String, Object> variables = new HashMap<>();

		List<ProcessInstance> processInstances = runtimeService.createProcessInstanceQuery()
				.processDefinitionKey("process_multi_instance").active().list();

		if (processInstances.size() == 1) {
			variables.put("assignees", assignees);
			System.out.println(processInstances.get(0).getId());
			System.out.println(runtimeService.getVariable(processInstances.get(0).getProcessInstanceId(), "assignees"));
			runtimeService.setVariable(processInstances.get(0).getProcessInstanceId(), "assignees", variables);
		} else if (processInstances.size() <= 0) {
			variables.put("assignees", assignees);
			runtimeService.startProcessInstanceByKey("process_multi_instance", variables);
		} else {
			for (ProcessInstance instance : processInstances) {
				runtimeService.deleteProcessInstance(instance.getId(), "Deleted by API request");
			}
		}
		return null;
	}

	@Override
	public String completeTask(HttpServletRequest request) {
		List<ProcessInstance> processInstances = runtimeService.createProcessInstanceQuery()
				.processDefinitionKey("process_multi_instance").active().list();

		for (int i = 0; i < processInstances.size(); i++) {
			System.out.println(processInstances.get(i).getId());
		}

		String header = request.getHeader("Authorization");
		String token = null;
		if (header != null && header.startsWith("Bearer ")) {
			token = header.substring(7);
		}
		AuthRequest loggedInDetails = jwtService.getLoggedInDetails(token);

		String userId = loggedInDetails.getUsername();

		List<Task> tasks = taskService.createTaskQuery().processInstanceId(processInstances.get(0).getId())
				.taskAssignee(userId) // Provide the user ID
				.list();

		for (Task task : tasks) {
			if ("multiInstanceTask".equals(task.getTaskDefinitionKey())) {
				taskService.complete(task.getId());
				break;
			}
		}
		return null;
	}

	@Override
	public String updateStepperFlag(Integer flag, Integer tranId) {
		JSONObject response = new JSONObject();
		try {
			Optional<LT_POLICY> policyDetails = ltPolicyRepo.findById(tranId);

			if (policyDetails.isPresent()) {
				LT_POLICY policy = policyDetails.get();
				policy.setPOL_PROGRS_UPD(flag);

				ltPolicyRepo.save(policy);
				response.put(statusCode, successCode);
				response.put(messageCode, "Stepper Flag Updated Successfully");
				return response.toString();

			} else {
				response.put(statusCode, errorCode);
				response.put(messageCode, "Record with ID " + tranId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
			return response.toString();
		}
	}

	@Override
	public String updateFreezeFlag(String flag, Integer tranId) {
		JSONObject response = new JSONObject();
		try {
			Optional<LT_POLICY> policyDetails = ltPolicyRepo.findById(tranId);

			if (policyDetails.isPresent()) {
				LT_POLICY policy = policyDetails.get();
				policy.setPOL_FREEZE_RATE(flag);

				ltPolicyRepo.save(policy);
				response.put(statusCode, successCode);
				if(flag.equals("Y")) {
				response.put(messageCode, "Policy Details Froze Successfully");
				}else {
					response.put(messageCode, "Policy Details Un-Froze Successfully");
				}
				return response.toString();

			} else {
				response.put(statusCode, errorCode);
				response.put(messageCode, "Record with ID " + tranId + " not found");
				return response.toString();
			}
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
			return response.toString();
		}
	}

	@Override
	public String onSubmit(Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		try {
			
			Optional<LT_POLICY> optionalUser = ltPolicyRepo.findById(tranId);
			LT_POLICY policy = optionalUser.get();
			
			if(policy != null) {
				policy.setPOL_FLEX_02("Y");
				policy.setPOL_WF_STS("S");
				ltPolicyRepo.save(policy);
			}
			
			ProcessInstance existingProcessInstance = runtimeService.createProcessInstanceQuery()
					.processDefinitionKey("forward_Proposal").variableValueEquals("ID", tranId).singleResult();

			if (existingProcessInstance != null) {
				response.put(statusCode, errorCode);
				response.put(messageCode, "Data already Submitted");
			} else {
				String header = request.getHeader("Authorization");
				String token = null;
				if (header != null && header.startsWith("Bearer ")) {
					token = header.substring(7);
				}
				Map<String, Object> variables = new HashMap<>();
				variables.put("Token", token);

				Map<String, Object> queryParams = new HashMap<>();

				Map<String, Object> body = new HashMap<>();
				body.put("queryParams", queryParams);

				JSONObject jsonBody = new JSONObject(body);
				String requestBody = jsonBody.toString();

				String url = "http://localhost:8098/common/getMapQuery?queryId=171";
				HttpHeaders headers = new HttpHeaders();
				RestTemplate restTemplate = new RestTemplate();
				headers.setContentType(MediaType.APPLICATION_JSON);
				headers.set("Authorization", "Bearer " + token);
				HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);
				ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
				JSONObject object = new JSONObject(responseEntity.getBody());

				JSONArray jsonArray = (JSONArray) object.getJSONArray("Data");
				List<String> values = new ArrayList<>();
				for (int i = 0; i < jsonArray.length(); i++) {
					Iterator<String> keys = ((JSONObject) jsonArray.get(i)).keys();
					while (keys.hasNext()) {
						String key = keys.next();
						Object value = ((JSONObject) jsonArray.get(i)).get(key);
						values.add(value.toString());
					}
				}

				variables.put("assigneeList", values);

				ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("forward_Proposal",
						variables);
				runtimeService.setVariable(processInstance.getId(), "ID", tranId);


				Task userTask = taskService.createTaskQuery().processInstanceId(processInstance.getId())
						.taskDefinitionKey("userTask").singleResult();

				if (userTask != null) {
					taskService.complete(userTask.getId());
				}
				
				AuthRequest userDetails = jwtService.getLoggedInDetails(token);
				response.put(statusCode, successCode);
				response.put(messageCode, "Data Submitted Successfully");
				response.put("ROLE", userDetails.getRole());
			}
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

	@Override
	public String uwSubmit(String decision, String reason, Integer tranId, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		
		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		
		AuthRequest userDetails = jwtService.getLoggedInDetails(token);
		
		LT_POL_STATUS polStatus = new LT_POL_STATUS();
		polStatus.setPSTAT_STATUS_CODE(decision);
		polStatus.setPSTAT_REMARKS(reason);
		polStatus.setPSTAT_POL_TRAN_ID(tranId);
		polStatus.setPSTAT_INS_DT(new Date(System.currentTimeMillis()));
		polStatus.setPSTAT_INS_ID(userDetails.getUsername());
		polStatus.setPSTAT_STATUS_DT(new Date(System.currentTimeMillis()));
		try {
			LT_POL_STATUS savedPolStatus = polStatusRepo.save(polStatus);
			response.put(statusCode, successCode);
			response.put(messageCode, "Decision Submitted Successfully");
		}catch(Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		
		return response.toString();
	}
	
	@Override
	public String search(SearchRequestDTO searchRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();

		String authorizationHeader = request.getHeader("Authorization");
		String token = authorizationHeader.substring(7).trim();
		QueryBuilder query = QueryBuilders.matchQuery("_all", searchRequest.getSearchTerm());

		try {
			String url = "http://localhost:8098/common/getlistingdata?queryId="+searchRequest.getQueryId()
			+"&limit="+searchRequest.getLimit()+"&offset="+searchRequest.getOffset();
			HttpHeaders headers = new HttpHeaders();
			RestTemplate restTemplate = new RestTemplate();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("Authorization", "Bearer " + token);
			HttpEntity<String> requestEntity = new HttpEntity<>(headers);
			ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
			JSONObject resultObject = new JSONObject(responseEntity.getBody());

			JSONArray jsonArray = (JSONArray) resultObject.getJSONArray("Data");
			
			ResultSet results = elasticSearch.search(query, "LT_POLICY", "POL_TRAN_ID", searchRequest.getLimit(), searchRequest.getOffset());

			JSONObject object = new JSONObject();
			List<JSONObject> resultList = new ArrayList();
			while (results.next()) {
				object = new JSONObject();
				ResultSetMetaData metaData = results.getMetaData();
				if(results.getObject("POL_DS_TYPE").equals(1)) {
					object.put("ID", results.getObject("POL_TRAN_ID"));
					object.put("Pol No", results.getObject("POL_NO"));
					object.put("Customer_Code", results.getObject("POL_CUST_CODE"));
					object.put("Start_Dt", results.getObject("POL_FM_DT"));
					object.put("Stepper_Id", results.getObject("POL_PROGRS_UPD"));
					object.put("Freeze_Flag", results.getObject("POL_FREEZE_RATE"));
					object.put("Proposal_No", results.getObject("POL_QUOT_NO"));
					
					resultList.add(object);
				}
			}
			
			response.put(messageCode, "Search Results Fetched Successfully");
			response.put("Heading", resultObject.get("Heading"));
			response.put(dataCode, resultList);
			response.put("Count", results.getFetchSize());
			response.put(statusCode, successCode);
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}


}
