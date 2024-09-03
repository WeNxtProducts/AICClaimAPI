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
@Table(name = "LT_RCPT_DTL")
public class LT_RCPT_DTL {

    @Id
    @SequenceGenerator(name = "ReceiptDetailTranIdSeq", sequenceName = "RD_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ReceiptDetailTranIdSeq")
    @Column(name = "RD_TRAN_ID")
    private Integer RD_TRAN_ID;

    @Column(name = "RD_SR_NO")
    private Integer RD_SR_NO;

    @Column(name = "RD_RH_TRAN_ID")
    private Long RD_RH_TRAN_ID;

    @Column(name = "RD_PAY_MODE")
    private String RD_PAY_MODE;

    @Column(name = "RD_FC_AMT")
    private Double RD_FC_AMT;

    @Column(name = "RD_LC_AMT")
    private Double RD_LC_AMT;

    @Column(name = "RD_CCARD_TYPE")
    private String RD_CCARD_TYPE;

    @Column(name = "RD_CCARD_NO")
    private String RD_CCARD_NO;

    @Column(name = "RD_CCARD_VALID_FM_DT")
    private Date RD_CCARD_VALID_FM_DT;

    @Column(name = "RD_CCARD_VALID_TO_DT")
    private Date RD_CCARD_VALID_TO_DT;

    @Column(name = "RD_REMARKS")
    private String RD_REMARKS;

    @Column(name = "RD_CHQ_BANK_CODE")
    private String RD_CHQ_BANK_CODE;

    @Column(name = "RD_CHQ_NO")
    private String RD_CHQ_NO;

    @Column(name = "RD_CHQ_DT")
    private Date RD_CHQ_DT;

    @Column(name = "RD_TXN_CODE")
    private String RD_TXN_CODE;

    @Column(name = "RD_DOC_NO")
    private Long RD_DOC_NO;

    @Column(name = "RD_DOC_DT")
    private Date RD_DOC_DT;

    @Column(name = "RD_MAIN_ACNT_CODE")
    private String RD_MAIN_ACNT_CODE;

    @Column(name = "RD_SUB_ACNT_CODE")
    private String RD_SUB_ACNT_CODE;

    @Column(name = "RD_DIVN_CODE")
    private String RD_DIVN_CODE;

    @Column(name = "RD_DEPT_CODE")
    private String RD_DEPT_CODE;

    @Column(name = "RD_ANLY_CODE_1")
    private String RD_ANLY_CODE_1;

    @Column(name = "RD_ANLY_CODE_2")
    private String RD_ANLY_CODE_2;

    @Column(name = "RD_ACTY_CODE_1")
    private String RD_ACTY_CODE_1;

    @Column(name = "RD_ACTY_CODE_2")
    private String RD_ACTY_CODE_2;

    @Column(name = "RD_INS_DT")
    private Date RD_INS_DT;

    @Column(name = "RD_INS_ID")
    private String RD_INS_ID;

    @Column(name = "RD_MOD_DT")
    private Date RD_MOD_DT;

    @Column(name = "RD_MOD_ID")
    private String RD_MOD_ID;

    @Column(name = "RD_DRCR_TRAN_ID")
    private Long RD_DRCR_TRAN_ID;

    @Column(name = "RD_DRCR_TXN_CODE")
    private String RD_DRCR_TXN_CODE;

    @Column(name = "RD_DRCR_DOC_NO")
    private Long RD_DRCR_DOC_NO;

    @Column(name = "RD_DRCR_DOC_DT")
    private Date RD_DRCR_DOC_DT;

    @Column(name = "RD_OUR_BANK_CODE")
    private String RD_OUR_BANK_CODE;

    @Column(name = "RD_LOCN")
    private String RD_LOCN;

    @Column(name = "RD_CUST_BANK_CODE")
    private String RD_CUST_BANK_CODE;

    @Column(name = "RD_CUST_BANK_ACNT_NO")
    private String RD_CUST_BANK_ACNT_NO;

    @Column(name = "RD_OUR_BANK_ACNT_NO")
    private String RD_OUR_BANK_ACNT_NO;

