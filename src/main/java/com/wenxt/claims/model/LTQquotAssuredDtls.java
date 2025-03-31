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

@Data
@Entity
@Table(name = "LT_QQUOT_ASSURED_DTLS")
public class LTQquotAssuredDtls {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quote_seq")
	@SequenceGenerator(name = "quote_seq", sequenceName = "QUOTE_SEQ", allocationSize = 1)
    private Long QQAD_TRAN_ID;

    @Column(name = "QQAD_QUOT_TRAN_ID", nullable = false, precision = 15)
    private BigDecimal QQAD_QUOT_TRAN_ID;

    @Column(name = "QQAD_RES_COUNTRY_CODE", length = 12)
    private String QQAD_RES_COUNTRY_CODE;

    @Column(name = "QQAD_RES_POSTAL_CODE", precision = 10)
    private BigDecimal QQAD_RES_POSTAL_CODE;

    @Column(name = "QQAD_RES_STATE", length = 60)
    private String QQAD_RES_STATE;

    @Column(name = "QQAD_RES_CITY_CODE", length = 12)
    private String QQAD_RES_CITY_CODE;

    @Column(name = "QQAD_OCC_CLASS", length = 12)
    private String QQAD_OCC_CLASS;

    @Column(name = "QQAD_HEIGHT_UNIT", length = 1)
    private String QQAD_HEIGHT_UNIT;

    @Column(name = "QQAD_WEIGHT_UNIT", length = 1)
    private String QQAD_WEIGHT_UNIT;

    @Column(name = "QQAD_OCC_BUS_CATG", length = 260)
    private String QQAD_OCC_BUS_CATG;

    @Column(name = "QQAD_PEP_YN", length = 1)
    private String QQAD_PEP_YN;

    @Column(name = "QQAD_THRESHOLD_LMT", precision = 22, scale = 5)
    private BigDecimal QQAD_THRESHOLD_LMT;

    @Column(name = "QQAD_ORG_THRESHOLD_LMT", precision = 22, scale = 5)
    private BigDecimal QQAD_ORG_THRESHOLD_LMT;

    @Column(name = "QQAD_MAR_STATUS", length = 10)
    private String QQAD_MAR_STATUS;

    @Column(name = "QQAD_DEPENDEND_CHILD_YN", length = 1)
    private String QQAD_DEPENDEND_CHILD_YN;

    @Column(name = "QQAD_INS_ID", length = 12)
    private String QQAD_INS_ID;

    @Column(name = "QQAD_INS_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date QQAD_INS_DT;

    @Column(name = "QQAD_MOD_ID", length = 12)
    private String QQAD_MOD_ID;

    @Column(name = "QQAD_MOD_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date QQAD_MOD_DT;

    @Column(name = "QQAD_TYPE", length = 1)
    private String QQAD_TYPE;

    @Column(name = "QQAD_ASSR_CODE", length = 12)
    private String QQAD_ASSR_CODE;

    @Column(name = "QQAD_ASSR_REF_ID1", length = 60)
    private String QQAD_ASSR_REF_ID1;

    @Column(name = "QQAD_ASSR_REF_ID2", length = 60)
    private String QQAD_ASSR_REF_ID2;

    @Column(name = "QQAD_ASSR_DOB")
    @Temporal(TemporalType.DATE)
    private Date QQAD_ASSR_DOB;

    @Column(name = "QQAD_ASSR_OCC_CODE", length = 12)
    private String QQAD_ASSR_OCC_CODE;

    @Column(name = "QQAD_CATG_CODE", length = 1)
    private String QQAD_CATG_CODE;

    @Column(name = "QQAD_ASSURED_NAME", length = 2000)
    private String QQAD_ASSURED_NAME;

    @Column(name = "QQAD_HEIGHT", precision = 6, scale = 3)
    private BigDecimal QQAD_HEIGHT;

    @Column(name = "QQAD_WEIGHT", precision = 6, scale = 3)
    private BigDecimal QQAD_WEIGHT;

    @Column(name = "QQAD_DOB")
    @Temporal(TemporalType.DATE)
    private Date QQAD_DOB;

    @Column(name = "QQAD_AGE", precision = 3)
    private Integer QQAD_AGE;

    @Column(name = "QQAD_OCC_CODE", length = 12)
    private String QQAD_OCC_CODE;

    @Column(name = "QQAD_ADDRESSS", length = 200)
    private String QQAD_ADDRESSS;

    @Column(name = "QQAD_BMI", precision = 8, scale = 3)
    private BigDecimal QQAD_BMI;

    @Column(name = "QQAD_AGNT_RATE", precision = 14, scale = 5)
    private BigDecimal QQAD_AGNT_RATE;

    @Column(name = "QQAD_AGNT_VAL", precision = 14, scale = 5)
    private BigDecimal QQAD_AGNT_VAL;

    @Column(name = "QQAD_FC_SALARY", precision = 14, scale = 3)
    private BigDecimal QQAD_FC_SALARY;

    @Column(name = "QQAD_LC_SALARY", precision = 14, scale = 3)
    private BigDecimal QQAD_LC_SALARY;

    @Column(name = "QQAD_HIV_TEST_YN", length = 1)
    private String QQAD_HIV_TEST_YN;

    @Column(name = "QQAD_SMOKE_YN", length = 1)
    private String QQAD_SMOKE_YN;

    @Column(name = "QQAD_NO_OF_CIGAR", precision = 5)
    private Integer QQAD_NO_OF_CIGAR;

    @Column(name = "QQAD_ALCOHOL_QUAN", precision = 14, scale = 3)
    private BigDecimal QQAD_ALCOHOL_QUAN;

    @Column(name = "QQAD_ALCOHOLIC_YN", length = 12)
    private String QQAD_ALCOHOLIC_YN;

    @Column(name = "QQAD_OFF_ADDRESS_1", length = 60)
    private String QQAD_OFF_ADDRESS_1;

    @Column(name = "QQAD_OFF_ADDRESS_2", length = 60)
    private String QQAD_OFF_ADDRESS_2;

    @Column(name = "QQAD_OFF_ADDRESS_3", length = 60)
    private String QQAD_OFF_ADDRESS_3;

    @Column(name = "QQAD_OFF_COUNTRY_CODE", length = 12)
    private String QQAD_OFF_COUNTRY_CODE;

    @Column(name = "QQAD_OFF_POSTAL_CODE", precision = 10)
    private BigDecimal QQAD_OFF_POSTAL_CODE;

    @Column(name = "QQAD_OFF_STATE", length = 60)
    private String QQAD_OFF_STATE;

    @Column(name = "QQAD_OFF_CITY_CODE", length = 12)
    private String QQAD_OFF_CITY_CODE;

    @Column(name = "QQAD_RES_ADDRESS_1", length = 60)
    private String QQAD_RES_ADDRESS_1;

    @Column(name = "QQAD_RES_ADDRESS_2", length = 60)
    private String QQAD_RES_ADDRESS_2;

    @Column(name = "QQAD_RES_ADDRESS_3", length = 60)
    private String QQAD_RES_ADDRESS_3;
    
    @Column(name = "QQAD_EMPLOYER_CODE")
    private String QQAD_EMPLOYER_CODE;
    
    @Column(name = "QQAD_SAL_CURR")
    private String QQAD_SAL_CURR;
    
    @Column(name = "QQAD_ID_EXP_DT")
    private Date QQAD_ID_EXP_DT; 
    
    @Column(name = "QQAD_JOB_TITLE")
    private String QQAD_JOB_TITLE;
    
    @Column(name = "QQAD_BIRTH_PLACE")
    private String QQAD_BIRTH_PLACE;
}
