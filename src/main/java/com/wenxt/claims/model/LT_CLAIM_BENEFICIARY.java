package com.wenxt.claims.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_CLAIM_BENEFICIARY")
public class LT_CLAIM_BENEFICIARY {


    @Id
  	@SequenceGenerator(name = "ClaimBenIdSeq", sequenceName = "CBEN_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ClaimBenIdSeq")
    @Column(name = "CBEN_TRAN_ID")
    private Integer CBEN_TRAN_ID;

    @Column(name = "CBEN_CLAIM_TRAN_ID")
    private Integer CBEN_CLAIM_TRAN_ID;

    @Column(name = "CBEN_CP_TRAN_ID")
    private Long CBEN_CP_TRAN_ID;

    @Column(name = "CBEN_BANK_CODE")
    private String CBEN_BANK_CODE;

    @Column(name = "CBEN_ACCOUNT_CODE")
    private String CBEN_ACCOUNT_CODE;

    @Column(name = "CBEN_RELATION_CODE")
    private String CBEN_RELATION_CODE;

    @Column(name = "CBEN_BNF_NAME")
    private String CBEN_BNF_NAME;

    @Column(name = "CBEN_BNF_NAME_BL")
    private String CBEN_BNF_NAME_BL;

    @Column(name = "CBEN_LC_PAID_AMT")
    private Double CBEN_LC_PAID_AMT;

    @Column(name = "CBEN_FC_PAID_AMT")
    private Double CBEN_FC_PAID_AMT;

