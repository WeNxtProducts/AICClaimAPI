package com.wenxt.claims.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LTQuoteRequest {

	@JsonProperty("frontForm")
	private FormFieldsDTO quoteDetails;

	public FormFieldsDTO getQuoteDetails() {
		return quoteDetails;
	}

	public void setQuoteDetails(FormFieldsDTO quoteDetails) {
		this.quoteDetails = quoteDetails;
	}

}
