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
@Table(name = "LT_DEPOSIT")
public class LT_DEPOSIT {

	@Id
    @SequenceGenerator(name = "DepositTranIdSeq", sequenceName = "DEP_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DepositTranIdSeq")
    @Column(name = "DEP_TRAN_ID")
    private Integer DEP_TRAN_ID;

    @Column(name = "DEP_TYPE")
    private String DEP_TYPE;

    @Column(name = "DEP_REF_NO")
    private String DEP_REF_NO;

    @Column(name = "DEP_CONT_CODE")
    private String DEP_CONT_CODE;

    @Column(name = "DEP_CUST_CODE")
    private String DEP_CUST_CODE;

    @Column(name = "DEP_CURR_CODE")
    private String DEP_CURR_CODE;

    @Column(name = "DEP_FC_DEP_AMT")
    private Double DEP_FC_DEP_AMT;

    @Column(name = "DEP_LC_DEP_AMT")
    private Double DEP_LC_DEP_AMT;

    @Column(name = "DEP_FC_TOTAL_AMT")
    private Double DEP_FC_TOTAL_AMT;

    @Column(name = "DEP_LC_TOTAL_AMT")
    private Double DEP_LC_TOTAL_AMT;

    @Column(name = "DEP_LC_OTH_AMT")
    private Double DEP_LC_OTH_AMT;

    @Column(name = "DEP_LC_GROSS_AMT")
    private Double DEP_LC_GROSS_AMT;

    @Column(name = "DEP_LC_AMT")
    private Double DEP_LC_AMT;

    @Column(name = "DEP_TXN_CODE")
    private String DEP_TXN_CODE;

    @Column(name = "DEP_DOC_NO")
    private Long DEP_DOC_NO;

    @Column(name = "DEP_DOC_DT")
    private Date DEP_DOC_DT;

    @Column(name = "DEP_ACNT_YEAR")
    private Integer DEP_ACNT_YEAR;

    @Column(name = "DEP_INS_ID")
    private String DEP_INS_ID;

    @Column(name = "DEP_INS_DT")
    private Date DEP_INS_DT;

    @Column(name = "DEP_MOD_ID")
    private String DEP_MOD_ID;

    @Column(name = "DEP_MOD_DT")
    private Date DEP_MOD_DT;

    @Column(name = "DEP_DIVN_CODE")
    private String DEP_DIVN_CODE;

    @Column(name = "DEP_DEPT_CODE")
    private String DEP_DEPT_CODE;

    @Column(name = "DEP_GROSS_NET_FLAG")
    private String DEP_GROSS_NET_FLAG;

    @Column(name = "DEP_TEMP_RCPT_NO")
    private String DEP_TEMP_RCPT_NO;

    @Column(name = "DEP_DS_CODE")
    private String DEP_DS_CODE;

    @Column(name = "DEP_CLASS_CODE")
    private String DEP_CLASS_CODE;

    @Column(name = "DEP_PLAN_CODE")
    private String DEP_PLAN_CODE;

    @Column(name = "DEP_PROD_CODE")
    private String DEP_PROD_CODE;

    @Column(name = "DEP_AGENT_CODE")
    private String DEP_AGENT_CODE;

    @Column(name = "DEP_COLL_AGENT_CODE")
    private String DEP_COLL_AGENT_CODE;

    @Column(name = "DEP_CONT_REF_ID1")
    private String DEP_CONT_REF_ID1;

    @Column(name = "DEP_CONT_REF_ID2")
    private String DEP_CONT_REF_ID2;

    @Column(name = "DEP_REC_REV_YN")
    private String DEP_REC_REV_YN;

    @Column(name = "DEP_REASON_CODE")
    private String DEP_REASON_CODE;

    @Column(name = "DEP_REV_REMARKS")
    private String DEP_REV_REMARKS;

    @Column(name = "DEP_REV_ACNT_YEAR")
    private Integer DEP_REV_ACNT_YEAR;

    @Column(name = "DEP_REV_CHRG_TXN_CODE")
    private String DEP_REV_CHRG_TXN_CODE;

    @Column(name = "DEP_REV_CHRG_DOC_NO")
    private Long DEP_REV_CHRG_DOC_NO;

    @Column(name = "DEP_BANKIN_CODE")
    private String DEP_BANKIN_CODE;

    @Column(name = "DEP_FLEX_01")
    private String DEP_FLEX_01;

    @Column(name = "DEP_FLEX_02")
    private String DEP_FLEX_02;

