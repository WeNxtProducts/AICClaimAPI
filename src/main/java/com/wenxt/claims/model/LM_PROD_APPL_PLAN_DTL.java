package com.wenxt.claims.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "LM_PROD_APPL_PLAN_DTL", schema = "LIFE_DEV")
public class LM_PROD_APPL_PLAN_DTL {

    @Id
    @Column(name = "PAD_TRAN_ID", nullable = false)
    @JsonProperty("PPD_TRAN_ID")
    private Integer PAD_TRAN_ID;

    @Column(name = "PAD_PAP_TRAN_ID")
    @JsonProperty("PPD_PPH_TRAN_ID")
    private Long PAD_PAP_TRAN_ID;

    @Column(name = "PAD_PLAN_CODE")
    @JsonProperty("PPD_PLAN_CODE")
    private String PAD_PLAN_CODE;

    @Column(name = "PAD_PROD_CODE")
    @JsonProperty("PPD_PROD_CODE")
    private String PAD_PROD_CODE;

    @Column(name = "PAD_COVER_CODE")
    @JsonProperty("PPD_COVER_CODE")
    private String PAD_COVER_CODE;

    @Column(name = "PAD_SA_TYPE")
    @JsonProperty("PPD_SA_TYPE")
    private String PAD_SA_TYPE;

    @Column(name = "PAD_SA_PERC")
    @JsonProperty("PPD_SA_PERC")
    private BigDecimal PAD_SA_PERC;

    @Column(name = "PAD_SA_MONTHS")
    @JsonProperty("PPD_SA_MONTHS")
    private Integer PAD_SA_MONTHS;

    @Column(name = "PAD_SA_LC_LIMIT")
    @JsonProperty("PPD_SA_LC_LIMIT")
    private BigDecimal PAD_SA_LC_LIMIT;

    @Column(name = "PAD_INS_DT")
    @JsonProperty("PPD_INS_DT")
    private Date PAD_INS_DT;

    @Column(name = "PAD_INSID")
    @JsonProperty("PPD_INS_ID")
    private String PAD_INSID;

    @Column(name = "PAD_MOD_DT")
    @JsonProperty("PPD_MOD_DT")
    private Date PAD_MOD_DT;

    @Column(name = "PAD_MOD_ID")
    @JsonProperty("PPD_MOD_ID")
    private String PAD_MOD_ID;

    @Column(name = "PAD_MANDATORY_YN")
    @JsonProperty("PPD_MANDATORY_YN")
    private String PAD_MANDATORY_YN;

    @Column(name = "PAD_DEFAULT_YN")
//    @JsonProperty("")
    private String PAD_DEFAULT_YN;

    @Column(name = "PAD_DEP_RATE")
    @JsonProperty("PPD_DEP_RATE")
    private BigDecimal PAD_DEP_RATE;

    @Column(name = "PAD_DEPN_APPL_YN")
    @JsonProperty("PPD_DEPN_APPL_YN")
    private String PAD_DEPN_APPL_YN;

    @Column(name = "PAD_RATE_TYPE")
    @JsonProperty("PPD_RATE_TYPE")
    private String PAD_RATE_TYPE;

    @Column(name = "PAD_RATE_PER")
    @JsonProperty("PPD_RATE_PER")
    private Long PAD_RATE_PER;

    @Column(name = "PAD_RATE")
    @JsonProperty("PPD_RATE")
    private BigDecimal PAD_RATE;

    @Column(name = "PAD_MIN_AGE")
    @JsonProperty("PPD_MIN_AGE")
    private Integer PAD_MIN_AGE;

    @Column(name = "PAD_MAX_AGE")
    @JsonProperty("PPD_MAX_AGE")
    private Integer PAD_MAX_AGE;

    @Column(name = "PAD_MAX_MAT_AGE")
    private Integer PAD_MAX_MAT_AGE;

    @Column(name = "PAD_CVR_VAL_YN")
    private String PAD_CVR_VAL_YN;

    @Column(name = "PAD_MIN_SA")
    @JsonProperty("PPD_MIN_SA")
    private BigDecimal PAD_MIN_SA;

    @Column(name = "PAD_MAX_SA")
    @JsonProperty("PPD_MAX_SA")
    private BigDecimal PAD_MAX_SA;

    @Column(name = "PAD_SER_NO")
    private Long PAD_SER_NO;

	public Integer getPAD_TRAN_ID() {
		return PAD_TRAN_ID;
	}

	public void setPAD_TRAN_ID(Integer pAD_TRAN_ID) {
		PAD_TRAN_ID = pAD_TRAN_ID;
	}

	public Long getPAD_PAP_TRAN_ID() {
		return PAD_PAP_TRAN_ID;
	}

	public void setPAD_PAP_TRAN_ID(Long pAD_PAP_TRAN_ID) {
		PAD_PAP_TRAN_ID = pAD_PAP_TRAN_ID;
	}

	public String getPAD_PLAN_CODE() {
		return PAD_PLAN_CODE;
	}

	public void setPAD_PLAN_CODE(String pAD_PLAN_CODE) {
		PAD_PLAN_CODE = pAD_PLAN_CODE;
	}

	public String getPAD_PROD_CODE() {
		return PAD_PROD_CODE;
	}

	public void setPAD_PROD_CODE(String pAD_PROD_CODE) {
		PAD_PROD_CODE = pAD_PROD_CODE;
	}

	public String getPAD_COVER_CODE() {
		return PAD_COVER_CODE;
	}

	public void setPAD_COVER_CODE(String pAD_COVER_CODE) {
		PAD_COVER_CODE = pAD_COVER_CODE;
	}

