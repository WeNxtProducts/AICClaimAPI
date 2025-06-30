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
@Table(name = "LT_QUICK_QUOTE")
public class LT_QUICK_QUOTE {

    @Id
    @SequenceGenerator(name = "QuickQuoteTranIdSeq", sequenceName = "QQUOT_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "QuickQuoteTranIdSeq")
    @Column(name = "QUOT_TRAN_ID")
    private Long QUOT_TRAN_ID;

    @Column(name = "QUOT_NO")
    private String QUOT_NO;

    @Column(name = "QUOT_IDX_NO")
    private Integer QUOT_IDX_NO;

    @Column(name = "QUOT_PROD_CODE")
    private String QUOT_PROD_CODE;

    @Column(name = "QUOT_CLASS_CODE")
    private String QUOT_CLASS_CODE;

    @Column(name = "QUOT_DS_TYPE")
    private String QUOT_DS_TYPE;

    @Column(name = "QUOT_DS_CODE")
    private String QUOT_DS_CODE;

    @Column(name = "QUOT_ISSUE_DT")
    private Date QUOT_ISSUE_DT;

    @Column(name = "QUOT_PERIOD")
    private Integer QUOT_PERIOD;

    @Column(name = "QUOT_PREM_PAY_YRS")
    private Integer QUOT_PREM_PAY_YRS;

    @Column(name = "QUOT_FM_DT")
    private Date QUOT_FM_DT;

    @Column(name = "QUOT_TO_DT")
    private Date QUOT_TO_DT;

    @Column(name = "QUOT_NEW_CUST_YN")
    private String QUOT_NEW_CUST_YN;

    @Column(name = "QUOT_CUST_CODE")
    private String QUOT_CUST_CODE;

    @Column(name = "QUOT_CUST_TITLE")
    private String QUOT_CUST_TITLE;

    @Column(name = "QUOT_CUST_NAME")
    private String QUOT_CUST_NAME;

    @Column(name = "QUOT_CUST_ADDR1")
    private String QUOT_CUST_ADDR1;

    @Column(name = "QUOT_CUST_CITY")
    private String QUOT_CUST_CITY;

    @Column(name = "QUOT_CUST_STATE")
    private String QUOT_CUST_STATE;

    @Column(name = "QUOT_CUST_PO")
    private String QUOT_CUST_PO;

    @Column(name = "QUOT_CUST_PHONE")
    private String QUOT_CUST_PHONE;

    @Column(name = "QUOT_CUST_CONTACT")
    private String QUOT_CUST_CONTACT;

    @Column(name = "QUOT_CUST_MAIL_ID")
    private String QUOT_CUST_MAIL_ID;

    @Column(name = "QUOT_SRC_BUS")
    private String QUOT_SRC_BUS;

    @Column(name = "QUOT_SRC_CODE")
    private String QUOT_SRC_CODE;

    @Column(name = "QUOT_FRZ_RATE")
    private String QUOT_FRZ_RATE;

    @Column(name = "QUOT_STATUS")
    private String QUOT_STATUS;

    @Column(name = "QUOT_APPR_STAT")
    private String QUOT_APPR_STAT;

    @Column(name = "QUOT_APPRV_DT")
    private Date QUOT_APPRV_DT;

    @Column(name = "QUOT_APPRV_ID")
    private String QUOT_APPRV_ID;

    @Column(name = "QUOT_FC_SA")
    private BigDecimal QUOT_FC_SA;

    @Column(name = "QUOT_LC_SA")
    private BigDecimal QUOT_LC_SA;

    @Column(name = "QUOT_LC_PREM")
    private BigDecimal QUOT_LC_PREM;

    @Column(name = "QUOT_FC_PREM")
    private BigDecimal QUOT_FC_PREM;

    @Column(name = "QUOT_INS_DT")
    private Date QUOT_INS_DT;

    @Column(name = "QUOT_INS_ID")
    private String QUOT_INS_ID;

    @Column(name = "QUOT_MOD_DT")
    private Date QUOT_MOD_DT;

    @Column(name = "QUOT_MOD_ID")
    private String QUOT_MOD_ID;

    @Column(name = "QUOT_MOP")
    private String QUOT_MOP;

    @Column(name = "QUOT_ENQ_NO")
    private String QUOT_ENQ_NO;

    @Column(name = "QUOT_LOAN_TYPE")
    private String QUOT_LOAN_TYPE;

    @Column(name = "QUOT_BANK_ACNT_NO")
    private String QUOT_BANK_ACNT_NO;

    @Column(name = "QUOT_BANK_DIVN")
    private String QUOT_BANK_DIVN;

    @Column(name = "QUOT_BANK_CODE")
    private String QUOT_BANK_CODE;

    @Column(name = "QUOT_BROK_CODE")
    private String QUOT_BROK_CODE;

    @Column(name = "QUOT_SM_CODE")
    private String QUOT_SM_CODE;

    @Column(name = "QUOT_MAX_AGE")
    private Integer QUOT_MAX_AGE;

    @Column(name = "QUOT_SO_CODE")
    private String QUOT_SO_CODE;

    @Column(name = "QUOT_PLAN_CODE")
    private String QUOT_PLAN_CODE;

    @Column(name = "QUOT_CUST_CURR_CODE")
    private String QUOT_CUST_CURR_CODE;

    @Column(name = "QUOT_CUST_EXCH_RATE")
    private BigDecimal QUOT_CUST_EXCH_RATE;

    @Column(name = "QUOT_MODE_OF_PYMT_RATE")
    private BigDecimal QUOT_MODE_OF_PYMT_RATE;

    @Column(name = "QUOT_MODE_OF_PYMT")
    private String QUOT_MODE_OF_PYMT;

    @Column(name = "QUOT_LC_ADDL_PREM")
    private BigDecimal QUOT_LC_ADDL_PREM;

    @Column(name = "QUOT_FC_ADDL_PREM")
    private BigDecimal QUOT_FC_ADDL_PREM;

    @Column(name = "QUOT_BASIC_RATE")
    private BigDecimal QUOT_BASIC_RATE;

    @Column(name = "QUOT_BASIC_RATE_PER")
    private Long QUOT_BASIC_RATE_PER;

    @Column(name = "QUOT_LC_TOT_SA")
    private BigDecimal QUOT_LC_TOT_SA;

    @Column(name = "QUOT_FC_TOT_SA")
    private BigDecimal QUOT_FC_TOT_SA;

    @Column(name = "QUOT_ASSRD_REF_ID1")
    private String QUOT_ASSRD_REF_ID1;

    @Column(name = "QUOT_APPRV_STATUS")
    private String QUOT_APPRV_STATUS;

    @Column(name = "QUOT_CONV_YN")
    private String QUOT_CONV_YN;

    @Column(name = "QUOT_DIVN_CODE")
    private String QUOT_DIVN_CODE;

    @Column(name = "QUOT_UW_YEAR")
    private String QUOT_UW_YEAR;

    @Column(name = "QUOT_VALID_DT")
    private Date QUOT_VALID_DT;

    @Column(name = "QUOT_CUST_SURNAME")
    private String QUOT_CUST_SURNAME;

    @Column(name = "QUOT_COMM_RATE")
    private BigDecimal QUOT_COMM_RATE;

    @Column(name = "QUOT_COMM_RATE_PER")
    private Long QUOT_COMM_RATE_PER;

    @Column(name = "QUOT_CUST_ADDR2")
    private String QUOT_CUST_ADDR2;

    @Column(name = "QUOT_CUST_ADDR3")
    private String QUOT_CUST_ADDR3;

    @Column(name = "QUOT_MED_YN")
    private String QUOT_MED_YN;

    @Column(name = "QUOT_EMR_RATE")
    private BigDecimal QUOT_EMR_RATE;

    @Column(name = "QUOT_ORG_BASIC_RATE")
    private BigDecimal QUOT_ORG_BASIC_RATE;

    @Column(name = "QUOT_ORG_COMM_RATE_PER")
    private BigDecimal QUOT_ORG_COMM_RATE_PER;

    @Column(name = "QUOT_ORG_COMM_RATE")
    private BigDecimal QUOT_ORG_COMM_RATE;

    @Column(name = "QUOT_ORG_BROK_CODE")
    private String QUOT_ORG_BROK_CODE;

    @Column(name = "QUOT_COMM_VALUE")
    private BigDecimal QUOT_COMM_VALUE;

    @Column(name = "QUOT_ORG_COMM_VALUE")
    private BigDecimal QUOT_ORG_COMM_VALUE;

    @Column(name = "QUOT_MED_REC_YN")
    private String QUOT_MED_REC_YN;

    @Column(name = "QUOT_MED_REMARKS")
    private String QUOT_MED_REMARKS;

    @Column(name = "QUOT_CUST_CATG_CODE")
    private String QUOT_CUST_CATG_CODE;

    @Column(name = "QUOT_FC_MONTHLY_CONTR")
    private BigDecimal QUOT_FC_MONTHLY_CONTR;

    @Column(name = "QUOT_LC_MONTHLY_CONTR")
    private BigDecimal QUOT_LC_MONTHLY_CONTR;

    @Column(name = "QUOT_FC_ANNUAL_CONTR")
    private BigDecimal QUOT_FC_ANNUAL_CONTR;

    @Column(name = "QUOT_LC_ANNUAL_CONTR")
    private BigDecimal QUOT_LC_ANNUAL_CONTR;

    @Column(name = "QUOT_SA_FACTOR")
    private BigDecimal QUOT_SA_FACTOR;

    @Column(name = "QUOT_UNITS")
    private Integer QUOT_UNITS;

    @Column(name = "QUOT_CUST_DOB")
    private Date QUOT_CUST_DOB;

    @Column(name = "QUOT_FC_ANN_BNF_AMT")
    private BigDecimal QUOT_FC_ANN_BNF_AMT;

    @Column(name = "QUOT_UL_PREM_CALC")
    private String QUOT_UL_PREM_CALC;

    @Column(name = "QUOT_FC_MODAL_PREM")
    private BigDecimal QUOT_FC_MODAL_PREM;

    @Column(name = "QUOT_BNF_ESC_PERC")
    private String QUOT_BNF_ESC_PERC;

    @Column(name = "QUOT_ANN_PAY_PERIOD")
    private String QUOT_ANN_PAY_PERIOD;

    @Column(name = "QUOT_JOINT_LIFE_AGE")
    private Integer QUOT_JOINT_LIFE_AGE;

    @Column(name = "QUOT_BANK_ACNT_NAME")
    private String QUOT_BANK_ACNT_NAME;

    @Column(name = "QUOT_RES_PHONE_NO")
    private String QUOT_RES_PHONE_NO;

    @Column(name = "QUOT_OFF_PHONE_NO")
    private String QUOT_OFF_PHONE_NO;

    @Column(name = "QUOT_PYMT_TYPE")
    private String QUOT_PYMT_TYPE;

    @Column(name = "QUOT_EMPLOYER_CODE")
    private String QUOT_EMPLOYER_CODE;

    @Column(name = "QUOT_DEBIT_DAY")
    private Integer QUOT_DEBIT_DAY;

    @Column(name = "QUOT_TOT_PREM")
    private BigDecimal QUOT_TOT_PREM;

    @Column(name = "QUOT_CONT_CODE")
    private String QUOT_CONT_CODE;

    @Column(name = "QUOT_PREM_PAYER_CODE")
    private String QUOT_PREM_PAYER_CODE;

    @Column(name = "QUOT_PREM_PAYER_YN")
    private String QUOT_PREM_PAYER_YN;

    @Column(name = "QUOT_CHARGE")
    private BigDecimal QUOT_CHARGE;

    @Column(name = "QUOT_FLEX_01")
    private String QUOT_FLEX_01;

    @Column(name = "QUOT_FLEX_02")
    private String QUOT_FLEX_02;

    @Column(name = "QUOT_FLEX_03")
    private String QUOT_FLEX_03;

    @Column(name = "QUOT_FLEX_04")
    private String QUOT_FLEX_04;

    @Column(name = "QUOT_FLEX_05")
    private String QUOT_FLEX_05;

    @Column(name = "QUOT_FLEX_06")
    private String QUOT_FLEX_06;

    @Column(name = "QUOT_FLEX_07")
    private String QUOT_FLEX_07;

    @Column(name = "QUOT_FLEX_08")
    private String QUOT_FLEX_08;

    @Column(name = "QUOT_FLEX_09")
    private String QUOT_FLEX_09;

    @Column(name = "QUOT_FLEX_10")
    private String QUOT_FLEX_10;

    @Column(name = "QUOT_FC_AGENT_PREM")
    private BigDecimal QUOT_FC_AGENT_PREM;

    @Column(name = "QUOT_LC_AGENT_PREM")
    private BigDecimal QUOT_LC_AGENT_PREM;

    @Column(name = "QUOT_SUB_PLAN_CODE")
    private String QUOT_SUB_PLAN_CODE;

    @Column(name = "QUOT_CUST_CITY_CODE")
    private String QUOT_CUST_CITY_CODE;

    @Column(name = "QUOT_CUST_COUNTRY_CODE")
    private String QUOT_CUST_COUNTRY_CODE;

    @Column(name = "QUOT_CONT_EXIST_YN")
    private String QUOT_CONT_EXIST_YN;

    @Column(name = "QUOT_PP_EXIST_YN")
    private String QUOT_PP_EXIST_YN;

    @Column(name = "QUOT_ACTION_FLAG")
    private String QUOT_ACTION_FLAG;

	public Long getQUOT_TRAN_ID() {
		return QUOT_TRAN_ID;
	}

	public void setQUOT_TRAN_ID(Long qUOT_TRAN_ID) {
		QUOT_TRAN_ID = qUOT_TRAN_ID;
	}

	public String getQUOT_NO() {
		return QUOT_NO;
	}

	public void setQUOT_NO(String qUOT_NO) {
		QUOT_NO = qUOT_NO;
	}

	public Integer getQUOT_IDX_NO() {
		return QUOT_IDX_NO;
	}

	public void setQUOT_IDX_NO(Integer qUOT_IDX_NO) {
		QUOT_IDX_NO = qUOT_IDX_NO;
	}

	public String getQUOT_PROD_CODE() {
		return QUOT_PROD_CODE;
	}

	public void setQUOT_PROD_CODE(String qUOT_PROD_CODE) {
		QUOT_PROD_CODE = qUOT_PROD_CODE;
	}

	public String getQUOT_CLASS_CODE() {
		return QUOT_CLASS_CODE;
	}

	public void setQUOT_CLASS_CODE(String qUOT_CLASS_CODE) {
		QUOT_CLASS_CODE = qUOT_CLASS_CODE;
	}

	public String getQUOT_DS_TYPE() {
		return QUOT_DS_TYPE;
	}

	public void setQUOT_DS_TYPE(String qUOT_DS_TYPE) {
		QUOT_DS_TYPE = qUOT_DS_TYPE;
	}

	public String getQUOT_DS_CODE() {
		return QUOT_DS_CODE;
	}

	public void setQUOT_DS_CODE(String qUOT_DS_CODE) {
		QUOT_DS_CODE = qUOT_DS_CODE;
	}

	public Date getQUOT_ISSUE_DT() {
		return QUOT_ISSUE_DT;
	}

	public void setQUOT_ISSUE_DT(Date qUOT_ISSUE_DT) {
		QUOT_ISSUE_DT = qUOT_ISSUE_DT;
	}

	public Integer getQUOT_PERIOD() {
		return QUOT_PERIOD;
	}

	public void setQUOT_PERIOD(Integer qUOT_PERIOD) {
		QUOT_PERIOD = qUOT_PERIOD;
	}

	public Integer getQUOT_PREM_PAY_YRS() {
		return QUOT_PREM_PAY_YRS;
	}

	public void setQUOT_PREM_PAY_YRS(Integer qUOT_PREM_PAY_YRS) {
		QUOT_PREM_PAY_YRS = qUOT_PREM_PAY_YRS;
	}

	public Date getQUOT_FM_DT() {
		return QUOT_FM_DT;
	}

	public void setQUOT_FM_DT(Date qUOT_FM_DT) {
		QUOT_FM_DT = qUOT_FM_DT;
	}

	public Date getQUOT_TO_DT() {
		return QUOT_TO_DT;
	}

	public void setQUOT_TO_DT(Date qUOT_TO_DT) {
		QUOT_TO_DT = qUOT_TO_DT;
	}

	public String getQUOT_NEW_CUST_YN() {
		return QUOT_NEW_CUST_YN;
	}

	public void setQUOT_NEW_CUST_YN(String qUOT_NEW_CUST_YN) {
		QUOT_NEW_CUST_YN = qUOT_NEW_CUST_YN;
	}

	public String getQUOT_CUST_CODE() {
		return QUOT_CUST_CODE;
	}

	public void setQUOT_CUST_CODE(String qUOT_CUST_CODE) {
		QUOT_CUST_CODE = qUOT_CUST_CODE;
	}

	public String getQUOT_CUST_TITLE() {
		return QUOT_CUST_TITLE;
	}

	public void setQUOT_CUST_TITLE(String qUOT_CUST_TITLE) {
		QUOT_CUST_TITLE = qUOT_CUST_TITLE;
	}

	public String getQUOT_CUST_NAME() {
		return QUOT_CUST_NAME;
	}

	public void setQUOT_CUST_NAME(String qUOT_CUST_NAME) {
		QUOT_CUST_NAME = qUOT_CUST_NAME;
	}

	public String getQUOT_CUST_ADDR1() {
		return QUOT_CUST_ADDR1;
	}

	public void setQUOT_CUST_ADDR1(String qUOT_CUST_ADDR1) {
		QUOT_CUST_ADDR1 = qUOT_CUST_ADDR1;
	}

	public String getQUOT_CUST_CITY() {
		return QUOT_CUST_CITY;
	}

	public void setQUOT_CUST_CITY(String qUOT_CUST_CITY) {
		QUOT_CUST_CITY = qUOT_CUST_CITY;
	}

	public String getQUOT_CUST_STATE() {
		return QUOT_CUST_STATE;
	}

	public void setQUOT_CUST_STATE(String qUOT_CUST_STATE) {
		QUOT_CUST_STATE = qUOT_CUST_STATE;
	}

	public String getQUOT_CUST_PO() {
		return QUOT_CUST_PO;
	}

	public void setQUOT_CUST_PO(String qUOT_CUST_PO) {
		QUOT_CUST_PO = qUOT_CUST_PO;
	}

	public String getQUOT_CUST_PHONE() {
		return QUOT_CUST_PHONE;
	}

	public void setQUOT_CUST_PHONE(String qUOT_CUST_PHONE) {
		QUOT_CUST_PHONE = qUOT_CUST_PHONE;
	}

	public String getQUOT_CUST_CONTACT() {
		return QUOT_CUST_CONTACT;
	}

	public void setQUOT_CUST_CONTACT(String qUOT_CUST_CONTACT) {
		QUOT_CUST_CONTACT = qUOT_CUST_CONTACT;
	}

	public String getQUOT_CUST_MAIL_ID() {
		return QUOT_CUST_MAIL_ID;
	}

	public void setQUOT_CUST_MAIL_ID(String qUOT_CUST_MAIL_ID) {
		QUOT_CUST_MAIL_ID = qUOT_CUST_MAIL_ID;
	}

	public String getQUOT_SRC_BUS() {
		return QUOT_SRC_BUS;
	}

	public void setQUOT_SRC_BUS(String qUOT_SRC_BUS) {
		QUOT_SRC_BUS = qUOT_SRC_BUS;
	}

	public String getQUOT_SRC_CODE() {
		return QUOT_SRC_CODE;
	}

	public void setQUOT_SRC_CODE(String qUOT_SRC_CODE) {
		QUOT_SRC_CODE = qUOT_SRC_CODE;
	}

	public String getQUOT_FRZ_RATE() {
		return QUOT_FRZ_RATE;
	}

	public void setQUOT_FRZ_RATE(String qUOT_FRZ_RATE) {
		QUOT_FRZ_RATE = qUOT_FRZ_RATE;
	}

	public String getQUOT_STATUS() {
		return QUOT_STATUS;
	}

	public void setQUOT_STATUS(String qUOT_STATUS) {
		QUOT_STATUS = qUOT_STATUS;
	}

	public String getQUOT_APPR_STAT() {
		return QUOT_APPR_STAT;
	}

	public void setQUOT_APPR_STAT(String qUOT_APPR_STAT) {
		QUOT_APPR_STAT = qUOT_APPR_STAT;
	}

	public Date getQUOT_APPRV_DT() {
		return QUOT_APPRV_DT;
	}

	public void setQUOT_APPRV_DT(Date qUOT_APPRV_DT) {
		QUOT_APPRV_DT = qUOT_APPRV_DT;
	}

	public String getQUOT_APPRV_ID() {
		return QUOT_APPRV_ID;
	}

	public void setQUOT_APPRV_ID(String qUOT_APPRV_ID) {
		QUOT_APPRV_ID = qUOT_APPRV_ID;
	}

	public BigDecimal getQUOT_FC_SA() {
		return QUOT_FC_SA;
	}

	public void setQUOT_FC_SA(BigDecimal qUOT_FC_SA) {
		QUOT_FC_SA = qUOT_FC_SA;
	}

	public BigDecimal getQUOT_LC_SA() {
		return QUOT_LC_SA;
	}

	public void setQUOT_LC_SA(BigDecimal qUOT_LC_SA) {
		QUOT_LC_SA = qUOT_LC_SA;
	}

	public BigDecimal getQUOT_LC_PREM() {
		return QUOT_LC_PREM;
	}

	public void setQUOT_LC_PREM(BigDecimal qUOT_LC_PREM) {
		QUOT_LC_PREM = qUOT_LC_PREM;
	}

	public BigDecimal getQUOT_FC_PREM() {
		return QUOT_FC_PREM;
	}

	public void setQUOT_FC_PREM(BigDecimal qUOT_FC_PREM) {
		QUOT_FC_PREM = qUOT_FC_PREM;
	}

	public Date getQUOT_INS_DT() {
		return QUOT_INS_DT;
	}

	public void setQUOT_INS_DT(Date qUOT_INS_DT) {
		QUOT_INS_DT = qUOT_INS_DT;
	}

	public String getQUOT_INS_ID() {
		return QUOT_INS_ID;
	}

	public void setQUOT_INS_ID(String qUOT_INS_ID) {
		QUOT_INS_ID = qUOT_INS_ID;
	}

	public Date getQUOT_MOD_DT() {
		return QUOT_MOD_DT;
	}

	public void setQUOT_MOD_DT(Date qUOT_MOD_DT) {
		QUOT_MOD_DT = qUOT_MOD_DT;
	}

	public String getQUOT_MOD_ID() {
		return QUOT_MOD_ID;
	}

	public void setQUOT_MOD_ID(String qUOT_MOD_ID) {
		QUOT_MOD_ID = qUOT_MOD_ID;
	}

	public String getQUOT_MOP() {
		return QUOT_MOP;
	}

	public void setQUOT_MOP(String qUOT_MOP) {
		QUOT_MOP = qUOT_MOP;
	}

	public String getQUOT_ENQ_NO() {
		return QUOT_ENQ_NO;
	}

	public void setQUOT_ENQ_NO(String qUOT_ENQ_NO) {
		QUOT_ENQ_NO = qUOT_ENQ_NO;
	}

	public String getQUOT_LOAN_TYPE() {
		return QUOT_LOAN_TYPE;
	}

	public void setQUOT_LOAN_TYPE(String qUOT_LOAN_TYPE) {
		QUOT_LOAN_TYPE = qUOT_LOAN_TYPE;
	}

	public String getQUOT_BANK_ACNT_NO() {
		return QUOT_BANK_ACNT_NO;
	}

	public void setQUOT_BANK_ACNT_NO(String qUOT_BANK_ACNT_NO) {
		QUOT_BANK_ACNT_NO = qUOT_BANK_ACNT_NO;
	}

	public String getQUOT_BANK_DIVN() {
		return QUOT_BANK_DIVN;
	}

	public void setQUOT_BANK_DIVN(String qUOT_BANK_DIVN) {
		QUOT_BANK_DIVN = qUOT_BANK_DIVN;
	}

	public String getQUOT_BANK_CODE() {
		return QUOT_BANK_CODE;
	}

	public void setQUOT_BANK_CODE(String qUOT_BANK_CODE) {
		QUOT_BANK_CODE = qUOT_BANK_CODE;
	}

	public String getQUOT_BROK_CODE() {
		return QUOT_BROK_CODE;
	}

	public void setQUOT_BROK_CODE(String qUOT_BROK_CODE) {
		QUOT_BROK_CODE = qUOT_BROK_CODE;
	}

	public String getQUOT_SM_CODE() {
		return QUOT_SM_CODE;
	}

	public void setQUOT_SM_CODE(String qUOT_SM_CODE) {
		QUOT_SM_CODE = qUOT_SM_CODE;
	}

	public Integer getQUOT_MAX_AGE() {
		return QUOT_MAX_AGE;
	}

	public void setQUOT_MAX_AGE(Integer qUOT_MAX_AGE) {
		QUOT_MAX_AGE = qUOT_MAX_AGE;
	}

	public String getQUOT_SO_CODE() {
		return QUOT_SO_CODE;
	}

	public void setQUOT_SO_CODE(String qUOT_SO_CODE) {
		QUOT_SO_CODE = qUOT_SO_CODE;
	}

	public String getQUOT_PLAN_CODE() {
		return QUOT_PLAN_CODE;
	}

	public void setQUOT_PLAN_CODE(String qUOT_PLAN_CODE) {
		QUOT_PLAN_CODE = qUOT_PLAN_CODE;
	}

	public String getQUOT_CUST_CURR_CODE() {
		return QUOT_CUST_CURR_CODE;
	}

	public void setQUOT_CUST_CURR_CODE(String qUOT_CUST_CURR_CODE) {
		QUOT_CUST_CURR_CODE = qUOT_CUST_CURR_CODE;
	}

	public BigDecimal getQUOT_CUST_EXCH_RATE() {
		return QUOT_CUST_EXCH_RATE;
	}

	public void setQUOT_CUST_EXCH_RATE(BigDecimal qUOT_CUST_EXCH_RATE) {
		QUOT_CUST_EXCH_RATE = qUOT_CUST_EXCH_RATE;
	}

	public BigDecimal getQUOT_MODE_OF_PYMT_RATE() {
		return QUOT_MODE_OF_PYMT_RATE;
	}

	public void setQUOT_MODE_OF_PYMT_RATE(BigDecimal qUOT_MODE_OF_PYMT_RATE) {
		QUOT_MODE_OF_PYMT_RATE = qUOT_MODE_OF_PYMT_RATE;
	}

	public String getQUOT_MODE_OF_PYMT() {
		return QUOT_MODE_OF_PYMT;
	}

	public void setQUOT_MODE_OF_PYMT(String qUOT_MODE_OF_PYMT) {
		QUOT_MODE_OF_PYMT = qUOT_MODE_OF_PYMT;
	}

	public BigDecimal getQUOT_LC_ADDL_PREM() {
		return QUOT_LC_ADDL_PREM;
	}

	public void setQUOT_LC_ADDL_PREM(BigDecimal qUOT_LC_ADDL_PREM) {
		QUOT_LC_ADDL_PREM = qUOT_LC_ADDL_PREM;
	}

	public BigDecimal getQUOT_FC_ADDL_PREM() {
		return QUOT_FC_ADDL_PREM;
	}

	public void setQUOT_FC_ADDL_PREM(BigDecimal qUOT_FC_ADDL_PREM) {
		QUOT_FC_ADDL_PREM = qUOT_FC_ADDL_PREM;
	}

	public BigDecimal getQUOT_BASIC_RATE() {
		return QUOT_BASIC_RATE;
	}

	public void setQUOT_BASIC_RATE(BigDecimal qUOT_BASIC_RATE) {
		QUOT_BASIC_RATE = qUOT_BASIC_RATE;
	}

	public Long getQUOT_BASIC_RATE_PER() {
		return QUOT_BASIC_RATE_PER;
	}

	public void setQUOT_BASIC_RATE_PER(Long qUOT_BASIC_RATE_PER) {
		QUOT_BASIC_RATE_PER = qUOT_BASIC_RATE_PER;
	}

	public BigDecimal getQUOT_LC_TOT_SA() {
		return QUOT_LC_TOT_SA;
	}

	public void setQUOT_LC_TOT_SA(BigDecimal qUOT_LC_TOT_SA) {
		QUOT_LC_TOT_SA = qUOT_LC_TOT_SA;
	}

	public BigDecimal getQUOT_FC_TOT_SA() {
		return QUOT_FC_TOT_SA;
	}

	public void setQUOT_FC_TOT_SA(BigDecimal qUOT_FC_TOT_SA) {
		QUOT_FC_TOT_SA = qUOT_FC_TOT_SA;
	}

	public String getQUOT_ASSRD_REF_ID1() {
		return QUOT_ASSRD_REF_ID1;
	}

	public void setQUOT_ASSRD_REF_ID1(String qUOT_ASSRD_REF_ID1) {
		QUOT_ASSRD_REF_ID1 = qUOT_ASSRD_REF_ID1;
	}

	public String getQUOT_APPRV_STATUS() {
		return QUOT_APPRV_STATUS;
	}

	public void setQUOT_APPRV_STATUS(String qUOT_APPRV_STATUS) {
		QUOT_APPRV_STATUS = qUOT_APPRV_STATUS;
	}

	public String getQUOT_CONV_YN() {
		return QUOT_CONV_YN;
	}

	public void setQUOT_CONV_YN(String qUOT_CONV_YN) {
		QUOT_CONV_YN = qUOT_CONV_YN;
	}

	public String getQUOT_DIVN_CODE() {
		return QUOT_DIVN_CODE;
	}

	public void setQUOT_DIVN_CODE(String qUOT_DIVN_CODE) {
		QUOT_DIVN_CODE = qUOT_DIVN_CODE;
	}

	public String getQUOT_UW_YEAR() {
		return QUOT_UW_YEAR;
	}

	public void setQUOT_UW_YEAR(String qUOT_UW_YEAR) {
		QUOT_UW_YEAR = qUOT_UW_YEAR;
	}

	public Date getQUOT_VALID_DT() {
		return QUOT_VALID_DT;
	}

	public void setQUOT_VALID_DT(Date qUOT_VALID_DT) {
		QUOT_VALID_DT = qUOT_VALID_DT;
	}

	public String getQUOT_CUST_SURNAME() {
		return QUOT_CUST_SURNAME;
	}

	public void setQUOT_CUST_SURNAME(String qUOT_CUST_SURNAME) {
		QUOT_CUST_SURNAME = qUOT_CUST_SURNAME;
	}

	public BigDecimal getQUOT_COMM_RATE() {
		return QUOT_COMM_RATE;
	}

	public void setQUOT_COMM_RATE(BigDecimal qUOT_COMM_RATE) {
		QUOT_COMM_RATE = qUOT_COMM_RATE;
	}

	public Long getQUOT_COMM_RATE_PER() {
		return QUOT_COMM_RATE_PER;
	}

	public void setQUOT_COMM_RATE_PER(Long qUOT_COMM_RATE_PER) {
		QUOT_COMM_RATE_PER = qUOT_COMM_RATE_PER;
	}

	public String getQUOT_CUST_ADDR2() {
		return QUOT_CUST_ADDR2;
	}

	public void setQUOT_CUST_ADDR2(String qUOT_CUST_ADDR2) {
		QUOT_CUST_ADDR2 = qUOT_CUST_ADDR2;
	}

	public String getQUOT_CUST_ADDR3() {
		return QUOT_CUST_ADDR3;
	}

	public void setQUOT_CUST_ADDR3(String qUOT_CUST_ADDR3) {
		QUOT_CUST_ADDR3 = qUOT_CUST_ADDR3;
	}

	public String getQUOT_MED_YN() {
		return QUOT_MED_YN;
	}

	public void setQUOT_MED_YN(String qUOT_MED_YN) {
		QUOT_MED_YN = qUOT_MED_YN;
	}

	public BigDecimal getQUOT_EMR_RATE() {
		return QUOT_EMR_RATE;
	}

	public void setQUOT_EMR_RATE(BigDecimal qUOT_EMR_RATE) {
		QUOT_EMR_RATE = qUOT_EMR_RATE;
	}

	public BigDecimal getQUOT_ORG_BASIC_RATE() {
		return QUOT_ORG_BASIC_RATE;
	}

	public void setQUOT_ORG_BASIC_RATE(BigDecimal qUOT_ORG_BASIC_RATE) {
		QUOT_ORG_BASIC_RATE = qUOT_ORG_BASIC_RATE;
	}

	public BigDecimal getQUOT_ORG_COMM_RATE_PER() {
		return QUOT_ORG_COMM_RATE_PER;
	}

	public void setQUOT_ORG_COMM_RATE_PER(BigDecimal qUOT_ORG_COMM_RATE_PER) {
		QUOT_ORG_COMM_RATE_PER = qUOT_ORG_COMM_RATE_PER;
	}

	public BigDecimal getQUOT_ORG_COMM_RATE() {
		return QUOT_ORG_COMM_RATE;
	}

	public void setQUOT_ORG_COMM_RATE(BigDecimal qUOT_ORG_COMM_RATE) {
		QUOT_ORG_COMM_RATE = qUOT_ORG_COMM_RATE;
	}

	public String getQUOT_ORG_BROK_CODE() {
		return QUOT_ORG_BROK_CODE;
	}

	public void setQUOT_ORG_BROK_CODE(String qUOT_ORG_BROK_CODE) {
		QUOT_ORG_BROK_CODE = qUOT_ORG_BROK_CODE;
	}

	public BigDecimal getQUOT_COMM_VALUE() {
		return QUOT_COMM_VALUE;
	}

	public void setQUOT_COMM_VALUE(BigDecimal qUOT_COMM_VALUE) {
		QUOT_COMM_VALUE = qUOT_COMM_VALUE;
	}

	public BigDecimal getQUOT_ORG_COMM_VALUE() {
		return QUOT_ORG_COMM_VALUE;
	}

	public void setQUOT_ORG_COMM_VALUE(BigDecimal qUOT_ORG_COMM_VALUE) {
		QUOT_ORG_COMM_VALUE = qUOT_ORG_COMM_VALUE;
	}

	public String getQUOT_MED_REC_YN() {
		return QUOT_MED_REC_YN;
	}

	public void setQUOT_MED_REC_YN(String qUOT_MED_REC_YN) {
		QUOT_MED_REC_YN = qUOT_MED_REC_YN;
	}

	public String getQUOT_MED_REMARKS() {
		return QUOT_MED_REMARKS;
	}

	public void setQUOT_MED_REMARKS(String qUOT_MED_REMARKS) {
		QUOT_MED_REMARKS = qUOT_MED_REMARKS;
	}

	public String getQUOT_CUST_CATG_CODE() {
		return QUOT_CUST_CATG_CODE;
	}

	public void setQUOT_CUST_CATG_CODE(String qUOT_CUST_CATG_CODE) {
		QUOT_CUST_CATG_CODE = qUOT_CUST_CATG_CODE;
	}

	public BigDecimal getQUOT_FC_MONTHLY_CONTR() {
		return QUOT_FC_MONTHLY_CONTR;
	}

	public void setQUOT_FC_MONTHLY_CONTR(BigDecimal qUOT_FC_MONTHLY_CONTR) {
		QUOT_FC_MONTHLY_CONTR = qUOT_FC_MONTHLY_CONTR;
	}

	public BigDecimal getQUOT_LC_MONTHLY_CONTR() {
		return QUOT_LC_MONTHLY_CONTR;
	}

	public void setQUOT_LC_MONTHLY_CONTR(BigDecimal qUOT_LC_MONTHLY_CONTR) {
		QUOT_LC_MONTHLY_CONTR = qUOT_LC_MONTHLY_CONTR;
	}

	public BigDecimal getQUOT_FC_ANNUAL_CONTR() {
		return QUOT_FC_ANNUAL_CONTR;
	}

	public void setQUOT_FC_ANNUAL_CONTR(BigDecimal qUOT_FC_ANNUAL_CONTR) {
		QUOT_FC_ANNUAL_CONTR = qUOT_FC_ANNUAL_CONTR;
	}

	public BigDecimal getQUOT_LC_ANNUAL_CONTR() {
		return QUOT_LC_ANNUAL_CONTR;
	}

	public void setQUOT_LC_ANNUAL_CONTR(BigDecimal qUOT_LC_ANNUAL_CONTR) {
		QUOT_LC_ANNUAL_CONTR = qUOT_LC_ANNUAL_CONTR;
	}

	public BigDecimal getQUOT_SA_FACTOR() {
		return QUOT_SA_FACTOR;
	}

	public void setQUOT_SA_FACTOR(BigDecimal qUOT_SA_FACTOR) {
		QUOT_SA_FACTOR = qUOT_SA_FACTOR;
	}

	public Integer getQUOT_UNITS() {
		return QUOT_UNITS;
	}

	public void setQUOT_UNITS(Integer qUOT_UNITS) {
		QUOT_UNITS = qUOT_UNITS;
	}

	public Date getQUOT_CUST_DOB() {
		return QUOT_CUST_DOB;
	}

	public void setQUOT_CUST_DOB(Date qUOT_CUST_DOB) {
		QUOT_CUST_DOB = qUOT_CUST_DOB;
	}

	public BigDecimal getQUOT_FC_ANN_BNF_AMT() {
		return QUOT_FC_ANN_BNF_AMT;
	}

	public void setQUOT_FC_ANN_BNF_AMT(BigDecimal qUOT_FC_ANN_BNF_AMT) {
		QUOT_FC_ANN_BNF_AMT = qUOT_FC_ANN_BNF_AMT;
	}

	public String getQUOT_UL_PREM_CALC() {
		return QUOT_UL_PREM_CALC;
	}

	public void setQUOT_UL_PREM_CALC(String qUOT_UL_PREM_CALC) {
		QUOT_UL_PREM_CALC = qUOT_UL_PREM_CALC;
	}

	public BigDecimal getQUOT_FC_MODAL_PREM() {
		return QUOT_FC_MODAL_PREM;
	}

	public void setQUOT_FC_MODAL_PREM(BigDecimal qUOT_FC_MODAL_PREM) {
		QUOT_FC_MODAL_PREM = qUOT_FC_MODAL_PREM;
	}

	public String getQUOT_BNF_ESC_PERC() {
		return QUOT_BNF_ESC_PERC;
	}

	public void setQUOT_BNF_ESC_PERC(String qUOT_BNF_ESC_PERC) {
		QUOT_BNF_ESC_PERC = qUOT_BNF_ESC_PERC;
	}

	public String getQUOT_ANN_PAY_PERIOD() {
		return QUOT_ANN_PAY_PERIOD;
	}

	public void setQUOT_ANN_PAY_PERIOD(String qUOT_ANN_PAY_PERIOD) {
		QUOT_ANN_PAY_PERIOD = qUOT_ANN_PAY_PERIOD;
	}

	public Integer getQUOT_JOINT_LIFE_AGE() {
		return QUOT_JOINT_LIFE_AGE;
	}

	public void setQUOT_JOINT_LIFE_AGE(Integer qUOT_JOINT_LIFE_AGE) {
		QUOT_JOINT_LIFE_AGE = qUOT_JOINT_LIFE_AGE;
	}

	public String getQUOT_BANK_ACNT_NAME() {
		return QUOT_BANK_ACNT_NAME;
	}

	public void setQUOT_BANK_ACNT_NAME(String qUOT_BANK_ACNT_NAME) {
		QUOT_BANK_ACNT_NAME = qUOT_BANK_ACNT_NAME;
	}

	public String getQUOT_RES_PHONE_NO() {
		return QUOT_RES_PHONE_NO;
	}

	public void setQUOT_RES_PHONE_NO(String qUOT_RES_PHONE_NO) {
		QUOT_RES_PHONE_NO = qUOT_RES_PHONE_NO;
	}

	public String getQUOT_OFF_PHONE_NO() {
		return QUOT_OFF_PHONE_NO;
	}

	public void setQUOT_OFF_PHONE_NO(String qUOT_OFF_PHONE_NO) {
		QUOT_OFF_PHONE_NO = qUOT_OFF_PHONE_NO;
	}

	public String getQUOT_PYMT_TYPE() {
		return QUOT_PYMT_TYPE;
	}

	public void setQUOT_PYMT_TYPE(String qUOT_PYMT_TYPE) {
		QUOT_PYMT_TYPE = qUOT_PYMT_TYPE;
	}

	public String getQUOT_EMPLOYER_CODE() {
		return QUOT_EMPLOYER_CODE;
	}

	public void setQUOT_EMPLOYER_CODE(String qUOT_EMPLOYER_CODE) {
		QUOT_EMPLOYER_CODE = qUOT_EMPLOYER_CODE;
	}

	public Integer getQUOT_DEBIT_DAY() {
		return QUOT_DEBIT_DAY;
	}

	public void setQUOT_DEBIT_DAY(Integer qUOT_DEBIT_DAY) {
		QUOT_DEBIT_DAY = qUOT_DEBIT_DAY;
	}

	public BigDecimal getQUOT_TOT_PREM() {
		return QUOT_TOT_PREM;
	}

	public void setQUOT_TOT_PREM(BigDecimal qUOT_TOT_PREM) {
		QUOT_TOT_PREM = qUOT_TOT_PREM;
	}

	public String getQUOT_CONT_CODE() {
		return QUOT_CONT_CODE;
	}

	public void setQUOT_CONT_CODE(String qUOT_CONT_CODE) {
		QUOT_CONT_CODE = qUOT_CONT_CODE;
	}

	public String getQUOT_PREM_PAYER_CODE() {
		return QUOT_PREM_PAYER_CODE;
	}

	public void setQUOT_PREM_PAYER_CODE(String qUOT_PREM_PAYER_CODE) {
		QUOT_PREM_PAYER_CODE = qUOT_PREM_PAYER_CODE;
	}

	public String getQUOT_PREM_PAYER_YN() {
		return QUOT_PREM_PAYER_YN;
	}

	public void setQUOT_PREM_PAYER_YN(String qUOT_PREM_PAYER_YN) {
		QUOT_PREM_PAYER_YN = qUOT_PREM_PAYER_YN;
	}

	public BigDecimal getQUOT_CHARGE() {
		return QUOT_CHARGE;
	}

	public void setQUOT_CHARGE(BigDecimal qUOT_CHARGE) {
		QUOT_CHARGE = qUOT_CHARGE;
	}

	public String getQUOT_FLEX_01() {
		return QUOT_FLEX_01;
	}

	public void setQUOT_FLEX_01(String qUOT_FLEX_01) {
		QUOT_FLEX_01 = qUOT_FLEX_01;
	}

	public String getQUOT_FLEX_02() {
		return QUOT_FLEX_02;
	}

	public void setQUOT_FLEX_02(String qUOT_FLEX_02) {
		QUOT_FLEX_02 = qUOT_FLEX_02;
	}

	public String getQUOT_FLEX_03() {
		return QUOT_FLEX_03;
	}

	public void setQUOT_FLEX_03(String qUOT_FLEX_03) {
		QUOT_FLEX_03 = qUOT_FLEX_03;
	}

	public String getQUOT_FLEX_04() {
		return QUOT_FLEX_04;
	}

	public void setQUOT_FLEX_04(String qUOT_FLEX_04) {
		QUOT_FLEX_04 = qUOT_FLEX_04;
	}

	public String getQUOT_FLEX_05() {
		return QUOT_FLEX_05;
	}

	public void setQUOT_FLEX_05(String qUOT_FLEX_05) {
		QUOT_FLEX_05 = qUOT_FLEX_05;
	}

	public String getQUOT_FLEX_06() {
		return QUOT_FLEX_06;
	}

	public void setQUOT_FLEX_06(String qUOT_FLEX_06) {
		QUOT_FLEX_06 = qUOT_FLEX_06;
	}

	public String getQUOT_FLEX_07() {
		return QUOT_FLEX_07;
	}

	public void setQUOT_FLEX_07(String qUOT_FLEX_07) {
		QUOT_FLEX_07 = qUOT_FLEX_07;
	}

	public String getQUOT_FLEX_08() {
		return QUOT_FLEX_08;
	}

	public void setQUOT_FLEX_08(String qUOT_FLEX_08) {
		QUOT_FLEX_08 = qUOT_FLEX_08;
	}

	public String getQUOT_FLEX_09() {
		return QUOT_FLEX_09;
	}

	public void setQUOT_FLEX_09(String qUOT_FLEX_09) {
		QUOT_FLEX_09 = qUOT_FLEX_09;
	}

	public String getQUOT_FLEX_10() {
		return QUOT_FLEX_10;
	}

	public void setQUOT_FLEX_10(String qUOT_FLEX_10) {
		QUOT_FLEX_10 = qUOT_FLEX_10;
	}

	public BigDecimal getQUOT_FC_AGENT_PREM() {
		return QUOT_FC_AGENT_PREM;
	}

	public void setQUOT_FC_AGENT_PREM(BigDecimal qUOT_FC_AGENT_PREM) {
		QUOT_FC_AGENT_PREM = qUOT_FC_AGENT_PREM;
	}

	public BigDecimal getQUOT_LC_AGENT_PREM() {
		return QUOT_LC_AGENT_PREM;
	}

	public void setQUOT_LC_AGENT_PREM(BigDecimal qUOT_LC_AGENT_PREM) {
		QUOT_LC_AGENT_PREM = qUOT_LC_AGENT_PREM;
	}

	public String getQUOT_SUB_PLAN_CODE() {
		return QUOT_SUB_PLAN_CODE;
	}

	public void setQUOT_SUB_PLAN_CODE(String qUOT_SUB_PLAN_CODE) {
		QUOT_SUB_PLAN_CODE = qUOT_SUB_PLAN_CODE;
	}

	public String getQUOT_CUST_CITY_CODE() {
		return QUOT_CUST_CITY_CODE;
	}

	public void setQUOT_CUST_CITY_CODE(String qUOT_CUST_CITY_CODE) {
		QUOT_CUST_CITY_CODE = qUOT_CUST_CITY_CODE;
	}

	public String getQUOT_CUST_COUNTRY_CODE() {
		return QUOT_CUST_COUNTRY_CODE;
	}

	public void setQUOT_CUST_COUNTRY_CODE(String qUOT_CUST_COUNTRY_CODE) {
		QUOT_CUST_COUNTRY_CODE = qUOT_CUST_COUNTRY_CODE;
	}

	public String getQUOT_CONT_EXIST_YN() {
		return QUOT_CONT_EXIST_YN;
	}

	public void setQUOT_CONT_EXIST_YN(String qUOT_CONT_EXIST_YN) {
		QUOT_CONT_EXIST_YN = qUOT_CONT_EXIST_YN;
	}

	public String getQUOT_PP_EXIST_YN() {
		return QUOT_PP_EXIST_YN;
	}

	public void setQUOT_PP_EXIST_YN(String qUOT_PP_EXIST_YN) {
		QUOT_PP_EXIST_YN = qUOT_PP_EXIST_YN;
	}

	public String getQUOT_ACTION_FLAG() {
		return QUOT_ACTION_FLAG;
	}

	public void setQUOT_ACTION_FLAG(String qUOT_ACTION_FLAG) {
		QUOT_ACTION_FLAG = qUOT_ACTION_FLAG;
	}

}