    @Column(name = "DEP_FLEX_03")
    private String DEP_FLEX_03;

    @Column(name = "DEP_FLEX_04")
    private String DEP_FLEX_04;

    @Column(name = "DEP_FLEX_05")
    private String DEP_FLEX_05;

    @Column(name = "DEP_FLEX_06")
    private String DEP_FLEX_06;

    @Column(name = "DEP_SRC_OF_BUS")
    private String DEP_SRC_OF_BUS;

    @Column(name = "DEP_CHRG_TXN_CODE")
    private String DEP_CHRG_TXN_CODE;

    @Column(name = "DEP_CHRG_DOC_NO")
    private Long DEP_CHRG_DOC_NO;

    @Column(name = "DEP_ADTH_BATCH_NO")
    private String DEP_ADTH_BATCH_NO;

    @Column(name = "DEP_PDC_FLAG")
    private String DEP_PDC_FLAG;

    @Column(name = "DEP_DUP_PRINT")
    private String DEP_DUP_PRINT;

    @Column(name = "DEP_BANK_IN_SLIP_NO")
    private String DEP_BANK_IN_SLIP_NO;

    @Column(name = "DEP_REP_BANK_IN_SLIP_NO")
    private String DEP_REP_BANK_IN_SLIP_NO;

    @Column(name = "DEP_REV_BANK_IN_SLIP_NO")
    private String DEP_REV_BANK_IN_SLIP_NO;

    @Column(name = "DEP_REPL_RCPT_YN")
    private String DEP_REPL_RCPT_YN;

    @Column(name = "DEP_REPL_DOC_NO")
    private Long DEP_REPL_DOC_NO;

    @Column(name = "DEP_REPL_TXN_CODE")
    private String DEP_REPL_TXN_CODE;

    @Column(name = "DEP_REPL_ACC_YR")
    private Integer DEP_REPL_ACC_YR;

    @Column(name = "DEP_MAST_RCPT_YN")
    private String DEP_MAST_RCPT_YN;

    @Column(name = "DEP_COMM_RECPT_YN")
    private String DEP_COMM_RECPT_YN;

    @Column(name = "DEP_CREDIT_BUS_YN")
    private String DEP_CREDIT_BUS_YN;

    @Column(name = "DEP_AMT_PAYOR_NAME")
    private String DEP_AMT_PAYOR_NAME;

    @Column(name = "DEP_AMT_PAYOR_CONTACT")
    private String DEP_AMT_PAYOR_CONTACT;

    @Column(name = "DEP_COMM_YN")
    private String DEP_COMM_YN;

    @Column(name = "DEP_PRE_REC_DT")
    private Date DEP_PRE_REC_DT;

    @Column(name = "DEP_RCPT_PAYER")
    private String DEP_RCPT_PAYER;

    @Column(name = "DEP_RCPT_PAYER_DESC")
    private String DEP_RCPT_PAYER_DESC;

    @Column(name = "DEP_PREM_REMARKS")
    private String DEP_PREM_REMARKS;

	public Integer getDEP_TRAN_ID() {
		return DEP_TRAN_ID;
	}

	public void setDEP_TRAN_ID(Integer dEP_TRAN_ID) {
		DEP_TRAN_ID = dEP_TRAN_ID;
	}

	public String getDEP_TYPE() {
		return DEP_TYPE;
	}

	public void setDEP_TYPE(String dEP_TYPE) {
		DEP_TYPE = dEP_TYPE;
	}

	public String getDEP_REF_NO() {
		return DEP_REF_NO;
	}

	public void setDEP_REF_NO(String dEP_REF_NO) {
		DEP_REF_NO = dEP_REF_NO;
	}

	public String getDEP_CONT_CODE() {
		return DEP_CONT_CODE;
	}

	public void setDEP_CONT_CODE(String dEP_CONT_CODE) {
		DEP_CONT_CODE = dEP_CONT_CODE;
	}

	public String getDEP_CUST_CODE() {
		return DEP_CUST_CODE;
	}

	public void setDEP_CUST_CODE(String dEP_CUST_CODE) {
		DEP_CUST_CODE = dEP_CUST_CODE;
	}

	public String getDEP_CURR_CODE() {
		return DEP_CURR_CODE;
	}

	public void setDEP_CURR_CODE(String dEP_CURR_CODE) {
		DEP_CURR_CODE = dEP_CURR_CODE;
	}

