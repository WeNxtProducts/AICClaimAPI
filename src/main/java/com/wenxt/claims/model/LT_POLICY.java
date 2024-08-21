package com.wenxt.claims.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_POLICY", schema = "LIFE_DEV")
public class LT_POLICY implements Serializable{
	 
    @Id
    @SequenceGenerator(name = "PolicyTranIdSeq", sequenceName = "POL_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PolicyTranIdSeq")
    @Column(name = "POL_TRAN_ID")
    private Long POL_TRAN_ID;

    @Column(name = "POL_DIVN_CODE")
    private String POL_DIVN_CODE;

    @Column(name = "POL_DEPT_CODE")
    private String POL_DEPT_CODE;

    @Column(name = "POL_CLASS_CODE")
    private String POL_CLASS_CODE;

    @Column(name = "POL_DS_TYPE")
    private String POL_DS_TYPE;

    @Column(name = "POL_DS_CODE")
    private String POL_DS_CODE;

    @Column(name = "POL_QUOT_TRAN_ID")
    private Long POL_QUOT_TRAN_ID;

    @Column(name = "POL_QUOT_NO")
    private String POL_QUOT_NO;

    @Column(name = "POL_TL_COVER_CODE")
    private String POL_TL_COVER_CODE;

    @Column(name = "POL_NO")
    private String POL_NO;

    @Column(name = "POL_ISSUE_DT")
    private Date POL_ISSUE_DT;

    @Column(name = "POL_UW_YEAR")
    private Integer POL_UW_YEAR;

    @Column(name = "POL_CUST_CODE")
    private String POL_CUST_CODE;

    @Column(name = "POL_CUST_NAME")
    private String POL_CUST_NAME;

    @Column(name = "POL_CUST_ADDRESS_1")
    private String POL_CUST_ADDRESS_1;

    @Column(name = "POL_CUST_ADDRESS_2")
    private String POL_CUST_ADDRESS_2;

    @Column(name = "POL_CUST_ADDRESS_3")
    private String POL_CUST_ADDRESS_3;

    @Column(name = "POL_BUS_NATURE")
    private String POL_BUS_NATURE;

    @Column(name = "POL_SA_CURR_CODE")
    private String POL_SA_CURR_CODE;

    @Column(name = "POL_SA_EXCH_RATE")
    private Integer POL_SA_EXCH_RATE;

    @Column(name = "POL_CUST_CURR_CODE")
    private String POL_CUST_CURR_CODE;

    @Column(name = "POL_CUST_EXCH_RATE")
    private Integer POL_CUST_EXCH_RATE;

    @Column(name = "POL_FM_DT")
    private Date POL_FM_DT;

    @Column(name = "POL_TO_DT")
    private Date POL_TO_DT;

    @Column(name = "POL_NO_OF_EMP")
    private Integer POL_NO_OF_EMP;

    @Column(name = "POL_SA_FACTOR_FLAG")
    private String POL_SA_FACTOR_FLAG;

    @Column(name = "POL_SA_FACTOR_VALUE")
    private Integer POL_SA_FACTOR_VALUE;

    @Column(name = "POL_FC_SA_LUMPSUM_AMT")
    private Double POL_FC_SA_LUMPSUM_AMT;

    @Column(name = "POL_LC_SA_LUMPSUM_AMT")
    private Double POL_LC_SA_LUMPSUM_AMT;

    @Column(name = "POL_FC_MIN_VALUE")
    private Double POL_FC_MIN_VALUE;

    @Column(name = "POL_LC_MIN_VALUE")
    private Double POL_LC_MIN_VALUE;

    @Column(name = "POL_FC_MAX_VALUE")
    private Double POL_FC_MAX_VALUE;

    @Column(name = "POL_LC_MAX_VALUE")
    private Double POL_LC_MAX_VALUE;

    @Column(name = "POL_FC_FREE_COVER_LIMIT")
    private Double POL_FC_FREE_COVER_LIMIT;

    @Column(name = "POL_LC_FREE_COVER_LIMIT")
    private Double POL_LC_FREE_COVER_LIMIT;

    @Column(name = "POL_FC_SA")
    private Double POL_FC_SA;

    @Column(name = "POL_LC_SA")
    private Double POL_LC_SA;

    @Column(name = "POL_GROSS_RATE")
    private Double POL_GROSS_RATE;

    @Column(name = "POL_NET_RATE")
    private Double POL_NET_RATE;

    @Column(name = "POL_FC_PREM")
    private Double POL_FC_PREM;

    @Column(name = "POL_LC_PREM")
    private Double POL_LC_PREM;

    @Column(name = "POL_FC_CHARGE")
    private Double POL_FC_CHARGE;

    @Column(name = "POL_LC_CHARGE")
    private Double POL_LC_CHARGE;

    @Column(name = "POL_FC_COMM")
    private Double POL_FC_COMM;

    @Column(name = "POL_LC_COMM")
    private Double POL_LC_COMM;

    @Column(name = "POL_AGE_FACTOR")
    private Double POL_AGE_FACTOR;

    @Column(name = "POL_EXPERIENCE_FACTOR")
    private Double POL_EXPERIENCE_FACTOR;

    @Column(name = "POL_PRO_SHR_LOAD_PERC")
    private Double POL_PRO_SHR_LOAD_PERC;

    @Column(name = "POL_EXC_MAR_LOAD_PERC")
    private Double POL_EXC_MAR_LOAD_PERC;

    @Column(name = "POL_QUAR_RATE_YN")
    private String POL_QUAR_RATE_YN;

    @Column(name = "POL_FC_EXTRA_PREM")
    private Double POL_FC_EXTRA_PREM;

    @Column(name = "POL_LC_EXTRA_PREM")
    private Double POL_LC_EXTRA_PREM;

    @Column(name = "POL_DISC_PERC")
    private Double POL_DISC_PERC;

    @Column(name = "POL_FC_DISC")
    private Double POL_FC_DISC;

    @Column(name = "POL_LC_DISC")
    private Double POL_LC_DISC;

    @Column(name = "POL_GUAR_RATE_YN")
    private String POL_GUAR_RATE_YN;

    @Column(name = "POL_GUAR_YEARS")
    private Integer POL_GUAR_YEARS;

    @Column(name = "POL_GUAR_LOAD_PERC")
    private Double POL_GUAR_LOAD_PERC;

    @Column(name = "POL_FREEZE_RATE")
    private String POL_FREEZE_RATE;

    @Column(name = "POL_RETAIN_RATE")
    private String POL_RETAIN_RATE;

    @Column(name = "POL_FAC_YN")
    private String POL_FAC_YN;

    @Column(name = "POL_COINS_YN")
    private String POL_COINS_YN;

    @Column(name = "POL_STATUS")
    private String POL_STATUS;

    @Column(name = "POL_APPRV_STATUS")
    private String POL_APPRV_STATUS;

    @Column(name = "POL_APPRV_DT")
    private Date POL_APPRV_DT;

    @Column(name = "POL_FAC_CLOSE_FLAG")
    private String POL_FAC_CLOSE_FLAG;

    @Column(name = "POL_RI_CLOSE_FLAG")
    private String POL_RI_CLOSE_FLAG;

    @Column(name = "POL_END_TYPE")
    private String POL_END_TYPE;

    @Column(name = "POL_END_CODE")
    private String POL_END_CODE;

    @Column(name = "POL_END_NO")
    private String POL_END_NO;

    @Column(name = "POL_END_NO_IDX")
    private Integer POL_END_NO_IDX;

    @Column(name = "POL_END_DT")
    private Date POL_END_DT;

    @Column(name = "POL_END_EFF_FM_DT")
    private Date POL_END_EFF_FM_DT;

    @Column(name = "POL_END_EFF_TO_DT")
    private Date POL_END_EFF_TO_DT;

    @Column(name = "POL_END_DESC")
    private String POL_END_DESC;

    @Column(name = "POL_ORG_FC_SA")
    private Double POL_ORG_FC_SA;

    @Column(name = "POL_ORG_LC_SA")
    private Double POL_ORG_LC_SA;

    @Column(name = "POL_ORG_GROSS_RATE")
    private Double POL_ORG_GROSS_RATE;

    @Column(name = "POL_ORG_NET_RATE")
    private Double POL_ORG_NET_RATE;

    @Column(name = "POL_ORG_FC_PREM")
    private Double POL_ORG_FC_PREM;

    @Column(name = "POL_ORG_LC_PREM")
    private Double POL_ORG_LC_PREM;

    @Column(name = "POL_ORG_NO_OF_EMP")
    private Integer POL_ORG_NO_OF_EMP;

    @Column(name = "POL_ORG_FC_EXTRA_PREM")
    private Double POL_ORG_FC_EXTRA_PREM;

    @Column(name = "POL_ORG_LC_EXTRA_PREM")
    private Double POL_ORG_LC_EXTRA_PREM;

    @Column(name = "POL_ORG_FC_DISC")
    private Double POL_ORG_FC_DISC;

    @Column(name = "POL_ORG_LC_DISC")
    private Double POL_ORG_LC_DISC;

    @Column(name = "POL_ORG_FC_CHARGE")
    private Double POL_ORG_FC_CHARGE;

    @Column(name = "POL_ORG_LC_CHARGE")
    private Double POL_ORG_LC_CHARGE;

    @Column(name = "POL_INS_DT")
    private Date POL_INS_DT;

    @Column(name = "POL_INS_ID")
    private String POL_INS_ID;

    @Column(name = "POL_MOD_DT")
    private Date POL_MOD_DT;

    @Column(name = "POL_MOD_ID")
    private String POL_MOD_ID;

    @Column(name = "POL_EXCL_ACC_DEATH_YN")
    private String POL_EXCL_ACC_DEATH_YN;

    @Column(name = "POL_PRINT_STATUS")
    private String POL_PRINT_STATUS;

    @Column(name = "POL_SUMMARY_YN")
    private String POL_SUMMARY_YN;

    @Column(name = "POL_DISC_CODE")
    private String POL_DISC_CODE;

    @Column(name = "POL_DISC_RATE")
    private Double POL_DISC_RATE;

    @Column(name = "POL_TOT_NET_RATE")
    private Double POL_TOT_NET_RATE;

    @Column(name = "POL_CREDIT_YN")
    private String POL_CREDIT_YN;

    @Column(name = "POL_CREDIT_MONTH_RATE_YN")
    private String POL_CREDIT_MONTH_RATE_YN;

    @Column(name = "POL_REMARKS")
    private String POL_REMARKS;

    @Column(name = "POL_LOAD_PERC")
    private Double POL_LOAD_PERC;

    @Column(name = "POL_RI_BASIS")
    private String POL_RI_BASIS;

