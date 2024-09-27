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
@Table(name = "LT_SURR_MAT_VALUES")
public class LT_SURR_MAT_VALUES {

    @Id
    @SequenceGenerator(name = "SurrMatValuesSequence", sequenceName = "SMV_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SurrMatValuesSequence")
    @Column(name = "SMV_TRAN_ID")
    private Integer SMV_TRAN_ID;

    @Column(name = "SMV_POL_TRAN_ID")
    private Integer SMV_POL_TRAN_ID;

    @Column(name = "SMV_DATE")
    private Date SMV_DATE;

    @Column(name = "SMV_FC_RED_SA")
    private Double SMV_FC_RED_SA;

    @Column(name = "SMV_LC_RED_SA")
    private Double SMV_LC_RED_SA;

    @Column(name = "SMV_FC_ACC_PROFIT")
    private Double SMV_FC_ACC_PROFIT;

    @Column(name = "SMV_LC_ACC_PROFIT")
    private Double SMV_LC_ACC_PROFIT;

    @Column(name = "SMV_FC_GROSS_VALUE")
    private Double SMV_FC_GROSS_VALUE;

    @Column(name = "SMV_LC_GROSS_VALUE")
    private Double SMV_LC_GROSS_VALUE;

    @Column(name = "SMV_FC_UNPAID_PREM")
    private Double SMV_FC_UNPAID_PREM;

    @Column(name = "SMV_LC_UNPAID_PREM")
    private Double SMV_LC_UNPAID_PREM;

    @Column(name = "SMV_FC_BAL_LOAN")
    private Double SMV_FC_BAL_LOAN;

    @Column(name = "SMV_LC_BAL_LOAN")
    private Double SMV_LC_BAL_LOAN;

    @Column(name = "SMV_FC_LOAN_INT")
    private Double SMV_FC_LOAN_INT;

    @Column(name = "SMV_LC_LOAN_INT")
    private Double SMV_LC_LOAN_INT;

    @Column(name = "SMV_TYPE")
    private String SMV_TYPE;

    @Column(name = "SMV_DEL_FLAG")
    private String SMV_DEL_FLAG;

    @Column(name = "SMV_INS_DT")
    private Date SMV_INS_DT;

    @Column(name = "SMV_INS_ID")
    private String SMV_INS_ID;

    @Column(name = "SMV_MOD_DT")
    private Date SMV_MOD_DT;

    @Column(name = "SMV_MOD_ID")
    private String SMV_MOD_ID;

    @Column(name = "SMV_FC_NET_PAID_AMT")
    private Double SMV_FC_NET_PAID_AMT;

    @Column(name = "SMV_LC_NET_PAID_AMT")
    private Double SMV_LC_NET_PAID_AMT;

    @Column(name = "SMV_PAID_DT")
    private Date SMV_PAID_DT;

    @Column(name = "SMV_APPRV_FLAG")
    private String SMV_APPRV_FLAG;

    @Column(name = "SMV_UNPAID_PREM_YN")
    private String SMV_UNPAID_PREM_YN;

    @Column(name = "SMV_LOAN_INT_YN")
    private String SMV_LOAN_INT_YN;

    @Column(name = "SMV_CHARGE_CODE")
    private String SMV_CHARGE_CODE;

    @Column(name = "SMV_FC_CHARGE_AMT")
    private Double SMV_FC_CHARGE_AMT;

    @Column(name = "SMV_LC_CHARGE_AMT")
    private Double SMV_LC_CHARGE_AMT;

    @Column(name = "SMV_REF_NO")
    private String SMV_REF_NO;

    @Column(name = "SMV_UNPAID_PREM_INT_CODE")
    private String SMV_UNPAID_PREM_INT_CODE;

    @Column(name = "SMV_FC_UNPAID_PREM_INT")
    private Double SMV_FC_UNPAID_PREM_INT;

    @Column(name = "SMV_LC_UNPAID_PREM_INT")
    private Double SMV_LC_UNPAID_PREM_INT;

    @Column(name = "SMV_FC_OS_LOAN")
    private Double SMV_FC_OS_LOAN;

    @Column(name = "SMV_LC_OS_LOAN")
    private Double SMV_LC_OS_LOAN;

