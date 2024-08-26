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
@Table(name = "LT_PYMT_DTLS")
public class LT_PYMT_DTLS {

    @Id
    @SequenceGenerator(name = "PaymentDtlsTranIdSeq", sequenceName = "PD_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PaymentDtlsTranIdSeq")
    @Column(name = "PD_TRAN_ID")
    private Integer PD_TRAN_ID;

    @Column(name = "PD_SR_NO")
    private Integer PD_SR_NO;

    @Column(name = "PD_TXN_TYPE")
    private String PD_TXN_TYPE;

    @Column(name = "PD_TXN_TRAN_ID")
    private Long PD_TXN_TRAN_ID;

    @Column(name = "PD_PAY_MODE")
    private String PD_PAY_MODE;

    @Column(name = "PD_CURR_CODE")
    private String PD_CURR_CODE;

    @Column(name = "PD_FC_AMT")
    private Double PD_FC_AMT;

    @Column(name = "PD_LC_AMT")
    private Double PD_LC_AMT;

    @Column(name = "PD_CHQ_NO")
    private String PD_CHQ_NO;

    @Column(name = "PD_CHQ_DT")
    private Date PD_CHQ_DT;

    @Column(name = "PD_BANK_NAME")
    private String PD_BANK_NAME;

    @Column(name = "PD_BRANCH_NAME")
    private String PD_BRANCH_NAME;

    @Column(name = "PD_CC_NO")
    private String PD_CC_NO;

    @Column(name = "PD_CC_NAME")
    private String PD_CC_NAME;

    @Column(name = "PD_CC_EXP_DT")
    private Date PD_CC_EXP_DT;

    @Column(name = "PD_CC_TYPE")
    private String PD_CC_TYPE;

    @Column(name = "PD_CUST_NAME")
    private String PD_CUST_NAME;

    @Column(name = "PD_ADDR_01")
    private String PD_ADDR_01;

    @Column(name = "PD_ADDR_02")
    private String PD_ADDR_02;

    @Column(name = "PD_ADDR_03")
    private String PD_ADDR_03;

    @Column(name = "PD_REMARKS")
    private String PD_REMARKS;

    @Column(name = "PD_INS_ID")
    private String PD_INS_ID;

    @Column(name = "PD_INS_DT")
    private Date PD_INS_DT;

    @Column(name = "PD_MOD_ID")
    private String PD_MOD_ID;

    @Column(name = "PD_MOD_DT")
    private Date PD_MOD_DT;

    @Column(name = "PD_DPD_REF_ID")
    private String PD_DPD_REF_ID;

    @Column(name = "PD_REV_YN")
    private String PD_REV_YN;

    @Column(name = "PD_LC_CHARGE")
    private Double PD_LC_CHARGE;

    @Column(name = "PD_FC_CHARGE")
    private Double PD_FC_CHARGE;

    @Column(name = "PD_PAID_FOR")
    private String PD_PAID_FOR;

    @Column(name = "PD_CC_APP_CODE")
    private String PD_CC_APP_CODE;

    @Column(name = "PD_PAYIN_DATE")
    private Date PD_PAYIN_DATE;

    @Column(name = "PD_OUR_BANK_CODE")
    private String PD_OUR_BANK_CODE;

    @Column(name = "PD_DATE_OF_CREDIT")
    private Date PD_DATE_OF_CREDIT;

    @Column(name = "PD_TT_REF_NO")
    private String PD_TT_REF_NO;

    @Column(name = "PD_TT_CURR_CODE")
    private String PD_TT_CURR_CODE;

    @Column(name = "PD_REM_SLIP_GEN_YN")
    private String PD_REM_SLIP_GEN_YN;

    @Column(name = "PD_PO_MO_NO")
    private String PD_PO_MO_NO;

    @Column(name = "PD_PO_MO_DT")
    private Date PD_PO_MO_DT;

    @Column(name = "PD_REM_AMT")
    private Double PD_REM_AMT;

    @Column(name = "PD_BANK_REF_NO")
    private String PD_BANK_REF_NO;

