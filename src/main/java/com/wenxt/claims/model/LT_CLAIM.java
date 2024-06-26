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
@Table(name="LT_CLAIM")
public class LT_CLAIM {

		@Id
	  	@SequenceGenerator(name = "ClaimSysIdSeq", sequenceName = "CLM_SYS_ID_SEQ", allocationSize = 1)
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ClaimSysIdSeq")
	    @Column(name = "CLM_TRAN_ID")
	    private Integer CLM_TRAN_ID;

	    @Column(name = "CLM_POL_TRAN_ID")
	    private Integer CLM_POL_TRAN_ID;

	    @Column(name = "CLM_DIVN_CODE")
	    private String CLM_DIVN_CODE;

	    @Column(name = "CLM_DEPT_CODE")
	    private String CLM_DEPT_CODE;

	    @Column(name = "CLM_CLASS_CODE")
	    private String CLM_CLASS_CODE;

	    @Column(name = "CLM_UW_YEAR")
	    private Integer CLM_UW_YEAR;

	    @Column(name = "CLM_CDS_CODE")
	    private String CLM_CDS_CODE;

	    @Column(name = "CLM_CUST_CODE")
	    private String CLM_CUST_CODE;

	    @Column(name = "CLM_PEMP_ID")
	    private String CLM_PEMP_ID;

	    @Column(name = "CLM_CLAIM_NO")
	    private String CLM_CLAIM_NO;

	    @Column(name = "CLM_INWARD_CLM_REF_NO")
	    private String CLM_INWARD_CLM_REF_NO;

	    @Column(name = "CLM_POL_NO")
	    private String CLM_POL_NO;

	    @Column(name = "CLM_LOSS_DT")
	    private Date CLM_LOSS_DT;

	    @Column(name = "CLM_INTM_DT")
	    private Date CLM_INTM_DT;

	    @Column(name = "CLM_CURR_CODE")
	    private String CLM_CURR_CODE;

	    @Column(name = "CLM_CURR_RATE")
	    private Double CLM_CURR_RATE;

	    @Column(name = "CLM_TYPE")
	    private String CLM_TYPE;

	    @Column(name = "CLM_FC_EST_AMT")
	    private Double CLM_FC_EST_AMT;

	    @Column(name = "CLM_LC_EST_AMT")
	    private Double CLM_LC_EST_AMT;

	    @Column(name = "CLM_FC_PAID_AMT")
	    private Double CLM_FC_PAID_AMT;

	    @Column(name = "CLM_LC_PAID_AMT")
	    private Double CLM_LC_PAID_AMT;

	    @Column(name = "CLM_REMARKS")
	    private String CLM_REMARKS;

	    @Column(name = "CLM_CLOSE_FLAG")
	    private String CLM_CLOSE_FLAG;

	    @Column(name = "CLM_INS_DT")
	    private Date CLM_INS_DT;

	    @Column(name = "CLM_INS_ID")
	    private String CLM_INS_ID;

	    @Column(name = "CLM_MOD_DT")
	    private Date CLM_MOD_DT;

	    @Column(name = "CLM_MOD_ID")
	    private String CLM_MOD_ID;

	    @Column(name = "CLM_CLOSE_DT")
	    private Date CLM_CLOSE_DT;

	    @Column(name = "CLM_CLOSE_REASON")
	    private String CLM_CLOSE_REASON;

	    @Column(name = "CLM_REOPEN_DT")
	    private Date CLM_REOPEN_DT;

	    @Column(name = "CLM_REOPEN_REASON")
	    private String CLM_REOPEN_REASON;

	    @Column(name = "CLM_STATUS")
	    private String CLM_STATUS;

	    @Column(name = "CLM_LEGAL_YN")
	    private String CLM_LEGAL_YN;

	    @Column(name = "CLM_LEGAL_DTLS")
	    private String CLM_LEGAL_DTLS;

	    @Column(name = "CLM_ADDL_STATUS")
	    private String CLM_ADDL_STATUS;

	    @Column(name = "CLM_MASTER_POL_NO")
	    private String CLM_MASTER_POL_NO;

	    @Column(name = "CLM_POL_REN_COUNT")
	    private Integer CLM_POL_REN_COUNT;

	    @Column(name = "CLM_STATUS_CODE")
	    private String CLM_STATUS_CODE;

