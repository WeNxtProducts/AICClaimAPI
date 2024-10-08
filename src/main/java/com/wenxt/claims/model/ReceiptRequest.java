package com.wenxt.claims.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReceiptRequest {
	
	@JsonProperty("receiptHeader")
	public FormFieldsDTO receiptHeader;
	
	@JsonProperty("receiptProcess")
	public List<FormFieldsDTO> receiptProcess;
	
	@JsonProperty("installHdr")
	public FormFieldsDTO installHdr;
	
	@JsonProperty("deposit")
	public FormFieldsDTO deposit;
	
	@JsonProperty("receiptDetails")
	public FormFieldsDTO receiptDetails;

	public FormFieldsDTO getReceiptHeader() {
		return receiptHeader;
	}

	public void setReceiptHeader(FormFieldsDTO receiptHeader) {
		this.receiptHeader = receiptHeader;
	}

	public List<FormFieldsDTO> getReceiptProcess() {
		return receiptProcess;
	}

	public void setReceiptProcess(List<FormFieldsDTO> receiptProcess) {
		this.receiptProcess = receiptProcess;
	}

	public FormFieldsDTO getInstallHdr() {
		return installHdr;
	}

	public void setInstallHdr(FormFieldsDTO installHdr) {
		this.installHdr = installHdr;
	}

	public FormFieldsDTO getDeposit() {
		return deposit;
	}

	public void setDeposit(FormFieldsDTO deposit) {
		this.deposit = deposit;
	}

	public FormFieldsDTO getReceiptDetails() {
		return receiptDetails;
	}

	public void setReceiptDetails(FormFieldsDTO receiptDetails) {
		this.receiptDetails = receiptDetails;
	}

}