    @Column(name = "POL_ASSR_CODE")
    private String POL_ASSR_CODE;

    @Column(name = "POL_CLM_INTM_DAYS")
    private Integer POL_CLM_INTM_DAYS;

    @Column(name = "POL_ASSURED_NAME")
    private String POL_ASSURED_NAME;

    @Column(name = "POL_BROK_ADMIN_CHG_CODE")
    private String POL_BROK_ADMIN_CHG_CODE;

    @Column(name = "POL_FC_BROK_ADMIN_CHARGE")
    private Double POL_FC_BROK_ADMIN_CHARGE;

    @Column(name = "POL_LC_BROK_ADMIN_CHARGE")
    private Double POL_LC_BROK_ADMIN_CHARGE;

    @Column(name = "POL_BROK_ADMIN_CHG_PERC")
    private Double POL_BROK_ADMIN_CHG_PERC;

    @Column(name = "POL_CREDIT_DICOUNT_PERC")
    private Double POL_CREDIT_DICOUNT_PERC;

    @Column(name = "POL_GROSS_FC_PREM")
    private Double POL_GROSS_FC_PREM;

    @Column(name = "POL_GROSS_LC_PREM")
    private Double POL_GROSS_LC_PREM;

    @Column(name = "POL_QUOT_DT")
    private Date POL_QUOT_DT;

    @Column(name = "POL_CLM_EXP_YN")
    private String POL_CLM_EXP_YN;

    @Column(name = "POL_WO_CLM_NET_RATE")
    private Double POL_WO_CLM_NET_RATE;

    @Column(name = "POL_CLM_EXP_CALC")
    private String POL_CLM_EXP_CALC;

    @Column(name = "POL_FAC_BASIS")
    private Integer POL_FAC_BASIS;

    @Column(name = "POL_EMP_SUMMARY_YN")
    private String POL_EMP_SUMMARY_YN;

    @Column(name = "POL_FC_ANN_SAL")
    private Double POL_FC_ANN_SAL;

    @Column(name = "POL_LC_ANN_SAL")
    private Double POL_LC_ANN_SAL;

    @Column(name = "POL_PROD_CODE")
    private String POL_PROD_CODE;

    @Column(name = "POL_RATING_BASIS")
    private String POL_RATING_BASIS;

    @Column(name = "POL_FC_DEPOSIT_PREM")
    private Double POL_FC_DEPOSIT_PREM;

    @Column(name = "POL_LC_DEPOSIT_PREM")
    private Double POL_LC_DEPOSIT_PREM;

    @Column(name = "POL_BANK_CODE")
    private String POL_BANK_CODE;

    @Column(name = "POL_SRC_OF_BUS")
    private String POL_SRC_OF_BUS;

    @Column(name = "POL_SRV_OFF_CODE")
    private String POL_SRV_OFF_CODE;

    @Column(name = "POL_ADDL_STAT")
    private String POL_ADDL_STAT;

    @Column(name = "POL_TAKE_OVER_FLAG")
    private String POL_TAKE_OVER_FLAG;

    @Column(name = "POL_LC_TAKE_OVER_FCL")
    private Double POL_LC_TAKE_OVER_FCL;

    @Column(name = "POL_EMP_EXIT_FLAG")
    private String POL_EMP_EXIT_FLAG;

    @Column(name = "POL_PROP_QUOT_FLAG")
    private String POL_PROP_QUOT_FLAG;

    @Column(name = "POL_ORG_LC_TAKE_OVER_FCL")
    private Double POL_ORG_LC_TAKE_OVER_FCL;

    @Column(name = "POL_REC_TYPE")
    private String POL_REC_TYPE;

    @Column(name = "POL_RI_POOL_CODE")
    private String POL_RI_POOL_CODE;

    @Column(name = "POL_SA_CALC_TYP")
    private String POL_SA_CALC_TYP;

    @Column(name = "POL_MASTER_POLICY_NO")
    private String POL_MASTER_POLICY_NO;

    @Column(name = "POL_APPLIED_DATE")
    private Date POL_APPLIED_DATE;

    @Column(name = "POL_MODE_OF_PYMT")
    private String POL_MODE_OF_PYMT;

    @Column(name = "POL_NO_OF_INST")
    private Integer POL_NO_OF_INST;

    @Column(name = "POL_MODE_OF_PYMT_RATE")
    private Double POL_MODE_OF_PYMT_RATE;

    @Column(name = "POL_FC_FIRST_PREM")
    private Double POL_FC_FIRST_PREM;

    @Column(name = "POL_LC_FIRST_PREM")
    private Double POL_LC_FIRST_PREM;

    @Column(name = "POL_REN_COUNT")
    private Integer POL_REN_COUNT;

    @Column(name = "POL_PREM_CALC_TYPE")
    private String POL_PREM_CALC_TYPE;

    @Column(name = "POL_ORG_FC_FIRST_PREM")
    private Double POL_ORG_FC_FIRST_PREM;

    @Column(name = "POL_ORG_LC_FIRST_PREM")
    private Double POL_ORG_LC_FIRST_PREM;

    @Column(name = "POL_SHORT_TERM_YN")
    private String POL_SHORT_TERM_YN;

    @Column(name = "POL_CITY_CODE")
    private String POL_CITY_CODE;

    @Column(name = "POL_STATE_CODE")
    private String POL_STATE_CODE;

    @Column(name = "POL_POSTAL_CODE")
    private String POL_POSTAL_CODE;

    @Column(name = "POL_ADV_CONT_GEN_YN")
    private String POL_ADV_CONT_GEN_YN;

    @Column(name = "POL_PROD_COMM_CALC_BASIS")
    private String POL_PROD_COMM_CALC_BASIS;

    @Column(name = "POL_DEFERMENT_PERIOD")
    private Integer POL_DEFERMENT_PERIOD;

    @Column(name = "POL_NO_OF_MEMBER")
    private Integer POL_NO_OF_MEMBER;

    @Column(name = "POL_ORG_NO_OF_MEMBER")
    private Integer POL_ORG_NO_OF_MEMBER;

    @Column(name = "POL_RECVR_MEDFEE_YN")
    private String POL_RECVR_MEDFEE_YN;

    @Column(name = "POL_FLEX_01")
    private Double POL_FLEX_01;

    @Column(name = "POL_ADV_CONT_COUNT")
    private Integer POL_ADV_CONT_COUNT;

    @Column(name = "POL_BASIS_OF_COVER")
    private String POL_BASIS_OF_COVER;

    @Column(name = "POL_MUDH_TYPE")
    private String POL_MUDH_TYPE;

    @Column(name = "POL_APPRV_UID")
    private String POL_APPRV_UID;

    @Column(name = "POL_HEAD_COUNT_YN")
    private String POL_HEAD_COUNT_YN;

    @Column(name = "POL_MIN_NO_OF_MEMBER")
    private Integer POL_MIN_NO_OF_MEMBER;

    @Column(name = "POL_STD_RISK_YN")
    private String POL_STD_RISK_YN;

    @Column(name = "POL_REF_NO")
    private String POL_REF_NO;

    @Column(name = "POL_REF_TRAN_ID")
    private Long POL_REF_TRAN_ID;

    @Column(name = "POL_RENEWAL_YN")
    private String POL_RENEWAL_YN;

    @Column(name = "POL_REN_ORG_POL_NO")
    private String POL_REN_ORG_POL_NO;

    @Column(name = "POL_DEPEND_PREM_YN")
    private String POL_DEPEND_PREM_YN;

    @Column(name = "POL_LAPSED_DT")
    private Date POL_LAPSED_DT;

    @Column(name = "POL_REINS_DT")
    private Date POL_REINS_DT;

    @Column(name = "POL_REN_UPD_YN")
    private String POL_REN_UPD_YN;

    @Column(name = "POL_PYMT_TYPE")
    private String POL_PYMT_TYPE;

    @Column(name = "POL_AD_AC_NO")
    private String POL_AD_AC_NO;

    @Column(name = "POL_AD_BANK_CODE")
    private String POL_AD_BANK_CODE;

    @Column(name = "POL_CARD_HOLDER_NAME")
    private String POL_CARD_HOLDER_NAME;

    @Column(name = "POL_AUTH_LIMIT")
    private Double POL_AUTH_LIMIT;

    @Column(name = "POL_FLEX_02")
    private String POL_FLEX_02;

    @Column(name = "POL_ENROL_YN")
    private String POL_ENROL_YN;

    @Column(name = "POL_INCORPORATED_YN")
    private String POL_INCORPORATED_YN;

    @Column(name = "POL_DEFER_PRD")
    private Integer POL_DEFER_PRD;

    @Column(name = "POL_CO_COMM_PER")
    private Double POL_CO_COMM_PER;

    @Column(name = "POL_CO_MED_FEE")
    private Double POL_CO_MED_FEE;

    @Column(name = "POL_CO_SA_LC")
    private Double POL_CO_SA_LC;

    @Column(name = "POL_CO_TOT_PRM")
    private Double POL_CO_TOT_PRM;

    @Column(name = "POL_WF_STS")
    private String POL_WF_STS;

    @Column(name = "POL_FLEX_03")
    private String POL_FLEX_03;

    @Column(name = "POL_TERM_CALC_TYPE")
    private String POL_TERM_CALC_TYPE;

    @Column(name = "POL_HORTATION_NO")
    private Long POL_HORTATION_NO;

    @Column(name = "POL_MOP_WAIVE")
    private String POL_MOP_WAIVE;

    @Column(name = "POL_AMENDMENT_YN")
    private String POL_AMENDMENT_YN;

    @Column(name = "POL_FCL_UPD_FLG")
    private String POL_FCL_UPD_FLG;

    @Column(name = "POL_TREATY_CODE")
    private String POL_TREATY_CODE;

    @Column(name = "POL_MAT_AGE")
    private Integer POL_MAT_AGE;

    @Column(name = "POL_PW_RISK")
    private String POL_PW_RISK;

    @Column(name = "POL_SA_LIMIT")
    private Double POL_SA_LIMIT;

    @Column(name = "POL_PREM_TYPE")
    private String POL_PREM_TYPE;

    @Column(name = "POL_ADMIN_RATE")
    private Double POL_ADMIN_RATE;

    @Column(name = "POL_ADMIN_AMT")
    private Double POL_ADMIN_AMT;

    @Column(name = "POL_REFUND_MONTHS")
    private Integer POL_REFUND_MONTHS;

    @Column(name = "POL_CUST_REF_ID")
    private String POL_CUST_REF_ID;

    @Column(name = "POL_ASSRD_REF_ID")
    private String POL_ASSRD_REF_ID;

    @Column(name = "POL_BASIC_RATE")
    private Double POL_BASIC_RATE;

