package com.wenxt.claims.model;

public class SuQuestionsDTo {
	
	private int qId;
	
	private int id;
	
	private String quest;
	
	private String value;

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getQuest() {
		return quest;
	}

	public void setQuest(String quest) {
		this.quest = quest;
	}

	@Override
	public String toString() {
		return "SuQuestionsDTo [qId=" + qId + ", quest=" + quest + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
