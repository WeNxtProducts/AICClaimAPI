package com.wenxt.claims.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "LT_POL_BROKER", schema = "LIFE_DEV")
public class LT_POL_BROKER {

    @Id
    @SequenceGenerator(name = "PolBrokerTranIDSeq", sequenceName = "PBRK_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PolBrokerTranIDSeq")
    @Column(name = "PBRK_TRAN_ID")
    private Long PBRK_TRAN_ID;

    @Column(name = "PBRK_POL_TRAN_ID")
    private Integer PBRK_POL_TRAN_ID;

    @Column(name = "PBRK_BRK_CODE")
    private String PBRK_BRK_CODE;

    @Column(name = "PBRK_COMM_CODE")
    private String PBRK_COMM_CODE;

    @Column(name = "PBRK_CURR_CODE")
    private String PBRK_CURR_CODE;

    @Column(name = "PBRK_CURR_RATE")
    private BigDecimal PBRK_CURR_RATE;

    @Column(name = "PBRK_BRK_PERC")
    private BigDecimal PBRK_BRK_PERC;

    @Column(name = "PBRK_FC_COMM")
    private BigDecimal PBRK_FC_COMM;

    @Column(name = "PBRK_LC_COMM")
    private BigDecimal PBRK_LC_COMM;

    @Column(name = "PBRK_ORG_FC_COMM")
    private BigDecimal PBRK_ORG_FC_COMM;

    @Column(name = "PBRK_ORG_LC_COMM")
    private BigDecimal PBRK_ORG_LC_COMM;

    @Column(name = "PBRK_DEL_FLAG")
    private String PBRK_DEL_FLAG;

    @Column(name = "PBRK_INS_DT")
    private Date PBRK_INS_DT;

    @Column(name = "PBRK_INS_ID")
    private String PBRK_INS_ID;

    @Column(name = "PBRK_MOD_DT")
    private Date PBRK_MOD_DT;

    @Column(name = "PBRK_MOD_ID")
    private String PBRK_MOD_ID;

    @Column(name = "PBRK_COUNTRY_CODE")
    private String PBRK_COUNTRY_CODE;

    @Column(name = "PBRK_LOCATION_CODE")
    private String PBRK_LOCATION_CODE;

    @Column(name = "PBRK_REC_TYPE")
    private String PBRK_REC_TYPE;

    @Column(name = "PBRK_SRNO")
    private Integer PBRK_SRNO;

    @Column(name = "PBRK_APPLY_ON_SRNO")
    private Integer PBRK_APPLY_ON_SRNO;

    @Column(name = "PBRK_ACTING_AGENT_YN")
    private String PBRK_ACTING_AGENT_YN;

    @Column(name = "PBRK_AGENT_RANK_CODE")
    private String PBRK_AGENT_RANK_CODE;

    @Column(name = "PBRK_AGENT_LEVEL")
    private BigDecimal PBRK_AGENT_LEVEL;

    @Column(name = "PBRK_MKT_CODE")
    private String PBRK_MKT_CODE;

    @Column(name = "PBRK_UNIT_CODE")
    private String PBRK_UNIT_CODE;

    @Column(name = "PBRK_AGENCY_BRANCH_CODE")
    private String PBRK_AGENCY_BRANCH_CODE;

    @Column(name = "PBRK_REGION_CODE")
    private String PBRK_REGION_CODE;

    @Column(name = "PBRK_AGENCY_CODE")
    private String PBRK_AGENCY_CODE;

    @Column(name = "PBRK_RECRUITER_CODE")
    private String PBRK_RECRUITER_CODE;

    @Column(name = "PBRK_BRK_RATE_PER")
    private Long PBRK_BRK_RATE_PER;

    @Column(name = "PBRK_COMM_TYPE")
    private String PBRK_COMM_TYPE;

    @Column(name = "PBRK_ADV_BDE_TYPE")
    private String PBRK_ADV_BDE_TYPE;

    @Column(name = "PBRK_COMM_CALC_TYPE")
    private String PBRK_COMM_CALC_TYPE;

    @Column(name = "PBRK_VAT_LC_VALUE")
    private BigDecimal PBRK_VAT_LC_VALUE;

    @Column(name = "PBRK_VAT_FC_VALUE")
    private BigDecimal PBRK_VAT_FC_VALUE;

    @Column(name = "PBRK_SELF_INVOICE_YN")
    private String PBRK_SELF_INVOICE_YN;

    @Column(name = "PBRK_WHT_LC_VALUE")
    private BigDecimal PBRK_WHT_LC_VALUE;

    @Column(name = "PBRK_WHT_FC_VALUE")
    private BigDecimal PBRK_WHT_FC_VALUE;

