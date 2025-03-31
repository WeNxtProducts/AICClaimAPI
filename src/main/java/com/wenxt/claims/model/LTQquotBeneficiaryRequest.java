package com.wenxt.claims.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LTQquotBeneficiaryRequest {
	
	@JsonProperty("Nominee")
	private FormFieldsDTO ltqquotBeneficiary;

	public FormFieldsDTO getLtqquotBeneficiary() {
		return ltqquotBeneficiary;
	}

	public void setLtqquotBeneficiary(FormFieldsDTO ltqquotBeneficiary) {
		this.ltqquotBeneficiary = ltqquotBeneficiary;
	}
}