    @Column(name = "POL_CANCEL_DT")
    private Date POL_CANCEL_DT;

    @Column(name = "POL_CONVERT_YN")
    private String POL_CONVERT_YN;

    @Column(name = "POL_FC_ADDL_PREM")
    private Double POL_FC_ADDL_PREM;

    @Column(name = "POL_FC_BASIC_PREM")
    private Double POL_FC_BASIC_PREM;

    @Column(name = "POL_JOINT_LIFE_AGE")
    private Integer POL_JOINT_LIFE_AGE;

    @Column(name = "POL_LAST_INST_DT")
    private Date POL_LAST_INST_DT;

    @Column(name = "POL_LC_ADDL_PREM")
    private Double POL_LC_ADDL_PREM;

    @Column(name = "POL_LC_BASIC_PREM")
    private Double POL_LC_BASIC_PREM;

    @Column(name = "POL_NO_YRS_PREM_PAID")
    private Double POL_NO_YRS_PREM_PAID;

    @Column(name = "POL_PERIOD")
    private Long POL_PERIOD;

    @Column(name = "POL_PLAN_CODE")
    private String POL_PLAN_CODE;

    @Column(name = "POL_PREM_PAY_YRS")
    private Integer POL_PREM_PAY_YRS;

    @Column(name = "POL_PREM_PAYOR_CODE")
    private String POL_PREM_PAYOR_CODE;

    @Column(name = "POL_COMP_CODE")
    private String POL_COMP_CODE;
    
    @Column(name = "POL_PROGRS_UPD")
    private Integer POL_PROGRS_UPD = 0;
    
    @Column(name = "POL_AGENT_CODE")
    private String POL_AGENT_CODE;
    
    @Column(name = "POL_ASSR_CUST_FLAG")
    private String POL_ASSR_CUST_FLAG;
    
    @Column(name = "POL_AGENT_COMM_BASIS")
    private String POL_AGENT_COMM_BASIS;

	public Long getPOL_TRAN_ID() {
		return POL_TRAN_ID;
	}

	public void setPOL_TRAN_ID(Long pOL_TRAN_ID) {
		POL_TRAN_ID = pOL_TRAN_ID;
	}

	public String getPOL_DIVN_CODE() {
		return POL_DIVN_CODE;
	}

	public void setPOL_DIVN_CODE(String pOL_DIVN_CODE) {
		POL_DIVN_CODE = pOL_DIVN_CODE;
	}

	public String getPOL_DEPT_CODE() {
		return POL_DEPT_CODE;
	}

	public void setPOL_DEPT_CODE(String pOL_DEPT_CODE) {
		POL_DEPT_CODE = pOL_DEPT_CODE;
	}

	public String getPOL_CLASS_CODE() {
		return POL_CLASS_CODE;
	}

	public void setPOL_CLASS_CODE(String pOL_CLASS_CODE) {
		POL_CLASS_CODE = pOL_CLASS_CODE;
	}

	public String getPOL_DS_TYPE() {
		return POL_DS_TYPE;
	}

	public void setPOL_DS_TYPE(String pOL_DS_TYPE) {
		POL_DS_TYPE = pOL_DS_TYPE;
	}

	public String getPOL_DS_CODE() {
		return POL_DS_CODE;
	}

	public void setPOL_DS_CODE(String pOL_DS_CODE) {
		POL_DS_CODE = pOL_DS_CODE;
	}

	public Long getPOL_QUOT_TRAN_ID() {
		return POL_QUOT_TRAN_ID;
	}

	public void setPOL_QUOT_TRAN_ID(Long pOL_QUOT_TRAN_ID) {
		POL_QUOT_TRAN_ID = pOL_QUOT_TRAN_ID;
	}

	public String getPOL_QUOT_NO() {
		return POL_QUOT_NO;
	}

	public void setPOL_QUOT_NO(String pOL_QUOT_NO) {
		POL_QUOT_NO = pOL_QUOT_NO;
	}

	public String getPOL_TL_COVER_CODE() {
		return POL_TL_COVER_CODE;
	}

	public void setPOL_TL_COVER_CODE(String pOL_TL_COVER_CODE) {
		POL_TL_COVER_CODE = pOL_TL_COVER_CODE;
	}

	public String getPOL_NO() {
		return POL_NO;
	}

	public void setPOL_NO(String pOL_NO) {
		POL_NO = pOL_NO;
	}

	public Date getPOL_ISSUE_DT() {
		return POL_ISSUE_DT;
	}

	public void setPOL_ISSUE_DT(Date pOL_ISSUE_DT) {
		POL_ISSUE_DT = pOL_ISSUE_DT;
	}

	public Integer getPOL_UW_YEAR() {
		return POL_UW_YEAR;
	}

	public void setPOL_UW_YEAR(Integer pOL_UW_YEAR) {
		POL_UW_YEAR = pOL_UW_YEAR;
	}

	public String getPOL_CUST_CODE() {
		return POL_CUST_CODE;
	}

	public void setPOL_CUST_CODE(String pOL_CUST_CODE) {
		POL_CUST_CODE = pOL_CUST_CODE;
	}

	public String getPOL_CUST_NAME() {
		return POL_CUST_NAME;
	}

	public void setPOL_CUST_NAME(String pOL_CUST_NAME) {
		POL_CUST_NAME = pOL_CUST_NAME;
	}

	public String getPOL_CUST_ADDRESS_1() {
		return POL_CUST_ADDRESS_1;
	}

	public void setPOL_CUST_ADDRESS_1(String pOL_CUST_ADDRESS_1) {
		POL_CUST_ADDRESS_1 = pOL_CUST_ADDRESS_1;
	}

	public String getPOL_CUST_ADDRESS_2() {
		return POL_CUST_ADDRESS_2;
	}

	public void setPOL_CUST_ADDRESS_2(String pOL_CUST_ADDRESS_2) {
		POL_CUST_ADDRESS_2 = pOL_CUST_ADDRESS_2;
	}

	public String getPOL_CUST_ADDRESS_3() {
		return POL_CUST_ADDRESS_3;
	}

	public void setPOL_CUST_ADDRESS_3(String pOL_CUST_ADDRESS_3) {
		POL_CUST_ADDRESS_3 = pOL_CUST_ADDRESS_3;
	}

	public String getPOL_BUS_NATURE() {
		return POL_BUS_NATURE;
	}

	public void setPOL_BUS_NATURE(String pOL_BUS_NATURE) {
		POL_BUS_NATURE = pOL_BUS_NATURE;
	}

	public String getPOL_SA_CURR_CODE() {
		return POL_SA_CURR_CODE;
	}

	public void setPOL_SA_CURR_CODE(String pOL_SA_CURR_CODE) {
		POL_SA_CURR_CODE = pOL_SA_CURR_CODE;
	}

	public Integer getPOL_SA_EXCH_RATE() {
		return POL_SA_EXCH_RATE;
	}

	public void setPOL_SA_EXCH_RATE(Integer pOL_SA_EXCH_RATE) {
		POL_SA_EXCH_RATE = pOL_SA_EXCH_RATE;
	}

	public String getPOL_CUST_CURR_CODE() {
		return POL_CUST_CURR_CODE;
	}

	public void setPOL_CUST_CURR_CODE(String pOL_CUST_CURR_CODE) {
		POL_CUST_CURR_CODE = pOL_CUST_CURR_CODE;
	}

	public Integer getPOL_CUST_EXCH_RATE() {
		return POL_CUST_EXCH_RATE;
	}

	public void setPOL_CUST_EXCH_RATE(Integer pOL_CUST_EXCH_RATE) {
		POL_CUST_EXCH_RATE = pOL_CUST_EXCH_RATE;
	}

	public Date getPOL_FM_DT() {
		return POL_FM_DT;
	}

	public void setPOL_FM_DT(Date pOL_FM_DT) {
		POL_FM_DT = pOL_FM_DT;
	}

	public Date getPOL_TO_DT() {
		return POL_TO_DT;
	}

	public void setPOL_TO_DT(Date pOL_TO_DT) {
		POL_TO_DT = pOL_TO_DT;
	}

	public Integer getPOL_NO_OF_EMP() {
		return POL_NO_OF_EMP;
	}

	public void setPOL_NO_OF_EMP(Integer pOL_NO_OF_EMP) {
		POL_NO_OF_EMP = pOL_NO_OF_EMP;
	}

	public String getPOL_SA_FACTOR_FLAG() {
		return POL_SA_FACTOR_FLAG;
	}

	public void setPOL_SA_FACTOR_FLAG(String pOL_SA_FACTOR_FLAG) {
		POL_SA_FACTOR_FLAG = pOL_SA_FACTOR_FLAG;
	}

	public Integer getPOL_SA_FACTOR_VALUE() {
		return POL_SA_FACTOR_VALUE;
	}

	public void setPOL_SA_FACTOR_VALUE(Integer pOL_SA_FACTOR_VALUE) {
		POL_SA_FACTOR_VALUE = pOL_SA_FACTOR_VALUE;
	}

	public Double getPOL_FC_SA_LUMPSUM_AMT() {
		return POL_FC_SA_LUMPSUM_AMT;
	}

	public void setPOL_FC_SA_LUMPSUM_AMT(Double pOL_FC_SA_LUMPSUM_AMT) {
		POL_FC_SA_LUMPSUM_AMT = pOL_FC_SA_LUMPSUM_AMT;
	}

	public Double getPOL_LC_SA_LUMPSUM_AMT() {
		return POL_LC_SA_LUMPSUM_AMT;
	}

	public void setPOL_LC_SA_LUMPSUM_AMT(Double pOL_LC_SA_LUMPSUM_AMT) {
		POL_LC_SA_LUMPSUM_AMT = pOL_LC_SA_LUMPSUM_AMT;
	}

	public Double getPOL_FC_MIN_VALUE() {
		return POL_FC_MIN_VALUE;
	}

	public void setPOL_FC_MIN_VALUE(Double pOL_FC_MIN_VALUE) {
		POL_FC_MIN_VALUE = pOL_FC_MIN_VALUE;
	}

	public Double getPOL_LC_MIN_VALUE() {
		return POL_LC_MIN_VALUE;
	}

	public void setPOL_LC_MIN_VALUE(Double pOL_LC_MIN_VALUE) {
		POL_LC_MIN_VALUE = pOL_LC_MIN_VALUE;
	}

	public Double getPOL_FC_MAX_VALUE() {
		return POL_FC_MAX_VALUE;
	}

	public void setPOL_FC_MAX_VALUE(Double pOL_FC_MAX_VALUE) {
		POL_FC_MAX_VALUE = pOL_FC_MAX_VALUE;
	}

