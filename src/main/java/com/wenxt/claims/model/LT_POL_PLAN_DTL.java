package com.wenxt.claims.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "LT_POL_PLAN_DTL", schema = "LIFE_DEV")
public class LT_POL_PLAN_DTL {

    @Id
    @Column(name = "PPD_TRAN_ID", nullable = false)
    private Long PPD_TRAN_ID;

    @Column(name = "PPD_PPH_TRAN_ID")
    private Long PPD_PPH_TRAN_ID;

    @Column(name = "PPD_POL_TRAN_ID")
    private Long PPD_POL_TRAN_ID;

    @Column(name = "PPD_PLAN_CODE")
    private String PPD_PLAN_CODE;

    @Column(name = "PPD_PROD_CODE")
    private String PPD_PROD_CODE;

    @Column(name = "PPD_COVER_CODE")
    private String PPD_COVER_CODE;

    @Column(name = "PPD_SA_TYPE")
    private String PPD_SA_TYPE;

    @Column(name = "PPD_SA_PERC")
    private BigDecimal PPD_SA_PERC;

    @Column(name = "PPD_SA_MONTHS")
    private BigDecimal PPD_SA_MONTHS;

    @Column(name = "PPD_SA_LC_LIMIT")
    private BigDecimal PPD_SA_LC_LIMIT;

    @Temporal(TemporalType.DATE)
    @Column(name = "PPD_INS_DT")
    private Date PPD_INS_DT;

    @Column(name = "PPD_INS_ID")
    private String PPD_INS_ID;

    @Temporal(TemporalType.DATE)
    @Column(name = "PPD_MOD_DT")
    private Date PPD_MOD_DT;

    @Column(name = "PPD_MOD_ID")
    private String PPD_MOD_ID;

    @Column(name = "PPD_DEPN_APPL_YN")
    private String PPD_DEPN_APPL_YN;

    @Column(name = "PPD_DEP_RATE")
    private BigDecimal PPD_DEP_RATE;

    @Column(name = "PPD_FC_FCL")
    private BigDecimal PPD_FC_FCL;

    @Column(name = "PPD_LC_FCL")
    private BigDecimal PPD_LC_FCL;

    @Temporal(TemporalType.DATE)
    @Column(name = "PPD_EFF_FM_DT")
    private Date PPD_EFF_FM_DT;

    @Column(name = "PPD_MAX_CLM_PERC")
    private BigDecimal PPD_MAX_CLM_PERC;

    @Column(name = "PPD_PRORATE_REFN_YN")
    private String PPD_PRORATE_REFN_YN;

    @Column(name = "PPD_PRORATE_COLL_YN")
    private String PPD_PRORATE_COLL_YN;

    @Column(name = "PPD_EFF_TO_DT")
    private Date PPD_EFF_TO_DT;

    @Column(name = "PPD_MANDATORY_YN")
    private String PPD_MANDATORY_YN;

    @Column(name = "PPD_RATE_TYPE")
    private String PPD_RATE_TYPE;

    @Column(name = "PPD_RATE_PER")
    private Long PPD_RATE_PER;

    @Column(name = "PPD_DEL_FLAG")
    private String PPD_DEL_FLAG;

    @Column(name = "PPD_REC_TYPE")
    private String PPD_REC_TYPE;

    @Column(name = "PPD_FLEX_01")
    private String PPD_FLEX_01;

    @Column(name = "PPD_RI_RATE_TYPE")
    private String PPD_RI_RATE_TYPE;

    @Column(name = "PPD_RI_RATE")
    private BigDecimal PPD_RI_RATE;

    @Column(name = "PPD_FAC_RATE_TYPE")
    private String PPD_FAC_RATE_TYPE;

    @Column(name = "PPD_FAC_RATE")
    private BigDecimal PPD_FAC_RATE;

    @Column(name = "PPD_FRM_CODE")
    private String PPD_FRM_CODE;

    @Column(name = "PPD_FLEX_02")
    private String PPD_FLEX_02;

    @Column(name = "PPD_MAX_SA")
    private BigDecimal PPD_MAX_SA;

    @Column(name = "PPD_MIN_SA")
    private BigDecimal PPD_MIN_SA;

    @Column(name = "PPD_MAX_AGE")
    private Integer PPD_MAX_AGE;

    @Column(name = "PPD_MIN_AGE")
    private Integer PPD_MIN_AGE;

    @Column(name = "PPD_RI_RATE_PER")
    private Long PPD_RI_RATE_PER;

