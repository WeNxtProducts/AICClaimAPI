package com.wenxt.claims.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReceiptRequest {
	
	@JsonProperty("receiptHeader")
	public FormFieldsDTO receiptHeader;
	
	@JsonProperty("receiptProcess")
	public FormFieldsDTO receiptProcess;

	public FormFieldsDTO getReceiptHeader() {
		return receiptHeader;
	}

	public void setReceiptHeader(FormFieldsDTO receiptHeader) {
		this.receiptHeader = receiptHeader;
	}

	public FormFieldsDTO getReceiptProcess() {
		return receiptProcess;
	}

	public void setReceiptProcess(FormFieldsDTO receiptProcess) {
		this.receiptProcess = receiptProcess;
	}

}
