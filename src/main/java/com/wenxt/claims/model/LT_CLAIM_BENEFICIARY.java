package com.example.aicbaseCrud.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_CLAIM_BENEFICIARY")
public class LT_CLAIM_BENEFICIARY {

	@Id
	private long cben_pben_TRAN_id;
	private long cben_TRAN_id;
	private long cben_claim_TRAN_id;
	private long cben_cp_TRAN_id;
	private String cben_bnf_type;
	private String cben_relation_code;
	private String cben_bnf_name;
	private String cben_bnf_name_bl;
	private double cben_perc;
	private String cben_INS_id;
	private Date cben_INS_dt;
	private String cben_MOD_id;
	private Date cben_MOD_dt;
	private double cben_lc_paid_amt;
	private double cben_fc_paid_amt;
	private String cben_bank_code;
	private String cben_acct_code;
	private String cben_ref_id1;
	private String cben_ref_id2;
	private String cben_address1;
	private String cben_address2;
	private String cben_address3;
	private String cben_stat_code;
	private String cben_postal_code;
	private String cben_city_code;
	private String cben_address4;
	private String cben_address5;
	private String cben_remarks;
	private String cben_catg_code;
	private short cben_age;
	private String cben_guardian_name;
	private long cben_micr_code;
	private String cben_divn_code;
	private int cben_sr_no;
	private Date cben_dob;
	private String cben_bnf_code;
	private String cben_flex_01;
	private String cben_flex_02;
	private String cben_flex_03;
	private String cben_flex_04;
	private String cben_flex_05;
	private String cben_flex_06;

	// Constructor, Getters, and Setters
	public LT_CLAIM_BENEFICIARY() {
	}

	public long getCben_TRAN_id() {
		return cben_TRAN_id;
	}

	public void setCben_TRAN_id(long cben_TRAN_id) {
		this.cben_TRAN_id = cben_TRAN_id;
	}

	public long getCben_claim_TRAN_id() {
		return cben_claim_TRAN_id;
	}

	public void setCben_claim_TRAN_id(long cben_claim_TRAN_id) {
		this.cben_claim_TRAN_id = cben_claim_TRAN_id;
	}

	public long getCben_cp_TRAN_id() {
		return cben_cp_TRAN_id;
	}

	public void setCben_cp_TRAN_id(long cben_cp_TRAN_id) {
		this.cben_cp_TRAN_id = cben_cp_TRAN_id;
	}

	public long getCben_pben_TRAN_id() {
		return cben_pben_TRAN_id;
	}

	public void setCben_pben_TRAN_id(long cben_pben_TRAN_id) {
		this.cben_pben_TRAN_id = cben_pben_TRAN_id;
	}

	public String getCben_bnf_type() {
		return cben_bnf_type;
	}

	public void setCben_bnf_type(String cben_bnf_type) {
		this.cben_bnf_type = cben_bnf_type;
	}

	public String getCben_relation_code() {
		return cben_relation_code;
	}

	public void setCben_relation_code(String cben_relation_code) {
		this.cben_relation_code = cben_relation_code;
	}

	public String getCben_bnf_name() {
		return cben_bnf_name;
	}

	public void setCben_bnf_name(String cben_bnf_name) {
		this.cben_bnf_name = cben_bnf_name;
	}

	public String getCben_bnf_name_bl() {
		return cben_bnf_name_bl;
	}

	public void setCben_bnf_name_bl(String cben_bnf_name_bl) {
		this.cben_bnf_name_bl = cben_bnf_name_bl;
	}

	public double getCben_perc() {
		return cben_perc;
	}

	public void setCben_perc(double cben_perc) {
		this.cben_perc = cben_perc;
	}

	public String getCben_INS_id() {
		return cben_INS_id;
	}

	public void setCben_INS_id(String cben_INS_id) {
		this.cben_INS_id = cben_INS_id;
	}

	public Date getCben_INS_dt() {
		return cben_INS_dt;
	}

	public void setCben_INS_dt(Date cben_INS_dt) {
		this.cben_INS_dt = cben_INS_dt;
	}

	public String getCben_MOD_id() {
		return cben_MOD_id;
	}

	public void setCben_MOD_id(String cben_MOD_id) {
		this.cben_MOD_id = cben_MOD_id;
	}

	public Date getCben_MOD_dt() {
		return cben_MOD_dt;
	}

	public void setCben_MOD_dt(Date cben_MOD_dt) {
		this.cben_MOD_dt = cben_MOD_dt;
	}

	public double getCben_lc_paid_amt() {
		return cben_lc_paid_amt;
	}

	public void setCben_lc_paid_amt(double cben_lc_paid_amt) {
		this.cben_lc_paid_amt = cben_lc_paid_amt;
	}

	public double getCben_fc_paid_amt() {
		return cben_fc_paid_amt;
	}

	public void setCben_fc_paid_amt(double cben_fc_paid_amt) {
		this.cben_fc_paid_amt = cben_fc_paid_amt;
	}