    @Column(name = "PPD_FAC_RATE_PER")
    private Long PPD_FAC_RATE_PER;

    @Column(name = "PPD_RATE")
    private BigDecimal PPD_RATE;

    @Column(name = "PPD_NET_RATE")
    private BigDecimal PPD_NET_RATE;

    @Column(name = "PPD_DEDT_AMT")
    private BigDecimal PPD_DEDT_AMT;

    @Column(name = "PPD_CUST_PREM")
    private BigDecimal PPD_CUST_PREM;

    @Column(name = "PPD_MAX_NO_INSTAL")
    private BigDecimal PPD_MAX_NO_INSTAL;

    @Column(name = "PPD_UNIT_RATE_YN")
    private String PPD_UNIT_RATE_YN;

    @Column(name = "PPD_UNIT_RATE")
    private BigDecimal PPD_UNIT_RATE;

	public Long getPPD_TRAN_ID() {
		return PPD_TRAN_ID;
	}

	public void setPPD_TRAN_ID(Long pPD_TRAN_ID) {
		PPD_TRAN_ID = pPD_TRAN_ID;
	}

	public Long getPPD_PPH_TRAN_ID() {
		return PPD_PPH_TRAN_ID;
	}

	public void setPPD_PPH_TRAN_ID(Long pPD_PPH_TRAN_ID) {
		PPD_PPH_TRAN_ID = pPD_PPH_TRAN_ID;
	}

	public Long getPPD_POL_TRAN_ID() {
		return PPD_POL_TRAN_ID;
	}

	public void setPPD_POL_TRAN_ID(Long pPD_POL_TRAN_ID) {
		PPD_POL_TRAN_ID = pPD_POL_TRAN_ID;
	}

	public String getPPD_PLAN_CODE() {
		return PPD_PLAN_CODE;
	}

	public void setPPD_PLAN_CODE(String pPD_PLAN_CODE) {
		PPD_PLAN_CODE = pPD_PLAN_CODE;
	}

	public String getPPD_PROD_CODE() {
		return PPD_PROD_CODE;
	}

	public void setPPD_PROD_CODE(String pPD_PROD_CODE) {
		PPD_PROD_CODE = pPD_PROD_CODE;
	}

	public String getPPD_COVER_CODE() {
		return PPD_COVER_CODE;
	}

	public void setPPD_COVER_CODE(String pPD_COVER_CODE) {
		PPD_COVER_CODE = pPD_COVER_CODE;
	}

	public String getPPD_SA_TYPE() {
		return PPD_SA_TYPE;
	}

	public void setPPD_SA_TYPE(String pPD_SA_TYPE) {
		PPD_SA_TYPE = pPD_SA_TYPE;
	}

	public BigDecimal getPPD_SA_PERC() {
		return PPD_SA_PERC;
	}

	public void setPPD_SA_PERC(BigDecimal pPD_SA_PERC) {
		PPD_SA_PERC = pPD_SA_PERC;
	}

	public BigDecimal getPPD_SA_MONTHS() {
		return PPD_SA_MONTHS;
	}

	public void setPPD_SA_MONTHS(BigDecimal pPD_SA_MONTHS) {
		PPD_SA_MONTHS = pPD_SA_MONTHS;
	}

	public BigDecimal getPPD_SA_LC_LIMIT() {
		return PPD_SA_LC_LIMIT;
	}

	public void setPPD_SA_LC_LIMIT(BigDecimal pPD_SA_LC_LIMIT) {
		PPD_SA_LC_LIMIT = pPD_SA_LC_LIMIT;
	}

	public Date getPPD_INS_DT() {
		return PPD_INS_DT;
	}

	public void setPPD_INS_DT(Date pPD_INS_DT) {
		PPD_INS_DT = pPD_INS_DT;
	}

	public String getPPD_INS_ID() {
		return PPD_INS_ID;
	}

	public void setPPD_INS_ID(String pPD_INS_ID) {
		PPD_INS_ID = pPD_INS_ID;
	}

	public Date getPPD_MOD_DT() {
		return PPD_MOD_DT;
	}

	public void setPPD_MOD_DT(Date pPD_MOD_DT) {
		PPD_MOD_DT = pPD_MOD_DT;
	}

	public String getPPD_MOD_ID() {
		return PPD_MOD_ID;
	}

	public void setPPD_MOD_ID(String pPD_MOD_ID) {
		PPD_MOD_ID = pPD_MOD_ID;
	}

	public String getPPD_DEPN_APPL_YN() {
		return PPD_DEPN_APPL_YN;
	}

