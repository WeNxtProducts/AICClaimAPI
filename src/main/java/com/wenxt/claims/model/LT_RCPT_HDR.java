package com.wenxt.claims.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "LT_RCPT_HDR", schema = "LIFE_DEV")
public class LT_RCPT_HDR { 
	
	@Id
    @SequenceGenerator(name = "ReceiptHeaderTranIdSeq", sequenceName = "RH_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ReceiptHeaderTranIdSeq")
    @Column(name = "RH_TRAN_ID")
    private Integer RH_TRAN_ID;

    @Column(name = "RH_DRCR_TXN_CODE")
    private String RH_DRCR_TXN_CODE;

    @Column(name = "RH_DRCR_DOC_NO")
    private Long RH_DRCR_DOC_NO;

    @Column(name = "RH_DRCR_DOC_DT")
    @Temporal(TemporalType.DATE)
    private Date RH_DRCR_DOC_DT;

    @Column(name = "RH_POL_TRAN_ID")
    private Long RH_POL_TRAN_ID;

    @Column(name = "RH_END_NO_IDX")
    private Long RH_END_NO_IDX;

    @Column(name = "RH_POL_NO")
    private String RH_POL_NO;

    @Column(name = "RH_END_NO")
    private String RH_END_NO;

    @Column(name = "RH_DOC_TYPE")
    private String RH_DOC_TYPE;

    @Column(name = "RH_CUST_CODE")
    private String RH_CUST_CODE;

    @Column(name = "RH_CURR_CODE")
    private String RH_CURR_CODE;

    @Column(name = "RH_FC_AMT")
    private Double RH_FC_AMT;

    @Column(name = "RH_LC_AMT")
    private Double RH_LC_AMT;

    @Column(name = "RH_TXN_DT")
    @Temporal(TemporalType.DATE)
    private Date RH_TXN_DT;

    @Column(name = "RH_APPRV_STATUS")
    private String RH_APPRV_STATUS;

    @Column(name = "RH_APPRV_DT")
    @Temporal(TemporalType.DATE)
    private Date RH_APPRV_DT;

    @Column(name = "RH_APPRV_UID")
    private String RH_APPRV_UID;

    @Column(name = "RH_INS_DT")
    @Temporal(TemporalType.DATE)
    private Date RH_INS_DT;

    @Column(name = "RH_INS_ID")
    private String RH_INS_ID;

    @Column(name = "RH_MOD_DT")
    @Temporal(TemporalType.DATE)
    private Date RH_MOD_DT;

    @Column(name = "RH_MOD_ID")
    private String RH_MOD_ID;

    @Column(name = "RH_BRK_CODE")
    private String RH_BRK_CODE;

    @Column(name = "RH_DRCR_TXN_TYPE")
    private String RH_DRCR_TXN_TYPE;

    @Column(name = "RH_DRCR_ACNT_YEAR")
    private Integer RH_DRCR_ACNT_YEAR;

    @Column(name = "RH_REV_YN")
    private String RH_REV_YN;

    @Column(name = "RH_PDC_YN")
    private String RH_PDC_YN;

    @Column(name = "RH_REV_TXN_CODE")
    private String RH_REV_TXN_CODE;

    @Column(name = "RH_REV_DOC_NO")
    private Long RH_REV_DOC_NO;

    @Column(name = "RH_REV_DOC_DT")
    @Temporal(TemporalType.DATE)
    private Date RH_REV_DOC_DT;

    @Column(name = "RH_REV_ACNT_YR")
    private Integer RH_REV_ACNT_YR;

    @Column(name = "RH_FLEX_01")
    private String RH_FLEX_01;

    @Column(name = "RH_FLEX_02")
    private String RH_FLEX_02;

    @Column(name = "RH_FLEX_03")
    private String RH_FLEX_03;

    @Column(name = "RH_FLEX_04")
    private String RH_FLEX_04;

    @Column(name = "RH_FLEX_05")
    private String RH_FLEX_05;