	public Double getDEP_FC_DEP_AMT() {
		return DEP_FC_DEP_AMT;
	}

	public void setDEP_FC_DEP_AMT(Double dEP_FC_DEP_AMT) {
		DEP_FC_DEP_AMT = dEP_FC_DEP_AMT;
	}

	public Double getDEP_LC_DEP_AMT() {
		return DEP_LC_DEP_AMT;
	}

	public void setDEP_LC_DEP_AMT(Double dEP_LC_DEP_AMT) {
		DEP_LC_DEP_AMT = dEP_LC_DEP_AMT;
	}

	public Double getDEP_FC_TOTAL_AMT() {
		return DEP_FC_TOTAL_AMT;
	}

	public void setDEP_FC_TOTAL_AMT(Double dEP_FC_TOTAL_AMT) {
		DEP_FC_TOTAL_AMT = dEP_FC_TOTAL_AMT;
	}

	public Double getDEP_LC_TOTAL_AMT() {
		return DEP_LC_TOTAL_AMT;
	}

	public void setDEP_LC_TOTAL_AMT(Double dEP_LC_TOTAL_AMT) {
		DEP_LC_TOTAL_AMT = dEP_LC_TOTAL_AMT;
	}

	public Double getDEP_LC_OTH_AMT() {
		return DEP_LC_OTH_AMT;
	}

	public void setDEP_LC_OTH_AMT(Double dEP_LC_OTH_AMT) {
		DEP_LC_OTH_AMT = dEP_LC_OTH_AMT;
	}

	public Double getDEP_LC_GROSS_AMT() {
		return DEP_LC_GROSS_AMT;
	}

	public void setDEP_LC_GROSS_AMT(Double dEP_LC_GROSS_AMT) {
		DEP_LC_GROSS_AMT = dEP_LC_GROSS_AMT;
	}

	public Double getDEP_LC_AMT() {
		return DEP_LC_AMT;
	}

	public void setDEP_LC_AMT(Double dEP_LC_AMT) {
		DEP_LC_AMT = dEP_LC_AMT;
	}

	public String getDEP_TXN_CODE() {
		return DEP_TXN_CODE;
	}

	public void setDEP_TXN_CODE(String dEP_TXN_CODE) {
		DEP_TXN_CODE = dEP_TXN_CODE;
	}

	public Long getDEP_DOC_NO() {
		return DEP_DOC_NO;
	}

	public void setDEP_DOC_NO(Long dEP_DOC_NO) {
		DEP_DOC_NO = dEP_DOC_NO;
	}

	public Date getDEP_DOC_DT() {
		return DEP_DOC_DT;
	}

	public void setDEP_DOC_DT(Date dEP_DOC_DT) {
		DEP_DOC_DT = dEP_DOC_DT;
	}

	public Integer getDEP_ACNT_YEAR() {
		return DEP_ACNT_YEAR;
	}

	public void setDEP_ACNT_YEAR(Integer dEP_ACNT_YEAR) {
		DEP_ACNT_YEAR = dEP_ACNT_YEAR;
	}

	public String getDEP_INS_ID() {
		return DEP_INS_ID;
	}

	public void setDEP_INS_ID(String dEP_INS_ID) {
		DEP_INS_ID = dEP_INS_ID;
	}

	public Date getDEP_INS_DT() {
		return DEP_INS_DT;
	}

	public void setDEP_INS_DT(Date dEP_INS_DT) {
		DEP_INS_DT = dEP_INS_DT;
	}

	public String getDEP_MOD_ID() {
		return DEP_MOD_ID;
	}

	public void setDEP_MOD_ID(String dEP_MOD_ID) {
		DEP_MOD_ID = dEP_MOD_ID;
	}

	public Date getDEP_MOD_DT() {
		return DEP_MOD_DT;
	}

	public void setDEP_MOD_DT(Date dEP_MOD_DT) {
		DEP_MOD_DT = dEP_MOD_DT;
	}

	public String getDEP_DIVN_CODE() {
		return DEP_DIVN_CODE;
	}

	public void setDEP_DIVN_CODE(String dEP_DIVN_CODE) {
		DEP_DIVN_CODE = dEP_DIVN_CODE;
	}

	public String getDEP_DEPT_CODE() {
		return DEP_DEPT_CODE;
	}

	public void setDEP_DEPT_CODE(String dEP_DEPT_CODE) {
		DEP_DEPT_CODE = dEP_DEPT_CODE;
	}

