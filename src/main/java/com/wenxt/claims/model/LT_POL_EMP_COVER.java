package com.wenxt.claims.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_POL_EMP_COVER", schema = "LIFE_DEV")
public class LT_POL_EMP_COVER {

    @Id
    @SequenceGenerator(name = "PolEmpCoverTranIDSeq", sequenceName = "PEC_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PolEmpCoverTranIDSeq")
    @Column(name = "PEC_TRAN_ID")
    private Long PEC_TRAN_ID;

    @Column(name = "PEC_POL_TRAN_ID")
    private Integer PEC_POL_TRAN_ID;

    @Column(name = "PEC_PEMP_TRAN_ID")
    private Integer PEC_PEMP_TRAN_ID;

    @Column(name = "PEC_COVER_CODE")
    private String PEC_COVER_CODE;

    @Column(name = "PEC_FC_SA")
    private Double PEC_FC_SA;

    @Column(name = "PEC_LC_SA")
    private Double PEC_LC_SA;

    @Column(name = "PEC_RATE")
    private Double PEC_RATE;

    @Column(name = "PEC_RATE_PER")
    private Long PEC_RATE_PER;

    @Column(name = "PEC_FC_PREM")
    private Double PEC_FC_PREM;

    @Column(name = "PEC_LC_PREM")
    private Double PEC_LC_PREM;

    @Column(name = "PEC_ORG_FC_SA")
    private Double PEC_ORG_FC_SA;

    @Column(name = "PEC_ORG_LC_SA")
    private Double PEC_ORG_LC_SA;

    @Column(name = "PEC_ORG_FC_PREM")
    private Double PEC_ORG_FC_PREM;

    @Column(name = "PEC_ORG_LC_PREM")
    private Double PEC_ORG_LC_PREM;

    @Column(name = "PEC_DEL_FLAG")
    private String PEC_DEL_FLAG;

    @Column(name = "PEC_INS_DT")
    private Date PEC_INS_DT;

    @Column(name = "PEC_INS_ID")
    private String PEC_INS_ID;

    @Column(name = "PEC_MOD_DT")
    private Date PEC_MOD_DT;

    @Column(name = "PEC_MOD_ID")
    private String PEC_MOD_ID;

    @Column(name = "PEC_FC_CL_PREM")
    private Double PEC_FC_CL_PREM;

    @Column(name = "PEC_LC_CL_PREM")
    private Double PEC_LC_CL_PREM;

    @Column(name = "PEC_FC_TTY_PREM")
    private Double PEC_FC_TTY_PREM;

    @Column(name = "PEC_LC_TTY_PREM")
    private Double PEC_LC_TTY_PREM;

    @Column(name = "PEC_ORG_FC_CL_PREM")
    private Double PEC_ORG_FC_CL_PREM;

    @Column(name = "PEC_ORG_LC_CL_PREM")
    private Double PEC_ORG_LC_CL_PREM;

    @Column(name = "PEC_ORG_FC_TTY_PREM")
    private Double PEC_ORG_FC_TTY_PREM;

    @Column(name = "PEC_ORG_LC_TTY_PREM")
    private Double PEC_ORG_LC_TTY_PREM;

    @Column(name = "PEC_REC_TYPE")
    private String PEC_REC_TYPE;

    @Column(name = "PEC_FC_RET_PREM")
    private Double PEC_FC_RET_PREM;

    @Column(name = "PEC_LC_RET_PREM")
    private Double PEC_LC_RET_PREM;

    @Column(name = "PEC_FC_RI_PREM")
    private Double PEC_FC_RI_PREM;

    @Column(name = "PEC_LC_RI_PREM")
    private Double PEC_LC_RI_PREM;

    @Column(name = "PEC_LC_ACTUAL_SA")
    private Double PEC_LC_ACTUAL_SA;

    @Column(name = "PEC_FC_ACTUAL_SA")
    private Double PEC_FC_ACTUAL_SA;

    @Column(name = "PEC_ORG_FC_RET_PREM")
    private Double PEC_ORG_FC_RET_PREM;

