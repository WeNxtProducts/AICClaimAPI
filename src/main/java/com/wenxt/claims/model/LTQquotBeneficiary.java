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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "LT_QQUOT_BENEFICIARY")
@Data
public class LTQquotBeneficiary {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quote_seq")
    @SequenceGenerator(name = "quote_seq", sequenceName = "QUOTE_SEQ", allocationSize = 1)
    @Column(name = "QBEN_TRAN_ID", nullable = false)
    private Long QBEN_TRAN_ID;

    @Column(name = "QBEN_QUOT_TRAN_ID", nullable = false)
    private Long QBEN_QUOT_TRAN_ID;

    @Column(name = "QBEN_SR_NO")
    private Integer QBEN_SR_NO;

    @Column(name = "QBEN_BNF_TYPE", length = 1)
    private String QBEN_BNF_TYPE;

    @Column(name = "QBEN_BNF_NAME", length = 240)
    private String QBEN_BNF_NAME;

    @Column(name = "QBEN_PERC", precision = 5, scale = 2)
    private BigDecimal QBEN_PERC;

    @Column(name = "QBEN_RELATION_CODE", length = 12)
    private String QBEN_RELATION_CODE;

    @Column(name = "QBEN_ADDRESS_1", length = 60)
    private String QBEN_ADDRESS_1;

    @Column(name = "QBEN_ADDRESS_2", length = 60)
    private String QBEN_ADDRESS_2;

    @Column(name = "QBEN_ADDRESS_3", length = 60)
    private String QBEN_ADDRESS_3;

    @Column(name = "QBEN_ADDRESS_4", length = 60)
    private String QBEN_ADDRESS_4;

    @Column(name = "QBEN_ADDRESS_5", length = 60)
    private String QBEN_ADDRESS_5;

    @Column(name = "QBEN_BANK_CODE", length = 12)
    private String QBEN_BANK_CODE;

    @Column(name = "QBEN_BRANCH_NAME", length = 240)
    private String QBEN_BRANCH_NAME;

    @Column(name = "QBEN_DIVN_CODE", length = 60)
    private String QBEN_DIVN_CODE;

    @Column(name = "QBEN_ACNT_NO", precision = 20, scale = 0)
    private BigDecimal QBEN_ACNT_NO;

    @Column(name = "QBEN_BNF_CODE", length = 12)
    private String QBEN_BNF_CODE;

    @Column(name = "QBEN_BNF_ACNT_NAME", length = 240)
    private String QBEN_BNF_ACNT_NAME;

    @Column(name = "QBEN_BNF_TITLE", length = 30)
    private String QBEN_BNF_TITLE;

    @Column(name = "QBEN_BNF_SURNAME", length = 40)
    private String QBEN_BNF_SURNAME;

    @Column(name = "QBEN_BNF_OCC_CODE", length = 12)
    private String QBEN_BNF_OCC_CODE;

    @Column(name = "QBEN_BNF_MOB_NO", length = 60)
    private String QBEN_BNF_MOB_NO;

    @Column(name = "QBEN_DOB")
    @Temporal(TemporalType.DATE)
    private Date QBEN_DOB;

    @Column(name = "QBEN_INS_ID", length = 12)
    private String QBEN_INS_ID;