	    @Column(name = "CLM_REASON_CODE")
	    private String CLM_REASON_CODE;

	    @Column(name = "CLM_APPRV_STATUS")
	    private String CLM_APPRV_STATUS;

	    @Column(name = "CLM_APPRV_DT")
	    private Date CLM_APPRV_DT;

	    @Column(name = "CLM_APPRV_UID")
	    private String CLM_APPRV_UID;

	    @Column(name = "CLM_DP_YN")
	    private String CLM_DP_YN;

	    @Column(name = "CLM_MOD_OF_COMM")
	    private String CLM_MOD_OF_COMM;

	    @Column(name = "CLM_INFORMANT")
	    private String CLM_INFORMANT;

	    @Column(name = "CLM_ADDRESS1")
	    private String CLM_ADDRESS1;

	    @Column(name = "CLM_ADDRESS2")
	    private String CLM_ADDRESS2;

	    @Column(name = "CLM_ADDRESS3")
	    private String CLM_ADDRESS3;

	    @Column(name = "CLM_PHONE")
	    private String CLM_PHONE;

	    @Column(name = "CLM_MOBILE")
	    private String CLM_MOBILE;

	    @Column(name = "CLM_EMAIL")
	    private String CLM_EMAIL;

	    @Column(name = "CLM_RELATION")
	    private String CLM_RELATION;

	    @Column(name = "CLM_MED_CODE")
	    private String CLM_MED_CODE;

	    @Column(name = "CLM_MED_PRAC")
	    private String CLM_MED_PRAC;

	    @Column(name = "CLM_MED_PRAC_DTLS")
	    private String CLM_MED_PRAC_DTLS;

	    @Column(name = "CLM_ACCI_DATE")
	    private Date CLM_ACCI_DATE;

	    @Column(name = "CLM_STA_CODE")
	    private String CLM_STA_CODE;

	    @Column(name = "CLM_ACC_CODE")
	    private String CLM_ACC_CODE;

	    @Column(name = "CLM_ACCI_TIME")
	    private String CLM_ACCI_TIME;

	    @Column(name = "CLM_ACCI_DESC")
	    private String CLM_ACCI_DESC;

	    @Column(name = "CLM_ACCI_INJU")
	    private String CLM_ACCI_INJU;

	    @Column(name = "CLM_PLAN_CODE")
	    private String CLM_PLAN_CODE;

	    @Column(name = "CLM_HEAD_COUNT_VALUE")
	    private String CLM_HEAD_COUNT_VALUE;

	    @Column(name = "CLM_NEW_IC_NO")
	    private String CLM_NEW_IC_NO;

	    @Column(name = "CLM_OLD_IC_NO")
	    private String CLM_OLD_IC_NO;

	    @Column(name = "CLM_EMP_NAME")
	    private String CLM_EMP_NAME;

	    @Column(name = "CLM_PCI_REF_NO")
	    private String CLM_PCI_REF_NO;

	    @Column(name = "CLM_CATG_CODE")
	    private String CLM_CATG_CODE;

	    @Column(name = "CLM_OS_PREM_FLAG", columnDefinition = "VARCHAR2(1 BYTE) DEFAULT 'Y'")
	    private String CLM_OS_PREM_FLAG = "Y";

	    @Column(name = "CLM_INVEST")
	    private String CLM_INVEST;

	    @Column(name = "CLM_DISC")
	    private String CLM_DISC;

	    @Column(name = "CLM_MED_HIS")
	    private String CLM_MED_HIS;

	    @Column(name = "CLM_HSPTL")
	    private String CLM_HSPTL;

	    @Column(name = "CLM_CRIM_SUS")
	    private String CLM_CRIM_SUS;

	    @Column(name = "CLM_LITI")
	    private String CLM_LITI;

	    @Column(name = "CLM_EX_GRA")
	    private String CLM_EX_GRA;

	    @Column(name = "CLM_OTH_COV")
	    private String CLM_OTH_COV;

	    @Column(name = "CLM_LOAN_AMT")
	    private BigDecimal CLM_LOAN_AMT;

	    @Column(name = "CLM_ARREAR_AMT")
	    private Double CLM_ARREAR_AMT;

	    @Column(name = "CLM_DECL_AMT")
	    private Double CLM_DECL_AMT;

