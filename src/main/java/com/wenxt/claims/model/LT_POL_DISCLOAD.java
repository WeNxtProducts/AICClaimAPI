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
@Table(name = "LT_POL_DISCLOAD", schema = "LIFE_DEV")
public class LT_POL_DISCLOAD {

    @Id
    @SequenceGenerator(name = "PolDiscLoadTranIDSeq", sequenceName = "PDL_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PolDiscLoadTranIDSeq")
    @Column(name = "PDL_TRAN_ID")
    private Long PDL_TRAN_ID;

    @Column(name = "PDL_POL_TRAN_ID")
    private Long PDL_POL_TRAN_ID;

    @Column(name = "PDL_PEMP_TRAN_ID")
    private Long PDL_PEMP_TRAN_ID;

    @Column(name = "PDL_PEC_TRAN_ID")
    private Long PDL_PEC_TRAN_ID;

    @Column(name = "PDL_SRNO")
    private Integer PDL_SRNO;

    @Column(name = "PDL_APPLY_LEVEL")
    private String PDL_APPLY_LEVEL;

    @Column(name = "PDL_DISC_LOAD_TYPE")
    private String PDL_DISC_LOAD_TYPE;

    @Column(name = "PDL_DISC_LOAD_CODE")
    private String PDL_DISC_LOAD_CODE;

    @Column(name = "PDL_APPLIED_ON")
    private String PDL_APPLIED_ON;

    @Column(name = "PDL_RATE")
    private BigDecimal PDL_RATE;

    @Column(name = "PDL_RATE_PER")
    private Long PDL_RATE_PER;

    @Column(name = "PDL_FC_DISC_LOAD_VALUE")
    private BigDecimal PDL_FC_DISC_LOAD_VALUE;

    @Column(name = "PDL_LC_DISC_LOAD_VALUE")
    private BigDecimal PDL_LC_DISC_LOAD_VALUE;

    @Column(name = "PDL_APPLY_UPTO_SRNO")
    private Integer PDL_APPLY_UPTO_SRNO;

    @Column(name = "PDL_ORG_FC_DISC_LOAD_VALUE")
    private BigDecimal PDL_ORG_FC_DISC_LOAD_VALUE;

    @Column(name = "PDL_ORG_LC_DISC_LOAD_VALUE")
    private BigDecimal PDL_ORG_LC_DISC_LOAD_VALUE;

    @Column(name = "PDL_DEL_FLAG")
    private String PDL_DEL_FLAG;

    @Column(name = "PDL_INS_DT")
    private Date PDL_INS_DT;

    @Column(name = "PDL_INS_ID")
    private String PDL_INS_ID;

    @Column(name = "PDL_MOD_DT")
    private Date PDL_MOD_DT;

    @Column(name = "PDL_MOD_ID")
    private String PDL_MOD_ID;

    @Column(name = "PDL_TTY_RATE")
    private BigDecimal PDL_TTY_RATE;

    @Column(name = "PDL_FC_CL_AMT")
    private BigDecimal PDL_FC_CL_AMT;

    @Column(name = "PDL_LC_CL_AMT")
    private BigDecimal PDL_LC_CL_AMT;

    @Column(name = "PDL_FC_TTY_AMT")
    private BigDecimal PDL_FC_TTY_AMT;

    @Column(name = "PDL_LC_TTY_AMT")
    private BigDecimal PDL_LC_TTY_AMT;

    @Column(name = "PDL_ORG_FC_CL_AMT")
    private BigDecimal PDL_ORG_FC_CL_AMT;

    @Column(name = "PDL_ORG_LC_CL_AMT")
    private BigDecimal PDL_ORG_LC_CL_AMT;

    @Column(name = "PDL_ORG_FC_TTY_AMT")
    private BigDecimal PDL_ORG_FC_TTY_AMT;

    @Column(name = "PDL_ORG_LC_TTY_AMT")
    private BigDecimal PDL_ORG_LC_TTY_AMT;

