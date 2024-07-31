package com.wenxt.claims.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_POL_EMPLOYEE")
public class LT_POL_EMPLOYEE {

    @Id
    @SequenceGenerator(name = "PolEmployeeTranIDSeq", sequenceName = "PEMP_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PolEmployeeTranIDSeq")
    @Column(name = "PEMP_TRAN_ID")
    private Long PEMP_TRAN_ID;

    @Column(name = "PEMP_POL_TRAN_ID")
    private Integer PEMP_POL_TRAN_ID;

    @Column(name = "PEMP_ID")
    private String PEMP_ID;

    @Column(name = "PEMP_NAME")
    private String PEMP_NAME;

    @Column(name = "PEMP_OCC_CATG")
    private String PEMP_OCC_CATG;

    @Column(name = "PEMP_CATG_CODE")
    private String PEMP_CATG_CODE;

    @Column(name = "PEMP_DOB")
    private Date PEMP_DOB;

    @Column(name = "PEMP_ANB")
    private Integer PEMP_ANB;

    @Column(name = "PEMP_ENTRY_DT")
    private Date PEMP_ENTRY_DT;

    @Column(name = "PEMP_EXIT_DT")
    private Date PEMP_EXIT_DT;

    @Column(name = "PEMP_FC_SALARY")
    private Double PEMP_FC_SALARY;

    @Column(name = "PEMP_LC_SALARY")
    private Double PEMP_LC_SALARY;

    @Column(name = "PEMP_FC_ANNUAL_SALARY")
    private Double PEMP_FC_ANNUAL_SALARY;

    @Column(name = "PEMP_LC_ANNUAL_SALARY")
    private Double PEMP_LC_ANNUAL_SALARY;

    @Column(name = "PEMP_FC_SA")
    private Double PEMP_FC_SA;

    @Column(name = "PEMP_LC_SA")
    private Double PEMP_LC_SA;

    @Column(name = "PEMP_FC_PREM")
    private Double PEMP_FC_PREM;

    @Column(name = "PEMP_LC_PREM")
    private Double PEMP_LC_PREM;

    @Column(name = "PEMP_EXTRA_PREM_PERC")
    private Double PEMP_EXTRA_PREM_PERC;

    @Column(name = "PEMP_FC_EXTRA_PREM")
    private Double PEMP_FC_EXTRA_PREM;

    @Column(name = "PEMP_LC_EXTRA_PREM")
    private Double PEMP_LC_EXTRA_PREM;

    @Column(name = "PEMP_ORG_FC_SALARY")
    private Double PEMP_ORG_FC_SALARY;

    @Column(name = "PEMP_ORG_LC_SALARY")
    private Double PEMP_ORG_LC_SALARY;

    @Column(name = "PEMP_ORG_FC_ANN_SAL")
    private Double PEMP_ORG_FC_ANN_SAL;

    @Column(name = "PEMP_ORG_LC_ANN_SAL")
    private Double PEMP_ORG_LC_ANN_SAL;

    @Column(name = "PEMP_ORG_FC_SA")
    private Double PEMP_ORG_FC_SA;

    @Column(name = "PEMP_ORG_LC_SA")
    private Double PEMP_ORG_LC_SA;

    @Column(name = "PEMP_ORG_FC_PREM")
    private Double PEMP_ORG_FC_PREM;

    @Column(name = "PEMP_ORG_LC_PREM")
    private Double PEMP_ORG_LC_PREM;

    @Column(name = "PEMP_ORG_FC_EXTRA_PREM")
    private Double PEMP_ORG_FC_EXTRA_PREM;

    @Column(name = "PEMP_ORG_LC_EXTRA_PREM")
    private Double PEMP_ORG_LC_EXTRA_PREM;

    @Column(name = "PEMP_DEL_FLAG")
    private String PEMP_DEL_FLAG;

    @Column(name = "PEMP_INS_DT")
    private Date PEMP_INS_DT;

    @Column(name = "PEMP_INS_ID")
    private String PEMP_INS_ID;

    @Column(name = "PEMP_MOD_DT")
    private Date PEMP_MOD_DT;

    @Column(name = "PEMP_MOD_ID")
    private String PEMP_MOD_ID;

    @Column(name = "PEMP_MEDI_EXAM")
    private String PEMP_MEDI_EXAM;

    @Column(name = "PEMP_MED_CLASS_CODE")
    private String PEMP_MED_CLASS_CODE;

    @Column(name = "PEMP_TL_RATE")
    private Double PEMP_TL_RATE;

    @Column(name = "PEMP_ANC_CVR_RATE")
    private Double PEMP_ANC_CVR_RATE;

    @Column(name = "PEMP_SA_DIFF_YN")
    private String PEMP_SA_DIFF_YN;

    @Column(name = "PEMP_FC_ACTUAL_SA")
    private Double PEMP_FC_ACTUAL_SA;

    @Column(name = "PEMP_LC_ACTUAL_SA")
    private Double PEMP_LC_ACTUAL_SA;

    @Column(name = "PEMP_EMPLOYEE_YN")
    private String PEMP_EMPLOYEE_YN;

    @Column(name = "PEMP_EMP_ID")
    private String PEMP_EMP_ID;

    @Column(name = "PEMP_EMP_TRAN_ID")
    private Long PEMP_EMP_TRAN_ID;

    @Column(name = "PEMP_OCC_CODE")
    private String PEMP_OCC_CODE;

    @Column(name = "PEMP_LOC_CODE")
    private String PEMP_LOC_CODE;

    @Column(name = "PEMP_RELN_CODE")
    private String PEMP_RELN_CODE;

    @Column(name = "PEMP_STATUS")
    private String PEMP_STATUS;

    @Column(name = "PEMP_REF_ID1")
    private String PEMP_REF_ID1;

    @Column(name = "PEMP_REF_ID2")
    private String PEMP_REF_ID2;

    @Column(name = "PEMP_TAKE_OVER_FLAG")
    private String PEMP_TAKE_OVER_FLAG;

    @Column(name = "PEMP_LC_TAKE_OVER_FCL")
    private Double PEMP_LC_TAKE_OVER_FCL;