	public Double getPOL_LC_MAX_VALUE() {
		return POL_LC_MAX_VALUE;
	}

	public void setPOL_LC_MAX_VALUE(Double pOL_LC_MAX_VALUE) {
		POL_LC_MAX_VALUE = pOL_LC_MAX_VALUE;
	}

	public Double getPOL_FC_FREE_COVER_LIMIT() {
		return POL_FC_FREE_COVER_LIMIT;
	}

	public void setPOL_FC_FREE_COVER_LIMIT(Double pOL_FC_FREE_COVER_LIMIT) {
		POL_FC_FREE_COVER_LIMIT = pOL_FC_FREE_COVER_LIMIT;
	}

	public Double getPOL_LC_FREE_COVER_LIMIT() {
		return POL_LC_FREE_COVER_LIMIT;
	}

	public void setPOL_LC_FREE_COVER_LIMIT(Double pOL_LC_FREE_COVER_LIMIT) {
		POL_LC_FREE_COVER_LIMIT = pOL_LC_FREE_COVER_LIMIT;
	}

	public Double getPOL_FC_SA() {
		return POL_FC_SA;
	}

	public void setPOL_FC_SA(Double pOL_FC_SA) {
		POL_FC_SA = pOL_FC_SA;
	}

	public Double getPOL_LC_SA() {
		return POL_LC_SA;
	}

	public void setPOL_LC_SA(Double pOL_LC_SA) {
		POL_LC_SA = pOL_LC_SA;
	}

	public Double getPOL_GROSS_RATE() {
		return POL_GROSS_RATE;
	}

	public void setPOL_GROSS_RATE(Double pOL_GROSS_RATE) {
		POL_GROSS_RATE = pOL_GROSS_RATE;
	}

	public Double getPOL_NET_RATE() {
		return POL_NET_RATE;
	}

	public void setPOL_NET_RATE(Double pOL_NET_RATE) {
		POL_NET_RATE = pOL_NET_RATE;
	}

	public Double getPOL_FC_PREM() {
		return POL_FC_PREM;
	}

	public void setPOL_FC_PREM(Double pOL_FC_PREM) {
		POL_FC_PREM = pOL_FC_PREM;
	}

	public Double getPOL_LC_PREM() {
		return POL_LC_PREM;
	}

	public void setPOL_LC_PREM(Double pOL_LC_PREM) {
		POL_LC_PREM = pOL_LC_PREM;
	}

	public Double getPOL_FC_CHARGE() {
		return POL_FC_CHARGE;
	}

	public void setPOL_FC_CHARGE(Double pOL_FC_CHARGE) {
		POL_FC_CHARGE = pOL_FC_CHARGE;
	}

	public Double getPOL_LC_CHARGE() {
		return POL_LC_CHARGE;
	}

	public void setPOL_LC_CHARGE(Double pOL_LC_CHARGE) {
		POL_LC_CHARGE = pOL_LC_CHARGE;
	}

	public Double getPOL_FC_COMM() {
		return POL_FC_COMM;
	}

	public void setPOL_FC_COMM(Double pOL_FC_COMM) {
		POL_FC_COMM = pOL_FC_COMM;
	}

	public Double getPOL_LC_COMM() {
		return POL_LC_COMM;
	}

	public void setPOL_LC_COMM(Double pOL_LC_COMM) {
		POL_LC_COMM = pOL_LC_COMM;
	}

	public Double getPOL_AGE_FACTOR() {
		return POL_AGE_FACTOR;
	}

	public void setPOL_AGE_FACTOR(Double pOL_AGE_FACTOR) {
		POL_AGE_FACTOR = pOL_AGE_FACTOR;
	}

	public Double getPOL_EXPERIENCE_FACTOR() {
		return POL_EXPERIENCE_FACTOR;
	}

	public void setPOL_EXPERIENCE_FACTOR(Double pOL_EXPERIENCE_FACTOR) {
		POL_EXPERIENCE_FACTOR = pOL_EXPERIENCE_FACTOR;
	}

	public Double getPOL_PRO_SHR_LOAD_PERC() {
		return POL_PRO_SHR_LOAD_PERC;
	}

	public void setPOL_PRO_SHR_LOAD_PERC(Double pOL_PRO_SHR_LOAD_PERC) {
		POL_PRO_SHR_LOAD_PERC = pOL_PRO_SHR_LOAD_PERC;
	}

	public Double getPOL_EXC_MAR_LOAD_PERC() {
		return POL_EXC_MAR_LOAD_PERC;
	}

	public void setPOL_EXC_MAR_LOAD_PERC(Double pOL_EXC_MAR_LOAD_PERC) {
		POL_EXC_MAR_LOAD_PERC = pOL_EXC_MAR_LOAD_PERC;
	}

	public String getPOL_QUAR_RATE_YN() {
		return POL_QUAR_RATE_YN;
	}

	public void setPOL_QUAR_RATE_YN(String pOL_QUAR_RATE_YN) {
		POL_QUAR_RATE_YN = pOL_QUAR_RATE_YN;
	}

	public Double getPOL_FC_EXTRA_PREM() {
		return POL_FC_EXTRA_PREM;
	}

	public void setPOL_FC_EXTRA_PREM(Double pOL_FC_EXTRA_PREM) {
		POL_FC_EXTRA_PREM = pOL_FC_EXTRA_PREM;
	}

	public Double getPOL_LC_EXTRA_PREM() {
		return POL_LC_EXTRA_PREM;
	}

	public void setPOL_LC_EXTRA_PREM(Double pOL_LC_EXTRA_PREM) {
		POL_LC_EXTRA_PREM = pOL_LC_EXTRA_PREM;
	}

	public Double getPOL_DISC_PERC() {
		return POL_DISC_PERC;
	}

	public void setPOL_DISC_PERC(Double pOL_DISC_PERC) {
		POL_DISC_PERC = pOL_DISC_PERC;
	}

	public Double getPOL_FC_DISC() {
		return POL_FC_DISC;
	}

	public void setPOL_FC_DISC(Double pOL_FC_DISC) {
		POL_FC_DISC = pOL_FC_DISC;
	}

	public Double getPOL_LC_DISC() {
		return POL_LC_DISC;
	}

	public void setPOL_LC_DISC(Double pOL_LC_DISC) {
		POL_LC_DISC = pOL_LC_DISC;
	}

	public String getPOL_GUAR_RATE_YN() {
		return POL_GUAR_RATE_YN;
	}

	public void setPOL_GUAR_RATE_YN(String pOL_GUAR_RATE_YN) {
		POL_GUAR_RATE_YN = pOL_GUAR_RATE_YN;
	}

	public Integer getPOL_GUAR_YEARS() {
		return POL_GUAR_YEARS;
	}

	public void setPOL_GUAR_YEARS(Integer pOL_GUAR_YEARS) {
		POL_GUAR_YEARS = pOL_GUAR_YEARS;
	}

	public Double getPOL_GUAR_LOAD_PERC() {
		return POL_GUAR_LOAD_PERC;
	}

	public void setPOL_GUAR_LOAD_PERC(Double pOL_GUAR_LOAD_PERC) {
		POL_GUAR_LOAD_PERC = pOL_GUAR_LOAD_PERC;
	}

	public String getPOL_FREEZE_RATE() {
		return POL_FREEZE_RATE;
	}

	public void setPOL_FREEZE_RATE(String pOL_FREEZE_RATE) {
		POL_FREEZE_RATE = pOL_FREEZE_RATE;
	}

	public String getPOL_RETAIN_RATE() {
		return POL_RETAIN_RATE;
	}

	public void setPOL_RETAIN_RATE(String pOL_RETAIN_RATE) {
		POL_RETAIN_RATE = pOL_RETAIN_RATE;
	}

	public String getPOL_FAC_YN() {
		return POL_FAC_YN;
	}

	public void setPOL_FAC_YN(String pOL_FAC_YN) {
		POL_FAC_YN = pOL_FAC_YN;
	}

	public String getPOL_COINS_YN() {
		return POL_COINS_YN;
	}

	public void setPOL_COINS_YN(String pOL_COINS_YN) {
		POL_COINS_YN = pOL_COINS_YN;
	}

	public String getPOL_STATUS() {
		return POL_STATUS;
	}

	public void setPOL_STATUS(String pOL_STATUS) {
		POL_STATUS = pOL_STATUS;
	}

	public String getPOL_APPRV_STATUS() {
		return POL_APPRV_STATUS;
	}

	public void setPOL_APPRV_STATUS(String pOL_APPRV_STATUS) {
		POL_APPRV_STATUS = pOL_APPRV_STATUS;
	}

	public Date getPOL_APPRV_DT() {
		return POL_APPRV_DT;
	}

	public void setPOL_APPRV_DT(Date pOL_APPRV_DT) {
		POL_APPRV_DT = pOL_APPRV_DT;
	}

	public String getPOL_FAC_CLOSE_FLAG() {
		return POL_FAC_CLOSE_FLAG;
	}

	public void setPOL_FAC_CLOSE_FLAG(String pOL_FAC_CLOSE_FLAG) {
		POL_FAC_CLOSE_FLAG = pOL_FAC_CLOSE_FLAG;
	}

	public String getPOL_RI_CLOSE_FLAG() {
		return POL_RI_CLOSE_FLAG;
	}

	public void setPOL_RI_CLOSE_FLAG(String pOL_RI_CLOSE_FLAG) {
		POL_RI_CLOSE_FLAG = pOL_RI_CLOSE_FLAG;
	}

	public String getPOL_END_TYPE() {
		return POL_END_TYPE;
	}

	public void setPOL_END_TYPE(String pOL_END_TYPE) {
		POL_END_TYPE = pOL_END_TYPE;
	}

	public String getPOL_END_CODE() {
		return POL_END_CODE;
	}

	public void setPOL_END_CODE(String pOL_END_CODE) {
		POL_END_CODE = pOL_END_CODE;
	}

	public String getPOL_END_NO() {
		return POL_END_NO;
	}

	public void setPOL_END_NO(String pOL_END_NO) {
		POL_END_NO = pOL_END_NO;
	}

	public Integer getPOL_END_NO_IDX() {
		return POL_END_NO_IDX;
	}

	public void setPOL_END_NO_IDX(Integer pOL_END_NO_IDX) {
		POL_END_NO_IDX = pOL_END_NO_IDX;
	}

	public Date getPOL_END_DT() {
		return POL_END_DT;
	}

	public void setPOL_END_DT(Date pOL_END_DT) {
		POL_END_DT = pOL_END_DT;
	}

	public Date getPOL_END_EFF_FM_DT() {
		return POL_END_EFF_FM_DT;
	}