    @Column(name = "RD_CHQ_CLRG_TYPE")
    private String RD_CHQ_CLRG_TYPE;

    @Column(name = "RD_REM_SLIP_GEN_YN")
    private String RD_REM_SLIP_GEN_YN;

    @Column(name = "RD_CHQ_TYPE")
    private String RD_CHQ_TYPE;

    @Column(name = "RD_BANKING_DT")
    private Date RD_BANKING_DT;

    @Column(name = "RD_REM_FC_AMT")
    private Double RD_REM_FC_AMT;

    @Column(name = "RD_VALUE_DT")
    private Date RD_VALUE_DT;

    @Column(name = "RD_PO_MO_NO")
    private String RD_PO_MO_NO;

    @Column(name = "RD_PO_MO_DT")
    private Date RD_PO_MO_DT;

    @Column(name = "RD_FM_POST_OFF")
    private String RD_FM_POST_OFF;

    @Column(name = "RD_TO_POST_OFF")
    private String RD_TO_POST_OFF;

    @Column(name = "RD_CHQ_COLLECTED_DT")
    private Date RD_CHQ_COLLECTED_DT;

    @Column(name = "RD_CREDIT_DT")
    private Date RD_CREDIT_DT;

    @Column(name = "RD_REM_DT")
    private Date RD_REM_DT;

    @Column(name = "RD_TT_REF_NO")
    private String RD_TT_REF_NO;

    @Column(name = "RD_TT_CUR_CODE")
    private String RD_TT_CUR_CODE;

    @Column(name = "RD_TT_EXGE_RATE")
    private Double RD_TT_EXGE_RATE;

    @Column(name = "RD_CC_PROVIDER")
    private String RD_CC_PROVIDER;

    @Column(name = "RD_CC_HOLDER_NAME")
    private String RD_CC_HOLDER_NAME;

    @Column(name = "RD_CC_CHARGE_SLIP_NO")
    private String RD_CC_CHARGE_SLIP_NO;

    @Column(name = "RD_CC_FLOOR_LIMIT")
    private Double RD_CC_FLOOR_LIMIT;

    @Column(name = "RD_CC_SLIP_DATE")
    private Date RD_CC_SLIP_DATE;

    @Column(name = "RD_BRANCH_NAME")
    private String RD_BRANCH_NAME;

    @Column(name = "RD_CHQ_WRITING_YN")
    private String RD_CHQ_WRITING_YN;

    @Column(name = "RD_CREDIT_ADVICE_REF_NO")
    private String RD_CREDIT_ADVICE_REF_NO;

    @Column(name = "RD_BANK_REF_NO")
    private String RD_BANK_REF_NO;

    @Column(name = "RD_CCARD_APP_CODE")
    private String RD_CCARD_APP_CODE;

    @Column(name = "RD_ATM_CARD_NO")
    private String RD_ATM_CARD_NO;

	public Integer getRD_TRAN_ID() {
		return RD_TRAN_ID;
	}

	public void setRD_TRAN_ID(Integer rD_TRAN_ID) {
		RD_TRAN_ID = rD_TRAN_ID;
	}

	public Integer getRD_SR_NO() {
		return RD_SR_NO;
	}

	public void setRD_SR_NO(Integer rD_SR_NO) {
		RD_SR_NO = rD_SR_NO;
	}

	public Long getRD_RH_TRAN_ID() {
		return RD_RH_TRAN_ID;
	}

	public void setRD_RH_TRAN_ID(Long rD_RH_TRAN_ID) {
		RD_RH_TRAN_ID = rD_RH_TRAN_ID;
	}

	public String getRD_PAY_MODE() {
		return RD_PAY_MODE;
	}

	public void setRD_PAY_MODE(String rD_PAY_MODE) {
		RD_PAY_MODE = rD_PAY_MODE;
	}

	public Double getRD_FC_AMT() {
		return RD_FC_AMT;
	}

	public void setRD_FC_AMT(Double rD_FC_AMT) {
		RD_FC_AMT = rD_FC_AMT;
	}