    @Column(name = "PEMP_FC_CL_PREM")
    private Double PEMP_FC_CL_PREM;

    @Column(name = "PEMP_LC_CL_PREM")
    private Double PEMP_LC_CL_PREM;

    @Column(name = "PEMP_FC_TTY_PREM")
    private Double PEMP_FC_TTY_PREM;

    @Column(name = "PEMP_LC_TTY_PREM")
    private Double PEMP_LC_TTY_PREM;

    @Column(name = "PEMP_ORG_LC_TAKE_OVER_FCL")
    private Double PEMP_ORG_LC_TAKE_OVER_FCL;

    @Column(name = "PEMP_ORG_FC_CL_PREM")
    private Double PEMP_ORG_FC_CL_PREM;

    @Column(name = "PEMP_ORG_LC_CL_PREM")
    private Double PEMP_ORG_LC_CL_PREM;

    @Column(name = "PEMP_ORG_FC_TTY_PREM")
    private Double PEMP_ORG_FC_TTY_PREM;

    @Column(name = "PEMP_ORG_LC_TTY_PREM")
    private Double PEMP_ORG_LC_TTY_PREM;

    @Column(name = "PEMP_REC_TYPE")
    private String PEMP_REC_TYPE;

    @Column(name = "PEMP_ORG_FC_ACTUAL_SA")
    private Double PEMP_ORG_FC_ACTUAL_SA;

    @Column(name = "PEMP_ORG_LC_ACTUAL_SA")
    private Double PEMP_ORG_LC_ACTUAL_SA;

    @Column(name = "PEMP_FC_RI_PREM")
    private Double PEMP_FC_RI_PREM;

    @Column(name = "PEMP_LC_RI_PREM")
    private Double PEMP_LC_RI_PREM;

    @Column(name = "PEMP_FC_RET_PREM")
    private Double PEMP_FC_RET_PREM;

    @Column(name = "PEMP_LC_RET_PREM")
    private Double PEMP_LC_RET_PREM;

    @Column(name = "PEMP_ORG_FC_RI_PREM")
    private Double PEMP_ORG_FC_RI_PREM;

    @Column(name = "PEMP_ORG_LC_RI_PREM")
    private Double PEMP_ORG_LC_RI_PREM;

    @Column(name = "PEMP_ORG_FC_RET_PREM")
    private Double PEMP_ORG_FC_RET_PREM;

    @Column(name = "PEMP_ORG_LC_RET_PREM")
    private Double PEMP_ORG_LC_RET_PREM;

    @Column(name = "PEMP_END_EFF_DT")
    private Date PEMP_END_EFF_DT;

    @Column(name = "PEMP_CVR_UPD_YN")
    private String PEMP_CVR_UPD_YN;

    @Column(name = "PEMP_MARITAL_STATUS")
    private String PEMP_MARITAL_STATUS;

    @Column(name = "PEMP_UW_REMARKS")
    private String PEMP_UW_REMARKS;

    @Column(name = "PEMP_SPOUSE_YN")
    private String PEMP_SPOUSE_YN;

    @Column(name = "PEMP_CHILD_YN")
    private String PEMP_CHILD_YN;

    @Column(name = "PEMP_UPLOAD_YN")
    private String PEMP_UPLOAD_YN;

    @Column(name = "PEMP_FLEX_01")
    private String PEMP_FLEX_01;

    @Column(name = "PEMP_PROFIT_RATE")
    private Double PEMP_PROFIT_RATE;

    @Column(name = "PEMP_PROFIT_RATE_PER")
    private Integer PEMP_PROFIT_RATE_PER;

    @Column(name = "PEMP_LOAN_TERM")
    private Double PEMP_LOAN_TERM;

    @Column(name = "PEMP_PLAN_CODE")
    private String PEMP_PLAN_CODE;

    @Column(name = "PEMP_PARENT_ID")
    private String PEMP_PARENT_ID;

    @Column(name = "PEMP_MEMBER_TYPE", columnDefinition = "VARCHAR2(10 BYTE) DEFAULT 'P'")
    private String PEMP_MEMBER_TYPE;

    @Column(name = "PEMP_NO_OF_DEP")
    private Integer PEMP_NO_OF_DEP;

    @Column(name = "PEMP_NO_OF_CHILD")
    private Integer PEMP_NO_OF_CHILD;

    @Column(name = "PEMP_FLEX_02")
    private Double PEMP_FLEX_02;

    @Column(name = "PEMP_CERT_NO")
    private String PEMP_CERT_NO;

    @Column(name = "PEMP_ADDL_STATUS")
    private String PEMP_ADDL_STATUS;

    @Column(name = "PEMP_HEIGHT")
    private Integer PEMP_HEIGHT;

    @Column(name = "PEMP_HEIGHT_UNIT")
    private String PEMP_HEIGHT_UNIT;

    @Column(name = "PEMP_WEIGHT")
    private Double PEMP_WEIGHT;

    @Column(name = "PEMP_WEIGHT_UNIT")
    private String PEMP_WEIGHT_UNIT;

    @Column(name = "PEMP_BMI")
    private Double PEMP_BMI;

    @Column(name = "PEMP_EMP_NATION")
    private String PEMP_EMP_NATION;

    @Column(name = "PEMP_EMP_STATUS")
    private String PEMP_EMP_STATUS;

    @Column(name = "PEMP_MOP")
    private String PEMP_MOP;

    @Column(name = "PEMP_INCEPTION_DT")
    private Date PEMP_INCEPTION_DT;

    @Column(name = "PEMP_INCEP_END_DT")
    private Date PEMP_INCEP_END_DT;

    @Column(name = "PEMP_INTEREST_RATE")
    private Double PEMP_INTEREST_RATE;

    @Column(name = "PEMP_COVER_PREM_CHG_YN")
    private String PEMP_COVER_PREM_CHG_YN;

    @Column(name = "PEMP_CVR_CODE1")
    private String PEMP_CVR_CODE1;

    @Column(name = "PEMP_CVR_SA1")
    private Double PEMP_CVR_SA1;

    @Column(name = "PEMP_CVR_CODE2")
    private String PEMP_CVR_CODE2;