    @Column(name = "PD_CR_ADVICE_NO")
    private String PD_CR_ADVICE_NO;

    @Column(name = "PD_ATM_CARD_NO")
    private String PD_ATM_CARD_NO;

    @Column(name = "PD_PCD_TRAN_ID")
    private Double PD_PCD_TRAN_ID;

    @Column(name = "PD_PMPC_TRAN_ID")
    private Double PD_PMPC_TRAN_ID;

    @Column(name = "PD_MICR_CODE")
    private String PD_MICR_CODE;

    @Column(name = "PD_EXCH_RATE")
    private Double PD_EXCH_RATE;

    @Column(name = "PD_CVV_NO")
    private Integer PD_CVV_NO;

	public Integer getPD_TRAN_ID() {
		return PD_TRAN_ID;
	}

	public void setPD_TRAN_ID(Integer pD_TRAN_ID) {
		PD_TRAN_ID = pD_TRAN_ID;
	}

	public Integer getPD_SR_NO() {
		return PD_SR_NO;
	}

	public void setPD_SR_NO(Integer pD_SR_NO) {
		PD_SR_NO = pD_SR_NO;
	}

	public String getPD_TXN_TYPE() {
		return PD_TXN_TYPE;
	}

	public void setPD_TXN_TYPE(String pD_TXN_TYPE) {
		PD_TXN_TYPE = pD_TXN_TYPE;
	}

	public Long getPD_TXN_TRAN_ID() {
		return PD_TXN_TRAN_ID;
	}

	public void setPD_TXN_TRAN_ID(Long pD_TXN_TRAN_ID) {
		PD_TXN_TRAN_ID = pD_TXN_TRAN_ID;
	}

	public String getPD_PAY_MODE() {
		return PD_PAY_MODE;
	}

	public void setPD_PAY_MODE(String pD_PAY_MODE) {
		PD_PAY_MODE = pD_PAY_MODE;
	}

	public String getPD_CURR_CODE() {
		return PD_CURR_CODE;
	}

	public void setPD_CURR_CODE(String pD_CURR_CODE) {
		PD_CURR_CODE = pD_CURR_CODE;
	}

	public Double getPD_FC_AMT() {
		return PD_FC_AMT;
	}

	public void setPD_FC_AMT(Double pD_FC_AMT) {
		PD_FC_AMT = pD_FC_AMT;
	}

	public Double getPD_LC_AMT() {
		return PD_LC_AMT;
	}

	public void setPD_LC_AMT(Double pD_LC_AMT) {
		PD_LC_AMT = pD_LC_AMT;
	}

	public String getPD_CHQ_NO() {
		return PD_CHQ_NO;
	}

	public void setPD_CHQ_NO(String pD_CHQ_NO) {
		PD_CHQ_NO = pD_CHQ_NO;
	}

	public Date getPD_CHQ_DT() {
		return PD_CHQ_DT;
	}

	public void setPD_CHQ_DT(Date pD_CHQ_DT) {
		PD_CHQ_DT = pD_CHQ_DT;
	}

	public String getPD_BANK_NAME() {
		return PD_BANK_NAME;
	}

	public void setPD_BANK_NAME(String pD_BANK_NAME) {
		PD_BANK_NAME = pD_BANK_NAME;
	}

	public String getPD_BRANCH_NAME() {
		return PD_BRANCH_NAME;
	}

	public void setPD_BRANCH_NAME(String pD_BRANCH_NAME) {
		PD_BRANCH_NAME = pD_BRANCH_NAME;
	}

	public String getPD_CC_NO() {
		return PD_CC_NO;
	}

	public void setPD_CC_NO(String pD_CC_NO) {
		PD_CC_NO = pD_CC_NO;
	}

	public String getPD_CC_NAME() {
		return PD_CC_NAME;
	}

	public void setPD_CC_NAME(String pD_CC_NAME) {
		PD_CC_NAME = pD_CC_NAME;
	}

	public Date getPD_CC_EXP_DT() {
		return PD_CC_EXP_DT;
	}

	public void setPD_CC_EXP_DT(Date pD_CC_EXP_DT) {
		PD_CC_EXP_DT = pD_CC_EXP_DT;
	}

