package com.wenxt.claims.model;

public class RIRequestDTO {
	
	private FormFieldsDTO riPremAllocHead;
	
	private FormFieldsDTO riPremAllocDtl;
	
	private FormFieldsDTO riEmployee;
	
	private FormFieldsDTO riEmployeeDtl;

	public FormFieldsDTO getRiPremAllocHead() {
		return riPremAllocHead;
	}

	public void setRiPremAllocHead(FormFieldsDTO riPremAllocHead) {
		this.riPremAllocHead = riPremAllocHead;
	}

	public FormFieldsDTO getRiPremAllocDtl() {
		return riPremAllocDtl;
	}

	public void setRiPremAllocDtl(FormFieldsDTO riPremAllocDtl) {
		this.riPremAllocDtl = riPremAllocDtl;
	}

	public FormFieldsDTO getRiEmployee() {
		return riEmployee;
	}

	public void setRiEmployee(FormFieldsDTO riEmployee) {
		this.riEmployee = riEmployee;
	}

	public FormFieldsDTO getRiEmployeeDtl() {
		return riEmployeeDtl;
	}

	public void setRiEmployeeDtl(FormFieldsDTO riEmployeeDtl) {
		this.riEmployeeDtl = riEmployeeDtl;
	}

}