    @Column(name = "PEMP_CVR_SA2")
    private Double PEMP_CVR_SA2;

    @Column(name = "PEMP_CVR_CODE3")
    private String PEMP_CVR_CODE3;

    @Column(name = "PEMP_CVR_SA3")
    private Double PEMP_CVR_SA3;

    @Column(name = "PEMP_CVR_CODE4")
    private String PEMP_CVR_CODE4;

    @Column(name = "PEMP_CVR_SA4")
    private Double PEMP_CVR_SA4;

    @Column(name = "PEMP_CVR_CODE5")
    private String PEMP_CVR_CODE5;

    @Column(name = "PEMP_CVR_SA5")
    private Double PEMP_CVR_SA5;

    @Column(name = "PEMP_FIXED_SA")
    private Double PEMP_FIXED_SA;

    @Column(name = "PEMP_NET_SAL")
    private Double PEMP_NET_SAL;

    @Column(name = "PEMP_TYPE_LOAN")
    private String PEMP_TYPE_LOAN;

    @Column(name = "PEMP_BANK_NAME")
    private String PEMP_BANK_NAME;

    @Column(name = "PEMP_BRANCH_NAME")
    private String PEMP_BRANCH_NAME;

    @Column(name = "PEMP_ACNT_NO")
    private String PEMP_ACNT_NO;

    @Column(name = "PEMP_EC_DOB")
    private Date PEMP_EC_DOB;

    @Column(name = "PEMP_MAN_FC_PREM")
    private Double PEMP_MAN_FC_PREM;

	public Long getPEMP_TRAN_ID() {
		return PEMP_TRAN_ID;
	}

	public void setPEMP_TRAN_ID(Long pEMP_TRAN_ID) {
		PEMP_TRAN_ID = pEMP_TRAN_ID;
	}

	public Integer getPEMP_POL_TRAN_ID() {
		return PEMP_POL_TRAN_ID;
	}

	public void setPEMP_POL_TRAN_ID(Integer pEMP_POL_TRAN_ID) {
		PEMP_POL_TRAN_ID = pEMP_POL_TRAN_ID;
	}

	public String getPEMP_ID() {
		return PEMP_ID;
	}

	public void setPEMP_ID(String pEMP_ID) {
		PEMP_ID = pEMP_ID;
	}

	public String getPEMP_NAME() {
		return PEMP_NAME;
	}

	public void setPEMP_NAME(String pEMP_NAME) {
		PEMP_NAME = pEMP_NAME;
	}

	public String getPEMP_OCC_CATG() {
		return PEMP_OCC_CATG;
	}

	public void setPEMP_OCC_CATG(String pEMP_OCC_CATG) {
		PEMP_OCC_CATG = pEMP_OCC_CATG;
	}

	public String getPEMP_CATG_CODE() {
		return PEMP_CATG_CODE;
	}

	public void setPEMP_CATG_CODE(String pEMP_CATG_CODE) {
		PEMP_CATG_CODE = pEMP_CATG_CODE;
	}

	public Date getPEMP_DOB() {
		return PEMP_DOB;
	}

	public void setPEMP_DOB(Date pEMP_DOB) {
		PEMP_DOB = pEMP_DOB;
	}

	public Integer getPEMP_ANB() {
		return PEMP_ANB;
	}

	public void setPEMP_ANB(Integer pEMP_ANB) {
		PEMP_ANB = pEMP_ANB;
	}

	public Date getPEMP_ENTRY_DT() {
		return PEMP_ENTRY_DT;
	}

	public void setPEMP_ENTRY_DT(Date pEMP_ENTRY_DT) {
		PEMP_ENTRY_DT = pEMP_ENTRY_DT;
	}

	public Date getPEMP_EXIT_DT() {
		return PEMP_EXIT_DT;
	}

	public void setPEMP_EXIT_DT(Date pEMP_EXIT_DT) {
		PEMP_EXIT_DT = pEMP_EXIT_DT;
	}

	public Double getPEMP_FC_SALARY() {
		return PEMP_FC_SALARY;
	}

	public void setPEMP_FC_SALARY(Double pEMP_FC_SALARY) {
		PEMP_FC_SALARY = pEMP_FC_SALARY;
	}

	public Double getPEMP_LC_SALARY() {
		return PEMP_LC_SALARY;
	}

	public void setPEMP_LC_SALARY(Double pEMP_LC_SALARY) {
		PEMP_LC_SALARY = pEMP_LC_SALARY;
	}

	public Double getPEMP_FC_ANNUAL_SALARY() {
		return PEMP_FC_ANNUAL_SALARY;
	}

	public void setPEMP_FC_ANNUAL_SALARY(Double pEMP_FC_ANNUAL_SALARY) {
		PEMP_FC_ANNUAL_SALARY = pEMP_FC_ANNUAL_SALARY;
	}

	public Double getPEMP_LC_ANNUAL_SALARY() {
		return PEMP_LC_ANNUAL_SALARY;
	}

	public void setPEMP_LC_ANNUAL_SALARY(Double pEMP_LC_ANNUAL_SALARY) {
		PEMP_LC_ANNUAL_SALARY = pEMP_LC_ANNUAL_SALARY;
	}

	public Double getPEMP_FC_SA() {
		return PEMP_FC_SA;
	}

	public void setPEMP_FC_SA(Double pEMP_FC_SA) {
		PEMP_FC_SA = pEMP_FC_SA;
	}

	public Double getPEMP_LC_SA() {
		return PEMP_LC_SA;
	}

	public void setPEMP_LC_SA(Double pEMP_LC_SA) {
		PEMP_LC_SA = pEMP_LC_SA;
	}

	public Double getPEMP_FC_PREM() {
		return PEMP_FC_PREM;
	}

	public void setPEMP_FC_PREM(Double pEMP_FC_PREM) {
		PEMP_FC_PREM = pEMP_FC_PREM;
	}

	public Double getPEMP_LC_PREM() {
		return PEMP_LC_PREM;
	}

	public void setPEMP_LC_PREM(Double pEMP_LC_PREM) {
		PEMP_LC_PREM = pEMP_LC_PREM;
	}

	public Double getPEMP_EXTRA_PREM_PERC() {
		return PEMP_EXTRA_PREM_PERC;
	}