    @Column(name = "QBEN_INS_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date QBEN_INS_DT;

    @Column(name = "QBEN_MOD_ID", length = 12)
    private String QBEN_MOD_ID;

    @Column(name = "QBEN_MOD_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date QBEN_MOD_DT;

    @Column(name = "QBEN_CATG_CODE", length = 12)
    private String QBEN_CATG_CODE;

    @Column(name = "QBEN_AGE")
    private Integer QBEN_AGE;

    @Column(name = "QBEN_GUARDIAN_NAME", length = 60)
    private String QBEN_GUARDIAN_NAME;

    @Column(name = "QBEN_DEL_FLAG", length = 1)
    private String QBEN_DEL_FLAG;

    @Column(name = "QBEN_REF_ID1", length = 60)
    private String QBEN_REF_ID1;

    @Column(name = "QBEN_REF_ID2", length = 60)
    private String QBEN_REF_ID2;

    // Flex Fields
    @Column(name = "QBEN_FLEX_01", length = 240)
    private String QBEN_FLEX_01;
    
    @Column(name = "QBEN_FLEX_02", length = 240)
    private String QBEN_FLEX_02;
    
    @Column(name = "QBEN_FLEX_03", length = 240)
    private String QBEN_FLEX_03;
    
    @Column(name = "QBEN_FLEX_04", length = 240)
    private String QBEN_FLEX_04;
    
    @Column(name = "QBEN_FLEX_05", length = 240)
    private String QBEN_FLEX_05;
    
    @Column(name = "QBEN_FLEX_06", length = 240)
    private String QBEN_FLEX_06;
    
    @Column(name = "QBEN_FLEX_07", length = 240)
    private String QBEN_FLEX_07;
    
    @Column(name = "QBEN_FLEX_08", length = 240)
    private String QBEN_FLEX_08;
    
    @Column(name = "QBEN_FLEX_09", length = 240)
    private String QBEN_FLEX_09;
    
    @Column(name = "QBEN_FLEX_10", length = 240)
    private String QBEN_FLEX_10;
    
    @Column(name = "QBEN_FLEX_11", length = 240)
    private String QBEN_FLEX_11;
    
    @Column(name = "QBEN_FLEX_12", length = 240)
    private String QBEN_FLEX_12;
    
    @Column(name = "QBEN_FLEX_13", length = 240)
    private String QBEN_FLEX_13;
    
    @Column(name = "QBEN_FLEX_14", length = 240)
    private String QBEN_FLEX_14;
    
    @Column(name = "QBEN_FLEX_15", length = 240)
    private String QBEN_FLEX_15;
    
    @Column(name = "QBEN_FLEX_16", length = 240)
    private String QBEN_FLEX_16;
    
    @Column(name = "QBEN_FLEX_17", length = 240)
    private String QBEN_FLEX_17;
    
    @Column(name = "QBEN_FLEX_18", length = 240)
    private String QBEN_FLEX_18;
    
    @Column(name = "QBEN_FLEX_19", length = 240)
    private String QBEN_FLEX_19;
    
    @Column(name = "QBEN_FLEX_20", length = 240)
    private String QBEN_FLEX_20;
    
    @Column(name = "QBEN_FLEX_21", length = 240)
    private String QBEN_FLEX_21;
    
    @Column(name = "QBEN_FLEX_22", length = 240)
    private String QBEN_FLEX_22;
    
    @Column(name = "QBEN_FLEX_23", length = 240)
    private String QBEN_FLEX_23;
    
    @Column(name = "QBEN_FLEX_24", length = 240)
    private String QBEN_FLEX_24;
    
    @Column(name = "QBEN_FLEX_25", length = 240)
    private String QBEN_FLEX_25;
    
    @Column(name = "QBEN_FLEX_26", length = 240)
    private String QBEN_FLEX_26;
    
    @Column(name = "QBEN_FLEX_27", length = 240)
    private String QBEN_FLEX_27;
    
    @Column(name = "QBEN_FLEX_28", length = 240)
    private String QBEN_FLEX_28;
    
    @Column(name = "QBEN_FLEX_29", length = 240)
    private String QBEN_FLEX_29;
    
    @Column(name = "QBEN_FLEX_30", length = 240)
    private String QBEN_FLEX_30;

	public Long getQBEN_TRAN_ID() {
		return QBEN_TRAN_ID;
	}

	public void setQBEN_TRAN_ID(Long qBEN_TRAN_ID) {
		QBEN_TRAN_ID = qBEN_TRAN_ID;
	}

	public Long getQBEN_QUOT_TRAN_ID() {
		return QBEN_QUOT_TRAN_ID;
	}

	public void setQBEN_QUOT_TRAN_ID(Long qBEN_QUOT_TRAN_ID) {
		QBEN_QUOT_TRAN_ID = qBEN_QUOT_TRAN_ID;
	}

	public Integer getQBEN_SR_NO() {
		return QBEN_SR_NO;
	}

	public void setQBEN_SR_NO(Integer qBEN_SR_NO) {
		QBEN_SR_NO = qBEN_SR_NO;
	}

	public String getQBEN_BNF_TYPE() {
		return QBEN_BNF_TYPE;
	}

	public void setQBEN_BNF_TYPE(String qBEN_BNF_TYPE) {
		QBEN_BNF_TYPE = qBEN_BNF_TYPE;
	}

	public String getQBEN_BNF_NAME() {
		return QBEN_BNF_NAME;
	}

	public void setQBEN_BNF_NAME(String qBEN_BNF_NAME) {
		QBEN_BNF_NAME = qBEN_BNF_NAME;
	}

	public BigDecimal getQBEN_PERC() {
		return QBEN_PERC;
	}

	public void setQBEN_PERC(BigDecimal qBEN_PERC) {
		QBEN_PERC = qBEN_PERC;
	}

	public String getQBEN_RELATION_CODE() {
		return QBEN_RELATION_CODE;
	}

	public void setQBEN_RELATION_CODE(String qBEN_RELATION_CODE) {
		QBEN_RELATION_CODE = qBEN_RELATION_CODE;
	}

	public String getQBEN_ADDRESS_1() {
		return QBEN_ADDRESS_1;
	}

	public void setQBEN_ADDRESS_1(String qBEN_ADDRESS_1) {
		QBEN_ADDRESS_1 = qBEN_ADDRESS_1;
	}

	public String getQBEN_ADDRESS_2() {
		return QBEN_ADDRESS_2;
	}

	public void setQBEN_ADDRESS_2(String qBEN_ADDRESS_2) {
		QBEN_ADDRESS_2 = qBEN_ADDRESS_2;
	}

	public String getQBEN_ADDRESS_3() {
		return QBEN_ADDRESS_3;
	}

	public void setQBEN_ADDRESS_3(String qBEN_ADDRESS_3) {
		QBEN_ADDRESS_3 = qBEN_ADDRESS_3;
	}

	public String getQBEN_ADDRESS_4() {
		return QBEN_ADDRESS_4;
	}

	public void setQBEN_ADDRESS_4(String qBEN_ADDRESS_4) {
		QBEN_ADDRESS_4 = qBEN_ADDRESS_4;
	}

	public String getQBEN_ADDRESS_5() {
		return QBEN_ADDRESS_5;
	}

	public void setQBEN_ADDRESS_5(String qBEN_ADDRESS_5) {
		QBEN_ADDRESS_5 = qBEN_ADDRESS_5;
	}

	public String getQBEN_BANK_CODE() {
		return QBEN_BANK_CODE;
	}

	public void setQBEN_BANK_CODE(String qBEN_BANK_CODE) {
		QBEN_BANK_CODE = qBEN_BANK_CODE;
	}

	public String getQBEN_BRANCH_NAME() {
		return QBEN_BRANCH_NAME;
	}

	public void setQBEN_BRANCH_NAME(String qBEN_BRANCH_NAME) {
		QBEN_BRANCH_NAME = qBEN_BRANCH_NAME;
	}

	public String getQBEN_DIVN_CODE() {
		return QBEN_DIVN_CODE;
	}

	public void setQBEN_DIVN_CODE(String qBEN_DIVN_CODE) {
		QBEN_DIVN_CODE = qBEN_DIVN_CODE;
	}

	public BigDecimal getQBEN_ACNT_NO() {
		return QBEN_ACNT_NO;
	}

	public void setQBEN_ACNT_NO(BigDecimal qBEN_ACNT_NO) {
		QBEN_ACNT_NO = qBEN_ACNT_NO;
	}

	public String getQBEN_BNF_CODE() {
		return QBEN_BNF_CODE;
	}

	public void setQBEN_BNF_CODE(String qBEN_BNF_CODE) {
		QBEN_BNF_CODE = qBEN_BNF_CODE;
	}

	public String getQBEN_BNF_ACNT_NAME() {
		return QBEN_BNF_ACNT_NAME;
	}

	public void setQBEN_BNF_ACNT_NAME(String qBEN_BNF_ACNT_NAME) {
		QBEN_BNF_ACNT_NAME = qBEN_BNF_ACNT_NAME;
	}

	public String getQBEN_BNF_TITLE() {
		return QBEN_BNF_TITLE;
	}

	public void setQBEN_BNF_TITLE(String qBEN_BNF_TITLE) {
		QBEN_BNF_TITLE = qBEN_BNF_TITLE;
	}

	public String getQBEN_BNF_SURNAME() {
		return QBEN_BNF_SURNAME;
	}

	public void setQBEN_BNF_SURNAME(String qBEN_BNF_SURNAME) {
		QBEN_BNF_SURNAME = qBEN_BNF_SURNAME;
	}

	public String getQBEN_BNF_OCC_CODE() {
		return QBEN_BNF_OCC_CODE;
	}

	public void setQBEN_BNF_OCC_CODE(String qBEN_BNF_OCC_CODE) {
		QBEN_BNF_OCC_CODE = qBEN_BNF_OCC_CODE;
	}

	public String getQBEN_BNF_MOB_NO() {
		return QBEN_BNF_MOB_NO;
	}

	public void setQBEN_BNF_MOB_NO(String qBEN_BNF_MOB_NO) {
		QBEN_BNF_MOB_NO = qBEN_BNF_MOB_NO;
	}

	public Date getQBEN_DOB() {
		return QBEN_DOB;
	}

	public void setQBEN_DOB(Date qBEN_DOB) {
		QBEN_DOB = qBEN_DOB;
	}

	public String getQBEN_INS_ID() {
		return QBEN_INS_ID;
	}

	public void setQBEN_INS_ID(String qBEN_INS_ID) {
		QBEN_INS_ID = qBEN_INS_ID;
	}

	public Date getQBEN_INS_DT() {
		return QBEN_INS_DT;
	}

	public void setQBEN_INS_DT(Date qBEN_INS_DT) {
		QBEN_INS_DT = qBEN_INS_DT;
	}

	public String getQBEN_MOD_ID() {
		return QBEN_MOD_ID;
	}

	public void setQBEN_MOD_ID(String qBEN_MOD_ID) {
		QBEN_MOD_ID = qBEN_MOD_ID;
	}

	public Date getQBEN_MOD_DT() {
		return QBEN_MOD_DT;
	}

	public void setQBEN_MOD_DT(Date qBEN_MOD_DT) {
		QBEN_MOD_DT = qBEN_MOD_DT;
	}

	public String getQBEN_CATG_CODE() {
		return QBEN_CATG_CODE;
	}

	public void setQBEN_CATG_CODE(String qBEN_CATG_CODE) {
		QBEN_CATG_CODE = qBEN_CATG_CODE;
	}

	public Integer getQBEN_AGE() {
		return QBEN_AGE;
	}

	public void setQBEN_AGE(Integer qBEN_AGE) {
		QBEN_AGE = qBEN_AGE;
	}

	public String getQBEN_GUARDIAN_NAME() {
		return QBEN_GUARDIAN_NAME;
	}

	public void setQBEN_GUARDIAN_NAME(String qBEN_GUARDIAN_NAME) {
		QBEN_GUARDIAN_NAME = qBEN_GUARDIAN_NAME;
	}

	public String getQBEN_DEL_FLAG() {
		return QBEN_DEL_FLAG;
	}

	public void setQBEN_DEL_FLAG(String qBEN_DEL_FLAG) {
		QBEN_DEL_FLAG = qBEN_DEL_FLAG;
	}

	public String getQBEN_REF_ID1() {
		return QBEN_REF_ID1;
	}

	public void setQBEN_REF_ID1(String qBEN_REF_ID1) {
		QBEN_REF_ID1 = qBEN_REF_ID1;
	}

	public String getQBEN_REF_ID2() {
		return QBEN_REF_ID2;
	}

	public void setQBEN_REF_ID2(String qBEN_REF_ID2) {
		QBEN_REF_ID2 = qBEN_REF_ID2;
	}

	public String getQBEN_FLEX_01() {
		return QBEN_FLEX_01;
	}

	public void setQBEN_FLEX_01(String qBEN_FLEX_01) {
		QBEN_FLEX_01 = qBEN_FLEX_01;
	}

	public String getQBEN_FLEX_02() {
		return QBEN_FLEX_02;
	}

	public void setQBEN_FLEX_02(String qBEN_FLEX_02) {
		QBEN_FLEX_02 = qBEN_FLEX_02;
	}

	public String getQBEN_FLEX_03() {
		return QBEN_FLEX_03;
	}

	public void setQBEN_FLEX_03(String qBEN_FLEX_03) {
		QBEN_FLEX_03 = qBEN_FLEX_03;
	}

	public String getQBEN_FLEX_04() {
		return QBEN_FLEX_04;
	}

	public void setQBEN_FLEX_04(String qBEN_FLEX_04) {
		QBEN_FLEX_04 = qBEN_FLEX_04;
	}

	public String getQBEN_FLEX_05() {
		return QBEN_FLEX_05;
	}

	public void setQBEN_FLEX_05(String qBEN_FLEX_05) {
		QBEN_FLEX_05 = qBEN_FLEX_05;
	}

	public String getQBEN_FLEX_06() {
		return QBEN_FLEX_06;
	}

	public void setQBEN_FLEX_06(String qBEN_FLEX_06) {
		QBEN_FLEX_06 = qBEN_FLEX_06;
	}

	public String getQBEN_FLEX_07() {
		return QBEN_FLEX_07;
	}

	public void setQBEN_FLEX_07(String qBEN_FLEX_07) {
		QBEN_FLEX_07 = qBEN_FLEX_07;
	}

	public String getQBEN_FLEX_08() {
		return QBEN_FLEX_08;
	}

	public void setQBEN_FLEX_08(String qBEN_FLEX_08) {
		QBEN_FLEX_08 = qBEN_FLEX_08;
	}

	public String getQBEN_FLEX_09() {
		return QBEN_FLEX_09;
	}

	public void setQBEN_FLEX_09(String qBEN_FLEX_09) {
		QBEN_FLEX_09 = qBEN_FLEX_09;
	}

	public String getQBEN_FLEX_10() {
		return QBEN_FLEX_10;
	}

	public void setQBEN_FLEX_10(String qBEN_FLEX_10) {
		QBEN_FLEX_10 = qBEN_FLEX_10;
	}

	public String getQBEN_FLEX_11() {
		return QBEN_FLEX_11;
	}

	public void setQBEN_FLEX_11(String qBEN_FLEX_11) {
		QBEN_FLEX_11 = qBEN_FLEX_11;
	}

	public String getQBEN_FLEX_12() {
		return QBEN_FLEX_12;
	}

	public void setQBEN_FLEX_12(String qBEN_FLEX_12) {
		QBEN_FLEX_12 = qBEN_FLEX_12;
	}

	public String getQBEN_FLEX_13() {
		return QBEN_FLEX_13;
	}

	public void setQBEN_FLEX_13(String qBEN_FLEX_13) {
		QBEN_FLEX_13 = qBEN_FLEX_13;
	}

	public String getQBEN_FLEX_14() {
		return QBEN_FLEX_14;
	}

	public void setQBEN_FLEX_14(String qBEN_FLEX_14) {
		QBEN_FLEX_14 = qBEN_FLEX_14;
	}

	public String getQBEN_FLEX_15() {
		return QBEN_FLEX_15;
	}

	public void setQBEN_FLEX_15(String qBEN_FLEX_15) {
		QBEN_FLEX_15 = qBEN_FLEX_15;
	}

	public String getQBEN_FLEX_16() {
		return QBEN_FLEX_16;
	}

	public void setQBEN_FLEX_16(String qBEN_FLEX_16) {
		QBEN_FLEX_16 = qBEN_FLEX_16;
	}

	public String getQBEN_FLEX_17() {
		return QBEN_FLEX_17;
	}

	public void setQBEN_FLEX_17(String qBEN_FLEX_17) {
		QBEN_FLEX_17 = qBEN_FLEX_17;
	}

	public String getQBEN_FLEX_18() {
		return QBEN_FLEX_18;
	}

	public void setQBEN_FLEX_18(String qBEN_FLEX_18) {
		QBEN_FLEX_18 = qBEN_FLEX_18;
	}

	public String getQBEN_FLEX_19() {
		return QBEN_FLEX_19;
	}

	public void setQBEN_FLEX_19(String qBEN_FLEX_19) {
		QBEN_FLEX_19 = qBEN_FLEX_19;
	}

	public String getQBEN_FLEX_20() {
		return QBEN_FLEX_20;
	}

	public void setQBEN_FLEX_20(String qBEN_FLEX_20) {
		QBEN_FLEX_20 = qBEN_FLEX_20;
	}

	public String getQBEN_FLEX_21() {
		return QBEN_FLEX_21;
	}

	public void setQBEN_FLEX_21(String qBEN_FLEX_21) {
		QBEN_FLEX_21 = qBEN_FLEX_21;
	}

	public String getQBEN_FLEX_22() {
		return QBEN_FLEX_22;
	}

	public void setQBEN_FLEX_22(String qBEN_FLEX_22) {
		QBEN_FLEX_22 = qBEN_FLEX_22;
	}

	public String getQBEN_FLEX_23() {
		return QBEN_FLEX_23;
	}

	public void setQBEN_FLEX_23(String qBEN_FLEX_23) {
		QBEN_FLEX_23 = qBEN_FLEX_23;
	}

	public String getQBEN_FLEX_24() {
		return QBEN_FLEX_24;
	}

	public void setQBEN_FLEX_24(String qBEN_FLEX_24) {
		QBEN_FLEX_24 = qBEN_FLEX_24;
	}

	public String getQBEN_FLEX_25() {
		return QBEN_FLEX_25;
	}

	public void setQBEN_FLEX_25(String qBEN_FLEX_25) {
		QBEN_FLEX_25 = qBEN_FLEX_25;
	}

	public String getQBEN_FLEX_26() {
		return QBEN_FLEX_26;
	}

	public void setQBEN_FLEX_26(String qBEN_FLEX_26) {
		QBEN_FLEX_26 = qBEN_FLEX_26;
	}

	public String getQBEN_FLEX_27() {
		return QBEN_FLEX_27;
	}

	public void setQBEN_FLEX_27(String qBEN_FLEX_27) {
		QBEN_FLEX_27 = qBEN_FLEX_27;
	}

	public String getQBEN_FLEX_28() {
		return QBEN_FLEX_28;
	}

	public void setQBEN_FLEX_28(String qBEN_FLEX_28) {
		QBEN_FLEX_28 = qBEN_FLEX_28;
	}

	public String getQBEN_FLEX_29() {
		return QBEN_FLEX_29;
	}

	public void setQBEN_FLEX_29(String qBEN_FLEX_29) {
		QBEN_FLEX_29 = qBEN_FLEX_29;
	}

	public String getQBEN_FLEX_30() {
		return QBEN_FLEX_30;
	}

	public void setQBEN_FLEX_30(String qBEN_FLEX_30) {
		QBEN_FLEX_30 = qBEN_FLEX_30;
	}
    
    
}
