package com.wenxt.claims.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_RI_EMPLOYEE")
public class LT_RI_EMPLOYEE {

    @Id
    @Column(name = "RE_TRAN_ID")
    private Integer RE_TRAN_ID;

    @Column(name = "RE_RPAH_TRAN_ID")
    private Integer RE_RPAH_TRAN_ID;

    @Column(name = "RE_PEMP_TRAN_ID")
    private Integer RE_PEMP_TRAN_ID;

    @Column(name = "RE_FC_SA")
    private Double RE_FC_SA;

    @Column(name = "RE_FC_SUM_CEDED")
    private Double RE_FC_SUM_CEDED;

    @Column(name = "RE_EMP_ANB")
    private Double RE_EMP_ANB;

    @Column(name = "RE_TL_RATE")
    private Double RE_TL_RATE;

    @Column(name = "RE_FC_PREM")
    private Double RE_FC_PREM;

    @Column(name = "RE_FC_EXTRA_PREM")
    private Double RE_FC_EXTRA_PREM;

    @Column(name = "RE_INS_DT")
    private Date RE_INS_DT;

    @Column(name = "RE_INS_ID")
    private String RE_INS_ID;

    @Column(name = "RE_MOD_DT")
    private Date RE_MOD_DT;

    @Column(name = "RE_MOD_UID")
    private String RE_MOD_UID;

	public Integer getRE_TRAN_ID() {
		return RE_TRAN_ID;
	}

	public void setRE_TRAN_ID(Integer rE_TRAN_ID) {
		RE_TRAN_ID = rE_TRAN_ID;
	}

	public Integer getRE_RPAH_TRAN_ID() {
		return RE_RPAH_TRAN_ID;
	}

	public void setRE_RPAH_TRAN_ID(Integer rE_RPAH_TRAN_ID) {
		RE_RPAH_TRAN_ID = rE_RPAH_TRAN_ID;
	}

	public Integer getRE_PEMP_TRAN_ID() {
		return RE_PEMP_TRAN_ID;
	}

	public void setRE_PEMP_TRAN_ID(Integer rE_PEMP_TRAN_ID) {
		RE_PEMP_TRAN_ID = rE_PEMP_TRAN_ID;
	}

	public Double getRE_FC_SA() {
		return RE_FC_SA;
	}

	public void setRE_FC_SA(Double rE_FC_SA) {
		RE_FC_SA = rE_FC_SA;
	}

	public Double getRE_FC_SUM_CEDED() {
		return RE_FC_SUM_CEDED;
	}

	public void setRE_FC_SUM_CEDED(Double rE_FC_SUM_CEDED) {
		RE_FC_SUM_CEDED = rE_FC_SUM_CEDED;
	}

	public Double getRE_EMP_ANB() {
		return RE_EMP_ANB;
	}

	public void setRE_EMP_ANB(Double rE_EMP_ANB) {
		RE_EMP_ANB = rE_EMP_ANB;
	}

	public Double getRE_TL_RATE() {
		return RE_TL_RATE;
	}

	public void setRE_TL_RATE(Double rE_TL_RATE) {
		RE_TL_RATE = rE_TL_RATE;
	}

	public Double getRE_FC_PREM() {
		return RE_FC_PREM;
	}

	public void setRE_FC_PREM(Double rE_FC_PREM) {
		RE_FC_PREM = rE_FC_PREM;
	}

	public Double getRE_FC_EXTRA_PREM() {
		return RE_FC_EXTRA_PREM;
	}

	public void setRE_FC_EXTRA_PREM(Double rE_FC_EXTRA_PREM) {
		RE_FC_EXTRA_PREM = rE_FC_EXTRA_PREM;
	}

	public Date getRE_INS_DT() {
		return RE_INS_DT;
	}

	public void setRE_INS_DT(Date rE_INS_DT) {
		RE_INS_DT = rE_INS_DT;
	}

	public String getRE_INS_ID() {
		return RE_INS_ID;
	}

	public void setRE_INS_ID(String rE_INS_ID) {
		RE_INS_ID = rE_INS_ID;
	}

	public Date getRE_MOD_DT() {
		return RE_MOD_DT;
	}

	public void setRE_MOD_DT(Date rE_MOD_DT) {
		RE_MOD_DT = rE_MOD_DT;
	}

	public String getRE_MOD_UID() {
		return RE_MOD_UID;
	}

	public void setRE_MOD_UID(String rE_MOD_UID) {
		RE_MOD_UID = rE_MOD_UID;
	}

}