	public void setPEMP_EXTRA_PREM_PERC(Double pEMP_EXTRA_PREM_PERC) {
		PEMP_EXTRA_PREM_PERC = pEMP_EXTRA_PREM_PERC;
	}

	public Double getPEMP_FC_EXTRA_PREM() {
		return PEMP_FC_EXTRA_PREM;
	}

	public void setPEMP_FC_EXTRA_PREM(Double pEMP_FC_EXTRA_PREM) {
		PEMP_FC_EXTRA_PREM = pEMP_FC_EXTRA_PREM;
	}

	public Double getPEMP_LC_EXTRA_PREM() {
		return PEMP_LC_EXTRA_PREM;
	}

	public void setPEMP_LC_EXTRA_PREM(Double pEMP_LC_EXTRA_PREM) {
		PEMP_LC_EXTRA_PREM = pEMP_LC_EXTRA_PREM;
	}

	public Double getPEMP_ORG_FC_SALARY() {
		return PEMP_ORG_FC_SALARY;
	}

	public void setPEMP_ORG_FC_SALARY(Double pEMP_ORG_FC_SALARY) {
		PEMP_ORG_FC_SALARY = pEMP_ORG_FC_SALARY;
	}

	public Double getPEMP_ORG_LC_SALARY() {
		return PEMP_ORG_LC_SALARY;
	}

	public void setPEMP_ORG_LC_SALARY(Double pEMP_ORG_LC_SALARY) {
		PEMP_ORG_LC_SALARY = pEMP_ORG_LC_SALARY;
	}

	public Double getPEMP_ORG_FC_ANN_SAL() {
		return PEMP_ORG_FC_ANN_SAL;
	}

	public void setPEMP_ORG_FC_ANN_SAL(Double pEMP_ORG_FC_ANN_SAL) {
		PEMP_ORG_FC_ANN_SAL = pEMP_ORG_FC_ANN_SAL;
	}

	public Double getPEMP_ORG_LC_ANN_SAL() {
		return PEMP_ORG_LC_ANN_SAL;
	}

	public void setPEMP_ORG_LC_ANN_SAL(Double pEMP_ORG_LC_ANN_SAL) {
		PEMP_ORG_LC_ANN_SAL = pEMP_ORG_LC_ANN_SAL;
	}

	public Double getPEMP_ORG_FC_SA() {
		return PEMP_ORG_FC_SA;
	}

	public void setPEMP_ORG_FC_SA(Double pEMP_ORG_FC_SA) {
		PEMP_ORG_FC_SA = pEMP_ORG_FC_SA;
	}

	public Double getPEMP_ORG_LC_SA() {
		return PEMP_ORG_LC_SA;
	}

	public void setPEMP_ORG_LC_SA(Double pEMP_ORG_LC_SA) {
		PEMP_ORG_LC_SA = pEMP_ORG_LC_SA;
	}

	public Double getPEMP_ORG_FC_PREM() {
		return PEMP_ORG_FC_PREM;
	}

	public void setPEMP_ORG_FC_PREM(Double pEMP_ORG_FC_PREM) {
		PEMP_ORG_FC_PREM = pEMP_ORG_FC_PREM;
	}

	public Double getPEMP_ORG_LC_PREM() {
		return PEMP_ORG_LC_PREM;
	}

	public void setPEMP_ORG_LC_PREM(Double pEMP_ORG_LC_PREM) {
		PEMP_ORG_LC_PREM = pEMP_ORG_LC_PREM;
	}

	public Double getPEMP_ORG_FC_EXTRA_PREM() {
		return PEMP_ORG_FC_EXTRA_PREM;
	}

	public void setPEMP_ORG_FC_EXTRA_PREM(Double pEMP_ORG_FC_EXTRA_PREM) {
		PEMP_ORG_FC_EXTRA_PREM = pEMP_ORG_FC_EXTRA_PREM;
	}

	public Double getPEMP_ORG_LC_EXTRA_PREM() {
		return PEMP_ORG_LC_EXTRA_PREM;
	}

	public void setPEMP_ORG_LC_EXTRA_PREM(Double pEMP_ORG_LC_EXTRA_PREM) {
		PEMP_ORG_LC_EXTRA_PREM = pEMP_ORG_LC_EXTRA_PREM;
	}

	public String getPEMP_DEL_FLAG() {
		return PEMP_DEL_FLAG;
	}

	public void setPEMP_DEL_FLAG(String pEMP_DEL_FLAG) {
		PEMP_DEL_FLAG = pEMP_DEL_FLAG;
	}

	public Date getPEMP_INS_DT() {
		return PEMP_INS_DT;
	}

	public void setPEMP_INS_DT(Date pEMP_INS_DT) {
		PEMP_INS_DT = pEMP_INS_DT;
	}

	public String getPEMP_INS_ID() {
		return PEMP_INS_ID;
	}

	public void setPEMP_INS_ID(String pEMP_INS_ID) {
		PEMP_INS_ID = pEMP_INS_ID;
	}

	public Date getPEMP_MOD_DT() {
		return PEMP_MOD_DT;
	}

	public void setPEMP_MOD_DT(Date pEMP_MOD_DT) {
		PEMP_MOD_DT = pEMP_MOD_DT;
	}

	public String getPEMP_MOD_ID() {
		return PEMP_MOD_ID;
	}

	public void setPEMP_MOD_ID(String pEMP_MOD_ID) {
		PEMP_MOD_ID = pEMP_MOD_ID;
	}

	public String getPEMP_MEDI_EXAM() {
		return PEMP_MEDI_EXAM;
	}

	public void setPEMP_MEDI_EXAM(String pEMP_MEDI_EXAM) {
		PEMP_MEDI_EXAM = pEMP_MEDI_EXAM;
	}

	public String getPEMP_MED_CLASS_CODE() {
		return PEMP_MED_CLASS_CODE;
	}

	public void setPEMP_MED_CLASS_CODE(String pEMP_MED_CLASS_CODE) {
		PEMP_MED_CLASS_CODE = pEMP_MED_CLASS_CODE;
	}

	public Double getPEMP_TL_RATE() {
		return PEMP_TL_RATE;
	}