    @Column(name = "RH_BATCH_NO")
    private String RH_BATCH_NO;

    @Column(name = "RH_BH_SYS_ID")
    private Long RH_BH_SYS_ID;

    @Column(name = "RH_BILL_NO")
    private String RH_BILL_NO;

    @Column(name = "RH_MAST_POL_NO")
    private String RH_MAST_POL_NO;

    @Column(name = "RH_REMARKS")
    private String RH_REMARKS;

    @Column(name = "RH_PROPOSAL_TRAN_ID")
    private Long RH_PROPOSAL_TRAN_ID;

    @Column(name = "RH_PROPOSAL_NO")
    private String RH_PROPOSAL_NO;

    @Column(name = "RH_BANK_IN_SLIP_NO")
    private String RH_BANK_IN_SLIP_NO;

    @Column(name = "RH_REP_RCPT_REF_NO")
    private String RH_REP_RCPT_REF_NO;

    @Column(name = "RH_REV_BANK_IN_SLIP_NO")
    private String RH_REV_BANK_IN_SLIP_NO;

    @Column(name = "RH_REV_REASON_CODE")
    private String RH_REV_REASON_CODE;

    @Column(name = "RH_EXCS_AVLB_AMT")
    private Double RH_EXCS_AVLB_AMT;

    @Column(name = "RH_REPL_RCPT_YN")
    private String RH_REPL_RCPT_YN;

    @Column(name = "RH_REPL_TXN_CODE")
    private String RH_REPL_TXN_CODE;

    @Column(name = "RH_REPL_DOC_NO")
    private Long RH_REPL_DOC_NO;

    @Column(name = "RH_REPL_ACC_YR")
    private Integer RH_REPL_ACC_YR;

    @Column(name = "RH_COMM_RECPT_YN")
    private String RH_COMM_RECPT_YN;
    
    @Column(name = "RH_RCPT_BAS")
    private String RH_RCPT_BAS;
    
    @Column(name = "RH_BATCH_LC_AMT")
    private Double RH_BATCH_LC_AMT;

	public Integer getRH_TRAN_ID() {
		return RH_TRAN_ID;
	}

	public void setRH_TRAN_ID(Integer rH_TRAN_ID) {
		RH_TRAN_ID = rH_TRAN_ID;
	}

	public String getRH_DRCR_TXN_CODE() {
		return RH_DRCR_TXN_CODE;
	}

	public void setRH_DRCR_TXN_CODE(String rH_DRCR_TXN_CODE) {
		RH_DRCR_TXN_CODE = rH_DRCR_TXN_CODE;
	}

	public Long getRH_DRCR_DOC_NO() {
		return RH_DRCR_DOC_NO;
	}

	public void setRH_DRCR_DOC_NO(Long rH_DRCR_DOC_NO) {
		RH_DRCR_DOC_NO = rH_DRCR_DOC_NO;
	}

	public Date getRH_DRCR_DOC_DT() {
		return RH_DRCR_DOC_DT;
	}

	public void setRH_DRCR_DOC_DT(Date rH_DRCR_DOC_DT) {
		RH_DRCR_DOC_DT = rH_DRCR_DOC_DT;
	}

	public Long getRH_POL_TRAN_ID() {
		return RH_POL_TRAN_ID;
	}

	public void setRH_POL_TRAN_ID(Long rH_POL_TRAN_ID) {
		RH_POL_TRAN_ID = rH_POL_TRAN_ID;
	}

	public Long getRH_END_NO_IDX() {
		return RH_END_NO_IDX;
	}

	public void setRH_END_NO_IDX(Long rH_END_NO_IDX) {
		RH_END_NO_IDX = rH_END_NO_IDX;
	}

	public String getRH_POL_NO() {
		return RH_POL_NO;
	}

	public void setRH_POL_NO(String rH_POL_NO) {
		RH_POL_NO = rH_POL_NO;
	}

	public String getRH_END_NO() {
		return RH_END_NO;
	}

