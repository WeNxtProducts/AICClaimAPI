package com.wenxt.claims.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LH_CLAIM_ESTIMATE")
public class LhClaimEstimate {
	
	 	@Id
	 	@SequenceGenerator(name = "ClaimHistoryTranIDSeq", sequenceName = "CEH_TRAN_ID_SEQ", allocationSize = 1)
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ClaimHistoryTranIDSeq")
	    @Column(name = "CEH_TRAN_ID")
	    private Integer CEH_TRAN_ID;

	    @Column(name = "CEH_CLM_TRAN_ID" )
	    private Integer CEH_CLM_TRAN_ID;

	    @Column(name = "CEH_LOSS_CODE" )
	    private String CEH_LOSS_CODE;

	    @Column(name = "CEH_COVER_CODE" )
	    private String CEH_COVER_CODE;

	    @Column(name = "CEH_REF_NO" )
	    private String CEH_REF_NO;

	    @Column(name = "CEH_DISB_PERC" )
	    private BigDecimal CEH_DISB_PERC;

	    @Column(name = "CEH_DISB_FM_DT" )
	    private Date CEH_DISB_FM_DT;

	    @Column(name = "CEH_DISB_TO_DT" )
	    private Date CEH_DISB_TO_DT;

	    @Column(name = "CEH_NO_OF_DAYS_DISB" )
	    private Integer CEH_NO_OF_DAYS_DISB;

	    @Column(name = "CEH_O_FC_EST_AMT" )
	    private BigDecimal CEH_O_FC_EST_AMT;

	    @Column(name = "CEH_O_LC_EST_AMT" )
	    private BigDecimal CEH_O_LC_EST_AMT;

	    @Column(name = "CEH_O_FC_PAID_AMT" )
	    private BigDecimal CEH_O_FC_PAID_AMT;

	    @Column(name = "CEH_O_LC_PAID_AMT" )
	    private BigDecimal CEH_O_LC_PAID_AMT;

	    @Column(name = "CEH_N_FC_EST_AMT" )
	    private BigDecimal CEH_N_FC_EST_AMT;

	    @Column(name = "CEH_N_LC_EST_AMT" )
	    private BigDecimal CEH_N_LC_EST_AMT;

	    @Column(name = "CEH_N_FC_PAID_AMT" )
	    private BigDecimal CEH_N_FC_PAID_AMT;

	    @Column(name = "CEH_N_LC_PAID_AMT" )
	    private BigDecimal CEH_N_LC_PAID_AMT;

	    @Column(name = "CEH_FRZ_FLAG" )
	    private String CEH_FRZ_FLAG;

	    @Column(name = "CEH_CLOSE_FLAG" )
	    private String CEH_CLOSE_FLAG;

	    @Column(name = "CEH_CONFIRM_FLAG" )
	    private String CEH_CONFIRM_FLAG;

	    @Column(name = "CEH_RESERVE_GEN_FLAG" )
	    private String CEH_RESERVE_GEN_FLAG;

	    @Column(name = "CEH_CLOSE_DT" )
	    private Date CEH_CLOSE_DT;

	    @Column(name = "CEH_CLOSE_REASON" )
	    private String CEH_CLOSE_REASON;

	    @Column(name = "CEH_INS_DT" )
	    private Date CEH_INS_DT;

	    @Column(name = "CEH_INS_ID" )
	    private String CEH_INS_ID;

	    @Column(name = "CEH_MOD_DT" )
	    private Date CEH_MOD_DT;

	    @Column(name = "CEH_MOD_ID" )
	    private String CEH_MOD_ID;

	    @Column(name = "CEH_OS_LOAN_AMT" )
	    private BigDecimal CEH_OS_LOAN_AMT;

	    @Column(name = "CEH_SALARY" )
	    private BigDecimal CEH_SALARY;

	    @Column(name = "CEH_NO_OF_MONTHS" )
	    private Integer CEH_NO_OF_MONTHS;

	    @Column(name = "CEH_ESTIMATE_DT" )
	    private Date CEH_ESTIMATE_DT;

	    @Column(name = "CEH_NO_OF_YEARS" )
	    private Integer CEH_NO_OF_YEARS;

	    @Column(name = "CEH_EST_TYPE" )
	    private String CEH_EST_TYPE;

		public Integer getCEH_TRAN_ID() {
			return CEH_TRAN_ID;
		}

		public void setCEH_TRAN_ID(Integer cEH_TRAN_ID) {
			CEH_TRAN_ID = cEH_TRAN_ID;
		}

