package com.wenxt.claims.model.Endorsement;

import com.wenxt.claims.model.FormFieldsDTO;

public class EndorsementRequest {
	
	private FormFieldsDTO endtCover;
	
	private FormFieldsDTO endtBenf;
	
	private FormFieldsDTO endtPol;

	public FormFieldsDTO getEndtCover() {
		return endtCover;
	}

	public void setEndtCover(FormFieldsDTO endtCover) {
		this.endtCover = endtCover;
	}

	public FormFieldsDTO getEndtBenf() {
		return endtBenf;
	}

	public void setEndtBenf(FormFieldsDTO endtBenf) {
		this.endtBenf = endtBenf;
	}

	public FormFieldsDTO getEndtPol() {
		return endtPol;
	}

	public void setEndtPol(FormFieldsDTO endtPol) {
		this.endtPol = endtPol;
	}

}
