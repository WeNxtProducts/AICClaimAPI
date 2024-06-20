package com.wenxt.claims.model;

import java.util.Date;

public class PolicyDetailsDTO {
	
	private String POL_NO;
	
	private String POL_PROD_CODE;
	
	private Date POL_START_DT;
	
	private String CLM_CLAIM_NO;
	
	private String CE_EST_TYPE;
	
	private Long CE_LC_COVER_AMT;
	
	private Long CE_LC_EST_AMT;

	public String getPOL_NO() {
		return POL_NO;
	}

	public void setPOL_NO(String pOL_NO) {
		POL_NO = pOL_NO;
	}

	public String getPOL_PROD_CODE() {
		return POL_PROD_CODE;
	}

	public void setPOL_PROD_CODE(String pOL_PROD_CODE) {
		POL_PROD_CODE = pOL_PROD_CODE;
	}

	public Date getPOL_START_DT() {
		return POL_START_DT;
	}

	public void setPOL_START_DT(Date pOL_START_DT) {
		POL_START_DT = pOL_START_DT;
	}

	public String getCLM_CLAIM_NO() {
		return CLM_CLAIM_NO;
	}

	public void setCLM_CLAIM_NO(String cLM_CLAIM_NO) {
		CLM_CLAIM_NO = cLM_CLAIM_NO;
	}

	public String getCE_EST_TYPE() {
		return CE_EST_TYPE;
	}

	public void setCE_EST_TYPE(String cE_EST_TYPE) {
		CE_EST_TYPE = cE_EST_TYPE;
	}

	public Long getCE_LC_COVER_AMT() {
		return CE_LC_COVER_AMT;
	}

	public void setCE_LC_COVER_AMT(Long cE_LC_COVER_AMT) {
		CE_LC_COVER_AMT = cE_LC_COVER_AMT;
	}

	public Long getCE_LC_EST_AMT() {
		return CE_LC_EST_AMT;
	}

	public void setCE_LC_EST_AMT(Long cE_LC_EST_AMT) {
		CE_LC_EST_AMT = cE_LC_EST_AMT;
	}

}
