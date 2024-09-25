package com.wenxt.claims.model.Endorsement;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_ENDT_REQ_BENF")
public class LT_ENDT_REQ_BENF {

    @Id
    @SequenceGenerator(name = "EndorsementBeneficiarySeq", sequenceName = "PGBEN_ENDT_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EndorsementBeneficiarySeq")
    @Column(name = "PGBEN_TRAN_ID")
    private Integer PGBEN_TRAN_ID;

    @Column(name = "PGBEN_POL_TRAN_ID")
    @JsonProperty("PGBEN_POL_TRAN_ID")
    private Long PGBEN_POL_TRAN_ID;

    @Column(name = "PGBEN_PEMP_TRAN_ID")
    @JsonProperty("PGBEN_PEMP_TRAN_ID")
    private Long PGBEN_PEMP_TRAN_ID;

    @Column(name = "PGBEN_SR_NO")
    @JsonProperty("PGBEN_SR_NO")
    private Integer PGBEN_SR_NO;

    @Column(name = "PGBEN_BNF_TYPE")
    private String PGBEN_BNF_TYPE;

    @Column(name = "PGBEN_BNF_NAME")
    private String PGBEN_BNF_NAME;

    @Column(name = "PGBEN_BNF_NAME_BL")
    private String PGBEN_BNF_NAME_BL;

    @Column(name = "PGBEN_SHARE_PERC")
    private BigDecimal PGBEN_SHARE_PERC;

    @Column(name = "PGBEN_RELATION_CODE")
    private String PGBEN_RELATION_CODE;

    @Column(name = "PGBEN_ADDRESS_1")
    private String PGBEN_ADDRESS_1;

    @Column(name = "PGBEN_ADDRESS_2")
    private String PGBEN_ADDRESS_2;

    @Column(name = "PGBEN_ADDRESS_3")
    private String PGBEN_ADDRESS_3;

    @Column(name = "PGBEN_ADDRESS_4")
    private String PGBEN_ADDRESS_4;

    @Column(name = "PGBEN_ADDRESS_5")
    private String PGBEN_ADDRESS_5;

    @Column(name = "PGBEN_ADDRESS_1_BL")
    private String PGBEN_ADDRESS_1_BL;

    @Column(name = "PGBEN_ADDRESS_2_BL")
    private String PGBEN_ADDRESS_2_BL;

    @Column(name = "PGBEN_ADDRESS_3_BL")
    private String PGBEN_ADDRESS_3_BL;

    @Column(name = "PGBEN_ADDRESS_4_BL")
    private String PGBEN_ADDRESS_4_BL;

    @Column(name = "PGBEN_ADDRESS_5_BL")
    private String PGBEN_ADDRESS_5_BL;

    @Column(name = "PGBEN_REMARKS")
    private String PGBEN_REMARKS;

    @Column(name = "PGBEN_REMARKS_BL")
    private String PGBEN_REMARKS_BL;

    @Column(name = "PGBEN_INS_ID")
    private String PGBEN_INS_ID;

    @Column(name = "PGBEN_INS_DT")
    private Date PGBEN_INS_DT;

    @Column(name = "PGBEN_MOD_ID")
    private String PGBEN_MOD_ID;

    @Column(name = "PGBEN_MOD_DT")
    @JsonProperty("PGBEN_MOD_DT")
    private Date PGBEN_MOD_DT;

    @Column(name = "PGBEN_CATG_CODE")
    @JsonProperty("PGBEN_CATG_CODE")
    private String PGBEN_CATG_CODE;

    @Column(name = "PGBEN_AGE")
    @JsonProperty("PGBEN_AGE")
    private Integer PGBEN_AGE;

    @Column(name = "PGBEN_GUARDIAN_NAME")
    @JsonProperty("PGBEN_GUARDIAN_NAME")
    private String PGBEN_GUARDIAN_NAME;

    @Column(name = "PGBEN_DEL_FLAG")
    @JsonProperty("PGBEN_DEL_FLAG")
    private String PGBEN_DEL_FLAG;

    @Column(name = "PGBEN_REF_ID1")
    @JsonProperty("PGBEN_REF_ID1")
    private String PGBEN_REF_ID1;

    @Column(name = "PGBEN_REF_ID2")
    @JsonProperty("PGBEN_REF_ID2")
    private String PGBEN_REF_ID2;

    @Column(name = "PGBEN_REC_TYPE")
    @JsonProperty("PGBEN_REC_TYPE")
    private String PGBEN_REC_TYPE;

    @Column(name = "PGBEN_BNF_CODE")
    @JsonProperty("PGBEN_BNF_CODE")
    private String PGBEN_BNF_CODE;

    @Column(name = "PGBEN_DOB")
    @JsonProperty("PGBEN_DOB")
    private Date PGBEN_DOB;

