package com.wenxt.claims.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LTQuickQuoteRequest {
	
	private FormFieldsDTO quickQuoteDetails;
	
	private FormFieldsDTO quickQuoteCondition;
	
	private FormFieldsDTO quickQuoteBrokerHeader;
	
	private FormFieldsDTO quickQuoteBrokerDetail;
	
	@JsonProperty("quickQuoteApplCharge")
	public FormFieldsDTO quickQuoteApplCharge;

	public FormFieldsDTO getQuickQuoteDetails() {
		return quickQuoteDetails;
	}

	public void setQuickQuoteDetails(FormFieldsDTO quickQuoteDetails) {
		this.quickQuoteDetails = quickQuoteDetails;
	}

	public FormFieldsDTO getQuickQuoteCondition() {
		return quickQuoteCondition;
	}

	public void setQuickQuoteCondition(FormFieldsDTO quickQuoteCondition) {
		this.quickQuoteCondition = quickQuoteCondition;
	}

	public FormFieldsDTO getQuickQuoteBrokerHeader() {
		return quickQuoteBrokerHeader;
	}

	public void setQuickQuoteBrokerHeader(FormFieldsDTO quickQuoteBrokerHeader) {
		this.quickQuoteBrokerHeader = quickQuoteBrokerHeader;
	}

	public FormFieldsDTO getQuickQuoteBrokerDetail() {
		return quickQuoteBrokerDetail;
	}

	public void setQuickQuoteBrokerDetail(FormFieldsDTO quickQuoteBrokerDetail) {
		this.quickQuoteBrokerDetail = quickQuoteBrokerDetail;
	}

	public FormFieldsDTO getQuickQuoteApplCharge() {
		return quickQuoteApplCharge;
	}

	public void setQuickQuoteApplCharge(FormFieldsDTO quickQuoteApplCharge) {
		this.quickQuoteApplCharge = quickQuoteApplCharge;
	}

}