    @Column(name = "PDL_REC_TYPE")
    private String PDL_REC_TYPE;

    @Column(name = "PDL_FC_RET_AMT")
    private BigDecimal PDL_FC_RET_AMT;

    @Column(name = "PDL_LC_RET_AMT")
    private BigDecimal PDL_LC_RET_AMT;

    @Column(name = "PDL_FC_RI_AMT")
    private BigDecimal PDL_FC_RI_AMT;

    @Column(name = "PDL_LC_RI_AMT")
    private BigDecimal PDL_LC_RI_AMT;

    @Column(name = "PDL_ORG_FC_RET_AMT")
    private BigDecimal PDL_ORG_FC_RET_AMT;

    @Column(name = "PDL_ORG_LC_RET_AMT")
    private BigDecimal PDL_ORG_LC_RET_AMT;

    @Column(name = "PDL_ORG_FC_RI_AMT")
    private BigDecimal PDL_ORG_FC_RI_AMT;

    @Column(name = "PDL_ORG_LC_RI_AMT")
    private BigDecimal PDL_ORG_LC_RI_AMT;

    @Column(name = "PDL_REMARKS")
    private String PDL_REMARKS;

    @Column(name = "PDL_PRORATE_COLL_YN")
    private String PDL_PRORATE_COLL_YN;

    @Column(name = "PDL_PRORATE_REFN_YN")
    private String PDL_PRORATE_REFN_YN;

    @Column(name = "PDL_DISC_LOAD_CALC_ON")
    private String PDL_DISC_LOAD_CALC_ON;

    @Column(name = "PDL_COVER_CODE")
    private String PDL_COVER_CODE;

    @Column(name = "PDL_COVER_TYPE")
    private String PDL_COVER_TYPE;

	public Long getPDL_TRAN_ID() {
		return PDL_TRAN_ID;
	}

	public void setPDL_TRAN_ID(Long pDL_TRAN_ID) {
		PDL_TRAN_ID = pDL_TRAN_ID;
	}

	public Long getPDL_POL_TRAN_ID() {
		return PDL_POL_TRAN_ID;
	}

	public void setPDL_POL_TRAN_ID(Long pDL_POL_TRAN_ID) {
		PDL_POL_TRAN_ID = pDL_POL_TRAN_ID;
	}

	public Long getPDL_PEMP_TRAN_ID() {
		return PDL_PEMP_TRAN_ID;
	}

	public void setPDL_PEMP_TRAN_ID(Long pDL_PEMP_TRAN_ID) {
		PDL_PEMP_TRAN_ID = pDL_PEMP_TRAN_ID;
	}

	public Long getPDL_PEC_TRAN_ID() {
		return PDL_PEC_TRAN_ID;
	}

	public void setPDL_PEC_TRAN_ID(Long pDL_PEC_TRAN_ID) {
		PDL_PEC_TRAN_ID = pDL_PEC_TRAN_ID;
	}

	public Integer getPDL_SRNO() {
		return PDL_SRNO;
	}

	public void setPDL_SRNO(Integer pDL_SRNO) {
		PDL_SRNO = pDL_SRNO;
	}

	public String getPDL_APPLY_LEVEL() {
		return PDL_APPLY_LEVEL;
	}

	public void setPDL_APPLY_LEVEL(String pDL_APPLY_LEVEL) {
		PDL_APPLY_LEVEL = pDL_APPLY_LEVEL;
	}

	public String getPDL_DISC_LOAD_TYPE() {
		return PDL_DISC_LOAD_TYPE;
	}

	public void setPDL_DISC_LOAD_TYPE(String pDL_DISC_LOAD_TYPE) {
		PDL_DISC_LOAD_TYPE = pDL_DISC_LOAD_TYPE;
	}

	public String getPDL_DISC_LOAD_CODE() {
		return PDL_DISC_LOAD_CODE;
	}

