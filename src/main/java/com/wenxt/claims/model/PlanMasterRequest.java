package com.wenxt.claims.model;

public class PlanMasterRequest {
	
	private FormFieldsDTO planHeader;
	
	private FormFieldsDTO planDetail;

	public FormFieldsDTO getPlanHeader() {
		return planHeader;
	}

	public void setPlanHeader(FormFieldsDTO planHeader) {
		this.planHeader = planHeader;
	}

	public FormFieldsDTO getPlanDetail() {
		return planDetail;
	}

	public void setPlanDetail(FormFieldsDTO planDetail) {
		this.planDetail = planDetail;
	}

}