	    @Column(name = "CLM_PEMP_DESC")
	    private String CLM_PEMP_DESC;

	    @Column(name = "CLM_REF_NO")
	    private String CLM_REF_NO;

	    @Column(name = "CLM_FIN_PAID_YN", columnDefinition = "CHAR(1 BYTE) DEFAULT 'N'")
	    private String CLM_FIN_PAID_YN = "N";

	    @Column(name = "CLM_FIN_PAID_STATUS", columnDefinition = "CHAR(1 BYTE) DEFAULT 'O'")
	    private String CLM_FIN_PAID_STATUS = "O";
	    
	    @Column(name = "CLAIM_ASSR_CODE")
	    private String CLAIM_ASSR_CODE;
	    
	    @Column(name = "CLAIM_DISEASES_CODE")
	    private String CLAIM_DISEASES_CODE;
	    
	    @Column(name = "CLAIM_DISEASES_REMARKS")
	    private String CLAIM_DISEASES_REMARKS;
	    
	    @Column(name = "CLAIM_HOSP_ADDM_DT")
	    private Date CLAIM_HOSP_ADDM_DT;
	    
	    @Column(name = "CLAIM_HOSP_DSCHG_DT")
	    private Date CLAIM_HOSP_DSCHG_DT;
	    
	    @Column(name = "CLAIM_INT_EMAIL")
	    private String CLAIM_INT_EMAIL;
	    
	    @Column(name = "CLAIM_ASSRD_REF_ID1")
	    private String CLAIM_ASSRD_REF_ID1;
	    
	    @Column(name = "CLM_CH_TRAN_ID")
	    private Integer CLM_CH_TRAN_ID;
	    
	    @Column(name = "CLM_FRZ_YN")
	    private String CLM_FRZ_YN;

		public Integer getCLM_TRAN_ID() {
			return CLM_TRAN_ID;
		}

		public void setCLM_TRAN_ID(Integer cLM_TRAN_ID) {
			CLM_TRAN_ID = cLM_TRAN_ID;
		}

		public Integer getCLM_POL_TRAN_ID() {
			return CLM_POL_TRAN_ID;
		}

		public void setCLM_POL_TRAN_ID(Integer cLM_POL_TRAN_ID) {
			CLM_POL_TRAN_ID = cLM_POL_TRAN_ID;
		}

		public String getCLM_DIVN_CODE() {
			return CLM_DIVN_CODE;
		}

		public void setCLM_DIVN_CODE(String cLM_DIVN_CODE) {
			CLM_DIVN_CODE = cLM_DIVN_CODE;
		}

		public String getCLM_DEPT_CODE() {
			return CLM_DEPT_CODE;
		}

		public void setCLM_DEPT_CODE(String cLM_DEPT_CODE) {
			CLM_DEPT_CODE = cLM_DEPT_CODE;
		}

		public String getCLM_CLASS_CODE() {
			return CLM_CLASS_CODE;
		}

		public void setCLM_CLASS_CODE(String cLM_CLASS_CODE) {
			CLM_CLASS_CODE = cLM_CLASS_CODE;
		}

		public Integer getCLM_UW_YEAR() {
			return CLM_UW_YEAR;
		}

		public void setCLM_UW_YEAR(Integer cLM_UW_YEAR) {
			CLM_UW_YEAR = cLM_UW_YEAR;
		}

		public String getCLM_CDS_CODE() {
			return CLM_CDS_CODE;
		}

		public void setCLM_CDS_CODE(String cLM_CDS_CODE) {
			CLM_CDS_CODE = cLM_CDS_CODE;
		}

		public String getCLM_CUST_CODE() {
			return CLM_CUST_CODE;
		}

		public void setCLM_CUST_CODE(String cLM_CUST_CODE) {
			CLM_CUST_CODE = cLM_CUST_CODE;
		}

		public String getCLM_PEMP_ID() {
			return CLM_PEMP_ID;
		}

		public void setCLM_PEMP_ID(String cLM_PEMP_ID) {
			CLM_PEMP_ID = cLM_PEMP_ID;
		}

		public String getCLM_CLAIM_NO() {
			return CLM_CLAIM_NO;
		}

		public void setCLM_CLAIM_NO(String cLM_CLAIM_NO) {
			CLM_CLAIM_NO = cLM_CLAIM_NO;
		}

