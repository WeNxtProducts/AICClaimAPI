package com.wenxt.claims.model;

import java.util.List;

public class EmployeeValidationsRequest {
	
	private String base64File;
	
	private List<String> plans;

	public String getBase64File() {
		return base64File;
	}

	public void setBase64File(String base64File) {
		this.base64File = base64File;
	}

	public List<String> getPlans() {
		return plans;
	}

	public void setPlans(List<String> plans) {
		this.plans = plans;
	}

}