	public void setPEMP_TL_RATE(Double pEMP_TL_RATE) {
		PEMP_TL_RATE = pEMP_TL_RATE;
	}

	public Double getPEMP_ANC_CVR_RATE() {
		return PEMP_ANC_CVR_RATE;
	}

	public void setPEMP_ANC_CVR_RATE(Double pEMP_ANC_CVR_RATE) {
		PEMP_ANC_CVR_RATE = pEMP_ANC_CVR_RATE;
	}

	public String getPEMP_SA_DIFF_YN() {
		return PEMP_SA_DIFF_YN;
	}

	public void setPEMP_SA_DIFF_YN(String pEMP_SA_DIFF_YN) {
		PEMP_SA_DIFF_YN = pEMP_SA_DIFF_YN;
	}

	public Double getPEMP_FC_ACTUAL_SA() {
		return PEMP_FC_ACTUAL_SA;
	}

	public void setPEMP_FC_ACTUAL_SA(Double pEMP_FC_ACTUAL_SA) {
		PEMP_FC_ACTUAL_SA = pEMP_FC_ACTUAL_SA;
	}

	public Double getPEMP_LC_ACTUAL_SA() {
		return PEMP_LC_ACTUAL_SA;
	}

	public void setPEMP_LC_ACTUAL_SA(Double pEMP_LC_ACTUAL_SA) {
		PEMP_LC_ACTUAL_SA = pEMP_LC_ACTUAL_SA;
	}

	public String getPEMP_EMPLOYEE_YN() {
		return PEMP_EMPLOYEE_YN;
	}

	public void setPEMP_EMPLOYEE_YN(String pEMP_EMPLOYEE_YN) {
		PEMP_EMPLOYEE_YN = pEMP_EMPLOYEE_YN;
	}

	public String getPEMP_EMP_ID() {
		return PEMP_EMP_ID;
	}

	public void setPEMP_EMP_ID(String pEMP_EMP_ID) {
		PEMP_EMP_ID = pEMP_EMP_ID;
	}

	public Long getPEMP_EMP_TRAN_ID() {
		return PEMP_EMP_TRAN_ID;
	}

	public void setPEMP_EMP_TRAN_ID(Long pEMP_EMP_TRAN_ID) {
		PEMP_EMP_TRAN_ID = pEMP_EMP_TRAN_ID;
	}

	public String getPEMP_OCC_CODE() {
		return PEMP_OCC_CODE;
	}

	public void setPEMP_OCC_CODE(String pEMP_OCC_CODE) {
		PEMP_OCC_CODE = pEMP_OCC_CODE;
	}

	public String getPEMP_LOC_CODE() {
		return PEMP_LOC_CODE;
	}

	public void setPEMP_LOC_CODE(String pEMP_LOC_CODE) {
		PEMP_LOC_CODE = pEMP_LOC_CODE;
	}

	public String getPEMP_RELN_CODE() {
		return PEMP_RELN_CODE;
	}

	public void setPEMP_RELN_CODE(String pEMP_RELN_CODE) {
		PEMP_RELN_CODE = pEMP_RELN_CODE;
	}

	public String getPEMP_STATUS() {
		return PEMP_STATUS;
	}

	public void setPEMP_STATUS(String pEMP_STATUS) {
		PEMP_STATUS = pEMP_STATUS;
	}

	public String getPEMP_REF_ID1() {
		return PEMP_REF_ID1;
	}

	public void setPEMP_REF_ID1(String pEMP_REF_ID1) {
		PEMP_REF_ID1 = pEMP_REF_ID1;
	}

	public String getPEMP_REF_ID2() {
		return PEMP_REF_ID2;
	}

	public void setPEMP_REF_ID2(String pEMP_REF_ID2) {
		PEMP_REF_ID2 = pEMP_REF_ID2;
	}

	public String getPEMP_TAKE_OVER_FLAG() {
		return PEMP_TAKE_OVER_FLAG;
	}

	public void setPEMP_TAKE_OVER_FLAG(String pEMP_TAKE_OVER_FLAG) {
		PEMP_TAKE_OVER_FLAG = pEMP_TAKE_OVER_FLAG;
	}

	public Double getPEMP_LC_TAKE_OVER_FCL() {
		return PEMP_LC_TAKE_OVER_FCL;
	}

	public void setPEMP_LC_TAKE_OVER_FCL(Double pEMP_LC_TAKE_OVER_FCL) {
		PEMP_LC_TAKE_OVER_FCL = pEMP_LC_TAKE_OVER_FCL;
	}

	public Double getPEMP_FC_CL_PREM() {
		return PEMP_FC_CL_PREM;
	}

	public void setPEMP_FC_CL_PREM(Double pEMP_FC_CL_PREM) {
		PEMP_FC_CL_PREM = pEMP_FC_CL_PREM;
	}

	public Double getPEMP_LC_CL_PREM() {
		return PEMP_LC_CL_PREM;
	}

	public void setPEMP_LC_CL_PREM(Double pEMP_LC_CL_PREM) {
		PEMP_LC_CL_PREM = pEMP_LC_CL_PREM;
	}

	public Double getPEMP_FC_TTY_PREM() {
		return PEMP_FC_TTY_PREM;
	}

	public void setPEMP_FC_TTY_PREM(Double pEMP_FC_TTY_PREM) {
		PEMP_FC_TTY_PREM = pEMP_FC_TTY_PREM;
	}

	public Double getPEMP_LC_TTY_PREM() {
		return PEMP_LC_TTY_PREM;
	}

	public void setPEMP_LC_TTY_PREM(Double pEMP_LC_TTY_PREM) {
		PEMP_LC_TTY_PREM = pEMP_LC_TTY_PREM;
	}

	public Double getPEMP_ORG_LC_TAKE_OVER_FCL() {
		return PEMP_ORG_LC_TAKE_OVER_FCL;
	}

	public void setPEMP_ORG_LC_TAKE_OVER_FCL(Double pEMP_ORG_LC_TAKE_OVER_FCL) {
		PEMP_ORG_LC_TAKE_OVER_FCL = pEMP_ORG_LC_TAKE_OVER_FCL;
	}

