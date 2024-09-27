package com.wenxt.claims.model;

import jakarta.servlet.http.HttpServletRequest;

public class SurrMattValuesRequest {
	
	private FormFieldsDTO surrMattValues;

	public FormFieldsDTO getSurrMattValues() {
		return surrMattValues;
	}

	public void setSurrMattValues(FormFieldsDTO surrMattValues) {
		this.surrMattValues = surrMattValues;
	}

	public String update(SurrMattValuesRequest surrMattValuesRequest, Integer tranId,
			HttpServletRequest servletRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
