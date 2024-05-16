package com.wenxt.claims.model;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LT_CLAIM")
public class LT_CLAIM {
	
	@Id
    @Column(name="claim_TRAN_id")
    private long claim_TRAN_id;
    
    @Column(name="claim_pol_TRAN_id")
    private long claim_pol_TRAN_id;
    
    @Column(name="claim_pol_no")
    private String claim_pol_no;
    
    @Column(name="claim_ds_code")
    private String claim_ds_code;
    
    @Column(name="claim_poad_serial_no")
    private short claim_poad_serial_no;
    
    @Column(name="claim_assr_code")
    private String claim_assr_code;
    
    @Column(name="claim_curr_code")
    private String claim_curr_code;
    
    @Column(name="claim_exch_rate")
    private BigDecimal claim_exch_rate;
    
    @Column(name="claim_loss_dt")
    private Date claim_loss_dt;
    
    @Column(name="claim_intm_dt")
    private Date claim_intm_dt;
    
    @Column(name="claim_no")
    private String claim_no;
    
    @Column(name="claim_type")
    private String claim_type;
    
    @Column(name="claim_remarks")
    private String claim_remarks;
    
    @Column(name="claim_ref_no")
    private String claim_ref_no;
    
    @Column(name="claim_pay_to")
    private String claim_pay_to;
    
    @Column(name="claim_close_flag")
    private String claim_close_flag;
    
    @Column(name="claim_status")
    private String claim_status;
    
    @Column(name="claim_frz_flag")
    private String claim_frz_flag;
    
    @Column(name="claim_INS_id")
    private String claim_INS_id;
    
    @Column(name="claim_INS_dt")
    private Date claim_INS_dt;
    
    @Column(name="claim_MOD_id")
    private String claim_MOD_id;
    
    @Column(name="claim_MOD_dt")
    private Date claim_MOD_dt;
    
    @Column(name="claim_cust_code")
    private String claim_cust_code;
    
    @Column(name="claim_accnt_pay_code")
    private String claim_accnt_pay_code;
    
    @Column(name="claim_addl_status")
    private String claim_addl_status;
    
    @Column(name="claim_rev_res_flag")
    private String claim_rev_res_flag;
    
    @Column(name="claim_resv_amt")
    private BigDecimal claim_resv_amt;
    
    @Column(name="claim_util_amt")
    private BigDecimal claim_util_amt;
    
    @Column(name="claim_apprv_dt")
    private Date claim_apprv_dt;
    
    @Column(name="claim_apprv_status")
    private String claim_apprv_status;
    
    @Column(name="claim_unit_sell_yn")
    private String claim_unit_sell_yn;
    
    @Column(name="claim_reopen_dt")
    private Date claim_reopen_dt;
    
    @Column(name="claim_reopen_reason")
    private String claim_reopen_reason;
    
    @Column(name="claim_pol_valid_yn")
    private String claim_pol_valid_yn;
    
    @Column(name="claim_med_code")
    private String claim_med_code;
    
    @Column(name="claim_lc_rla_amount")
    private BigDecimal claim_lc_rla_amount;
    
    @Column(name="claim_pci_ref_no")
    private String claim_pci_ref_no;
    
    @Column(name="claim_lc_wak_amt")
    private BigDecimal claim_lc_wak_amt;
    
    @Column(name="claim_lc_serv_fee")
    private BigDecimal claim_lc_serv_fee;
    
    @Column(name="claim_lc_risk_prem")
    private BigDecimal claim_lc_risk_prem;
    
    @Column(name="claim_dis_cert_dt")
    private Date claim_dis_cert_dt;
    
    @Column(name="claim_med_exp_dt")
    private Date claim_med_exp_dt;
    
    @Column(name="claim_sickness_dt")
    private Date claim_sickness_dt;
    
    @Column(name="claim_excl_typ")
    private String claim_excl_typ;
    
    @Column(name="claim_excl_reason")
    private String claim_excl_reason;
    
    @Column(name="claim_memb_code")
    private String claim_memb_code;
    
    @Column(name="claim_diseases_code")
    private String claim_diseases_code;
    
    @Column(name="claim_diseases_remarks")
    private String claim_diseases_remarks;
    
    @Column(name="claim_assrd_ref_id1")
    private String claim_assrd_ref_id1;
    
    @Column(name="claim_fee_hospitals")
    private BigDecimal claim_fee_hospitals;
    
    @Column(name="claim_icd_diseases_dtl")
    private String claim_icd_diseases_dtl;
    
