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
@Table(name = "LT_CLAIM_HDR")
public class LtClaimHdr {

    @Id
    @SequenceGenerator(name = "ClaimTranIdSeq", sequenceName = "CH_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ClaimTranIdSeq")
    @Column(name = "CH_TRAN_ID")
    private Integer CH_TRAN_ID;

    @Column(name = "CH_CLAIM_TYPE")
    private String CH_CLAIM_TYPE;

    @Column(name = "CH_CLAIM_BAS")
    private String CH_CLAIM_BAS;

    @Column(name = "CH_LOSS_DT")
    private Date CH_LOSS_DT;

    @Column(name = "CH_INTIM_DT")
    private Date CH_INTIM_DT;

    @Column(name = "CH_CLAIM_BAS_VAL")
    private String CH_CLAIM_BAS_VAL;

    @Column(name = "CH_INS_DT")
    private Date CH_INS_DT;

    @Column(name = "CH_INS_ID")
    private String CH_INS_ID;

    @Column(name = "CH_STATUS")
    private String CH_STATUS;

    @Column(name = "CH_STATUS_DT")
    private Date CH_STATUS_DT;

    @Column(name = "CH_REF_NO")
    private String CH_REF_NO;

	public Integer getCH_TRAN_ID() {
		return CH_TRAN_ID;
	}

	public void setCH_TRAN_ID(Integer cH_TRAN_ID) {
		CH_TRAN_ID = cH_TRAN_ID;
	}

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

	public Date getCH_LOSS_DT() {
		return CH_LOSS_DT;
	}

	public void setCH_LOSS_DT(Date cH_LOSS_DT) {
		CH_LOSS_DT = cH_LOSS_DT;
	}

	public Date getCH_INTIM_DT() {
		return CH_INTIM_DT;
	}

	public void setCH_INTIM_DT(Date cH_INTIM_DT) {
		CH_INTIM_DT = cH_INTIM_DT;
	}

	public String getCH_CLAIM_BAS_VAL() {
		return CH_CLAIM_BAS_VAL;
	}

	public void setCH_CLAIM_BAS_VAL(String cH_CLAIM_BAS_VAL) {
		CH_CLAIM_BAS_VAL = cH_CLAIM_BAS_VAL;
	}

	public Date getCH_INS_DT() {
		return CH_INS_DT;
	}

	public void setCH_INS_DT(Date cH_INS_DT) {
		CH_INS_DT = cH_INS_DT;
	}

	public String getCH_INS_ID() {
		return CH_INS_ID;
	}

	public void setCH_INS_ID(String cH_INS_ID) {
		CH_INS_ID = cH_INS_ID;
	}

	public String getCH_STATUS() {
		return CH_STATUS;
	}

	public void setCH_STATUS(String cH_STATUS) {
		CH_STATUS = cH_STATUS;
	}

	public Date getCH_STATUS_DT() {
		return CH_STATUS_DT;
	}

	public void setCH_STATUS_DT(Date cH_STATUS_DT) {
		CH_STATUS_DT = cH_STATUS_DT;
	}

	public String getCH_REF_NO() {
		return CH_REF_NO;
	}

	public void setCH_REF_NO(String cH_REF_NO) {
		CH_REF_NO = cH_REF_NO;
	}

}