    @Column(name = "PEC_ORG_LC_RET_PREM")
    private Double PEC_ORG_LC_RET_PREM;

    @Column(name = "PEC_ORG_FC_RI_PREM")
    private Double PEC_ORG_FC_RI_PREM;

    @Column(name = "PEC_ORG_LC_RI_PREM")
    private Double PEC_ORG_LC_RI_PREM;

    @Column(name = "PEC_ORG_LC_ACTUAL_SA")
    private Double PEC_ORG_LC_ACTUAL_SA;

    @Column(name = "PEC_ORG_FC_ACTUAL_SA")
    private Double PEC_ORG_FC_ACTUAL_SA;

    @Column(name = "PEC_EFF_FM_DT")
    private Date PEC_EFF_FM_DT;

    @Column(name = "PEC_EFF_TO_DT")
    private Date PEC_EFF_TO_DT;

    @Column(name = "PEC_CVR_LINK_TRAN_ID")
    private Long PEC_CVR_LINK_TRAN_ID;

    @Column(name = "PEC_CVRSA_UPD_YN")
    private String PEC_CVRSA_UPD_YN;

    @Column(name = "PEC_CLM_APPL_YN")
    private String PEC_CLM_APPL_YN;

    @Column(name = "PEC_REF_PEMP_TRAN_ID")
    private Long PEC_REF_PEMP_TRAN_ID;

    @Column(name = "PEC_LC_COVER_FCL")
    private Double PEC_LC_COVER_FCL;

    @Column(name = "PEC_FC_COVER_FCL")
    private Double PEC_FC_COVER_FCL;

    @Column(name = "PEC_MEDI_EXAM")
    private String PEC_MEDI_EXAM;

    @Column(name = "PEC_PPD_DEPN_APPL_YN")
    private String PEC_PPD_DEPN_APPL_YN;

	public Long getPEC_TRAN_ID() {
		return PEC_TRAN_ID;
	}

	public void setPEC_TRAN_ID(Long pEC_TRAN_ID) {
		PEC_TRAN_ID = pEC_TRAN_ID;
	}

	public Integer getPEC_POL_TRAN_ID() {
		return PEC_POL_TRAN_ID;
	}

	public void setPEC_POL_TRAN_ID(Integer pEC_POL_TRAN_ID) {
		PEC_POL_TRAN_ID = pEC_POL_TRAN_ID;
	}

	public Integer getPEC_PEMP_TRAN_ID() {
		return PEC_PEMP_TRAN_ID;
	}

	public void setPEC_PEMP_TRAN_ID(Integer pEC_PEMP_TRAN_ID) {
		PEC_PEMP_TRAN_ID = pEC_PEMP_TRAN_ID;
	}

	public String getPEC_COVER_CODE() {
		return PEC_COVER_CODE;
	}

	public void setPEC_COVER_CODE(String pEC_COVER_CODE) {
		PEC_COVER_CODE = pEC_COVER_CODE;
	}

	public Double getPEC_FC_SA() {
		return PEC_FC_SA;
	}

	public void setPEC_FC_SA(Double pEC_FC_SA) {
		PEC_FC_SA = pEC_FC_SA;
	}

	public Double getPEC_LC_SA() {
		return PEC_LC_SA;
	}

	public void setPEC_LC_SA(Double pEC_LC_SA) {
		PEC_LC_SA = pEC_LC_SA;
	}

	public Double getPEC_RATE() {
		return PEC_RATE;
	}

	public void setPEC_RATE(Double pEC_RATE) {
		PEC_RATE = pEC_RATE;
	}

	public Long getPEC_RATE_PER() {
		return PEC_RATE_PER;
	}

	public void setPEC_RATE_PER(Long pEC_RATE_PER) {
		PEC_RATE_PER = pEC_RATE_PER;
	}

	public Double getPEC_FC_PREM() {
		return PEC_FC_PREM;
	}

	public void setPEC_FC_PREM(Double pEC_FC_PREM) {
		PEC_FC_PREM = pEC_FC_PREM;
	}

	public Double getPEC_LC_PREM() {
		return PEC_LC_PREM;
	}