	public String getDEP_GROSS_NET_FLAG() {
		return DEP_GROSS_NET_FLAG;
	}

	public void setDEP_GROSS_NET_FLAG(String dEP_GROSS_NET_FLAG) {
		DEP_GROSS_NET_FLAG = dEP_GROSS_NET_FLAG;
	}

	public String getDEP_TEMP_RCPT_NO() {
		return DEP_TEMP_RCPT_NO;
	}

	public void setDEP_TEMP_RCPT_NO(String dEP_TEMP_RCPT_NO) {
		DEP_TEMP_RCPT_NO = dEP_TEMP_RCPT_NO;
	}

	public String getDEP_DS_CODE() {
		return DEP_DS_CODE;
	}

	public void setDEP_DS_CODE(String dEP_DS_CODE) {
		DEP_DS_CODE = dEP_DS_CODE;
	}

	public String getDEP_CLASS_CODE() {
		return DEP_CLASS_CODE;
	}

	public void setDEP_CLASS_CODE(String dEP_CLASS_CODE) {
		DEP_CLASS_CODE = dEP_CLASS_CODE;
	}

	public String getDEP_PLAN_CODE() {
		return DEP_PLAN_CODE;
	}

	public void setDEP_PLAN_CODE(String dEP_PLAN_CODE) {
		DEP_PLAN_CODE = dEP_PLAN_CODE;
	}

	public String getDEP_PROD_CODE() {
		return DEP_PROD_CODE;
	}

	public void setDEP_PROD_CODE(String dEP_PROD_CODE) {
		DEP_PROD_CODE = dEP_PROD_CODE;
	}

	public String getDEP_AGENT_CODE() {
		return DEP_AGENT_CODE;
	}

	public void setDEP_AGENT_CODE(String dEP_AGENT_CODE) {
		DEP_AGENT_CODE = dEP_AGENT_CODE;
	}

	public String getDEP_COLL_AGENT_CODE() {
		return DEP_COLL_AGENT_CODE;
	}

	public void setDEP_COLL_AGENT_CODE(String dEP_COLL_AGENT_CODE) {
		DEP_COLL_AGENT_CODE = dEP_COLL_AGENT_CODE;
	}

	public String getDEP_CONT_REF_ID1() {
		return DEP_CONT_REF_ID1;
	}

	public void setDEP_CONT_REF_ID1(String dEP_CONT_REF_ID1) {
		DEP_CONT_REF_ID1 = dEP_CONT_REF_ID1;
	}

	public String getDEP_CONT_REF_ID2() {
		return DEP_CONT_REF_ID2;
	}

	public void setDEP_CONT_REF_ID2(String dEP_CONT_REF_ID2) {
		DEP_CONT_REF_ID2 = dEP_CONT_REF_ID2;
	}

	public String getDEP_REC_REV_YN() {
		return DEP_REC_REV_YN;
	}

	public void setDEP_REC_REV_YN(String dEP_REC_REV_YN) {
		DEP_REC_REV_YN = dEP_REC_REV_YN;
	}

	public String getDEP_REASON_CODE() {
		return DEP_REASON_CODE;
	}

	public void setDEP_REASON_CODE(String dEP_REASON_CODE) {
		DEP_REASON_CODE = dEP_REASON_CODE;
	}

	public String getDEP_REV_REMARKS() {
		return DEP_REV_REMARKS;
	}

	public void setDEP_REV_REMARKS(String dEP_REV_REMARKS) {
		DEP_REV_REMARKS = dEP_REV_REMARKS;
	}

	public Integer getDEP_REV_ACNT_YEAR() {
		return DEP_REV_ACNT_YEAR;
	}

	public void setDEP_REV_ACNT_YEAR(Integer dEP_REV_ACNT_YEAR) {
		DEP_REV_ACNT_YEAR = dEP_REV_ACNT_YEAR;
	}

	public String getDEP_REV_CHRG_TXN_CODE() {
		return DEP_REV_CHRG_TXN_CODE;
	}

	public void setDEP_REV_CHRG_TXN_CODE(String dEP_REV_CHRG_TXN_CODE) {
		DEP_REV_CHRG_TXN_CODE = dEP_REV_CHRG_TXN_CODE;
	}

	public Long getDEP_REV_CHRG_DOC_NO() {
		return DEP_REV_CHRG_DOC_NO;
	}

