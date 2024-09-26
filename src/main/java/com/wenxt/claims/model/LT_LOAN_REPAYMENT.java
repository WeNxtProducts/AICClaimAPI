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
@Table(name = "LT_LOAN_REPAYMENT")
public class LT_LOAN_REPAYMENT {

    @Id
    @SequenceGenerator(name = "LoanRepaymentSequence", sequenceName = "LR_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "LoanRepaymentSequence")
    @Column(name = "LR_TRAN_ID")
    private Integer LR_TRAN_ID;

    @Column(name = "LR_LOAN_TRAN_ID")
    private Long LR_LOAN_TRAN_ID;

    @Column(name = "LR_PYMT_DT")
    private Date LR_PYMT_DT;

    @Column(name = "LR_LC_LOAN_AMT")
    private BigDecimal LR_LC_LOAN_AMT;

    @Column(name = "LR_FC_LOAN_AMT")
    private BigDecimal LR_FC_LOAN_AMT;

    @Column(name = "LR_STATUS")
    private String LR_STATUS;

    @Column(name = "LR_INS_DT")
    private Date LR_INS_DT;

    @Column(name = "LR_INS_ID")
    private String LR_INS_ID;

    @Column(name = "LR_MOD_DT")
    private Date LR_MOD_DT;

    @Column(name = "LR_MOD_ID")
    private String LR_MOD_ID;

    @Column(name = "LR_FLAG")
    private String LR_FLAG;

    @Column(name = "LR_PYMT_REF_NO")
    private String LR_PYMT_REF_NO;

    @Column(name = "LR_FC_INT_AMT")
    private BigDecimal LR_FC_INT_AMT;

    @Column(name = "LR_LC_INT_AMT")
    private BigDecimal LR_LC_INT_AMT;

    @Column(name = "LR_FC_PYMT_AMT")
    private BigDecimal LR_FC_PYMT_AMT;

    @Column(name = "LR_LC_PYMT_AMT")
    private BigDecimal LR_LC_PYMT_AMT;

    @Column(name = "LR_REVERSAL_FLAG")
    private String LR_REVERSAL_FLAG;

    @Column(name = "LR_DRCR_ACNT_YEAR")
    private Integer LR_DRCR_ACNT_YEAR;

    @Column(name = "LR_DRCR_TXN_CODE")
    private String LR_DRCR_TXN_CODE;

    @Column(name = "LR_DRCR_DOC_NO")
    private Long LR_DRCR_DOC_NO;

    @Column(name = "LR_DRCR_DOC_DT")
    private Date LR_DRCR_DOC_DT;

    @Column(name = "LR_FLEX_01")
    private String LR_FLEX_01;

    @Column(name = "LR_REPAY_PAID_DT")
    private Date LR_REPAY_PAID_DT;

    @Column(name = "LR_LOAN_OS_FC_AMT")
    private BigDecimal LR_LOAN_OS_FC_AMT;

    @Column(name = "LR_LOAN_OS_LC_AMT")
    private BigDecimal LR_LOAN_OS_LC_AMT;

    @Column(name = "LR_EMI_FC_AMT")
    private BigDecimal LR_EMI_FC_AMT;

    @Column(name = "LR_EMI_LC_AMT")
    private BigDecimal LR_EMI_LC_AMT;

    @Column(name = "LR_ACCRUAL_YN")
    private String LR_ACCRUAL_YN;

    @Column(name = "LR_FLEX_03")
    private String LR_FLEX_03;

    @Column(name = "LR_FLEX_02")
    private String LR_FLEX_02;

    @Column(name = "LR_FLEX_06")
    private String LR_FLEX_06;

    @Column(name = "LR_FLEX_04")
    private String LR_FLEX_04;

	public Integer getLR_TRAN_ID() {
		return LR_TRAN_ID;
	}

	public void setLR_TRAN_ID(Integer lR_TRAN_ID) {
		LR_TRAN_ID = lR_TRAN_ID;
	}

	public Long getLR_LOAN_TRAN_ID() {
		return LR_LOAN_TRAN_ID;
	}

	public void setLR_LOAN_TRAN_ID(Long lR_LOAN_TRAN_ID) {
		LR_LOAN_TRAN_ID = lR_LOAN_TRAN_ID;
	}

	public Date getLR_PYMT_DT() {
		return LR_PYMT_DT;
	}

	public void setLR_PYMT_DT(Date lR_PYMT_DT) {
		LR_PYMT_DT = lR_PYMT_DT;
	}

	public BigDecimal getLR_LC_LOAN_AMT() {
		return LR_LC_LOAN_AMT;
	}

	public void setLR_LC_LOAN_AMT(BigDecimal lR_LC_LOAN_AMT) {
		LR_LC_LOAN_AMT = lR_LC_LOAN_AMT;
	}

	public BigDecimal getLR_FC_LOAN_AMT() {
		return LR_FC_LOAN_AMT;
	}

	public void setLR_FC_LOAN_AMT(BigDecimal lR_FC_LOAN_AMT) {
		LR_FC_LOAN_AMT = lR_FC_LOAN_AMT;
	}

	public String getLR_STATUS() {
		return LR_STATUS;
	}

	public void setLR_STATUS(String lR_STATUS) {
		LR_STATUS = lR_STATUS;
	}

	public Date getLR_INS_DT() {
		return LR_INS_DT;
	}

	public void setLR_INS_DT(Date lR_INS_DT) {
		LR_INS_DT = lR_INS_DT;
	}

	public String getLR_INS_ID() {
		return LR_INS_ID;
	}

	public void setLR_INS_ID(String lR_INS_ID) {
		LR_INS_ID = lR_INS_ID;
	}

	public Date getLR_MOD_DT() {
		return LR_MOD_DT;
	}

	public void setLR_MOD_DT(Date lR_MOD_DT) {
		LR_MOD_DT = lR_MOD_DT;
	}

	public String getLR_MOD_ID() {
		return LR_MOD_ID;
	}

	public void setLR_MOD_ID(String lR_MOD_ID) {
		LR_MOD_ID = lR_MOD_ID;
	}

	public String getLR_FLAG() {
		return LR_FLAG;
	}

	public void setLR_FLAG(String lR_FLAG) {
		LR_FLAG = lR_FLAG;
	}

	public String getLR_PYMT_REF_NO() {
		return LR_PYMT_REF_NO;
	}

	public void setLR_PYMT_REF_NO(String lR_PYMT_REF_NO) {
		LR_PYMT_REF_NO = lR_PYMT_REF_NO;
	}

	public BigDecimal getLR_FC_INT_AMT() {
		return LR_FC_INT_AMT;
	}

	public void setLR_FC_INT_AMT(BigDecimal lR_FC_INT_AMT) {
		LR_FC_INT_AMT = lR_FC_INT_AMT;
	}

	public BigDecimal getLR_LC_INT_AMT() {
		return LR_LC_INT_AMT;
	}

	public void setLR_LC_INT_AMT(BigDecimal lR_LC_INT_AMT) {
		LR_LC_INT_AMT = lR_LC_INT_AMT;
	}

	public BigDecimal getLR_FC_PYMT_AMT() {
		return LR_FC_PYMT_AMT;
	}

	public void setLR_FC_PYMT_AMT(BigDecimal lR_FC_PYMT_AMT) {
		LR_FC_PYMT_AMT = lR_FC_PYMT_AMT;
	}

	public BigDecimal getLR_LC_PYMT_AMT() {
		return LR_LC_PYMT_AMT;
	}

	public void setLR_LC_PYMT_AMT(BigDecimal lR_LC_PYMT_AMT) {
		LR_LC_PYMT_AMT = lR_LC_PYMT_AMT;
	}

	public String getLR_REVERSAL_FLAG() {
		return LR_REVERSAL_FLAG;
	}

	public void setLR_REVERSAL_FLAG(String lR_REVERSAL_FLAG) {
		LR_REVERSAL_FLAG = lR_REVERSAL_FLAG;
	}

	public Integer getLR_DRCR_ACNT_YEAR() {
		return LR_DRCR_ACNT_YEAR;
	}

	public void setLR_DRCR_ACNT_YEAR(Integer lR_DRCR_ACNT_YEAR) {
		LR_DRCR_ACNT_YEAR = lR_DRCR_ACNT_YEAR;
	}

	public String getLR_DRCR_TXN_CODE() {
		return LR_DRCR_TXN_CODE;
	}

	public void setLR_DRCR_TXN_CODE(String lR_DRCR_TXN_CODE) {
		LR_DRCR_TXN_CODE = lR_DRCR_TXN_CODE;
	}

	public Long getLR_DRCR_DOC_NO() {
		return LR_DRCR_DOC_NO;
	}

	public void setLR_DRCR_DOC_NO(Long lR_DRCR_DOC_NO) {
		LR_DRCR_DOC_NO = lR_DRCR_DOC_NO;
	}

	public Date getLR_DRCR_DOC_DT() {
		return LR_DRCR_DOC_DT;
	}

	public void setLR_DRCR_DOC_DT(Date lR_DRCR_DOC_DT) {
		LR_DRCR_DOC_DT = lR_DRCR_DOC_DT;
	}

	public String getLR_FLEX_01() {
		return LR_FLEX_01;
	}

	public void setLR_FLEX_01(String lR_FLEX_01) {
		LR_FLEX_01 = lR_FLEX_01;
	}

	public Date getLR_REPAY_PAID_DT() {
		return LR_REPAY_PAID_DT;
	}

	public void setLR_REPAY_PAID_DT(Date lR_REPAY_PAID_DT) {
		LR_REPAY_PAID_DT = lR_REPAY_PAID_DT;
	}

	public BigDecimal getLR_LOAN_OS_FC_AMT() {
		return LR_LOAN_OS_FC_AMT;
	}

	public void setLR_LOAN_OS_FC_AMT(BigDecimal lR_LOAN_OS_FC_AMT) {
		LR_LOAN_OS_FC_AMT = lR_LOAN_OS_FC_AMT;
	}

	public BigDecimal getLR_LOAN_OS_LC_AMT() {
		return LR_LOAN_OS_LC_AMT;
	}

	public void setLR_LOAN_OS_LC_AMT(BigDecimal lR_LOAN_OS_LC_AMT) {
		LR_LOAN_OS_LC_AMT = lR_LOAN_OS_LC_AMT;
	}

	public BigDecimal getLR_EMI_FC_AMT() {
		return LR_EMI_FC_AMT;
	}

	public void setLR_EMI_FC_AMT(BigDecimal lR_EMI_FC_AMT) {
		LR_EMI_FC_AMT = lR_EMI_FC_AMT;
	}

	public BigDecimal getLR_EMI_LC_AMT() {
		return LR_EMI_LC_AMT;
	}

	public void setLR_EMI_LC_AMT(BigDecimal lR_EMI_LC_AMT) {
		LR_EMI_LC_AMT = lR_EMI_LC_AMT;
	}

	public String getLR_ACCRUAL_YN() {
		return LR_ACCRUAL_YN;
	}

	public void setLR_ACCRUAL_YN(String lR_ACCRUAL_YN) {
		LR_ACCRUAL_YN = lR_ACCRUAL_YN;
	}

	public String getLR_FLEX_03() {
		return LR_FLEX_03;
	}

	public void setLR_FLEX_03(String lR_FLEX_03) {
		LR_FLEX_03 = lR_FLEX_03;
	}

	public String getLR_FLEX_02() {
		return LR_FLEX_02;
	}

	public void setLR_FLEX_02(String lR_FLEX_02) {
		LR_FLEX_02 = lR_FLEX_02;
	}

	public String getLR_FLEX_06() {
		return LR_FLEX_06;
	}

	public void setLR_FLEX_06(String lR_FLEX_06) {
		LR_FLEX_06 = lR_FLEX_06;
	}

	public String getLR_FLEX_04() {
		return LR_FLEX_04;
	}

	public void setLR_FLEX_04(String lR_FLEX_04) {
		LR_FLEX_04 = lR_FLEX_04;
	}

}
