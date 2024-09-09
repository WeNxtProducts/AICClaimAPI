package com.wenxt.claims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wenxt.claims.model.ProposalEntryRequest;
import com.wenxt.claims.model.SearchRequestDTO;
import com.wenxt.claims.service.LtPolicyService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/policy")
public class LtPolicyController {

	@Autowired
	private LtPolicyService policyService;

	@PostMapping("/save")
	public String createPolicy(@RequestBody ProposalEntryRequest proposalEntryRequest, HttpServletRequest request) {
		return policyService.createPolicy(proposalEntryRequest, request);
	}

	@PostMapping("/policyUpdate/{policy_id}")
	public String updatePolicy(@RequestBody ProposalEntryRequest proposalEntryRequest,
			@PathVariable("policy_id") Integer policy_id, HttpServletRequest request) {
		return policyService.updatePolicy(proposalEntryRequest, policy_id, request);
	}

	@PostMapping("/deletePolicy/{policy_id}")
	public String deletePolicyByid(@PathVariable("policy_id") String policy_id) {
		Integer policyId = Integer.parseInt(policy_id);
		return policyService.deletePolicyByid(policyId);
	}

	@PostMapping("/getPolicyByid")
	public String getPolicyByid(@RequestParam("policyId") Integer policyId) {
		try {
			return policyService.getPolicyByid(policyId);
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@PostMapping("/assignTask")
	public String assignTask(HttpServletRequest request) {
		return policyService.assignTask(request);
	}

	@PostMapping("/getTask")
	public String getTasks(HttpServletRequest request) {
		return policyService.getTasks(request);
	}

	@PostMapping("/activeTask")
	public String activeTasks(HttpServletRequest request) {
		return policyService.activeTasks(request);
	}

	@PostMapping("/completedTask")
	public String completedTask(HttpServletRequest request) {
		return policyService.completedTasks(request);
	}

	@PostMapping("/assignMultipleAssignees")
	public String assignMultipleTask(HttpServletRequest request) {
		return policyService.assigMultipleTask(request);
	}

	@PostMapping("/completeTask")
	public String completeTask(HttpServletRequest request) {
		return policyService.completeTask(request);
	}

	@PostMapping("/updateStepperFlag")
	public String updateStepperFlag(@RequestParam Integer flag, @RequestParam Integer tranId) {
		return policyService.updateStepperFlag(flag, tranId);
	}

	@PostMapping("/updateFreezeFlag")
	public String updateFreezeFlag(@RequestParam String flag, @RequestParam Integer tranId,
			@RequestParam(required = false) String POL_PREM_CALC_YN) {
		return policyService.updateFreezeFlag(flag, tranId, POL_PREM_CALC_YN);

	}

	@PostMapping("/onSubmit")
	public String onSubmit(@RequestParam Integer tranId, HttpServletRequest request) {
		return policyService.onSubmit(tranId, request);
	}

	@PostMapping("/uwSubmit")
	public String uwSubmit(@RequestParam("DECISION") String decision, @RequestParam("REASON") String reason,
			@RequestParam Integer tranId, HttpServletRequest request) {
		return policyService.uwSubmit(decision, reason, tranId, request);
	}

	@PostMapping("/search")
	public String search(@RequestBody SearchRequestDTO searchRequest, HttpServletRequest request) {
		return policyService.search(searchRequest, request);
	}

}