    @Column(name = "SMV_LOAN_CODE")
    private String SMV_LOAN_CODE;

    @Column(name = "SMV_RESERVE_FLAG")
    private String SMV_RESERVE_FLAG;

    @Column(name = "SMV_PREV_SCH_DATE")
    private Date SMV_PREV_SCH_DATE;

    @Column(name = "SMV_LETTER_DATE")
    private Date SMV_LETTER_DATE;

    @Column(name = "SMV_TRAN_DATE")
    private Date SMV_TRAN_DATE;

    @Column(name = "SMV_REASON_CODE")
    private String SMV_REASON_CODE;

    @Column(name = "SMV_REMARKS")
    private String SMV_REMARKS;

    @Column(name = "SMV_AMT1")
    private Double SMV_AMT1;

    @Column(name = "SMV_AMT2")
    private Double SMV_AMT2;

    @Column(name = "SMV_AMT3")
    private Double SMV_AMT3;

    @Column(name = "SMV_AMT4")
    private Double SMV_AMT4;

    @Column(name = "SMV_AMT5")
    private Double SMV_AMT5;

    @Column(name = "SMV_STATUS_CODE")
    private String SMV_STATUS_CODE;

    @Column(name = "SMV_APPRV_ID")
    private String SMV_APPRV_ID;

    @Column(name = "SMV_APPRV_DT")
    private Date SMV_APPRV_DT;

    @Column(name = "SMV_DOC_ID")
    private String SMV_DOC_ID;

    @Column(name = "SMV_PAYTO")
    private String SMV_PAYTO;

    @Column(name = "SMV_FLEX01")
    private String SMV_FLEX01;

    @Column(name = "SMV_FLEX02")
    private String SMV_FLEX02;

    @Column(name = "SMV_FLEX03")
    private String SMV_FLEX03;

    @Column(name = "SMV_FLEX04")
    private String SMV_FLEX04;

    @Column(name = "SMV_FLEX05")
    private String SMV_FLEX05;

    @Column(name = "SMV_FLEX06")
    private String SMV_FLEX06;

    @Column(name = "SMV_FLEX07")
    private String SMV_FLEX07;

    @Column(name = "SMV_FLEX08")
    private String SMV_FLEX08;

    @Column(name = "SMV_FLEX09")
    private String SMV_FLEX09;

    @Column(name = "SMV_FLEX10")
    private String SMV_FLEX10;

    @Column(name = "SMV_FLEX11")
    private String SMV_FLEX11;

    @Column(name = "SMV_FLEX12")
    private String SMV_FLEX12;

    @Column(name = "SMV_PAYEE_NAME")
    private String SMV_PAYEE_NAME;

    @Column(name = "SMV_DS_CODE")
    private String SMV_DS_CODE;

    @Column(name = "SMV_PAYNET_FILE_GEN_YN")
    private String SMV_PAYNET_FILE_GEN_YN;

    @Column(name = "SMV_INT_VALUE")
    private Double SMV_INT_VALUE;

	public Integer getSMV_TRAN_ID() {
		return SMV_TRAN_ID;
	}

	public void setSMV_TRAN_ID(Integer sMV_TRAN_ID) {
		SMV_TRAN_ID = sMV_TRAN_ID;
	}

	public Integer getSMV_POL_TRAN_ID() {
		return SMV_POL_TRAN_ID;
	}

	public void setSMV_POL_TRAN_ID(Integer sMV_POL_TRAN_ID) {
		SMV_POL_TRAN_ID = sMV_POL_TRAN_ID;
	}

	public Date getSMV_DATE() {
		return SMV_DATE;
	}

	public void setSMV_DATE(Date sMV_DATE) {
		SMV_DATE = sMV_DATE;
	}

	public Double getSMV_FC_RED_SA() {
		return SMV_FC_RED_SA;
	}

	public void setSMV_FC_RED_SA(Double sMV_FC_RED_SA) {
		SMV_FC_RED_SA = sMV_FC_RED_SA;
	}

	public Double getSMV_LC_RED_SA() {
		return SMV_LC_RED_SA;
	}

	public void setSMV_LC_RED_SA(Double sMV_LC_RED_SA) {
		SMV_LC_RED_SA = sMV_LC_RED_SA;
	}

