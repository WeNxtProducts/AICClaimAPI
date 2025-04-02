package com.wenxt.claims.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "LT_QQUOT_APPL_COVER")
public class LT_QQUOT_APPL_COVER {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quote_seq")
	@SequenceGenerator(name = "quote_seq", sequenceName = "QUOTE_SEQ", allocationSize = 1)
	@Column(name = "QQAC_TRAN_ID", nullable = false, precision = 22, scale = 0)
	private Long QQAC_TRAN_ID;

	@Column(name = "QQAC_QQAD_TRAN_ID", nullable = false, precision = 22, scale = 0)
	private Long QQAC_QQAD_TRAN_ID;

	@Column(name = "QQAC_COVER_CODE", nullable = false, length = 12)
	private String QQAC_COVER_CODE;

	@Column(name = "QQAC_PERIOD", precision = 22, scale = 0)
	private Integer QQAC_PERIOD;

	@Column(name = "QQAC_PREM_PAY_YRS", precision = 22, scale = 0)
	private Integer QQAC_PREM_PAY_YRS;

	@Column(name = "QQAC_PREM_CALC_TYPE", length = 12)
	private String QQAC_PREM_CALC_TYPE;

	@Column(name = "QQAC_FC_SA", precision = 22, scale = 3)
	private BigDecimal QQAC_FC_SA;

	@Column(name = "QQAC_LC_SA", precision = 22, scale = 3)
	private BigDecimal QQAC_LC_SA;

	@Column(name = "QQAC_FC_PREM", precision = 22, scale = 3)
	private BigDecimal QQAC_FC_PREM;

	@Column(name = "QQAC_LC_PREM", precision = 22, scale = 3)
	private BigDecimal QQAC_LC_PREM;

	@Column(name = "QQAC_RATE", precision = 22, scale = 5)
	private BigDecimal QQAC_RATE;

	@Column(name = "QQAC_RATE_PER", precision = 22, scale = 0)
	private Integer QQAC_RATE_PER;

	@Column(name = "QQAC_REQ_YN", length = 1)
	private String QQAC_REQ_YN;

	@Column(name = "QQAC_EFF_FM_DT")
	@Temporal(TemporalType.DATE)
	private Date QQAC_EFF_FM_DT;

	@Column(name = "QQAC_EFF_TO_DT")
	@Temporal(TemporalType.DATE)
	private Date QQAC_EFF_TO_DT;

	@Column(name = "QQAC_RATE_APPLIED_ON", length = 2)
	private String QQAC_RATE_APPLIED_ON;

	@Column(name = "QQAC_QUOT_TRAN_ID", precision = 22, scale = 0)
	private Long QQAC_QUOT_TRAN_ID;

	@Column(name = "QQAC_EMR_RATE", precision = 22, scale = 3)
	private BigDecimal QQAC_EMR_RATE;

	@Column(name = "QQAC_ORG_RATE", precision = 22, scale = 3)
	private BigDecimal QQAC_ORG_RATE;

	@Column(name = "QQAC_SELECT_YN", length = 1)
	private String QQAC_SELECT_YN;

	@Column(name = "QQAC_INS_ID", length = 12, nullable = false)
	private String QQAC_INS_ID;

	@Column(name = "QQAC_INS_DT")
	@Temporal(TemporalType.DATE)
	private Date QQAC_INS_DT;

	@Column(name = "QQAC_MOD_ID", length = 12)
	private String QQAC_MOD_ID;

	@Column(name = "QQAC_MOD_DT")
	@Temporal(TemporalType.DATE)
	private Date QQAC_MOD_DT;

	@Column(name = "QQAC_EDIT_YN", length = 1)
	private String QQAC_EDIT_YN;

	@Column(name = "QQAC_BASIC_YN", length = 1)
	private String QQAC_BASIC_YN;

	public Long getQQAC_TRAN_ID() {
		return QQAC_TRAN_ID;
	}

	public void setQQAC_TRAN_ID(Long qQAC_TRAN_ID) {
		QQAC_TRAN_ID = qQAC_TRAN_ID;
	}

	public Long getQQAC_QQAD_TRAN_ID() {
		return QQAC_QQAD_TRAN_ID;
	}

	public void setQQAC_QQAD_TRAN_ID(Long qQAC_QQAD_TRAN_ID) {
		QQAC_QQAD_TRAN_ID = qQAC_QQAD_TRAN_ID;
	}

	public String getQQAC_COVER_CODE() {
		return QQAC_COVER_CODE;
	}

	public void setQQAC_COVER_CODE(String qQAC_COVER_CODE) {
		QQAC_COVER_CODE = qQAC_COVER_CODE;
	}

	public Integer getQQAC_PERIOD() {
		return QQAC_PERIOD;
	}

	public void setQQAC_PERIOD(Integer qQAC_PERIOD) {
		QQAC_PERIOD = qQAC_PERIOD;
	}

	public Integer getQQAC_PREM_PAY_YRS() {
		return QQAC_PREM_PAY_YRS;
	}

	public void setQQAC_PREM_PAY_YRS(Integer qQAC_PREM_PAY_YRS) {
		QQAC_PREM_PAY_YRS = qQAC_PREM_PAY_YRS;
	}

	public String getQQAC_PREM_CALC_TYPE() {
		return QQAC_PREM_CALC_TYPE;
	}

