package com.wenxt.claims.model;

import java.util.List;

public class SaveQuestionnaireRequest {
	
	private List<GetQuestionnaireResponse> saveQuestions;

	public List<GetQuestionnaireResponse> getSaveQuestions() {
		return saveQuestions;
	}

	public void setSaveQuestions(List<GetQuestionnaireResponse> saveQuestions) {
		this.saveQuestions = saveQuestions;
	}

}