    @Column(name="claim_hosp_addm_dt")
    private Date claim_hosp_addm_dt;
    
    @Column(name="claim_hosp_dschg_dt")
    private Date claim_hosp_dschg_dt;
    
    @Column(name="clm_excl_yn")
    private String clm_excl_yn;
    
    @Column(name="claim_claimant_code")
    private String claim_claimant_code;
    
    @Column(name="claim_int_email")
    private String claim_int_email;
    
    @Column(name="claim_int_mobile")
    private String claim_int_mobile;
    
    @Column(name="claim_pay_method")
    private String claim_pay_method;
    
    @Column(name="claim_pay_rate")
    private BigDecimal claim_pay_rate;

	public long getClaim_TRAN_id() {
		return claim_TRAN_id;
	}

	public void setClaim_TRAN_id(long claim_TRAN_id) {
		this.claim_TRAN_id = claim_TRAN_id;
	}

	public long getClaim_pol_TRAN_id() {
		return claim_pol_TRAN_id;
	}

	public void setClaim_pol_TRAN_id(long claim_pol_TRAN_id) {
		this.claim_pol_TRAN_id = claim_pol_TRAN_id;
	}

	public String getClaim_pol_no() {
		return claim_pol_no;
	}

	public void setClaim_pol_no(String claim_pol_no) {
		this.claim_pol_no = claim_pol_no;
	}

	public String getClaim_ds_code() {
		return claim_ds_code;
	}

	public void setClaim_ds_code(String claim_ds_code) {
		this.claim_ds_code = claim_ds_code;
	}

	public short getClaim_poad_serial_no() {
		return claim_poad_serial_no;
	}

	public void setClaim_poad_serial_no(short claim_poad_serial_no) {
		this.claim_poad_serial_no = claim_poad_serial_no;
	}

	public String getClaim_assr_code() {
		return claim_assr_code;
	}

	public void setClaim_assr_code(String claim_assr_code) {
		this.claim_assr_code = claim_assr_code;
	}

	public String getClaim_curr_code() {
		return claim_curr_code;
	}

	public void setClaim_curr_code(String claim_curr_code) {
		this.claim_curr_code = claim_curr_code;
	}

	public BigDecimal getClaim_exch_rate() {
		return claim_exch_rate;
	}

	public void setClaim_exch_rate(BigDecimal claim_exch_rate) {
		this.claim_exch_rate = claim_exch_rate;
	}

	public Date getClaim_loss_dt() {
		return claim_loss_dt;
	}

	public void setClaim_loss_dt(Date claim_loss_dt) {
		this.claim_loss_dt = claim_loss_dt;
	}

	public Date getClaim_intm_dt() {
		return claim_intm_dt;
	}

	public void setClaim_intm_dt(Date claim_intm_dt) {
		this.claim_intm_dt = claim_intm_dt;
	}

	public String getClaim_no() {
		return claim_no;
	}

	public void setClaim_no(String claim_no) {
		this.claim_no = claim_no;
	}

	public String getClaim_type() {
		return claim_type;
	}

	public void setClaim_type(String claim_type) {
		this.claim_type = claim_type;
	}

	public String getClaim_remarks() {
		return claim_remarks;
	}

	public void setClaim_remarks(String claim_remarks) {
		this.claim_remarks = claim_remarks;
	}

	public String getClaim_ref_no() {
		return claim_ref_no;
	}

	public void setClaim_ref_no(String claim_ref_no) {
		this.claim_ref_no = claim_ref_no;
	}

	public String getClaim_pay_to() {
		return claim_pay_to;
	}

	public void setClaim_pay_to(String claim_pay_to) {
		this.claim_pay_to = claim_pay_to;
	}

	public String getClaim_close_flag() {
		return claim_close_flag;
	}

	public void setClaim_close_flag(String claim_close_flag) {
		this.claim_close_flag = claim_close_flag;
	}

	public String getClaim_status() {
		return claim_status;
	}

	public void setClaim_status(String claim_status) {
		this.claim_status = claim_status;
	}

	public String getClaim_frz_flag() {
		return claim_frz_flag;
	}

	public void setClaim_frz_flag(String claim_frz_flag) {
		this.claim_frz_flag = claim_frz_flag;
	}

	public String getClaim_INS_id() {
		return claim_INS_id;
	}

	public void setClaim_INS_id(String claim_INS_id) {
		this.claim_INS_id = claim_INS_id;
	}

	public Date getClaim_INS_dt() {
		return claim_INS_dt;
	}

	public void setClaim_INS_dt(Date claim_INS_dt) {
		this.claim_INS_dt = claim_INS_dt;
	}