    @Column(name = "PBRK_COMM_YN")
    private String PBRK_COMM_YN;

    @Column(name = "PBRK_VAT_PERC")
    private BigDecimal PBRK_VAT_PERC;

    @Column(name = "PBRK_WHT_PERC")
    private BigDecimal PBRK_WHT_PERC;

    @Column(name = "PBRK_BRK_NAME")
    private String PBRK_BRK_NAME;
    
    @Column(name = "PBRK_PARENT_CODE")
    private String PBRK_PARENT_CODE;
    
    @Column(name = "PBRK_AGENT_HIERARCHY")
    private String PBRK_AGENT_HIERARCHY;
    
    @Transient
    private List<?> children;
    
	public Long getPBRK_TRAN_ID() {
		return PBRK_TRAN_ID;
	}

	public void setPBRK_TRAN_ID(Long pBRK_TRAN_ID) {
		PBRK_TRAN_ID = pBRK_TRAN_ID;
	}

	public Integer getPBRK_POL_TRAN_ID() {
		return PBRK_POL_TRAN_ID;
	}

	public void setPBRK_POL_TRAN_ID(Integer pBRK_POL_TRAN_ID) {
		PBRK_POL_TRAN_ID = pBRK_POL_TRAN_ID;
	}

	public String getPBRK_BRK_CODE() {
		return PBRK_BRK_CODE;
	}

	public void setPBRK_BRK_CODE(String pBRK_BRK_CODE) {
		PBRK_BRK_CODE = pBRK_BRK_CODE;
	}

	public String getPBRK_COMM_CODE() {
		return PBRK_COMM_CODE;
	}

	public void setPBRK_COMM_CODE(String pBRK_COMM_CODE) {
		PBRK_COMM_CODE = pBRK_COMM_CODE;
	}

	public String getPBRK_CURR_CODE() {
		return PBRK_CURR_CODE;
	}

	public void setPBRK_CURR_CODE(String pBRK_CURR_CODE) {
		PBRK_CURR_CODE = pBRK_CURR_CODE;
	}

	public BigDecimal getPBRK_CURR_RATE() {
		return PBRK_CURR_RATE;
	}

	public void setPBRK_CURR_RATE(BigDecimal pBRK_CURR_RATE) {
		PBRK_CURR_RATE = pBRK_CURR_RATE;
	}

	public BigDecimal getPBRK_BRK_PERC() {
		return PBRK_BRK_PERC;
	}

	public void setPBRK_BRK_PERC(BigDecimal pBRK_BRK_PERC) {
		PBRK_BRK_PERC = pBRK_BRK_PERC;
	}

	public BigDecimal getPBRK_FC_COMM() {
		return PBRK_FC_COMM;
	}

	public void setPBRK_FC_COMM(BigDecimal pBRK_FC_COMM) {
		PBRK_FC_COMM = pBRK_FC_COMM;
	}

	public BigDecimal getPBRK_LC_COMM() {
		return PBRK_LC_COMM;
	}

	public void setPBRK_LC_COMM(BigDecimal pBRK_LC_COMM) {
		PBRK_LC_COMM = pBRK_LC_COMM;
	}

	public BigDecimal getPBRK_ORG_FC_COMM() {
		return PBRK_ORG_FC_COMM;
	}

	public void setPBRK_ORG_FC_COMM(BigDecimal pBRK_ORG_FC_COMM) {
		PBRK_ORG_FC_COMM = pBRK_ORG_FC_COMM;
	}

	public BigDecimal getPBRK_ORG_LC_COMM() {
		return PBRK_ORG_LC_COMM;
	}

	public void setPBRK_ORG_LC_COMM(BigDecimal pBRK_ORG_LC_COMM) {
		PBRK_ORG_LC_COMM = pBRK_ORG_LC_COMM;
	}

	public String getPBRK_DEL_FLAG() {
		return PBRK_DEL_FLAG;
	}

	public void setPBRK_DEL_FLAG(String pBRK_DEL_FLAG) {
		PBRK_DEL_FLAG = pBRK_DEL_FLAG;
	}

	public Date getPBRK_INS_DT() {
		return PBRK_INS_DT;
	}

	public void setPBRK_INS_DT(Date pBRK_INS_DT) {
		PBRK_INS_DT = pBRK_INS_DT;
	}

	public String getPBRK_INS_ID() {
		return PBRK_INS_ID;
	}

	public void setPBRK_INS_ID(String pBRK_INS_ID) {
		PBRK_INS_ID = pBRK_INS_ID;
	}

	public Date getPBRK_MOD_DT() {
		return PBRK_MOD_DT;
	}

