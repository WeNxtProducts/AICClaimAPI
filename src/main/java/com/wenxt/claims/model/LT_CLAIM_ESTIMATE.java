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
@Table(name="LT_CLAIM_ESTIMATE")
public class LT_CLAIM_ESTIMATE {
	
    @Id
    @SequenceGenerator(name = "ClaimEstimateTranIDSeq", sequenceName = "CE_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ClaimEstimateTranIDSeq")
    @Column(name = "CE_TRAN_ID")
    private Long CE_TRAN_ID;

    @Column(name = "CE_CLM_TRAN_ID")
    private Integer CE_CLM_TRAN_ID;

    @Column(name = "CE_LOSS_CODE")
    private String CE_LOSS_CODE;

    @Column(name = "CE_COVER_CODE")
    private String CE_COVER_CODE;

    @Column(name = "CE_REF_NO")
    private String CE_REF_NO;

    @Column(name = "CE_DISB_PERC")
    private Double CE_DISB_PERC;

    @Column(name = "CE_DISB_FM_DT")
    private Date CE_DISB_FM_DT;

    @Column(name = "CE_DISB_TO_DT")
    private Date CE_DISB_TO_DT;

    @Column(name = "CE_NO_OF_DAYS_DISB")
    private Integer CE_NO_OF_DAYS_DISB;

    @Column(name = "CE_FC_EST_AMT")
    private Double CE_FC_EST_AMT;

    @Column(name = "CE_LC_EST_AMT")
    private Double CE_LC_EST_AMT;

    @Column(name = "CE_FC_PAID_AMT")
    private Double CE_FC_PAID_AMT;

    @Column(name = "CE_LC_PAID_AMT")
    private Double CE_LC_PAID_AMT;

    @Column(name = "CE_FRZ_FLAG")
    private String CE_FRZ_FLAG;

    @Column(name = "CE_INS_DT")
    private Date CE_INS_DT;

    @Column(name = "CE_INS_ID")
    private String CE_INS_ID;

    @Column(name = "CE_MOD_DT")
    private Date CE_MOD_DT;

    @Column(name = "CE_MOD_ID")
    private String CE_MOD_ID;

    @Column(name = "CE_CLOSE_FLAG")
    private String CE_CLOSE_FLAG;

    @Column(name = "CE_CLOSE_DT")
    private Date CE_CLOSE_DT;

    @Column(name = "CE_CLOSE_REASON")
    private String CE_CLOSE_REASON;

    @Column(name = "CE_CONFIRM_FLAG")
    private String CE_CONFIRM_FLAG;

    @Column(name = "CE_RESERVE_GEN_FLAG")
    private String CE_RESERVE_GEN_FLAG;

    @Column(name = "CE_OS_LOAN_AMT")
    private Double CE_OS_LOAN_AMT;

    @Column(name = "CE_SALARY")
    private Double CE_SALARY;

    @Column(name = "CE_NO_OF_MONTHS")
    private Integer CE_NO_OF_MONTHS;

    @Column(name = "CE_ESTIMATE_DT")
    private Date CE_ESTIMATE_DT;

    @Column(name = "CE_NO_OF_YEARS")
    private Integer CE_NO_OF_YEARS;

    @Column(name = "CE_SA_CALC_FACTOR")
    private String CE_SA_CALC_FACTOR;

    @Column(name = "CE_EST_TYPE")
    private String CE_EST_TYPE;

    @Column(name = "CE_REM_AMT_TO_PAY")
    private Double CE_REM_AMT_TO_PAY;

    @Column(name = "CE_FC_COVER_AMT")
    private Double CE_FC_COVER_AMT;

    @Column(name = "CE_LC_COVER_AMT")
    private Double CE_LC_COVER_AMT;

    @Column(name = "CE_LC_REM_AMT_TO_PAY")
    private Double CE_LC_REM_AMT_TO_PAY;

	public Long getCE_TRAN_ID() {
		return CE_TRAN_ID;
	}

	public void setCE_TRAN_ID(Long cE_TRAN_ID) {
		CE_TRAN_ID = cE_TRAN_ID;
	}

	public Integer getCE_CLM_TRAN_ID() {
		return CE_CLM_TRAN_ID;
	}

