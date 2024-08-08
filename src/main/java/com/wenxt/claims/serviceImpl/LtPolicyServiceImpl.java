package com.wenxt.claims.serviceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.flowable.engine.HistoryService;
import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngines;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.history.HistoricActivityInstance;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.flowable.task.api.TaskQuery;
import org.flowable.task.api.history.HistoricTaskInstanceQuery;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.LT_POLICY;
import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.repository.LtPolicyRepository;
import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
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

	@Override
	public String createPolicy(ProposalEntryRequest proposalEntryRequest, HttpServletRequest request) {
		JSONObject response = new JSONObject();
		JSONObject data = new JSONObject();

		try {
			LT_POLICY policy = new LT_POLICY();

			Map<String, Map<String, String>> fieldMaps = new HashMap<>();
			if (proposalEntryRequest.getPolicyDetails() != null) {
				fieldMaps.put("frontForm", proposalEntryRequest.getPolicyDetails().getFormFields());
				fieldMaps.put("frontForm", proposalEntryRequest.getInParams());
			} else {
				fieldMaps.put("frontForm", proposalEntryRequest.getPolicyDetails().getFormFields());
			}
			for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
				setPolicyFields(policy, LT_POLICY.class, entry.getValue());
			}

			try {
				Map<String, Object> variables = new HashMap<>();
				variables.put("instance", policy);
				variables.put("queryId", 158);
				variables.put("class", LT_POLICY.class.getName());
				String authorizationHeader = request.getHeader("Authorization");
				String token = authorizationHeader.substring(7).trim();
				variables.put("token", token);
				variables.put("process", "create");
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
				response.put(statusCode, errorCode);
				response.put(messageCode, "An error occurred: " + e.getMessage());
			}
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
			return dateTimeConverter(value, fieldType);
		} else if (fieldType.equals(Date.class) && value.isEmpty() == false && value != null) {
			return dateTimeConverter(value, fieldType);
		} else if (fieldType.equals(Long.class) && value.isEmpty() == false && value != null) {
			return Long.parseLong(value);
		} else {
			return value;
		}
	}

	private <T> T dateTimeConverter(String dateString, Class<T> type) {
		SimpleDateFormat dateFormat;
		if (type.equals(Date.class)) {
			dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		} else if (type.equals(Timestamp.class)) {
			dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		} else {
			throw new IllegalArgumentException("Unsupported date type: " + type);
		}

		try {
			Date parsedDate = (Date) dateFormat.parse(dateString);
			if (type.equals(Date.class)) {
				return type.cast(parsedDate);
			} else if (type.equals(Timestamp.class)) {
				return type.cast(new Timestamp(parsedDate.getTime()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String updatePolicy(ProposalEntryRequest proposalEntryRequest, Integer policy_id,
			HttpServletRequest request) {
		JSONObject response = new JSONObject();

		try {
			Optional<LT_POLICY> optionalUser = ltPolicyRepo.findById(policy_id);
			LT_POLICY policy = optionalUser.get();
			if (policy != null) {
				Map<String, Map<String, String>> fieldMaps = new HashMap<>();
				fieldMaps.put("frontForm", proposalEntryRequest.getPolicyDetails().getFormFields());
				for (Map.Entry<String, Map<String, String>> entry : fieldMaps.entrySet()) {
					setPolicyFields(policy, LT_POLICY.class, entry.getValue());
				}

				try {
					Map<String, Object> variables = new HashMap<>();
					variables.put("instance", policy);
					variables.put("queryId", 159);
					variables.put("class", LT_POLICY.class.getName());
					String authorizationHeader = request.getHeader("Authorization");
					String token = authorizationHeader.substring(7).trim();

					variables.put("token", token);
					variables.put("process", "create");
					ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("TestProcess",
							variables);

					Task task = taskService.createTaskQuery().processInstanceId(processInstance.getId()).singleResult();
//					policy = (LT_POLICY) runtimeService.getVariable(processInstance.getId(), "instance");
					Map<String, Object> taskVariables = new HashMap<>();
					taskVariables.put("decision", "yes");
					taskService.complete(task.getId(), taskVariables);

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
				System.out.println("Task " + task.getName() + " assigned to user: " + userId);
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
			System.out.println("VARIABLES: " + task.getProcessVariables());
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
			ProcessInstance existingProcessInstance = runtimeService.createProcessInstanceQuery()
					.processDefinitionKey("proposal_forwarding").variableValueEquals("ID", tranId).singleResult();

			if (existingProcessInstance != null) {
				System.out.println("Process instance already exists with ID: " + existingProcessInstance.getId());
			} else {
				String header = request.getHeader("Authorization");
				String token = null;
				if (header != null && header.startsWith("Bearer ")) {
					token = header.substring(7);
				}
				Map<String, Object> variables = new HashMap<>();
				variables.put("ID", tranId);
				variables.put("Token", token);

				ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("proposal_forwarding",
						variables);

				Map<String, Object> executionVariables = processInstance.getProcessVariables();
				variables.put("assignees", executionVariables.get("assignee"));

				ProcessInstance existingMultiProcessInstance = runtimeService.createProcessInstanceQuery()
						.processDefinitionKey("process_multi_instance").variableValueEquals("ID", tranId)
						.singleResult();
				if (existingMultiProcessInstance != null) {
					runtimeService.setVariable(existingMultiProcessInstance.getProcessInstanceId(), "assignees",
							variables);
				} else {
					ProcessInstance multiProcessInstance = runtimeService
							.startProcessInstanceByKey("process_multi_instance", variables);
				}
				response.put(statusCode, successCode);
				response.put(messageCode, "Data Submitted Successfully");
			}
		} catch (Exception e) {
			response.put(statusCode, errorCode);
			response.put(messageCode, e.getMessage());
		}
		return response.toString();
	}

}