	public void setPEC_LC_PREM(Double pEC_LC_PREM) {
		PEC_LC_PREM = pEC_LC_PREM;
	}

	public Double getPEC_ORG_FC_SA() {
		return PEC_ORG_FC_SA;
	}

	public void setPEC_ORG_FC_SA(Double pEC_ORG_FC_SA) {
		PEC_ORG_FC_SA = pEC_ORG_FC_SA;
	}

	public Double getPEC_ORG_LC_SA() {
		return PEC_ORG_LC_SA;
	}

	public void setPEC_ORG_LC_SA(Double pEC_ORG_LC_SA) {
		PEC_ORG_LC_SA = pEC_ORG_LC_SA;
	}

	public Double getPEC_ORG_FC_PREM() {
		return PEC_ORG_FC_PREM;
	}

	public void setPEC_ORG_FC_PREM(Double pEC_ORG_FC_PREM) {
		PEC_ORG_FC_PREM = pEC_ORG_FC_PREM;
	}

	public Double getPEC_ORG_LC_PREM() {
		return PEC_ORG_LC_PREM;
	}

	public void setPEC_ORG_LC_PREM(Double pEC_ORG_LC_PREM) {
		PEC_ORG_LC_PREM = pEC_ORG_LC_PREM;
	}

	public String getPEC_DEL_FLAG() {
		return PEC_DEL_FLAG;
	}

	public void setPEC_DEL_FLAG(String pEC_DEL_FLAG) {
		PEC_DEL_FLAG = pEC_DEL_FLAG;
	}

	public Date getPEC_INS_DT() {
		return PEC_INS_DT;
	}

	public void setPEC_INS_DT(Date pEC_INS_DT) {
		PEC_INS_DT = pEC_INS_DT;
	}

	public String getPEC_INS_ID() {
		return PEC_INS_ID;
	}

	public void setPEC_INS_ID(String pEC_INS_ID) {
		PEC_INS_ID = pEC_INS_ID;
	}

	public Date getPEC_MOD_DT() {
		return PEC_MOD_DT;
	}

	public void setPEC_MOD_DT(Date pEC_MOD_DT) {
		PEC_MOD_DT = pEC_MOD_DT;
	}

	public String getPEC_MOD_ID() {
		return PEC_MOD_ID;
	}

	public void setPEC_MOD_ID(String pEC_MOD_ID) {
		PEC_MOD_ID = pEC_MOD_ID;
	}

	public Double getPEC_FC_CL_PREM() {
		return PEC_FC_CL_PREM;
	}

	public void setPEC_FC_CL_PREM(Double pEC_FC_CL_PREM) {
		PEC_FC_CL_PREM = pEC_FC_CL_PREM;
	}

	public Double getPEC_LC_CL_PREM() {
		return PEC_LC_CL_PREM;
	}

	public void setPEC_LC_CL_PREM(Double pEC_LC_CL_PREM) {
		PEC_LC_CL_PREM = pEC_LC_CL_PREM;
	}

	public Double getPEC_FC_TTY_PREM() {
		return PEC_FC_TTY_PREM;
	}

	public void setPEC_FC_TTY_PREM(Double pEC_FC_TTY_PREM) {
		PEC_FC_TTY_PREM = pEC_FC_TTY_PREM;
	}

	public Double getPEC_LC_TTY_PREM() {
		return PEC_LC_TTY_PREM;
	}

	public void setPEC_LC_TTY_PREM(Double pEC_LC_TTY_PREM) {
		PEC_LC_TTY_PREM = pEC_LC_TTY_PREM;
	}

	public Double getPEC_ORG_FC_CL_PREM() {
		return PEC_ORG_FC_CL_PREM;
	}

	public void setPEC_ORG_FC_CL_PREM(Double pEC_ORG_FC_CL_PREM) {
		PEC_ORG_FC_CL_PREM = pEC_ORG_FC_CL_PREM;
	}

	public Double getPEC_ORG_LC_CL_PREM() {
		return PEC_ORG_LC_CL_PREM;
	}

