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
@Table(name = "LT_LOAN")
public class LT_LOAN {

    @Id
    @SequenceGenerator(name = "loanTranIdSequence", sequenceName = "LOAN_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "loanTranIdSequence")
    @Column(name = "LOAN_TRAN_ID")
    private Integer LOAN_TRAN_ID;

    @Column(name = "LOAN_POL_NO")
    private String LOAN_POL_NO;

    @Column(name = "LOAN_POL_TRAN_ID")
    private Long LOAN_POL_TRAN_ID;

    @Column(name = "LOAN_DT")
    private Date LOAN_DT;

    @Column(name = "LOAN_CURR_CODE")
    private String LOAN_CURR_CODE;

    @Column(name = "LOAN_EXCH_RATE")
    private Double LOAN_EXCH_RATE;

    @Column(name = "LOAN_REF_NO")
    private String LOAN_REF_NO;

    @Column(name = "LOAN_LC_AMOUNT")
    private Double LOAN_LC_AMOUNT;

    @Column(name = "LOAN_FC_AMOUNT")
    private Double LOAN_FC_AMOUNT;

    @Column(name = "LOAN_LC_REPAID_AMT")
    private Double LOAN_LC_REPAID_AMT;

    @Column(name = "LOAN_FC_REPAID_AMT")
    private Double LOAN_FC_REPAID_AMT;

    @Column(name = "LOAN_INT_RATE")
    private Double LOAN_INT_RATE;

    @Column(name = "LOAN_FC_UNPAID_PREM")
    private Double LOAN_FC_UNPAID_PREM;

    @Column(name = "LOAN_LC_UNPAID_PREM")
    private Double LOAN_LC_UNPAID_PREM;

    @Column(name = "LOAN_FC_INTEREST")
    private Double LOAN_FC_INTEREST;

    @Column(name = "LOAN_LC_INTEREST")
    private Double LOAN_LC_INTEREST;

    @Column(name = "LOAN_FC_OS_AMOUNT")
    private Double LOAN_FC_OS_AMOUNT;

    @Column(name = "LOAN_LC_OS_AMOUNT")
    private Double LOAN_LC_OS_AMOUNT;

    @Column(name = "LOAN_FC_NET_AMOUNT")
    private Double LOAN_FC_NET_AMOUNT;

    @Column(name = "LOAN_LC_NET_AMOUNT")
    private Double LOAN_LC_NET_AMOUNT;

    @Column(name = "LOAN_STATUS")
    private String LOAN_STATUS;

    @Column(name = "LOAN_INS_DT")
    private Date LOAN_INS_DT;

    @Column(name = "LOAN_INS_ID")
    private String LOAN_INS_ID;

    @Column(name = "LOAN_MOD_DT")
    private Date LOAN_MOD_DT;

    @Column(name = "LOAN_MOD_ID")
    private String LOAN_MOD_ID;

    @Column(name = "LOAN_UNPAID_PREM_INT_CODE")
    private String LOAN_UNPAID_PREM_INT_CODE;

    @Column(name = "LOAN_FC_UNPAID_PREM_INT")
    private Double LOAN_FC_UNPAID_PREM_INT;

    @Column(name = "LOAN_LC_UNPAID_PREM_INT")
    private Double LOAN_LC_UNPAID_PREM_INT;

    @Column(name = "LOAN_FLAG")
    private String LOAN_FLAG;

    @Column(name = "LOAN_FC_PERM_AMT")
    private Double LOAN_FC_PERM_AMT;

    @Column(name = "LOAN_LC_PERM_AMT")
    private Double LOAN_LC_PERM_AMT;

    @Column(name = "LOAN_CODE")
    private String LOAN_CODE;

    @Column(name = "LOAN_SURR_PERC")
    private Double LOAN_SURR_PERC;

    @Column(name = "LOAN_REPAY_FREQ")
    private String LOAN_REPAY_FREQ;

    @Column(name = "LOAN_FC_REPAY_AMT")
    private Double LOAN_FC_REPAY_AMT;

    @Column(name = "LOAN_LC_REPAY_AMT")
    private Double LOAN_LC_REPAY_AMT;

    @Column(name = "LOAN_DUE_DT")
    private Date LOAN_DUE_DT;

    @Column(name = "LOAN_FC_OS_LOAN_INT")
    private Double LOAN_FC_OS_LOAN_INT;

    @Column(name = "LOAN_LC_OS_LOAN_INT")
    private Double LOAN_LC_OS_LOAN_INT;

    @Column(name = "LOAN_INT_RATE_PER")
    private Long LOAN_INT_RATE_PER;

    @Column(name = "LOAN_EMI_FC_AMT")
    private Double LOAN_EMI_FC_AMT;

    @Column(name = "LOAN_EMI_LC_AMT")
    private Double LOAN_EMI_LC_AMT;

    @Column(name = "LOAN_FREQ_TYPE")
    private String LOAN_FREQ_TYPE;

    @Column(name = "LOAN_TERM")
    private Long LOAN_TERM;

    @Column(name = "LOAN_APPRV_DT")
    private Date LOAN_APPRV_DT;

    @Column(name = "LOAN_FLEX_01")
    private String LOAN_FLEX_01;

    @Column(name = "LOAN_FLEX_02")
    private String LOAN_FLEX_02;

    @Column(name = "LOAN_FLEX_03")
    private String LOAN_FLEX_03;

    @Column(name = "LOAN_FLEX_04")
    private String LOAN_FLEX_04;

    @Column(name = "LOAN_FLEX_05")
    private String LOAN_FLEX_05;

    @Column(name = "LOAN_FLEX_06")
    private String LOAN_FLEX_06;

    @Column(name = "LOAN_FLEX_07")
    private String LOAN_FLEX_07;

    @Column(name = "LOAN_FLEX_08")
    private String LOAN_FLEX_08;

    @Column(name = "LOAN_FLEX_09")
    private String LOAN_FLEX_09;

    @Column(name = "LOAN_FLEX_10")
    private String LOAN_FLEX_10;

    @Column(name = "LOAN_FLEX_11")
    private String LOAN_FLEX_11;

    @Column(name = "LOAN_FLEX_12")
    private String LOAN_FLEX_12;

    @Column(name = "LOAN_FLEX_13")
    private String LOAN_FLEX_13;

    @Column(name = "LOAN_FLEX_14")
    private String LOAN_FLEX_14;

    @Column(name = "LOAN_FLEX_15")
    private String LOAN_FLEX_15;

    @Column(name = "LOAN_FLEX_16")
    private String LOAN_FLEX_16;

    @Column(name = "LOAN_FLEX_17")
    private String LOAN_FLEX_17;

    @Column(name = "LOAN_FLEX_18")
    private String LOAN_FLEX_18;

    @Column(name = "LOAN_FLEX_19")
    private String LOAN_FLEX_19;

    @Column(name = "LOAN_FLEX_20")
    private String LOAN_FLEX_20;

    @Column(name = "LOAN_FLEX_21")
    private String LOAN_FLEX_21;

    @Column(name = "LOAN_FLEX_22")
    private String LOAN_FLEX_22;

    @Column(name = "LOAN_FLEX_23")
    private String LOAN_FLEX_23;

    @Column(name = "LOAN_FLEX_24")
    private String LOAN_FLEX_24;

    @Column(name = "LOAN_FLEX_25")
    private String LOAN_FLEX_25;

    @Column(name = "LOAN_FLEX_26")
    private String LOAN_FLEX_26;

    @Column(name = "LOAN_FLEX_27")
    private String LOAN_FLEX_27;

    @Column(name = "LOAN_FLEX_28")
    private String LOAN_FLEX_28;

    @Column(name = "LOAN_FLEX_29")
    private String LOAN_FLEX_29;

    @Column(name = "LOAN_FLEX_30")
    private String LOAN_FLEX_30;

	public Integer getLOAN_TRAN_ID() {
		return LOAN_TRAN_ID;
	}

	public void setLOAN_TRAN_ID(Integer lOAN_TRAN_ID) {
		LOAN_TRAN_ID = lOAN_TRAN_ID;
	}

	public String getLOAN_POL_NO() {
		return LOAN_POL_NO;
	}

	public void setLOAN_POL_NO(String lOAN_POL_NO) {
		LOAN_POL_NO = lOAN_POL_NO;
	}

	public Long getLOAN_POL_TRAN_ID() {
		return LOAN_POL_TRAN_ID;
	}

	public void setLOAN_POL_TRAN_ID(Long lOAN_POL_TRAN_ID) {
		LOAN_POL_TRAN_ID = lOAN_POL_TRAN_ID;
	}

	public Date getLOAN_DT() {
		return LOAN_DT;
	}

	public void setLOAN_DT(Date lOAN_DT) {
		LOAN_DT = lOAN_DT;
	}

	public String getLOAN_CURR_CODE() {
		return LOAN_CURR_CODE;
	}

	public void setLOAN_CURR_CODE(String lOAN_CURR_CODE) {
		LOAN_CURR_CODE = lOAN_CURR_CODE;
	}

	public Double getLOAN_EXCH_RATE() {
		return LOAN_EXCH_RATE;
	}

	public void setLOAN_EXCH_RATE(Double lOAN_EXCH_RATE) {
		LOAN_EXCH_RATE = lOAN_EXCH_RATE;
	}

	public String getLOAN_REF_NO() {
		return LOAN_REF_NO;
	}

	public void setLOAN_REF_NO(String lOAN_REF_NO) {
		LOAN_REF_NO = lOAN_REF_NO;
	}

	public Double getLOAN_LC_AMOUNT() {
		return LOAN_LC_AMOUNT;
	}

	public void setLOAN_LC_AMOUNT(Double lOAN_LC_AMOUNT) {
		LOAN_LC_AMOUNT = lOAN_LC_AMOUNT;
	}

	public Double getLOAN_FC_AMOUNT() {
		return LOAN_FC_AMOUNT;
	}

	public void setLOAN_FC_AMOUNT(Double lOAN_FC_AMOUNT) {
		LOAN_FC_AMOUNT = lOAN_FC_AMOUNT;
	}

	public Double getLOAN_LC_REPAID_AMT() {
		return LOAN_LC_REPAID_AMT;
	}

	public void setLOAN_LC_REPAID_AMT(Double lOAN_LC_REPAID_AMT) {
		LOAN_LC_REPAID_AMT = lOAN_LC_REPAID_AMT;
	}

	public Double getLOAN_FC_REPAID_AMT() {
		return LOAN_FC_REPAID_AMT;
	}

	public void setLOAN_FC_REPAID_AMT(Double lOAN_FC_REPAID_AMT) {
		LOAN_FC_REPAID_AMT = lOAN_FC_REPAID_AMT;
	}

	public Double getLOAN_INT_RATE() {
		return LOAN_INT_RATE;
	}

	public void setLOAN_INT_RATE(Double lOAN_INT_RATE) {
		LOAN_INT_RATE = lOAN_INT_RATE;
	}

	public Double getLOAN_FC_UNPAID_PREM() {
		return LOAN_FC_UNPAID_PREM;
	}

	public void setLOAN_FC_UNPAID_PREM(Double lOAN_FC_UNPAID_PREM) {
		LOAN_FC_UNPAID_PREM = lOAN_FC_UNPAID_PREM;
	}

	public Double getLOAN_LC_UNPAID_PREM() {
		return LOAN_LC_UNPAID_PREM;
	}

	public void setLOAN_LC_UNPAID_PREM(Double lOAN_LC_UNPAID_PREM) {
		LOAN_LC_UNPAID_PREM = lOAN_LC_UNPAID_PREM;
	}

	public Double getLOAN_FC_INTEREST() {
		return LOAN_FC_INTEREST;
	}

	public void setLOAN_FC_INTEREST(Double lOAN_FC_INTEREST) {
		LOAN_FC_INTEREST = lOAN_FC_INTEREST;
	}

	public Double getLOAN_LC_INTEREST() {
		return LOAN_LC_INTEREST;
	}

	public void setLOAN_LC_INTEREST(Double lOAN_LC_INTEREST) {
		LOAN_LC_INTEREST = lOAN_LC_INTEREST;
	}

	public Double getLOAN_FC_OS_AMOUNT() {
		return LOAN_FC_OS_AMOUNT;
	}

	public void setLOAN_FC_OS_AMOUNT(Double lOAN_FC_OS_AMOUNT) {
		LOAN_FC_OS_AMOUNT = lOAN_FC_OS_AMOUNT;
	}

	public Double getLOAN_LC_OS_AMOUNT() {
		return LOAN_LC_OS_AMOUNT;
	}

	public void setLOAN_LC_OS_AMOUNT(Double lOAN_LC_OS_AMOUNT) {
		LOAN_LC_OS_AMOUNT = lOAN_LC_OS_AMOUNT;
	}

	public Double getLOAN_FC_NET_AMOUNT() {
		return LOAN_FC_NET_AMOUNT;
	}

	public void setLOAN_FC_NET_AMOUNT(Double lOAN_FC_NET_AMOUNT) {
		LOAN_FC_NET_AMOUNT = lOAN_FC_NET_AMOUNT;
	}

	public Double getLOAN_LC_NET_AMOUNT() {
		return LOAN_LC_NET_AMOUNT;
	}

	public void setLOAN_LC_NET_AMOUNT(Double lOAN_LC_NET_AMOUNT) {
		LOAN_LC_NET_AMOUNT = lOAN_LC_NET_AMOUNT;
	}

	public String getLOAN_STATUS() {
		return LOAN_STATUS;
	}

	public void setLOAN_STATUS(String lOAN_STATUS) {
		LOAN_STATUS = lOAN_STATUS;
	}

	public Date getLOAN_INS_DT() {
		return LOAN_INS_DT;
	}

	public void setLOAN_INS_DT(Date lOAN_INS_DT) {
		LOAN_INS_DT = lOAN_INS_DT;
	}

	public String getLOAN_INS_ID() {
		return LOAN_INS_ID;
	}

	public void setLOAN_INS_ID(String lOAN_INS_ID) {
		LOAN_INS_ID = lOAN_INS_ID;
	}

	public Date getLOAN_MOD_DT() {
		return LOAN_MOD_DT;
	}

	public void setLOAN_MOD_DT(Date lOAN_MOD_DT) {
		LOAN_MOD_DT = lOAN_MOD_DT;
	}

	public String getLOAN_MOD_ID() {
		return LOAN_MOD_ID;
	}

	public void setLOAN_MOD_ID(String lOAN_MOD_ID) {
		LOAN_MOD_ID = lOAN_MOD_ID;
	}

	public String getLOAN_UNPAID_PREM_INT_CODE() {
		return LOAN_UNPAID_PREM_INT_CODE;
	}

	public void setLOAN_UNPAID_PREM_INT_CODE(String lOAN_UNPAID_PREM_INT_CODE) {
		LOAN_UNPAID_PREM_INT_CODE = lOAN_UNPAID_PREM_INT_CODE;
	}

	public Double getLOAN_FC_UNPAID_PREM_INT() {
		return LOAN_FC_UNPAID_PREM_INT;
	}

	public void setLOAN_FC_UNPAID_PREM_INT(Double lOAN_FC_UNPAID_PREM_INT) {
		LOAN_FC_UNPAID_PREM_INT = lOAN_FC_UNPAID_PREM_INT;
	}

	public Double getLOAN_LC_UNPAID_PREM_INT() {
		return LOAN_LC_UNPAID_PREM_INT;
	}

	public void setLOAN_LC_UNPAID_PREM_INT(Double lOAN_LC_UNPAID_PREM_INT) {
		LOAN_LC_UNPAID_PREM_INT = lOAN_LC_UNPAID_PREM_INT;
	}

	public String getLOAN_FLAG() {
		return LOAN_FLAG;
	}

	public void setLOAN_FLAG(String lOAN_FLAG) {
		LOAN_FLAG = lOAN_FLAG;
	}

	public Double getLOAN_FC_PERM_AMT() {
		return LOAN_FC_PERM_AMT;
	}

	public void setLOAN_FC_PERM_AMT(Double lOAN_FC_PERM_AMT) {
		LOAN_FC_PERM_AMT = lOAN_FC_PERM_AMT;
	}

	public Double getLOAN_LC_PERM_AMT() {
		return LOAN_LC_PERM_AMT;
	}

	public void setLOAN_LC_PERM_AMT(Double lOAN_LC_PERM_AMT) {
		LOAN_LC_PERM_AMT = lOAN_LC_PERM_AMT;
	}

	public String getLOAN_CODE() {
		return LOAN_CODE;
	}

	public void setLOAN_CODE(String lOAN_CODE) {
		LOAN_CODE = lOAN_CODE;
	}

	public Double getLOAN_SURR_PERC() {
		return LOAN_SURR_PERC;
	}

	public void setLOAN_SURR_PERC(Double lOAN_SURR_PERC) {
		LOAN_SURR_PERC = lOAN_SURR_PERC;
	}

	public String getLOAN_REPAY_FREQ() {
		return LOAN_REPAY_FREQ;
	}

	public void setLOAN_REPAY_FREQ(String lOAN_REPAY_FREQ) {
		LOAN_REPAY_FREQ = lOAN_REPAY_FREQ;
	}

	public Double getLOAN_FC_REPAY_AMT() {
		return LOAN_FC_REPAY_AMT;
	}

	public void setLOAN_FC_REPAY_AMT(Double lOAN_FC_REPAY_AMT) {
		LOAN_FC_REPAY_AMT = lOAN_FC_REPAY_AMT;
	}

	public Double getLOAN_LC_REPAY_AMT() {
		return LOAN_LC_REPAY_AMT;
	}

	public void setLOAN_LC_REPAY_AMT(Double lOAN_LC_REPAY_AMT) {
		LOAN_LC_REPAY_AMT = lOAN_LC_REPAY_AMT;
	}

	public Date getLOAN_DUE_DT() {
		return LOAN_DUE_DT;
	}

	public void setLOAN_DUE_DT(Date lOAN_DUE_DT) {
		LOAN_DUE_DT = lOAN_DUE_DT;
	}

	public Double getLOAN_FC_OS_LOAN_INT() {
		return LOAN_FC_OS_LOAN_INT;
	}

	public void setLOAN_FC_OS_LOAN_INT(Double lOAN_FC_OS_LOAN_INT) {
		LOAN_FC_OS_LOAN_INT = lOAN_FC_OS_LOAN_INT;
	}

	public Double getLOAN_LC_OS_LOAN_INT() {
		return LOAN_LC_OS_LOAN_INT;
	}

	public void setLOAN_LC_OS_LOAN_INT(Double lOAN_LC_OS_LOAN_INT) {
		LOAN_LC_OS_LOAN_INT = lOAN_LC_OS_LOAN_INT;
	}

	public Long getLOAN_INT_RATE_PER() {
		return LOAN_INT_RATE_PER;
	}

	public void setLOAN_INT_RATE_PER(Long lOAN_INT_RATE_PER) {
		LOAN_INT_RATE_PER = lOAN_INT_RATE_PER;
	}

	public Double getLOAN_EMI_FC_AMT() {
		return LOAN_EMI_FC_AMT;
	}

	public void setLOAN_EMI_FC_AMT(Double lOAN_EMI_FC_AMT) {
		LOAN_EMI_FC_AMT = lOAN_EMI_FC_AMT;
	}

	public Double getLOAN_EMI_LC_AMT() {
		return LOAN_EMI_LC_AMT;
	}

	public void setLOAN_EMI_LC_AMT(Double lOAN_EMI_LC_AMT) {
		LOAN_EMI_LC_AMT = lOAN_EMI_LC_AMT;
	}

	public String getLOAN_FREQ_TYPE() {
		return LOAN_FREQ_TYPE;
	}

	public void setLOAN_FREQ_TYPE(String lOAN_FREQ_TYPE) {
		LOAN_FREQ_TYPE = lOAN_FREQ_TYPE;
	}

	public Long getLOAN_TERM() {
		return LOAN_TERM;
	}

	public void setLOAN_TERM(Long lOAN_TERM) {
		LOAN_TERM = lOAN_TERM;
	}

	public Date getLOAN_APPRV_DT() {
		return LOAN_APPRV_DT;
	}

	public void setLOAN_APPRV_DT(Date lOAN_APPRV_DT) {
		LOAN_APPRV_DT = lOAN_APPRV_DT;
	}

	public String getLOAN_FLEX_01() {
		return LOAN_FLEX_01;
	}

	public void setLOAN_FLEX_01(String lOAN_FLEX_01) {
		LOAN_FLEX_01 = lOAN_FLEX_01;
	}

	public String getLOAN_FLEX_02() {
		return LOAN_FLEX_02;
	}

	public void setLOAN_FLEX_02(String lOAN_FLEX_02) {
		LOAN_FLEX_02 = lOAN_FLEX_02;
	}

	public String getLOAN_FLEX_03() {
		return LOAN_FLEX_03;
	}

	public void setLOAN_FLEX_03(String lOAN_FLEX_03) {
		LOAN_FLEX_03 = lOAN_FLEX_03;
	}

	public String getLOAN_FLEX_04() {
		return LOAN_FLEX_04;
	}

	public void setLOAN_FLEX_04(String lOAN_FLEX_04) {
		LOAN_FLEX_04 = lOAN_FLEX_04;
	}

	public String getLOAN_FLEX_05() {
		return LOAN_FLEX_05;
	}

	public void setLOAN_FLEX_05(String lOAN_FLEX_05) {
		LOAN_FLEX_05 = lOAN_FLEX_05;
	}

	public String getLOAN_FLEX_06() {
		return LOAN_FLEX_06;
	}

	public void setLOAN_FLEX_06(String lOAN_FLEX_06) {
		LOAN_FLEX_06 = lOAN_FLEX_06;
	}

	public String getLOAN_FLEX_07() {
		return LOAN_FLEX_07;
	}

	public void setLOAN_FLEX_07(String lOAN_FLEX_07) {
		LOAN_FLEX_07 = lOAN_FLEX_07;
	}

	public String getLOAN_FLEX_08() {
		return LOAN_FLEX_08;
	}

	public void setLOAN_FLEX_08(String lOAN_FLEX_08) {
		LOAN_FLEX_08 = lOAN_FLEX_08;
	}

	public String getLOAN_FLEX_09() {
		return LOAN_FLEX_09;
	}

	public void setLOAN_FLEX_09(String lOAN_FLEX_09) {
		LOAN_FLEX_09 = lOAN_FLEX_09;
	}

	public String getLOAN_FLEX_10() {
		return LOAN_FLEX_10;
	}

	public void setLOAN_FLEX_10(String lOAN_FLEX_10) {
		LOAN_FLEX_10 = lOAN_FLEX_10;
	}

	public String getLOAN_FLEX_11() {
		return LOAN_FLEX_11;
	}

	public void setLOAN_FLEX_11(String lOAN_FLEX_11) {
		LOAN_FLEX_11 = lOAN_FLEX_11;
	}

	public String getLOAN_FLEX_12() {
		return LOAN_FLEX_12;
	}

	public void setLOAN_FLEX_12(String lOAN_FLEX_12) {
		LOAN_FLEX_12 = lOAN_FLEX_12;
	}

	public String getLOAN_FLEX_13() {
		return LOAN_FLEX_13;
	}

	public void setLOAN_FLEX_13(String lOAN_FLEX_13) {
		LOAN_FLEX_13 = lOAN_FLEX_13;
	}

	public String getLOAN_FLEX_14() {
		return LOAN_FLEX_14;
	}

	public void setLOAN_FLEX_14(String lOAN_FLEX_14) {
		LOAN_FLEX_14 = lOAN_FLEX_14;
	}

	public String getLOAN_FLEX_15() {
		return LOAN_FLEX_15;
	}

	public void setLOAN_FLEX_15(String lOAN_FLEX_15) {
		LOAN_FLEX_15 = lOAN_FLEX_15;
	}

	public String getLOAN_FLEX_16() {
		return LOAN_FLEX_16;
	}

	public void setLOAN_FLEX_16(String lOAN_FLEX_16) {
		LOAN_FLEX_16 = lOAN_FLEX_16;
	}

	public String getLOAN_FLEX_17() {
		return LOAN_FLEX_17;
	}

	public void setLOAN_FLEX_17(String lOAN_FLEX_17) {
		LOAN_FLEX_17 = lOAN_FLEX_17;
	}

	public String getLOAN_FLEX_18() {
		return LOAN_FLEX_18;
	}

	public void setLOAN_FLEX_18(String lOAN_FLEX_18) {
		LOAN_FLEX_18 = lOAN_FLEX_18;
	}

	public String getLOAN_FLEX_19() {
		return LOAN_FLEX_19;
	}

	public void setLOAN_FLEX_19(String lOAN_FLEX_19) {
		LOAN_FLEX_19 = lOAN_FLEX_19;
	}

	public String getLOAN_FLEX_20() {
		return LOAN_FLEX_20;
	}

	public void setLOAN_FLEX_20(String lOAN_FLEX_20) {
		LOAN_FLEX_20 = lOAN_FLEX_20;
	}

	public String getLOAN_FLEX_21() {
		return LOAN_FLEX_21;
	}

	public void setLOAN_FLEX_21(String lOAN_FLEX_21) {
		LOAN_FLEX_21 = lOAN_FLEX_21;
	}

	public String getLOAN_FLEX_22() {
		return LOAN_FLEX_22;
	}

	public void setLOAN_FLEX_22(String lOAN_FLEX_22) {
		LOAN_FLEX_22 = lOAN_FLEX_22;
	}

	public String getLOAN_FLEX_23() {
		return LOAN_FLEX_23;
	}

	public void setLOAN_FLEX_23(String lOAN_FLEX_23) {
		LOAN_FLEX_23 = lOAN_FLEX_23;
	}

	public String getLOAN_FLEX_24() {
		return LOAN_FLEX_24;
	}

	public void setLOAN_FLEX_24(String lOAN_FLEX_24) {
		LOAN_FLEX_24 = lOAN_FLEX_24;
	}

	public String getLOAN_FLEX_25() {
		return LOAN_FLEX_25;
	}

	public void setLOAN_FLEX_25(String lOAN_FLEX_25) {
		LOAN_FLEX_25 = lOAN_FLEX_25;
	}

	public String getLOAN_FLEX_26() {
		return LOAN_FLEX_26;
	}

	public void setLOAN_FLEX_26(String lOAN_FLEX_26) {
		LOAN_FLEX_26 = lOAN_FLEX_26;
	}

	public String getLOAN_FLEX_27() {
		return LOAN_FLEX_27;
	}

	public void setLOAN_FLEX_27(String lOAN_FLEX_27) {
		LOAN_FLEX_27 = lOAN_FLEX_27;
	}

	public String getLOAN_FLEX_28() {
		return LOAN_FLEX_28;
	}

	public void setLOAN_FLEX_28(String lOAN_FLEX_28) {
		LOAN_FLEX_28 = lOAN_FLEX_28;
	}

	public String getLOAN_FLEX_29() {
		return LOAN_FLEX_29;
	}

	public void setLOAN_FLEX_29(String lOAN_FLEX_29) {
		LOAN_FLEX_29 = lOAN_FLEX_29;
	}

	public String getLOAN_FLEX_30() {
		return LOAN_FLEX_30;
	}

	public void setLOAN_FLEX_30(String lOAN_FLEX_30) {
		LOAN_FLEX_30 = lOAN_FLEX_30;
	}

}