		public Integer getCEH_CLM_TRAN_ID() {
			return CEH_CLM_TRAN_ID;
		}

		public void setCEH_CLM_TRAN_ID(Integer cEH_CLM_TRAN_ID) {
			CEH_CLM_TRAN_ID = cEH_CLM_TRAN_ID;
		}

		public String getCEH_LOSS_CODE() {
			return CEH_LOSS_CODE;
		}

		public void setCEH_LOSS_CODE(String cEH_LOSS_CODE) {
			CEH_LOSS_CODE = cEH_LOSS_CODE;
		}

		public String getCEH_COVER_CODE() {
			return CEH_COVER_CODE;
		}

		public void setCEH_COVER_CODE(String cEH_COVER_CODE) {
			CEH_COVER_CODE = cEH_COVER_CODE;
		}

		public String getCEH_REF_NO() {
			return CEH_REF_NO;
		}

		public void setCEH_REF_NO(String cEH_REF_NO) {
			CEH_REF_NO = cEH_REF_NO;
		}

		public BigDecimal getCEH_DISB_PERC() {
			return CEH_DISB_PERC;
		}

		public void setCEH_DISB_PERC(BigDecimal cEH_DISB_PERC) {
			CEH_DISB_PERC = cEH_DISB_PERC;
		}

		public Date getCEH_DISB_FM_DT() {
			return CEH_DISB_FM_DT;
		}

		public void setCEH_DISB_FM_DT(Date cEH_DISB_FM_DT) {
			CEH_DISB_FM_DT = cEH_DISB_FM_DT;
		}

		public Date getCEH_DISB_TO_DT() {
			return CEH_DISB_TO_DT;
		}

		public void setCEH_DISB_TO_DT(Date cEH_DISB_TO_DT) {
			CEH_DISB_TO_DT = cEH_DISB_TO_DT;
		}

		public Integer getCEH_NO_OF_DAYS_DISB() {
			return CEH_NO_OF_DAYS_DISB;
		}

		public void setCEH_NO_OF_DAYS_DISB(Integer cEH_NO_OF_DAYS_DISB) {
			CEH_NO_OF_DAYS_DISB = cEH_NO_OF_DAYS_DISB;
		}

		public BigDecimal getCEH_O_FC_EST_AMT() {
			return CEH_O_FC_EST_AMT;
		}

		public void setCEH_O_FC_EST_AMT(BigDecimal cEH_O_FC_EST_AMT) {
			CEH_O_FC_EST_AMT = cEH_O_FC_EST_AMT;
		}

		public BigDecimal getCEH_O_LC_EST_AMT() {
			return CEH_O_LC_EST_AMT;
		}

		public void setCEH_O_LC_EST_AMT(BigDecimal cEH_O_LC_EST_AMT) {
			CEH_O_LC_EST_AMT = cEH_O_LC_EST_AMT;
		}

		public BigDecimal getCEH_O_FC_PAID_AMT() {
			return CEH_O_FC_PAID_AMT;
		}

		public void setCEH_O_FC_PAID_AMT(BigDecimal cEH_O_FC_PAID_AMT) {
			CEH_O_FC_PAID_AMT = cEH_O_FC_PAID_AMT;
		}

		public BigDecimal getCEH_O_LC_PAID_AMT() {
			return CEH_O_LC_PAID_AMT;
		}

		public void setCEH_O_LC_PAID_AMT(BigDecimal cEH_O_LC_PAID_AMT) {
			CEH_O_LC_PAID_AMT = cEH_O_LC_PAID_AMT;
		}

		public BigDecimal getCEH_N_FC_EST_AMT() {
			return CEH_N_FC_EST_AMT;
		}

		public void setCEH_N_FC_EST_AMT(BigDecimal cEH_N_FC_EST_AMT) {
			CEH_N_FC_EST_AMT = cEH_N_FC_EST_AMT;
		}

		public BigDecimal getCEH_N_LC_EST_AMT() {
			return CEH_N_LC_EST_AMT;
		}

		public void setCEH_N_LC_EST_AMT(BigDecimal cEH_N_LC_EST_AMT) {
			CEH_N_LC_EST_AMT = cEH_N_LC_EST_AMT;
		}

		public BigDecimal getCEH_N_FC_PAID_AMT() {
			return CEH_N_FC_PAID_AMT;
		}

		public void setCEH_N_FC_PAID_AMT(BigDecimal cEH_N_FC_PAID_AMT) {
			CEH_N_FC_PAID_AMT = cEH_N_FC_PAID_AMT;
		}

		public BigDecimal getCEH_N_LC_PAID_AMT() {
			return CEH_N_LC_PAID_AMT;
		}