	public Integer getPGBEN_TRAN_ID() {
		return PGBEN_TRAN_ID;
	}

	public void setPGBEN_TRAN_ID(Integer pGBEN_TRAN_ID) {
		PGBEN_TRAN_ID = pGBEN_TRAN_ID;
	}

	public Long getPGBEN_POL_TRAN_ID() {
		return PGBEN_POL_TRAN_ID;
	}

	public void setPGBEN_POL_TRAN_ID(Long pGBEN_POL_TRAN_ID) {
		PGBEN_POL_TRAN_ID = pGBEN_POL_TRAN_ID;
	}

	public Long getPGBEN_PEMP_TRAN_ID() {
		return PGBEN_PEMP_TRAN_ID;
	}

	public void setPGBEN_PEMP_TRAN_ID(Long pGBEN_PEMP_TRAN_ID) {
		PGBEN_PEMP_TRAN_ID = pGBEN_PEMP_TRAN_ID;
	}

	public Integer getPGBEN_SR_NO() {
		return PGBEN_SR_NO;
	}

	public void setPGBEN_SR_NO(Integer pGBEN_SR_NO) {
		PGBEN_SR_NO = pGBEN_SR_NO;
	}

	public String getPGBEN_BNF_TYPE() {
		return PGBEN_BNF_TYPE;
	}

	public void setPGBEN_BNF_TYPE(String pGBEN_BNF_TYPE) {
		PGBEN_BNF_TYPE = pGBEN_BNF_TYPE;
	}

	public String getPGBEN_BNF_NAME() {
		return PGBEN_BNF_NAME;
	}

	public void setPGBEN_BNF_NAME(String pGBEN_BNF_NAME) {
		PGBEN_BNF_NAME = pGBEN_BNF_NAME;
	}

	public String getPGBEN_BNF_NAME_BL() {
		return PGBEN_BNF_NAME_BL;
	}

	public void setPGBEN_BNF_NAME_BL(String pGBEN_BNF_NAME_BL) {
		PGBEN_BNF_NAME_BL = pGBEN_BNF_NAME_BL;
	}

	public BigDecimal getPGBEN_SHARE_PERC() {
		return PGBEN_SHARE_PERC;
	}

	public void setPGBEN_SHARE_PERC(BigDecimal pGBEN_SHARE_PERC) {
		PGBEN_SHARE_PERC = pGBEN_SHARE_PERC;
	}

	public String getPGBEN_RELATION_CODE() {
		return PGBEN_RELATION_CODE;
	}

	public void setPGBEN_RELATION_CODE(String pGBEN_RELATION_CODE) {
		PGBEN_RELATION_CODE = pGBEN_RELATION_CODE;
	}

	public String getPGBEN_ADDRESS_1() {
		return PGBEN_ADDRESS_1;
	}

	public void setPGBEN_ADDRESS_1(String pGBEN_ADDRESS_1) {
		PGBEN_ADDRESS_1 = pGBEN_ADDRESS_1;
	}

	public String getPGBEN_ADDRESS_2() {
		return PGBEN_ADDRESS_2;
	}

	public void setPGBEN_ADDRESS_2(String pGBEN_ADDRESS_2) {
		PGBEN_ADDRESS_2 = pGBEN_ADDRESS_2;
	}

	public String getPGBEN_ADDRESS_3() {
		return PGBEN_ADDRESS_3;
	}

	public void setPGBEN_ADDRESS_3(String pGBEN_ADDRESS_3) {
		PGBEN_ADDRESS_3 = pGBEN_ADDRESS_3;
	}

	public String getPGBEN_ADDRESS_4() {
		return PGBEN_ADDRESS_4;
	}

	public void setPGBEN_ADDRESS_4(String pGBEN_ADDRESS_4) {
		PGBEN_ADDRESS_4 = pGBEN_ADDRESS_4;
	}

	public String getPGBEN_ADDRESS_5() {
		return PGBEN_ADDRESS_5;
	}

	public void setPGBEN_ADDRESS_5(String pGBEN_ADDRESS_5) {
		PGBEN_ADDRESS_5 = pGBEN_ADDRESS_5;
	}

	public String getPGBEN_ADDRESS_1_BL() {
		return PGBEN_ADDRESS_1_BL;
	}

	public void setPGBEN_ADDRESS_1_BL(String pGBEN_ADDRESS_1_BL) {
		PGBEN_ADDRESS_1_BL = pGBEN_ADDRESS_1_BL;
	}

	public String getPGBEN_ADDRESS_2_BL() {
		return PGBEN_ADDRESS_2_BL;
	}

	public void setPGBEN_ADDRESS_2_BL(String pGBEN_ADDRESS_2_BL) {
		PGBEN_ADDRESS_2_BL = pGBEN_ADDRESS_2_BL;
	}

	public String getPGBEN_ADDRESS_3_BL() {
		return PGBEN_ADDRESS_3_BL;
	}

