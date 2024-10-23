package com.wenxt.claims.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_RI_EMP_CVR_DISC_LOAD", schema = "LIFE_DEV")
public class LT_RI_EMP_CVR_DISC_LOAD {

    @Id
    @SequenceGenerator(name = "ReceiptProcessTranIdSeq", sequenceName = "RCDL_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ReceiptProcessTranIdSeq")
    @Column(name = "RCDL_TRAN_ID", nullable = false)
    private Integer RCDL_TRAN_ID;

    @Column(name = "RCDL_RED_TRAN_ID")
    private Integer RCDL_RED_TRAN_ID;

    @Column(name = "RCDL_RED_RE_TRAN_ID")
    private Integer RCDL_RED_RE_TRAN_ID;

    @Column(name = "RCDL_PEC_TRAN_ID")
    private Integer RCDL_PEC_TRAN_ID;

    @Column(name = "RCDL_SRNO")
    private Integer RCDL_SRNO;

    @Column(name = "RCDL_APPLY_LEVEL")
    private String RCDL_APPLY_LEVEL;

    @Column(name = "RCDL_DISC_LOAD_TYPE")
    private String RCDL_DISC_LOAD_TYPE;

    @Column(name = "RCDL_DISC_LOAD_CODE")
    private String RCDL_DISC_LOAD_CODE;

    @Column(name = "RCDL_APPLIED_ON")
    private String RCDL_APPLIED_ON;

    @Column(name = "RCDL_RATE")
    private Double RCDL_RATE;

    @Column(name = "RCDL_RATE_PER")
    private Long RCDL_RATE_PER;

    @Column(name = "RCDL_FC_DISC_LOAD_VALUE")
    private Double RCDL_FC_DISC_LOAD_VALUE;

    @Column(name = "RCDL_LC_DISC_LOAD_VALUE")
    private Double RCDL_LC_DISC_LOAD_VALUE;

    @Column(name = "RCDL_APPLY_UPTO_SRNO")
    private Integer RCDL_APPLY_UPTO_SRNO;

    @Column(name = "RCDL_INS_DT")
    private Date RCDL_INS_DT;

    @Column(name = "RCDL_INS_ID")
    private String RCDL_INS_ID;

    @Column(name = "RCDL_MOD_DT")
    private Date RCDL_MOD_DT;

    @Column(name = "RCDL_MOD_ID")
    private String RCDL_MOD_ID;

	public Integer getRCDL_TRAN_ID() {
		return RCDL_TRAN_ID;
	}

	public void setRCDL_TRAN_ID(Integer rCDL_TRAN_ID) {
		RCDL_TRAN_ID = rCDL_TRAN_ID;
	}

	public Integer getRCDL_RED_TRAN_ID() {
		return RCDL_RED_TRAN_ID;
	}

	public void setRCDL_RED_TRAN_ID(Integer rCDL_RED_TRAN_ID) {
		RCDL_RED_TRAN_ID = rCDL_RED_TRAN_ID;
	}

	public Integer getRCDL_RED_RE_TRAN_ID() {
		return RCDL_RED_RE_TRAN_ID;
	}

	public void setRCDL_RED_RE_TRAN_ID(Integer rCDL_RED_RE_TRAN_ID) {
		RCDL_RED_RE_TRAN_ID = rCDL_RED_RE_TRAN_ID;
	}

	public Integer getRCDL_PEC_TRAN_ID() {
		return RCDL_PEC_TRAN_ID;
	}

	public void setRCDL_PEC_TRAN_ID(Integer rCDL_PEC_TRAN_ID) {
		RCDL_PEC_TRAN_ID = rCDL_PEC_TRAN_ID;
	}

	public Integer getRCDL_SRNO() {
		return RCDL_SRNO;
	}

	public void setRCDL_SRNO(Integer rCDL_SRNO) {
		RCDL_SRNO = rCDL_SRNO;
	}

	public String getRCDL_APPLY_LEVEL() {
		return RCDL_APPLY_LEVEL;
	}

	public void setRCDL_APPLY_LEVEL(String rCDL_APPLY_LEVEL) {
		RCDL_APPLY_LEVEL = rCDL_APPLY_LEVEL;
	}

	public String getRCDL_DISC_LOAD_TYPE() {
		return RCDL_DISC_LOAD_TYPE;
	}

	public void setRCDL_DISC_LOAD_TYPE(String rCDL_DISC_LOAD_TYPE) {
		RCDL_DISC_LOAD_TYPE = rCDL_DISC_LOAD_TYPE;
	}

	public String getRCDL_DISC_LOAD_CODE() {
		return RCDL_DISC_LOAD_CODE;
	}

	public void setRCDL_DISC_LOAD_CODE(String rCDL_DISC_LOAD_CODE) {
		RCDL_DISC_LOAD_CODE = rCDL_DISC_LOAD_CODE;
	}

	public String getRCDL_APPLIED_ON() {
		return RCDL_APPLIED_ON;
	}

	public void setRCDL_APPLIED_ON(String rCDL_APPLIED_ON) {
		RCDL_APPLIED_ON = rCDL_APPLIED_ON;
	}

	public Double getRCDL_RATE() {
		return RCDL_RATE;
	}

	public void setRCDL_RATE(Double rCDL_RATE) {
		RCDL_RATE = rCDL_RATE;
	}

	public Long getRCDL_RATE_PER() {
		return RCDL_RATE_PER;
	}

	public void setRCDL_RATE_PER(Long rCDL_RATE_PER) {
		RCDL_RATE_PER = rCDL_RATE_PER;
	}

	public Double getRCDL_FC_DISC_LOAD_VALUE() {
		return RCDL_FC_DISC_LOAD_VALUE;
	}

	public void setRCDL_FC_DISC_LOAD_VALUE(Double rCDL_FC_DISC_LOAD_VALUE) {
		RCDL_FC_DISC_LOAD_VALUE = rCDL_FC_DISC_LOAD_VALUE;
	}

	public Double getRCDL_LC_DISC_LOAD_VALUE() {
		return RCDL_LC_DISC_LOAD_VALUE;
	}

	public void setRCDL_LC_DISC_LOAD_VALUE(Double rCDL_LC_DISC_LOAD_VALUE) {
		RCDL_LC_DISC_LOAD_VALUE = rCDL_LC_DISC_LOAD_VALUE;
	}

	public Integer getRCDL_APPLY_UPTO_SRNO() {
		return RCDL_APPLY_UPTO_SRNO;
	}

	public void setRCDL_APPLY_UPTO_SRNO(Integer rCDL_APPLY_UPTO_SRNO) {
		RCDL_APPLY_UPTO_SRNO = rCDL_APPLY_UPTO_SRNO;
	}

	public Date getRCDL_INS_DT() {
		return RCDL_INS_DT;
	}

	public void setRCDL_INS_DT(Date rCDL_INS_DT) {
		RCDL_INS_DT = rCDL_INS_DT;
	}

	public String getRCDL_INS_ID() {
		return RCDL_INS_ID;
	}

	public void setRCDL_INS_ID(String rCDL_INS_ID) {
		RCDL_INS_ID = rCDL_INS_ID;
	}

	public Date getRCDL_MOD_DT() {
		return RCDL_MOD_DT;
	}

	public void setRCDL_MOD_DT(Date rCDL_MOD_DT) {
		RCDL_MOD_DT = rCDL_MOD_DT;
	}

	public String getRCDL_MOD_ID() {
		return RCDL_MOD_ID;
	}

	public void setRCDL_MOD_ID(String rCDL_MOD_ID) {
		RCDL_MOD_ID = rCDL_MOD_ID;
	}

}