    @Column(name = "CBEN_INS_ID")
    private String CBEN_INS_ID;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name = "CBEN_INS_DT")
    private Date CBEN_INS_DT;

    @Column(name = "CBEN_MOD_ID")
    private String CBEN_MOD_ID;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name = "CBEN_MOD_DT")
    private Date CBEN_MOD_DT;
    
    @Column(name = "CBEN_PYMT_MTHD")
    private String CBEN_PYMT_MTHD;

    @Column(name = "CBEN_PBEN_TRAN_ID")
    private Long CBEN_PBEN_TRAN_ID;

    @Column(name = "CBEN_BNF_TYPE")
    private String CBEN_BNF_TYPE;

    @Column(name = "CBEN_PERC")
    private Double CBEN_PERC;

    @Column(name = "CBEN_REF_ID1")
    private String CBEN_REF_ID1;

    @Column(name = "CBEN_REF_ID2")
    private String CBEN_REF_ID2;

    @Column(name = "CBEN_ADDRESS1")
    private String CBEN_ADDRESS1;

    @Column(name = "CBEN_ADDRESS2")
    private String CBEN_ADDRESS2;

    @Column(name = "CBEN_ADDRESS3")
    private String CBEN_ADDRESS3;

    @Column(name = "CBEN_STAT_CODE")
    private String CBEN_STAT_CODE;

    @Column(name = "CBEN_POSTAL_CODE")
    private String CBEN_POSTAL_CODE;

    @Column(name = "CBEN_CITY_CODE")
    private String CBEN_CITY_CODE;
    
    @Column(name = "CBEN_SELECT_YN")
    private String CBEN_SELECT_YN;

	public Integer getCBEN_TRAN_ID() {
		return CBEN_TRAN_ID;
	}

	public void setCBEN_TRAN_ID(Integer cBEN_TRAN_ID) {
		CBEN_TRAN_ID = cBEN_TRAN_ID;
	}

	public Integer getCBEN_CLAIM_TRAN_ID() {
		return CBEN_CLAIM_TRAN_ID;
	}

	public void setCBEN_CLAIM_TRAN_ID(Integer cBEN_CLAIM_TRAN_ID) {
		CBEN_CLAIM_TRAN_ID = cBEN_CLAIM_TRAN_ID;
	}

	public Long getCBEN_CP_TRAN_ID() {
		return CBEN_CP_TRAN_ID;
	}

	public void setCBEN_CP_TRAN_ID(Long cBEN_CP_TRAN_ID) {
		CBEN_CP_TRAN_ID = cBEN_CP_TRAN_ID;
	}

	public String getCBEN_BANK_CODE() {
		return CBEN_BANK_CODE;
	}

	public void setCBEN_BANK_CODE(String cBEN_BANK_CODE) {
		CBEN_BANK_CODE = cBEN_BANK_CODE;
	}

	public String getCBEN_ACCOUNT_CODE() {
		return CBEN_ACCOUNT_CODE;
	}

	public void setCBEN_ACCOUNT_CODE(String cBEN_ACCOUNT_CODE) {
		CBEN_ACCOUNT_CODE = cBEN_ACCOUNT_CODE;
	}

	public String getCBEN_RELATION_CODE() {
		return CBEN_RELATION_CODE;
	}

	public void setCBEN_RELATION_CODE(String cBEN_RELATION_CODE) {
		CBEN_RELATION_CODE = cBEN_RELATION_CODE;
	}

	public String getCBEN_BNF_NAME() {
		return CBEN_BNF_NAME;
	}

	public void setCBEN_BNF_NAME(String cBEN_BNF_NAME) {
		CBEN_BNF_NAME = cBEN_BNF_NAME;
	}

	public String getCBEN_PYMT_MTHD() {
		return CBEN_PYMT_MTHD;
	}

	public void setCBEN_PYMT_MTHD(String cBEN_PYMT_MTHD) {
		CBEN_PYMT_MTHD = cBEN_PYMT_MTHD;
	}

	public String getCBEN_BNF_NAME_BL() {
		return CBEN_BNF_NAME_BL;
	}

	public void setCBEN_BNF_NAME_BL(String cBEN_BNF_NAME_BL) {
		CBEN_BNF_NAME_BL = cBEN_BNF_NAME_BL;
	}

	public Double getCBEN_LC_PAID_AMT() {
		return CBEN_LC_PAID_AMT;
	}

	public void setCBEN_LC_PAID_AMT(Double cBEN_LC_PAID_AMT) {
		CBEN_LC_PAID_AMT = cBEN_LC_PAID_AMT;
	}

	public Double getCBEN_FC_PAID_AMT() {
		return CBEN_FC_PAID_AMT;
	}

	public void setCBEN_FC_PAID_AMT(Double cBEN_FC_PAID_AMT) {
		CBEN_FC_PAID_AMT = cBEN_FC_PAID_AMT;
	}

	

	public String getCBEN_INS_ID() {
		return CBEN_INS_ID;
	}

	public void setCBEN_INS_ID(String cBEN_INS_ID) {
		CBEN_INS_ID = cBEN_INS_ID;
	}

	public Date getCBEN_INS_DT() {
		return CBEN_INS_DT;
	}

	public void setCBEN_INS_DT(Date cBEN_INS_DT) {
		CBEN_INS_DT = cBEN_INS_DT;
	}



	public String getCBEN_MOD_ID() {
		return CBEN_MOD_ID;
	}

	public void setCBEN_MOD_ID(String cBEN_MOD_ID) {
		CBEN_MOD_ID = cBEN_MOD_ID;
	}

	public Date getCBEN_MOD_DT() {
		return CBEN_MOD_DT;
	}

	public void setCBEN_MOD_DT(Date cBEN_MOD_DT) {
		CBEN_MOD_DT = cBEN_MOD_DT;
	}

	public Long getCBEN_PBEN_TRAN_ID() {
		return CBEN_PBEN_TRAN_ID;
	}

	public void setCBEN_PBEN_TRAN_ID(Long cBEN_PBEN_TRAN_ID) {
		CBEN_PBEN_TRAN_ID = cBEN_PBEN_TRAN_ID;
	}

	public String getCBEN_BNF_TYPE() {
		return CBEN_BNF_TYPE;
	}

	public void setCBEN_BNF_TYPE(String cBEN_BNF_TYPE) {
		CBEN_BNF_TYPE = cBEN_BNF_TYPE;
	}

	public Double getCBEN_PERC() {
		return CBEN_PERC;
	}

	public void setCBEN_PERC(Double cBEN_PERC) {
		CBEN_PERC = cBEN_PERC;
	}

	public String getCBEN_REF_ID1() {
		return CBEN_REF_ID1;
	}

	public void setCBEN_REF_ID1(String cBEN_REF_ID1) {
		CBEN_REF_ID1 = cBEN_REF_ID1;
	}

	public String getCBEN_REF_ID2() {
		return CBEN_REF_ID2;
	}

	public void setCBEN_REF_ID2(String cBEN_REF_ID2) {
		CBEN_REF_ID2 = cBEN_REF_ID2;
	}

	public String getCBEN_ADDRESS1() {
		return CBEN_ADDRESS1;
	}

	public void setCBEN_ADDRESS1(String cBEN_ADDRESS1) {
		CBEN_ADDRESS1 = cBEN_ADDRESS1;
	}

	public String getCBEN_ADDRESS2() {
		return CBEN_ADDRESS2;
	}

	public void setCBEN_ADDRESS2(String cBEN_ADDRESS2) {
		CBEN_ADDRESS2 = cBEN_ADDRESS2;
	}

	public String getCBEN_ADDRESS3() {
		return CBEN_ADDRESS3;
	}

	public void setCBEN_ADDRESS3(String cBEN_ADDRESS3) {
		CBEN_ADDRESS3 = cBEN_ADDRESS3;
	}

	public String getCBEN_STAT_CODE() {
		return CBEN_STAT_CODE;
	}

	public void setCBEN_STAT_CODE(String cBEN_STAT_CODE) {
		CBEN_STAT_CODE = cBEN_STAT_CODE;
	}

	public String getCBEN_POSTAL_CODE() {
		return CBEN_POSTAL_CODE;
	}

	public void setCBEN_POSTAL_CODE(String cBEN_POSTAL_CODE) {
		CBEN_POSTAL_CODE = cBEN_POSTAL_CODE;
	}

	public String getCBEN_CITY_CODE() {
		return CBEN_CITY_CODE;
	}

	public void setCBEN_CITY_CODE(String cBEN_CITY_CODE) {
		CBEN_CITY_CODE = cBEN_CITY_CODE;
	}

	public String getCBEN_SELECT_YN() {
		return CBEN_SELECT_YN;
	}

	public void setCBEN_SELECT_YN(String cBEN_SELECT_YN) {
		CBEN_SELECT_YN = cBEN_SELECT_YN;
	}

}