	public void setPEC_ORG_LC_CL_PREM(Double pEC_ORG_LC_CL_PREM) {
		PEC_ORG_LC_CL_PREM = pEC_ORG_LC_CL_PREM;
	}

	public Double getPEC_ORG_FC_TTY_PREM() {
		return PEC_ORG_FC_TTY_PREM;
	}

	public void setPEC_ORG_FC_TTY_PREM(Double pEC_ORG_FC_TTY_PREM) {
		PEC_ORG_FC_TTY_PREM = pEC_ORG_FC_TTY_PREM;
	}

	public Double getPEC_ORG_LC_TTY_PREM() {
		return PEC_ORG_LC_TTY_PREM;
	}

	public void setPEC_ORG_LC_TTY_PREM(Double pEC_ORG_LC_TTY_PREM) {
		PEC_ORG_LC_TTY_PREM = pEC_ORG_LC_TTY_PREM;
	}

	public String getPEC_REC_TYPE() {
		return PEC_REC_TYPE;
	}

	public void setPEC_REC_TYPE(String pEC_REC_TYPE) {
		PEC_REC_TYPE = pEC_REC_TYPE;
	}

	public Double getPEC_FC_RET_PREM() {
		return PEC_FC_RET_PREM;
	}

	public void setPEC_FC_RET_PREM(Double pEC_FC_RET_PREM) {
		PEC_FC_RET_PREM = pEC_FC_RET_PREM;
	}

	public Double getPEC_LC_RET_PREM() {
		return PEC_LC_RET_PREM;
	}

	public void setPEC_LC_RET_PREM(Double pEC_LC_RET_PREM) {
		PEC_LC_RET_PREM = pEC_LC_RET_PREM;
	}

	public Double getPEC_FC_RI_PREM() {
		return PEC_FC_RI_PREM;
	}

	public void setPEC_FC_RI_PREM(Double pEC_FC_RI_PREM) {
		PEC_FC_RI_PREM = pEC_FC_RI_PREM;
	}

	public Double getPEC_LC_RI_PREM() {
		return PEC_LC_RI_PREM;
	}

	public void setPEC_LC_RI_PREM(Double pEC_LC_RI_PREM) {
		PEC_LC_RI_PREM = pEC_LC_RI_PREM;
	}

	public Double getPEC_LC_ACTUAL_SA() {
		return PEC_LC_ACTUAL_SA;
	}

	public void setPEC_LC_ACTUAL_SA(Double pEC_LC_ACTUAL_SA) {
		PEC_LC_ACTUAL_SA = pEC_LC_ACTUAL_SA;
	}

	public Double getPEC_FC_ACTUAL_SA() {
		return PEC_FC_ACTUAL_SA;
	}

	public void setPEC_FC_ACTUAL_SA(Double pEC_FC_ACTUAL_SA) {
		PEC_FC_ACTUAL_SA = pEC_FC_ACTUAL_SA;
	}

	public Double getPEC_ORG_FC_RET_PREM() {
		return PEC_ORG_FC_RET_PREM;
	}

	public void setPEC_ORG_FC_RET_PREM(Double pEC_ORG_FC_RET_PREM) {
		PEC_ORG_FC_RET_PREM = pEC_ORG_FC_RET_PREM;
	}

	public Double getPEC_ORG_LC_RET_PREM() {
		return PEC_ORG_LC_RET_PREM;
	}

	public void setPEC_ORG_LC_RET_PREM(Double pEC_ORG_LC_RET_PREM) {
		PEC_ORG_LC_RET_PREM = pEC_ORG_LC_RET_PREM;
	}

	public Double getPEC_ORG_FC_RI_PREM() {
		return PEC_ORG_FC_RI_PREM;
	}

	public void setPEC_ORG_FC_RI_PREM(Double pEC_ORG_FC_RI_PREM) {
		PEC_ORG_FC_RI_PREM = pEC_ORG_FC_RI_PREM;
	}

	public Double getPEC_ORG_LC_RI_PREM() {
		return PEC_ORG_LC_RI_PREM;
	}

