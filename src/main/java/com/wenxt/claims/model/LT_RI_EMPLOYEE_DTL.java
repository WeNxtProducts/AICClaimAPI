package com.wenxt.claims.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_RI_EMPLOYEE_DTL")
public class LT_RI_EMPLOYEE_DTL {

    @Id
    @SequenceGenerator(name = "EmpDetailTranIdSequence", sequenceName = "RED_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EmpDetailTranIdSequence")
    @Column(name = "RED_TRAN_ID")
    private Integer RED_TRAN_ID;

    @Column(name = "RED_RE_TRAN_ID")
    private Integer RED_RE_TRAN_ID;

    @Column(name = "RED_SRNO")
    private Integer RED_SRNO;

    @Column(name = "RED_TREATY_TYPE")
    private String RED_TREATY_TYPE;

    @Column(name = "RED_FC_RETN_SA")
    private BigDecimal RED_FC_RETN_SA;

    @Column(name = "RED_FC_RI_RETN_PREM")
    private BigDecimal RED_FC_RI_RETN_PREM;

    @Column(name = "RED_FC_RI_SA")
    private BigDecimal RED_FC_RI_SA;

    @Column(name = "RED_FC_RI_PREM")
    private BigDecimal RED_FC_RI_PREM;

    @Column(name = "RED_RI_COMM_PERC")
    private BigDecimal RED_RI_COMM_PERC;

    @Column(name = "RED_FC_RI_COMM")
    private BigDecimal RED_FC_RI_COMM;

    @Column(name = "RED_FC_EXTRA_PREM")
    private BigDecimal RED_FC_EXTRA_PREM;

    @Column(name = "RED_RI_CLOSE_FLAG")
    private String RED_RI_CLOSE_FLAG;

    @Column(name = "RED_INS_DT")
    private Date RED_INS_DT;

    @Column(name = "RED_INS_ID")
    private String RED_INS_ID;

    @Column(name = "RED_MOD_DT")
    private Date RED_MOD_DT;

    @Column(name = "RED_MOD_ID")
    private String RED_MOD_ID;

    @Column(name = "RED_PEC_TRAN_ID")
    private Long RED_PEC_TRAN_ID;

    @Column(name = "RED_FC_RI_SAR_SA")
    private BigDecimal RED_FC_RI_SAR_SA;

    @Column(name = "RED_FC_RETN_SAR_SA")
    private BigDecimal RED_FC_RETN_SAR_SA;

    @Column(name = "RED_RI_RATE")
    private BigDecimal RED_RI_RATE;

    @Column(name = "RED_COVER_CODE")
    private String RED_COVER_CODE;

    @Column(name = "RED_CUST_CODE")
    private String RED_CUST_CODE;

    @Column(name = "RED_RI_PERC")
    private BigDecimal RED_RI_PERC;

    @Column(name = "RED_PRD_FM_DT")
    private Date RED_PRD_FM_DT;

    @Column(name = "RED_PRD_TO_DT")
    private Date RED_PRD_TO_DT;

	public Integer getRED_TRAN_ID() {
		return RED_TRAN_ID;
	}

	public void setRED_TRAN_ID(Integer rED_TRAN_ID) {
		RED_TRAN_ID = rED_TRAN_ID;
	}

	public Integer getRED_RE_TRAN_ID() {
		return RED_RE_TRAN_ID;
	}

	public void setRED_RE_TRAN_ID(Integer rED_RE_TRAN_ID) {
		RED_RE_TRAN_ID = rED_RE_TRAN_ID;
	}

	public Integer getRED_SRNO() {
		return RED_SRNO;
	}

	public void setRED_SRNO(Integer rED_SRNO) {
		RED_SRNO = rED_SRNO;
	}

	public String getRED_TREATY_TYPE() {
		return RED_TREATY_TYPE;
	}

	public void setRED_TREATY_TYPE(String rED_TREATY_TYPE) {
		RED_TREATY_TYPE = rED_TREATY_TYPE;
	}

	public BigDecimal getRED_FC_RETN_SA() {
		return RED_FC_RETN_SA;
	}

	public void setRED_FC_RETN_SA(BigDecimal rED_FC_RETN_SA) {
		RED_FC_RETN_SA = rED_FC_RETN_SA;
	}

	public BigDecimal getRED_FC_RI_RETN_PREM() {
		return RED_FC_RI_RETN_PREM;
	}

	public void setRED_FC_RI_RETN_PREM(BigDecimal rED_FC_RI_RETN_PREM) {
		RED_FC_RI_RETN_PREM = rED_FC_RI_RETN_PREM;
	}

	public BigDecimal getRED_FC_RI_SA() {
		return RED_FC_RI_SA;
	}

	public void setRED_FC_RI_SA(BigDecimal rED_FC_RI_SA) {
		RED_FC_RI_SA = rED_FC_RI_SA;
	}

