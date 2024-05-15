package com.example.aicbaseCrud.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_CLAIM_COVER_DTLS")
public class LT_CLAIM_COVER_DTLS {

	@Id
	@Column(name = "ccd_TRAN_id")
	private long ccd_TRAN_id;

	@Column(name = "ccd_claim_TRAN_id")
	private long ccd_claim_TRAN_id;

	@Column(name = "ccd_cover_code")
	private String ccd_cover_code;

	@Column(name = "ccd_loss_type")
	private String ccd_loss_type;

	@Column(name = "ccd_disab_type")
	private String ccd_disab_type;

	@Column(name = "ccd_fc_est_amt")
	private BigDecimal ccd_fc_est_amt;

	@Column(name = "ccd_lc_est_amt")
	private BigDecimal ccd_lc_est_amt;

	@Column(name = "ccd_frz_flag")
	private String ccd_frz_flag;

	@Column(name = "ccd_ins_id")
	private String ccd_ins_id;

	@Column(name = "ccd_ins_dt")
	private Date ccd_ins_dt;

	@Column(name = "ccd_mod_uid")
	private String ccd_mod_uid;

	@Column(name = "ccd_mod_dt")
	private Date ccd_mod_dt;

	@Column(name = "ccd_close_flag")
	private String ccd_close_flag;

	@Column(name = "ccd_close_dt")
	private Date ccd_close_dt;

	@Column(name = "ccd_period_unit")
	private String ccd_period_unit;

	@Column(name = "ccd_period")
	private Integer ccd_period;

	@Column(name = "ccd_rate")
	private BigDecimal ccd_rate;

	@Column(name = "ccd_rate_per")
	private Long ccd_rate_per;

	@Column(name = "ccd_confirm_flag")
	private String ccd_confirm_flag;

	@Column(name = "ccd_reserve_gen_flag")
	private String ccd_reserve_gen_flag;

	@Column(name = "ccd_set_flag")
	private String ccd_set_flag;

	@Column(name = "ccd_fitr_yn")
	private String ccd_fitr_yn;

	@Column(name = "ccd_no_of_days")
	private Short ccd_no_of_days;

	@Column(name = "ccd_reserve_dt")
	private Date ccd_reserve_dt;

	@Column(name = "ccd_claim_pay_to")
	private String ccd_claim_pay_to;

	@Column(name = "ccd_email")
	private String ccd_email;

	public long getCcd_TRAN_id() {
		return ccd_TRAN_id;
	}

	public void setCcd_TRAN_id(long ccd_TRAN_id) {
		this.ccd_TRAN_id = ccd_TRAN_id;
	}

	public long getCcd_claim_TRAN_id() {
		return ccd_claim_TRAN_id;
	}

	public void setCcd_claim_TRAN_id(long ccd_claim_TRAN_id) {
		this.ccd_claim_TRAN_id = ccd_claim_TRAN_id;
	}

	public String getCcd_cover_code() {
		return ccd_cover_code;
	}

	public void setCcd_cover_code(String ccd_cover_code) {
		this.ccd_cover_code = ccd_cover_code;
	}

	public String getCcd_loss_type() {
		return ccd_loss_type;
	}

	public void setCcd_loss_type(String ccd_loss_type) {
		this.ccd_loss_type = ccd_loss_type;
	}

	public String getCcd_disab_type() {
		return ccd_disab_type;
	}

	public void setCcd_disab_type(String ccd_disab_type) {
		this.ccd_disab_type = ccd_disab_type;
	}

	public BigDecimal getCcd_fc_est_amt() {
		return ccd_fc_est_amt;
	}

	public void setCcd_fc_est_amt(BigDecimal ccd_fc_est_amt) {
		this.ccd_fc_est_amt = ccd_fc_est_amt;
	}

	public BigDecimal getCcd_lc_est_amt() {
		return ccd_lc_est_amt;
	}

	public void setCcd_lc_est_amt(BigDecimal ccd_lc_est_amt) {
		this.ccd_lc_est_amt = ccd_lc_est_amt;
	}