	public void setPPD_DEPN_APPL_YN(String pPD_DEPN_APPL_YN) {
		PPD_DEPN_APPL_YN = pPD_DEPN_APPL_YN;
	}

	public BigDecimal getPPD_DEP_RATE() {
		return PPD_DEP_RATE;
	}

	public void setPPD_DEP_RATE(BigDecimal pPD_DEP_RATE) {
		PPD_DEP_RATE = pPD_DEP_RATE;
	}

	public BigDecimal getPPD_FC_FCL() {
		return PPD_FC_FCL;
	}

	public void setPPD_FC_FCL(BigDecimal pPD_FC_FCL) {
		PPD_FC_FCL = pPD_FC_FCL;
	}

	public BigDecimal getPPD_LC_FCL() {
		return PPD_LC_FCL;
	}

	public void setPPD_LC_FCL(BigDecimal pPD_LC_FCL) {
		PPD_LC_FCL = pPD_LC_FCL;
	}

	public Date getPPD_EFF_FM_DT() {
		return PPD_EFF_FM_DT;
	}

	public void setPPD_EFF_FM_DT(Date pPD_EFF_FM_DT) {
		PPD_EFF_FM_DT = pPD_EFF_FM_DT;
	}

	public BigDecimal getPPD_MAX_CLM_PERC() {
		return PPD_MAX_CLM_PERC;
	}

	public void setPPD_MAX_CLM_PERC(BigDecimal pPD_MAX_CLM_PERC) {
		PPD_MAX_CLM_PERC = pPD_MAX_CLM_PERC;
	}

	public String getPPD_PRORATE_REFN_YN() {
		return PPD_PRORATE_REFN_YN;
	}

	public void setPPD_PRORATE_REFN_YN(String pPD_PRORATE_REFN_YN) {
		PPD_PRORATE_REFN_YN = pPD_PRORATE_REFN_YN;
	}

	public String getPPD_PRORATE_COLL_YN() {
		return PPD_PRORATE_COLL_YN;
	}

	public void setPPD_PRORATE_COLL_YN(String pPD_PRORATE_COLL_YN) {
		PPD_PRORATE_COLL_YN = pPD_PRORATE_COLL_YN;
	}

	public Date getPPD_EFF_TO_DT() {
		return PPD_EFF_TO_DT;
	}

	public void setPPD_EFF_TO_DT(Date pPD_EFF_TO_DT) {
		PPD_EFF_TO_DT = pPD_EFF_TO_DT;
	}

	public String getPPD_MANDATORY_YN() {
		return PPD_MANDATORY_YN;
	}

	public void setPPD_MANDATORY_YN(String pPD_MANDATORY_YN) {
		PPD_MANDATORY_YN = pPD_MANDATORY_YN;
	}

	public String getPPD_RATE_TYPE() {
		return PPD_RATE_TYPE;
	}

	public void setPPD_RATE_TYPE(String pPD_RATE_TYPE) {
		PPD_RATE_TYPE = pPD_RATE_TYPE;
	}

	public Long getPPD_RATE_PER() {
		return PPD_RATE_PER;
	}

	public void setPPD_RATE_PER(Long pPD_RATE_PER) {
		PPD_RATE_PER = pPD_RATE_PER;
	}

	public String getPPD_DEL_FLAG() {
		return PPD_DEL_FLAG;
	}

	public void setPPD_DEL_FLAG(String pPD_DEL_FLAG) {
		PPD_DEL_FLAG = pPD_DEL_FLAG;
	}

	public String getPPD_REC_TYPE() {
		return PPD_REC_TYPE;
	}

	public void setPPD_REC_TYPE(String pPD_REC_TYPE) {
		PPD_REC_TYPE = pPD_REC_TYPE;
	}

	public String getPPD_FLEX_01() {
		return PPD_FLEX_01;
	}

	public void setPPD_FLEX_01(String pPD_FLEX_01) {
		PPD_FLEX_01 = pPD_FLEX_01;
	}

	public String getPPD_RI_RATE_TYPE() {
		return PPD_RI_RATE_TYPE;
	}

	public void setPPD_RI_RATE_TYPE(String pPD_RI_RATE_TYPE) {
		PPD_RI_RATE_TYPE = pPD_RI_RATE_TYPE;
	}

	public BigDecimal getPPD_RI_RATE() {
		return PPD_RI_RATE;
	}

	public void setPPD_RI_RATE(BigDecimal pPD_RI_RATE) {
		PPD_RI_RATE = pPD_RI_RATE;
	}