	public Double getSMV_FC_ACC_PROFIT() {
		return SMV_FC_ACC_PROFIT;
	}

	public void setSMV_FC_ACC_PROFIT(Double sMV_FC_ACC_PROFIT) {
		SMV_FC_ACC_PROFIT = sMV_FC_ACC_PROFIT;
	}

	public Double getSMV_LC_ACC_PROFIT() {
		return SMV_LC_ACC_PROFIT;
	}

	public void setSMV_LC_ACC_PROFIT(Double sMV_LC_ACC_PROFIT) {
		SMV_LC_ACC_PROFIT = sMV_LC_ACC_PROFIT;
	}

	public Double getSMV_FC_GROSS_VALUE() {
		return SMV_FC_GROSS_VALUE;
	}

	public void setSMV_FC_GROSS_VALUE(Double sMV_FC_GROSS_VALUE) {
		SMV_FC_GROSS_VALUE = sMV_FC_GROSS_VALUE;
	}

	public Double getSMV_LC_GROSS_VALUE() {
		return SMV_LC_GROSS_VALUE;
	}

	public void setSMV_LC_GROSS_VALUE(Double sMV_LC_GROSS_VALUE) {
		SMV_LC_GROSS_VALUE = sMV_LC_GROSS_VALUE;
	}

	public Double getSMV_FC_UNPAID_PREM() {
		return SMV_FC_UNPAID_PREM;
	}

	public void setSMV_FC_UNPAID_PREM(Double sMV_FC_UNPAID_PREM) {
		SMV_FC_UNPAID_PREM = sMV_FC_UNPAID_PREM;
	}

	public Double getSMV_LC_UNPAID_PREM() {
		return SMV_LC_UNPAID_PREM;
	}

	public void setSMV_LC_UNPAID_PREM(Double sMV_LC_UNPAID_PREM) {
		SMV_LC_UNPAID_PREM = sMV_LC_UNPAID_PREM;
	}

	public Double getSMV_FC_BAL_LOAN() {
		return SMV_FC_BAL_LOAN;
	}

	public void setSMV_FC_BAL_LOAN(Double sMV_FC_BAL_LOAN) {
		SMV_FC_BAL_LOAN = sMV_FC_BAL_LOAN;
	}

	public Double getSMV_LC_BAL_LOAN() {
		return SMV_LC_BAL_LOAN;
	}

	public void setSMV_LC_BAL_LOAN(Double sMV_LC_BAL_LOAN) {
		SMV_LC_BAL_LOAN = sMV_LC_BAL_LOAN;
	}

	public Double getSMV_FC_LOAN_INT() {
		return SMV_FC_LOAN_INT;
	}

	public void setSMV_FC_LOAN_INT(Double sMV_FC_LOAN_INT) {
		SMV_FC_LOAN_INT = sMV_FC_LOAN_INT;
	}

	public Double getSMV_LC_LOAN_INT() {
		return SMV_LC_LOAN_INT;
	}

	public void setSMV_LC_LOAN_INT(Double sMV_LC_LOAN_INT) {
		SMV_LC_LOAN_INT = sMV_LC_LOAN_INT;
	}

	public String getSMV_TYPE() {
		return SMV_TYPE;
	}

	public void setSMV_TYPE(String sMV_TYPE) {
		SMV_TYPE = sMV_TYPE;
	}

	public String getSMV_DEL_FLAG() {
		return SMV_DEL_FLAG;
	}

	public void setSMV_DEL_FLAG(String sMV_DEL_FLAG) {
		SMV_DEL_FLAG = sMV_DEL_FLAG;
	}

	public Date getSMV_INS_DT() {
		return SMV_INS_DT;
	}

	public void setSMV_INS_DT(Date sMV_INS_DT) {
		SMV_INS_DT = sMV_INS_DT;
	}

	public String getSMV_INS_ID() {
		return SMV_INS_ID;
	}

	public void setSMV_INS_ID(String sMV_INS_ID) {
		SMV_INS_ID = sMV_INS_ID;
	}

	public Date getSMV_MOD_DT() {
		return SMV_MOD_DT;
	}

	public void setSMV_MOD_DT(Date sMV_MOD_DT) {
		SMV_MOD_DT = sMV_MOD_DT;
	}

