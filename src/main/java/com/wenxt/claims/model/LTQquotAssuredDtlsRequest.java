package com.wenxt.claims.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LTQquotAssuredDtlsRequest {
	
	@JsonProperty("QuotAssuredDtls")
	private FormFieldsDTO ltqquotAssuredDtls;

	public FormFieldsDTO getLtqquotAssuredDtls() {
		return ltqquotAssuredDtls;
	}

	public void setLtqquotAssuredDtls(FormFieldsDTO ltqquotAssuredDtls) {
		this.ltqquotAssuredDtls = ltqquotAssuredDtls;
	}
}
