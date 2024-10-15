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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "LT_RI_PREM_ALLOC_DTL")
public class LT_RI_PREM_ALLOC_DTL {

    @Id
    @SequenceGenerator(name = "premAllocDtlSequence", sequenceName = "RPAD_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "premAllocDtlSequence")
    @Column(name = "RPAD_TRAN_ID")
    private Integer RPAD_TRAN_ID;

    @Column(name = "RPAD_RPAH_TRAN_ID")
    private Integer RPAD_RPAH_TRAN_ID;

    @Column(name = "RPAD_SRNO")
    private Integer RPAD_SRNO;

    @Column(name = "RPAD_TREATY_TYPE")
    private String RPAD_TREATY_TYPE;

    @Column(name = "RPAD_FC_RETN_SA")
    private BigDecimal RPAD_FC_RETN_SA;

    @Column(name = "RPAD_FC_RETN_PREM")
    private BigDecimal RPAD_FC_RETN_PREM;

    @Column(name = "RPAD_FC_RI_SA")
    private BigDecimal RPAD_FC_RI_SA;

    @Column(name = "RPAD_FC_RI_PREM")
    private BigDecimal RPAD_FC_RI_PREM;

    @Column(name = "RPAD_RI_COMM_PERC")
    private BigDecimal RPAD_RI_COMM_PERC;

    @Column(name = "RPAD_FC_RI_COMM")
    private BigDecimal RPAD_FC_RI_COMM;

    @Column(name = "RPAD_FC_EXTRA_PREM")
    private BigDecimal RPAD_FC_EXTRA_PREM;

    @Column(name = "RPAD_RI_CLOSE_FLAG")
    private String RPAD_RI_CLOSE_FLAG;

    @Column(name = "RPAD_INS_DT")
    @Temporal(TemporalType.DATE)
    private Date RPAD_INS_DT;

    @Column(name = "RPAD_INS_ID")
    private String RPAD_INS_ID;

    @Column(name = "RPAD_MOD_DT")
    @Temporal(TemporalType.DATE)
    private Date RPAD_MOD_DT;

    @Column(name = "RPAD_MOD_ID")
    private String RPAD_MOD_ID;

    @Column(name = "RPAD_COVER_TYPE")
    private String RPAD_COVER_TYPE;

	public Integer getRPAD_TRAN_ID() {
		return RPAD_TRAN_ID;
	}

	public void setRPAD_TRAN_ID(Integer rPAD_TRAN_ID) {
		RPAD_TRAN_ID = rPAD_TRAN_ID;
	}

	public Integer getRPAD_RPAH_TRAN_ID() {
		return RPAD_RPAH_TRAN_ID;
	}

	public void setRPAD_RPAH_TRAN_ID(Integer rPAD_RPAH_TRAN_ID) {
		RPAD_RPAH_TRAN_ID = rPAD_RPAH_TRAN_ID;
	}

	public Integer getRPAD_SRNO() {
		return RPAD_SRNO;
	}

	public void setRPAD_SRNO(Integer rPAD_SRNO) {
		RPAD_SRNO = rPAD_SRNO;
	}

	public String getRPAD_TREATY_TYPE() {
		return RPAD_TREATY_TYPE;
	}

	public void setRPAD_TREATY_TYPE(String rPAD_TREATY_TYPE) {
		RPAD_TREATY_TYPE = rPAD_TREATY_TYPE;
	}

	public BigDecimal getRPAD_FC_RETN_SA() {
		return RPAD_FC_RETN_SA;
	}

	public void setRPAD_FC_RETN_SA(BigDecimal rPAD_FC_RETN_SA) {
		RPAD_FC_RETN_SA = rPAD_FC_RETN_SA;
	}

	public BigDecimal getRPAD_FC_RETN_PREM() {
		return RPAD_FC_RETN_PREM;
	}

	public void setRPAD_FC_RETN_PREM(BigDecimal rPAD_FC_RETN_PREM) {
		RPAD_FC_RETN_PREM = rPAD_FC_RETN_PREM;
	}

	public BigDecimal getRPAD_FC_RI_SA() {
		return RPAD_FC_RI_SA;
	}

	public void setRPAD_FC_RI_SA(BigDecimal rPAD_FC_RI_SA) {
		RPAD_FC_RI_SA = rPAD_FC_RI_SA;
	}

	public BigDecimal getRPAD_FC_RI_PREM() {
		return RPAD_FC_RI_PREM;
	}

	public void setRPAD_FC_RI_PREM(BigDecimal rPAD_FC_RI_PREM) {
		RPAD_FC_RI_PREM = rPAD_FC_RI_PREM;
	}

	public BigDecimal getRPAD_RI_COMM_PERC() {
		return RPAD_RI_COMM_PERC;
	}

	public void setRPAD_RI_COMM_PERC(BigDecimal rPAD_RI_COMM_PERC) {
		RPAD_RI_COMM_PERC = rPAD_RI_COMM_PERC;
	}

	public BigDecimal getRPAD_FC_RI_COMM() {
		return RPAD_FC_RI_COMM;
	}

	public void setRPAD_FC_RI_COMM(BigDecimal rPAD_FC_RI_COMM) {
		RPAD_FC_RI_COMM = rPAD_FC_RI_COMM;
	}

	public BigDecimal getRPAD_FC_EXTRA_PREM() {
		return RPAD_FC_EXTRA_PREM;
	}

	public void setRPAD_FC_EXTRA_PREM(BigDecimal rPAD_FC_EXTRA_PREM) {
		RPAD_FC_EXTRA_PREM = rPAD_FC_EXTRA_PREM;
	}

	public String getRPAD_RI_CLOSE_FLAG() {
		return RPAD_RI_CLOSE_FLAG;
	}

	public void setRPAD_RI_CLOSE_FLAG(String rPAD_RI_CLOSE_FLAG) {
		RPAD_RI_CLOSE_FLAG = rPAD_RI_CLOSE_FLAG;
	}

	public Date getRPAD_INS_DT() {
		return RPAD_INS_DT;
	}

	public void setRPAD_INS_DT(Date rPAD_INS_DT) {
		RPAD_INS_DT = rPAD_INS_DT;
	}

	public String getRPAD_INS_ID() {
		return RPAD_INS_ID;
	}

	public void setRPAD_INS_ID(String rPAD_INS_ID) {
		RPAD_INS_ID = rPAD_INS_ID;
	}

	public Date getRPAD_MOD_DT() {
		return RPAD_MOD_DT;
	}

	public void setRPAD_MOD_DT(Date rPAD_MOD_DT) {
		RPAD_MOD_DT = rPAD_MOD_DT;
	}

	public String getRPAD_MOD_ID() {
		return RPAD_MOD_ID;
	}

	public void setRPAD_MOD_ID(String rPAD_MOD_ID) {
		RPAD_MOD_ID = rPAD_MOD_ID;
	}

	public String getRPAD_COVER_TYPE() {
		return RPAD_COVER_TYPE;
	}

	public void setRPAD_COVER_TYPE(String rPAD_COVER_TYPE) {
		RPAD_COVER_TYPE = rPAD_COVER_TYPE;
	}

}
