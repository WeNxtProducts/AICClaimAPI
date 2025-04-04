package com.wenxt.claims.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DocToDoList {
	
	@JsonProperty("DTLS_TRAN_ID")
	private Integer DTLS_TRAN_ID;
	
	@JsonProperty("DTLS_QUOT_TRAN_ID")
	private Integer DTLS_QUOT_TRAN_ID;
	
	@JsonProperty("DTLS_TODO_LIST_ITEM")
	private String DTLS_TODO_LIST_ITEM;
	
	@JsonProperty("DTLS_APPR_STS")
	private String DTLS_APPR_STS;

	public Integer getDTLS_TRAN_ID() {
		return DTLS_TRAN_ID;
	}

	public void setDTLS_TRAN_ID(Integer dTLS_TRAN_ID) {
		DTLS_TRAN_ID = dTLS_TRAN_ID;
	}

	public Integer getDTLS_QUOT_TRAN_ID() {
		return DTLS_QUOT_TRAN_ID;
	}

	public void setDTLS_QUOT_TRAN_ID(Integer dTLS_QUOT_TRAN_ID) {
		DTLS_QUOT_TRAN_ID = dTLS_QUOT_TRAN_ID;
	}

	public String getDTLS_TODO_LIST_ITEM() {
		return DTLS_TODO_LIST_ITEM;
	}

	public void setDTLS_TODO_LIST_ITEM(String dTLS_TODO_LIST_ITEM) {
		DTLS_TODO_LIST_ITEM = dTLS_TODO_LIST_ITEM;
	}

	public String getDTLS_APPR_STS() {
		return DTLS_APPR_STS;
	}

	public void setDTLS_APPR_STS(String dTLS_APPR_STS) {
		DTLS_APPR_STS = dTLS_APPR_STS;
	}

}