	public BigDecimal getRED_FC_RI_PREM() {
		return RED_FC_RI_PREM;
	}

	public void setRED_FC_RI_PREM(BigDecimal rED_FC_RI_PREM) {
		RED_FC_RI_PREM = rED_FC_RI_PREM;
	}

	public BigDecimal getRED_RI_COMM_PERC() {
		return RED_RI_COMM_PERC;
	}

	public void setRED_RI_COMM_PERC(BigDecimal rED_RI_COMM_PERC) {
		RED_RI_COMM_PERC = rED_RI_COMM_PERC;
	}

	public BigDecimal getRED_FC_RI_COMM() {
		return RED_FC_RI_COMM;
	}

	public void setRED_FC_RI_COMM(BigDecimal rED_FC_RI_COMM) {
		RED_FC_RI_COMM = rED_FC_RI_COMM;
	}

	public BigDecimal getRED_FC_EXTRA_PREM() {
		return RED_FC_EXTRA_PREM;
	}

	public void setRED_FC_EXTRA_PREM(BigDecimal rED_FC_EXTRA_PREM) {
		RED_FC_EXTRA_PREM = rED_FC_EXTRA_PREM;
	}

	public String getRED_RI_CLOSE_FLAG() {
		return RED_RI_CLOSE_FLAG;
	}

	public void setRED_RI_CLOSE_FLAG(String rED_RI_CLOSE_FLAG) {
		RED_RI_CLOSE_FLAG = rED_RI_CLOSE_FLAG;
	}

	public Date getRED_INS_DT() {
		return RED_INS_DT;
	}

	public void setRED_INS_DT(Date rED_INS_DT) {
		RED_INS_DT = rED_INS_DT;
	}

	public String getRED_INS_ID() {
		return RED_INS_ID;
	}

	public void setRED_INS_ID(String rED_INS_ID) {
		RED_INS_ID = rED_INS_ID;
	}

	public Date getRED_MOD_DT() {
		return RED_MOD_DT;
	}

	public void setRED_MOD_DT(Date rED_MOD_DT) {
		RED_MOD_DT = rED_MOD_DT;
	}

	public String getRED_MOD_ID() {
		return RED_MOD_ID;
	}

	public void setRED_MOD_ID(String rED_MOD_ID) {
		RED_MOD_ID = rED_MOD_ID;
	}

	public Long getRED_PEC_TRAN_ID() {
		return RED_PEC_TRAN_ID;
	}

	public void setRED_PEC_TRAN_ID(Long rED_PEC_TRAN_ID) {
		RED_PEC_TRAN_ID = rED_PEC_TRAN_ID;
	}

	public BigDecimal getRED_FC_RI_SAR_SA() {
		return RED_FC_RI_SAR_SA;
	}

	public void setRED_FC_RI_SAR_SA(BigDecimal rED_FC_RI_SAR_SA) {
		RED_FC_RI_SAR_SA = rED_FC_RI_SAR_SA;
	}

	public BigDecimal getRED_FC_RETN_SAR_SA() {
		return RED_FC_RETN_SAR_SA;
	}

	public void setRED_FC_RETN_SAR_SA(BigDecimal rED_FC_RETN_SAR_SA) {
		RED_FC_RETN_SAR_SA = rED_FC_RETN_SAR_SA;
	}

	public BigDecimal getRED_RI_RATE() {
		return RED_RI_RATE;
	}

	public void setRED_RI_RATE(BigDecimal rED_RI_RATE) {
		RED_RI_RATE = rED_RI_RATE;
	}

	public String getRED_COVER_CODE() {
		return RED_COVER_CODE;
	}

	public void setRED_COVER_CODE(String rED_COVER_CODE) {
		RED_COVER_CODE = rED_COVER_CODE;
	}

	public String getRED_CUST_CODE() {
		return RED_CUST_CODE;
	}

	public void setRED_CUST_CODE(String rED_CUST_CODE) {
		RED_CUST_CODE = rED_CUST_CODE;
	}

	public BigDecimal getRED_RI_PERC() {
		return RED_RI_PERC;
	}

	public void setRED_RI_PERC(BigDecimal rED_RI_PERC) {
		RED_RI_PERC = rED_RI_PERC;
	}

	public Date getRED_PRD_FM_DT() {
		return RED_PRD_FM_DT;
	}

	public void setRED_PRD_FM_DT(Date rED_PRD_FM_DT) {
		RED_PRD_FM_DT = rED_PRD_FM_DT;
	}

	public Date getRED_PRD_TO_DT() {
		return RED_PRD_TO_DT;
	}

	public void setRED_PRD_TO_DT(Date rED_PRD_TO_DT) {
		RED_PRD_TO_DT = rED_PRD_TO_DT;
	}

}