	public void setPOL_END_EFF_FM_DT(Date pOL_END_EFF_FM_DT) {
		POL_END_EFF_FM_DT = pOL_END_EFF_FM_DT;
	}

	public Date getPOL_END_EFF_TO_DT() {
		return POL_END_EFF_TO_DT;
	}

	public void setPOL_END_EFF_TO_DT(Date pOL_END_EFF_TO_DT) {
		POL_END_EFF_TO_DT = pOL_END_EFF_TO_DT;
	}

	public String getPOL_END_DESC() {
		return POL_END_DESC;
	}

	public void setPOL_END_DESC(String pOL_END_DESC) {
		POL_END_DESC = pOL_END_DESC;
	}

	public Double getPOL_ORG_FC_SA() {
		return POL_ORG_FC_SA;
	}

	public void setPOL_ORG_FC_SA(Double pOL_ORG_FC_SA) {
		POL_ORG_FC_SA = pOL_ORG_FC_SA;
	}

	public Double getPOL_ORG_LC_SA() {
		return POL_ORG_LC_SA;
	}

	public void setPOL_ORG_LC_SA(Double pOL_ORG_LC_SA) {
		POL_ORG_LC_SA = pOL_ORG_LC_SA;
	}

	public Double getPOL_ORG_GROSS_RATE() {
		return POL_ORG_GROSS_RATE;
	}

	public void setPOL_ORG_GROSS_RATE(Double pOL_ORG_GROSS_RATE) {
		POL_ORG_GROSS_RATE = pOL_ORG_GROSS_RATE;
	}

	public Double getPOL_ORG_NET_RATE() {
		return POL_ORG_NET_RATE;
	}

	public void setPOL_ORG_NET_RATE(Double pOL_ORG_NET_RATE) {
		POL_ORG_NET_RATE = pOL_ORG_NET_RATE;
	}

	public Double getPOL_ORG_FC_PREM() {
		return POL_ORG_FC_PREM;
	}

	public void setPOL_ORG_FC_PREM(Double pOL_ORG_FC_PREM) {
		POL_ORG_FC_PREM = pOL_ORG_FC_PREM;
	}

	public Double getPOL_ORG_LC_PREM() {
		return POL_ORG_LC_PREM;
	}

	public void setPOL_ORG_LC_PREM(Double pOL_ORG_LC_PREM) {
		POL_ORG_LC_PREM = pOL_ORG_LC_PREM;
	}

	public Integer getPOL_ORG_NO_OF_EMP() {
		return POL_ORG_NO_OF_EMP;
	}

	public void setPOL_ORG_NO_OF_EMP(Integer pOL_ORG_NO_OF_EMP) {
		POL_ORG_NO_OF_EMP = pOL_ORG_NO_OF_EMP;
	}

	public Double getPOL_ORG_FC_EXTRA_PREM() {
		return POL_ORG_FC_EXTRA_PREM;
	}

	public void setPOL_ORG_FC_EXTRA_PREM(Double pOL_ORG_FC_EXTRA_PREM) {
		POL_ORG_FC_EXTRA_PREM = pOL_ORG_FC_EXTRA_PREM;
	}

	public Double getPOL_ORG_LC_EXTRA_PREM() {
		return POL_ORG_LC_EXTRA_PREM;
	}

	public void setPOL_ORG_LC_EXTRA_PREM(Double pOL_ORG_LC_EXTRA_PREM) {
		POL_ORG_LC_EXTRA_PREM = pOL_ORG_LC_EXTRA_PREM;
	}

	public Double getPOL_ORG_FC_DISC() {
		return POL_ORG_FC_DISC;
	}

	public void setPOL_ORG_FC_DISC(Double pOL_ORG_FC_DISC) {
		POL_ORG_FC_DISC = pOL_ORG_FC_DISC;
	}

	public Double getPOL_ORG_LC_DISC() {
		return POL_ORG_LC_DISC;
	}

	public void setPOL_ORG_LC_DISC(Double pOL_ORG_LC_DISC) {
		POL_ORG_LC_DISC = pOL_ORG_LC_DISC;
	}

	public Double getPOL_ORG_FC_CHARGE() {
		return POL_ORG_FC_CHARGE;
	}

	public void setPOL_ORG_FC_CHARGE(Double pOL_ORG_FC_CHARGE) {
		POL_ORG_FC_CHARGE = pOL_ORG_FC_CHARGE;
	}

	public Double getPOL_ORG_LC_CHARGE() {
		return POL_ORG_LC_CHARGE;
	}

	public void setPOL_ORG_LC_CHARGE(Double pOL_ORG_LC_CHARGE) {
		POL_ORG_LC_CHARGE = pOL_ORG_LC_CHARGE;
	}

	public Date getPOL_INS_DT() {
		return POL_INS_DT;
	}

	public void setPOL_INS_DT(Date pOL_INS_DT) {
		POL_INS_DT = pOL_INS_DT;
	}

	public String getPOL_INS_ID() {
		return POL_INS_ID;
	}

	public void setPOL_INS_ID(String pOL_INS_ID) {
		POL_INS_ID = pOL_INS_ID;
	}

	public Date getPOL_MOD_DT() {
		return POL_MOD_DT;
	}

	public void setPOL_MOD_DT(Date pOL_MOD_DT) {
		POL_MOD_DT = pOL_MOD_DT;
	}

	public String getPOL_MOD_ID() {
		return POL_MOD_ID;
	}

	public void setPOL_MOD_ID(String pOL_MOD_ID) {
		POL_MOD_ID = pOL_MOD_ID;
	}

	public String getPOL_EXCL_ACC_DEATH_YN() {
		return POL_EXCL_ACC_DEATH_YN;
	}

	public void setPOL_EXCL_ACC_DEATH_YN(String pOL_EXCL_ACC_DEATH_YN) {
		POL_EXCL_ACC_DEATH_YN = pOL_EXCL_ACC_DEATH_YN;
	}

	public String getPOL_PRINT_STATUS() {
		return POL_PRINT_STATUS;
	}

	public void setPOL_PRINT_STATUS(String pOL_PRINT_STATUS) {
		POL_PRINT_STATUS = pOL_PRINT_STATUS;
	}

	public String getPOL_SUMMARY_YN() {
		return POL_SUMMARY_YN;
	}

	public void setPOL_SUMMARY_YN(String pOL_SUMMARY_YN) {
		POL_SUMMARY_YN = pOL_SUMMARY_YN;
	}

	public String getPOL_DISC_CODE() {
		return POL_DISC_CODE;
	}

	public void setPOL_DISC_CODE(String pOL_DISC_CODE) {
		POL_DISC_CODE = pOL_DISC_CODE;
	}

	public Double getPOL_DISC_RATE() {
		return POL_DISC_RATE;
	}

	public void setPOL_DISC_RATE(Double pOL_DISC_RATE) {
		POL_DISC_RATE = pOL_DISC_RATE;
	}

	public Double getPOL_TOT_NET_RATE() {
		return POL_TOT_NET_RATE;
	}

	public void setPOL_TOT_NET_RATE(Double pOL_TOT_NET_RATE) {
		POL_TOT_NET_RATE = pOL_TOT_NET_RATE;
	}

	public String getPOL_CREDIT_YN() {
		return POL_CREDIT_YN;
	}

	public void setPOL_CREDIT_YN(String pOL_CREDIT_YN) {
		POL_CREDIT_YN = pOL_CREDIT_YN;
	}

	public String getPOL_CREDIT_MONTH_RATE_YN() {
		return POL_CREDIT_MONTH_RATE_YN;
	}

	public void setPOL_CREDIT_MONTH_RATE_YN(String pOL_CREDIT_MONTH_RATE_YN) {
		POL_CREDIT_MONTH_RATE_YN = pOL_CREDIT_MONTH_RATE_YN;
	}

	public String getPOL_REMARKS() {
		return POL_REMARKS;
	}

	public void setPOL_REMARKS(String pOL_REMARKS) {
		POL_REMARKS = pOL_REMARKS;
	}

	public Double getPOL_LOAD_PERC() {
		return POL_LOAD_PERC;
	}

	public void setPOL_LOAD_PERC(Double pOL_LOAD_PERC) {
		POL_LOAD_PERC = pOL_LOAD_PERC;
	}

	public String getPOL_RI_BASIS() {
		return POL_RI_BASIS;
	}

	public void setPOL_RI_BASIS(String pOL_RI_BASIS) {
		POL_RI_BASIS = pOL_RI_BASIS;
	}

	public String getPOL_ASSR_CODE() {
		return POL_ASSR_CODE;
	}

	public void setPOL_ASSR_CODE(String pOL_ASSR_CODE) {
		POL_ASSR_CODE = pOL_ASSR_CODE;
	}

	public Integer getPOL_CLM_INTM_DAYS() {
		return POL_CLM_INTM_DAYS;
	}

	public void setPOL_CLM_INTM_DAYS(Integer pOL_CLM_INTM_DAYS) {
		POL_CLM_INTM_DAYS = pOL_CLM_INTM_DAYS;
	}

	public String getPOL_ASSURED_NAME() {
		return POL_ASSURED_NAME;
	}

	public void setPOL_ASSURED_NAME(String pOL_ASSURED_NAME) {
		POL_ASSURED_NAME = pOL_ASSURED_NAME;
	}

	public String getPOL_BROK_ADMIN_CHG_CODE() {
		return POL_BROK_ADMIN_CHG_CODE;
	}

	public void setPOL_BROK_ADMIN_CHG_CODE(String pOL_BROK_ADMIN_CHG_CODE) {
		POL_BROK_ADMIN_CHG_CODE = pOL_BROK_ADMIN_CHG_CODE;
	}

	public Double getPOL_FC_BROK_ADMIN_CHARGE() {
		return POL_FC_BROK_ADMIN_CHARGE;
	}

	public void setPOL_FC_BROK_ADMIN_CHARGE(Double pOL_FC_BROK_ADMIN_CHARGE) {
		POL_FC_BROK_ADMIN_CHARGE = pOL_FC_BROK_ADMIN_CHARGE;
	}

	public Double getPOL_LC_BROK_ADMIN_CHARGE() {
		return POL_LC_BROK_ADMIN_CHARGE;
	}

	public void setPOL_LC_BROK_ADMIN_CHARGE(Double pOL_LC_BROK_ADMIN_CHARGE) {
		POL_LC_BROK_ADMIN_CHARGE = pOL_LC_BROK_ADMIN_CHARGE;
	}

	public Double getPOL_BROK_ADMIN_CHG_PERC() {
		return POL_BROK_ADMIN_CHG_PERC;
	}

	public void setPOL_BROK_ADMIN_CHG_PERC(Double pOL_BROK_ADMIN_CHG_PERC) {
		POL_BROK_ADMIN_CHG_PERC = pOL_BROK_ADMIN_CHG_PERC;
	}