	public void setPBRK_MOD_DT(Date pBRK_MOD_DT) {
		PBRK_MOD_DT = pBRK_MOD_DT;
	}

	public String getPBRK_MOD_ID() {
		return PBRK_MOD_ID;
	}

	public void setPBRK_MOD_ID(String pBRK_MOD_ID) {
		PBRK_MOD_ID = pBRK_MOD_ID;
	}

	public String getPBRK_COUNTRY_CODE() {
		return PBRK_COUNTRY_CODE;
	}

	public void setPBRK_COUNTRY_CODE(String pBRK_COUNTRY_CODE) {
		PBRK_COUNTRY_CODE = pBRK_COUNTRY_CODE;
	}

	public String getPBRK_LOCATION_CODE() {
		return PBRK_LOCATION_CODE;
	}

	public void setPBRK_LOCATION_CODE(String pBRK_LOCATION_CODE) {
		PBRK_LOCATION_CODE = pBRK_LOCATION_CODE;
	}

	public String getPBRK_REC_TYPE() {
		return PBRK_REC_TYPE;
	}

	public void setPBRK_REC_TYPE(String pBRK_REC_TYPE) {
		PBRK_REC_TYPE = pBRK_REC_TYPE;
	}

	public Integer getPBRK_SRNO() {
		return PBRK_SRNO;
	}

	public void setPBRK_SRNO(Integer pBRK_SRNO) {
		PBRK_SRNO = pBRK_SRNO;
	}

	public Integer getPBRK_APPLY_ON_SRNO() {
		return PBRK_APPLY_ON_SRNO;
	}

	public void setPBRK_APPLY_ON_SRNO(Integer pBRK_APPLY_ON_SRNO) {
		PBRK_APPLY_ON_SRNO = pBRK_APPLY_ON_SRNO;
	}

	public String getPBRK_ACTING_AGENT_YN() {
		return PBRK_ACTING_AGENT_YN;
	}

	public void setPBRK_ACTING_AGENT_YN(String pBRK_ACTING_AGENT_YN) {
		PBRK_ACTING_AGENT_YN = pBRK_ACTING_AGENT_YN;
	}

	public String getPBRK_AGENT_RANK_CODE() {
		return PBRK_AGENT_RANK_CODE;
	}

	public void setPBRK_AGENT_RANK_CODE(String pBRK_AGENT_RANK_CODE) {
		PBRK_AGENT_RANK_CODE = pBRK_AGENT_RANK_CODE;
	}

	public BigDecimal getPBRK_AGENT_LEVEL() {
		return PBRK_AGENT_LEVEL;
	}

	public void setPBRK_AGENT_LEVEL(BigDecimal pBRK_AGENT_LEVEL) {
		PBRK_AGENT_LEVEL = pBRK_AGENT_LEVEL;
	}

	public String getPBRK_MKT_CODE() {
		return PBRK_MKT_CODE;
	}

	public void setPBRK_MKT_CODE(String pBRK_MKT_CODE) {
		PBRK_MKT_CODE = pBRK_MKT_CODE;
	}

	public String getPBRK_UNIT_CODE() {
		return PBRK_UNIT_CODE;
	}

	public void setPBRK_UNIT_CODE(String pBRK_UNIT_CODE) {
		PBRK_UNIT_CODE = pBRK_UNIT_CODE;
	}

	public String getPBRK_AGENCY_BRANCH_CODE() {
		return PBRK_AGENCY_BRANCH_CODE;
	}

	public void setPBRK_AGENCY_BRANCH_CODE(String pBRK_AGENCY_BRANCH_CODE) {
		PBRK_AGENCY_BRANCH_CODE = pBRK_AGENCY_BRANCH_CODE;
	}

	public String getPBRK_REGION_CODE() {
		return PBRK_REGION_CODE;
	}

	public void setPBRK_REGION_CODE(String pBRK_REGION_CODE) {
		PBRK_REGION_CODE = pBRK_REGION_CODE;
	}

	public String getPBRK_AGENCY_CODE() {
		return PBRK_AGENCY_CODE;
	}

	public void setPBRK_AGENCY_CODE(String pBRK_AGENCY_CODE) {
		PBRK_AGENCY_CODE = pBRK_AGENCY_CODE;
	}

	public String getPBRK_RECRUITER_CODE() {
		return PBRK_RECRUITER_CODE;
	}

	public void setPBRK_RECRUITER_CODE(String pBRK_RECRUITER_CODE) {
		PBRK_RECRUITER_CODE = pBRK_RECRUITER_CODE;
	}

	public Long getPBRK_BRK_RATE_PER() {
		return PBRK_BRK_RATE_PER;
	}