	public Double getRD_LC_AMT() {
		return RD_LC_AMT;
	}

	public void setRD_LC_AMT(Double rD_LC_AMT) {
		RD_LC_AMT = rD_LC_AMT;
	}

	public String getRD_CCARD_TYPE() {
		return RD_CCARD_TYPE;
	}

	public void setRD_CCARD_TYPE(String rD_CCARD_TYPE) {
		RD_CCARD_TYPE = rD_CCARD_TYPE;
	}

	public String getRD_CCARD_NO() {
		return RD_CCARD_NO;
	}

	public void setRD_CCARD_NO(String rD_CCARD_NO) {
		RD_CCARD_NO = rD_CCARD_NO;
	}

	public Date getRD_CCARD_VALID_FM_DT() {
		return RD_CCARD_VALID_FM_DT;
	}

	public void setRD_CCARD_VALID_FM_DT(Date rD_CCARD_VALID_FM_DT) {
		RD_CCARD_VALID_FM_DT = rD_CCARD_VALID_FM_DT;
	}

	public Date getRD_CCARD_VALID_TO_DT() {
		return RD_CCARD_VALID_TO_DT;
	}

	public void setRD_CCARD_VALID_TO_DT(Date rD_CCARD_VALID_TO_DT) {
		RD_CCARD_VALID_TO_DT = rD_CCARD_VALID_TO_DT;
	}

	public String getRD_REMARKS() {
		return RD_REMARKS;
	}

	public void setRD_REMARKS(String rD_REMARKS) {
		RD_REMARKS = rD_REMARKS;
	}

	public String getRD_CHQ_BANK_CODE() {
		return RD_CHQ_BANK_CODE;
	}

	public void setRD_CHQ_BANK_CODE(String rD_CHQ_BANK_CODE) {
		RD_CHQ_BANK_CODE = rD_CHQ_BANK_CODE;
	}

	public String getRD_CHQ_NO() {
		return RD_CHQ_NO;
	}

	public void setRD_CHQ_NO(String rD_CHQ_NO) {
		RD_CHQ_NO = rD_CHQ_NO;
	}

	public Date getRD_CHQ_DT() {
		return RD_CHQ_DT;
	}

	public void setRD_CHQ_DT(Date rD_CHQ_DT) {
		RD_CHQ_DT = rD_CHQ_DT;
	}

	public String getRD_TXN_CODE() {
		return RD_TXN_CODE;
	}

	public void setRD_TXN_CODE(String rD_TXN_CODE) {
		RD_TXN_CODE = rD_TXN_CODE;
	}

	public Long getRD_DOC_NO() {
		return RD_DOC_NO;
	}

	public void setRD_DOC_NO(Long rD_DOC_NO) {
		RD_DOC_NO = rD_DOC_NO;
	}

	public Date getRD_DOC_DT() {
		return RD_DOC_DT;
	}

	public void setRD_DOC_DT(Date rD_DOC_DT) {
		RD_DOC_DT = rD_DOC_DT;
	}

	public String getRD_MAIN_ACNT_CODE() {
		return RD_MAIN_ACNT_CODE;
	}

	public void setRD_MAIN_ACNT_CODE(String rD_MAIN_ACNT_CODE) {
		RD_MAIN_ACNT_CODE = rD_MAIN_ACNT_CODE;
	}

	public String getRD_SUB_ACNT_CODE() {
		return RD_SUB_ACNT_CODE;
	}

	public void setRD_SUB_ACNT_CODE(String rD_SUB_ACNT_CODE) {
		RD_SUB_ACNT_CODE = rD_SUB_ACNT_CODE;
	}

	public String getRD_DIVN_CODE() {
		return RD_DIVN_CODE;
	}

	public void setRD_DIVN_CODE(String rD_DIVN_CODE) {
		RD_DIVN_CODE = rD_DIVN_CODE;
	}

	public String getRD_DEPT_CODE() {
		return RD_DEPT_CODE;
	}

	public void setRD_DEPT_CODE(String rD_DEPT_CODE) {
		RD_DEPT_CODE = rD_DEPT_CODE;
	}