	public void setPEC_ORG_LC_RI_PREM(Double pEC_ORG_LC_RI_PREM) {
		PEC_ORG_LC_RI_PREM = pEC_ORG_LC_RI_PREM;
	}

	public Double getPEC_ORG_LC_ACTUAL_SA() {
		return PEC_ORG_LC_ACTUAL_SA;
	}

	public void setPEC_ORG_LC_ACTUAL_SA(Double pEC_ORG_LC_ACTUAL_SA) {
		PEC_ORG_LC_ACTUAL_SA = pEC_ORG_LC_ACTUAL_SA;
	}

	public Double getPEC_ORG_FC_ACTUAL_SA() {
		return PEC_ORG_FC_ACTUAL_SA;
	}

	public void setPEC_ORG_FC_ACTUAL_SA(Double pEC_ORG_FC_ACTUAL_SA) {
		PEC_ORG_FC_ACTUAL_SA = pEC_ORG_FC_ACTUAL_SA;
	}

	public Date getPEC_EFF_FM_DT() {
		return PEC_EFF_FM_DT;
	}

	public void setPEC_EFF_FM_DT(Date pEC_EFF_FM_DT) {
		PEC_EFF_FM_DT = pEC_EFF_FM_DT;
	}

	public Date getPEC_EFF_TO_DT() {
		return PEC_EFF_TO_DT;
	}

	public void setPEC_EFF_TO_DT(Date pEC_EFF_TO_DT) {
		PEC_EFF_TO_DT = pEC_EFF_TO_DT;
	}

	public Long getPEC_CVR_LINK_TRAN_ID() {
		return PEC_CVR_LINK_TRAN_ID;
	}

	public void setPEC_CVR_LINK_TRAN_ID(Long pEC_CVR_LINK_TRAN_ID) {
		PEC_CVR_LINK_TRAN_ID = pEC_CVR_LINK_TRAN_ID;
	}

	public String getPEC_CVRSA_UPD_YN() {
		return PEC_CVRSA_UPD_YN;
	}

	public void setPEC_CVRSA_UPD_YN(String pEC_CVRSA_UPD_YN) {
		PEC_CVRSA_UPD_YN = pEC_CVRSA_UPD_YN;
	}

	public String getPEC_CLM_APPL_YN() {
		return PEC_CLM_APPL_YN;
	}

	public void setPEC_CLM_APPL_YN(String pEC_CLM_APPL_YN) {
		PEC_CLM_APPL_YN = pEC_CLM_APPL_YN;
	}

	public Long getPEC_REF_PEMP_TRAN_ID() {
		return PEC_REF_PEMP_TRAN_ID;
	}

	public void setPEC_REF_PEMP_TRAN_ID(Long pEC_REF_PEMP_TRAN_ID) {
		PEC_REF_PEMP_TRAN_ID = pEC_REF_PEMP_TRAN_ID;
	}

	public Double getPEC_LC_COVER_FCL() {
		return PEC_LC_COVER_FCL;
	}

	public void setPEC_LC_COVER_FCL(Double pEC_LC_COVER_FCL) {
		PEC_LC_COVER_FCL = pEC_LC_COVER_FCL;
	}

	public Double getPEC_FC_COVER_FCL() {
		return PEC_FC_COVER_FCL;
	}

	public void setPEC_FC_COVER_FCL(Double pEC_FC_COVER_FCL) {
		PEC_FC_COVER_FCL = pEC_FC_COVER_FCL;
	}

	public String getPEC_MEDI_EXAM() {
		return PEC_MEDI_EXAM;
	}

	public void setPEC_MEDI_EXAM(String pEC_MEDI_EXAM) {
		PEC_MEDI_EXAM = pEC_MEDI_EXAM;
	}

	public String getPEC_PPD_DEPN_APPL_YN() {
		return PEC_PPD_DEPN_APPL_YN;
	}

	public void setPEC_PPD_DEPN_APPL_YN(String pEC_PPD_DEPN_APPL_YN) {
		PEC_PPD_DEPN_APPL_YN = pEC_PPD_DEPN_APPL_YN;
	}

}
