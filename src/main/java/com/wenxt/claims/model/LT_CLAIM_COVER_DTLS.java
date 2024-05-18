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
@Table(name = "LT_CLAIM_COVER_DTLS")
public class LT_CLAIM_COVER_DTLS {

	@Id
    @SequenceGenerator(name = "ClaimCoverTranIdSeq", sequenceName = "CCD_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ClaimCoverTranIdSeq")
	@Column(name = "CCD_TRAN_ID")
	private long CCD_TRAN_ID;

	@Column(name = "CCD_CLAIM_TRAN_ID")
	private Integer CCD_CLAIM_TRAN_ID;

	@Column(name = "CCD_COVER_CODE")
	private String CCD_COVER_CODE;

	@Column(name = "CCD_LOSS_TYPE")
	private String CCD_LOSS_TYPE;

	@Column(name = "CCD_DISAB_TYPE")
	private String CCD_DISAB_TYPE;

	@Column(name = "CCD_FC_EST_AMT")
	private BigDecimal CCD_FC_EST_AMT;

	@Column(name = "CCD_LC_EST_AMT")
	private BigDecimal CCD_LC_EST_AMT;

	@Column(name = "CCD_FRZ_FLAG")
	private String CCD_FRZ_FLAG;

	@Column(name = "CCD_INS_ID")
	private String CCD_INS_ID;

	@Column(name = "CCD_INS_DT")
	private Date CCD_INS_DT;

	@Column(name = "CCD_MOD_UID")
	private String CCD_MOD_UID;

	@Column(name = "CCD_MOD_DT")
	private Date CCD_MOD_DT;

	@Column(name = "CCD_CLOSE_FLAG")
	private String CCD_CLOSE_FLAG;

	@Column(name = "CCD_CLOSE_DT")
	private Date CCD_CLOSE_DT;

	@Column(name = "CCD_PERIOD_UNIT")
	private String CCD_PERIOD_UNIT;

	@Column(name = "CCD_PERIOD")
	private Integer CCD_PERIOD;

	@Column(name = "CCD_RATE")
	private BigDecimal CCD_RATE;

	@Column(name = "CCD_RATE_PER")
	private Long CCD_RATE_PER;

	@Column(name = "CCD_CONFIRM_FLAG")
	private String CCD_CONFIRM_FLAG;

	@Column(name = "CCD_RESERVE_GEN_FLAG")
	private String CCD_RESERVE_GEN_FLAG;

	@Column(name = "CCD_SET_FLAG")
	private String CCD_SET_FLAG;

	@Column(name = "CCD_FITR_YN")
	private String CCD_FITR_YN;

	@Column(name = "CCD_NO_OF_DAYS")
	private Short CCD_NO_OF_DAYS;

	@Column(name = "CCD_RESERVE_DT")
	private Date CCD_RESERVE_DT;

	@Column(name = "CCD_CLAIM_PAY_TO")
	private String CCD_CLAIM_PAY_TO;

	@Column(name = "CCD_EMAIL")
	private String CCD_EMAIL;

	public long getCCD_TRAN_ID() {
		return CCD_TRAN_ID;
	}

	public void setCCD_TRAN_ID(long cCD_TRAN_ID) {
		CCD_TRAN_ID = cCD_TRAN_ID;
	}

	public Integer getCCD_CLAIM_TRAN_ID() {
		return CCD_CLAIM_TRAN_ID;
	}

	public void setCCD_CLAIM_TRAN_ID(Integer cCD_CLAIM_TRAN_ID) {
		CCD_CLAIM_TRAN_ID = cCD_CLAIM_TRAN_ID;
	}

	public String getCCD_COVER_CODE() {
		return CCD_COVER_CODE;
	}

	public void setCCD_COVER_CODE(String cCD_COVER_CODE) {
		CCD_COVER_CODE = cCD_COVER_CODE;
	}

	public String getCCD_LOSS_TYPE() {
		return CCD_LOSS_TYPE;
	}

	public void setCCD_LOSS_TYPE(String cCD_LOSS_TYPE) {
		CCD_LOSS_TYPE = cCD_LOSS_TYPE;
	}

	public String getCCD_DISAB_TYPE() {
		return CCD_DISAB_TYPE;
	}

	public void setCCD_DISAB_TYPE(String cCD_DISAB_TYPE) {
		CCD_DISAB_TYPE = cCD_DISAB_TYPE;
	}

	public BigDecimal getCCD_FC_EST_AMT() {
		return CCD_FC_EST_AMT;
	}

	public void setCCD_FC_EST_AMT(BigDecimal cCD_FC_EST_AMT) {
		CCD_FC_EST_AMT = cCD_FC_EST_AMT;
	}

	public BigDecimal getCCD_LC_EST_AMT() {
		return CCD_LC_EST_AMT;
	}

	public void setCCD_LC_EST_AMT(BigDecimal cCD_LC_EST_AMT) {
		CCD_LC_EST_AMT = cCD_LC_EST_AMT;
	}