	public Double getPOL_CREDIT_DICOUNT_PERC() {
		return POL_CREDIT_DICOUNT_PERC;
	}

	public void setPOL_CREDIT_DICOUNT_PERC(Double pOL_CREDIT_DICOUNT_PERC) {
		POL_CREDIT_DICOUNT_PERC = pOL_CREDIT_DICOUNT_PERC;
	}

	public Double getPOL_GROSS_FC_PREM() {
		return POL_GROSS_FC_PREM;
	}

	public void setPOL_GROSS_FC_PREM(Double pOL_GROSS_FC_PREM) {
		POL_GROSS_FC_PREM = pOL_GROSS_FC_PREM;
	}

	public Double getPOL_GROSS_LC_PREM() {
		return POL_GROSS_LC_PREM;
	}

	public void setPOL_GROSS_LC_PREM(Double pOL_GROSS_LC_PREM) {
		POL_GROSS_LC_PREM = pOL_GROSS_LC_PREM;
	}

	public Date getPOL_QUOT_DT() {
		return POL_QUOT_DT;
	}

	public void setPOL_QUOT_DT(Date pOL_QUOT_DT) {
		POL_QUOT_DT = pOL_QUOT_DT;
	}

	public String getPOL_CLM_EXP_YN() {
		return POL_CLM_EXP_YN;
	}

	public void setPOL_CLM_EXP_YN(String pOL_CLM_EXP_YN) {
		POL_CLM_EXP_YN = pOL_CLM_EXP_YN;
	}

	public Double getPOL_WO_CLM_NET_RATE() {
		return POL_WO_CLM_NET_RATE;
	}

	public void setPOL_WO_CLM_NET_RATE(Double pOL_WO_CLM_NET_RATE) {
		POL_WO_CLM_NET_RATE = pOL_WO_CLM_NET_RATE;
	}

	public String getPOL_CLM_EXP_CALC() {
		return POL_CLM_EXP_CALC;
	}

	public void setPOL_CLM_EXP_CALC(String pOL_CLM_EXP_CALC) {
		POL_CLM_EXP_CALC = pOL_CLM_EXP_CALC;
	}

	public Integer getPOL_FAC_BASIS() {
		return POL_FAC_BASIS;
	}

	public void setPOL_FAC_BASIS(Integer pOL_FAC_BASIS) {
		POL_FAC_BASIS = pOL_FAC_BASIS;
	}

	public String getPOL_EMP_SUMMARY_YN() {
		return POL_EMP_SUMMARY_YN;
	}

	public void setPOL_EMP_SUMMARY_YN(String pOL_EMP_SUMMARY_YN) {
		POL_EMP_SUMMARY_YN = pOL_EMP_SUMMARY_YN;
	}

	public Double getPOL_FC_ANN_SAL() {
		return POL_FC_ANN_SAL;
	}

	public void setPOL_FC_ANN_SAL(Double pOL_FC_ANN_SAL) {
		POL_FC_ANN_SAL = pOL_FC_ANN_SAL;
	}

	public Double getPOL_LC_ANN_SAL() {
		return POL_LC_ANN_SAL;
	}

	public void setPOL_LC_ANN_SAL(Double pOL_LC_ANN_SAL) {
		POL_LC_ANN_SAL = pOL_LC_ANN_SAL;
	}

	public String getPOL_PROD_CODE() {
		return POL_PROD_CODE;
	}

	public void setPOL_PROD_CODE(String pOL_PROD_CODE) {
		POL_PROD_CODE = pOL_PROD_CODE;
	}

	public String getPOL_RATING_BASIS() {
		return POL_RATING_BASIS;
	}

	public void setPOL_RATING_BASIS(String pOL_RATING_BASIS) {
		POL_RATING_BASIS = pOL_RATING_BASIS;
	}

	public Double getPOL_FC_DEPOSIT_PREM() {
		return POL_FC_DEPOSIT_PREM;
	}

	public void setPOL_FC_DEPOSIT_PREM(Double pOL_FC_DEPOSIT_PREM) {
		POL_FC_DEPOSIT_PREM = pOL_FC_DEPOSIT_PREM;
	}

	public Double getPOL_LC_DEPOSIT_PREM() {
		return POL_LC_DEPOSIT_PREM;
	}

	public void setPOL_LC_DEPOSIT_PREM(Double pOL_LC_DEPOSIT_PREM) {
		POL_LC_DEPOSIT_PREM = pOL_LC_DEPOSIT_PREM;
	}

	public String getPOL_BANK_CODE() {
		return POL_BANK_CODE;
	}

	public void setPOL_BANK_CODE(String pOL_BANK_CODE) {
		POL_BANK_CODE = pOL_BANK_CODE;
	}

	public String getPOL_SRC_OF_BUS() {
		return POL_SRC_OF_BUS;
	}

	public void setPOL_SRC_OF_BUS(String pOL_SRC_OF_BUS) {
		POL_SRC_OF_BUS = pOL_SRC_OF_BUS;
	}

	public String getPOL_SRV_OFF_CODE() {
		return POL_SRV_OFF_CODE;
	}

	public void setPOL_SRV_OFF_CODE(String pOL_SRV_OFF_CODE) {
		POL_SRV_OFF_CODE = pOL_SRV_OFF_CODE;
	}

	public String getPOL_ADDL_STAT() {
		return POL_ADDL_STAT;
	}

	public void setPOL_ADDL_STAT(String pOL_ADDL_STAT) {
		POL_ADDL_STAT = pOL_ADDL_STAT;
	}

	public String getPOL_TAKE_OVER_FLAG() {
		return POL_TAKE_OVER_FLAG;
	}

	public void setPOL_TAKE_OVER_FLAG(String pOL_TAKE_OVER_FLAG) {
		POL_TAKE_OVER_FLAG = pOL_TAKE_OVER_FLAG;
	}

	public Double getPOL_LC_TAKE_OVER_FCL() {
		return POL_LC_TAKE_OVER_FCL;
	}

	public void setPOL_LC_TAKE_OVER_FCL(Double pOL_LC_TAKE_OVER_FCL) {
		POL_LC_TAKE_OVER_FCL = pOL_LC_TAKE_OVER_FCL;
	}

	public String getPOL_EMP_EXIT_FLAG() {
		return POL_EMP_EXIT_FLAG;
	}

	public void setPOL_EMP_EXIT_FLAG(String pOL_EMP_EXIT_FLAG) {
		POL_EMP_EXIT_FLAG = pOL_EMP_EXIT_FLAG;
	}

	public String getPOL_PROP_QUOT_FLAG() {
		return POL_PROP_QUOT_FLAG;
	}

	public void setPOL_PROP_QUOT_FLAG(String pOL_PROP_QUOT_FLAG) {
		POL_PROP_QUOT_FLAG = pOL_PROP_QUOT_FLAG;
	}

	public Double getPOL_ORG_LC_TAKE_OVER_FCL() {
		return POL_ORG_LC_TAKE_OVER_FCL;
	}

	public void setPOL_ORG_LC_TAKE_OVER_FCL(Double pOL_ORG_LC_TAKE_OVER_FCL) {
		POL_ORG_LC_TAKE_OVER_FCL = pOL_ORG_LC_TAKE_OVER_FCL;
	}

	public String getPOL_REC_TYPE() {
		return POL_REC_TYPE;
	}

	public void setPOL_REC_TYPE(String pOL_REC_TYPE) {
		POL_REC_TYPE = pOL_REC_TYPE;
	}

	public String getPOL_RI_POOL_CODE() {
		return POL_RI_POOL_CODE;
	}

	public void setPOL_RI_POOL_CODE(String pOL_RI_POOL_CODE) {
		POL_RI_POOL_CODE = pOL_RI_POOL_CODE;
	}

	public String getPOL_SA_CALC_TYP() {
		return POL_SA_CALC_TYP;
	}

	public void setPOL_SA_CALC_TYP(String pOL_SA_CALC_TYP) {
		POL_SA_CALC_TYP = pOL_SA_CALC_TYP;
	}

	public String getPOL_MASTER_POLICY_NO() {
		return POL_MASTER_POLICY_NO;
	}

	public void setPOL_MASTER_POLICY_NO(String pOL_MASTER_POLICY_NO) {
		POL_MASTER_POLICY_NO = pOL_MASTER_POLICY_NO;
	}

	public Date getPOL_APPLIED_DATE() {
		return POL_APPLIED_DATE;
	}

	public void setPOL_APPLIED_DATE(Date pOL_APPLIED_DATE) {
		POL_APPLIED_DATE = pOL_APPLIED_DATE;
	}

	public String getPOL_MODE_OF_PYMT() {
		return POL_MODE_OF_PYMT;
	}

	public void setPOL_MODE_OF_PYMT(String pOL_MODE_OF_PYMT) {
		POL_MODE_OF_PYMT = pOL_MODE_OF_PYMT;
	}

	public Integer getPOL_NO_OF_INST() {
		return POL_NO_OF_INST;
	}

	public void setPOL_NO_OF_INST(Integer pOL_NO_OF_INST) {
		POL_NO_OF_INST = pOL_NO_OF_INST;
	}

	public Double getPOL_MODE_OF_PYMT_RATE() {
		return POL_MODE_OF_PYMT_RATE;
	}

	public void setPOL_MODE_OF_PYMT_RATE(Double pOL_MODE_OF_PYMT_RATE) {
		POL_MODE_OF_PYMT_RATE = pOL_MODE_OF_PYMT_RATE;
	}

	public Double getPOL_FC_FIRST_PREM() {
		return POL_FC_FIRST_PREM;
	}

	public void setPOL_FC_FIRST_PREM(Double pOL_FC_FIRST_PREM) {
		POL_FC_FIRST_PREM = pOL_FC_FIRST_PREM;
	}

	public Double getPOL_LC_FIRST_PREM() {
		return POL_LC_FIRST_PREM;
	}

	public void setPOL_LC_FIRST_PREM(Double pOL_LC_FIRST_PREM) {
		POL_LC_FIRST_PREM = pOL_LC_FIRST_PREM;
	}

	public Integer getPOL_REN_COUNT() {
		return POL_REN_COUNT;
	}

	public void setPOL_REN_COUNT(Integer pOL_REN_COUNT) {
		POL_REN_COUNT = pOL_REN_COUNT;
	}

	public String getPOL_PREM_CALC_TYPE() {
		return POL_PREM_CALC_TYPE;
	}

	public void setPOL_PREM_CALC_TYPE(String pOL_PREM_CALC_TYPE) {
		POL_PREM_CALC_TYPE = pOL_PREM_CALC_TYPE;
	}