	public Double getPEMP_ORG_FC_CL_PREM() {
		return PEMP_ORG_FC_CL_PREM;
	}

	public void setPEMP_ORG_FC_CL_PREM(Double pEMP_ORG_FC_CL_PREM) {
		PEMP_ORG_FC_CL_PREM = pEMP_ORG_FC_CL_PREM;
	}

	public Double getPEMP_ORG_LC_CL_PREM() {
		return PEMP_ORG_LC_CL_PREM;
	}

	public void setPEMP_ORG_LC_CL_PREM(Double pEMP_ORG_LC_CL_PREM) {
		PEMP_ORG_LC_CL_PREM = pEMP_ORG_LC_CL_PREM;
	}

	public Double getPEMP_ORG_FC_TTY_PREM() {
		return PEMP_ORG_FC_TTY_PREM;
	}

	public void setPEMP_ORG_FC_TTY_PREM(Double pEMP_ORG_FC_TTY_PREM) {
		PEMP_ORG_FC_TTY_PREM = pEMP_ORG_FC_TTY_PREM;
	}

	public Double getPEMP_ORG_LC_TTY_PREM() {
		return PEMP_ORG_LC_TTY_PREM;
	}

	public void setPEMP_ORG_LC_TTY_PREM(Double pEMP_ORG_LC_TTY_PREM) {
		PEMP_ORG_LC_TTY_PREM = pEMP_ORG_LC_TTY_PREM;
	}

	public String getPEMP_REC_TYPE() {
		return PEMP_REC_TYPE;
	}

	public void setPEMP_REC_TYPE(String pEMP_REC_TYPE) {
		PEMP_REC_TYPE = pEMP_REC_TYPE;
	}

	public Double getPEMP_ORG_FC_ACTUAL_SA() {
		return PEMP_ORG_FC_ACTUAL_SA;
	}

	public void setPEMP_ORG_FC_ACTUAL_SA(Double pEMP_ORG_FC_ACTUAL_SA) {
		PEMP_ORG_FC_ACTUAL_SA = pEMP_ORG_FC_ACTUAL_SA;
	}

	public Double getPEMP_ORG_LC_ACTUAL_SA() {
		return PEMP_ORG_LC_ACTUAL_SA;
	}

	public void setPEMP_ORG_LC_ACTUAL_SA(Double pEMP_ORG_LC_ACTUAL_SA) {
		PEMP_ORG_LC_ACTUAL_SA = pEMP_ORG_LC_ACTUAL_SA;
	}

	public Double getPEMP_FC_RI_PREM() {
		return PEMP_FC_RI_PREM;
	}

	public void setPEMP_FC_RI_PREM(Double pEMP_FC_RI_PREM) {
		PEMP_FC_RI_PREM = pEMP_FC_RI_PREM;
	}

	public Double getPEMP_LC_RI_PREM() {
		return PEMP_LC_RI_PREM;
	}

	public void setPEMP_LC_RI_PREM(Double pEMP_LC_RI_PREM) {
		PEMP_LC_RI_PREM = pEMP_LC_RI_PREM;
	}

	public Double getPEMP_FC_RET_PREM() {
		return PEMP_FC_RET_PREM;
	}

	public void setPEMP_FC_RET_PREM(Double pEMP_FC_RET_PREM) {
		PEMP_FC_RET_PREM = pEMP_FC_RET_PREM;
	}

	public Double getPEMP_LC_RET_PREM() {
		return PEMP_LC_RET_PREM;
	}

	public void setPEMP_LC_RET_PREM(Double pEMP_LC_RET_PREM) {
		PEMP_LC_RET_PREM = pEMP_LC_RET_PREM;
	}

	public Double getPEMP_ORG_FC_RI_PREM() {
		return PEMP_ORG_FC_RI_PREM;
	}

	public void setPEMP_ORG_FC_RI_PREM(Double pEMP_ORG_FC_RI_PREM) {
		PEMP_ORG_FC_RI_PREM = pEMP_ORG_FC_RI_PREM;
	}

	public Double getPEMP_ORG_LC_RI_PREM() {
		return PEMP_ORG_LC_RI_PREM;
	}

	public void setPEMP_ORG_LC_RI_PREM(Double pEMP_ORG_LC_RI_PREM) {
		PEMP_ORG_LC_RI_PREM = pEMP_ORG_LC_RI_PREM;
	}

	public Double getPEMP_ORG_FC_RET_PREM() {
		return PEMP_ORG_FC_RET_PREM;
	}

	public void setPEMP_ORG_FC_RET_PREM(Double pEMP_ORG_FC_RET_PREM) {
		PEMP_ORG_FC_RET_PREM = pEMP_ORG_FC_RET_PREM;
	}

	public Double getPEMP_ORG_LC_RET_PREM() {
		return PEMP_ORG_LC_RET_PREM;
	}

	public void setPEMP_ORG_LC_RET_PREM(Double pEMP_ORG_LC_RET_PREM) {
		PEMP_ORG_LC_RET_PREM = pEMP_ORG_LC_RET_PREM;
	}

	public Date getPEMP_END_EFF_DT() {
		return PEMP_END_EFF_DT;
	}

	public void setPEMP_END_EFF_DT(Date pEMP_END_EFF_DT) {
		PEMP_END_EFF_DT = pEMP_END_EFF_DT;
	}

	public String getPEMP_CVR_UPD_YN() {
		return PEMP_CVR_UPD_YN;
	}

	public void setPEMP_CVR_UPD_YN(String pEMP_CVR_UPD_YN) {
		PEMP_CVR_UPD_YN = pEMP_CVR_UPD_YN;
	}

	public String getPEMP_MARITAL_STATUS() {
		return PEMP_MARITAL_STATUS;
	}

	public void setPEMP_MARITAL_STATUS(String pEMP_MARITAL_STATUS) {
		PEMP_MARITAL_STATUS = pEMP_MARITAL_STATUS;
	}

	public String getPEMP_UW_REMARKS() {
		return PEMP_UW_REMARKS;
	}

	public void setPEMP_UW_REMARKS(String pEMP_UW_REMARKS) {
		PEMP_UW_REMARKS = pEMP_UW_REMARKS;
	}

