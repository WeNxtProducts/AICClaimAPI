package com.wenxt.claims.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProposalEntryRequest {
	
	@JsonProperty("frontForm")
	private FormFieldsDTO policyDetails;
	
	@JsonProperty("inParams")
	private Map<String, String> inParams;
	
	@JsonProperty("Charges")
	private FormFieldsDTO polChargeDetails;
	
	@JsonProperty("benificiary")
	private FormFieldsDTO polBeneficiaryDetails;
	
	@JsonProperty("pol_riders")
	private FormFieldsDTO polEmpCoverDetails;
	
	@JsonProperty("life_assured_details")
	private FormFieldsDTO polEmployeeDetails;
	
    @JsonProperty("polBrokerDetails")
    private List<FormFieldsDTO> polBrokerDetails;
	
	@JsonProperty("Discount_Loading")
	private FormFieldsDTO polDiscLoad;
	
	@JsonProperty("medical_details")
	private FormFieldsDTO medicalDetails;
	
	@JsonProperty("Conditions")
	private FormFieldsDTO Conditions;

	public FormFieldsDTO getPolicyDetails() {
		return policyDetails;
	}

	public void setPolicyDetails(FormFieldsDTO policyDetails) {
		this.policyDetails = policyDetails;
	}

	public Map<String, String> getInParams() {
		return inParams;
	}

	public void setInParams(Map<String, String> inParams) {
		this.inParams = inParams;
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

	public List<FormFieldsDTO> getPolBrokerDetails() {
		return polBrokerDetails;
	}

	public void setPolBrokerDetails(List<FormFieldsDTO> polBrokerDetails) {
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

	public FormFieldsDTO getConditions() {
		return Conditions;
	}

	public void setConditions(FormFieldsDTO conditions) {
		Conditions = conditions;
	}

}