	public void setRH_END_NO(String rH_END_NO) {
		RH_END_NO = rH_END_NO;
	}

	public String getRH_DOC_TYPE() {
		return RH_DOC_TYPE;
	}

	public void setRH_DOC_TYPE(String rH_DOC_TYPE) {
		RH_DOC_TYPE = rH_DOC_TYPE;
	}

	public String getRH_CUST_CODE() {
		return RH_CUST_CODE;
	}

	public void setRH_CUST_CODE(String rH_CUST_CODE) {
		RH_CUST_CODE = rH_CUST_CODE;
	}

	public String getRH_CURR_CODE() {
		return RH_CURR_CODE;
	}

	public void setRH_CURR_CODE(String rH_CURR_CODE) {
		RH_CURR_CODE = rH_CURR_CODE;
	}

	public Double getRH_FC_AMT() {
		return RH_FC_AMT;
	}

	public void setRH_FC_AMT(Double rH_FC_AMT) {
		RH_FC_AMT = rH_FC_AMT;
	}

	public Double getRH_LC_AMT() {
		return RH_LC_AMT;
	}

	public void setRH_LC_AMT(Double rH_LC_AMT) {
		RH_LC_AMT = rH_LC_AMT;
	}

	public Date getRH_TXN_DT() {
		return RH_TXN_DT;
	}

	public void setRH_TXN_DT(Date rH_TXN_DT) {
		RH_TXN_DT = rH_TXN_DT;
	}

	public String getRH_APPRV_STATUS() {
		return RH_APPRV_STATUS;
	}

	public void setRH_APPRV_STATUS(String rH_APPRV_STATUS) {
		RH_APPRV_STATUS = rH_APPRV_STATUS;
	}

	public Date getRH_APPRV_DT() {
		return RH_APPRV_DT;
	}

	public void setRH_APPRV_DT(Date rH_APPRV_DT) {
		RH_APPRV_DT = rH_APPRV_DT;
	}

	public String getRH_APPRV_UID() {
		return RH_APPRV_UID;
	}

	public void setRH_APPRV_UID(String rH_APPRV_UID) {
		RH_APPRV_UID = rH_APPRV_UID;
	}

	public Date getRH_INS_DT() {
		return RH_INS_DT;
	}

	public void setRH_INS_DT(Date rH_INS_DT) {
		RH_INS_DT = rH_INS_DT;
	}

	public String getRH_INS_ID() {
		return RH_INS_ID;
	}

	public void setRH_INS_ID(String rH_INS_ID) {
		RH_INS_ID = rH_INS_ID;
	}

	public Date getRH_MOD_DT() {
		return RH_MOD_DT;
	}

	public void setRH_MOD_DT(Date rH_MOD_DT) {
		RH_MOD_DT = rH_MOD_DT;
	}

	public String getRH_MOD_ID() {
		return RH_MOD_ID;
	}

	public void setRH_MOD_ID(String rH_MOD_ID) {
		RH_MOD_ID = rH_MOD_ID;
	}

	public String getRH_BRK_CODE() {
		return RH_BRK_CODE;
	}

	public void setRH_BRK_CODE(String rH_BRK_CODE) {
		RH_BRK_CODE = rH_BRK_CODE;
	}

	public String getRH_DRCR_TXN_TYPE() {
		return RH_DRCR_TXN_TYPE;
	}

	public void setRH_DRCR_TXN_TYPE(String rH_DRCR_TXN_TYPE) {
		RH_DRCR_TXN_TYPE = rH_DRCR_TXN_TYPE;
	}

	public Integer getRH_DRCR_ACNT_YEAR() {
		return RH_DRCR_ACNT_YEAR;
	}

	public void setRH_DRCR_ACNT_YEAR(Integer rH_DRCR_ACNT_YEAR) {
		RH_DRCR_ACNT_YEAR = rH_DRCR_ACNT_YEAR;
	}

