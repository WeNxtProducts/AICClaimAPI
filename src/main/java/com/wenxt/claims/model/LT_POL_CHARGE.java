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
@Table(name = "LT_POL_CHARGE", schema = "LIFE_DEV")
public class LT_POL_CHARGE {

    @Id
    @SequenceGenerator(name = "PolChargeTranIDSeq", sequenceName = "PCHRG_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PolChargeTranIDSeq")
    @Column(name = "PCHRG_TRAN_ID")
    private Long PCHRG_TRAN_ID;

    @Column(name = "PCHRG_POL_TRAN_ID")
    private Integer PCHRG_POL_TRAN_ID;

    @Column(name = "PCHRG_CODE")
    private String PCHRG_CODE;

    @Column(name = "PCHRG_DESC")
    private String PCHRG_DESC;

    @Column(name = "PCHRG_PERC")
    private Double PCHRG_PERC;

    @Column(name = "PCHRG_FC_VALUE")
    private Double PCHRG_FC_VALUE;

    @Column(name = "PCHRG_LC_VALUE")
    private Double PCHRG_LC_VALUE;

    @Column(name = "PCHRG_DEL_FLAG")
    private String PCHRG_DEL_FLAG;

    @Column(name = "PCHRG_ORG_FC_VALUE")
    private Double PCHRG_ORG_FC_VALUE;

    @Column(name = "PCHRG_ORG_LC_VALUE")
    private Double PCHRG_ORG_LC_VALUE;

    @Column(name = "PCHRG_INS_DT")
    private Date PCHRG_INS_DT;

    @Column(name = "PCHRG_INS_ID")
    private String PCHRG_INS_ID;

    @Column(name = "PCHRG_MOD_DT")
    private Date PCHRG_MOD_DT;

    @Column(name = "PCHRG_MOD_ID")
    private String PCHRG_MOD_ID;

    @Column(name = "PCHRG_RATE")
    private Double PCHRG_RATE;

    @Column(name = "PCHRG_RATE_PER")
    private Integer PCHRG_RATE_PER;

    @Column(name = "PCHRG_APPLIED_ON")
    private String PCHRG_APPLIED_ON;

    @Column(name = "PCHRG_TYPE")
    private String PCHRG_TYPE;

    @Column(name = "PCHRG_CUST_SHARE_PERC")
    private Double PCHRG_CUST_SHARE_PERC;

    @Column(name = "PCHRG_REC_TYPE")
    private String PCHRG_REC_TYPE;

    @Column(name = "PCHRG_FC_COMP_VALUE")
    private Double PCHRG_FC_COMP_VALUE;

    @Column(name = "PCHRG_LC_COMP_VALUE")
    private Double PCHRG_LC_COMP_VALUE;

    @Column(name = "PCHRG_ORG_FC_COMP_VALUE")
    private Double PCHRG_ORG_FC_COMP_VALUE;

    @Column(name = "PCHRG_ORG_LC_COMP_VALUE")
    private Double PCHRG_ORG_LC_COMP_VALUE;

    @Column(name = "PCHRG_PRORATE_COLL_YN")
    private String PCHRG_PRORATE_COLL_YN;

    @Column(name = "PCHRG_PRORATE_REFN_YN")
    private String PCHRG_PRORATE_REFN_YN;
    
    @Column(name = "PCHRG_APPLY_PERIOD")
    private String PCHRG_APPLY_PERIOD;

	public Long getPCHRG_TRAN_ID() {
		return PCHRG_TRAN_ID;
	}

	public void setPCHRG_TRAN_ID(Long pCHRG_TRAN_ID) {
		PCHRG_TRAN_ID = pCHRG_TRAN_ID;
	}

	public Integer getPCHRG_POL_TRAN_ID() {
		return PCHRG_POL_TRAN_ID;
	}

	public void setPCHRG_POL_TRAN_ID(Integer pCHRG_POL_TRAN_ID) {
		PCHRG_POL_TRAN_ID = pCHRG_POL_TRAN_ID;
	}

	public String getPCHRG_CODE() {
		return PCHRG_CODE;
	}

	public void setPCHRG_CODE(String pCHRG_CODE) {
		PCHRG_CODE = pCHRG_CODE;
	}

	public String getPCHRG_DESC() {
		return PCHRG_DESC;
	}

	public void setPCHRG_DESC(String pCHRG_DESC) {
		PCHRG_DESC = pCHRG_DESC;
	}

	public Double getPCHRG_PERC() {
		return PCHRG_PERC;
	}

	public void setPCHRG_PERC(Double pCHRG_PERC) {
		PCHRG_PERC = pCHRG_PERC;
	}

	public Double getPCHRG_FC_VALUE() {
		return PCHRG_FC_VALUE;
	}

	public void setPCHRG_FC_VALUE(Double pCHRG_FC_VALUE) {
		PCHRG_FC_VALUE = pCHRG_FC_VALUE;
	}

	public Double getPCHRG_LC_VALUE() {
		return PCHRG_LC_VALUE;
	}

	public void setPCHRG_LC_VALUE(Double pCHRG_LC_VALUE) {
		PCHRG_LC_VALUE = pCHRG_LC_VALUE;
	}

	public String getPCHRG_DEL_FLAG() {
		return PCHRG_DEL_FLAG;
	}

	public void setPCHRG_DEL_FLAG(String pCHRG_DEL_FLAG) {
		PCHRG_DEL_FLAG = pCHRG_DEL_FLAG;
	}

	public Double getPCHRG_ORG_FC_VALUE() {
		return PCHRG_ORG_FC_VALUE;
	}

