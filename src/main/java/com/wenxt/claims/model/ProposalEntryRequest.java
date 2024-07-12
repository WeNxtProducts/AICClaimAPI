package com.wenxt.claims.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProposalEntryRequest {
	
	private FormFieldsDTO policyDetails;
	
	private FormFieldsDTO polChargeDetails;
	
	private FormFieldsDTO polBeneficiaryDetails;
	
	@JsonProperty("pol_riders")
	private FormFieldsDTO polEmpCoverDetails;
	
	@JsonProperty("life_assured_details")
	private FormFieldsDTO polEmployeeDetails;
	
	private FormFieldsDTO polBrokerDetails;
	
	private FormFieldsDTO polDiscLoad;
	
	@JsonProperty("medical_details")
	private FormFieldsDTO medicalDetails;

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

	public FormFieldsDTO getPolEmpCoverDetails() {
		return polEmpCoverDetails;
	}

	public void setPolEmpCoverDetails(FormFieldsDTO polEmpCoverDetails) {
		this.polEmpCoverDetails = polEmpCoverDetails;
	}

	public FormFieldsDTO getPolEmployeeDetails() {
		return polEmployeeDetails;
	}

	public void setPolEmployeeDetails(FormFieldsDTO polEmployeeDetails) {
		this.polEmployeeDetails = polEmployeeDetails;
	}

	public FormFieldsDTO getPolBrokerDetails() {
		return polBrokerDetails;
	}

	public void setPolBrokerDetails(FormFieldsDTO polBrokerDetails) {
		this.polBrokerDetails = polBrokerDetails;
	}

	public FormFieldsDTO getPolDiscLoad() {
		return polDiscLoad;
	}

	public void setPolDiscLoad(FormFieldsDTO polDiscLoad) {
		this.polDiscLoad = polDiscLoad;
	}

	public FormFieldsDTO getMedicalDetails() {
		return medicalDetails;
	}

	public void setMedicalDetails(FormFieldsDTO medicalDetails) {
		this.medicalDetails = medicalDetails;
	}

}