	public String getPAD_SA_TYPE() {
		return PAD_SA_TYPE;
	}

	public void setPAD_SA_TYPE(String pAD_SA_TYPE) {
		PAD_SA_TYPE = pAD_SA_TYPE;
	}

	public BigDecimal getPAD_SA_PERC() {
		return PAD_SA_PERC;
	}

	public void setPAD_SA_PERC(BigDecimal pAD_SA_PERC) {
		PAD_SA_PERC = pAD_SA_PERC;
	}

	public Integer getPAD_SA_MONTHS() {
		return PAD_SA_MONTHS;
	}

	public void setPAD_SA_MONTHS(Integer pAD_SA_MONTHS) {
		PAD_SA_MONTHS = pAD_SA_MONTHS;
	}

	public BigDecimal getPAD_SA_LC_LIMIT() {
		return PAD_SA_LC_LIMIT;
	}

	public void setPAD_SA_LC_LIMIT(BigDecimal pAD_SA_LC_LIMIT) {
		PAD_SA_LC_LIMIT = pAD_SA_LC_LIMIT;
	}

	public Date getPAD_INS_DT() {
		return PAD_INS_DT;
	}

	public void setPAD_INS_DT(Date pAD_INS_DT) {
		PAD_INS_DT = pAD_INS_DT;
	}

	public String getPAD_INSID() {
		return PAD_INSID;
	}

	public void setPAD_INSID(String pAD_INSID) {
		PAD_INSID = pAD_INSID;
	}

	public Date getPAD_MOD_DT() {
		return PAD_MOD_DT;
	}

	public void setPAD_MOD_DT(Date pAD_MOD_DT) {
		PAD_MOD_DT = pAD_MOD_DT;
	}

	public String getPAD_MOD_ID() {
		return PAD_MOD_ID;
	}

	public void setPAD_MOD_ID(String pAD_MOD_ID) {
		PAD_MOD_ID = pAD_MOD_ID;
	}

	public String getPAD_MANDATORY_YN() {
		return PAD_MANDATORY_YN;
	}

	public void setPAD_MANDATORY_YN(String pAD_MANDATORY_YN) {
		PAD_MANDATORY_YN = pAD_MANDATORY_YN;
	}

	public String getPAD_DEFAULT_YN() {
		return PAD_DEFAULT_YN;
	}

	public void setPAD_DEFAULT_YN(String pAD_DEFAULT_YN) {
		PAD_DEFAULT_YN = pAD_DEFAULT_YN;
	}

	public BigDecimal getPAD_DEP_RATE() {
		return PAD_DEP_RATE;
	}

	public void setPAD_DEP_RATE(BigDecimal pAD_DEP_RATE) {
		PAD_DEP_RATE = pAD_DEP_RATE;
	}

	public String getPAD_DEPN_APPL_YN() {
		return PAD_DEPN_APPL_YN;
	}

	public void setPAD_DEPN_APPL_YN(String pAD_DEPN_APPL_YN) {
		PAD_DEPN_APPL_YN = pAD_DEPN_APPL_YN;
	}

	public String getPAD_RATE_TYPE() {
		return PAD_RATE_TYPE;
	}

	public void setPAD_RATE_TYPE(String pAD_RATE_TYPE) {
		PAD_RATE_TYPE = pAD_RATE_TYPE;
	}

	public Long getPAD_RATE_PER() {
		return PAD_RATE_PER;
	}

	public void setPAD_RATE_PER(Long pAD_RATE_PER) {
		PAD_RATE_PER = pAD_RATE_PER;
	}

	public BigDecimal getPAD_RATE() {
		return PAD_RATE;
	}

	public void setPAD_RATE(BigDecimal pAD_RATE) {
		PAD_RATE = pAD_RATE;
	}

	public Integer getPAD_MIN_AGE() {
		return PAD_MIN_AGE;
	}

	public void setPAD_MIN_AGE(Integer pAD_MIN_AGE) {
		PAD_MIN_AGE = pAD_MIN_AGE;
	}

	public Integer getPAD_MAX_AGE() {
		return PAD_MAX_AGE;
	}

	public void setPAD_MAX_AGE(Integer pAD_MAX_AGE) {
		PAD_MAX_AGE = pAD_MAX_AGE;
	}

	public Integer getPAD_MAX_MAT_AGE() {
		return PAD_MAX_MAT_AGE;
	}

	public void setPAD_MAX_MAT_AGE(Integer pAD_MAX_MAT_AGE) {
		PAD_MAX_MAT_AGE = pAD_MAX_MAT_AGE;
	}

	public String getPAD_CVR_VAL_YN() {
		return PAD_CVR_VAL_YN;
	}

	public void setPAD_CVR_VAL_YN(String pAD_CVR_VAL_YN) {
		PAD_CVR_VAL_YN = pAD_CVR_VAL_YN;
	}

	public BigDecimal getPAD_MIN_SA() {
		return PAD_MIN_SA;
	}

	public void setPAD_MIN_SA(BigDecimal pAD_MIN_SA) {
		PAD_MIN_SA = pAD_MIN_SA;
	}

	public BigDecimal getPAD_MAX_SA() {
		return PAD_MAX_SA;
	}

	public void setPAD_MAX_SA(BigDecimal pAD_MAX_SA) {
		PAD_MAX_SA = pAD_MAX_SA;
	}

	public Long getPAD_SER_NO() {
		return PAD_SER_NO;
	}

	public void setPAD_SER_NO(Long pAD_SER_NO) {
		PAD_SER_NO = pAD_SER_NO;
	}

}
