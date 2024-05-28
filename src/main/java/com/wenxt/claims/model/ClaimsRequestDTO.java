package com.wenxt.claims.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClaimsRequestDTO {
	
	private FormFieldsDTO frontForm;
	
	@JsonProperty("ClaimCover")
	private FormFieldsDTO ClaimCover;
	
	@JsonProperty("ClaimCharges")
	private FormFieldsDTO ClaimCharges;
	
	@JsonProperty("Claim_Estimate")
	private FormFieldsDTO ClaimEstimate;
	
	@JsonProperty("ClaimBeneficiary")
	private FormFieldsDTO ClaimBeneficiary;
	
	private FormFieldsDTO CheckList;

	public FormFieldsDTO getFrontForm() {
		return frontForm;
	}

	public void setFrontForm(FormFieldsDTO frontForm) {
		this.frontForm = frontForm;
	}

	public FormFieldsDTO getClaimCover() {
		return ClaimCover;
	}

	public void setClaimCover(FormFieldsDTO claimCover) {
		ClaimCover = claimCover;
	}

	public FormFieldsDTO getClaimCharges() {
		return ClaimCharges;
	}

	public void setClaimCharges(FormFieldsDTO claimCharges) {
		ClaimCharges = claimCharges;
	}

	public FormFieldsDTO getClaimEstimate() {
		return ClaimEstimate;
	}

	public void setClaimEstimate(FormFieldsDTO claimEstimate) {
		ClaimEstimate = claimEstimate;
	}

	public FormFieldsDTO getClaimBeneficiary() {
		return ClaimBeneficiary;
	}

	public void setClaimBeneficiary(FormFieldsDTO claimBeneficiary) {
		ClaimBeneficiary = claimBeneficiary;
	}

	public FormFieldsDTO getCheckList() {
		return CheckList;
	}

	public void setCheckList(FormFieldsDTO checkList) {
		CheckList = checkList;
	}

}
