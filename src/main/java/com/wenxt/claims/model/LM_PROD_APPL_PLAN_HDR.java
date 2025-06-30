package com.wenxt.claims.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_PROD_APPL_PLAN_HDR", schema = "LIFE_DEV")
public class LM_PROD_APPL_PLAN_HDR {

    @Id
    @Column(name = "PAP_TRAN_ID", nullable = false)
    private Long PAP_TRAN_ID;

    @Column(name = "PAP_PROD_CODE")
    private String PAP_PROD_CODE;

    @Column(name = "PAP_PLAN_CODE")
    private String PAP_PLAN_CODE;

    @Column(name = "PAP_INS_DT")
    private Date PAP_INS_DT;

    @Column(name = "PAP_INS_ID")
    private String PAP_INS_ID;

    @Column(name = "PAP_MOD_ID")
    private String PAP_MOD_ID;

    @Column(name = "PAP_MOD_DT")
    private Date PAP_MOD_DT;

    @Column(name = "PAP_SERIAL_NO")
    private Long PAP_SERIAL_NO;

    @Column(name = "PAP_PERIOD_FROM")
    private Integer PAP_PERIOD_FROM;

    @Column(name = "PAP_PERIOD_TO")
    private Integer PAP_PERIOD_TO;

    @Column(name = "PAP_MIN_SA")
    private BigDecimal PAP_MIN_SA;

    @Column(name = "PAP_MAX_SA")
    private BigDecimal PAP_MAX_SA;

    @Column(name = "PAP_PLAN_DESC")
    private String PAP_PLAN_DESC;

	public Long getPAP_TRAN_ID() {
		return PAP_TRAN_ID;
	}

	public void setPAP_TRAN_ID(Long pAP_TRAN_ID) {
		PAP_TRAN_ID = pAP_TRAN_ID;
	}

	public String getPAP_PROD_CODE() {
		return PAP_PROD_CODE;
	}

	public void setPAP_PROD_CODE(String pAP_PROD_CODE) {
		PAP_PROD_CODE = pAP_PROD_CODE;
	}

	public String getPAP_PLAN_CODE() {
		return PAP_PLAN_CODE;
	}

	public void setPAP_PLAN_CODE(String pAP_PLAN_CODE) {
		PAP_PLAN_CODE = pAP_PLAN_CODE;
	}

	public Date getPAP_INS_DT() {
		return PAP_INS_DT;
	}

	public void setPAP_INS_DT(Date pAP_INS_DT) {
		PAP_INS_DT = pAP_INS_DT;
	}

	public String getPAP_INS_ID() {
		return PAP_INS_ID;
	}

	public void setPAP_INS_ID(String pAP_INS_ID) {
		PAP_INS_ID = pAP_INS_ID;
	}

	public String getPAP_MOD_ID() {
		return PAP_MOD_ID;
	}

	public void setPAP_MOD_ID(String pAP_MOD_ID) {
		PAP_MOD_ID = pAP_MOD_ID;
	}

	public Date getPAP_MOD_DT() {
		return PAP_MOD_DT;
	}

	public void setPAP_MOD_DT(Date pAP_MOD_DT) {
		PAP_MOD_DT = pAP_MOD_DT;
	}

	public Long getPAP_SERIAL_NO() {
		return PAP_SERIAL_NO;
	}

	public void setPAP_SERIAL_NO(Long pAP_SERIAL_NO) {
		PAP_SERIAL_NO = pAP_SERIAL_NO;
	}

	public Integer getPAP_PERIOD_FROM() {
		return PAP_PERIOD_FROM;
	}

	public void setPAP_PERIOD_FROM(Integer pAP_PERIOD_FROM) {
		PAP_PERIOD_FROM = pAP_PERIOD_FROM;
	}

	public Integer getPAP_PERIOD_TO() {
		return PAP_PERIOD_TO;
	}

	public void setPAP_PERIOD_TO(Integer pAP_PERIOD_TO) {
		PAP_PERIOD_TO = pAP_PERIOD_TO;
	}

	public BigDecimal getPAP_MIN_SA() {
		return PAP_MIN_SA;
	}

	public void setPAP_MIN_SA(BigDecimal pAP_MIN_SA) {
		PAP_MIN_SA = pAP_MIN_SA;
	}

	public BigDecimal getPAP_MAX_SA() {
		return PAP_MAX_SA;
	}

	public void setPAP_MAX_SA(BigDecimal pAP_MAX_SA) {
		PAP_MAX_SA = pAP_MAX_SA;
	}

	public String getPAP_PLAN_DESC() {
		return PAP_PLAN_DESC;
	}

	public void setPAP_PLAN_DESC(String pAP_PLAN_DESC) {
		PAP_PLAN_DESC = pAP_PLAN_DESC;
	}
  
}
