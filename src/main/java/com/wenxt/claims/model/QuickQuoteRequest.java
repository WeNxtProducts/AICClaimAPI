package com.wenxt.claims.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuickQuoteRequest {
	
	@JsonProperty("claimIntimation")
	public FormFieldsDTO claimIntimation;

	public FormFieldsDTO getClaimIntimation() {
		return claimIntimation;
	}

	public void setClaimIntimation(FormFieldsDTO claimIntimation) {
		this.claimIntimation = claimIntimation;
	}

}
