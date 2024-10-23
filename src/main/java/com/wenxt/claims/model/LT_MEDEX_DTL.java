package com.wenxt.claims.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_MEDEX_DTL", schema = "LIFE_DEV")
public class LT_MEDEX_DTL {

    @Id
    @SequenceGenerator(name = "MedicalDetailsTranIdSeq", sequenceName = "MD_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MedicalDetailsTranIdSeq")
    @Column(name = "MD_TRAN_ID")
    private Integer MD_TRAN_ID;

    @Column(name = "MD_MH_TRAN_ID")
    private Integer MD_MH_TRAN_ID;

    @Column(name = "MD_POL_TRAN_ID")
    private Integer MD_POL_TRAN_ID;

    @Column(name = "MD_PEMP_TRAN_ID")
    private Integer MD_PEMP_TRAN_ID;

    @Column(name = "MD_EXAM_CODE")
    private String MD_EXAM_CODE;

    @Column(name = "MD_STATUS")
    private String MD_STATUS;

    @Column(name = "MD_INS_DT")
    private Date MD_INS_DT;

    @Column(name = "MD_INS_ID")
    private String MD_INS_ID;

    @Column(name = "MD_MOD_DT")
    private Date MD_MOD_DT;

    @Column(name = "MD_MOD_ID")
    private String MD_MOD_ID;

    @Column(name = "MD_CLINIC_CODE")
    private String MD_CLINIC_CODE;
    
    @Column(name = "MD_EXAM_DT")
    private Date MD_EXAM_DT;
    
    @Column(name = "MD_FC_FEE")
    private BigDecimal MD_FC_FEE;
    
    @Column(name = "MD_PAY_TO")
    private String MD_PAY_TO;

    // Getters and Setters

    public Integer getMD_TRAN_ID() {
        return MD_TRAN_ID;
    }

    public void setMD_TRAN_ID(Integer MD_TRAN_ID) {
        this.MD_TRAN_ID = MD_TRAN_ID;
    }

    public Integer getMD_MH_TRAN_ID() {
        return MD_MH_TRAN_ID;
    }

    public void setMD_MH_TRAN_ID(Integer MD_MH_TRAN_ID) {
        this.MD_MH_TRAN_ID = MD_MH_TRAN_ID;
    }

    public Integer getMD_POL_TRAN_ID() {
        return MD_POL_TRAN_ID;
    }

    public void setMD_POL_TRAN_ID(Integer MD_POL_TRAN_ID) {
        this.MD_POL_TRAN_ID = MD_POL_TRAN_ID;
    }

    public Integer getMD_PEMP_TRAN_ID() {
        return MD_PEMP_TRAN_ID;
    }

    public void setMD_PEMP_TRAN_ID(Integer MD_PEMP_TRAN_ID) {
        this.MD_PEMP_TRAN_ID = MD_PEMP_TRAN_ID;
    }

    public String getMD_EXAM_CODE() {
        return MD_EXAM_CODE;
    }

    public void setMD_EXAM_CODE(String MD_EXAM_CODE) {
        this.MD_EXAM_CODE = MD_EXAM_CODE;
    }

    public String getMD_STATUS() {
        return MD_STATUS;
    }

    public void setMD_STATUS(String MD_STATUS) {
        this.MD_STATUS = MD_STATUS;
    }

    public Date getMD_INS_DT() {
        return MD_INS_DT;
    }

    public void setMD_INS_DT(Date MD_INS_DT) {
        this.MD_INS_DT = MD_INS_DT;
    }

    public String getMD_INS_ID() {
        return MD_INS_ID;
    }

    public void setMD_INS_ID(String MD_INS_ID) {
        this.MD_INS_ID = MD_INS_ID;
    }

    public Date getMD_MOD_DT() {
        return MD_MOD_DT;
    }

    public void setMD_MOD_DT(Date MD_MOD_DT) {
        this.MD_MOD_DT = MD_MOD_DT;
    }

    public String getMD_MOD_ID() {
        return MD_MOD_ID;
    }

    public void setMD_MOD_ID(String MD_MOD_ID) {
        this.MD_MOD_ID = MD_MOD_ID;
    }

    public String getMD_CLINIC_CODE() {
        return MD_CLINIC_CODE;
    }

    public void setMD_CLINIC_CODE(String MD_CLINIC_CODE) {
        this.MD_CLINIC_CODE = MD_CLINIC_CODE;
    }

	public Date getMD_EXAM_DT() {
		return MD_EXAM_DT;
	}

	public void setMD_EXAM_DT(Date mD_EXAM_DT) {
		MD_EXAM_DT = mD_EXAM_DT;
	}

	public BigDecimal getMD_FC_FEE() {
		return MD_FC_FEE;
	}

	public void setMD_FC_FEE(BigDecimal mD_FC_FEE) {
		MD_FC_FEE = mD_FC_FEE;
	}

	public String getMD_PAY_TO() {
		return MD_PAY_TO;
	}

	public void setMD_PAY_TO(String mD_PAY_TO) {
		MD_PAY_TO = mD_PAY_TO;
	}   
}