	public void setPGBEN_ADDRESS_3_BL(String pGBEN_ADDRESS_3_BL) {
		PGBEN_ADDRESS_3_BL = pGBEN_ADDRESS_3_BL;
	}

	public String getPGBEN_ADDRESS_4_BL() {
		return PGBEN_ADDRESS_4_BL;
	}

	public void setPGBEN_ADDRESS_4_BL(String pGBEN_ADDRESS_4_BL) {
		PGBEN_ADDRESS_4_BL = pGBEN_ADDRESS_4_BL;
	}

	public String getPGBEN_ADDRESS_5_BL() {
		return PGBEN_ADDRESS_5_BL;
	}

	public void setPGBEN_ADDRESS_5_BL(String pGBEN_ADDRESS_5_BL) {
		PGBEN_ADDRESS_5_BL = pGBEN_ADDRESS_5_BL;
	}

	public String getPGBEN_REMARKS() {
		return PGBEN_REMARKS;
	}

	public void setPGBEN_REMARKS(String pGBEN_REMARKS) {
		PGBEN_REMARKS = pGBEN_REMARKS;
	}

	public String getPGBEN_REMARKS_BL() {
		return PGBEN_REMARKS_BL;
	}

	public void setPGBEN_REMARKS_BL(String pGBEN_REMARKS_BL) {
		PGBEN_REMARKS_BL = pGBEN_REMARKS_BL;
	}

	public String getPGBEN_INS_ID() {
		return PGBEN_INS_ID;
	}

	public void setPGBEN_INS_ID(String pGBEN_INS_ID) {
		PGBEN_INS_ID = pGBEN_INS_ID;
	}

	public Date getPGBEN_INS_DT() {
		return PGBEN_INS_DT;
	}

	public void setPGBEN_INS_DT(Date pGBEN_INS_DT) {
		PGBEN_INS_DT = pGBEN_INS_DT;
	}

	public String getPGBEN_MOD_ID() {
		return PGBEN_MOD_ID;
	}

	public void setPGBEN_MOD_ID(String pGBEN_MOD_ID) {
		PGBEN_MOD_ID = pGBEN_MOD_ID;
	}

	public Date getPGBEN_MOD_DT() {
		return PGBEN_MOD_DT;
	}

	public void setPGBEN_MOD_DT(Date pGBEN_MOD_DT) {
		PGBEN_MOD_DT = pGBEN_MOD_DT;
	}

	public String getPGBEN_CATG_CODE() {
		return PGBEN_CATG_CODE;
	}

	public void setPGBEN_CATG_CODE(String pGBEN_CATG_CODE) {
		PGBEN_CATG_CODE = pGBEN_CATG_CODE;
	}

	public Integer getPGBEN_AGE() {
		return PGBEN_AGE;
	}

	public void setPGBEN_AGE(Integer pGBEN_AGE) {
		PGBEN_AGE = pGBEN_AGE;
	}

	public String getPGBEN_GUARDIAN_NAME() {
		return PGBEN_GUARDIAN_NAME;
	}

	public void setPGBEN_GUARDIAN_NAME(String pGBEN_GUARDIAN_NAME) {
		PGBEN_GUARDIAN_NAME = pGBEN_GUARDIAN_NAME;
	}

	public String getPGBEN_DEL_FLAG() {
		return PGBEN_DEL_FLAG;
	}

	public void setPGBEN_DEL_FLAG(String pGBEN_DEL_FLAG) {
		PGBEN_DEL_FLAG = pGBEN_DEL_FLAG;
	}

	public String getPGBEN_REF_ID1() {
		return PGBEN_REF_ID1;
	}

	public void setPGBEN_REF_ID1(String pGBEN_REF_ID1) {
		PGBEN_REF_ID1 = pGBEN_REF_ID1;
	}

	public String getPGBEN_REF_ID2() {
		return PGBEN_REF_ID2;
	}

	public void setPGBEN_REF_ID2(String pGBEN_REF_ID2) {
		PGBEN_REF_ID2 = pGBEN_REF_ID2;
	}

	public String getPGBEN_REC_TYPE() {
		return PGBEN_REC_TYPE;
	}

	public void setPGBEN_REC_TYPE(String pGBEN_REC_TYPE) {
		PGBEN_REC_TYPE = pGBEN_REC_TYPE;
	}

	public String getPGBEN_BNF_CODE() {
		return PGBEN_BNF_CODE;
	}

	public void setPGBEN_BNF_CODE(String pGBEN_BNF_CODE) {
		PGBEN_BNF_CODE = pGBEN_BNF_CODE;
	}

	public Date getPGBEN_DOB() {
		return PGBEN_DOB;
	}

	public void setPGBEN_DOB(Date pGBEN_DOB) {
		PGBEN_DOB = pGBEN_DOB;
	}

}