	public String getSMV_MOD_ID() {
		return SMV_MOD_ID;
	}

	public void setSMV_MOD_ID(String sMV_MOD_ID) {
		SMV_MOD_ID = sMV_MOD_ID;
	}

	public Double getSMV_FC_NET_PAID_AMT() {
		return SMV_FC_NET_PAID_AMT;
	}

	public void setSMV_FC_NET_PAID_AMT(Double sMV_FC_NET_PAID_AMT) {
		SMV_FC_NET_PAID_AMT = sMV_FC_NET_PAID_AMT;
	}

	public Double getSMV_LC_NET_PAID_AMT() {
		return SMV_LC_NET_PAID_AMT;
	}

	public void setSMV_LC_NET_PAID_AMT(Double sMV_LC_NET_PAID_AMT) {
		SMV_LC_NET_PAID_AMT = sMV_LC_NET_PAID_AMT;
	}

	public Date getSMV_PAID_DT() {
		return SMV_PAID_DT;
	}

	public void setSMV_PAID_DT(Date sMV_PAID_DT) {
		SMV_PAID_DT = sMV_PAID_DT;
	}

	public String getSMV_APPRV_FLAG() {
		return SMV_APPRV_FLAG;
	}

	public void setSMV_APPRV_FLAG(String sMV_APPRV_FLAG) {
		SMV_APPRV_FLAG = sMV_APPRV_FLAG;
	}

	public String getSMV_UNPAID_PREM_YN() {
		return SMV_UNPAID_PREM_YN;
	}

	public void setSMV_UNPAID_PREM_YN(String sMV_UNPAID_PREM_YN) {
		SMV_UNPAID_PREM_YN = sMV_UNPAID_PREM_YN;
	}

	public String getSMV_LOAN_INT_YN() {
		return SMV_LOAN_INT_YN;
	}

	public void setSMV_LOAN_INT_YN(String sMV_LOAN_INT_YN) {
		SMV_LOAN_INT_YN = sMV_LOAN_INT_YN;
	}

	public String getSMV_CHARGE_CODE() {
		return SMV_CHARGE_CODE;
	}

	public void setSMV_CHARGE_CODE(String sMV_CHARGE_CODE) {
		SMV_CHARGE_CODE = sMV_CHARGE_CODE;
	}

	public Double getSMV_FC_CHARGE_AMT() {
		return SMV_FC_CHARGE_AMT;
	}

	public void setSMV_FC_CHARGE_AMT(Double sMV_FC_CHARGE_AMT) {
		SMV_FC_CHARGE_AMT = sMV_FC_CHARGE_AMT;
	}

	public Double getSMV_LC_CHARGE_AMT() {
		return SMV_LC_CHARGE_AMT;
	}

	public void setSMV_LC_CHARGE_AMT(Double sMV_LC_CHARGE_AMT) {
		SMV_LC_CHARGE_AMT = sMV_LC_CHARGE_AMT;
	}

	public String getSMV_REF_NO() {
		return SMV_REF_NO;
	}

	public void setSMV_REF_NO(String sMV_REF_NO) {
		SMV_REF_NO = sMV_REF_NO;
	}

	public String getSMV_UNPAID_PREM_INT_CODE() {
		return SMV_UNPAID_PREM_INT_CODE;
	}

	public void setSMV_UNPAID_PREM_INT_CODE(String sMV_UNPAID_PREM_INT_CODE) {
		SMV_UNPAID_PREM_INT_CODE = sMV_UNPAID_PREM_INT_CODE;
	}

	public Double getSMV_FC_UNPAID_PREM_INT() {
		return SMV_FC_UNPAID_PREM_INT;
	}

	public void setSMV_FC_UNPAID_PREM_INT(Double sMV_FC_UNPAID_PREM_INT) {
		SMV_FC_UNPAID_PREM_INT = sMV_FC_UNPAID_PREM_INT;
	}

	public Double getSMV_LC_UNPAID_PREM_INT() {
		return SMV_LC_UNPAID_PREM_INT;
	}

	public void setSMV_LC_UNPAID_PREM_INT(Double sMV_LC_UNPAID_PREM_INT) {
		SMV_LC_UNPAID_PREM_INT = sMV_LC_UNPAID_PREM_INT;
	}