	public String getPD_CC_TYPE() {
		return PD_CC_TYPE;
	}

	public void setPD_CC_TYPE(String pD_CC_TYPE) {
		PD_CC_TYPE = pD_CC_TYPE;
	}

	public String getPD_CUST_NAME() {
		return PD_CUST_NAME;
	}

	public void setPD_CUST_NAME(String pD_CUST_NAME) {
		PD_CUST_NAME = pD_CUST_NAME;
	}

	public String getPD_ADDR_01() {
		return PD_ADDR_01;
	}

	public void setPD_ADDR_01(String pD_ADDR_01) {
		PD_ADDR_01 = pD_ADDR_01;
	}

	public String getPD_ADDR_02() {
		return PD_ADDR_02;
	}

	public void setPD_ADDR_02(String pD_ADDR_02) {
		PD_ADDR_02 = pD_ADDR_02;
	}

	public String getPD_ADDR_03() {
		return PD_ADDR_03;
	}

	public void setPD_ADDR_03(String pD_ADDR_03) {
		PD_ADDR_03 = pD_ADDR_03;
	}

	public String getPD_REMARKS() {
		return PD_REMARKS;
	}

	public void setPD_REMARKS(String pD_REMARKS) {
		PD_REMARKS = pD_REMARKS;
	}

	public String getPD_INS_ID() {
		return PD_INS_ID;
	}

	public void setPD_INS_ID(String pD_INS_ID) {
		PD_INS_ID = pD_INS_ID;
	}

	public Date getPD_INS_DT() {
		return PD_INS_DT;
	}

	public void setPD_INS_DT(Date pD_INS_DT) {
		PD_INS_DT = pD_INS_DT;
	}

	public String getPD_MOD_ID() {
		return PD_MOD_ID;
	}

	public void setPD_MOD_ID(String pD_MOD_ID) {
		PD_MOD_ID = pD_MOD_ID;
	}

	public Date getPD_MOD_DT() {
		return PD_MOD_DT;
	}

	public void setPD_MOD_DT(Date pD_MOD_DT) {
		PD_MOD_DT = pD_MOD_DT;
	}

	public String getPD_DPD_REF_ID() {
		return PD_DPD_REF_ID;
	}

	public void setPD_DPD_REF_ID(String pD_DPD_REF_ID) {
		PD_DPD_REF_ID = pD_DPD_REF_ID;
	}

	public String getPD_REV_YN() {
		return PD_REV_YN;
	}

	public void setPD_REV_YN(String pD_REV_YN) {
		PD_REV_YN = pD_REV_YN;
	}

	public Double getPD_LC_CHARGE() {
		return PD_LC_CHARGE;
	}

	public void setPD_LC_CHARGE(Double pD_LC_CHARGE) {
		PD_LC_CHARGE = pD_LC_CHARGE;
	}

	public Double getPD_FC_CHARGE() {
		return PD_FC_CHARGE;
	}

	public void setPD_FC_CHARGE(Double pD_FC_CHARGE) {
		PD_FC_CHARGE = pD_FC_CHARGE;
	}

	public String getPD_PAID_FOR() {
		return PD_PAID_FOR;
	}

	public void setPD_PAID_FOR(String pD_PAID_FOR) {
		PD_PAID_FOR = pD_PAID_FOR;
	}

	public String getPD_CC_APP_CODE() {
		return PD_CC_APP_CODE;
	}

	public void setPD_CC_APP_CODE(String pD_CC_APP_CODE) {
		PD_CC_APP_CODE = pD_CC_APP_CODE;
	}

	public Date getPD_PAYIN_DATE() {
		return PD_PAYIN_DATE;
	}

	public void setPD_PAYIN_DATE(Date pD_PAYIN_DATE) {
		PD_PAYIN_DATE = pD_PAYIN_DATE;
	}

	public String getPD_OUR_BANK_CODE() {
		return PD_OUR_BANK_CODE;
	}