	public String getRD_ANLY_CODE_1() {
		return RD_ANLY_CODE_1;
	}

	public void setRD_ANLY_CODE_1(String rD_ANLY_CODE_1) {
		RD_ANLY_CODE_1 = rD_ANLY_CODE_1;
	}

	public String getRD_ANLY_CODE_2() {
		return RD_ANLY_CODE_2;
	}

	public void setRD_ANLY_CODE_2(String rD_ANLY_CODE_2) {
		RD_ANLY_CODE_2 = rD_ANLY_CODE_2;
	}

	public String getRD_ACTY_CODE_1() {
		return RD_ACTY_CODE_1;
	}

	public void setRD_ACTY_CODE_1(String rD_ACTY_CODE_1) {
		RD_ACTY_CODE_1 = rD_ACTY_CODE_1;
	}

	public String getRD_ACTY_CODE_2() {
		return RD_ACTY_CODE_2;
	}

	public void setRD_ACTY_CODE_2(String rD_ACTY_CODE_2) {
		RD_ACTY_CODE_2 = rD_ACTY_CODE_2;
	}

	public Date getRD_INS_DT() {
		return RD_INS_DT;
	}

	public void setRD_INS_DT(Date rD_INS_DT) {
		RD_INS_DT = rD_INS_DT;
	}

	public String getRD_INS_ID() {
		return RD_INS_ID;
	}

	public void setRD_INS_ID(String rD_INS_ID) {
		RD_INS_ID = rD_INS_ID;
	}

	public Date getRD_MOD_DT() {
		return RD_MOD_DT;
	}

	public void setRD_MOD_DT(Date rD_MOD_DT) {
		RD_MOD_DT = rD_MOD_DT;
	}

	public String getRD_MOD_ID() {
		return RD_MOD_ID;
	}

	public void setRD_MOD_ID(String rD_MOD_ID) {
		RD_MOD_ID = rD_MOD_ID;
	}

	public Long getRD_DRCR_TRAN_ID() {
		return RD_DRCR_TRAN_ID;
	}

	public void setRD_DRCR_TRAN_ID(Long rD_DRCR_TRAN_ID) {
		RD_DRCR_TRAN_ID = rD_DRCR_TRAN_ID;
	}

	public String getRD_DRCR_TXN_CODE() {
		return RD_DRCR_TXN_CODE;
	}

	public void setRD_DRCR_TXN_CODE(String rD_DRCR_TXN_CODE) {
		RD_DRCR_TXN_CODE = rD_DRCR_TXN_CODE;
	}

	public Long getRD_DRCR_DOC_NO() {
		return RD_DRCR_DOC_NO;
	}

	public void setRD_DRCR_DOC_NO(Long rD_DRCR_DOC_NO) {
		RD_DRCR_DOC_NO = rD_DRCR_DOC_NO;
	}

	public Date getRD_DRCR_DOC_DT() {
		return RD_DRCR_DOC_DT;
	}

	public void setRD_DRCR_DOC_DT(Date rD_DRCR_DOC_DT) {
		RD_DRCR_DOC_DT = rD_DRCR_DOC_DT;
	}

	public String getRD_OUR_BANK_CODE() {
		return RD_OUR_BANK_CODE;
	}

	public void setRD_OUR_BANK_CODE(String rD_OUR_BANK_CODE) {
		RD_OUR_BANK_CODE = rD_OUR_BANK_CODE;
	}

	public String getRD_LOCN() {
		return RD_LOCN;
	}

	public void setRD_LOCN(String rD_LOCN) {
		RD_LOCN = rD_LOCN;
	}

	public String getRD_CUST_BANK_CODE() {
		return RD_CUST_BANK_CODE;
	}

	public void setRD_CUST_BANK_CODE(String rD_CUST_BANK_CODE) {
		RD_CUST_BANK_CODE = rD_CUST_BANK_CODE;
	}

	public String getRD_CUST_BANK_ACNT_NO() {
		return RD_CUST_BANK_ACNT_NO;
	}