	public String getClaim_MOD_id() {
		return claim_MOD_id;
	}

	public void setClaim_MOD_id(String claim_MOD_id) {
		this.claim_MOD_id = claim_MOD_id;
	}

	public Date getClaim_MOD_dt() {
		return claim_MOD_dt;
	}

	public void setClaim_MOD_dt(Date claim_MOD_dt) {
		this.claim_MOD_dt = claim_MOD_dt;
	}

	public String getClaim_cust_code() {
		return claim_cust_code;
	}

	public void setClaim_cust_code(String claim_cust_code) {
		this.claim_cust_code = claim_cust_code;
	}

	public String getClaim_accnt_pay_code() {
		return claim_accnt_pay_code;
	}

	public void setClaim_accnt_pay_code(String claim_accnt_pay_code) {
		this.claim_accnt_pay_code = claim_accnt_pay_code;
	}

	public String getClaim_addl_status() {
		return claim_addl_status;
	}

	public void setClaim_addl_status(String claim_addl_status) {
		this.claim_addl_status = claim_addl_status;
	}

	public String getClaim_rev_res_flag() {
		return claim_rev_res_flag;
	}

	public void setClaim_rev_res_flag(String claim_rev_res_flag) {
		this.claim_rev_res_flag = claim_rev_res_flag;
	}

	public BigDecimal getClaim_resv_amt() {
		return claim_resv_amt;
	}

	public void setClaim_resv_amt(BigDecimal claim_resv_amt) {
		this.claim_resv_amt = claim_resv_amt;
	}

	public BigDecimal getClaim_util_amt() {
		return claim_util_amt;
	}

	public void setClaim_util_amt(BigDecimal claim_util_amt) {
		this.claim_util_amt = claim_util_amt;
	}

	public Date getClaim_apprv_dt() {
		return claim_apprv_dt;
	}

	public void setClaim_apprv_dt(Date claim_apprv_dt) {
		this.claim_apprv_dt = claim_apprv_dt;
	}

	public String getClaim_apprv_status() {
		return claim_apprv_status;
	}

	public void setClaim_apprv_status(String claim_apprv_status) {
		this.claim_apprv_status = claim_apprv_status;
	}

	public String getClaim_unit_sell_yn() {
		return claim_unit_sell_yn;
	}

	public void setClaim_unit_sell_yn(String claim_unit_sell_yn) {
		this.claim_unit_sell_yn = claim_unit_sell_yn;
	}

	public Date getClaim_reopen_dt() {
		return claim_reopen_dt;
	}

	public void setClaim_reopen_dt(Date claim_reopen_dt) {
		this.claim_reopen_dt = claim_reopen_dt;
	}

	public String getClaim_reopen_reason() {
		return claim_reopen_reason;
	}

	public void setClaim_reopen_reason(String claim_reopen_reason) {
		this.claim_reopen_reason = claim_reopen_reason;
	}

	public String getClaim_pol_valid_yn() {
		return claim_pol_valid_yn;
	}

	public void setClaim_pol_valid_yn(String claim_pol_valid_yn) {
		this.claim_pol_valid_yn = claim_pol_valid_yn;
	}

	public String getClaim_med_code() {
		return claim_med_code;
	}

	public void setClaim_med_code(String claim_med_code) {
		this.claim_med_code = claim_med_code;
	}

	public BigDecimal getClaim_lc_rla_amount() {
		return claim_lc_rla_amount;
	}

	public void setClaim_lc_rla_amount(BigDecimal claim_lc_rla_amount) {
		this.claim_lc_rla_amount = claim_lc_rla_amount;
	}

	public String getClaim_pci_ref_no() {
		return claim_pci_ref_no;
	}

	public void setClaim_pci_ref_no(String claim_pci_ref_no) {
		this.claim_pci_ref_no = claim_pci_ref_no;
	}

	public BigDecimal getClaim_lc_wak_amt() {
		return claim_lc_wak_amt;
	}

	public void setClaim_lc_wak_amt(BigDecimal claim_lc_wak_amt) {
		this.claim_lc_wak_amt = claim_lc_wak_amt;
	}

	public BigDecimal getClaim_lc_serv_fee() {
		return claim_lc_serv_fee;
	}

	public void setClaim_lc_serv_fee(BigDecimal claim_lc_serv_fee) {
		this.claim_lc_serv_fee = claim_lc_serv_fee;
	}

	public BigDecimal getClaim_lc_risk_prem() {
		return claim_lc_risk_prem;
	}