	public void setDEP_REV_CHRG_DOC_NO(Long dEP_REV_CHRG_DOC_NO) {
		DEP_REV_CHRG_DOC_NO = dEP_REV_CHRG_DOC_NO;
	}

	public String getDEP_BANKIN_CODE() {
		return DEP_BANKIN_CODE;
	}

	public void setDEP_BANKIN_CODE(String dEP_BANKIN_CODE) {
		DEP_BANKIN_CODE = dEP_BANKIN_CODE;
	}

	public String getDEP_FLEX_01() {
		return DEP_FLEX_01;
	}

	public void setDEP_FLEX_01(String dEP_FLEX_01) {
		DEP_FLEX_01 = dEP_FLEX_01;
	}

	public String getDEP_FLEX_02() {
		return DEP_FLEX_02;
	}

	public void setDEP_FLEX_02(String dEP_FLEX_02) {
		DEP_FLEX_02 = dEP_FLEX_02;
	}

	public String getDEP_FLEX_03() {
		return DEP_FLEX_03;
	}

	public void setDEP_FLEX_03(String dEP_FLEX_03) {
		DEP_FLEX_03 = dEP_FLEX_03;
	}

	public String getDEP_FLEX_04() {
		return DEP_FLEX_04;
	}

	public void setDEP_FLEX_04(String dEP_FLEX_04) {
		DEP_FLEX_04 = dEP_FLEX_04;
	}

	public String getDEP_FLEX_05() {
		return DEP_FLEX_05;
	}

	public void setDEP_FLEX_05(String dEP_FLEX_05) {
		DEP_FLEX_05 = dEP_FLEX_05;
	}

	public String getDEP_FLEX_06() {
		return DEP_FLEX_06;
	}

	public void setDEP_FLEX_06(String dEP_FLEX_06) {
		DEP_FLEX_06 = dEP_FLEX_06;
	}

	public String getDEP_SRC_OF_BUS() {
		return DEP_SRC_OF_BUS;
	}

	public void setDEP_SRC_OF_BUS(String dEP_SRC_OF_BUS) {
		DEP_SRC_OF_BUS = dEP_SRC_OF_BUS;
	}

	public String getDEP_CHRG_TXN_CODE() {
		return DEP_CHRG_TXN_CODE;
	}

	public void setDEP_CHRG_TXN_CODE(String dEP_CHRG_TXN_CODE) {
		DEP_CHRG_TXN_CODE = dEP_CHRG_TXN_CODE;
	}

	public Long getDEP_CHRG_DOC_NO() {
		return DEP_CHRG_DOC_NO;
	}

	public void setDEP_CHRG_DOC_NO(Long dEP_CHRG_DOC_NO) {
		DEP_CHRG_DOC_NO = dEP_CHRG_DOC_NO;
	}

	public String getDEP_ADTH_BATCH_NO() {
		return DEP_ADTH_BATCH_NO;
	}

	public void setDEP_ADTH_BATCH_NO(String dEP_ADTH_BATCH_NO) {
		DEP_ADTH_BATCH_NO = dEP_ADTH_BATCH_NO;
	}

	public String getDEP_PDC_FLAG() {
		return DEP_PDC_FLAG;
	}

	public void setDEP_PDC_FLAG(String dEP_PDC_FLAG) {
		DEP_PDC_FLAG = dEP_PDC_FLAG;
	}

	public String getDEP_DUP_PRINT() {
		return DEP_DUP_PRINT;
	}

	public void setDEP_DUP_PRINT(String dEP_DUP_PRINT) {
		DEP_DUP_PRINT = dEP_DUP_PRINT;
	}

	public String getDEP_BANK_IN_SLIP_NO() {
		return DEP_BANK_IN_SLIP_NO;
	}

	public void setDEP_BANK_IN_SLIP_NO(String dEP_BANK_IN_SLIP_NO) {
		DEP_BANK_IN_SLIP_NO = dEP_BANK_IN_SLIP_NO;
	}

	public String getDEP_REP_BANK_IN_SLIP_NO() {
		return DEP_REP_BANK_IN_SLIP_NO;
	}

	public void setDEP_REP_BANK_IN_SLIP_NO(String dEP_REP_BANK_IN_SLIP_NO) {
		DEP_REP_BANK_IN_SLIP_NO = dEP_REP_BANK_IN_SLIP_NO;
	}

	public String getDEP_REV_BANK_IN_SLIP_NO() {
		return DEP_REV_BANK_IN_SLIP_NO;
	}