	public Double getSMV_FC_OS_LOAN() {
		return SMV_FC_OS_LOAN;
	}

	public void setSMV_FC_OS_LOAN(Double sMV_FC_OS_LOAN) {
		SMV_FC_OS_LOAN = sMV_FC_OS_LOAN;
	}

	public Double getSMV_LC_OS_LOAN() {
		return SMV_LC_OS_LOAN;
	}

	public void setSMV_LC_OS_LOAN(Double sMV_LC_OS_LOAN) {
		SMV_LC_OS_LOAN = sMV_LC_OS_LOAN;
	}

	public String getSMV_LOAN_CODE() {
		return SMV_LOAN_CODE;
	}

	public void setSMV_LOAN_CODE(String sMV_LOAN_CODE) {
		SMV_LOAN_CODE = sMV_LOAN_CODE;
	}

	public String getSMV_RESERVE_FLAG() {
		return SMV_RESERVE_FLAG;
	}

	public void setSMV_RESERVE_FLAG(String sMV_RESERVE_FLAG) {
		SMV_RESERVE_FLAG = sMV_RESERVE_FLAG;
	}

	public Date getSMV_PREV_SCH_DATE() {
		return SMV_PREV_SCH_DATE;
	}

	public void setSMV_PREV_SCH_DATE(Date sMV_PREV_SCH_DATE) {
		SMV_PREV_SCH_DATE = sMV_PREV_SCH_DATE;
	}

	public Date getSMV_LETTER_DATE() {
		return SMV_LETTER_DATE;
	}

	public void setSMV_LETTER_DATE(Date sMV_LETTER_DATE) {
		SMV_LETTER_DATE = sMV_LETTER_DATE;
	}

	public Date getSMV_TRAN_DATE() {
		return SMV_TRAN_DATE;
	}

	public void setSMV_TRAN_DATE(Date sMV_TRAN_DATE) {
		SMV_TRAN_DATE = sMV_TRAN_DATE;
	}

	public String getSMV_REASON_CODE() {
		return SMV_REASON_CODE;
	}

	public void setSMV_REASON_CODE(String sMV_REASON_CODE) {
		SMV_REASON_CODE = sMV_REASON_CODE;
	}

	public String getSMV_REMARKS() {
		return SMV_REMARKS;
	}

	public void setSMV_REMARKS(String sMV_REMARKS) {
		SMV_REMARKS = sMV_REMARKS;
	}

	public Double getSMV_AMT1() {
		return SMV_AMT1;
	}

	public void setSMV_AMT1(Double sMV_AMT1) {
		SMV_AMT1 = sMV_AMT1;
	}

	public Double getSMV_AMT2() {
		return SMV_AMT2;
	}

	public void setSMV_AMT2(Double sMV_AMT2) {
		SMV_AMT2 = sMV_AMT2;
	}

	public Double getSMV_AMT3() {
		return SMV_AMT3;
	}

	public void setSMV_AMT3(Double sMV_AMT3) {
		SMV_AMT3 = sMV_AMT3;
	}

	public Double getSMV_AMT4() {
		return SMV_AMT4;
	}

	public void setSMV_AMT4(Double sMV_AMT4) {
		SMV_AMT4 = sMV_AMT4;
	}

	public Double getSMV_AMT5() {
		return SMV_AMT5;
	}

	public void setSMV_AMT5(Double sMV_AMT5) {
		SMV_AMT5 = sMV_AMT5;
	}

	public String getSMV_STATUS_CODE() {
		return SMV_STATUS_CODE;
	}

	public void setSMV_STATUS_CODE(String sMV_STATUS_CODE) {
		SMV_STATUS_CODE = sMV_STATUS_CODE;
	}

	public String getSMV_APPRV_ID() {
		return SMV_APPRV_ID;
	}

	public void setSMV_APPRV_ID(String sMV_APPRV_ID) {
		SMV_APPRV_ID = sMV_APPRV_ID;
	}

	public Date getSMV_APPRV_DT() {
		return SMV_APPRV_DT;
	}

	public void setSMV_APPRV_DT(Date sMV_APPRV_DT) {
		SMV_APPRV_DT = sMV_APPRV_DT;
	}