	public void setPD_OUR_BANK_CODE(String pD_OUR_BANK_CODE) {
		PD_OUR_BANK_CODE = pD_OUR_BANK_CODE;
	}

	public Date getPD_DATE_OF_CREDIT() {
		return PD_DATE_OF_CREDIT;
	}

	public void setPD_DATE_OF_CREDIT(Date pD_DATE_OF_CREDIT) {
		PD_DATE_OF_CREDIT = pD_DATE_OF_CREDIT;
	}

	public String getPD_TT_REF_NO() {
		return PD_TT_REF_NO;
	}

	public void setPD_TT_REF_NO(String pD_TT_REF_NO) {
		PD_TT_REF_NO = pD_TT_REF_NO;
	}

	public String getPD_TT_CURR_CODE() {
		return PD_TT_CURR_CODE;
	}

	public void setPD_TT_CURR_CODE(String pD_TT_CURR_CODE) {
		PD_TT_CURR_CODE = pD_TT_CURR_CODE;
	}

	public String getPD_REM_SLIP_GEN_YN() {
		return PD_REM_SLIP_GEN_YN;
	}

	public void setPD_REM_SLIP_GEN_YN(String pD_REM_SLIP_GEN_YN) {
		PD_REM_SLIP_GEN_YN = pD_REM_SLIP_GEN_YN;
	}

	public String getPD_PO_MO_NO() {
		return PD_PO_MO_NO;
	}

	public void setPD_PO_MO_NO(String pD_PO_MO_NO) {
		PD_PO_MO_NO = pD_PO_MO_NO;
	}

	public Date getPD_PO_MO_DT() {
		return PD_PO_MO_DT;
	}

	public void setPD_PO_MO_DT(Date pD_PO_MO_DT) {
		PD_PO_MO_DT = pD_PO_MO_DT;
	}

	public Double getPD_REM_AMT() {
		return PD_REM_AMT;
	}

	public void setPD_REM_AMT(Double pD_REM_AMT) {
		PD_REM_AMT = pD_REM_AMT;
	}

	public String getPD_BANK_REF_NO() {
		return PD_BANK_REF_NO;
	}

	public void setPD_BANK_REF_NO(String pD_BANK_REF_NO) {
		PD_BANK_REF_NO = pD_BANK_REF_NO;
	}

	public String getPD_CR_ADVICE_NO() {
		return PD_CR_ADVICE_NO;
	}

	public void setPD_CR_ADVICE_NO(String pD_CR_ADVICE_NO) {
		PD_CR_ADVICE_NO = pD_CR_ADVICE_NO;
	}

	public String getPD_ATM_CARD_NO() {
		return PD_ATM_CARD_NO;
	}

	public void setPD_ATM_CARD_NO(String pD_ATM_CARD_NO) {
		PD_ATM_CARD_NO = pD_ATM_CARD_NO;
	}

	public Double getPD_PCD_TRAN_ID() {
		return PD_PCD_TRAN_ID;
	}

	public void setPD_PCD_TRAN_ID(Double pD_PCD_TRAN_ID) {
		PD_PCD_TRAN_ID = pD_PCD_TRAN_ID;
	}

	public Double getPD_PMPC_TRAN_ID() {
		return PD_PMPC_TRAN_ID;
	}

	public void setPD_PMPC_TRAN_ID(Double pD_PMPC_TRAN_ID) {
		PD_PMPC_TRAN_ID = pD_PMPC_TRAN_ID;
	}

	public String getPD_MICR_CODE() {
		return PD_MICR_CODE;
	}

	public void setPD_MICR_CODE(String pD_MICR_CODE) {
		PD_MICR_CODE = pD_MICR_CODE;
	}

	public Double getPD_EXCH_RATE() {
		return PD_EXCH_RATE;
	}

	public void setPD_EXCH_RATE(Double pD_EXCH_RATE) {
		PD_EXCH_RATE = pD_EXCH_RATE;
	}

	public Integer getPD_CVV_NO() {
		return PD_CVV_NO;
	}

	public void setPD_CVV_NO(Integer pD_CVV_NO) {
		PD_CVV_NO = pD_CVV_NO;
	}

}