	public void setPDL_DISC_LOAD_CODE(String pDL_DISC_LOAD_CODE) {
		PDL_DISC_LOAD_CODE = pDL_DISC_LOAD_CODE;
	}

	public String getPDL_APPLIED_ON() {
		return PDL_APPLIED_ON;
	}

	public void setPDL_APPLIED_ON(String pDL_APPLIED_ON) {
		PDL_APPLIED_ON = pDL_APPLIED_ON;
	}

	public BigDecimal getPDL_RATE() {
		return PDL_RATE;
	}

	public void setPDL_RATE(BigDecimal pDL_RATE) {
		PDL_RATE = pDL_RATE;
	}

	public Long getPDL_RATE_PER() {
		return PDL_RATE_PER;
	}

	public void setPDL_RATE_PER(Long pDL_RATE_PER) {
		PDL_RATE_PER = pDL_RATE_PER;
	}

	public BigDecimal getPDL_FC_DISC_LOAD_VALUE() {
		return PDL_FC_DISC_LOAD_VALUE;
	}

	public void setPDL_FC_DISC_LOAD_VALUE(BigDecimal pDL_FC_DISC_LOAD_VALUE) {
		PDL_FC_DISC_LOAD_VALUE = pDL_FC_DISC_LOAD_VALUE;
	}

	public BigDecimal getPDL_LC_DISC_LOAD_VALUE() {
		return PDL_LC_DISC_LOAD_VALUE;
	}

	public void setPDL_LC_DISC_LOAD_VALUE(BigDecimal pDL_LC_DISC_LOAD_VALUE) {
		PDL_LC_DISC_LOAD_VALUE = pDL_LC_DISC_LOAD_VALUE;
	}

	public Integer getPDL_APPLY_UPTO_SRNO() {
		return PDL_APPLY_UPTO_SRNO;
	}

	public void setPDL_APPLY_UPTO_SRNO(Integer pDL_APPLY_UPTO_SRNO) {
		PDL_APPLY_UPTO_SRNO = pDL_APPLY_UPTO_SRNO;
	}

	public BigDecimal getPDL_ORG_FC_DISC_LOAD_VALUE() {
		return PDL_ORG_FC_DISC_LOAD_VALUE;
	}

	public void setPDL_ORG_FC_DISC_LOAD_VALUE(BigDecimal pDL_ORG_FC_DISC_LOAD_VALUE) {
		PDL_ORG_FC_DISC_LOAD_VALUE = pDL_ORG_FC_DISC_LOAD_VALUE;
	}

	public BigDecimal getPDL_ORG_LC_DISC_LOAD_VALUE() {
		return PDL_ORG_LC_DISC_LOAD_VALUE;
	}

	public void setPDL_ORG_LC_DISC_LOAD_VALUE(BigDecimal pDL_ORG_LC_DISC_LOAD_VALUE) {
		PDL_ORG_LC_DISC_LOAD_VALUE = pDL_ORG_LC_DISC_LOAD_VALUE;
	}

	public String getPDL_DEL_FLAG() {
		return PDL_DEL_FLAG;
	}

	public void setPDL_DEL_FLAG(String pDL_DEL_FLAG) {
		PDL_DEL_FLAG = pDL_DEL_FLAG;
	}

	public Date getPDL_INS_DT() {
		return PDL_INS_DT;
	}

	public void setPDL_INS_DT(Date pDL_INS_DT) {
		PDL_INS_DT = pDL_INS_DT;
	}

	public String getPDL_INS_ID() {
		return PDL_INS_ID;
	}

	public void setPDL_INS_ID(String pDL_INS_ID) {
		PDL_INS_ID = pDL_INS_ID;
	}

	public Date getPDL_MOD_DT() {
		return PDL_MOD_DT;
	}

	public void setPDL_MOD_DT(Date pDL_MOD_DT) {
		PDL_MOD_DT = pDL_MOD_DT;
	}

