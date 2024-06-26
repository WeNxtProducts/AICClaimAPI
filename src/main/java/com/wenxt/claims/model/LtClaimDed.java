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
@Table(name = "LT_CLAIM_DEDUCTION")
public class LtClaimDed {
	
	@Id
    @SequenceGenerator(name = "ClaimDedTranIdSeq", sequenceName = "CD_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ClaimDedTranIdSeq")
    @Column(name = "CD_TRAN_ID")
    private Integer CD_TRAN_ID;

    @Column(name = "CD_CLM_TRAN_ID")
    private Integer CD_CLM_TRAN_ID;

    @Column(name = "CD_LC_PREM_OS")
    private Double CD_LC_PREM_OS;

    @Column(name = "CD_FC_PREM_OS")
    private Double CD_FC_PREM_OS;

    @Column(name = "CD_LC_LOAN_OS")
    private Double CD_LC_LOAN_OS;

    @Column(name = "CD_FC_LOAN_OS")
    private Double CD_FC_LOAN_OS;

    @Column(name = "CD_LC_LOAN_INT")
    private Double CD_LC_LOAN_INT;

    @Column(name = "CD_FC_LOAN_INT")
    private Double CD_FC_LOAN_INT;

    @Column(name = "CD_LC_PREM_INT")
    private Double CD_LC_PREM_INT;

    @Column(name = "CD_FC_PREM_INT")
    private Double CD_FC_PREM_INT;

    @Column(name = "CD_WAIVE_PREM_INT")
    private String CD_WAIVE_PREM_INT;

    @Column(name = "CD_WAIVE_LOAN_INT")
    private String CD_WAIVE_LOAN_INT;

    @Column(name = "CD_INS_ID")
    private String CD_INS_ID;

    @Column(name = "CD_INS_DT")
    private Date CD_INS_DT;

	public Integer getCD_TRAN_ID() {
		return CD_TRAN_ID;
	}

	public void setCD_TRAN_ID(Integer cD_TRAN_ID) {
		CD_TRAN_ID = cD_TRAN_ID;
	}

	public Integer getCD_CLM_TRAN_ID() {
		return CD_CLM_TRAN_ID;
	}

	public void setCD_CLM_TRAN_ID(Integer cD_CLM_TRAN_ID) {
		CD_CLM_TRAN_ID = cD_CLM_TRAN_ID;
	}

	public Double getCD_LC_PREM_OS() {
		return CD_LC_PREM_OS;
	}

	public void setCD_LC_PREM_OS(Double cD_LC_PREM_OS) {
		CD_LC_PREM_OS = cD_LC_PREM_OS;
	}

	public Double getCD_FC_PREM_OS() {
		return CD_FC_PREM_OS;
	}

	public void setCD_FC_PREM_OS(Double cD_FC_PREM_OS) {
		CD_FC_PREM_OS = cD_FC_PREM_OS;
	}

	public Double getCD_LC_LOAN_OS() {
		return CD_LC_LOAN_OS;
	}

	public void setCD_LC_LOAN_OS(Double cD_LC_LOAN_OS) {
		CD_LC_LOAN_OS = cD_LC_LOAN_OS;
	}

	public Double getCD_FC_LOAN_OS() {
		return CD_FC_LOAN_OS;
	}

	public void setCD_FC_LOAN_OS(Double cD_FC_LOAN_OS) {
		CD_FC_LOAN_OS = cD_FC_LOAN_OS;
	}

	public Double getCD_LC_LOAN_INT() {
		return CD_LC_LOAN_INT;
	}

	public void setCD_LC_LOAN_INT(Double cD_LC_LOAN_INT) {
		CD_LC_LOAN_INT = cD_LC_LOAN_INT;
	}

	public Double getCD_FC_LOAN_INT() {
		return CD_FC_LOAN_INT;
	}

	public void setCD_FC_LOAN_INT(Double cD_FC_LOAN_INT) {
		CD_FC_LOAN_INT = cD_FC_LOAN_INT;
	}

	public Double getCD_LC_PREM_INT() {
		return CD_LC_PREM_INT;
	}

	public void setCD_LC_PREM_INT(Double cD_LC_PREM_INT) {
		CD_LC_PREM_INT = cD_LC_PREM_INT;
	}

	public Double getCD_FC_PREM_INT() {
		return CD_FC_PREM_INT;
	}

	public void setCD_FC_PREM_INT(Double cD_FC_PREM_INT) {
		CD_FC_PREM_INT = cD_FC_PREM_INT;
	}

	public String getCD_WAIVE_PREM_INT() {
		return CD_WAIVE_PREM_INT;
	}

	public void setCD_WAIVE_PREM_INT(String cD_WAIVE_PREM_INT) {
		CD_WAIVE_PREM_INT = cD_WAIVE_PREM_INT;
	}

	public String getCD_WAIVE_LOAN_INT() {
		return CD_WAIVE_LOAN_INT;
	}

	public void setCD_WAIVE_LOAN_INT(String cD_WAIVE_LOAN_INT) {
		CD_WAIVE_LOAN_INT = cD_WAIVE_LOAN_INT;
	}

	public String getCD_INS_ID() {
		return CD_INS_ID;
	}

	public void setCD_INS_ID(String cD_INS_ID) {
		CD_INS_ID = cD_INS_ID;
	}

	public Date getCD_INS_DT() {
		return CD_INS_DT;
	}

	public void setCD_INS_DT(Date cD_INS_DT) {
		CD_INS_DT = cD_INS_DT;
	}

}