	public String getPEMP_SPOUSE_YN() {
		return PEMP_SPOUSE_YN;
	}

	public void setPEMP_SPOUSE_YN(String pEMP_SPOUSE_YN) {
		PEMP_SPOUSE_YN = pEMP_SPOUSE_YN;
	}

	public String getPEMP_CHILD_YN() {
		return PEMP_CHILD_YN;
	}

	public void setPEMP_CHILD_YN(String pEMP_CHILD_YN) {
		PEMP_CHILD_YN = pEMP_CHILD_YN;
	}

	public String getPEMP_UPLOAD_YN() {
		return PEMP_UPLOAD_YN;
	}

	public void setPEMP_UPLOAD_YN(String pEMP_UPLOAD_YN) {
		PEMP_UPLOAD_YN = pEMP_UPLOAD_YN;
	}

	public String getPEMP_FLEX_01() {
		return PEMP_FLEX_01;
	}

	public void setPEMP_FLEX_01(String pEMP_FLEX_01) {
		PEMP_FLEX_01 = pEMP_FLEX_01;
	}

	public Double getPEMP_PROFIT_RATE() {
		return PEMP_PROFIT_RATE;
	}

	public void setPEMP_PROFIT_RATE(Double pEMP_PROFIT_RATE) {
		PEMP_PROFIT_RATE = pEMP_PROFIT_RATE;
	}

	public Integer getPEMP_PROFIT_RATE_PER() {
		return PEMP_PROFIT_RATE_PER;
	}

	public void setPEMP_PROFIT_RATE_PER(Integer pEMP_PROFIT_RATE_PER) {
		PEMP_PROFIT_RATE_PER = pEMP_PROFIT_RATE_PER;
	}

	public Double getPEMP_LOAN_TERM() {
		return PEMP_LOAN_TERM;
	}

	public void setPEMP_LOAN_TERM(Double pEMP_LOAN_TERM) {
		PEMP_LOAN_TERM = pEMP_LOAN_TERM;
	}

	public String getPEMP_PLAN_CODE() {
		return PEMP_PLAN_CODE;
	}

	public void setPEMP_PLAN_CODE(String pEMP_PLAN_CODE) {
		PEMP_PLAN_CODE = pEMP_PLAN_CODE;
	}

	public String getPEMP_PARENT_ID() {
		return PEMP_PARENT_ID;
	}

	public void setPEMP_PARENT_ID(String pEMP_PARENT_ID) {
		PEMP_PARENT_ID = pEMP_PARENT_ID;
	}

	public String getPEMP_MEMBER_TYPE() {
		return PEMP_MEMBER_TYPE;
	}

	public void setPEMP_MEMBER_TYPE(String pEMP_MEMBER_TYPE) {
		PEMP_MEMBER_TYPE = pEMP_MEMBER_TYPE;
	}

	public Integer getPEMP_NO_OF_DEP() {
		return PEMP_NO_OF_DEP;
	}

	public void setPEMP_NO_OF_DEP(Integer pEMP_NO_OF_DEP) {
		PEMP_NO_OF_DEP = pEMP_NO_OF_DEP;
	}

	public Integer getPEMP_NO_OF_CHILD() {
		return PEMP_NO_OF_CHILD;
	}

	public void setPEMP_NO_OF_CHILD(Integer pEMP_NO_OF_CHILD) {
		PEMP_NO_OF_CHILD = pEMP_NO_OF_CHILD;
	}

	public Double getPEMP_FLEX_02() {
		return PEMP_FLEX_02;
	}

	public void setPEMP_FLEX_02(Double pEMP_FLEX_02) {
		PEMP_FLEX_02 = pEMP_FLEX_02;
	}

	public String getPEMP_CERT_NO() {
		return PEMP_CERT_NO;
	}

	public void setPEMP_CERT_NO(String pEMP_CERT_NO) {
		PEMP_CERT_NO = pEMP_CERT_NO;
	}

	public String getPEMP_ADDL_STATUS() {
		return PEMP_ADDL_STATUS;
	}

	public void setPEMP_ADDL_STATUS(String pEMP_ADDL_STATUS) {
		PEMP_ADDL_STATUS = pEMP_ADDL_STATUS;
	}

	public Integer getPEMP_HEIGHT() {
		return PEMP_HEIGHT;
	}

	public void setPEMP_HEIGHT(Integer pEMP_HEIGHT) {
		PEMP_HEIGHT = pEMP_HEIGHT;
	}

	public String getPEMP_HEIGHT_UNIT() {
		return PEMP_HEIGHT_UNIT;
	}

	public void setPEMP_HEIGHT_UNIT(String pEMP_HEIGHT_UNIT) {
		PEMP_HEIGHT_UNIT = pEMP_HEIGHT_UNIT;
	}

	public Double getPEMP_WEIGHT() {
		return PEMP_WEIGHT;
	}

	public void setPEMP_WEIGHT(Double pEMP_WEIGHT) {
		PEMP_WEIGHT = pEMP_WEIGHT;
	}

	public String getPEMP_WEIGHT_UNIT() {
		return PEMP_WEIGHT_UNIT;
	}

	public void setPEMP_WEIGHT_UNIT(String pEMP_WEIGHT_UNIT) {
		PEMP_WEIGHT_UNIT = pEMP_WEIGHT_UNIT;
	}

	public Double getPEMP_BMI() {
		return PEMP_BMI;
	}

	public void setPEMP_BMI(Double pEMP_BMI) {
		PEMP_BMI = pEMP_BMI;
	}

	public String getPEMP_EMP_NATION() {
		return PEMP_EMP_NATION;
	}

	public void setPEMP_EMP_NATION(String pEMP_EMP_NATION) {
		PEMP_EMP_NATION = pEMP_EMP_NATION;
	}

	public String getPEMP_EMP_STATUS() {
		return PEMP_EMP_STATUS;
	}

	public void setPEMP_EMP_STATUS(String pEMP_EMP_STATUS) {
		PEMP_EMP_STATUS = pEMP_EMP_STATUS;
	}

	public String getPEMP_MOP() {
		return PEMP_MOP;
	}