		public String getCLM_INWARD_CLM_REF_NO() {
			return CLM_INWARD_CLM_REF_NO;
		}

		public void setCLM_INWARD_CLM_REF_NO(String cLM_INWARD_CLM_REF_NO) {
			CLM_INWARD_CLM_REF_NO = cLM_INWARD_CLM_REF_NO;
		}

		public String getCLM_POL_NO() {
			return CLM_POL_NO;
		}

		public void setCLM_POL_NO(String cLM_POL_NO) {
			CLM_POL_NO = cLM_POL_NO;
		}

		public Date getCLM_LOSS_DT() {
			return CLM_LOSS_DT;
		}

		public void setCLM_LOSS_DT(Date cLM_LOSS_DT) {
			CLM_LOSS_DT = cLM_LOSS_DT;
		}

		public Date getCLM_INTM_DT() {
			return CLM_INTM_DT;
		}

		public void setCLM_INTM_DT(Date cLM_INTM_DT) {
			CLM_INTM_DT = cLM_INTM_DT;
		}

		public String getCLM_CURR_CODE() {
			return CLM_CURR_CODE;
		}

		public void setCLM_CURR_CODE(String cLM_CURR_CODE) {
			CLM_CURR_CODE = cLM_CURR_CODE;
		}

		public Double getCLM_CURR_RATE() {
			return CLM_CURR_RATE;
		}

		public void setCLM_CURR_RATE(Double cLM_CURR_RATE) {
			CLM_CURR_RATE = cLM_CURR_RATE;
		}

		public String getCLM_TYPE() {
			return CLM_TYPE;
		}

		public void setCLM_TYPE(String cLM_TYPE) {
			CLM_TYPE = cLM_TYPE;
		}

		public Double getCLM_FC_EST_AMT() {
			return CLM_FC_EST_AMT;
		}

		public void setCLM_FC_EST_AMT(Double cLM_FC_EST_AMT) {
			CLM_FC_EST_AMT = cLM_FC_EST_AMT;
		}

		public Double getCLM_LC_EST_AMT() {
			return CLM_LC_EST_AMT;
		}

		public void setCLM_LC_EST_AMT(Double cLM_LC_EST_AMT) {
			CLM_LC_EST_AMT = cLM_LC_EST_AMT;
		}

		public Double getCLM_FC_PAID_AMT() {
			return CLM_FC_PAID_AMT;
		}

		public void setCLM_FC_PAID_AMT(Double cLM_FC_PAID_AMT) {
			CLM_FC_PAID_AMT = cLM_FC_PAID_AMT;
		}

		public Double getCLM_LC_PAID_AMT() {
			return CLM_LC_PAID_AMT;
		}

		public void setCLM_LC_PAID_AMT(Double cLM_LC_PAID_AMT) {
			CLM_LC_PAID_AMT = cLM_LC_PAID_AMT;
		}

		public String getCLM_REMARKS() {
			return CLM_REMARKS;
		}

		public void setCLM_REMARKS(String cLM_REMARKS) {
			CLM_REMARKS = cLM_REMARKS;
		}

		public String getCLM_CLOSE_FLAG() {
			return CLM_CLOSE_FLAG;
		}

		public void setCLM_CLOSE_FLAG(String cLM_CLOSE_FLAG) {
			CLM_CLOSE_FLAG = cLM_CLOSE_FLAG;
		}

		public Date getCLM_INS_DT() {
			return CLM_INS_DT;
		}

		public void setCLM_INS_DT(Date cLM_INS_DT) {
			CLM_INS_DT = cLM_INS_DT;
		}

		public String getCLM_INS_ID() {
			return CLM_INS_ID;
		}

		public void setCLM_INS_ID(String cLM_INS_ID) {
			CLM_INS_ID = cLM_INS_ID;
		}

		public Date getCLM_MOD_DT() {
			return CLM_MOD_DT;
		}

		public void setCLM_MOD_DT(Date cLM_MOD_DT) {
			CLM_MOD_DT = cLM_MOD_DT;
		}

		public String getCLM_MOD_ID() {
			return CLM_MOD_ID;
		}

		public void setCLM_MOD_ID(String cLM_MOD_ID) {
			CLM_MOD_ID = cLM_MOD_ID;
		}