	public void setRD_CUST_BANK_ACNT_NO(String rD_CUST_BANK_ACNT_NO) {
		RD_CUST_BANK_ACNT_NO = rD_CUST_BANK_ACNT_NO;
	}

	public String getRD_OUR_BANK_ACNT_NO() {
		return RD_OUR_BANK_ACNT_NO;
	}

	public void setRD_OUR_BANK_ACNT_NO(String rD_OUR_BANK_ACNT_NO) {
		RD_OUR_BANK_ACNT_NO = rD_OUR_BANK_ACNT_NO;
	}

	public String getRD_CHQ_CLRG_TYPE() {
		return RD_CHQ_CLRG_TYPE;
	}

	public void setRD_CHQ_CLRG_TYPE(String rD_CHQ_CLRG_TYPE) {
		RD_CHQ_CLRG_TYPE = rD_CHQ_CLRG_TYPE;
	}

	public String getRD_REM_SLIP_GEN_YN() {
		return RD_REM_SLIP_GEN_YN;
	}

	public void setRD_REM_SLIP_GEN_YN(String rD_REM_SLIP_GEN_YN) {
		RD_REM_SLIP_GEN_YN = rD_REM_SLIP_GEN_YN;
	}

	public String getRD_CHQ_TYPE() {
		return RD_CHQ_TYPE;
	}

	public void setRD_CHQ_TYPE(String rD_CHQ_TYPE) {
		RD_CHQ_TYPE = rD_CHQ_TYPE;
	}

	public Date getRD_BANKING_DT() {
		return RD_BANKING_DT;
	}

	public void setRD_BANKING_DT(Date rD_BANKING_DT) {
		RD_BANKING_DT = rD_BANKING_DT;
	}

	public Double getRD_REM_FC_AMT() {
		return RD_REM_FC_AMT;
	}

	public void setRD_REM_FC_AMT(Double rD_REM_FC_AMT) {
		RD_REM_FC_AMT = rD_REM_FC_AMT;
	}

	public Date getRD_VALUE_DT() {
		return RD_VALUE_DT;
	}

	public void setRD_VALUE_DT(Date rD_VALUE_DT) {
		RD_VALUE_DT = rD_VALUE_DT;
	}

	public String getRD_PO_MO_NO() {
		return RD_PO_MO_NO;
	}

	public void setRD_PO_MO_NO(String rD_PO_MO_NO) {
		RD_PO_MO_NO = rD_PO_MO_NO;
	}

	public Date getRD_PO_MO_DT() {
		return RD_PO_MO_DT;
	}

	public void setRD_PO_MO_DT(Date rD_PO_MO_DT) {
		RD_PO_MO_DT = rD_PO_MO_DT;
	}

	public String getRD_FM_POST_OFF() {
		return RD_FM_POST_OFF;
	}

	public void setRD_FM_POST_OFF(String rD_FM_POST_OFF) {
		RD_FM_POST_OFF = rD_FM_POST_OFF;
	}

	public String getRD_TO_POST_OFF() {
		return RD_TO_POST_OFF;
	}

	public void setRD_TO_POST_OFF(String rD_TO_POST_OFF) {
		RD_TO_POST_OFF = rD_TO_POST_OFF;
	}

	public Date getRD_CHQ_COLLECTED_DT() {
		return RD_CHQ_COLLECTED_DT;
	}

	public void setRD_CHQ_COLLECTED_DT(Date rD_CHQ_COLLECTED_DT) {
		RD_CHQ_COLLECTED_DT = rD_CHQ_COLLECTED_DT;
	}

	public Date getRD_CREDIT_DT() {
		return RD_CREDIT_DT;
	}

	public void setRD_CREDIT_DT(Date rD_CREDIT_DT) {
		RD_CREDIT_DT = rD_CREDIT_DT;
	}

	public Date getRD_REM_DT() {
		return RD_REM_DT;
	}

	public void setRD_REM_DT(Date rD_REM_DT) {
		RD_REM_DT = rD_REM_DT;
	}

	public String getRD_TT_REF_NO() {
		return RD_TT_REF_NO;
	}

