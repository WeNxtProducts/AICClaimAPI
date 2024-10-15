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
@Table(name = "LT_RI_PREM_ALLOC_HEAD")
public class LT_RI_PREM_ALLOC_HEAD {

    @Id
    @SequenceGenerator(name = "premiumAllocTranIdSeq", sequenceName = "RPAH_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "premiumAllocTranIdSeq")
    @Column(name = "RPAH_TRAN_ID")
    private Integer RPAH_TRAN_ID;

    @Column(name = "RPAH_POL_TRAN_ID")
    private Integer RPAH_POL_TRAN_ID;

    @Column(name = "RPAH_END_NO_IDX")
    private Integer RPAH_END_NO_IDX;

    @Column(name = "RPAH_POL_NO")
    private String RPAH_POL_NO;

    @Column(name = "RPAH_END_NO")
    private String RPAH_END_NO;

    @Column(name = "RPAH_CLASS_CODE")
    private String RPAH_CLASS_CODE;

    @Column(name = "RPAH_TREATY_CODE")
    private String RPAH_TREATY_CODE;

    @Column(name = "RPAH_TREATY_CURR_CODE")
    private String RPAH_TREATY_CURR_CODE;

    @Column(name = "RPAH_FC_EXTRA_PREM")
    private BigDecimal RPAH_FC_EXTRA_PREM;

    @Column(name = "RPAH_UW_YEAR")
    private Integer RPAH_UW_YEAR;

    @Column(name = "RPAH_DT")
    private Date RPAH_DT;

    @Column(name = "RPAH_FC_SA")
    private BigDecimal RPAH_FC_SA;

    @Column(name = "RPAH_FC_POL_FCL")
    private BigDecimal RPAH_FC_POL_FCL;

    @Column(name = "RPAH_FC_TREATY_FCL")
    private BigDecimal RPAH_FC_TREATY_FCL;

    @Column(name = "RPAH_RETN_PERC")
    private BigDecimal RPAH_RETN_PERC;

    @Column(name = "RPAH_POL_TL_RATE")
    private BigDecimal RPAH_POL_TL_RATE;

    @Column(name = "RPAH_POL_ANC_RATE")
    private BigDecimal RPAH_POL_ANC_RATE;

    @Column(name = "RPAH_PRO_SHR_LOAD_PERC")
    private BigDecimal RPAH_PRO_SHR_LOAD_PERC;

    @Column(name = "RPAH_EXC_MAR_LOAD_PERC")
    private BigDecimal RPAH_EXC_MAR_LOAD_PERC;

    @Column(name = "RPAH_DISCOUNT")
    private BigDecimal RPAH_DISCOUNT;

    @Column(name = "RPAH_FC_NET_PREM")
    private BigDecimal RPAH_FC_NET_PREM;

    @Column(name = "RPAH_RI_CLOSE_FLAG")
    private String RPAH_RI_CLOSE_FLAG;

    @Column(name = "RPAH_INS_DT")
    private Date RPAH_INS_DT;

    @Column(name = "RPAH_INS_ID")
    private String RPAH_INS_ID;

    @Column(name = "RPAH_MOD_DT")
    private Date RPAH_MOD_DT;

    @Column(name = "RPAH_MOD_ID")
    private String RPAH_MOD_ID;

    @Column(name = "RPAH_REP_YN")
    private String RPAH_REP_YN;

    @Column(name = "RPAH_FLEX_01")
    private String RPAH_FLEX_01;

    @Column(name = "RPAH_FLEX_02")
    private String RPAH_FLEX_02;

    @Column(name = "RPAH_FLEX_03")
    private String RPAH_FLEX_03;

	public Integer getRPAH_TRAN_ID() {
		return RPAH_TRAN_ID;
	}

	public void setRPAH_TRAN_ID(Integer rPAH_TRAN_ID) {
		RPAH_TRAN_ID = rPAH_TRAN_ID;
	}

	public Integer getRPAH_POL_TRAN_ID() {
		return RPAH_POL_TRAN_ID;
	}

	public void setRPAH_POL_TRAN_ID(Integer rPAH_POL_TRAN_ID) {
		RPAH_POL_TRAN_ID = rPAH_POL_TRAN_ID;
	}

	public Integer getRPAH_END_NO_IDX() {
		return RPAH_END_NO_IDX;
	}

	public void setRPAH_END_NO_IDX(Integer rPAH_END_NO_IDX) {
		RPAH_END_NO_IDX = rPAH_END_NO_IDX;
	}

	public String getRPAH_POL_NO() {
		return RPAH_POL_NO;
	}

	public void setRPAH_POL_NO(String rPAH_POL_NO) {
		RPAH_POL_NO = rPAH_POL_NO;
	}

	public String getRPAH_END_NO() {
		return RPAH_END_NO;
	}

	public void setRPAH_END_NO(String rPAH_END_NO) {
		RPAH_END_NO = rPAH_END_NO;
	}

	public String getRPAH_CLASS_CODE() {
		return RPAH_CLASS_CODE;
	}

	public void setRPAH_CLASS_CODE(String rPAH_CLASS_CODE) {
		RPAH_CLASS_CODE = rPAH_CLASS_CODE;
	}

	public String getRPAH_TREATY_CODE() {
		return RPAH_TREATY_CODE;
	}

	public void setRPAH_TREATY_CODE(String rPAH_TREATY_CODE) {
		RPAH_TREATY_CODE = rPAH_TREATY_CODE;
	}

	public String getRPAH_TREATY_CURR_CODE() {
		return RPAH_TREATY_CURR_CODE;
	}

	public void setRPAH_TREATY_CURR_CODE(String rPAH_TREATY_CURR_CODE) {
		RPAH_TREATY_CURR_CODE = rPAH_TREATY_CURR_CODE;
	}

	public BigDecimal getRPAH_FC_EXTRA_PREM() {
		return RPAH_FC_EXTRA_PREM;
	}

	public void setRPAH_FC_EXTRA_PREM(BigDecimal rPAH_FC_EXTRA_PREM) {
		RPAH_FC_EXTRA_PREM = rPAH_FC_EXTRA_PREM;
	}

	public Integer getRPAH_UW_YEAR() {
		return RPAH_UW_YEAR;
	}

	public void setRPAH_UW_YEAR(Integer rPAH_UW_YEAR) {
		RPAH_UW_YEAR = rPAH_UW_YEAR;
	}

	public Date getRPAH_DT() {
		return RPAH_DT;
	}

	public void setRPAH_DT(Date rPAH_DT) {
		RPAH_DT = rPAH_DT;
	}

	public BigDecimal getRPAH_FC_SA() {
		return RPAH_FC_SA;
	}

	public void setRPAH_FC_SA(BigDecimal rPAH_FC_SA) {
		RPAH_FC_SA = rPAH_FC_SA;
	}

	public BigDecimal getRPAH_FC_POL_FCL() {
		return RPAH_FC_POL_FCL;
	}

	public void setRPAH_FC_POL_FCL(BigDecimal rPAH_FC_POL_FCL) {
		RPAH_FC_POL_FCL = rPAH_FC_POL_FCL;
	}

	public BigDecimal getRPAH_FC_TREATY_FCL() {
		return RPAH_FC_TREATY_FCL;
	}

	public void setRPAH_FC_TREATY_FCL(BigDecimal rPAH_FC_TREATY_FCL) {
		RPAH_FC_TREATY_FCL = rPAH_FC_TREATY_FCL;
	}

	public BigDecimal getRPAH_RETN_PERC() {
		return RPAH_RETN_PERC;
	}

	public void setRPAH_RETN_PERC(BigDecimal rPAH_RETN_PERC) {
		RPAH_RETN_PERC = rPAH_RETN_PERC;
	}

	public BigDecimal getRPAH_POL_TL_RATE() {
		return RPAH_POL_TL_RATE;
	}

	public void setRPAH_POL_TL_RATE(BigDecimal rPAH_POL_TL_RATE) {
		RPAH_POL_TL_RATE = rPAH_POL_TL_RATE;
	}

	public BigDecimal getRPAH_POL_ANC_RATE() {
		return RPAH_POL_ANC_RATE;
	}

	public void setRPAH_POL_ANC_RATE(BigDecimal rPAH_POL_ANC_RATE) {
		RPAH_POL_ANC_RATE = rPAH_POL_ANC_RATE;
	}

	public BigDecimal getRPAH_PRO_SHR_LOAD_PERC() {
		return RPAH_PRO_SHR_LOAD_PERC;
	}

	public void setRPAH_PRO_SHR_LOAD_PERC(BigDecimal rPAH_PRO_SHR_LOAD_PERC) {
		RPAH_PRO_SHR_LOAD_PERC = rPAH_PRO_SHR_LOAD_PERC;
	}

	public BigDecimal getRPAH_EXC_MAR_LOAD_PERC() {
		return RPAH_EXC_MAR_LOAD_PERC;
	}

	public void setRPAH_EXC_MAR_LOAD_PERC(BigDecimal rPAH_EXC_MAR_LOAD_PERC) {
		RPAH_EXC_MAR_LOAD_PERC = rPAH_EXC_MAR_LOAD_PERC;
	}

	public BigDecimal getRPAH_DISCOUNT() {
		return RPAH_DISCOUNT;
	}

	public void setRPAH_DISCOUNT(BigDecimal rPAH_DISCOUNT) {
		RPAH_DISCOUNT = rPAH_DISCOUNT;
	}

	public BigDecimal getRPAH_FC_NET_PREM() {
		return RPAH_FC_NET_PREM;
	}

	public void setRPAH_FC_NET_PREM(BigDecimal rPAH_FC_NET_PREM) {
		RPAH_FC_NET_PREM = rPAH_FC_NET_PREM;
	}

	public String getRPAH_RI_CLOSE_FLAG() {
		return RPAH_RI_CLOSE_FLAG;
	}

	public void setRPAH_RI_CLOSE_FLAG(String rPAH_RI_CLOSE_FLAG) {
		RPAH_RI_CLOSE_FLAG = rPAH_RI_CLOSE_FLAG;
	}

	public Date getRPAH_INS_DT() {
		return RPAH_INS_DT;
	}

	public void setRPAH_INS_DT(Date rPAH_INS_DT) {
		RPAH_INS_DT = rPAH_INS_DT;
	}

	public String getRPAH_INS_ID() {
		return RPAH_INS_ID;
	}

	public void setRPAH_INS_ID(String rPAH_INS_ID) {
		RPAH_INS_ID = rPAH_INS_ID;
	}

	public Date getRPAH_MOD_DT() {
		return RPAH_MOD_DT;
	}

	public void setRPAH_MOD_DT(Date rPAH_MOD_DT) {
		RPAH_MOD_DT = rPAH_MOD_DT;
	}

	public String getRPAH_MOD_ID() {
		return RPAH_MOD_ID;
	}

	public void setRPAH_MOD_ID(String rPAH_MOD_ID) {
		RPAH_MOD_ID = rPAH_MOD_ID;
	}

	public String getRPAH_REP_YN() {
		return RPAH_REP_YN;
	}

	public void setRPAH_REP_YN(String rPAH_REP_YN) {
		RPAH_REP_YN = rPAH_REP_YN;
	}

	public String getRPAH_FLEX_01() {
		return RPAH_FLEX_01;
	}

	public void setRPAH_FLEX_01(String rPAH_FLEX_01) {
		RPAH_FLEX_01 = rPAH_FLEX_01;
	}

	public String getRPAH_FLEX_02() {
		return RPAH_FLEX_02;
	}

	public void setRPAH_FLEX_02(String rPAH_FLEX_02) {
		RPAH_FLEX_02 = rPAH_FLEX_02;
	}

	public String getRPAH_FLEX_03() {
		return RPAH_FLEX_03;
	}

	public void setRPAH_FLEX_03(String rPAH_FLEX_03) {
		RPAH_FLEX_03 = rPAH_FLEX_03;
	}

}
