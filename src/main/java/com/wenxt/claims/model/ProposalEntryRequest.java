package com.wenxt.claims.model;

public class ProposalEntryRequest {
	
	private FormFieldsDTO policyDetails;
	
	private FormFieldsDTO polChargeDetails;
	
	private FormFieldsDTO polBeneficiaryDetails;

	public FormFieldsDTO getPolicyDetails() {
		return policyDetails;
	}

	public void setPolicyDetails(FormFieldsDTO policyDetails) {
		this.policyDetails = policyDetails;
	}

	public FormFieldsDTO getPolChargeDetails() {
		return polChargeDetails;
	}

	public void setPolChargeDetails(FormFieldsDTO polChargeDetails) {
		this.polChargeDetails = polChargeDetails;
	}

	public FormFieldsDTO getPolBeneficiaryDetails() {
		return polBeneficiaryDetails;
	}

	public void setPolBeneficiaryDetails(FormFieldsDTO polBeneficiaryDetails) {
		this.polBeneficiaryDetails = polBeneficiaryDetails;
	}

}