	public void setDEP_REV_BANK_IN_SLIP_NO(String dEP_REV_BANK_IN_SLIP_NO) {
		DEP_REV_BANK_IN_SLIP_NO = dEP_REV_BANK_IN_SLIP_NO;
	}

	public String getDEP_REPL_RCPT_YN() {
		return DEP_REPL_RCPT_YN;
	}

	public void setDEP_REPL_RCPT_YN(String dEP_REPL_RCPT_YN) {
		DEP_REPL_RCPT_YN = dEP_REPL_RCPT_YN;
	}

	public Long getDEP_REPL_DOC_NO() {
		return DEP_REPL_DOC_NO;
	}

	public void setDEP_REPL_DOC_NO(Long dEP_REPL_DOC_NO) {
		DEP_REPL_DOC_NO = dEP_REPL_DOC_NO;
	}

	public String getDEP_REPL_TXN_CODE() {
		return DEP_REPL_TXN_CODE;
	}

	public void setDEP_REPL_TXN_CODE(String dEP_REPL_TXN_CODE) {
		DEP_REPL_TXN_CODE = dEP_REPL_TXN_CODE;
	}

	public Integer getDEP_REPL_ACC_YR() {
		return DEP_REPL_ACC_YR;
	}

	public void setDEP_REPL_ACC_YR(Integer dEP_REPL_ACC_YR) {
		DEP_REPL_ACC_YR = dEP_REPL_ACC_YR;
	}

	public String getDEP_MAST_RCPT_YN() {
		return DEP_MAST_RCPT_YN;
	}

	public void setDEP_MAST_RCPT_YN(String dEP_MAST_RCPT_YN) {
		DEP_MAST_RCPT_YN = dEP_MAST_RCPT_YN;
	}

	public String getDEP_COMM_RECPT_YN() {
		return DEP_COMM_RECPT_YN;
	}

	public void setDEP_COMM_RECPT_YN(String dEP_COMM_RECPT_YN) {
		DEP_COMM_RECPT_YN = dEP_COMM_RECPT_YN;
	}

	public String getDEP_CREDIT_BUS_YN() {
		return DEP_CREDIT_BUS_YN;
	}

	public void setDEP_CREDIT_BUS_YN(String dEP_CREDIT_BUS_YN) {
		DEP_CREDIT_BUS_YN = dEP_CREDIT_BUS_YN;
	}

	public String getDEP_AMT_PAYOR_NAME() {
		return DEP_AMT_PAYOR_NAME;
	}

	public void setDEP_AMT_PAYOR_NAME(String dEP_AMT_PAYOR_NAME) {
		DEP_AMT_PAYOR_NAME = dEP_AMT_PAYOR_NAME;
	}

	public String getDEP_AMT_PAYOR_CONTACT() {
		return DEP_AMT_PAYOR_CONTACT;
	}

	public void setDEP_AMT_PAYOR_CONTACT(String dEP_AMT_PAYOR_CONTACT) {
		DEP_AMT_PAYOR_CONTACT = dEP_AMT_PAYOR_CONTACT;
	}

	public String getDEP_COMM_YN() {
		return DEP_COMM_YN;
	}

	public void setDEP_COMM_YN(String dEP_COMM_YN) {
		DEP_COMM_YN = dEP_COMM_YN;
	}

	public Date getDEP_PRE_REC_DT() {
		return DEP_PRE_REC_DT;
	}

	public void setDEP_PRE_REC_DT(Date dEP_PRE_REC_DT) {
		DEP_PRE_REC_DT = dEP_PRE_REC_DT;
	}

	public String getDEP_RCPT_PAYER() {
		return DEP_RCPT_PAYER;
	}

	public void setDEP_RCPT_PAYER(String dEP_RCPT_PAYER) {
		DEP_RCPT_PAYER = dEP_RCPT_PAYER;
	}

	public String getDEP_RCPT_PAYER_DESC() {
		return DEP_RCPT_PAYER_DESC;
	}

	public void setDEP_RCPT_PAYER_DESC(String dEP_RCPT_PAYER_DESC) {
		DEP_RCPT_PAYER_DESC = dEP_RCPT_PAYER_DESC;
	}

	public String getDEP_PREM_REMARKS() {
		return DEP_PREM_REMARKS;
	}

	public void setDEP_PREM_REMARKS(String dEP_PREM_REMARKS) {
		DEP_PREM_REMARKS = dEP_PREM_REMARKS;
	}
    
}

