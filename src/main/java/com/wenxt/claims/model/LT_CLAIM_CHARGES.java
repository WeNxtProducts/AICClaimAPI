package com.example.aicbaseCrud.model;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_CLAIM_CHARGES")
public class LT_CLAIM_CHARGES {

	@Id
    @Column(name="cc_TRAN_id")
	private Long cc_TRAN_id;
	
	@Column(name="cc_CLAIM_TRAN_id")
	private Long cc_CLAIM_TRAN_id;
	
	@Column(name="cc_chrg_code")
	private String cc_chrg_code;
	
	@Column(name="cc_rate")
	private BigDecimal cc_rate;
	
	@Column(name="cc_rate_per")
	private BigDecimal cc_rate_per;
	
	@Column(name="cc_chrg_fc_value")
	private BigDecimal cc_chrg_fc_value;
	
	@Column(name="cc_chrg_lc_value")
	private BigDecimal cc_chrg_lc_value;
	
	@Column(name="cc_remarks")
	private String cc_remarks;
	
	@Column(name="cc_paid_to")
	private String cc_paid_to;
	
	@Column(name="cc_benf_code")
	private String cc_benf_code;

	public Long getCc_TRAN_id() {
		return cc_TRAN_id;
	}

	public void setCc_TRAN_id(Long cc_TRAN_id) {
		this.cc_TRAN_id = cc_TRAN_id;
	}

	public Long getCc_CLAIM_TRAN_id() {
		return cc_CLAIM_TRAN_id;
	}

	public void setCc_CLAIM_TRAN_id(Long cc_CLAIM_TRAN_id) {
		this.cc_CLAIM_TRAN_id = cc_CLAIM_TRAN_id;
	}

	public String getCc_chrg_code() {
		return cc_chrg_code;
	}

	public void setCc_chrg_code(String cc_chrg_code) {
		this.cc_chrg_code = cc_chrg_code;
	}

	public BigDecimal getCc_rate() {
		return cc_rate;
	}

	public void setCc_rate(BigDecimal cc_rate) {
		this.cc_rate = cc_rate;
	}

	public BigDecimal getCc_rate_per() {
		return cc_rate_per;
	}

	public void setCc_rate_per(BigDecimal cc_rate_per) {
		this.cc_rate_per = cc_rate_per;
	}

	public BigDecimal getCc_chrg_fc_value() {
		return cc_chrg_fc_value;
	}

	public void setCc_chrg_fc_value(BigDecimal cc_chrg_fc_value) {
		this.cc_chrg_fc_value = cc_chrg_fc_value;
	}

	public BigDecimal getCc_chrg_lc_value() {
		return cc_chrg_lc_value;
	}

	public void setCc_chrg_lc_value(BigDecimal cc_chrg_lc_value) {
		this.cc_chrg_lc_value = cc_chrg_lc_value;
	}

	public String getCc_remarks() {
		return cc_remarks;
	}

	public void setCc_remarks(String cc_remarks) {
		this.cc_remarks = cc_remarks;
	}

	public String getCc_paid_to() {
		return cc_paid_to;
	}

	public void setCc_paid_to(String cc_paid_to) {
		this.cc_paid_to = cc_paid_to;
	}

	public String getCc_benf_code() {
		return cc_benf_code;
	}

	public void setCc_benf_code(String cc_benf_code) {
		this.cc_benf_code = cc_benf_code;
	}

	
}