	public void setRD_TT_REF_NO(String rD_TT_REF_NO) {
		RD_TT_REF_NO = rD_TT_REF_NO;
	}

	public String getRD_TT_CUR_CODE() {
		return RD_TT_CUR_CODE;
	}

	public void setRD_TT_CUR_CODE(String rD_TT_CUR_CODE) {
		RD_TT_CUR_CODE = rD_TT_CUR_CODE;
	}

	public Double getRD_TT_EXGE_RATE() {
		return RD_TT_EXGE_RATE;
	}

	public void setRD_TT_EXGE_RATE(Double rD_TT_EXGE_RATE) {
		RD_TT_EXGE_RATE = rD_TT_EXGE_RATE;
	}

	public String getRD_CC_PROVIDER() {
		return RD_CC_PROVIDER;
	}

	public void setRD_CC_PROVIDER(String rD_CC_PROVIDER) {
		RD_CC_PROVIDER = rD_CC_PROVIDER;
	}

	public String getRD_CC_HOLDER_NAME() {
		return RD_CC_HOLDER_NAME;
	}

	public void setRD_CC_HOLDER_NAME(String rD_CC_HOLDER_NAME) {
		RD_CC_HOLDER_NAME = rD_CC_HOLDER_NAME;
	}

	public String getRD_CC_CHARGE_SLIP_NO() {
		return RD_CC_CHARGE_SLIP_NO;
	}

	public void setRD_CC_CHARGE_SLIP_NO(String rD_CC_CHARGE_SLIP_NO) {
		RD_CC_CHARGE_SLIP_NO = rD_CC_CHARGE_SLIP_NO;
	}

	public Double getRD_CC_FLOOR_LIMIT() {
		return RD_CC_FLOOR_LIMIT;
	}

	public void setRD_CC_FLOOR_LIMIT(Double rD_CC_FLOOR_LIMIT) {
		RD_CC_FLOOR_LIMIT = rD_CC_FLOOR_LIMIT;
	}

	public Date getRD_CC_SLIP_DATE() {
		return RD_CC_SLIP_DATE;
	}

	public void setRD_CC_SLIP_DATE(Date rD_CC_SLIP_DATE) {
		RD_CC_SLIP_DATE = rD_CC_SLIP_DATE;
	}

	public String getRD_BRANCH_NAME() {
		return RD_BRANCH_NAME;
	}

	public void setRD_BRANCH_NAME(String rD_BRANCH_NAME) {
		RD_BRANCH_NAME = rD_BRANCH_NAME;
	}

	public String getRD_CHQ_WRITING_YN() {
		return RD_CHQ_WRITING_YN;
	}

	public void setRD_CHQ_WRITING_YN(String rD_CHQ_WRITING_YN) {
		RD_CHQ_WRITING_YN = rD_CHQ_WRITING_YN;
	}

	public String getRD_CREDIT_ADVICE_REF_NO() {
		return RD_CREDIT_ADVICE_REF_NO;
	}

	public void setRD_CREDIT_ADVICE_REF_NO(String rD_CREDIT_ADVICE_REF_NO) {
		RD_CREDIT_ADVICE_REF_NO = rD_CREDIT_ADVICE_REF_NO;
	}

	public String getRD_BANK_REF_NO() {
		return RD_BANK_REF_NO;
	}

	public void setRD_BANK_REF_NO(String rD_BANK_REF_NO) {
		RD_BANK_REF_NO = rD_BANK_REF_NO;
	}

	public String getRD_CCARD_APP_CODE() {
		return RD_CCARD_APP_CODE;
	}

	public void setRD_CCARD_APP_CODE(String rD_CCARD_APP_CODE) {
		RD_CCARD_APP_CODE = rD_CCARD_APP_CODE;
	}

	public String getRD_ATM_CARD_NO() {
		return RD_ATM_CARD_NO;
	}

	public void setRD_ATM_CARD_NO(String rD_ATM_CARD_NO) {
		RD_ATM_CARD_NO = rD_ATM_CARD_NO;
	}

}

