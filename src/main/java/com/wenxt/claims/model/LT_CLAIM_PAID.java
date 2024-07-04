package com.wenxt.claims.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_CLAIM_PAID", schema = "LIFE_DEV")
public class LT_CLAIM_PAID {

    @Id
    @SequenceGenerator(name = "ClaimPaidTranIdSeq", sequenceName = "CP_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ClaimPaidTranIdSeq")
    @Column(name = "CP_TRAN_ID")
    private Integer CP_TRAN_ID;

    @Column(name = "CP_CE_TRAN_ID")
    private Integer CP_CE_TRAN_ID;

    @Column(name = "CP_CLM_TRAN_ID")
    private Integer CP_CLM_TRAN_ID;

    @Column(name = "CP_UW_YEAR")
    private Integer CP_UW_YEAR;

    @Column(name = "CP_PAID_DT")
    private Date CP_PAID_DT;

    @Column(name = "CP_LC_PAID_AMT")
    private Double CP_LC_PAID_AMT;

    @Column(name = "CP_FC_PAID_AMT")
    private Double CP_FC_PAID_AMT;

    @Column(name = "CP_APPR_FLAG")
    private String CP_APPR_FLAG;

    @Column(name = "CP_REF_TRAN_ID")
    private Long CP_REF_TRAN_ID;

    @Column(name = "CP_APPR_DT")
    private Date CP_APPR_DT;

    @Column(name = "CP_APPR_UID")
    private String CP_APPR_UID;

    @Column(name = "CP_INS_DT")
    private Date CP_INS_DT;

    @Column(name = "CP_INS_ID")
    private String CP_INS_ID;

    @Column(name = "CP_MOD_DT")
    private Date CP_MOD_DT;

    @Column(name = "CP_MOD_ID")
    private String CP_MOD_ID;

    @Column(name = "CP_EST_TYPE")
    private String CP_EST_TYPE;

	public Integer getCP_TRAN_ID() {
		return CP_TRAN_ID;
	}

	public void setCP_TRAN_ID(Integer cP_TRAN_ID) {
		CP_TRAN_ID = cP_TRAN_ID;
	}

	public Integer getCP_CE_TRAN_ID() {
		return CP_CE_TRAN_ID;
	}

	public void setCP_CE_TRAN_ID(Integer cP_CE_TRAN_ID) {
		CP_CE_TRAN_ID = cP_CE_TRAN_ID;
	}

	public Integer getCP_CLM_TRAN_ID() {
		return CP_CLM_TRAN_ID;
	}

	public void setCP_CLM_TRAN_ID(Integer cP_CLM_TRAN_ID) {
		CP_CLM_TRAN_ID = cP_CLM_TRAN_ID;
	}

	public Integer getCP_UW_YEAR() {
		return CP_UW_YEAR;
	}

	public void setCP_UW_YEAR(Integer cP_UW_YEAR) {
		CP_UW_YEAR = cP_UW_YEAR;
	}

	public Date getCP_PAID_DT() {
		return CP_PAID_DT;
	}

	public void setCP_PAID_DT(Date cP_PAID_DT) {
		CP_PAID_DT = cP_PAID_DT;
	}

	public Double getCP_LC_PAID_AMT() {
		return CP_LC_PAID_AMT;
	}

	public void setCP_LC_PAID_AMT(Double cP_LC_PAID_AMT) {
		CP_LC_PAID_AMT = cP_LC_PAID_AMT;
	}

	public Double getCP_FC_PAID_AMT() {
		return CP_FC_PAID_AMT;
	}

	public void setCP_FC_PAID_AMT(Double cP_FC_PAID_AMT) {
		CP_FC_PAID_AMT = cP_FC_PAID_AMT;
	}

	public String getCP_APPR_FLAG() {
		return CP_APPR_FLAG;
	}

	public void setCP_APPR_FLAG(String cP_APPR_FLAG) {
		CP_APPR_FLAG = cP_APPR_FLAG;
	}

	public Long getCP_REF_TRAN_ID() {
		return CP_REF_TRAN_ID;
	}

	public void setCP_REF_TRAN_ID(Long cP_REF_TRAN_ID) {
		CP_REF_TRAN_ID = cP_REF_TRAN_ID;
	}

	public Date getCP_APPR_DT() {
		return CP_APPR_DT;
	}

	public void setCP_APPR_DT(Date cP_APPR_DT) {
		CP_APPR_DT = cP_APPR_DT;
	}

	public String getCP_APPR_UID() {
		return CP_APPR_UID;
	}

	public void setCP_APPR_UID(String cP_APPR_UID) {
		CP_APPR_UID = cP_APPR_UID;
	}

	public Date getCP_INS_DT() {
		return CP_INS_DT;
	}

	public void setCP_INS_DT(Date cP_INS_DT) {
		CP_INS_DT = cP_INS_DT;
	}

	public String getCP_INS_ID() {
		return CP_INS_ID;
	}

	public void setCP_INS_ID(String cP_INS_ID) {
		CP_INS_ID = cP_INS_ID;
	}

	public Date getCP_MOD_DT() {
		return CP_MOD_DT;
	}

	public void setCP_MOD_DT(Date cP_MOD_DT) {
		CP_MOD_DT = cP_MOD_DT;
	}

	public String getCP_MOD_ID() {
		return CP_MOD_ID;
	}

	public void setCP_MOD_ID(String cP_MOD_ID) {
		CP_MOD_ID = cP_MOD_ID;
	}

	public String getCP_EST_TYPE() {
		return CP_EST_TYPE;
	}

	public void setCP_EST_TYPE(String cP_EST_TYPE) {
		CP_EST_TYPE = cP_EST_TYPE;
	}

}