	public void setPCHRG_ORG_FC_VALUE(Double pCHRG_ORG_FC_VALUE) {
		PCHRG_ORG_FC_VALUE = pCHRG_ORG_FC_VALUE;
	}

	public Double getPCHRG_ORG_LC_VALUE() {
		return PCHRG_ORG_LC_VALUE;
	}

	public void setPCHRG_ORG_LC_VALUE(Double pCHRG_ORG_LC_VALUE) {
		PCHRG_ORG_LC_VALUE = pCHRG_ORG_LC_VALUE;
	}

	public Date getPCHRG_INS_DT() {
		return PCHRG_INS_DT;
	}

	public void setPCHRG_INS_DT(Date pCHRG_INS_DT) {
		PCHRG_INS_DT = pCHRG_INS_DT;
	}

	public String getPCHRG_INS_ID() {
		return PCHRG_INS_ID;
	}

	public void setPCHRG_INS_ID(String pCHRG_INS_ID) {
		PCHRG_INS_ID = pCHRG_INS_ID;
	}

	public Date getPCHRG_MOD_DT() {
		return PCHRG_MOD_DT;
	}

	public void setPCHRG_MOD_DT(Date pCHRG_MOD_DT) {
		PCHRG_MOD_DT = pCHRG_MOD_DT;
	}

	public String getPCHRG_MOD_ID() {
		return PCHRG_MOD_ID;
	}

	public void setPCHRG_MOD_ID(String pCHRG_MOD_ID) {
		PCHRG_MOD_ID = pCHRG_MOD_ID;
	}

	public Double getPCHRG_RATE() {
		return PCHRG_RATE;
	}

	public void setPCHRG_RATE(Double pCHRG_RATE) {
		PCHRG_RATE = pCHRG_RATE;
	}

	public Integer getPCHRG_RATE_PER() {
		return PCHRG_RATE_PER;
	}

	public void setPCHRG_RATE_PER(Integer pCHRG_RATE_PER) {
		PCHRG_RATE_PER = pCHRG_RATE_PER;
	}

	public String getPCHRG_APPLIED_ON() {
		return PCHRG_APPLIED_ON;
	}

	public void setPCHRG_APPLIED_ON(String pCHRG_APPLIED_ON) {
		PCHRG_APPLIED_ON = pCHRG_APPLIED_ON;
	}

	public String getPCHRG_TYPE() {
		return PCHRG_TYPE;
	}

	public void setPCHRG_TYPE(String pCHRG_TYPE) {
		PCHRG_TYPE = pCHRG_TYPE;
	}

	public Double getPCHRG_CUST_SHARE_PERC() {
		return PCHRG_CUST_SHARE_PERC;
	}

	public void setPCHRG_CUST_SHARE_PERC(Double pCHRG_CUST_SHARE_PERC) {
		PCHRG_CUST_SHARE_PERC = pCHRG_CUST_SHARE_PERC;
	}

	public String getPCHRG_REC_TYPE() {
		return PCHRG_REC_TYPE;
	}

	public void setPCHRG_REC_TYPE(String pCHRG_REC_TYPE) {
		PCHRG_REC_TYPE = pCHRG_REC_TYPE;
	}

	public Double getPCHRG_FC_COMP_VALUE() {
		return PCHRG_FC_COMP_VALUE;
	}

	public void setPCHRG_FC_COMP_VALUE(Double pCHRG_FC_COMP_VALUE) {
		PCHRG_FC_COMP_VALUE = pCHRG_FC_COMP_VALUE;
	}

	public Double getPCHRG_LC_COMP_VALUE() {
		return PCHRG_LC_COMP_VALUE;
	}

	public void setPCHRG_LC_COMP_VALUE(Double pCHRG_LC_COMP_VALUE) {
		PCHRG_LC_COMP_VALUE = pCHRG_LC_COMP_VALUE;
	}

	public Double getPCHRG_ORG_FC_COMP_VALUE() {
		return PCHRG_ORG_FC_COMP_VALUE;
	}

	public void setPCHRG_ORG_FC_COMP_VALUE(Double pCHRG_ORG_FC_COMP_VALUE) {
		PCHRG_ORG_FC_COMP_VALUE = pCHRG_ORG_FC_COMP_VALUE;
	}

	public Double getPCHRG_ORG_LC_COMP_VALUE() {
		return PCHRG_ORG_LC_COMP_VALUE;
	}

	public void setPCHRG_ORG_LC_COMP_VALUE(Double pCHRG_ORG_LC_COMP_VALUE) {
		PCHRG_ORG_LC_COMP_VALUE = pCHRG_ORG_LC_COMP_VALUE;
	}

	public String getPCHRG_PRORATE_COLL_YN() {
		return PCHRG_PRORATE_COLL_YN;
	}

	public void setPCHRG_PRORATE_COLL_YN(String pCHRG_PRORATE_COLL_YN) {
		PCHRG_PRORATE_COLL_YN = pCHRG_PRORATE_COLL_YN;
	}

	public String getPCHRG_PRORATE_REFN_YN() {
		return PCHRG_PRORATE_REFN_YN;
	}

	public void setPCHRG_PRORATE_REFN_YN(String pCHRG_PRORATE_REFN_YN) {
		PCHRG_PRORATE_REFN_YN = pCHRG_PRORATE_REFN_YN;
	}

	public String getPCHRG_APPLY_PERIOD() {
		return PCHRG_APPLY_PERIOD;
	}

	public void setPCHRG_APPLY_PERIOD(String pCHRG_APPLY_PERIOD) {
		PCHRG_APPLY_PERIOD = pCHRG_APPLY_PERIOD;
	}

}