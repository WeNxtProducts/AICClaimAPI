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
}
