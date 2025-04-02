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
	
	@Column(name = "QUOT_NO")
	private String QUOT_NO;
	
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

	public Long getQUOT_TRAN_ID() {
		return QUOT_TRAN_ID;
	}

	public void setQUOT_TRAN_ID(Long qUOT_TRAN_ID) {
		QUOT_TRAN_ID = qUOT_TRAN_ID;
	}

	public String getQUOT_NAME_TITLE() {
		return QUOT_NAME_TITLE;
	}

	public void setQUOT_NAME_TITLE(String qUOT_NAME_TITLE) {
		QUOT_NAME_TITLE = qUOT_NAME_TITLE;
	}

	public String getQUOT_FIRST_NAME() {
		return QUOT_FIRST_NAME;
	}

	public void setQUOT_FIRST_NAME(String qUOT_FIRST_NAME) {
		QUOT_FIRST_NAME = qUOT_FIRST_NAME;
	}

	public String getQUOT_MIDDLE_NAME() {
		return QUOT_MIDDLE_NAME;
	}

	public void setQUOT_MIDDLE_NAME(String qUOT_MIDDLE_NAME) {
		QUOT_MIDDLE_NAME = qUOT_MIDDLE_NAME;
	}

	public String getQUOT_LAST_NAME() {
		return QUOT_LAST_NAME;
	}

	public void setQUOT_LAST_NAME(String qUOT_LAST_NAME) {
		QUOT_LAST_NAME = qUOT_LAST_NAME;
	}

	public Date getQUOT_DOB() {
		return QUOT_DOB;
	}

	public void setQUOT_DOB(Date qUOT_DOB) {
		QUOT_DOB = qUOT_DOB;
	}

	public String getQUOT_SEX() {
		return QUOT_SEX;
	}

	public void setQUOT_SEX(String qUOT_SEX) {
		QUOT_SEX = qUOT_SEX;
	}

	public Long getQUOT_MOBILE_NO() {
		return QUOT_MOBILE_NO;
	}

	public void setQUOT_MOBILE_NO(Long qUOT_MOBILE_NO) {
		QUOT_MOBILE_NO = qUOT_MOBILE_NO;
	}

	public String getQUOT_EMAIL_ID() {
		return QUOT_EMAIL_ID;
	}

	public void setQUOT_EMAIL_ID(String qUOT_EMAIL_ID) {
		QUOT_EMAIL_ID = qUOT_EMAIL_ID;
	}

	public Integer getQUOT_POL_TERM() {
		return QUOT_POL_TERM;
	}

	public void setQUOT_POL_TERM(Integer qUOT_POL_TERM) {
		QUOT_POL_TERM = qUOT_POL_TERM;
	}

	public String getQUOT_PREM_TERM() {
		return QUOT_PREM_TERM;
	}

	public void setQUOT_PREM_TERM(String qUOT_PREM_TERM) {
		QUOT_PREM_TERM = qUOT_PREM_TERM;
	}

	public String getQUOT_MOP() {
		return QUOT_MOP;
	}

	public void setQUOT_MOP(String qUOT_MOP) {
		QUOT_MOP = qUOT_MOP;
	}

	public String getQUOT_CURR() {
		return QUOT_CURR;
	}

	public void setQUOT_CURR(String qUOT_CURR) {
		QUOT_CURR = qUOT_CURR;
	}

	public BigDecimal getQUOT_FC_SA() {
		return QUOT_FC_SA;
	}

	public void setQUOT_FC_SA(BigDecimal qUOT_FC_SA) {
		QUOT_FC_SA = qUOT_FC_SA;
	}

	public BigDecimal getQUOT_LC_SA() {
		return QUOT_LC_SA;
	}

	public void setQUOT_LC_SA(BigDecimal qUOT_LC_SA) {
		QUOT_LC_SA = qUOT_LC_SA;
	}

	public BigDecimal getQUOT_FC_PREM() {
		return QUOT_FC_PREM;
	}

	public void setQUOT_FC_PREM(BigDecimal qUOT_FC_PREM) {
		QUOT_FC_PREM = qUOT_FC_PREM;
	}

	public BigDecimal getQUOT_LC_PREM() {
		return QUOT_LC_PREM;
	}

	public void setQUOT_LC_PREM(BigDecimal qUOT_LC_PREM) {
		QUOT_LC_PREM = qUOT_LC_PREM;
	}

	public String getQUOT_OCCU_CLASS() {
		return QUOT_OCCU_CLASS;
	}

	public void setQUOT_OCCU_CLASS(String qUOT_OCCU_CLASS) {
		QUOT_OCCU_CLASS = qUOT_OCCU_CLASS;
	}

	public String getQUOT_OCCU() {
		return QUOT_OCCU;
	}

	public void setQUOT_OCCU(String qUOT_OCCU) {
		QUOT_OCCU = qUOT_OCCU;
	}

	public String getQUOT_NATIONAL() {
		return QUOT_NATIONAL;
	}

	public void setQUOT_NATIONAL(String qUOT_NATIONAL) {
		QUOT_NATIONAL = qUOT_NATIONAL;
	}

	public String getQUOT_SMOKER_YN() {
		return QUOT_SMOKER_YN;
	}

	public void setQUOT_SMOKER_YN(String qUOT_SMOKER_YN) {
		QUOT_SMOKER_YN = qUOT_SMOKER_YN;
	}

	public String getQUOT_COUNT_RESIDENCE() {
		return QUOT_COUNT_RESIDENCE;
	}

	public void setQUOT_COUNT_RESIDENCE(String qUOT_COUNT_RESIDENCE) {
		QUOT_COUNT_RESIDENCE = qUOT_COUNT_RESIDENCE;
	}

	public String getQUOT_PROMO_CODE() {
		return QUOT_PROMO_CODE;
	}

	public void setQUOT_PROMO_CODE(String qUOT_PROMO_CODE) {
		QUOT_PROMO_CODE = qUOT_PROMO_CODE;
	}

	public String getQUOT_HIV_TEST_YN() {
		return QUOT_HIV_TEST_YN;
	}

	public void setQUOT_HIV_TEST_YN(String qUOT_HIV_TEST_YN) {
		QUOT_HIV_TEST_YN = qUOT_HIV_TEST_YN;
	}

	public Date getQUOT_INS_DT() {
		return QUOT_INS_DT;
	}

	public void setQUOT_INS_DT(Date qUOT_INS_DT) {
		QUOT_INS_DT = qUOT_INS_DT;
	}

	public String getQUOT_INS_ID() {
		return QUOT_INS_ID;
	}

	public void setQUOT_INS_ID(String qUOT_INS_ID) {
		QUOT_INS_ID = qUOT_INS_ID;
	}

	public Date getQUOT_MOD_DT() {
		return QUOT_MOD_DT;
	}

	public void setQUOT_MOD_DT(Date qUOT_MOD_DT) {
		QUOT_MOD_DT = qUOT_MOD_DT;
	}

	public String getQUOT_MOD_ID() {
		return QUOT_MOD_ID;
	}

	public void setQUOT_MOD_ID(String qUOT_MOD_ID) {
		QUOT_MOD_ID = qUOT_MOD_ID;
	}

	public Integer getQUOT_AGE() {
		return QUOT_AGE;
	}

	public void setQUOT_AGE(Integer qUOT_AGE) {
		QUOT_AGE = qUOT_AGE;
	}

	public String getQUOT_NO() {
		return QUOT_NO;
	}

	public void setQUOT_NO(String qUOT_NO) {
		QUOT_NO = qUOT_NO;
	}

	public String getQUOT_PROD_CODE() {
		return QUOT_PROD_CODE;
	}

	public void setQUOT_PROD_CODE(String qUOT_PROD_CODE) {
		QUOT_PROD_CODE = qUOT_PROD_CODE;
	}

	public String getQMD_SPOUSE_NAME() {
		return QMD_SPOUSE_NAME;
	}

	public void setQMD_SPOUSE_NAME(String qMD_SPOUSE_NAME) {
		QMD_SPOUSE_NAME = qMD_SPOUSE_NAME;
	}

	public Date getQMD_SPOUSE_DOB() {
		return QMD_SPOUSE_DOB;
	}

	public void setQMD_SPOUSE_DOB(Date qMD_SPOUSE_DOB) {
		QMD_SPOUSE_DOB = qMD_SPOUSE_DOB;
	}

	public Integer getQMD_SPOUSE_AGE() {
		return QMD_SPOUSE_AGE;
	}

	public void setQMD_SPOUSE_AGE(Integer qMD_SPOUSE_AGE) {
		QMD_SPOUSE_AGE = qMD_SPOUSE_AGE;
	}

	public String getQMD_CHILD1_NAME() {
		return QMD_CHILD1_NAME;
	}

	public void setQMD_CHILD1_NAME(String qMD_CHILD1_NAME) {
		QMD_CHILD1_NAME = qMD_CHILD1_NAME;
	}

	public Date getQMD_CHILD1_DOB() {
		return QMD_CHILD1_DOB;
	}

	public void setQMD_CHILD1_DOB(Date qMD_CHILD1_DOB) {
		QMD_CHILD1_DOB = qMD_CHILD1_DOB;
	}

	public Integer getQMD_CHILD1_AGE() {
		return QMD_CHILD1_AGE;
	}

	public void setQMD_CHILD1_AGE(Integer qMD_CHILD1_AGE) {
		QMD_CHILD1_AGE = qMD_CHILD1_AGE;
	}

	public String getQMD_CHILD2_NAME() {
		return QMD_CHILD2_NAME;
	}

	public void setQMD_CHILD2_NAME(String qMD_CHILD2_NAME) {
		QMD_CHILD2_NAME = qMD_CHILD2_NAME;
	}

	public Date getQMD_CHILD2_DOB() {
		return QMD_CHILD2_DOB;
	}

	public void setQMD_CHILD2_DOB(Date qMD_CHILD2_DOB) {
		QMD_CHILD2_DOB = qMD_CHILD2_DOB;
	}

	public Integer getQMD_CHILD2_AGE() {
		return QMD_CHILD2_AGE;
	}

	public void setQMD_CHILD2_AGE(Integer qMD_CHILD2_AGE) {
		QMD_CHILD2_AGE = qMD_CHILD2_AGE;
	}
	
	
	
}