	public void setClaim_lc_risk_prem(BigDecimal claim_lc_risk_prem) {
		this.claim_lc_risk_prem = claim_lc_risk_prem;
	}

	public Date getClaim_dis_cert_dt() {
		return claim_dis_cert_dt;
	}

	public void setClaim_dis_cert_dt(Date claim_dis_cert_dt) {
		this.claim_dis_cert_dt = claim_dis_cert_dt;
	}

	public Date getClaim_med_exp_dt() {
		return claim_med_exp_dt;
	}

	public void setClaim_med_exp_dt(Date claim_med_exp_dt) {
		this.claim_med_exp_dt = claim_med_exp_dt;
	}

	public Date getClaim_sickness_dt() {
		return claim_sickness_dt;
	}

	public void setClaim_sickness_dt(Date claim_sickness_dt) {
		this.claim_sickness_dt = claim_sickness_dt;
	}

	public String getClaim_excl_typ() {
		return claim_excl_typ;
	}

	public void setClaim_excl_typ(String claim_excl_typ) {
		this.claim_excl_typ = claim_excl_typ;
	}

	public String getClaim_excl_reason() {
		return claim_excl_reason;
	}

	public void setClaim_excl_reason(String claim_excl_reason) {
		this.claim_excl_reason = claim_excl_reason;
	}

	public String getClaim_memb_code() {
		return claim_memb_code;
	}

	public void setClaim_memb_code(String claim_memb_code) {
		this.claim_memb_code = claim_memb_code;
	}

	public String getClaim_diseases_code() {
		return claim_diseases_code;
	}

	public void setClaim_diseases_code(String claim_diseases_code) {
		this.claim_diseases_code = claim_diseases_code;
	}

	public String getClaim_diseases_remarks() {
		return claim_diseases_remarks;
	}

	public void setClaim_diseases_remarks(String claim_diseases_remarks) {
		this.claim_diseases_remarks = claim_diseases_remarks;
	}

	public String getClaim_assrd_ref_id1() {
		return claim_assrd_ref_id1;
	}

	public void setClaim_assrd_ref_id1(String claim_assrd_ref_id1) {
		this.claim_assrd_ref_id1 = claim_assrd_ref_id1;
	}

	public BigDecimal getClaim_fee_hospitals() {
		return claim_fee_hospitals;
	}

	public void setClaim_fee_hospitals(BigDecimal claim_fee_hospitals) {
		this.claim_fee_hospitals = claim_fee_hospitals;
	}

	public String getClaim_icd_diseases_dtl() {
		return claim_icd_diseases_dtl;
	}

	public void setClaim_icd_diseases_dtl(String claim_icd_diseases_dtl) {
		this.claim_icd_diseases_dtl = claim_icd_diseases_dtl;
	}

	public Date getClaim_hosp_addm_dt() {
		return claim_hosp_addm_dt;
	}

	public void setClaim_hosp_addm_dt(Date claim_hosp_addm_dt) {
		this.claim_hosp_addm_dt = claim_hosp_addm_dt;
	}

	public Date getClaim_hosp_dschg_dt() {
		return claim_hosp_dschg_dt;
	}

	public void setClaim_hosp_dschg_dt(Date claim_hosp_dschg_dt) {
		this.claim_hosp_dschg_dt = claim_hosp_dschg_dt;
	}

	public String getClm_excl_yn() {
		return clm_excl_yn;
	}

	public void setClm_excl_yn(String clm_excl_yn) {
		this.clm_excl_yn = clm_excl_yn;
	}

	public String getClaim_claimant_code() {
		return claim_claimant_code;
	}

	public void setClaim_claimant_code(String claim_claimant_code) {
		this.claim_claimant_code = claim_claimant_code;
	}

	public String getClaim_int_email() {
		return claim_int_email;
	}

	public void setClaim_int_email(String claim_int_email) {
		this.claim_int_email = claim_int_email;
	}

	public String getClaim_int_mobile() {
		return claim_int_mobile;
	}

	public void setClaim_int_mobile(String claim_int_mobile) {
		this.claim_int_mobile = claim_int_mobile;
	}

	public String getClaim_pay_method() {
		return claim_pay_method;
	}

	public void setClaim_pay_method(String claim_pay_method) {
		this.claim_pay_method = claim_pay_method;
	}

	public BigDecimal getClaim_pay_rate() {
		return claim_pay_rate;
	}

	public void setClaim_pay_rate(BigDecimal claim_pay_rate) {
		this.claim_pay_rate = claim_pay_rate;
	}

   
}