	public void setCE_CLM_TRAN_ID(Integer cE_CLM_TRAN_ID) {
		CE_CLM_TRAN_ID = cE_CLM_TRAN_ID;
	}

	public String getCE_LOSS_CODE() {
		return CE_LOSS_CODE;
	}

	public void setCE_LOSS_CODE(String cE_LOSS_CODE) {
		CE_LOSS_CODE = cE_LOSS_CODE;
	}

	public String getCE_COVER_CODE() {
		return CE_COVER_CODE;
	}

	public void setCE_COVER_CODE(String cE_COVER_CODE) {
		CE_COVER_CODE = cE_COVER_CODE;
	}

	public String getCE_REF_NO() {
		return CE_REF_NO;
	}

	public void setCE_REF_NO(String cE_REF_NO) {
		CE_REF_NO = cE_REF_NO;
	}

	public Double getCE_DISB_PERC() {
		return CE_DISB_PERC;
	}

	public void setCE_DISB_PERC(Double cE_DISB_PERC) {
		CE_DISB_PERC = cE_DISB_PERC;
	}

	public Date getCE_DISB_FM_DT() {
		return CE_DISB_FM_DT;
	}

	public void setCE_DISB_FM_DT(Date cE_DISB_FM_DT) {
		CE_DISB_FM_DT = cE_DISB_FM_DT;
	}

	public Date getCE_DISB_TO_DT() {
		return CE_DISB_TO_DT;
	}

	public void setCE_DISB_TO_DT(Date cE_DISB_TO_DT) {
		CE_DISB_TO_DT = cE_DISB_TO_DT;
	}

	public Integer getCE_NO_OF_DAYS_DISB() {
		return CE_NO_OF_DAYS_DISB;
	}

	public void setCE_NO_OF_DAYS_DISB(Integer cE_NO_OF_DAYS_DISB) {
		CE_NO_OF_DAYS_DISB = cE_NO_OF_DAYS_DISB;
	}

	public Double getCE_FC_EST_AMT() {
		return CE_FC_EST_AMT;
	}

	public void setCE_FC_EST_AMT(Double cE_FC_EST_AMT) {
		CE_FC_EST_AMT = cE_FC_EST_AMT;
	}

	public Double getCE_LC_EST_AMT() {
		return CE_LC_EST_AMT;
	}

	public void setCE_LC_EST_AMT(Double cE_LC_EST_AMT) {
		CE_LC_EST_AMT = cE_LC_EST_AMT;
	}

	public Double getCE_FC_PAID_AMT() {
		return CE_FC_PAID_AMT;
	}

	public void setCE_FC_PAID_AMT(Double cE_FC_PAID_AMT) {
		CE_FC_PAID_AMT = cE_FC_PAID_AMT;
	}

	public Double getCE_LC_PAID_AMT() {
		return CE_LC_PAID_AMT;
	}

	public void setCE_LC_PAID_AMT(Double cE_LC_PAID_AMT) {
		CE_LC_PAID_AMT = cE_LC_PAID_AMT;
	}

	public String getCE_FRZ_FLAG() {
		return CE_FRZ_FLAG;
	}

	public void setCE_FRZ_FLAG(String cE_FRZ_FLAG) {
		CE_FRZ_FLAG = cE_FRZ_FLAG;
	}

	public Date getCE_INS_DT() {
		return CE_INS_DT;
	}

	public void setCE_INS_DT(Date cE_INS_DT) {
		CE_INS_DT = cE_INS_DT;
	}

	public String getCE_INS_ID() {
		return CE_INS_ID;
	}

	public void setCE_INS_ID(String cE_INS_ID) {
		CE_INS_ID = cE_INS_ID;
	}

	public Date getCE_MOD_DT() {
		return CE_MOD_DT;
	}

	public void setCE_MOD_DT(Date cE_MOD_DT) {
		CE_MOD_DT = cE_MOD_DT;
	}

	public String getCE_MOD_ID() {
		return CE_MOD_ID;
	}

	public void setCE_MOD_ID(String cE_MOD_ID) {
		CE_MOD_ID = cE_MOD_ID;
	}

	public String getCE_CLOSE_FLAG() {
		return CE_CLOSE_FLAG;
	}

	public void setCE_CLOSE_FLAG(String cE_CLOSE_FLAG) {
		CE_CLOSE_FLAG = cE_CLOSE_FLAG;
	}

