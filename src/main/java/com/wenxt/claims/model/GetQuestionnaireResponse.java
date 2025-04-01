package com.wenxt.claims.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetQuestionnaireResponse {
	
	private Object id;
	
	private String label;
	
	private String yesOrNo;
	
	private int quotTranId;
	
	private SubQuestionResult questions;
	
	@JsonProperty("inQuestions")
	private List<SubQuestionResult> inQuestions;

	public Object getId() {
		return id;
	}

	public void setId(Object object) {
		this.id = object;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public SubQuestionResult getQuestions() {
		return questions;
	}

	public void setQuestions(SubQuestionResult subQuestionsRes) {
		this.questions = subQuestionsRes;
	}

	public String getYesOrNo() {
		return yesOrNo;
	}

	public void setYesOrNo(String yesOrNo) {
		this.yesOrNo = yesOrNo;
	}

	public int getQuotTranId() {
		return quotTranId;
	}

	public void setQuotTranId(int quotTranId) {
		this.quotTranId = quotTranId;
	}

	public List<SubQuestionResult> getInQuestions() {
		return inQuestions;
	}

	public void setInQuestions(List<SubQuestionResult> inQuestions) {
		this.inQuestions = inQuestions;
	}

}