	public String getPDL_MOD_ID() {
		return PDL_MOD_ID;
	}

	public void setPDL_MOD_ID(String pDL_MOD_ID) {
		PDL_MOD_ID = pDL_MOD_ID;
	}

	public BigDecimal getPDL_TTY_RATE() {
		return PDL_TTY_RATE;
	}

	public void setPDL_TTY_RATE(BigDecimal pDL_TTY_RATE) {
		PDL_TTY_RATE = pDL_TTY_RATE;
	}

	public BigDecimal getPDL_FC_CL_AMT() {
		return PDL_FC_CL_AMT;
	}

	public void setPDL_FC_CL_AMT(BigDecimal pDL_FC_CL_AMT) {
		PDL_FC_CL_AMT = pDL_FC_CL_AMT;
	}

	public BigDecimal getPDL_LC_CL_AMT() {
		return PDL_LC_CL_AMT;
	}

	public void setPDL_LC_CL_AMT(BigDecimal pDL_LC_CL_AMT) {
		PDL_LC_CL_AMT = pDL_LC_CL_AMT;
	}

	public BigDecimal getPDL_FC_TTY_AMT() {
		return PDL_FC_TTY_AMT;
	}

	public void setPDL_FC_TTY_AMT(BigDecimal pDL_FC_TTY_AMT) {
		PDL_FC_TTY_AMT = pDL_FC_TTY_AMT;
	}

	public BigDecimal getPDL_LC_TTY_AMT() {
		return PDL_LC_TTY_AMT;
	}

	public void setPDL_LC_TTY_AMT(BigDecimal pDL_LC_TTY_AMT) {
		PDL_LC_TTY_AMT = pDL_LC_TTY_AMT;
	}

	public BigDecimal getPDL_ORG_FC_CL_AMT() {
		return PDL_ORG_FC_CL_AMT;
	}

	public void setPDL_ORG_FC_CL_AMT(BigDecimal pDL_ORG_FC_CL_AMT) {
		PDL_ORG_FC_CL_AMT = pDL_ORG_FC_CL_AMT;
	}

	public BigDecimal getPDL_ORG_LC_CL_AMT() {
		return PDL_ORG_LC_CL_AMT;
	}

	public void setPDL_ORG_LC_CL_AMT(BigDecimal pDL_ORG_LC_CL_AMT) {
		PDL_ORG_LC_CL_AMT = pDL_ORG_LC_CL_AMT;
	}

	public BigDecimal getPDL_ORG_FC_TTY_AMT() {
		return PDL_ORG_FC_TTY_AMT;
	}

	public void setPDL_ORG_FC_TTY_AMT(BigDecimal pDL_ORG_FC_TTY_AMT) {
		PDL_ORG_FC_TTY_AMT = pDL_ORG_FC_TTY_AMT;
	}

	public BigDecimal getPDL_ORG_LC_TTY_AMT() {
		return PDL_ORG_LC_TTY_AMT;
	}

	public void setPDL_ORG_LC_TTY_AMT(BigDecimal pDL_ORG_LC_TTY_AMT) {
		PDL_ORG_LC_TTY_AMT = pDL_ORG_LC_TTY_AMT;
	}

	public String getPDL_REC_TYPE() {
		return PDL_REC_TYPE;
	}

	public void setPDL_REC_TYPE(String pDL_REC_TYPE) {
		PDL_REC_TYPE = pDL_REC_TYPE;
	}

	public BigDecimal getPDL_FC_RET_AMT() {
		return PDL_FC_RET_AMT;
	}

	public void setPDL_FC_RET_AMT(BigDecimal pDL_FC_RET_AMT) {
		PDL_FC_RET_AMT = pDL_FC_RET_AMT;
	}

	public BigDecimal getPDL_LC_RET_AMT() {
		return PDL_LC_RET_AMT;
	}