	public String getRH_REV_YN() {
		return RH_REV_YN;
	}

	public void setRH_REV_YN(String rH_REV_YN) {
		RH_REV_YN = rH_REV_YN;
	}

	public String getRH_PDC_YN() {
		return RH_PDC_YN;
	}

	public void setRH_PDC_YN(String rH_PDC_YN) {
		RH_PDC_YN = rH_PDC_YN;
	}

	public String getRH_REV_TXN_CODE() {
		return RH_REV_TXN_CODE;
	}

	public void setRH_REV_TXN_CODE(String rH_REV_TXN_CODE) {
		RH_REV_TXN_CODE = rH_REV_TXN_CODE;
	}

	public Long getRH_REV_DOC_NO() {
		return RH_REV_DOC_NO;
	}

	public void setRH_REV_DOC_NO(Long rH_REV_DOC_NO) {
		RH_REV_DOC_NO = rH_REV_DOC_NO;
	}

	public Date getRH_REV_DOC_DT() {
		return RH_REV_DOC_DT;
	}

	public void setRH_REV_DOC_DT(Date rH_REV_DOC_DT) {
		RH_REV_DOC_DT = rH_REV_DOC_DT;
	}

	public Integer getRH_REV_ACNT_YR() {
		return RH_REV_ACNT_YR;
	}

	public void setRH_REV_ACNT_YR(Integer rH_REV_ACNT_YR) {
		RH_REV_ACNT_YR = rH_REV_ACNT_YR;
	}

	public String getRH_FLEX_01() {
		return RH_FLEX_01;
	}

	public void setRH_FLEX_01(String rH_FLEX_01) {
		RH_FLEX_01 = rH_FLEX_01;
	}

	public String getRH_FLEX_02() {
		return RH_FLEX_02;
	}

	public void setRH_FLEX_02(String rH_FLEX_02) {
		RH_FLEX_02 = rH_FLEX_02;
	}

	public String getRH_FLEX_03() {
		return RH_FLEX_03;
	}

	public void setRH_FLEX_03(String rH_FLEX_03) {
		RH_FLEX_03 = rH_FLEX_03;
	}

	public String getRH_FLEX_04() {
		return RH_FLEX_04;
	}

	public void setRH_FLEX_04(String rH_FLEX_04) {
		RH_FLEX_04 = rH_FLEX_04;
	}

	public String getRH_FLEX_05() {
		return RH_FLEX_05;
	}

	public void setRH_FLEX_05(String rH_FLEX_05) {
		RH_FLEX_05 = rH_FLEX_05;
	}

	public String getRH_BATCH_NO() {
		return RH_BATCH_NO;
	}

	public void setRH_BATCH_NO(String rH_BATCH_NO) {
		RH_BATCH_NO = rH_BATCH_NO;
	}

	public Long getRH_BH_SYS_ID() {
		return RH_BH_SYS_ID;
	}

	public void setRH_BH_SYS_ID(Long rH_BH_SYS_ID) {
		RH_BH_SYS_ID = rH_BH_SYS_ID;
	}

	public String getRH_BILL_NO() {
		return RH_BILL_NO;
	}

	public void setRH_BILL_NO(String rH_BILL_NO) {
		RH_BILL_NO = rH_BILL_NO;
	}

	public String getRH_MAST_POL_NO() {
		return RH_MAST_POL_NO;
	}

	public void setRH_MAST_POL_NO(String rH_MAST_POL_NO) {
		RH_MAST_POL_NO = rH_MAST_POL_NO;
	}

	public String getRH_REMARKS() {
		return RH_REMARKS;
	}

	public void setRH_REMARKS(String rH_REMARKS) {
		RH_REMARKS = rH_REMARKS;
	}

	public Long getRH_PROPOSAL_TRAN_ID() {
		return RH_PROPOSAL_TRAN_ID;
	}

	public void setRH_PROPOSAL_TRAN_ID(Long rH_PROPOSAL_TRAN_ID) {
		RH_PROPOSAL_TRAN_ID = rH_PROPOSAL_TRAN_ID;
	}