	public String getCben_bank_code() {
		return cben_bank_code;
	}

	public void setCben_bank_code(String cben_bank_code) {
		this.cben_bank_code = cben_bank_code;
	}

	public String getCben_acct_code() {
		return cben_acct_code;
	}

	public void setCben_acct_code(String cben_acct_code) {
		this.cben_acct_code = cben_acct_code;
	}

	public String getCben_ref_id1() {
		return cben_ref_id1;
	}

	public void setCben_ref_id1(String cben_ref_id1) {
		this.cben_ref_id1 = cben_ref_id1;
	}

	public String getCben_ref_id2() {
		return cben_ref_id2;
	}

	public void setCben_ref_id2(String cben_ref_id2) {
		this.cben_ref_id2 = cben_ref_id2;
	}

	public String getCben_address1() {
		return cben_address1;
	}

	public void setCben_address1(String cben_address1) {
		this.cben_address1 = cben_address1;
	}

	public String getCben_address2() {
		return cben_address2;
	}

	public void setCben_address2(String cben_address2) {
		this.cben_address2 = cben_address2;
	}

	public String getCben_address3() {
		return cben_address3;
	}

	public void setCben_address3(String cben_address3) {
		this.cben_address3 = cben_address3;
	}

	public String getCben_stat_code() {
		return cben_stat_code;
	}

	public void setCben_stat_code(String cben_stat_code) {
		this.cben_stat_code = cben_stat_code;
	}

	public String getCben_postal_code() {
		return cben_postal_code;
	}

	public void setCben_postal_code(String cben_postal_code) {
		this.cben_postal_code = cben_postal_code;
	}

	public String getCben_city_code() {
		return cben_city_code;
	}

	public void setCben_city_code(String cben_city_code) {
		this.cben_city_code = cben_city_code;
	}

	public String getCben_address4() {
		return cben_address4;
	}

	public void setCben_address4(String cben_address4) {
		this.cben_address4 = cben_address4;
	}

	public String getCben_address5() {
		return cben_address5;
	}

	public void setCben_address5(String cben_address5) {
		this.cben_address5 = cben_address5;
	}

	public String getCben_remarks() {
		return cben_remarks;
	}

	public void setCben_remarks(String cben_remarks) {
		this.cben_remarks = cben_remarks;
	}

	public String getCben_catg_code() {
		return cben_catg_code;
	}

	public void setCben_catg_code(String cben_catg_code) {
		this.cben_catg_code = cben_catg_code;
	}

	public short getCben_age() {
		return cben_age;
	}

	public void setCben_age(short cben_age) {
		this.cben_age = cben_age;
	}

	public String getCben_guardian_name() {
		return cben_guardian_name;
	}

	public void setCben_guardian_name(String cben_guardian_name) {
		this.cben_guardian_name = cben_guardian_name;
	}

	public long getCben_micr_code() {
		return cben_micr_code;
	}

	public void setCben_micr_code(long cben_micr_code) {
		this.cben_micr_code = cben_micr_code;
	}

	public String getCben_divn_code() {
		return cben_divn_code;
	}

	public void setCben_divn_code(String cben_divn_code) {
		this.cben_divn_code = cben_divn_code;
	}

	public int getCben_sr_no() {
		return cben_sr_no;
	}

	public void setCben_sr_no(int cben_sr_no) {
		this.cben_sr_no = cben_sr_no;
	}

	public Date getCben_dob() {
		return cben_dob;
	}

	public void setCben_dob(Date cben_dob) {
		this.cben_dob = cben_dob;
	}

	public String getCben_bnf_code() {
		return cben_bnf_code;
	}

	public void setCben_bnf_code(String cben_bnf_code) {
		this.cben_bnf_code = cben_bnf_code;
	}

	public String getCben_flex_01() {
		return cben_flex_01;
	}

	public void setCben_flex_01(String cben_flex_01) {
		this.cben_flex_01 = cben_flex_01;
	}

	public String getCben_flex_02() {
		return cben_flex_02;
	}

	public void setCben_flex_02(String cben_flex_02) {
		this.cben_flex_02 = cben_flex_02;
	}

	public String getCben_flex_03() {
		return cben_flex_03;
	}

	public void setCben_flex_03(String cben_flex_03) {
		this.cben_flex_03 = cben_flex_03;
	}

	public String getCben_flex_04() {
		return cben_flex_04;
	}

	public void setCben_flex_04(String cben_flex_04) {
		this.cben_flex_04 = cben_flex_04;
	}

	public String getCben_flex_05() {
		return cben_flex_05;
	}

	public void setCben_flex_05(String cben_flex_05) {
		this.cben_flex_05 = cben_flex_05;
	}

	public String getCben_flex_06() {
		return cben_flex_06;
	}

	public void setCben_flex_06(String cben_flex_06) {
		this.cben_flex_06 = cben_flex_06;
	}

}