	public String getSMV_DOC_ID() {
		return SMV_DOC_ID;
	}

	public void setSMV_DOC_ID(String sMV_DOC_ID) {
		SMV_DOC_ID = sMV_DOC_ID;
	}

	public String getSMV_PAYTO() {
		return SMV_PAYTO;
	}

	public void setSMV_PAYTO(String sMV_PAYTO) {
		SMV_PAYTO = sMV_PAYTO;
	}

	public String getSMV_FLEX01() {
		return SMV_FLEX01;
	}

	public void setSMV_FLEX01(String sMV_FLEX01) {
		SMV_FLEX01 = sMV_FLEX01;
	}

	public String getSMV_FLEX02() {
		return SMV_FLEX02;
	}

	public void setSMV_FLEX02(String sMV_FLEX02) {
		SMV_FLEX02 = sMV_FLEX02;
	}

	public String getSMV_FLEX03() {
		return SMV_FLEX03;
	}

	public void setSMV_FLEX03(String sMV_FLEX03) {
		SMV_FLEX03 = sMV_FLEX03;
	}

	public String getSMV_FLEX04() {
		return SMV_FLEX04;
	}

	public void setSMV_FLEX04(String sMV_FLEX04) {
		SMV_FLEX04 = sMV_FLEX04;
	}

	public String getSMV_FLEX05() {
		return SMV_FLEX05;
	}

	public void setSMV_FLEX05(String sMV_FLEX05) {
		SMV_FLEX05 = sMV_FLEX05;
	}

	public String getSMV_FLEX06() {
		return SMV_FLEX06;
	}

	public void setSMV_FLEX06(String sMV_FLEX06) {
		SMV_FLEX06 = sMV_FLEX06;
	}

	public String getSMV_FLEX07() {
		return SMV_FLEX07;
	}

	public void setSMV_FLEX07(String sMV_FLEX07) {
		SMV_FLEX07 = sMV_FLEX07;
	}

	public String getSMV_FLEX08() {
		return SMV_FLEX08;
	}

	public void setSMV_FLEX08(String sMV_FLEX08) {
		SMV_FLEX08 = sMV_FLEX08;
	}

	public String getSMV_FLEX09() {
		return SMV_FLEX09;
	}

	public void setSMV_FLEX09(String sMV_FLEX09) {
		SMV_FLEX09 = sMV_FLEX09;
	}

	public String getSMV_FLEX10() {
		return SMV_FLEX10;
	}

	public void setSMV_FLEX10(String sMV_FLEX10) {
		SMV_FLEX10 = sMV_FLEX10;
	}

	public String getSMV_FLEX11() {
		return SMV_FLEX11;
	}

	public void setSMV_FLEX11(String sMV_FLEX11) {
		SMV_FLEX11 = sMV_FLEX11;
	}

	public String getSMV_FLEX12() {
		return SMV_FLEX12;
	}

	public void setSMV_FLEX12(String sMV_FLEX12) {
		SMV_FLEX12 = sMV_FLEX12;
	}

	public String getSMV_PAYEE_NAME() {
		return SMV_PAYEE_NAME;
	}

	public void setSMV_PAYEE_NAME(String sMV_PAYEE_NAME) {
		SMV_PAYEE_NAME = sMV_PAYEE_NAME;
	}

	public String getSMV_DS_CODE() {
		return SMV_DS_CODE;
	}

	public void setSMV_DS_CODE(String sMV_DS_CODE) {
		SMV_DS_CODE = sMV_DS_CODE;
	}

	public String getSMV_PAYNET_FILE_GEN_YN() {
		return SMV_PAYNET_FILE_GEN_YN;
	}

	public void setSMV_PAYNET_FILE_GEN_YN(String sMV_PAYNET_FILE_GEN_YN) {
		SMV_PAYNET_FILE_GEN_YN = sMV_PAYNET_FILE_GEN_YN;
	}

	public Double getSMV_INT_VALUE() {
		return SMV_INT_VALUE;
	}

	public void setSMV_INT_VALUE(Double sMV_INT_VALUE) {
		SMV_INT_VALUE = sMV_INT_VALUE;
	}

}