		public Date getCLM_CLOSE_DT() {
			return CLM_CLOSE_DT;
		}

		public void setCLM_CLOSE_DT(Date cLM_CLOSE_DT) {
			CLM_CLOSE_DT = cLM_CLOSE_DT;
		}

		public String getCLM_CLOSE_REASON() {
			return CLM_CLOSE_REASON;
		}

		public void setCLM_CLOSE_REASON(String cLM_CLOSE_REASON) {
			CLM_CLOSE_REASON = cLM_CLOSE_REASON;
		}

		public Date getCLM_REOPEN_DT() {
			return CLM_REOPEN_DT;
		}

		public void setCLM_REOPEN_DT(Date cLM_REOPEN_DT) {
			CLM_REOPEN_DT = cLM_REOPEN_DT;
		}

		public String getCLM_REOPEN_REASON() {
			return CLM_REOPEN_REASON;
		}

		public void setCLM_REOPEN_REASON(String cLM_REOPEN_REASON) {
			CLM_REOPEN_REASON = cLM_REOPEN_REASON;
		}

		public String getCLM_STATUS() {
			return CLM_STATUS;
		}

		public void setCLM_STATUS(String cLM_STATUS) {
			CLM_STATUS = cLM_STATUS;
		}

		public String getCLM_LEGAL_YN() {
			return CLM_LEGAL_YN;
		}

		public void setCLM_LEGAL_YN(String cLM_LEGAL_YN) {
			CLM_LEGAL_YN = cLM_LEGAL_YN;
		}

		public String getCLM_LEGAL_DTLS() {
			return CLM_LEGAL_DTLS;
		}

		public void setCLM_LEGAL_DTLS(String cLM_LEGAL_DTLS) {
			CLM_LEGAL_DTLS = cLM_LEGAL_DTLS;
		}

		public String getCLM_ADDL_STATUS() {
			return CLM_ADDL_STATUS;
		}

		public void setCLM_ADDL_STATUS(String cLM_ADDL_STATUS) {
			CLM_ADDL_STATUS = cLM_ADDL_STATUS;
		}

		public String getCLM_MASTER_POL_NO() {
			return CLM_MASTER_POL_NO;
		}

		public void setCLM_MASTER_POL_NO(String cLM_MASTER_POL_NO) {
			CLM_MASTER_POL_NO = cLM_MASTER_POL_NO;
		}

		public Integer getCLM_POL_REN_COUNT() {
			return CLM_POL_REN_COUNT;
		}

		public void setCLM_POL_REN_COUNT(Integer cLM_POL_REN_COUNT) {
			CLM_POL_REN_COUNT = cLM_POL_REN_COUNT;
		}

		public String getCLM_STATUS_CODE() {
			return CLM_STATUS_CODE;
		}

		public void setCLM_STATUS_CODE(String cLM_STATUS_CODE) {
			CLM_STATUS_CODE = cLM_STATUS_CODE;
		}

		public String getCLM_REASON_CODE() {
			return CLM_REASON_CODE;
		}

		public void setCLM_REASON_CODE(String cLM_REASON_CODE) {
			CLM_REASON_CODE = cLM_REASON_CODE;
		}

		public String getCLM_APPRV_STATUS() {
			return CLM_APPRV_STATUS;
		}

		public void setCLM_APPRV_STATUS(String cLM_APPRV_STATUS) {
			CLM_APPRV_STATUS = cLM_APPRV_STATUS;
		}

		public Date getCLM_APPRV_DT() {
			return CLM_APPRV_DT;
		}

		public void setCLM_APPRV_DT(Date cLM_APPRV_DT) {
			CLM_APPRV_DT = cLM_APPRV_DT;
		}

		public String getCLM_APPRV_UID() {
			return CLM_APPRV_UID;
		}

		public void setCLM_APPRV_UID(String cLM_APPRV_UID) {
			CLM_APPRV_UID = cLM_APPRV_UID;
		}

		public String getCLM_DP_YN() {
			return CLM_DP_YN;
		}

		public void setCLM_DP_YN(String cLM_DP_YN) {
			CLM_DP_YN = cLM_DP_YN;
		}

		public String getCLM_MOD_OF_COMM() {
			return CLM_MOD_OF_COMM;
		}

