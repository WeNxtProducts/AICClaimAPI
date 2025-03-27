package com.wenxt.claims.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "LT_Quote")
@Data
public class LT_Quote {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quote_seq")
	@SequenceGenerator(name = "quote_seq", sequenceName = "QUOTE_SEQ", allocationSize = 1)
	@Column(name = "QUOT_TRAN_ID")
	private Long QUOT_TRAN_ID;

	@Column(name = "QUOT_NAME_TITLE", length = 3)
	private String QUOT_NAME_TITLE;

	@Column(name = "QUOT_FIRST_NAME", length = 100)
	private String QUOT_FIRST_NAME;

	@Column(name = "QUOT_MIDDLE_NAME", length = 100)
	private String QUOT_MIDDLE_NAME;

	@Column(name = "QUOT_LAST_NAME", length = 100)
	private String QUOT_LAST_NAME;

	@Column(name = "QUOT_DOB")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date QUOT_DOB;

	@Column(name = "QUOT_SEX", length = 1)
	private String QUOT_SEX;

	@Column(name = "QUOT_MOBILE_NO")
	private Long QUOT_MOBILE_NO;

	@Column(name = "QUOT_EMAIL_ID", length = 100)
	private String QUOT_EMAIL_ID;

	@Column(name = "QUOT_POL_TERM")
	private Integer QUOT_POL_TERM;

	@Column(name = "QUOT_PREM_TERM")
	private String QUOT_PREM_TERM;

	@Column(name = "QUOT_MOP", length = 1)
	private String QUOT_MOP;

	@Column(name = "QUOT_CURR", length = 3)
	private String QUOT_CURR;

	@Column(name = "QUOT_FC_SA", precision = 22, scale = 5)
	private BigDecimal QUOT_FC_SA;

	@Column(name = "QUOT_LC_SA", precision = 22, scale = 5)
	private BigDecimal QUOT_LC_SA;

	@Column(name = "QUOT_FC_PREM", precision = 22, scale = 5)
	private BigDecimal QUOT_FC_PREM;

	@Column(name = "QUOT_LC_PREM", precision = 22, scale = 5)
	private BigDecimal QUOT_LC_PREM;

	@Column(name = "QUOT_OCCU_CLASS", length = 12)
	private String QUOT_OCCU_CLASS;

	@Column(name = "QUOT_OCCU", length = 12)
	private String QUOT_OCCU;

	@Column(name = "QUOT_NATIONAL", length = 12)
	private String QUOT_NATIONAL;

	@Column(name = "QUOT_SMOKER_YN", length = 1)
	private String QUOT_SMOKER_YN;

	@Column(name = "QUOT_COUNT_RESIDENCE", length = 12)
	private String QUOT_COUNT_RESIDENCE;

	@Column(name = "QUOT_PROMO_CODE", length = 12)
	private String QUOT_PROMO_CODE;

	@Column(name = "QUOT_HIV_TEST_YN", length = 1)
	private String QUOT_HIV_TEST_YN;

	@Column(name = "QUOT_INS_DT")
	@Temporal(TemporalType.DATE)
	private Date QUOT_INS_DT;

	@Column(name = "QUOT_INS_ID", length = 12)
	private String QUOT_INS_ID;

	@Column(name = "QUOT_MOD_DT")
	@Temporal(TemporalType.DATE)
	private Date QUOT_MOD_DT;

	@Column(name = "QUOT_MOD_ID", length = 12)
	private String QUOT_MOD_ID;

	@Column(name = "QUOT_AGE", precision = 3, scale = 0)
	private Integer QUOT_AGE;
	
	@Column(name = "QUOT_PROD_CODE", length = 12)
    private String QUOT_PROD_CODE;
	
	@Column(name = "QMD_SPOUSE_NAME")
	private String QMD_SPOUSE_NAME;
	
	@Column(name = "QMD_SPOUSE_DOB")
	private Date QMD_SPOUSE_DOB;
	
	@Column(name = "QMD_SPOUSE_AGE")
	private Integer QMD_SPOUSE_AGE;
	
	@Column(name = "QMD_CHILD1_NAME")
	private String QMD_CHILD1_NAME;
	
	@Column(name = "QMD_CHILD1_DOB")
	private Date QMD_CHILD1_DOB;
	
	@Column(name = "QMD_CHILD1_AGE")
	private Integer QMD_CHILD1_AGE;
	
	@Column(name = "QMD_CHILD2_NAME")
	private String QMD_CHILD2_NAME;
	
	@Column(name = "QMD_CHILD2_DOB")
	private Date QMD_CHILD2_DOB;
	
	@Column(name = "QMD_CHILD2_AGE")
	private Integer QMD_CHILD2_AGE;
	
}
