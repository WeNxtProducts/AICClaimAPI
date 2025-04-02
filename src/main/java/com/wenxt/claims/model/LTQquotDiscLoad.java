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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "LT_QQUOT_DISC_LOAD")
@Data
public class LTQquotDiscLoad {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "disc_load_seq")
    @SequenceGenerator(name = "disc_load_seq", sequenceName = "DISC_LOAD_SEQ", allocationSize = 1)
    @Column(name = "QQDL_TRAN_ID", nullable = false)
    private Long QQDL_TRAN_ID;

    @Column(name = "QQDL_QUOT_TRAN_ID", nullable = false)
    private Long QQDL_QUOT_TRAN_ID;

    @Column(name = "QQDL_DISC_LOAD_TYPE", length = 2, nullable = false)
    private String QQDL_DISC_LOAD_TYPE;

    @Column(name = "QQDL_DISC_LOAD_CODE", length = 12, nullable = false)
    private String QQDL_DISC_LOAD_CODE;

    @Column(name = "QQDL_FC_DISC_LOAD_AMT", precision = 14, scale = 3, nullable = false)
    private BigDecimal QQDL_FC_DISC_LOAD_AMT;

    @Column(name = "QQDL_LC_DISC_LOAD_AMT", precision = 14, scale = 3, nullable = false)
    private BigDecimal QQDL_LC_DISC_LOAD_AMT;

    @Column(name = "QQDL_APPLIED_ON", length = 2, nullable = false)
    private String QQDL_APPLIED_ON;

    @Column(name = "QQDL_APPLY_UPTO_SRNO", precision = 4, scale = 0, nullable = false)
    private Integer QQDL_APPLY_UPTO_SRNO;

    @Column(name = "QQDL_DEF_YN", length = 1, nullable = false)
    private String QQDL_DEF_YN;

    @Column(name = "QQDL_RATE_PER", precision = 10, scale = 0, nullable = false)
    private BigDecimal QQDL_RATE_PER;

    @Column(name = "QQDL_RATE", precision = 14, scale = 5, nullable = false)
    private BigDecimal QQDL_RATE;

    @Column(name = "QQDL_SRNO", precision = 5, scale = 0, nullable = false)
    private Integer QQDL_SRNO;

    @Column(name = "QQDL_APPL_PERC", precision = 3, scale = 0, nullable = false)
    private Integer QQDL_APPL_PERC;

    @Column(name = "QQDL_COVER_CODE", length = 12, nullable = false)
    private String QQDL_COVER_CODE;

    @Column(name = "QQDL_LC_EMR_VAL", precision = 14, scale = 3, nullable = false)
    private BigDecimal QQDL_LC_EMR_VAL;

    @Column(name = "QQDL_FC_EMR_VAL", precision = 14, scale = 3, nullable = false)
    private BigDecimal QQDL_FC_EMR_VAL;

    @Column(name = "QQDL_FLEX_01", length = 240, nullable = false)
    private String QQDL_FLEX_01;

    @Column(name = "QQDL_INS_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date QQDL_INS_DT;

    @Column(name = "QQDL_INS_ID", length = 12, nullable = false)
    private String QQDL_INS_ID;

	public Long getQQDL_TRAN_ID() {
		return QQDL_TRAN_ID;
	}

	public void setQQDL_TRAN_ID(Long qQDL_TRAN_ID) {
		QQDL_TRAN_ID = qQDL_TRAN_ID;
	}

	public Long getQQDL_QUOT_TRAN_ID() {
		return QQDL_QUOT_TRAN_ID;
	}

	public void setQQDL_QUOT_TRAN_ID(Long qQDL_QUOT_TRAN_ID) {
		QQDL_QUOT_TRAN_ID = qQDL_QUOT_TRAN_ID;
	}

	public String getQQDL_DISC_LOAD_TYPE() {
		return QQDL_DISC_LOAD_TYPE;
	}

	public void setQQDL_DISC_LOAD_TYPE(String qQDL_DISC_LOAD_TYPE) {
		QQDL_DISC_LOAD_TYPE = qQDL_DISC_LOAD_TYPE;
	}

	public String getQQDL_DISC_LOAD_CODE() {
		return QQDL_DISC_LOAD_CODE;
	}

	public void setQQDL_DISC_LOAD_CODE(String qQDL_DISC_LOAD_CODE) {
		QQDL_DISC_LOAD_CODE = qQDL_DISC_LOAD_CODE;
	}

	public BigDecimal getQQDL_FC_DISC_LOAD_AMT() {
		return QQDL_FC_DISC_LOAD_AMT;
	}

	public void setQQDL_FC_DISC_LOAD_AMT(BigDecimal qQDL_FC_DISC_LOAD_AMT) {
		QQDL_FC_DISC_LOAD_AMT = qQDL_FC_DISC_LOAD_AMT;
	}

	public BigDecimal getQQDL_LC_DISC_LOAD_AMT() {
		return QQDL_LC_DISC_LOAD_AMT;
	}

	public void setQQDL_LC_DISC_LOAD_AMT(BigDecimal qQDL_LC_DISC_LOAD_AMT) {
		QQDL_LC_DISC_LOAD_AMT = qQDL_LC_DISC_LOAD_AMT;
	}

	public String getQQDL_APPLIED_ON() {
		return QQDL_APPLIED_ON;
	}

	public void setQQDL_APPLIED_ON(String qQDL_APPLIED_ON) {
		QQDL_APPLIED_ON = qQDL_APPLIED_ON;
	}

	public Integer getQQDL_APPLY_UPTO_SRNO() {
		return QQDL_APPLY_UPTO_SRNO;
	}

	public void setQQDL_APPLY_UPTO_SRNO(Integer qQDL_APPLY_UPTO_SRNO) {
		QQDL_APPLY_UPTO_SRNO = qQDL_APPLY_UPTO_SRNO;
	}

	public String getQQDL_DEF_YN() {
		return QQDL_DEF_YN;
	}

	public void setQQDL_DEF_YN(String qQDL_DEF_YN) {
		QQDL_DEF_YN = qQDL_DEF_YN;
	}

	public BigDecimal getQQDL_RATE_PER() {
		return QQDL_RATE_PER;
	}

	public void setQQDL_RATE_PER(BigDecimal qQDL_RATE_PER) {
		QQDL_RATE_PER = qQDL_RATE_PER;
	}

	public BigDecimal getQQDL_RATE() {
		return QQDL_RATE;
	}

	public void setQQDL_RATE(BigDecimal qQDL_RATE) {
		QQDL_RATE = qQDL_RATE;
	}

	public Integer getQQDL_SRNO() {
		return QQDL_SRNO;
	}

	public void setQQDL_SRNO(Integer qQDL_SRNO) {
		QQDL_SRNO = qQDL_SRNO;
	}

	public Integer getQQDL_APPL_PERC() {
		return QQDL_APPL_PERC;
	}

	public void setQQDL_APPL_PERC(Integer qQDL_APPL_PERC) {
		QQDL_APPL_PERC = qQDL_APPL_PERC;
	}

	public String getQQDL_COVER_CODE() {
		return QQDL_COVER_CODE;
	}

	public void setQQDL_COVER_CODE(String qQDL_COVER_CODE) {
		QQDL_COVER_CODE = qQDL_COVER_CODE;
	}

	public BigDecimal getQQDL_LC_EMR_VAL() {
		return QQDL_LC_EMR_VAL;
	}

	public void setQQDL_LC_EMR_VAL(BigDecimal qQDL_LC_EMR_VAL) {
		QQDL_LC_EMR_VAL = qQDL_LC_EMR_VAL;
	}

	public BigDecimal getQQDL_FC_EMR_VAL() {
		return QQDL_FC_EMR_VAL;
	}

	public void setQQDL_FC_EMR_VAL(BigDecimal qQDL_FC_EMR_VAL) {
		QQDL_FC_EMR_VAL = qQDL_FC_EMR_VAL;
	}

	public String getQQDL_FLEX_01() {
		return QQDL_FLEX_01;
	}

	public void setQQDL_FLEX_01(String qQDL_FLEX_01) {
		QQDL_FLEX_01 = qQDL_FLEX_01;
	}

	public Date getQQDL_INS_DT() {
		return QQDL_INS_DT;
	}

	public void setQQDL_INS_DT(Date qQDL_INS_DT) {
		QQDL_INS_DT = qQDL_INS_DT;
	}

	public String getQQDL_INS_ID() {
		return QQDL_INS_ID;
	}

	public void setQQDL_INS_ID(String qQDL_INS_ID) {
		QQDL_INS_ID = qQDL_INS_ID;
	}
    
    
}