		public void setCLM_MOD_OF_COMM(String cLM_MOD_OF_COMM) {
			CLM_MOD_OF_COMM = cLM_MOD_OF_COMM;
		}

		public String getCLM_INFORMANT() {
			return CLM_INFORMANT;
		}

		public void setCLM_INFORMANT(String cLM_INFORMANT) {
			CLM_INFORMANT = cLM_INFORMANT;
		}

		public String getCLM_ADDRESS1() {
			return CLM_ADDRESS1;
		}

		public void setCLM_ADDRESS1(String cLM_ADDRESS1) {
			CLM_ADDRESS1 = cLM_ADDRESS1;
		}

		public String getCLM_ADDRESS2() {
			return CLM_ADDRESS2;
		}

		public void setCLM_ADDRESS2(String cLM_ADDRESS2) {
			CLM_ADDRESS2 = cLM_ADDRESS2;
		}

		public String getCLM_ADDRESS3() {
			return CLM_ADDRESS3;
		}

		public void setCLM_ADDRESS3(String cLM_ADDRESS3) {
			CLM_ADDRESS3 = cLM_ADDRESS3;
		}

		public String getCLM_PHONE() {
			return CLM_PHONE;
		}

		public void setCLM_PHONE(String cLM_PHONE) {
			CLM_PHONE = cLM_PHONE;
		}

		public String getCLM_MOBILE() {
			return CLM_MOBILE;
		}

		public void setCLM_MOBILE(String cLM_MOBILE) {
			CLM_MOBILE = cLM_MOBILE;
		}

		public String getCLM_EMAIL() {
			return CLM_EMAIL;
		}

		public void setCLM_EMAIL(String cLM_EMAIL) {
			CLM_EMAIL = cLM_EMAIL;
		}

		public String getCLM_RELATION() {
			return CLM_RELATION;
		}

		public void setCLM_RELATION(String cLM_RELATION) {
			CLM_RELATION = cLM_RELATION;
		}

		public String getCLM_MED_CODE() {
			return CLM_MED_CODE;
		}

		public void setCLM_MED_CODE(String cLM_MED_CODE) {
			CLM_MED_CODE = cLM_MED_CODE;
		}

		public String getCLM_MED_PRAC() {
			return CLM_MED_PRAC;
		}

		public void setCLM_MED_PRAC(String cLM_MED_PRAC) {
			CLM_MED_PRAC = cLM_MED_PRAC;
		}

		public String getCLM_MED_PRAC_DTLS() {
			return CLM_MED_PRAC_DTLS;
		}

		public void setCLM_MED_PRAC_DTLS(String cLM_MED_PRAC_DTLS) {
			CLM_MED_PRAC_DTLS = cLM_MED_PRAC_DTLS;
		}

		public Date getCLM_ACCI_DATE() {
			return CLM_ACCI_DATE;
		}

		public void setCLM_ACCI_DATE(Date cLM_ACCI_DATE) {
			CLM_ACCI_DATE = cLM_ACCI_DATE;
		}

		public String getCLM_STA_CODE() {
			return CLM_STA_CODE;
		}

		public void setCLM_STA_CODE(String cLM_STA_CODE) {
			CLM_STA_CODE = cLM_STA_CODE;
		}

		public String getCLM_ACC_CODE() {
			return CLM_ACC_CODE;
		}

		public void setCLM_ACC_CODE(String cLM_ACC_CODE) {
			CLM_ACC_CODE = cLM_ACC_CODE;
		}

		public String getCLM_ACCI_TIME() {
			return CLM_ACCI_TIME;
		}

		public void setCLM_ACCI_TIME(String cLM_ACCI_TIME) {
			CLM_ACCI_TIME = cLM_ACCI_TIME;
		}

		public String getCLM_ACCI_DESC() {
			return CLM_ACCI_DESC;
		}

		public void setCLM_ACCI_DESC(String cLM_ACCI_DESC) {
			CLM_ACCI_DESC = cLM_ACCI_DESC;
		}

		public String getCLM_ACCI_INJU() {
			return CLM_ACCI_INJU;
		}

		public void setCLM_ACCI_INJU(String cLM_ACCI_INJU) {
			CLM_ACCI_INJU = cLM_ACCI_INJU;
		}

		public String getCLM_PLAN_CODE() {
			return CLM_PLAN_CODE;
		}

