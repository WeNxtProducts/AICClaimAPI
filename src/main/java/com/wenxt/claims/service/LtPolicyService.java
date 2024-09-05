package com.wenxt.claims.service;

import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.model.SearchRequestDTO;

import jakarta.servlet.http.HttpServletRequest;

public interface LtPolicyService {

	String createPolicy(ProposalEntryRequest proposalEntryRequest, HttpServletRequest request);

	String updatePolicy(ProposalEntryRequest proposalEntryRequest, Integer policy_id, HttpServletRequest request);

	String deletePolicyByid(Integer policy_id);

	String getPolicyByid(Integer policyId) throws Exception;

	String assignTask(HttpServletRequest request);

	String getTasks(HttpServletRequest request);

	String activeTasks(HttpServletRequest request);

	String completedTasks(HttpServletRequest request);

	String assigMultipleTask(HttpServletRequest request);

	String completeTask(HttpServletRequest request);

	String updateStepperFlag(Integer flag, Integer tranId);

	String updateFreezeFlag(String flag, Integer tranId);

	String onSubmit(Integer tranId, HttpServletRequest request);

	String uwSubmit(String decision, String reason, Integer tranId, HttpServletRequest request);

	String search(SearchRequestDTO searchRequest, HttpServletRequest request);

}
