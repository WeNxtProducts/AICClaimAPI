package com.wenxt.claims.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_POL_CONDITION")
public class LT_POL_CONDITION {

    @Id
    @SequenceGenerator(name = "PolicyConditionTranIdSeq", sequenceName = "LSEQ_PCOND_TRAN_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PolicyConditionTranIdSeq")
    @Column(name = "PCOND_TRAN_ID")
    @JsonProperty("PCOND_TRAN_ID")
    private Integer PCOND_TRAN_ID;

    @Column(name = "PCOND_POL_TRAN_ID")
    @JsonProperty("PCOND_POL_TRAN_ID")
    private Integer PCOND_POL_TRAN_ID;

    @Column(name = "PCOND_PC_TRAN_ID")
    @JsonProperty("PCOND_PC_TRAN_ID")
    private Integer PCOND_PC_TRAN_ID;

    @Column(name = "PCOND_CODE")
    @JsonProperty("PCOND_CODE")
    private String PCOND_CODE;

    @Column(name = "PCOND_DESC")
    @JsonProperty("PCOND_DESC")
    private String PCOND_DESC;

    @Column(name = "PCOND_DEL_FLAG")
    @JsonProperty("PCOND_DEL_FLAG")
    private String PCOND_DEL_FLAG;

    @Column(name = "PCOND_INS_DT")
    @JsonProperty("PCOND_INS_DT")
    private Date PCOND_INS_DT;

    @Column(name = "PCOND_INS_ID")
    @JsonProperty("PCOND_INS_ID")
    private String PCOND_INS_ID;

    @Column(name = "PCOND_MOD_DT")
    @JsonProperty("PCOND_MOD_DT")
    private Date PCOND_MOD_DT;

    @Column(name = "PCOND_MOD_ID")
    @JsonProperty("PCOND_MOD_ID")
    private String PCOND_MOD_ID;

    @Column(name = "PCOND_REC_TYPE")
    @JsonProperty("PCOND_REC_TYPE")
    private String PCOND_REC_TYPE;

    @Column(name = "PCOND_COND_TYP")
    @JsonProperty("PCOND_COND_TYP")
    private String PCOND_COND_TYP;

	public Integer getPCOND_TRAN_ID() {
		return PCOND_TRAN_ID;
	}

	public void setPCOND_TRAN_ID(Integer pCOND_TRAN_ID) {
		PCOND_TRAN_ID = pCOND_TRAN_ID;
	}

	public Integer getPCOND_POL_TRAN_ID() {
		return PCOND_POL_TRAN_ID;
	}

	public void setPCOND_POL_TRAN_ID(Integer pCOND_POL_TRAN_ID) {
		PCOND_POL_TRAN_ID = pCOND_POL_TRAN_ID;
	}

	public Integer getPCOND_PC_TRAN_ID() {
		return PCOND_PC_TRAN_ID;
	}

	public void setPCOND_PC_TRAN_ID(Integer pCOND_PC_TRAN_ID) {
		PCOND_PC_TRAN_ID = pCOND_PC_TRAN_ID;
	}

	public String getPCOND_CODE() {
		return PCOND_CODE;
	}

	public void setPCOND_CODE(String pCOND_CODE) {
		PCOND_CODE = pCOND_CODE;
	}

	public String getPCOND_DESC() {
		return PCOND_DESC;
	}

	public void setPCOND_DESC(String pCOND_DESC) {
		PCOND_DESC = pCOND_DESC;
	}

	public String getPCOND_DEL_FLAG() {
		return PCOND_DEL_FLAG;
	}

	public void setPCOND_DEL_FLAG(String pCOND_DEL_FLAG) {
		PCOND_DEL_FLAG = pCOND_DEL_FLAG;
	}

	public Date getPCOND_INS_DT() {
		return PCOND_INS_DT;
	}

	public void setPCOND_INS_DT(Date pCOND_INS_DT) {
		PCOND_INS_DT = pCOND_INS_DT;
	}

	public String getPCOND_INS_ID() {
		return PCOND_INS_ID;
	}

	public void setPCOND_INS_ID(String pCOND_INS_ID) {
		PCOND_INS_ID = pCOND_INS_ID;
	}

	public Date getPCOND_MOD_DT() {
		return PCOND_MOD_DT;
	}

	public void setPCOND_MOD_DT(Date pCOND_MOD_DT) {
		PCOND_MOD_DT = pCOND_MOD_DT;
	}

	public String getPCOND_MOD_ID() {
		return PCOND_MOD_ID;
	}

	public void setPCOND_MOD_ID(String pCOND_MOD_ID) {
		PCOND_MOD_ID = pCOND_MOD_ID;
	}

	public String getPCOND_REC_TYPE() {
		return PCOND_REC_TYPE;
	}

	public void setPCOND_REC_TYPE(String pCOND_REC_TYPE) {
		PCOND_REC_TYPE = pCOND_REC_TYPE;
	}

	public String getPCOND_COND_TYP() {
		return PCOND_COND_TYP;
	}

	public void setPCOND_COND_TYP(String pCOND_COND_TYP) {
		PCOND_COND_TYP = pCOND_COND_TYP;
	}

}