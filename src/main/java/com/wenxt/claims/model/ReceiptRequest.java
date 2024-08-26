package com.wenxt.claims.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReceiptRequest {
	
	@JsonProperty("receiptHeader")
	public FormFieldsDTO receiptHeader;
	
	@JsonProperty("receiptProcess")
	public FormFieldsDTO receiptProcess;
	
	@JsonProperty("installHdr")
	public FormFieldsDTO installHdr;
	
	@JsonProperty("deposit")
	public FormFieldsDTO deposit;
	
	@JsonProperty("pymntDetails")
	public FormFieldsDTO pymntDetails;

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

	public FormFieldsDTO getPymntDetails() {
		return pymntDetails;
	}

	public void setPymntDetails(FormFieldsDTO pymntDetails) {
		this.pymntDetails = pymntDetails;
	}

}
