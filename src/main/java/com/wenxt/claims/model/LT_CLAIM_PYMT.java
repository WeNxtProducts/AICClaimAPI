package com.wenxt.claims.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "LT_CLAIM_PYMT")
public class LT_CLAIM_PYMT {

	@Id
	@JsonProperty
	private Long cp_TRAN_id;
	@JsonProperty
	private Long cp_ce_TRAN_id;
	@JsonProperty
	private Long cp_claim_TRAN_id;
	@JsonProperty
	private Long cp_ref_TRAN_id;
	private Integer cp_srl_no;
	private Date cp_schd_pymt_dt;
	private Date cp_paid_dt;
	private BigDecimal cp_lc_paid_amt;
	private BigDecimal cp_fc_paid_amt;
	private String cp_appr_flag;
	private Date cp_appr_dt;
	private String cp_appr_uid;
	private String cp_INS_id;
	private Date cp_INS_dt;
	private String cp_MOD_uid;
	private Date cp_MOD_dt;
	private String cp_clm_paid_status;
	private String cp_claim_rej_reason;
	private String cp_accnt_pay_code;
	private Long cp_ccd_sys_id;
	private String cp_set_flag;
	private String cp_claim_paid_to;
	private Date cp_due_date;
//	private String cp_flex01;
//	private String cp_flex02;
//	private String cp_flex03;
//	private String cp_flex04;
//	private String cp_flex05;
	private String cp_paynet_file_gnrtd_yn;
	private String cp_pymt_mtd;
	private String cp_payee_name;
	public Long getCp_TRAN_id() {
		return cp_TRAN_id;
	}
	public void setCp_TRAN_id(Long cp_TRAN_id) {
		this.cp_TRAN_id = cp_TRAN_id;
	}
	public Long getCp_ce_TRAN_id() {
		return cp_ce_TRAN_id;
	}
	public void setCp_ce_TRAN_id(Long cp_ce_TRAN_id) {
		this.cp_ce_TRAN_id = cp_ce_TRAN_id;
	}
	public Long getCp_claim_TRAN_id() {
		return cp_claim_TRAN_id;
	}
	public void setCp_claim_TRAN_id(Long cp_claim_TRAN_id) {
		this.cp_claim_TRAN_id = cp_claim_TRAN_id;
	}
	public Long getCp_ref_TRAN_id() {
		return cp_ref_TRAN_id;
	}
	public void setCp_ref_TRAN_id(Long cp_ref_TRAN_id) {
		this.cp_ref_TRAN_id = cp_ref_TRAN_id;
	}
	public Integer getCp_srl_no() {
		return cp_srl_no;
	}
	public void setCp_srl_no(Integer cp_srl_no) {
		this.cp_srl_no = cp_srl_no;
	}
	public Date getCp_schd_pymt_dt() {
		return cp_schd_pymt_dt;
	}
	public void setCp_schd_pymt_dt(Date cp_schd_pymt_dt) {
		this.cp_schd_pymt_dt = cp_schd_pymt_dt;
	}
	public Date getCp_paid_dt() {
		return cp_paid_dt;
	}
	public void setCp_paid_dt(Date cp_paid_dt) {
		this.cp_paid_dt = cp_paid_dt;
	}
	public BigDecimal getCp_lc_paid_amt() {
		return cp_lc_paid_amt;
	}
	public void setCp_lc_paid_amt(BigDecimal cp_lc_paid_amt) {
		this.cp_lc_paid_amt = cp_lc_paid_amt;
	}
	public BigDecimal getCp_fc_paid_amt() {
		return cp_fc_paid_amt;
	}
	public void setCp_fc_paid_amt(BigDecimal cp_fc_paid_amt) {
		this.cp_fc_paid_amt = cp_fc_paid_amt;
	}
	public String getCp_appr_flag() {
		return cp_appr_flag;
	}
	public void setCp_appr_flag(String cp_appr_flag) {
		this.cp_appr_flag = cp_appr_flag;
	}
	public Date getCp_appr_dt() {
		return cp_appr_dt;
	}
	public void setCp_appr_dt(Date cp_appr_dt) {
		this.cp_appr_dt = cp_appr_dt;
	}
	public String getCp_appr_uid() {
		return cp_appr_uid;
	}
	public void setCp_appr_uid(String cp_appr_uid) {
		this.cp_appr_uid = cp_appr_uid;
	}
	public String getCp_INS_id() {
		return cp_INS_id;
	}
	public void setCp_INS_id(String cp_INS_id) {
		this.cp_INS_id = cp_INS_id;
	}
	public Date getCp_INS_dt() {
		return cp_INS_dt;
	}
	public void setCp_INS_dt(Date cp_INS_dt) {
		this.cp_INS_dt = cp_INS_dt;
	}
	public String getCp_MOD_uid() {
		return cp_MOD_uid;
	}
	public void setCp_MOD_uid(String cp_MOD_uid) {
		this.cp_MOD_uid = cp_MOD_uid;
	}
	public Date getCp_MOD_dt() {
		return cp_MOD_dt;
	}
	public void setCp_MOD_dt(Date cp_MOD_dt) {
		this.cp_MOD_dt = cp_MOD_dt;
	}
	public String getCp_clm_paid_status() {
		return cp_clm_paid_status;
	}
	public void setCp_clm_paid_status(String cp_clm_paid_status) {
		this.cp_clm_paid_status = cp_clm_paid_status;
	}
	public String getCp_claim_rej_reason() {
		return cp_claim_rej_reason;
	}
	public void setCp_claim_rej_reason(String cp_claim_rej_reason) {
		this.cp_claim_rej_reason = cp_claim_rej_reason;
	}
	public String getCp_accnt_pay_code() {
		return cp_accnt_pay_code;
	}
	public void setCp_accnt_pay_code(String cp_accnt_pay_code) {
		this.cp_accnt_pay_code = cp_accnt_pay_code;
	}
	public Long getCp_ccd_sys_id() {
		return cp_ccd_sys_id;
	}
	public void setCp_ccd_sys_id(Long cp_ccd_sys_id) {
		this.cp_ccd_sys_id = cp_ccd_sys_id;
	}
	public String getCp_set_flag() {
		return cp_set_flag;
	}
	public void setCp_set_flag(String cp_set_flag) {
		this.cp_set_flag = cp_set_flag;
	}
	public String getCp_claim_paid_to() {
		return cp_claim_paid_to;
	}
	public void setCp_claim_paid_to(String cp_claim_paid_to) {
		this.cp_claim_paid_to = cp_claim_paid_to;
	}
	public Date getCp_due_date() {
		return cp_due_date;
	}
	public void setCp_due_date(Date cp_due_date) {
		this.cp_due_date = cp_due_date;
	}
//	public String getCp_flex01() {
//		return cp_flex01;
//	}
//	public void setCp_flex01(String cp_flex01) {
//		this.cp_flex01 = cp_flex01;
//	}
//	public String getCp_flex02() {
//		return cp_flex02;
//	}
//	public void setCp_flex02(String cp_flex02) {
//		this.cp_flex02 = cp_flex02;
//	}
//	public String getCp_flex03() {
//		return cp_flex03;
//	}
//	public void setCp_flex03(String cp_flex03) {
//		this.cp_flex03 = cp_flex03;
//	}
//	public String getCp_flex04() {
//		return cp_flex04;
//	}
//	public void setCp_flex04(String cp_flex04) {
//		this.cp_flex04 = cp_flex04;
//	}
//	public String getCp_flex05() {
//		return cp_flex05;
//	}
//	public void setCp_flex05(String cp_flex05) {
//		this.cp_flex05 = cp_flex05;
//	}
	public String getCp_paynet_file_gnrtd_yn() {
		return cp_paynet_file_gnrtd_yn;
	}
	public void setCp_paynet_file_gnrtd_yn(String cp_paynet_file_gnrtd_yn) {
		this.cp_paynet_file_gnrtd_yn = cp_paynet_file_gnrtd_yn;
	}
	public String getCp_pymt_mtd() {
		return cp_pymt_mtd;
	}
	public void setCp_pymt_mtd(String cp_pymt_mtd) {
		this.cp_pymt_mtd = cp_pymt_mtd;
	}
	public String getCp_payee_name() {
		return cp_payee_name;
	}
	public void setCp_payee_name(String cp_payee_name) {
		this.cp_payee_name = cp_payee_name;
	}
	
	
	

	

}