	public Double getPOL_ORG_FC_FIRST_PREM() {
		return POL_ORG_FC_FIRST_PREM;
	}

	public void setPOL_ORG_FC_FIRST_PREM(Double pOL_ORG_FC_FIRST_PREM) {
		POL_ORG_FC_FIRST_PREM = pOL_ORG_FC_FIRST_PREM;
	}

	public Double getPOL_ORG_LC_FIRST_PREM() {
		return POL_ORG_LC_FIRST_PREM;
	}

	public void setPOL_ORG_LC_FIRST_PREM(Double pOL_ORG_LC_FIRST_PREM) {
		POL_ORG_LC_FIRST_PREM = pOL_ORG_LC_FIRST_PREM;
	}

	public String getPOL_SHORT_TERM_YN() {
		return POL_SHORT_TERM_YN;
	}

	public void setPOL_SHORT_TERM_YN(String pOL_SHORT_TERM_YN) {
		POL_SHORT_TERM_YN = pOL_SHORT_TERM_YN;
	}

	public String getPOL_CITY_CODE() {
		return POL_CITY_CODE;
	}

	public void setPOL_CITY_CODE(String pOL_CITY_CODE) {
		POL_CITY_CODE = pOL_CITY_CODE;
	}

	public String getPOL_STATE_CODE() {
		return POL_STATE_CODE;
	}

	public void setPOL_STATE_CODE(String pOL_STATE_CODE) {
		POL_STATE_CODE = pOL_STATE_CODE;
	}

	public String getPOL_POSTAL_CODE() {
		return POL_POSTAL_CODE;
	}

	public void setPOL_POSTAL_CODE(String pOL_POSTAL_CODE) {
		POL_POSTAL_CODE = pOL_POSTAL_CODE;
	}

	public String getPOL_ADV_CONT_GEN_YN() {
		return POL_ADV_CONT_GEN_YN;
	}

	public void setPOL_ADV_CONT_GEN_YN(String pOL_ADV_CONT_GEN_YN) {
		POL_ADV_CONT_GEN_YN = pOL_ADV_CONT_GEN_YN;
	}

	public String getPOL_PROD_COMM_CALC_BASIS() {
		return POL_PROD_COMM_CALC_BASIS;
	}

	public void setPOL_PROD_COMM_CALC_BASIS(String pOL_PROD_COMM_CALC_BASIS) {
		POL_PROD_COMM_CALC_BASIS = pOL_PROD_COMM_CALC_BASIS;
	}

	public Integer getPOL_DEFERMENT_PERIOD() {
		return POL_DEFERMENT_PERIOD;
	}

	public void setPOL_DEFERMENT_PERIOD(Integer pOL_DEFERMENT_PERIOD) {
		POL_DEFERMENT_PERIOD = pOL_DEFERMENT_PERIOD;
	}

	public Integer getPOL_NO_OF_MEMBER() {
		return POL_NO_OF_MEMBER;
	}

	public void setPOL_NO_OF_MEMBER(Integer pOL_NO_OF_MEMBER) {
		POL_NO_OF_MEMBER = pOL_NO_OF_MEMBER;
	}

	public Integer getPOL_ORG_NO_OF_MEMBER() {
		return POL_ORG_NO_OF_MEMBER;
	}

	public void setPOL_ORG_NO_OF_MEMBER(Integer pOL_ORG_NO_OF_MEMBER) {
		POL_ORG_NO_OF_MEMBER = pOL_ORG_NO_OF_MEMBER;
	}

	public String getPOL_RECVR_MEDFEE_YN() {
		return POL_RECVR_MEDFEE_YN;
	}

	public void setPOL_RECVR_MEDFEE_YN(String pOL_RECVR_MEDFEE_YN) {
		POL_RECVR_MEDFEE_YN = pOL_RECVR_MEDFEE_YN;
	}

	public Double getPOL_FLEX_01() {
		return POL_FLEX_01;
	}

	public void setPOL_FLEX_01(Double pOL_FLEX_01) {
		POL_FLEX_01 = pOL_FLEX_01;
	}

	public Integer getPOL_ADV_CONT_COUNT() {
		return POL_ADV_CONT_COUNT;
	}

	public void setPOL_ADV_CONT_COUNT(Integer pOL_ADV_CONT_COUNT) {
		POL_ADV_CONT_COUNT = pOL_ADV_CONT_COUNT;
	}

	public String getPOL_BASIS_OF_COVER() {
		return POL_BASIS_OF_COVER;
	}

	public void setPOL_BASIS_OF_COVER(String pOL_BASIS_OF_COVER) {
		POL_BASIS_OF_COVER = pOL_BASIS_OF_COVER;
	}

	public String getPOL_MUDH_TYPE() {
		return POL_MUDH_TYPE;
	}

	public void setPOL_MUDH_TYPE(String pOL_MUDH_TYPE) {
		POL_MUDH_TYPE = pOL_MUDH_TYPE;
	}

	public String getPOL_APPRV_UID() {
		return POL_APPRV_UID;
	}

	public void setPOL_APPRV_UID(String pOL_APPRV_UID) {
		POL_APPRV_UID = pOL_APPRV_UID;
	}

	public String getPOL_HEAD_COUNT_YN() {
		return POL_HEAD_COUNT_YN;
	}

	public void setPOL_HEAD_COUNT_YN(String pOL_HEAD_COUNT_YN) {
		POL_HEAD_COUNT_YN = pOL_HEAD_COUNT_YN;
	}

	public Integer getPOL_MIN_NO_OF_MEMBER() {
		return POL_MIN_NO_OF_MEMBER;
	}

	public void setPOL_MIN_NO_OF_MEMBER(Integer pOL_MIN_NO_OF_MEMBER) {
		POL_MIN_NO_OF_MEMBER = pOL_MIN_NO_OF_MEMBER;
	}

	public String getPOL_STD_RISK_YN() {
		return POL_STD_RISK_YN;
	}

	public void setPOL_STD_RISK_YN(String pOL_STD_RISK_YN) {
		POL_STD_RISK_YN = pOL_STD_RISK_YN;
	}

	public String getPOL_REF_NO() {
		return POL_REF_NO;
	}

	public void setPOL_REF_NO(String pOL_REF_NO) {
		POL_REF_NO = pOL_REF_NO;
	}

	public Long getPOL_REF_TRAN_ID() {
		return POL_REF_TRAN_ID;
	}

	public void setPOL_REF_TRAN_ID(Long pOL_REF_TRAN_ID) {
		POL_REF_TRAN_ID = pOL_REF_TRAN_ID;
	}

	public String getPOL_RENEWAL_YN() {
		return POL_RENEWAL_YN;
	}

	public void setPOL_RENEWAL_YN(String pOL_RENEWAL_YN) {
		POL_RENEWAL_YN = pOL_RENEWAL_YN;
	}

	public String getPOL_REN_ORG_POL_NO() {
		return POL_REN_ORG_POL_NO;
	}

	public void setPOL_REN_ORG_POL_NO(String pOL_REN_ORG_POL_NO) {
		POL_REN_ORG_POL_NO = pOL_REN_ORG_POL_NO;
	}

	public String getPOL_DEPEND_PREM_YN() {
		return POL_DEPEND_PREM_YN;
	}

	public void setPOL_DEPEND_PREM_YN(String pOL_DEPEND_PREM_YN) {
		POL_DEPEND_PREM_YN = pOL_DEPEND_PREM_YN;
	}

	public Date getPOL_LAPSED_DT() {
		return POL_LAPSED_DT;
	}

	public void setPOL_LAPSED_DT(Date pOL_LAPSED_DT) {
		POL_LAPSED_DT = pOL_LAPSED_DT;
	}

	public Date getPOL_REINS_DT() {
		return POL_REINS_DT;
	}

	public void setPOL_REINS_DT(Date pOL_REINS_DT) {
		POL_REINS_DT = pOL_REINS_DT;
	}

	public String getPOL_REN_UPD_YN() {
		return POL_REN_UPD_YN;
	}

	public void setPOL_REN_UPD_YN(String pOL_REN_UPD_YN) {
		POL_REN_UPD_YN = pOL_REN_UPD_YN;
	}

	public String getPOL_PYMT_TYPE() {
		return POL_PYMT_TYPE;
	}

	public void setPOL_PYMT_TYPE(String pOL_PYMT_TYPE) {
		POL_PYMT_TYPE = pOL_PYMT_TYPE;
	}

	public String getPOL_AD_AC_NO() {
		return POL_AD_AC_NO;
	}

	public void setPOL_AD_AC_NO(String pOL_AD_AC_NO) {
		POL_AD_AC_NO = pOL_AD_AC_NO;
	}

	public String getPOL_AD_BANK_CODE() {
		return POL_AD_BANK_CODE;
	}

	public void setPOL_AD_BANK_CODE(String pOL_AD_BANK_CODE) {
		POL_AD_BANK_CODE = pOL_AD_BANK_CODE;
	}

	public String getPOL_CARD_HOLDER_NAME() {
		return POL_CARD_HOLDER_NAME;
	}

	public void setPOL_CARD_HOLDER_NAME(String pOL_CARD_HOLDER_NAME) {
		POL_CARD_HOLDER_NAME = pOL_CARD_HOLDER_NAME;
	}

	public Double getPOL_AUTH_LIMIT() {
		return POL_AUTH_LIMIT;
	}

	public void setPOL_AUTH_LIMIT(Double pOL_AUTH_LIMIT) {
		POL_AUTH_LIMIT = pOL_AUTH_LIMIT;
	}

	public String getPOL_FLEX_02() {
		return POL_FLEX_02;
	}

	public void setPOL_FLEX_02(String pOL_FLEX_02) {
		POL_FLEX_02 = pOL_FLEX_02;
	}

	public String getPOL_ENROL_YN() {
		return POL_ENROL_YN;
	}

	public void setPOL_ENROL_YN(String pOL_ENROL_YN) {
		POL_ENROL_YN = pOL_ENROL_YN;
	}

	public String getPOL_INCORPORATED_YN() {
		return POL_INCORPORATED_YN;
	}

	public void setPOL_INCORPORATED_YN(String pOL_INCORPORATED_YN) {
		POL_INCORPORATED_YN = pOL_INCORPORATED_YN;
	}

	public Integer getPOL_DEFER_PRD() {
		return POL_DEFER_PRD;
	}

	public void setPOL_DEFER_PRD(Integer pOL_DEFER_PRD) {
		POL_DEFER_PRD = pOL_DEFER_PRD;
	}

	public Double getPOL_CO_COMM_PER() {
		return POL_CO_COMM_PER;
	}