	public void setPEMP_MOP(String pEMP_MOP) {
		PEMP_MOP = pEMP_MOP;
	}

	public Date getPEMP_INCEPTION_DT() {
		return PEMP_INCEPTION_DT;
	}

	public void setPEMP_INCEPTION_DT(Date pEMP_INCEPTION_DT) {
		PEMP_INCEPTION_DT = pEMP_INCEPTION_DT;
	}

	public Date getPEMP_INCEP_END_DT() {
		return PEMP_INCEP_END_DT;
	}

	public void setPEMP_INCEP_END_DT(Date pEMP_INCEP_END_DT) {
		PEMP_INCEP_END_DT = pEMP_INCEP_END_DT;
	}

	public Double getPEMP_INTEREST_RATE() {
		return PEMP_INTEREST_RATE;
	}

	public void setPEMP_INTEREST_RATE(Double pEMP_INTEREST_RATE) {
		PEMP_INTEREST_RATE = pEMP_INTEREST_RATE;
	}

	public String getPEMP_COVER_PREM_CHG_YN() {
		return PEMP_COVER_PREM_CHG_YN;
	}

	public void setPEMP_COVER_PREM_CHG_YN(String pEMP_COVER_PREM_CHG_YN) {
		PEMP_COVER_PREM_CHG_YN = pEMP_COVER_PREM_CHG_YN;
	}

	public String getPEMP_CVR_CODE1() {
		return PEMP_CVR_CODE1;
	}

	public void setPEMP_CVR_CODE1(String pEMP_CVR_CODE1) {
		PEMP_CVR_CODE1 = pEMP_CVR_CODE1;
	}

	public Double getPEMP_CVR_SA1() {
		return PEMP_CVR_SA1;
	}

	public void setPEMP_CVR_SA1(Double pEMP_CVR_SA1) {
		PEMP_CVR_SA1 = pEMP_CVR_SA1;
	}

	public String getPEMP_CVR_CODE2() {
		return PEMP_CVR_CODE2;
	}

	public void setPEMP_CVR_CODE2(String pEMP_CVR_CODE2) {
		PEMP_CVR_CODE2 = pEMP_CVR_CODE2;
	}

	public Double getPEMP_CVR_SA2() {
		return PEMP_CVR_SA2;
	}

	public void setPEMP_CVR_SA2(Double pEMP_CVR_SA2) {
		PEMP_CVR_SA2 = pEMP_CVR_SA2;
	}

	public String getPEMP_CVR_CODE3() {
		return PEMP_CVR_CODE3;
	}

	public void setPEMP_CVR_CODE3(String pEMP_CVR_CODE3) {
		PEMP_CVR_CODE3 = pEMP_CVR_CODE3;
	}

	public Double getPEMP_CVR_SA3() {
		return PEMP_CVR_SA3;
	}

	public void setPEMP_CVR_SA3(Double pEMP_CVR_SA3) {
		PEMP_CVR_SA3 = pEMP_CVR_SA3;
	}

	public String getPEMP_CVR_CODE4() {
		return PEMP_CVR_CODE4;
	}

	public void setPEMP_CVR_CODE4(String pEMP_CVR_CODE4) {
		PEMP_CVR_CODE4 = pEMP_CVR_CODE4;
	}

	public Double getPEMP_CVR_SA4() {
		return PEMP_CVR_SA4;
	}

	public void setPEMP_CVR_SA4(Double pEMP_CVR_SA4) {
		PEMP_CVR_SA4 = pEMP_CVR_SA4;
	}

	public String getPEMP_CVR_CODE5() {
		return PEMP_CVR_CODE5;
	}

	public void setPEMP_CVR_CODE5(String pEMP_CVR_CODE5) {
		PEMP_CVR_CODE5 = pEMP_CVR_CODE5;
	}

	public Double getPEMP_CVR_SA5() {
		return PEMP_CVR_SA5;
	}

	public void setPEMP_CVR_SA5(Double pEMP_CVR_SA5) {
		PEMP_CVR_SA5 = pEMP_CVR_SA5;
	}

	public Double getPEMP_FIXED_SA() {
		return PEMP_FIXED_SA;
	}

	public void setPEMP_FIXED_SA(Double pEMP_FIXED_SA) {
		PEMP_FIXED_SA = pEMP_FIXED_SA;
	}

	public Double getPEMP_NET_SAL() {
		return PEMP_NET_SAL;
	}

	public void setPEMP_NET_SAL(Double pEMP_NET_SAL) {
		PEMP_NET_SAL = pEMP_NET_SAL;
	}

	public String getPEMP_TYPE_LOAN() {
		return PEMP_TYPE_LOAN;
	}

	public void setPEMP_TYPE_LOAN(String pEMP_TYPE_LOAN) {
		PEMP_TYPE_LOAN = pEMP_TYPE_LOAN;
	}

	public String getPEMP_BANK_NAME() {
		return PEMP_BANK_NAME;
	}

	public void setPEMP_BANK_NAME(String pEMP_BANK_NAME) {
		PEMP_BANK_NAME = pEMP_BANK_NAME;
	}

	public String getPEMP_BRANCH_NAME() {
		return PEMP_BRANCH_NAME;
	}

	public void setPEMP_BRANCH_NAME(String pEMP_BRANCH_NAME) {
		PEMP_BRANCH_NAME = pEMP_BRANCH_NAME;
	}

	public String getPEMP_ACNT_NO() {
		return PEMP_ACNT_NO;
	}

	public void setPEMP_ACNT_NO(String pEMP_ACNT_NO) {
		PEMP_ACNT_NO = pEMP_ACNT_NO;
	}

	public Date getPEMP_EC_DOB() {
		return PEMP_EC_DOB;
	}

	public void setPEMP_EC_DOB(Date pEMP_EC_DOB) {
		PEMP_EC_DOB = pEMP_EC_DOB;
	}

	public Double getPEMP_MAN_FC_PREM() {
		return PEMP_MAN_FC_PREM;
	}

	public void setPEMP_MAN_FC_PREM(Double pEMP_MAN_FC_PREM) {
		PEMP_MAN_FC_PREM = pEMP_MAN_FC_PREM;
	}

}
