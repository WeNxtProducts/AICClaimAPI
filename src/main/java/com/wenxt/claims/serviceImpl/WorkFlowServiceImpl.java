package com.wenxt.claims.serviceImpl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wenxt.claims.security.AuthRequest;
import com.wenxt.claims.security.JwtService;
import com.wenxt.claims.service.WorkFlowService;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class WorkFlowServiceImpl implements WorkFlowService {
	
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private ProcessEngine processEngine;
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private RuntimeService runtimeService;

	@Override
	public String completeTask(Integer tranId, HttpServletRequest request) {

		String header = request.getHeader("Authorization");
		String token = null;
		if (header != null && header.startsWith("Bearer ")) {
			token = header.substring(7);
		}
		AuthRequest loggedInDetails = jwtService.getLoggedInDetails(token);

		String userId = loggedInDetails.getUsername();

		ProcessInstance processInstance = runtimeService.createProcessInstanceQuery()
				.processDefinitionKey("forward_Proposal").variableValueEquals("ID", tranId).singleResult();

		Map<String, Object> variables = runtimeService.getVariables(processInstance.getId());
		List<String> assignee = (List<String>) variables.get("assigneeList");
		if (variables.get("ID").equals(tranId)) {
			Task userTask = taskService.createTaskQuery().processInstanceId(processInstance.getId())
					.taskDefinitionKey("multiInstanceUserTask").taskAssignee(userId).singleResult();

	        if (userTask != null) {
	            // Cancel all the current tasks using a signal event
//	        	runtimeService.createMessageCorrelationBuilder()
//	            .messageName("yourSignalName")
//	            .processInstanceId(processInstanceId)
//	            .correlate();

	            // Update the assignee list with the new user
	            List<String> newAssigneeList = Arrays.asList(userId); 
	            Map<String, Object> variable = new HashMap<>();
	            variable.put("assigneeList", newAssigneeList);
	            System.out.println(userId);// Or any other new list
//	            runtimeService.setVariable(processInstance.getId(), "assigneeList", newAssigneeList);
//	            
//	            runtimeService.setVariables(processInstance.getProcessInstanceId(), variable);
	            long executionCount = runtimeService.createExecutionQuery()
	                    .processInstanceId(processInstance.getId())
	                    .activityId("multiInstanceUserTask") // Replace with your activity ID
	                    .count();
	            
	            System.out.println(executionCount);
//	            runtimeService.createChangeActivityStateBuilder()
//	            .processInstanceId(processInstance.getId())
//	            .moveActivityIdTo("multiInstanceUserTask", "multiInstanceUserTask")
//	            .changeState();
	            
				List<Task> userTasks = taskService.createTaskQuery().processInstanceId(processInstance.getId())
						.taskDefinitionKey("multiInstanceUserTask").list();
				
				System.out.println(userTasks.size());
	        }
		}
		return null;
	}

	@Override
	public String deleteTask(HttpServletRequest request) {
		
//	    TaskService taskService = processEngine.getTaskService();
//	    taskService.deleteTask("660039", "Deleted by user request");
		
	    RuntimeService runtimeService = processEngine.getRuntimeService();

	    // Retrieve all active process instances
	    List<ProcessInstance> processInstances = runtimeService.createProcessInstanceQuery()
	                                                           .active()
	                                                           .list();

	    // Delete each process instance
	    for (ProcessInstance processInstance : processInstances) {
	        runtimeService.deleteProcessInstance(processInstance.getId(), "Deleted by user request");
	    }

//		String header = request.getHeader("Authorization");
//		String token = null;
//		if (header != null && header.startsWith("Bearer ")) {
//			token = header.substring(7);
//		}
//		AuthRequest loggedInDetails = jwtService.getLoggedInDetails(token);
//
//		String userId = loggedInDetails.getUsername();
//		
//		TaskService taskService = processEngine.getTaskService();
//		List<Task> tasks = taskService.createTaskQuery().taskAssignee(userId).list();
//
//		List<String> assignee = Arrays.asList(userId);
//		Map<String, Object> variables  = new HashMap<>();
//		variables.put("assigneeList", assignee);
//		for (Task task : tasks) {
//		    taskService.complete(task.getId(), variables);
//		}
//
//		for (Task task : tasks) {
//			taskService.deleteTask(task.getId(), "Deleted by user request");
//		}
		return null;
	}
	
	private void handleRemainingTasks(Task task) {
	    // Set a variable or flag to indicate that the task should be ignored or skipped
		taskService.deleteTask(task.getId(), "Deleted by user request");

//	    runtimeService.setVariable(task.getProcessInstanceId(), "skipTask_" + task.getId(), true);
	}

	@Override
	public Object getTask(Integer tranId, HttpServletRequest request) {
		ProcessInstance processInstance = runtimeService.createProcessInstanceQuery()
				.processDefinitionKey("forward_Proposal").variableValueEquals("ID", tranId).singleResult();

		if (processInstance != null) {
			List<Task> tasks = taskService.createTaskQuery().processInstanceId(processInstance.getId())
					.taskDefinitionKey("multiInstanceUserTask").list();

			for (Task task : tasks) {
				System.out.println("TASK: " + task.getId() + ", ASSIGNEE: " + task.getAssignee());
			}
			System.out.println("VARIABLES: " + processInstance.getProcessVariables());
		} else {
			System.out.println("PROCESS INSTANCE IS NULL");
		}
		return null;
	}

}