		public void setCLM_PLAN_CODE(String cLM_PLAN_CODE) {
			CLM_PLAN_CODE = cLM_PLAN_CODE;
		}

		public String getCLM_HEAD_COUNT_VALUE() {
			return CLM_HEAD_COUNT_VALUE;
		}

		public void setCLM_HEAD_COUNT_VALUE(String cLM_HEAD_COUNT_VALUE) {
			CLM_HEAD_COUNT_VALUE = cLM_HEAD_COUNT_VALUE;
		}

		public String getCLM_NEW_IC_NO() {
			return CLM_NEW_IC_NO;
		}

		public void setCLM_NEW_IC_NO(String cLM_NEW_IC_NO) {
			CLM_NEW_IC_NO = cLM_NEW_IC_NO;
		}

		public String getCLM_OLD_IC_NO() {
			return CLM_OLD_IC_NO;
		}

		public void setCLM_OLD_IC_NO(String cLM_OLD_IC_NO) {
			CLM_OLD_IC_NO = cLM_OLD_IC_NO;
		}

		public String getCLM_EMP_NAME() {
			return CLM_EMP_NAME;
		}

		public void setCLM_EMP_NAME(String cLM_EMP_NAME) {
			CLM_EMP_NAME = cLM_EMP_NAME;
		}

		public String getCLM_PCI_REF_NO() {
			return CLM_PCI_REF_NO;
		}

		public void setCLM_PCI_REF_NO(String cLM_PCI_REF_NO) {
			CLM_PCI_REF_NO = cLM_PCI_REF_NO;
		}

		public String getCLM_CATG_CODE() {
			return CLM_CATG_CODE;
		}

		public void setCLM_CATG_CODE(String cLM_CATG_CODE) {
			CLM_CATG_CODE = cLM_CATG_CODE;
		}

		public String getCLM_OS_PREM_FLAG() {
			return CLM_OS_PREM_FLAG;
		}

		public void setCLM_OS_PREM_FLAG(String cLM_OS_PREM_FLAG) {
			CLM_OS_PREM_FLAG = cLM_OS_PREM_FLAG;
		}

		public String getCLM_INVEST() {
			return CLM_INVEST;
		}

		public void setCLM_INVEST(String cLM_INVEST) {
			CLM_INVEST = cLM_INVEST;
		}

		public String getCLM_DISC() {
			return CLM_DISC;
		}

		public void setCLM_DISC(String cLM_DISC) {
			CLM_DISC = cLM_DISC;
		}

		public String getCLM_MED_HIS() {
			return CLM_MED_HIS;
		}

		public void setCLM_MED_HIS(String cLM_MED_HIS) {
			CLM_MED_HIS = cLM_MED_HIS;
		}

		public String getCLM_HSPTL() {
			return CLM_HSPTL;
		}

		public void setCLM_HSPTL(String cLM_HSPTL) {
			CLM_HSPTL = cLM_HSPTL;
		}

		public String getCLM_CRIM_SUS() {
			return CLM_CRIM_SUS;
		}

		public void setCLM_CRIM_SUS(String cLM_CRIM_SUS) {
			CLM_CRIM_SUS = cLM_CRIM_SUS;
		}

		public String getCLM_LITI() {
			return CLM_LITI;
		}

		public void setCLM_LITI(String cLM_LITI) {
			CLM_LITI = cLM_LITI;
		}

		public String getCLM_EX_GRA() {
			return CLM_EX_GRA;
		}

		public void setCLM_EX_GRA(String cLM_EX_GRA) {
			CLM_EX_GRA = cLM_EX_GRA;
		}

		public String getCLM_OTH_COV() {
			return CLM_OTH_COV;
		}

		public void setCLM_OTH_COV(String cLM_OTH_COV) {
			CLM_OTH_COV = cLM_OTH_COV;
		}

		public BigDecimal getCLM_LOAN_AMT() {
			return CLM_LOAN_AMT;
		}

		public void setCLM_LOAN_AMT(BigDecimal cLM_LOAN_AMT) {
			CLM_LOAN_AMT = cLM_LOAN_AMT;
		}

		public Double getCLM_ARREAR_AMT() {
			return CLM_ARREAR_AMT;
		}