	public String getCcd_frz_flag() {
		return ccd_frz_flag;
	}

	public void setCcd_frz_flag(String ccd_frz_flag) {
		this.ccd_frz_flag = ccd_frz_flag;
	}

	public String getCcd_ins_id() {
		return ccd_ins_id;
	}

	public void setCcd_ins_id(String ccd_ins_id) {
		this.ccd_ins_id = ccd_ins_id;
	}

	public Date getCcd_ins_dt() {
		return ccd_ins_dt;
	}

	public void setCcd_ins_dt(Date ccd_ins_dt) {
		this.ccd_ins_dt = ccd_ins_dt;
	}

	public String getCcd_mod_uid() {
		return ccd_mod_uid;
	}

	public void setCcd_mod_uid(String ccd_mod_uid) {
		this.ccd_mod_uid = ccd_mod_uid;
	}

	public Date getCcd_mod_dt() {
		return ccd_mod_dt;
	}

	public void setCcd_mod_dt(Date ccd_mod_dt) {
		this.ccd_mod_dt = ccd_mod_dt;
	}

	public String getCcd_close_flag() {
		return ccd_close_flag;
	}

	public void setCcd_close_flag(String ccd_close_flag) {
		this.ccd_close_flag = ccd_close_flag;
	}

	public Date getCcd_close_dt() {
		return ccd_close_dt;
	}

	public void setCcd_close_dt(Date ccd_close_dt) {
		this.ccd_close_dt = ccd_close_dt;
	}

	public String getCcd_period_unit() {
		return ccd_period_unit;
	}

	public void setCcd_period_unit(String ccd_period_unit) {
		this.ccd_period_unit = ccd_period_unit;
	}

	public Integer getCcd_period() {
		return ccd_period;
	}

	public void setCcd_period(Integer ccd_period) {
		this.ccd_period = ccd_period;
	}

	public BigDecimal getCcd_rate() {
		return ccd_rate;
	}

	public void setCcd_rate(BigDecimal ccd_rate) {
		this.ccd_rate = ccd_rate;
	}

	public Long getCcd_rate_per() {
		return ccd_rate_per;
	}

	public void setCcd_rate_per(Long ccd_rate_per) {
		this.ccd_rate_per = ccd_rate_per;
	}

	public String getCcd_confirm_flag() {
		return ccd_confirm_flag;
	}

	public void setCcd_confirm_flag(String ccd_confirm_flag) {
		this.ccd_confirm_flag = ccd_confirm_flag;
	}

	public String getCcd_reserve_gen_flag() {
		return ccd_reserve_gen_flag;
	}

	public void setCcd_reserve_gen_flag(String ccd_reserve_gen_flag) {
		this.ccd_reserve_gen_flag = ccd_reserve_gen_flag;
	}

	public String getCcd_set_flag() {
		return ccd_set_flag;
	}

	public void setCcd_set_flag(String ccd_set_flag) {
		this.ccd_set_flag = ccd_set_flag;
	}

	public String getCcd_fitr_yn() {
		return ccd_fitr_yn;
	}

	public void setCcd_fitr_yn(String ccd_fitr_yn) {
		this.ccd_fitr_yn = ccd_fitr_yn;
	}

	public Short getCcd_no_of_days() {
		return ccd_no_of_days;
	}

	public void setCcd_no_of_days(Short ccd_no_of_days) {
		this.ccd_no_of_days = ccd_no_of_days;
	}

	public Date getCcd_reserve_dt() {
		return ccd_reserve_dt;
	}

	public void setCcd_reserve_dt(Date ccd_reserve_dt) {
		this.ccd_reserve_dt = ccd_reserve_dt;
	}

	public String getCcd_claim_pay_to() {
		return ccd_claim_pay_to;
	}

	public void setCcd_claim_pay_to(String ccd_claim_pay_to) {
		this.ccd_claim_pay_to = ccd_claim_pay_to;
	}

	public String getCcd_email() {
		return ccd_email;
	}

	public void setCcd_email(String ccd_email) {
		this.ccd_email = ccd_email;
	}

}