	public void setPBRK_BRK_RATE_PER(Long pBRK_BRK_RATE_PER) {
		PBRK_BRK_RATE_PER = pBRK_BRK_RATE_PER;
	}

	public String getPBRK_COMM_TYPE() {
		return PBRK_COMM_TYPE;
	}

	public void setPBRK_COMM_TYPE(String pBRK_COMM_TYPE) {
		PBRK_COMM_TYPE = pBRK_COMM_TYPE;
	}

	public String getPBRK_ADV_BDE_TYPE() {
		return PBRK_ADV_BDE_TYPE;
	}

	public void setPBRK_ADV_BDE_TYPE(String pBRK_ADV_BDE_TYPE) {
		PBRK_ADV_BDE_TYPE = pBRK_ADV_BDE_TYPE;
	}

	public String getPBRK_COMM_CALC_TYPE() {
		return PBRK_COMM_CALC_TYPE;
	}

	public void setPBRK_COMM_CALC_TYPE(String pBRK_COMM_CALC_TYPE) {
		PBRK_COMM_CALC_TYPE = pBRK_COMM_CALC_TYPE;
	}

	public BigDecimal getPBRK_VAT_LC_VALUE() {
		return PBRK_VAT_LC_VALUE;
	}

	public void setPBRK_VAT_LC_VALUE(BigDecimal pBRK_VAT_LC_VALUE) {
		PBRK_VAT_LC_VALUE = pBRK_VAT_LC_VALUE;
	}

	public BigDecimal getPBRK_VAT_FC_VALUE() {
		return PBRK_VAT_FC_VALUE;
	}

	public void setPBRK_VAT_FC_VALUE(BigDecimal pBRK_VAT_FC_VALUE) {
		PBRK_VAT_FC_VALUE = pBRK_VAT_FC_VALUE;
	}

	public String getPBRK_SELF_INVOICE_YN() {
		return PBRK_SELF_INVOICE_YN;
	}

	public void setPBRK_SELF_INVOICE_YN(String pBRK_SELF_INVOICE_YN) {
		PBRK_SELF_INVOICE_YN = pBRK_SELF_INVOICE_YN;
	}

	public BigDecimal getPBRK_WHT_LC_VALUE() {
		return PBRK_WHT_LC_VALUE;
	}

	public void setPBRK_WHT_LC_VALUE(BigDecimal pBRK_WHT_LC_VALUE) {
		PBRK_WHT_LC_VALUE = pBRK_WHT_LC_VALUE;
	}

	public BigDecimal getPBRK_WHT_FC_VALUE() {
		return PBRK_WHT_FC_VALUE;
	}

	public void setPBRK_WHT_FC_VALUE(BigDecimal pBRK_WHT_FC_VALUE) {
		PBRK_WHT_FC_VALUE = pBRK_WHT_FC_VALUE;
	}

	public String getPBRK_COMM_YN() {
		return PBRK_COMM_YN;
	}

	public void setPBRK_COMM_YN(String pBRK_COMM_YN) {
		PBRK_COMM_YN = pBRK_COMM_YN;
	}

	public BigDecimal getPBRK_VAT_PERC() {
		return PBRK_VAT_PERC;
	}

	public void setPBRK_VAT_PERC(BigDecimal pBRK_VAT_PERC) {
		PBRK_VAT_PERC = pBRK_VAT_PERC;
	}

	public BigDecimal getPBRK_WHT_PERC() {
		return PBRK_WHT_PERC;
	}

	public void setPBRK_WHT_PERC(BigDecimal pBRK_WHT_PERC) {
		PBRK_WHT_PERC = pBRK_WHT_PERC;
	}

	public String getPBRK_BRK_NAME() {
		return PBRK_BRK_NAME;
	}

	public void setPBRK_BRK_NAME(String pBRK_BRK_NAME) {
		PBRK_BRK_NAME = pBRK_BRK_NAME;
	}

	public String getPBRK_PARENT_CODE() {
		return PBRK_PARENT_CODE;
	}

	public void setPBRK_PARENT_CODE(String pBRK_PARENT_CODE) {
		PBRK_PARENT_CODE = pBRK_PARENT_CODE;
	}

	public String getPBRK_AGENT_HIERARCHY() {
		return PBRK_AGENT_HIERARCHY;
	}

	public void setPBRK_AGENT_HIERARCHY(String pBRK_AGENT_HIERARCHY) {
		PBRK_AGENT_HIERARCHY = pBRK_AGENT_HIERARCHY;
	}

	public List<?> getChildren() {
		return children;
	}

	public void setChildren(List<?> children) {
		this.children = children;
	}

}
