package com.wenxt.claims.model;

public class PolicyRequest {
	
	private FormFieldsDTO vestingScale;
	
	private FormFieldsDTO pensionPurchase;
	
	private FormFieldsDTO summary;

	public FormFieldsDTO getVestingScale() {
		return vestingScale;
	}

	public void setVestingScale(FormFieldsDTO vestingScale) {
		this.vestingScale = vestingScale;
	}

	public FormFieldsDTO getPensionPurchase() {
		return pensionPurchase;
	}

	public void setPensionPurchase(FormFieldsDTO pensionPurchase) {
		this.pensionPurchase = pensionPurchase;
	}

	public FormFieldsDTO getSummary() {
		return summary;
	}

	public void setSummary(FormFieldsDTO summary) {
		this.summary = summary;
	}

}
