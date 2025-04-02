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

	public Long getQQAD_TRAN_ID() {
		return QQAD_TRAN_ID;
	}

	public void setQQAD_TRAN_ID(Long qQAD_TRAN_ID) {
		QQAD_TRAN_ID = qQAD_TRAN_ID;
	}

	public BigDecimal getQQAD_QUOT_TRAN_ID() {
		return QQAD_QUOT_TRAN_ID;
	}

	public void setQQAD_QUOT_TRAN_ID(BigDecimal qQAD_QUOT_TRAN_ID) {
		QQAD_QUOT_TRAN_ID = qQAD_QUOT_TRAN_ID;
	}

	public String getQQAD_RES_COUNTRY_CODE() {
		return QQAD_RES_COUNTRY_CODE;
	}

	public void setQQAD_RES_COUNTRY_CODE(String qQAD_RES_COUNTRY_CODE) {
		QQAD_RES_COUNTRY_CODE = qQAD_RES_COUNTRY_CODE;
	}

	public BigDecimal getQQAD_RES_POSTAL_CODE() {
		return QQAD_RES_POSTAL_CODE;
	}

	public void setQQAD_RES_POSTAL_CODE(BigDecimal qQAD_RES_POSTAL_CODE) {
		QQAD_RES_POSTAL_CODE = qQAD_RES_POSTAL_CODE;
	}

	public String getQQAD_RES_STATE() {
		return QQAD_RES_STATE;
	}

	public void setQQAD_RES_STATE(String qQAD_RES_STATE) {
		QQAD_RES_STATE = qQAD_RES_STATE;
	}

	public String getQQAD_RES_CITY_CODE() {
		return QQAD_RES_CITY_CODE;
	}

	public void setQQAD_RES_CITY_CODE(String qQAD_RES_CITY_CODE) {
		QQAD_RES_CITY_CODE = qQAD_RES_CITY_CODE;
	}

	public String getQQAD_OCC_CLASS() {
		return QQAD_OCC_CLASS;
	}

	public void setQQAD_OCC_CLASS(String qQAD_OCC_CLASS) {
		QQAD_OCC_CLASS = qQAD_OCC_CLASS;
	}

	public String getQQAD_HEIGHT_UNIT() {
		return QQAD_HEIGHT_UNIT;
	}

	public void setQQAD_HEIGHT_UNIT(String qQAD_HEIGHT_UNIT) {
		QQAD_HEIGHT_UNIT = qQAD_HEIGHT_UNIT;
	}

	public String getQQAD_WEIGHT_UNIT() {
		return QQAD_WEIGHT_UNIT;
	}

	public void setQQAD_WEIGHT_UNIT(String qQAD_WEIGHT_UNIT) {
		QQAD_WEIGHT_UNIT = qQAD_WEIGHT_UNIT;
	}

	public String getQQAD_OCC_BUS_CATG() {
		return QQAD_OCC_BUS_CATG;
	}

	public void setQQAD_OCC_BUS_CATG(String qQAD_OCC_BUS_CATG) {
		QQAD_OCC_BUS_CATG = qQAD_OCC_BUS_CATG;
	}

	public String getQQAD_PEP_YN() {
		return QQAD_PEP_YN;
	}

	public void setQQAD_PEP_YN(String qQAD_PEP_YN) {
		QQAD_PEP_YN = qQAD_PEP_YN;
	}

	public BigDecimal getQQAD_THRESHOLD_LMT() {
		return QQAD_THRESHOLD_LMT;
	}

	public void setQQAD_THRESHOLD_LMT(BigDecimal qQAD_THRESHOLD_LMT) {
		QQAD_THRESHOLD_LMT = qQAD_THRESHOLD_LMT;
	}

	public BigDecimal getQQAD_ORG_THRESHOLD_LMT() {
		return QQAD_ORG_THRESHOLD_LMT;
	}

	public void setQQAD_ORG_THRESHOLD_LMT(BigDecimal qQAD_ORG_THRESHOLD_LMT) {
		QQAD_ORG_THRESHOLD_LMT = qQAD_ORG_THRESHOLD_LMT;
	}

	public String getQQAD_MAR_STATUS() {
		return QQAD_MAR_STATUS;
	}

	public void setQQAD_MAR_STATUS(String qQAD_MAR_STATUS) {
		QQAD_MAR_STATUS = qQAD_MAR_STATUS;
	}

	public String getQQAD_DEPENDEND_CHILD_YN() {
		return QQAD_DEPENDEND_CHILD_YN;
	}

	public void setQQAD_DEPENDEND_CHILD_YN(String qQAD_DEPENDEND_CHILD_YN) {
		QQAD_DEPENDEND_CHILD_YN = qQAD_DEPENDEND_CHILD_YN;
	}

	public String getQQAD_INS_ID() {
		return QQAD_INS_ID;
	}

	public void setQQAD_INS_ID(String qQAD_INS_ID) {
		QQAD_INS_ID = qQAD_INS_ID;
	}

	public Date getQQAD_INS_DT() {
		return QQAD_INS_DT;
	}

	public void setQQAD_INS_DT(Date qQAD_INS_DT) {
		QQAD_INS_DT = qQAD_INS_DT;
	}

	public String getQQAD_MOD_ID() {
		return QQAD_MOD_ID;
	}

	public void setQQAD_MOD_ID(String qQAD_MOD_ID) {
		QQAD_MOD_ID = qQAD_MOD_ID;
	}

	public Date getQQAD_MOD_DT() {
		return QQAD_MOD_DT;
	}

	public void setQQAD_MOD_DT(Date qQAD_MOD_DT) {
		QQAD_MOD_DT = qQAD_MOD_DT;
	}

	public String getQQAD_TYPE() {
		return QQAD_TYPE;
	}

	public void setQQAD_TYPE(String qQAD_TYPE) {
		QQAD_TYPE = qQAD_TYPE;
	}

	public String getQQAD_ASSR_CODE() {
		return QQAD_ASSR_CODE;
	}

	public void setQQAD_ASSR_CODE(String qQAD_ASSR_CODE) {
		QQAD_ASSR_CODE = qQAD_ASSR_CODE;
	}

	public String getQQAD_ASSR_REF_ID1() {
		return QQAD_ASSR_REF_ID1;
	}

	public void setQQAD_ASSR_REF_ID1(String qQAD_ASSR_REF_ID1) {
		QQAD_ASSR_REF_ID1 = qQAD_ASSR_REF_ID1;
	}

	public String getQQAD_ASSR_REF_ID2() {
		return QQAD_ASSR_REF_ID2;
	}

	public void setQQAD_ASSR_REF_ID2(String qQAD_ASSR_REF_ID2) {
		QQAD_ASSR_REF_ID2 = qQAD_ASSR_REF_ID2;
	}

	public Date getQQAD_ASSR_DOB() {
		return QQAD_ASSR_DOB;
	}

	public void setQQAD_ASSR_DOB(Date qQAD_ASSR_DOB) {
		QQAD_ASSR_DOB = qQAD_ASSR_DOB;
	}

	public String getQQAD_ASSR_OCC_CODE() {
		return QQAD_ASSR_OCC_CODE;
	}

	public void setQQAD_ASSR_OCC_CODE(String qQAD_ASSR_OCC_CODE) {
		QQAD_ASSR_OCC_CODE = qQAD_ASSR_OCC_CODE;
	}

	public String getQQAD_CATG_CODE() {
		return QQAD_CATG_CODE;
	}

	public void setQQAD_CATG_CODE(String qQAD_CATG_CODE) {
		QQAD_CATG_CODE = qQAD_CATG_CODE;
	}

	public String getQQAD_ASSURED_NAME() {
		return QQAD_ASSURED_NAME;
	}

	public void setQQAD_ASSURED_NAME(String qQAD_ASSURED_NAME) {
		QQAD_ASSURED_NAME = qQAD_ASSURED_NAME;
	}

	public BigDecimal getQQAD_HEIGHT() {
		return QQAD_HEIGHT;
	}

	public void setQQAD_HEIGHT(BigDecimal qQAD_HEIGHT) {
		QQAD_HEIGHT = qQAD_HEIGHT;
	}

	public BigDecimal getQQAD_WEIGHT() {
		return QQAD_WEIGHT;
	}

	public void setQQAD_WEIGHT(BigDecimal qQAD_WEIGHT) {
		QQAD_WEIGHT = qQAD_WEIGHT;
	}

	public Date getQQAD_DOB() {
		return QQAD_DOB;
	}

	public void setQQAD_DOB(Date qQAD_DOB) {
		QQAD_DOB = qQAD_DOB;
	}

	public Integer getQQAD_AGE() {
		return QQAD_AGE;
	}

	public void setQQAD_AGE(Integer qQAD_AGE) {
		QQAD_AGE = qQAD_AGE;
	}

	public String getQQAD_OCC_CODE() {
		return QQAD_OCC_CODE;
	}

	public void setQQAD_OCC_CODE(String qQAD_OCC_CODE) {
		QQAD_OCC_CODE = qQAD_OCC_CODE;
	}

	public String getQQAD_ADDRESSS() {
		return QQAD_ADDRESSS;
	}

	public void setQQAD_ADDRESSS(String qQAD_ADDRESSS) {
		QQAD_ADDRESSS = qQAD_ADDRESSS;
	}

	public BigDecimal getQQAD_BMI() {
		return QQAD_BMI;
	}

	public void setQQAD_BMI(BigDecimal qQAD_BMI) {
		QQAD_BMI = qQAD_BMI;
	}

	public BigDecimal getQQAD_AGNT_RATE() {
		return QQAD_AGNT_RATE;
	}

	public void setQQAD_AGNT_RATE(BigDecimal qQAD_AGNT_RATE) {
		QQAD_AGNT_RATE = qQAD_AGNT_RATE;
	}

	public BigDecimal getQQAD_AGNT_VAL() {
		return QQAD_AGNT_VAL;
	}

	public void setQQAD_AGNT_VAL(BigDecimal qQAD_AGNT_VAL) {
		QQAD_AGNT_VAL = qQAD_AGNT_VAL;
	}

	public BigDecimal getQQAD_FC_SALARY() {
		return QQAD_FC_SALARY;
	}

	public void setQQAD_FC_SALARY(BigDecimal qQAD_FC_SALARY) {
		QQAD_FC_SALARY = qQAD_FC_SALARY;
	}

	public BigDecimal getQQAD_LC_SALARY() {
		return QQAD_LC_SALARY;
	}

	public void setQQAD_LC_SALARY(BigDecimal qQAD_LC_SALARY) {
		QQAD_LC_SALARY = qQAD_LC_SALARY;
	}

	public String getQQAD_HIV_TEST_YN() {
		return QQAD_HIV_TEST_YN;
	}

	public void setQQAD_HIV_TEST_YN(String qQAD_HIV_TEST_YN) {
		QQAD_HIV_TEST_YN = qQAD_HIV_TEST_YN;
	}

	public String getQQAD_SMOKE_YN() {
		return QQAD_SMOKE_YN;
	}

	public void setQQAD_SMOKE_YN(String qQAD_SMOKE_YN) {
		QQAD_SMOKE_YN = qQAD_SMOKE_YN;
	}

	public Integer getQQAD_NO_OF_CIGAR() {
		return QQAD_NO_OF_CIGAR;
	}

	public void setQQAD_NO_OF_CIGAR(Integer qQAD_NO_OF_CIGAR) {
		QQAD_NO_OF_CIGAR = qQAD_NO_OF_CIGAR;
	}

	public BigDecimal getQQAD_ALCOHOL_QUAN() {
		return QQAD_ALCOHOL_QUAN;
	}

	public void setQQAD_ALCOHOL_QUAN(BigDecimal qQAD_ALCOHOL_QUAN) {
		QQAD_ALCOHOL_QUAN = qQAD_ALCOHOL_QUAN;
	}

	public String getQQAD_ALCOHOLIC_YN() {
		return QQAD_ALCOHOLIC_YN;
	}

	public void setQQAD_ALCOHOLIC_YN(String qQAD_ALCOHOLIC_YN) {
		QQAD_ALCOHOLIC_YN = qQAD_ALCOHOLIC_YN;
	}

	public String getQQAD_OFF_ADDRESS_1() {
		return QQAD_OFF_ADDRESS_1;
	}

	public void setQQAD_OFF_ADDRESS_1(String qQAD_OFF_ADDRESS_1) {
		QQAD_OFF_ADDRESS_1 = qQAD_OFF_ADDRESS_1;
	}

	public String getQQAD_OFF_ADDRESS_2() {
		return QQAD_OFF_ADDRESS_2;
	}

	public void setQQAD_OFF_ADDRESS_2(String qQAD_OFF_ADDRESS_2) {
		QQAD_OFF_ADDRESS_2 = qQAD_OFF_ADDRESS_2;
	}

	public String getQQAD_OFF_ADDRESS_3() {
		return QQAD_OFF_ADDRESS_3;
	}

	public void setQQAD_OFF_ADDRESS_3(String qQAD_OFF_ADDRESS_3) {
		QQAD_OFF_ADDRESS_3 = qQAD_OFF_ADDRESS_3;
	}

	public String getQQAD_OFF_COUNTRY_CODE() {
		return QQAD_OFF_COUNTRY_CODE;
	}

	public void setQQAD_OFF_COUNTRY_CODE(String qQAD_OFF_COUNTRY_CODE) {
		QQAD_OFF_COUNTRY_CODE = qQAD_OFF_COUNTRY_CODE;
	}

	public BigDecimal getQQAD_OFF_POSTAL_CODE() {
		return QQAD_OFF_POSTAL_CODE;
	}

	public void setQQAD_OFF_POSTAL_CODE(BigDecimal qQAD_OFF_POSTAL_CODE) {
		QQAD_OFF_POSTAL_CODE = qQAD_OFF_POSTAL_CODE;
	}

	public String getQQAD_OFF_STATE() {
		return QQAD_OFF_STATE;
	}

	public void setQQAD_OFF_STATE(String qQAD_OFF_STATE) {
		QQAD_OFF_STATE = qQAD_OFF_STATE;
	}

	public String getQQAD_OFF_CITY_CODE() {
		return QQAD_OFF_CITY_CODE;
	}

	public void setQQAD_OFF_CITY_CODE(String qQAD_OFF_CITY_CODE) {
		QQAD_OFF_CITY_CODE = qQAD_OFF_CITY_CODE;
	}

	public String getQQAD_RES_ADDRESS_1() {
		return QQAD_RES_ADDRESS_1;
	}

	public void setQQAD_RES_ADDRESS_1(String qQAD_RES_ADDRESS_1) {
		QQAD_RES_ADDRESS_1 = qQAD_RES_ADDRESS_1;
	}

	public String getQQAD_RES_ADDRESS_2() {
		return QQAD_RES_ADDRESS_2;
	}

	public void setQQAD_RES_ADDRESS_2(String qQAD_RES_ADDRESS_2) {
		QQAD_RES_ADDRESS_2 = qQAD_RES_ADDRESS_2;
	}

	public String getQQAD_RES_ADDRESS_3() {
		return QQAD_RES_ADDRESS_3;
	}

	public void setQQAD_RES_ADDRESS_3(String qQAD_RES_ADDRESS_3) {
		QQAD_RES_ADDRESS_3 = qQAD_RES_ADDRESS_3;
	}

	public String getQQAD_EMPLOYER_CODE() {
		return QQAD_EMPLOYER_CODE;
	}

	public void setQQAD_EMPLOYER_CODE(String qQAD_EMPLOYER_CODE) {
		QQAD_EMPLOYER_CODE = qQAD_EMPLOYER_CODE;
	}

	public String getQQAD_SAL_CURR() {
		return QQAD_SAL_CURR;
	}

	public void setQQAD_SAL_CURR(String qQAD_SAL_CURR) {
		QQAD_SAL_CURR = qQAD_SAL_CURR;
	}

	public Date getQQAD_ID_EXP_DT() {
		return QQAD_ID_EXP_DT;
	}

	public void setQQAD_ID_EXP_DT(Date qQAD_ID_EXP_DT) {
		QQAD_ID_EXP_DT = qQAD_ID_EXP_DT;
	}

	public String getQQAD_JOB_TITLE() {
		return QQAD_JOB_TITLE;
	}

	public void setQQAD_JOB_TITLE(String qQAD_JOB_TITLE) {
		QQAD_JOB_TITLE = qQAD_JOB_TITLE;
	}

	public String getQQAD_BIRTH_PLACE() {
		return QQAD_BIRTH_PLACE;
	}

	public void setQQAD_BIRTH_PLACE(String qQAD_BIRTH_PLACE) {
		QQAD_BIRTH_PLACE = qQAD_BIRTH_PLACE;
	}
    
    
}
