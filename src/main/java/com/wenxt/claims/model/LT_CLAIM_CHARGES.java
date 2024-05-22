package com.wenxt.claims.model;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_CLAIM_CHARGES")
public class LT_CLAIM_CHARGES {

	@Id
    @SequenceGenerator(name = "ClaimChargesTranIdSeq", sequenceName = "CC_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ClaimChargesTranIdSeq")
    @Column(name="CC_TRAN_ID")
	private Integer CC_TRAN_ID;
	
	@Column(name="CC_CLAIM_TRAN_ID")
	private Integer CC_CLAIM_TRAN_ID;
	
	@Column(name="CC_CHRG_CODE")
	private String CC_CHRG_CODE;
	
	@Column(name="CC_RATE")
	private Integer CC_RATE;
	
	@Column(name="CC_RATE_PER")
	private Integer CC_RATE_PER;
	
	@Column(name="CC_CHRG_FC_VALUE")
	private BigDecimal CC_CHRG_FC_VALUE;
	
	@Column(name="CC_CHRG_LC_VALUE")
	private BigDecimal CC_CHRG_LC_VALUE;
	
	@Column(name="CC_REMARKS")
	private String CC_REMARKS;
	
	@Column(name="CC_PAID_TO")
	private String CC_PAID_TO;
	
	@Column(name="CC_BENF_CODE")
	private String CC_BENF_CODE;

	public Integer getCC_TRAN_ID() {
		return CC_TRAN_ID;
	}

	public Integer getCC_CLAIM_TRAN_ID() {
		return CC_CLAIM_TRAN_ID;
	}

	public void setCC_CLAIM_TRAN_ID(Integer cC_CLAIM_TRAN_ID) {
		CC_CLAIM_TRAN_ID = cC_CLAIM_TRAN_ID;
	}

	public String getCC_CHRG_CODE() {
		return CC_CHRG_CODE;
	}

	public void setCC_CHRG_CODE(String cC_CHRG_CODE) {
		CC_CHRG_CODE = cC_CHRG_CODE;
	}

	public Integer getCC_RATE() {
		return CC_RATE;
	}

	public void setCC_RATE(Integer cC_RATE) {
		CC_RATE = cC_RATE;
	}

	public Integer getCC_RATE_PER() {
		return CC_RATE_PER;
	}

	public void setCC_RATE_PER(Integer cC_RATE_PER) {
		CC_RATE_PER = cC_RATE_PER;
	}

	public BigDecimal getCC_CHRG_FC_VALUE() {
		return CC_CHRG_FC_VALUE;
	}

	public void setCC_CHRG_FC_VALUE(BigDecimal cC_CHRG_FC_VALUE) {
		CC_CHRG_FC_VALUE = cC_CHRG_FC_VALUE;
	}

	public BigDecimal getCC_CHRG_LC_VALUE() {
		return CC_CHRG_LC_VALUE;
	}

	public void setCC_CHRG_LC_VALUE(BigDecimal cC_CHRG_LC_VALUE) {
		CC_CHRG_LC_VALUE = cC_CHRG_LC_VALUE;
	}

	public String getCC_REMARKS() {
		return CC_REMARKS;
	}

	public void setCC_REMARKS(String cC_REMARKS) {
		CC_REMARKS = cC_REMARKS;
	}

	public String getCC_PAID_TO() {
		return CC_PAID_TO;
	}

	public void setCC_PAID_TO(String cC_PAID_TO) {
		CC_PAID_TO = cC_PAID_TO;
	}

	public String getCC_BENF_CODE() {
		return CC_BENF_CODE;
	}

	public void setCC_BENF_CODE(String cC_BENF_CODE) {
		CC_BENF_CODE = cC_BENF_CODE;
	}

	public void setCC_TRAN_ID(Integer cC_TRAN_ID) {
		CC_TRAN_ID = cC_TRAN_ID;
	}

}
