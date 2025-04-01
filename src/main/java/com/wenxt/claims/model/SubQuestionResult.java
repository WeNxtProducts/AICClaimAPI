package com.wenxt.claims.model;

import java.util.List;

public class SubQuestionResult {
	
	private List<SuQuestionsDTo> yes;
	
	private List<SuQuestionsDTo> no;

	public List<SuQuestionsDTo> getYes() {
		return yes;
	}

	public void setYes(List<SuQuestionsDTo> yes) {
		this.yes = yes;
	}

	public List<SuQuestionsDTo> getNo() {
		return no;
	}

	public void setNo(List<SuQuestionsDTo> no) {
		this.no = no;
	}

}