	public void setPOL_CO_COMM_PER(Double pOL_CO_COMM_PER) {
		POL_CO_COMM_PER = pOL_CO_COMM_PER;
	}

	public Double getPOL_CO_MED_FEE() {
		return POL_CO_MED_FEE;
	}

	public void setPOL_CO_MED_FEE(Double pOL_CO_MED_FEE) {
		POL_CO_MED_FEE = pOL_CO_MED_FEE;
	}

	public Double getPOL_CO_SA_LC() {
		return POL_CO_SA_LC;
	}

	public void setPOL_CO_SA_LC(Double pOL_CO_SA_LC) {
		POL_CO_SA_LC = pOL_CO_SA_LC;
	}

	public Double getPOL_CO_TOT_PRM() {
		return POL_CO_TOT_PRM;
	}

	public void setPOL_CO_TOT_PRM(Double pOL_CO_TOT_PRM) {
		POL_CO_TOT_PRM = pOL_CO_TOT_PRM;
	}

	public String getPOL_WF_STS() {
		return POL_WF_STS;
	}

	public void setPOL_WF_STS(String pOL_WF_STS) {
		POL_WF_STS = pOL_WF_STS;
	}

	public String getPOL_FLEX_03() {
		return POL_FLEX_03;
	}

	public void setPOL_FLEX_03(String pOL_FLEX_03) {
		POL_FLEX_03 = pOL_FLEX_03;
	}

	public String getPOL_TERM_CALC_TYPE() {
		return POL_TERM_CALC_TYPE;
	}

	public void setPOL_TERM_CALC_TYPE(String pOL_TERM_CALC_TYPE) {
		POL_TERM_CALC_TYPE = pOL_TERM_CALC_TYPE;
	}

	public Long getPOL_HORTATION_NO() {
		return POL_HORTATION_NO;
	}

	public void setPOL_HORTATION_NO(Long pOL_HORTATION_NO) {
		POL_HORTATION_NO = pOL_HORTATION_NO;
	}

	public String getPOL_MOP_WAIVE() {
		return POL_MOP_WAIVE;
	}

	public void setPOL_MOP_WAIVE(String pOL_MOP_WAIVE) {
		POL_MOP_WAIVE = pOL_MOP_WAIVE;
	}

	public String getPOL_AMENDMENT_YN() {
		return POL_AMENDMENT_YN;
	}

	public void setPOL_AMENDMENT_YN(String pOL_AMENDMENT_YN) {
		POL_AMENDMENT_YN = pOL_AMENDMENT_YN;
	}

	public String getPOL_FCL_UPD_FLG() {
		return POL_FCL_UPD_FLG;
	}

	public void setPOL_FCL_UPD_FLG(String pOL_FCL_UPD_FLG) {
		POL_FCL_UPD_FLG = pOL_FCL_UPD_FLG;
	}

	public String getPOL_TREATY_CODE() {
		return POL_TREATY_CODE;
	}

	public void setPOL_TREATY_CODE(String pOL_TREATY_CODE) {
		POL_TREATY_CODE = pOL_TREATY_CODE;
	}

	public Integer getPOL_MAT_AGE() {
		return POL_MAT_AGE;
	}

	public void setPOL_MAT_AGE(Integer pOL_MAT_AGE) {
		POL_MAT_AGE = pOL_MAT_AGE;
	}

	public String getPOL_PW_RISK() {
		return POL_PW_RISK;
	}

	public void setPOL_PW_RISK(String pOL_PW_RISK) {
		POL_PW_RISK = pOL_PW_RISK;
	}

	public Double getPOL_SA_LIMIT() {
		return POL_SA_LIMIT;
	}

	public void setPOL_SA_LIMIT(Double pOL_SA_LIMIT) {
		POL_SA_LIMIT = pOL_SA_LIMIT;
	}

	public String getPOL_PREM_TYPE() {
		return POL_PREM_TYPE;
	}

	public void setPOL_PREM_TYPE(String pOL_PREM_TYPE) {
		POL_PREM_TYPE = pOL_PREM_TYPE;
	}

	public Double getPOL_ADMIN_RATE() {
		return POL_ADMIN_RATE;
	}

	public void setPOL_ADMIN_RATE(Double pOL_ADMIN_RATE) {
		POL_ADMIN_RATE = pOL_ADMIN_RATE;
	}

	public Double getPOL_ADMIN_AMT() {
		return POL_ADMIN_AMT;
	}

	public void setPOL_ADMIN_AMT(Double pOL_ADMIN_AMT) {
		POL_ADMIN_AMT = pOL_ADMIN_AMT;
	}

	public Integer getPOL_REFUND_MONTHS() {
		return POL_REFUND_MONTHS;
	}

	public void setPOL_REFUND_MONTHS(Integer pOL_REFUND_MONTHS) {
		POL_REFUND_MONTHS = pOL_REFUND_MONTHS;
	}

	public String getPOL_CUST_REF_ID() {
		return POL_CUST_REF_ID;
	}

	public void setPOL_CUST_REF_ID(String pOL_CUST_REF_ID) {
		POL_CUST_REF_ID = pOL_CUST_REF_ID;
	}

	public String getPOL_ASSRD_REF_ID() {
		return POL_ASSRD_REF_ID;
	}

	public void setPOL_ASSRD_REF_ID(String pOL_ASSRD_REF_ID) {
		POL_ASSRD_REF_ID = pOL_ASSRD_REF_ID;
	}

	public Double getPOL_BASIC_RATE() {
		return POL_BASIC_RATE;
	}

	public void setPOL_BASIC_RATE(Double pOL_BASIC_RATE) {
		POL_BASIC_RATE = pOL_BASIC_RATE;
	}

	public Date getPOL_CANCEL_DT() {
		return POL_CANCEL_DT;
	}

	public void setPOL_CANCEL_DT(Date pOL_CANCEL_DT) {
		POL_CANCEL_DT = pOL_CANCEL_DT;
	}

	public String getPOL_CONVERT_YN() {
		return POL_CONVERT_YN;
	}

	public void setPOL_CONVERT_YN(String pOL_CONVERT_YN) {
		POL_CONVERT_YN = pOL_CONVERT_YN;
	}

	public Double getPOL_FC_ADDL_PREM() {
		return POL_FC_ADDL_PREM;
	}

	public void setPOL_FC_ADDL_PREM(Double pOL_FC_ADDL_PREM) {
		POL_FC_ADDL_PREM = pOL_FC_ADDL_PREM;
	}

	public Double getPOL_FC_BASIC_PREM() {
		return POL_FC_BASIC_PREM;
	}

	public void setPOL_FC_BASIC_PREM(Double pOL_FC_BASIC_PREM) {
		POL_FC_BASIC_PREM = pOL_FC_BASIC_PREM;
	}

	public Integer getPOL_JOINT_LIFE_AGE() {
		return POL_JOINT_LIFE_AGE;
	}

	public void setPOL_JOINT_LIFE_AGE(Integer pOL_JOINT_LIFE_AGE) {
		POL_JOINT_LIFE_AGE = pOL_JOINT_LIFE_AGE;
	}

	public Date getPOL_LAST_INST_DT() {
		return POL_LAST_INST_DT;
	}

	public void setPOL_LAST_INST_DT(Date pOL_LAST_INST_DT) {
		POL_LAST_INST_DT = pOL_LAST_INST_DT;
	}

	public Double getPOL_LC_ADDL_PREM() {
		return POL_LC_ADDL_PREM;
	}

	public void setPOL_LC_ADDL_PREM(Double pOL_LC_ADDL_PREM) {
		POL_LC_ADDL_PREM = pOL_LC_ADDL_PREM;
	}

	public Double getPOL_LC_BASIC_PREM() {
		return POL_LC_BASIC_PREM;
	}

	public void setPOL_LC_BASIC_PREM(Double pOL_LC_BASIC_PREM) {
		POL_LC_BASIC_PREM = pOL_LC_BASIC_PREM;
	}

	public Double getPOL_NO_YRS_PREM_PAID() {
		return POL_NO_YRS_PREM_PAID;
	}

	public void setPOL_NO_YRS_PREM_PAID(Double pOL_NO_YRS_PREM_PAID) {
		POL_NO_YRS_PREM_PAID = pOL_NO_YRS_PREM_PAID;
	}

	public Long getPOL_PERIOD() {
		return POL_PERIOD;
	}

	public void setPOL_PERIOD(Long pOL_PERIOD) {
		POL_PERIOD = pOL_PERIOD;
	}

	public String getPOL_PLAN_CODE() {
		return POL_PLAN_CODE;
	}

	public void setPOL_PLAN_CODE(String pOL_PLAN_CODE) {
		POL_PLAN_CODE = pOL_PLAN_CODE;
	}

	public Integer getPOL_PREM_PAY_YRS() {
		return POL_PREM_PAY_YRS;
	}

	public void setPOL_PREM_PAY_YRS(Integer pOL_PREM_PAY_YRS) {
		POL_PREM_PAY_YRS = pOL_PREM_PAY_YRS;
	}

	public String getPOL_PREM_PAYOR_CODE() {
		return POL_PREM_PAYOR_CODE;
	}

	public void setPOL_PREM_PAYOR_CODE(String pOL_PREM_PAYOR_CODE) {
		POL_PREM_PAYOR_CODE = pOL_PREM_PAYOR_CODE;
	}

	public String getPOL_COMP_CODE() {
		return POL_COMP_CODE;
	}

	public void setPOL_COMP_CODE(String pOL_COMP_CODE) {
		POL_COMP_CODE = pOL_COMP_CODE;
	}

	public Integer getPOL_PROGRS_UPD() {
		return POL_PROGRS_UPD;
	}

	public void setPOL_PROGRS_UPD(Integer pOL_PROGRS_UPD) {
		POL_PROGRS_UPD = pOL_PROGRS_UPD;
	}

	public String getPOL_AGENT_CODE() {
		return POL_AGENT_CODE;
	}

	public void setPOL_AGENT_CODE(String pOL_AGENT_CODE) {
		POL_AGENT_CODE = pOL_AGENT_CODE;
	}

	public String getPOL_ASSR_CUST_FLAG() {
		return POL_ASSR_CUST_FLAG;
	}

	public void setPOL_ASSR_CUST_FLAG(String pOL_ASSR_CUST_FLAG) {
		POL_ASSR_CUST_FLAG = pOL_ASSR_CUST_FLAG;
	}

	public String getPOL_AGENT_COMM_BASIS() {
		return POL_AGENT_COMM_BASIS;
	}

	public void setPOL_AGENT_COMM_BASIS(String pOL_AGENT_COMM_BASIS) {
		POL_AGENT_COMM_BASIS = pOL_AGENT_COMM_BASIS;
	}

}