	public String getCCD_FRZ_FLAG() {
		return CCD_FRZ_FLAG;
	}

	public void setCCD_FRZ_FLAG(String cCD_FRZ_FLAG) {
		CCD_FRZ_FLAG = cCD_FRZ_FLAG;
	}

	public String getCCD_INS_ID() {
		return CCD_INS_ID;
	}

	public void setCCD_INS_ID(String cCD_INS_ID) {
		CCD_INS_ID = cCD_INS_ID;
	}

	public Date getCCD_INS_DT() {
		return CCD_INS_DT;
	}

	public void setCCD_INS_DT(Date cCD_INS_DT) {
		CCD_INS_DT = cCD_INS_DT;
	}

	public String getCCD_MOD_UID() {
		return CCD_MOD_UID;
	}

	public void setCCD_MOD_UID(String cCD_MOD_UID) {
		CCD_MOD_UID = cCD_MOD_UID;
	}

	public Date getCCD_MOD_DT() {
		return CCD_MOD_DT;
	}

	public void setCCD_MOD_DT(Date cCD_MOD_DT) {
		CCD_MOD_DT = cCD_MOD_DT;
	}

	public String getCCD_CLOSE_FLAG() {
		return CCD_CLOSE_FLAG;
	}

	public void setCCD_CLOSE_FLAG(String cCD_CLOSE_FLAG) {
		CCD_CLOSE_FLAG = cCD_CLOSE_FLAG;
	}

	public Date getCCD_CLOSE_DT() {
		return CCD_CLOSE_DT;
	}

	public void setCCD_CLOSE_DT(Date cCD_CLOSE_DT) {
		CCD_CLOSE_DT = cCD_CLOSE_DT;
	}

	public String getCCD_PERIOD_UNIT() {
		return CCD_PERIOD_UNIT;
	}

	public void setCCD_PERIOD_UNIT(String cCD_PERIOD_UNIT) {
		CCD_PERIOD_UNIT = cCD_PERIOD_UNIT;
	}

	public Integer getCCD_PERIOD() {
		return CCD_PERIOD;
	}

	public void setCCD_PERIOD(Integer cCD_PERIOD) {
		CCD_PERIOD = cCD_PERIOD;
	}

	public BigDecimal getCCD_RATE() {
		return CCD_RATE;
	}

	public void setCCD_RATE(BigDecimal cCD_RATE) {
		CCD_RATE = cCD_RATE;
	}

	public Long getCCD_RATE_PER() {
		return CCD_RATE_PER;
	}

	public void setCCD_RATE_PER(Long cCD_RATE_PER) {
		CCD_RATE_PER = cCD_RATE_PER;
	}

	public String getCCD_CONFIRM_FLAG() {
		return CCD_CONFIRM_FLAG;
	}

	public void setCCD_CONFIRM_FLAG(String cCD_CONFIRM_FLAG) {
		CCD_CONFIRM_FLAG = cCD_CONFIRM_FLAG;
	}

	public String getCCD_RESERVE_GEN_FLAG() {
		return CCD_RESERVE_GEN_FLAG;
	}

	public void setCCD_RESERVE_GEN_FLAG(String cCD_RESERVE_GEN_FLAG) {
		CCD_RESERVE_GEN_FLAG = cCD_RESERVE_GEN_FLAG;
	}

	public String getCCD_SET_FLAG() {
		return CCD_SET_FLAG;
	}

	public void setCCD_SET_FLAG(String cCD_SET_FLAG) {
		CCD_SET_FLAG = cCD_SET_FLAG;
	}

	public String getCCD_FITR_YN() {
		return CCD_FITR_YN;
	}

	public void setCCD_FITR_YN(String cCD_FITR_YN) {
		CCD_FITR_YN = cCD_FITR_YN;
	}

	public Short getCCD_NO_OF_DAYS() {
		return CCD_NO_OF_DAYS;
	}

	public void setCCD_NO_OF_DAYS(Short cCD_NO_OF_DAYS) {
		CCD_NO_OF_DAYS = cCD_NO_OF_DAYS;
	}

	public Date getCCD_RESERVE_DT() {
		return CCD_RESERVE_DT;
	}

	public void setCCD_RESERVE_DT(Date cCD_RESERVE_DT) {
		CCD_RESERVE_DT = cCD_RESERVE_DT;
	}

	public String getCCD_CLAIM_PAY_TO() {
		return CCD_CLAIM_PAY_TO;
	}

	public void setCCD_CLAIM_PAY_TO(String cCD_CLAIM_PAY_TO) {
		CCD_CLAIM_PAY_TO = cCD_CLAIM_PAY_TO;
	}

	public String getCCD_EMAIL() {
		return CCD_EMAIL;
	}

	public void setCCD_EMAIL(String cCD_EMAIL) {
		CCD_EMAIL = cCD_EMAIL;
	}

}