	public String getPPD_FAC_RATE_TYPE() {
		return PPD_FAC_RATE_TYPE;
	}

	public void setPPD_FAC_RATE_TYPE(String pPD_FAC_RATE_TYPE) {
		PPD_FAC_RATE_TYPE = pPD_FAC_RATE_TYPE;
	}

	public BigDecimal getPPD_FAC_RATE() {
		return PPD_FAC_RATE;
	}

	public void setPPD_FAC_RATE(BigDecimal pPD_FAC_RATE) {
		PPD_FAC_RATE = pPD_FAC_RATE;
	}

	public String getPPD_FRM_CODE() {
		return PPD_FRM_CODE;
	}

	public void setPPD_FRM_CODE(String pPD_FRM_CODE) {
		PPD_FRM_CODE = pPD_FRM_CODE;
	}

	public String getPPD_FLEX_02() {
		return PPD_FLEX_02;
	}

	public void setPPD_FLEX_02(String pPD_FLEX_02) {
		PPD_FLEX_02 = pPD_FLEX_02;
	}

	public BigDecimal getPPD_MAX_SA() {
		return PPD_MAX_SA;
	}

	public void setPPD_MAX_SA(BigDecimal pPD_MAX_SA) {
		PPD_MAX_SA = pPD_MAX_SA;
	}

	public BigDecimal getPPD_MIN_SA() {
		return PPD_MIN_SA;
	}

	public void setPPD_MIN_SA(BigDecimal pPD_MIN_SA) {
		PPD_MIN_SA = pPD_MIN_SA;
	}

	public Integer getPPD_MAX_AGE() {
		return PPD_MAX_AGE;
	}

	public void setPPD_MAX_AGE(Integer pPD_MAX_AGE) {
		PPD_MAX_AGE = pPD_MAX_AGE;
	}

	public Integer getPPD_MIN_AGE() {
		return PPD_MIN_AGE;
	}

	public void setPPD_MIN_AGE(Integer pPD_MIN_AGE) {
		PPD_MIN_AGE = pPD_MIN_AGE;
	}

	public Long getPPD_RI_RATE_PER() {
		return PPD_RI_RATE_PER;
	}

	public void setPPD_RI_RATE_PER(Long pPD_RI_RATE_PER) {
		PPD_RI_RATE_PER = pPD_RI_RATE_PER;
	}

	public Long getPPD_FAC_RATE_PER() {
		return PPD_FAC_RATE_PER;
	}

	public void setPPD_FAC_RATE_PER(Long pPD_FAC_RATE_PER) {
		PPD_FAC_RATE_PER = pPD_FAC_RATE_PER;
	}

	public BigDecimal getPPD_RATE() {
		return PPD_RATE;
	}

	public void setPPD_RATE(BigDecimal pPD_RATE) {
		PPD_RATE = pPD_RATE;
	}

	public BigDecimal getPPD_NET_RATE() {
		return PPD_NET_RATE;
	}

	public void setPPD_NET_RATE(BigDecimal pPD_NET_RATE) {
		PPD_NET_RATE = pPD_NET_RATE;
	}

	public BigDecimal getPPD_DEDT_AMT() {
		return PPD_DEDT_AMT;
	}

	public void setPPD_DEDT_AMT(BigDecimal pPD_DEDT_AMT) {
		PPD_DEDT_AMT = pPD_DEDT_AMT;
	}

	public BigDecimal getPPD_CUST_PREM() {
		return PPD_CUST_PREM;
	}

	public void setPPD_CUST_PREM(BigDecimal pPD_CUST_PREM) {
		PPD_CUST_PREM = pPD_CUST_PREM;
	}

	public BigDecimal getPPD_MAX_NO_INSTAL() {
		return PPD_MAX_NO_INSTAL;
	}

	public void setPPD_MAX_NO_INSTAL(BigDecimal pPD_MAX_NO_INSTAL) {
		PPD_MAX_NO_INSTAL = pPD_MAX_NO_INSTAL;
	}

	public String getPPD_UNIT_RATE_YN() {
		return PPD_UNIT_RATE_YN;
	}

	public void setPPD_UNIT_RATE_YN(String pPD_UNIT_RATE_YN) {
		PPD_UNIT_RATE_YN = pPD_UNIT_RATE_YN;
	}

	public BigDecimal getPPD_UNIT_RATE() {
		return PPD_UNIT_RATE;
	}

	public void setPPD_UNIT_RATE(BigDecimal pPD_UNIT_RATE) {
		PPD_UNIT_RATE = pPD_UNIT_RATE;
	}

}

