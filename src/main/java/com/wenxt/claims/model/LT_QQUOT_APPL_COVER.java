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
}
