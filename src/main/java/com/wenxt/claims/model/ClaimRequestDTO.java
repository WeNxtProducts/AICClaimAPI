package com.wenxt.claims.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClaimRequestDTO {
	
	@JsonProperty("CH_CLAIM_TYPE")
	private String CH_CLAIM_TYPE;
	
	@JsonProperty("CH_CLAIM_BAS")
	private String CH_CLAIM_BAS;
	
	@JsonProperty("CH_CLAIM_BAS_VAL")
	private String CH_CLAIM_BAS_VAL;
	
	@JsonProperty("CH_ASSR_CODE")
	private String ASSURED_CODE;
	
	@JsonProperty("CH_REF_NO")
	private String CH_REF_NO;
	  
	@JsonProperty("CH_LOSS_DT")
	private String CH_LOSS_DT;
	
	@JsonProperty("CH_INTIM_DT")
	private String CH_INTIM_DT;

	public String getCH_CLAIM_TYPE() {
		return CH_CLAIM_TYPE;
	}

	public void setCH_CLAIM_TYPE(String cH_CLAIM_TYPE) {
		CH_CLAIM_TYPE = cH_CLAIM_TYPE;
	}

	public String getCH_CLAIM_BAS() {
		return CH_CLAIM_BAS;
	}

	public void setCH_CLAIM_BAS(String cH_CLAIM_BAS) {
		CH_CLAIM_BAS = cH_CLAIM_BAS;
	}

	public String getCH_CLAIM_BAS_VAL() {
		return CH_CLAIM_BAS_VAL;
	}

	public String getASSURED_CODE() {
		return ASSURED_CODE;
	}

	public void setASSURED_CODE(String aSSURED_CODE) {
		ASSURED_CODE = aSSURED_CODE;
	}

	public void setCH_CLAIM_BAS_VAL(String cH_CLAIM_BAS_VAL) {
		CH_CLAIM_BAS_VAL = cH_CLAIM_BAS_VAL;
	}

	public String getCH_REF_NO() {
		return CH_REF_NO;
	}

	public void setCH_REF_NO(String cH_REF_NO) {
		CH_REF_NO = cH_REF_NO;
	}

	public String getCH_LOSS_DT() {
		return CH_LOSS_DT;
	}

	public void setCH_LOSS_DT(String cH_LOSS_DT) {
		CH_LOSS_DT = cH_LOSS_DT;
	}

	public String getCH_INTIM_DT() {
		return CH_INTIM_DT;
	}

	public void setCH_INTIM_DT(String cH_INTIM_DT) {
		CH_INTIM_DT = cH_INTIM_DT;
	}

}