	public String getRH_PROPOSAL_NO() {
		return RH_PROPOSAL_NO;
	}

	public void setRH_PROPOSAL_NO(String rH_PROPOSAL_NO) {
		RH_PROPOSAL_NO = rH_PROPOSAL_NO;
	}

	public String getRH_BANK_IN_SLIP_NO() {
		return RH_BANK_IN_SLIP_NO;
	}

	public void setRH_BANK_IN_SLIP_NO(String rH_BANK_IN_SLIP_NO) {
		RH_BANK_IN_SLIP_NO = rH_BANK_IN_SLIP_NO;
	}

	public String getRH_REP_RCPT_REF_NO() {
		return RH_REP_RCPT_REF_NO;
	}

	public void setRH_REP_RCPT_REF_NO(String rH_REP_RCPT_REF_NO) {
		RH_REP_RCPT_REF_NO = rH_REP_RCPT_REF_NO;
	}

	public String getRH_REV_BANK_IN_SLIP_NO() {
		return RH_REV_BANK_IN_SLIP_NO;
	}

	public void setRH_REV_BANK_IN_SLIP_NO(String rH_REV_BANK_IN_SLIP_NO) {
		RH_REV_BANK_IN_SLIP_NO = rH_REV_BANK_IN_SLIP_NO;
	}

	public String getRH_REV_REASON_CODE() {
		return RH_REV_REASON_CODE;
	}

	public void setRH_REV_REASON_CODE(String rH_REV_REASON_CODE) {
		RH_REV_REASON_CODE = rH_REV_REASON_CODE;
	}

	public Double getRH_EXCS_AVLB_AMT() {
		return RH_EXCS_AVLB_AMT;
	}

	public void setRH_EXCS_AVLB_AMT(Double rH_EXCS_AVLB_AMT) {
		RH_EXCS_AVLB_AMT = rH_EXCS_AVLB_AMT;
	}

	public String getRH_REPL_RCPT_YN() {
		return RH_REPL_RCPT_YN;
	}

	public void setRH_REPL_RCPT_YN(String rH_REPL_RCPT_YN) {
		RH_REPL_RCPT_YN = rH_REPL_RCPT_YN;
	}

	public String getRH_REPL_TXN_CODE() {
		return RH_REPL_TXN_CODE;
	}

	public void setRH_REPL_TXN_CODE(String rH_REPL_TXN_CODE) {
		RH_REPL_TXN_CODE = rH_REPL_TXN_CODE;
	}

	public Long getRH_REPL_DOC_NO() {
		return RH_REPL_DOC_NO;
	}

	public void setRH_REPL_DOC_NO(Long rH_REPL_DOC_NO) {
		RH_REPL_DOC_NO = rH_REPL_DOC_NO;
	}

	public Integer getRH_REPL_ACC_YR() {
		return RH_REPL_ACC_YR;
	}

	public void setRH_REPL_ACC_YR(Integer rH_REPL_ACC_YR) {
		RH_REPL_ACC_YR = rH_REPL_ACC_YR;
	}

	public String getRH_COMM_RECPT_YN() {
		return RH_COMM_RECPT_YN;
	}

	public void setRH_COMM_RECPT_YN(String rH_COMM_RECPT_YN) {
		RH_COMM_RECPT_YN = rH_COMM_RECPT_YN;
	}

	public String getRH_RCPT_BAS() {
		return RH_RCPT_BAS;
	}

	public void setRH_RCPT_BAS(String rH_RCPT_BAS) {
		RH_RCPT_BAS = rH_RCPT_BAS;
	}

	public Double getRH_BATCH_LC_AMT() {
		return RH_BATCH_LC_AMT;
	}

	public void setRH_BATCH_LC_AMT(Double rH_BATCH_LC_AMT) {
		RH_BATCH_LC_AMT = rH_BATCH_LC_AMT;
	}
	
}