		public void setCEH_N_LC_PAID_AMT(BigDecimal cEH_N_LC_PAID_AMT) {
			CEH_N_LC_PAID_AMT = cEH_N_LC_PAID_AMT;
		}

		public String getCEH_FRZ_FLAG() {
			return CEH_FRZ_FLAG;
		}

		public void setCEH_FRZ_FLAG(String cEH_FRZ_FLAG) {
			CEH_FRZ_FLAG = cEH_FRZ_FLAG;
		}

		public String getCEH_CLOSE_FLAG() {
			return CEH_CLOSE_FLAG;
		}

		public void setCEH_CLOSE_FLAG(String cEH_CLOSE_FLAG) {
			CEH_CLOSE_FLAG = cEH_CLOSE_FLAG;
		}

		public String getCEH_CONFIRM_FLAG() {
			return CEH_CONFIRM_FLAG;
		}

		public void setCEH_CONFIRM_FLAG(String cEH_CONFIRM_FLAG) {
			CEH_CONFIRM_FLAG = cEH_CONFIRM_FLAG;
		}

		public String getCEH_RESERVE_GEN_FLAG() {
			return CEH_RESERVE_GEN_FLAG;
		}

		public void setCEH_RESERVE_GEN_FLAG(String cEH_RESERVE_GEN_FLAG) {
			CEH_RESERVE_GEN_FLAG = cEH_RESERVE_GEN_FLAG;
		}

		public Date getCEH_CLOSE_DT() {
			return CEH_CLOSE_DT;
		}

		public void setCEH_CLOSE_DT(Date cEH_CLOSE_DT) {
			CEH_CLOSE_DT = cEH_CLOSE_DT;
		}

		public String getCEH_CLOSE_REASON() {
			return CEH_CLOSE_REASON;
		}

		public void setCEH_CLOSE_REASON(String cEH_CLOSE_REASON) {
			CEH_CLOSE_REASON = cEH_CLOSE_REASON;
		}

		public Date getCEH_INS_DT() {
			return CEH_INS_DT;
		}

		public void setCEH_INS_DT(Date cEH_INS_DT) {
			CEH_INS_DT = cEH_INS_DT;
		}

		public String getCEH_INS_ID() {
			return CEH_INS_ID;
		}

		public void setCEH_INS_ID(String cEH_INS_ID) {
			CEH_INS_ID = cEH_INS_ID;
		}

		public Date getCEH_MOD_DT() {
			return CEH_MOD_DT;
		}

		public void setCEH_MOD_DT(Date cEH_MOD_DT) {
			CEH_MOD_DT = cEH_MOD_DT;
		}

		public String getCEH_MOD_ID() {
			return CEH_MOD_ID;
		}

		public void setCEH_MOD_ID(String cEH_MOD_ID) {
			CEH_MOD_ID = cEH_MOD_ID;
		}

		public BigDecimal getCEH_OS_LOAN_AMT() {
			return CEH_OS_LOAN_AMT;
		}

		public void setCEH_OS_LOAN_AMT(BigDecimal cEH_OS_LOAN_AMT) {
			CEH_OS_LOAN_AMT = cEH_OS_LOAN_AMT;
		}

		public BigDecimal getCEH_SALARY() {
			return CEH_SALARY;
		}

		public void setCEH_SALARY(BigDecimal cEH_SALARY) {
			CEH_SALARY = cEH_SALARY;
		}

		public Integer getCEH_NO_OF_MONTHS() {
			return CEH_NO_OF_MONTHS;
		}

		public void setCEH_NO_OF_MONTHS(Integer cEH_NO_OF_MONTHS) {
			CEH_NO_OF_MONTHS = cEH_NO_OF_MONTHS;
		}

		public Date getCEH_ESTIMATE_DT() {
			return CEH_ESTIMATE_DT;
		}

		public void setCEH_ESTIMATE_DT(Date cEH_ESTIMATE_DT) {
			CEH_ESTIMATE_DT = cEH_ESTIMATE_DT;
		}

		public Integer getCEH_NO_OF_YEARS() {
			return CEH_NO_OF_YEARS;
		}

		public void setCEH_NO_OF_YEARS(Integer cEH_NO_OF_YEARS) {
			CEH_NO_OF_YEARS = cEH_NO_OF_YEARS;
		}

		public String getCEH_EST_TYPE() {
			return CEH_EST_TYPE;
		}

		public void setCEH_EST_TYPE(String cEH_EST_TYPE) {
			CEH_EST_TYPE = cEH_EST_TYPE;
		}

}