		public void setCLM_ARREAR_AMT(Double cLM_ARREAR_AMT) {
			CLM_ARREAR_AMT = cLM_ARREAR_AMT;
		}

		public Double getCLM_DECL_AMT() {
			return CLM_DECL_AMT;
		}

		public void setCLM_DECL_AMT(Double cLM_DECL_AMT) {
			CLM_DECL_AMT = cLM_DECL_AMT;
		}

		public String getCLM_PEMP_DESC() {
			return CLM_PEMP_DESC;
		}

		public void setCLM_PEMP_DESC(String cLM_PEMP_DESC) {
			CLM_PEMP_DESC = cLM_PEMP_DESC;
		}

		public String getCLM_REF_NO() {
			return CLM_REF_NO;
		}

		public void setCLM_REF_NO(String cLM_REF_NO) {
			CLM_REF_NO = cLM_REF_NO;
		}

		public String getCLM_FIN_PAID_YN() {
			return CLM_FIN_PAID_YN;
		}

		public void setCLM_FIN_PAID_YN(String cLM_FIN_PAID_YN) {
			CLM_FIN_PAID_YN = cLM_FIN_PAID_YN;
		}

		public String getCLM_FIN_PAID_STATUS() {
			return CLM_FIN_PAID_STATUS;
		}

		public void setCLM_FIN_PAID_STATUS(String cLM_FIN_PAID_STATUS) {
			CLM_FIN_PAID_STATUS = cLM_FIN_PAID_STATUS;
		}

		public String getCLAIM_ASSR_CODE() {
			return CLAIM_ASSR_CODE;
		}

		public void setCLAIM_ASSR_CODE(String cLAIM_ASSR_CODE) {
			CLAIM_ASSR_CODE = cLAIM_ASSR_CODE;
		}

		public String getCLAIM_DISEASES_CODE() {
			return CLAIM_DISEASES_CODE;
		}

		public void setCLAIM_DISEASES_CODE(String cLAIM_DISEASES_CODE) {
			CLAIM_DISEASES_CODE = cLAIM_DISEASES_CODE;
		}

		public String getCLAIM_DISEASES_REMARKS() {
			return CLAIM_DISEASES_REMARKS;
		}

		public void setCLAIM_DISEASES_REMARKS(String cLAIM_DISEASES_REMARKS) {
			CLAIM_DISEASES_REMARKS = cLAIM_DISEASES_REMARKS;
		}

		public Date getCLAIM_HOSP_ADDM_DT() {
			return CLAIM_HOSP_ADDM_DT;
		}

		public void setCLAIM_HOSP_ADDM_DT(Date cLAIM_HOSP_ADDM_DT) {
			CLAIM_HOSP_ADDM_DT = cLAIM_HOSP_ADDM_DT;
		}

		public Date getCLAIM_HOSP_DSCHG_DT() {
			return CLAIM_HOSP_DSCHG_DT;
		}

		public void setCLAIM_HOSP_DSCHG_DT(Date cLAIM_HOSP_DSCHG_DT) {
			CLAIM_HOSP_DSCHG_DT = cLAIM_HOSP_DSCHG_DT;
		}

		public String getCLAIM_INT_EMAIL() {
			return CLAIM_INT_EMAIL;
		}

		public void setCLAIM_INT_EMAIL(String cLAIM_INT_EMAIL) {
			CLAIM_INT_EMAIL = cLAIM_INT_EMAIL;
		}

		public String getCLAIM_ASSRD_REF_ID1() {
			return CLAIM_ASSRD_REF_ID1;
		}

		public void setCLAIM_ASSRD_REF_ID1(String cLAIM_ASSRD_REF_ID1) {
			CLAIM_ASSRD_REF_ID1 = cLAIM_ASSRD_REF_ID1;
		}

		public Integer getCLM_CH_TRAN_ID() {
			return CLM_CH_TRAN_ID;
		}

		public void setCLM_CH_TRAN_ID(Integer cLM_CH_TRAN_ID) {
			CLM_CH_TRAN_ID = cLM_CH_TRAN_ID;
		}

		public String getCLM_FRZ_YN() {
			return CLM_FRZ_YN;
		}

		public void setCLM_FRZ_YN(String cLM_FRZ_YN) {
			CLM_FRZ_YN = cLM_FRZ_YN;
		}

   
}