	public void setQQAC_PREM_CALC_TYPE(String qQAC_PREM_CALC_TYPE) {
		QQAC_PREM_CALC_TYPE = qQAC_PREM_CALC_TYPE;
	}

	public BigDecimal getQQAC_FC_SA() {
		return QQAC_FC_SA;
	}

	public void setQQAC_FC_SA(BigDecimal qQAC_FC_SA) {
		QQAC_FC_SA = qQAC_FC_SA;
	}

	public BigDecimal getQQAC_LC_SA() {
		return QQAC_LC_SA;
	}

	public void setQQAC_LC_SA(BigDecimal qQAC_LC_SA) {
		QQAC_LC_SA = qQAC_LC_SA;
	}

	public BigDecimal getQQAC_FC_PREM() {
		return QQAC_FC_PREM;
	}

	public void setQQAC_FC_PREM(BigDecimal qQAC_FC_PREM) {
		QQAC_FC_PREM = qQAC_FC_PREM;
	}

	public BigDecimal getQQAC_LC_PREM() {
		return QQAC_LC_PREM;
	}

	public void setQQAC_LC_PREM(BigDecimal qQAC_LC_PREM) {
		QQAC_LC_PREM = qQAC_LC_PREM;
	}

	public BigDecimal getQQAC_RATE() {
		return QQAC_RATE;
	}

	public void setQQAC_RATE(BigDecimal qQAC_RATE) {
		QQAC_RATE = qQAC_RATE;
	}

	public Integer getQQAC_RATE_PER() {
		return QQAC_RATE_PER;
	}

	public void setQQAC_RATE_PER(Integer qQAC_RATE_PER) {
		QQAC_RATE_PER = qQAC_RATE_PER;
	}

	public String getQQAC_REQ_YN() {
		return QQAC_REQ_YN;
	}

	public void setQQAC_REQ_YN(String qQAC_REQ_YN) {
		QQAC_REQ_YN = qQAC_REQ_YN;
	}

	public Date getQQAC_EFF_FM_DT() {
		return QQAC_EFF_FM_DT;
	}

	public void setQQAC_EFF_FM_DT(Date qQAC_EFF_FM_DT) {
		QQAC_EFF_FM_DT = qQAC_EFF_FM_DT;
	}

	public Date getQQAC_EFF_TO_DT() {
		return QQAC_EFF_TO_DT;
	}

	public void setQQAC_EFF_TO_DT(Date qQAC_EFF_TO_DT) {
		QQAC_EFF_TO_DT = qQAC_EFF_TO_DT;
	}

	public String getQQAC_RATE_APPLIED_ON() {
		return QQAC_RATE_APPLIED_ON;
	}

	public void setQQAC_RATE_APPLIED_ON(String qQAC_RATE_APPLIED_ON) {
		QQAC_RATE_APPLIED_ON = qQAC_RATE_APPLIED_ON;
	}

	public Long getQQAC_QUOT_TRAN_ID() {
		return QQAC_QUOT_TRAN_ID;
	}

	public void setQQAC_QUOT_TRAN_ID(Long qQAC_QUOT_TRAN_ID) {
		QQAC_QUOT_TRAN_ID = qQAC_QUOT_TRAN_ID;
	}

	public BigDecimal getQQAC_EMR_RATE() {
		return QQAC_EMR_RATE;
	}

	public void setQQAC_EMR_RATE(BigDecimal qQAC_EMR_RATE) {
		QQAC_EMR_RATE = qQAC_EMR_RATE;
	}

	public BigDecimal getQQAC_ORG_RATE() {
		return QQAC_ORG_RATE;
	}

	public void setQQAC_ORG_RATE(BigDecimal qQAC_ORG_RATE) {
		QQAC_ORG_RATE = qQAC_ORG_RATE;
	}

	public String getQQAC_SELECT_YN() {
		return QQAC_SELECT_YN;
	}

	public void setQQAC_SELECT_YN(String qQAC_SELECT_YN) {
		QQAC_SELECT_YN = qQAC_SELECT_YN;
	}

	public String getQQAC_INS_ID() {
		return QQAC_INS_ID;
	}

	public void setQQAC_INS_ID(String qQAC_INS_ID) {
		QQAC_INS_ID = qQAC_INS_ID;
	}

	public Date getQQAC_INS_DT() {
		return QQAC_INS_DT;
	}

	public void setQQAC_INS_DT(Date qQAC_INS_DT) {
		QQAC_INS_DT = qQAC_INS_DT;
	}

	public String getQQAC_MOD_ID() {
		return QQAC_MOD_ID;
	}

	public void setQQAC_MOD_ID(String qQAC_MOD_ID) {
		QQAC_MOD_ID = qQAC_MOD_ID;
	}

	public Date getQQAC_MOD_DT() {
		return QQAC_MOD_DT;
	}

	public void setQQAC_MOD_DT(Date qQAC_MOD_DT) {
		QQAC_MOD_DT = qQAC_MOD_DT;
	}

	public String getQQAC_EDIT_YN() {
		return QQAC_EDIT_YN;
	}

	public void setQQAC_EDIT_YN(String qQAC_EDIT_YN) {
		QQAC_EDIT_YN = qQAC_EDIT_YN;
	}

	public String getQQAC_BASIC_YN() {
		return QQAC_BASIC_YN;
	}

	public void setQQAC_BASIC_YN(String qQAC_BASIC_YN) {
		QQAC_BASIC_YN = qQAC_BASIC_YN;
	}
	
	
}