	public void setPDL_LC_RET_AMT(BigDecimal pDL_LC_RET_AMT) {
		PDL_LC_RET_AMT = pDL_LC_RET_AMT;
	}

	public BigDecimal getPDL_FC_RI_AMT() {
		return PDL_FC_RI_AMT;
	}

	public void setPDL_FC_RI_AMT(BigDecimal pDL_FC_RI_AMT) {
		PDL_FC_RI_AMT = pDL_FC_RI_AMT;
	}

	public BigDecimal getPDL_LC_RI_AMT() {
		return PDL_LC_RI_AMT;
	}

	public void setPDL_LC_RI_AMT(BigDecimal pDL_LC_RI_AMT) {
		PDL_LC_RI_AMT = pDL_LC_RI_AMT;
	}

	public BigDecimal getPDL_ORG_FC_RET_AMT() {
		return PDL_ORG_FC_RET_AMT;
	}

	public void setPDL_ORG_FC_RET_AMT(BigDecimal pDL_ORG_FC_RET_AMT) {
		PDL_ORG_FC_RET_AMT = pDL_ORG_FC_RET_AMT;
	}

	public BigDecimal getPDL_ORG_LC_RET_AMT() {
		return PDL_ORG_LC_RET_AMT;
	}

	public void setPDL_ORG_LC_RET_AMT(BigDecimal pDL_ORG_LC_RET_AMT) {
		PDL_ORG_LC_RET_AMT = pDL_ORG_LC_RET_AMT;
	}

	public BigDecimal getPDL_ORG_FC_RI_AMT() {
		return PDL_ORG_FC_RI_AMT;
	}

	public void setPDL_ORG_FC_RI_AMT(BigDecimal pDL_ORG_FC_RI_AMT) {
		PDL_ORG_FC_RI_AMT = pDL_ORG_FC_RI_AMT;
	}

	public BigDecimal getPDL_ORG_LC_RI_AMT() {
		return PDL_ORG_LC_RI_AMT;
	}

	public void setPDL_ORG_LC_RI_AMT(BigDecimal pDL_ORG_LC_RI_AMT) {
		PDL_ORG_LC_RI_AMT = pDL_ORG_LC_RI_AMT;
	}

	public String getPDL_REMARKS() {
		return PDL_REMARKS;
	}

	public void setPDL_REMARKS(String pDL_REMARKS) {
		PDL_REMARKS = pDL_REMARKS;
	}

	public String getPDL_PRORATE_COLL_YN() {
		return PDL_PRORATE_COLL_YN;
	}

	public void setPDL_PRORATE_COLL_YN(String pDL_PRORATE_COLL_YN) {
		PDL_PRORATE_COLL_YN = pDL_PRORATE_COLL_YN;
	}

	public String getPDL_PRORATE_REFN_YN() {
		return PDL_PRORATE_REFN_YN;
	}

	public void setPDL_PRORATE_REFN_YN(String pDL_PRORATE_REFN_YN) {
		PDL_PRORATE_REFN_YN = pDL_PRORATE_REFN_YN;
	}

	public String getPDL_DISC_LOAD_CALC_ON() {
		return PDL_DISC_LOAD_CALC_ON;
	}

	public void setPDL_DISC_LOAD_CALC_ON(String pDL_DISC_LOAD_CALC_ON) {
		PDL_DISC_LOAD_CALC_ON = pDL_DISC_LOAD_CALC_ON;
	}

	public String getPDL_COVER_CODE() {
		return PDL_COVER_CODE;
	}

	public void setPDL_COVER_CODE(String pDL_COVER_CODE) {
		PDL_COVER_CODE = pDL_COVER_CODE;
	}

	public String getPDL_COVER_TYPE() {
		return PDL_COVER_TYPE;
	}

	public void setPDL_COVER_TYPE(String pDL_COVER_TYPE) {
		PDL_COVER_TYPE = pDL_COVER_TYPE;
	}

}
