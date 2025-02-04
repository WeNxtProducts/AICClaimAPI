package com.wenxt.claims.model;

public class ProcessingRequest {
	
	private FormFieldsDTO yearEndProHdr;
	
	private FormFieldsDTO yearEndProDet;
	
	private FormFieldsDTO wdraProHdr;
	
	private FormFieldsDTO matProHdr;
	
	private FormFieldsDTO wdraDetails;
	
	private FormFieldsDTO chargeDetails;
	
	private FormFieldsDTO pymtDetails;

	public FormFieldsDTO getYearEndProHdr() {
		return yearEndProHdr;
	}

	public void setYearEndProHdr(FormFieldsDTO yearEndProHdr) {
		this.yearEndProHdr = yearEndProHdr;
	}

	public FormFieldsDTO getYearEndProDet() {
		return yearEndProDet;
	}

	public void setYearEndProDet(FormFieldsDTO yearEndProDet) {
		this.yearEndProDet = yearEndProDet;
	}

	public FormFieldsDTO getWdraProHdr() {
		return wdraProHdr;
	}

	public void setWdraProHdr(FormFieldsDTO wdraProHdr) {
		this.wdraProHdr = wdraProHdr;
	}

	public FormFieldsDTO getMatProHdr() {
		return matProHdr;
	}

	public void setMatProHdr(FormFieldsDTO matProHdr) {
		this.matProHdr = matProHdr;
	}

	public FormFieldsDTO getWdraDetails() {
		return wdraDetails;
	}

	public void setWdraDetails(FormFieldsDTO wdraDetails) {
		this.wdraDetails = wdraDetails;
	}

	public FormFieldsDTO getChargeDetails() {
		return chargeDetails;
	}

	public void setChargeDetails(FormFieldsDTO chargeDetails) {
		this.chargeDetails = chargeDetails;
	}

	public FormFieldsDTO getPymtDetails() {
		return pymtDetails;
	}

	public void setPymtDetails(FormFieldsDTO pymtDetails) {
		this.pymtDetails = pymtDetails;
	}

}