	public Date getCE_CLOSE_DT() {
		return CE_CLOSE_DT;
	}

	public void setCE_CLOSE_DT(Date cE_CLOSE_DT) {
		CE_CLOSE_DT = cE_CLOSE_DT;
	}

	public String getCE_CLOSE_REASON() {
		return CE_CLOSE_REASON;
	}

	public void setCE_CLOSE_REASON(String cE_CLOSE_REASON) {
		CE_CLOSE_REASON = cE_CLOSE_REASON;
	}

	public String getCE_CONFIRM_FLAG() {
		return CE_CONFIRM_FLAG;
	}

	public void setCE_CONFIRM_FLAG(String cE_CONFIRM_FLAG) {
		CE_CONFIRM_FLAG = cE_CONFIRM_FLAG;
	}

	public String getCE_RESERVE_GEN_FLAG() {
		return CE_RESERVE_GEN_FLAG;
	}

	public void setCE_RESERVE_GEN_FLAG(String cE_RESERVE_GEN_FLAG) {
		CE_RESERVE_GEN_FLAG = cE_RESERVE_GEN_FLAG;
	}

	public Double getCE_OS_LOAN_AMT() {
		return CE_OS_LOAN_AMT;
	}

	public void setCE_OS_LOAN_AMT(Double cE_OS_LOAN_AMT) {
		CE_OS_LOAN_AMT = cE_OS_LOAN_AMT;
	}

	public Double getCE_SALARY() {
		return CE_SALARY;
	}

	public void setCE_SALARY(Double cE_SALARY) {
		CE_SALARY = cE_SALARY;
	}

	public Integer getCE_NO_OF_MONTHS() {
		return CE_NO_OF_MONTHS;
	}

	public void setCE_NO_OF_MONTHS(Integer cE_NO_OF_MONTHS) {
		CE_NO_OF_MONTHS = cE_NO_OF_MONTHS;
	}

	public Date getCE_ESTIMATE_DT() {
		return CE_ESTIMATE_DT;
	}

	public void setCE_ESTIMATE_DT(Date cE_ESTIMATE_DT) {
		CE_ESTIMATE_DT = cE_ESTIMATE_DT;
	}

	public Integer getCE_NO_OF_YEARS() {
		return CE_NO_OF_YEARS;
	}

	public void setCE_NO_OF_YEARS(Integer cE_NO_OF_YEARS) {
		CE_NO_OF_YEARS = cE_NO_OF_YEARS;
	}

	public String getCE_SA_CALC_FACTOR() {
		return CE_SA_CALC_FACTOR;
	}

	public void setCE_SA_CALC_FACTOR(String cE_SA_CALC_FACTOR) {
		CE_SA_CALC_FACTOR = cE_SA_CALC_FACTOR;
	}

	public String getCE_EST_TYPE() {
		return CE_EST_TYPE;
	}

	public void setCE_EST_TYPE(String cE_EST_TYPE) {
		CE_EST_TYPE = cE_EST_TYPE;
	}

	public Double getCE_REM_AMT_TO_PAY() {
		return CE_REM_AMT_TO_PAY;
	}

	public void setCE_REM_AMT_TO_PAY(Double cE_REM_AMT_TO_PAY) {
		CE_REM_AMT_TO_PAY = cE_REM_AMT_TO_PAY;
	}

	public Double getCE_FC_COVER_AMT() {
		return CE_FC_COVER_AMT;
	}

	public void setCE_FC_COVER_AMT(Double cE_FC_COVER_AMT) {
		CE_FC_COVER_AMT = cE_FC_COVER_AMT;
	}

	public Double getCE_LC_COVER_AMT() {
		return CE_LC_COVER_AMT;
	}

	public void setCE_LC_COVER_AMT(Double cE_LC_COVER_AMT) {
		CE_LC_COVER_AMT = cE_LC_COVER_AMT;
	}

	public Double getCE_LC_REM_AMT_TO_PAY() {
		return CE_LC_REM_AMT_TO_PAY;
	}

	public void setCE_LC_REM_AMT_TO_PAY(Double cE_LC_REM_AMT_TO_PAY) {
		CE_LC_REM_AMT_TO_PAY = cE_LC_REM_AMT_TO_PAY;
	}
    
}

