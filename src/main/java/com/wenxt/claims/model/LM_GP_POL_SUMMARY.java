package com.wenxt.claims.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_GP_POL_SUMMARY", schema = "LIFE_DEV")
public class LM_GP_POL_SUMMARY {

    @Id
    @Column(name = "POSM_SYS_ID")
    @SequenceGenerator(name = "PolSummarySysIdSeq", sequenceName = "POSM_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PolSummarySysIdSeq")
    private Integer POSM_SYS_ID;

    @Column(name = "POSM_POL_SYS_ID")
    private Integer POSM_POL_SYS_ID;

    @Column(name = "POSM_EMP_ID")
    private Integer POSM_EMP_ID;

    @Column(name = "POSM_DATE")
    private Date POSM_DATE;

    @Column(name = "POSM_YEAR")
    private Integer POSM_YEAR;

    @Column(name = "POSM_TAX_BASIS")
    private String POSM_TAX_BASIS;

    @Column(name = "POSM_EMP_CONT_FC")
    private Integer POSM_EMP_CONT_FC;

    @Column(name = "POSM_EMP_CONT_LC")
    private Integer POSM_EMP_CONT_LC;

    @Column(name = "POSM_EMPR_CONT_FC")
    private Integer POSM_EMPR_CONT_FC;

    @Column(name = "POSM_EMPR_CONT_LC")
    private Integer POSM_EMPR_CONT_LC;

    @Column(name = "POSM_EX_EMP_CONT_FC")
    private Integer POSM_EX_EMP_CONT_FC;

    @Column(name = "POSM_EX_EMP_CONT_LC")
    private Integer POSM_EX_EMP_CONT_LC;

    @Column(name = "POSM_EX_EMPR_CONT_FC")
    private Integer POSM_EX_EMPR_CONT_FC;

    @Column(name = "POSM_EX_EMPR_CONT_LC")
    private Integer POSM_EX_EMPR_CONT_LC;

    @Column(name = "POSM_DED_BEF_INT_EMP_FC")
    private Integer POSM_DED_BEF_INT_EMP_FC;

    @Column(name = "POSM_DED_BEF_INT_EMP_LC")
    private Integer POSM_DED_BEF_INT_EMP_LC;

    @Column(name = "POSM_DED_BEF_INT_EMPR_FC")
    private Integer POSM_DED_BEF_INT_EMPR_FC;

    @Column(name = "POSM_DED_BEF_INT_EMPR_LC")
    private Integer POSM_DED_BEF_INT_EMPR_LC;

    @Column(name = "POSM_EX_DED_BEF_INT_EMP_FC")
    private Integer POSM_EX_DED_BEF_INT_EMP_FC;

    @Column(name = "POSM_EX_DED_BEF_INT_EMP_LC")
    private Integer POSM_EX_DED_BEF_INT_EMP_LC;

    @Column(name = "POSM_EX_DED_BEF_INT_EMPR_FC")
    private Integer POSM_EX_DED_BEF_INT_EMPR_FC;

    @Column(name = "POSM_EX_DED_BEF_INT_EMPR_LC")
    private Integer POSM_EX_DED_BEF_INT_EMPR_LC;

    @Column(name = "POSM_INT_EMP_FC")
    private Integer POSM_INT_EMP_FC;

    @Column(name = "POSM_INT_EMP_LC")
    private Integer POSM_INT_EMP_LC;

    @Column(name = "POSM_INT_EMPR_FC")
    private Integer POSM_INT_EMPR_FC;

    @Column(name = "POSM_INT_EMPR_LC")
    private Integer POSM_INT_EMPR_LC;

    @Column(name = "POSM_EX_INT_EMP_FC")
    private Integer POSM_EX_INT_EMP_FC;

    @Column(name = "POSM_EX_INT_EMP_LC")
    private Integer POSM_EX_INT_EMP_LC;

    @Column(name = "POSM_EX_INT_EMPR_FC")
    private Integer POSM_EX_INT_EMPR_FC;

    @Column(name = "POSM_EX_INT_EMPR_LC")
    private Integer POSM_EX_INT_EMPR_LC;

    @Column(name = "POSM_DED_AFT_INT_EMP_FC")
    private Integer POSM_DED_AFT_INT_EMP_FC;

    @Column(name = "POSM_DED_AFT_INT_EMP_LC")
    private Integer POSM_DED_AFT_INT_EMP_LC;

    @Column(name = "POSM_DED_AFT_INT_EMPR_FC")
    private Integer POSM_DED_AFT_INT_EMPR_FC;

    @Column(name = "POSM_DED_AFT_INT_EMPR_LC")
    private Integer POSM_DED_AFT_INT_EMPR_LC;

    @Column(name = "POSM_EX_DED_AFT_INT_EMP_FC")
    private Integer POSM_EX_DED_AFT_INT_EMP_FC;

    @Column(name = "POSM_EX_DED_AFT_INT_EMP_LC")
    private Integer POSM_EX_DED_AFT_INT_EMP_LC;

    @Column(name = "POSM_EX_DED_AFT_INT_EMPR_FC")
    private Integer POSM_EX_DED_AFT_INT_EMPR_FC;

    @Column(name = "POSM_EX_DED_AFT_INT_EMPR_LC")
    private Integer POSM_EX_DED_AFT_INT_EMPR_LC;

    @Column(name = "POSM_TAX_EMP_FC")
    private Integer POSM_TAX_EMP_FC;

    @Column(name = "POSM_TAX_EMP_LC")
    private Integer POSM_TAX_EMP_LC;

    @Column(name = "POSM_TAX_EMPR_FC")
    private Integer POSM_TAX_EMPR_FC;

    @Column(name = "POSM_TAX_EMPR_LC")
    private Integer POSM_TAX_EMPR_LC;

    @Column(name = "POSM_EX_TAX_EMP_FC")
    private Integer POSM_EX_TAX_EMP_FC;

    @Column(name = "POSM_EX_TAX_EMP_LC")
    private Integer POSM_EX_TAX_EMP_LC;

    @Column(name = "POSM_EX_TAX_EMPR_FC")
    private Integer POSM_EX_TAX_EMPR_FC;

    @Column(name = "POSM_EX_TAX_EMPR_LC")
    private Integer POSM_EX_TAX_EMPR_LC;

	public Integer getPOSM_SYS_ID() {
		return POSM_SYS_ID;
	}

	public void setPOSM_SYS_ID(Integer pOSM_SYS_ID) {
		POSM_SYS_ID = pOSM_SYS_ID;
	}

	public Integer getPOSM_POL_SYS_ID() {
		return POSM_POL_SYS_ID;
	}

	public void setPOSM_POL_SYS_ID(Integer pOSM_POL_SYS_ID) {
		POSM_POL_SYS_ID = pOSM_POL_SYS_ID;
	}

	public Integer getPOSM_EMP_ID() {
		return POSM_EMP_ID;
	}

	public void setPOSM_EMP_ID(Integer pOSM_EMP_ID) {
		POSM_EMP_ID = pOSM_EMP_ID;
	}

	public Date getPOSM_DATE() {
		return POSM_DATE;
	}

	public void setPOSM_DATE(Date pOSM_DATE) {
		POSM_DATE = pOSM_DATE;
	}

	public Integer getPOSM_YEAR() {
		return POSM_YEAR;
	}

	public void setPOSM_YEAR(Integer pOSM_YEAR) {
		POSM_YEAR = pOSM_YEAR;
	}

	public String getPOSM_TAX_BASIS() {
		return POSM_TAX_BASIS;
	}

	public void setPOSM_TAX_BASIS(String pOSM_TAX_BASIS) {
		POSM_TAX_BASIS = pOSM_TAX_BASIS;
	}

	public Integer getPOSM_EMP_CONT_FC() {
		return POSM_EMP_CONT_FC;
	}

	public void setPOSM_EMP_CONT_FC(Integer pOSM_EMP_CONT_FC) {
		POSM_EMP_CONT_FC = pOSM_EMP_CONT_FC;
	}

	public Integer getPOSM_EMP_CONT_LC() {
		return POSM_EMP_CONT_LC;
	}

	public void setPOSM_EMP_CONT_LC(Integer pOSM_EMP_CONT_LC) {
		POSM_EMP_CONT_LC = pOSM_EMP_CONT_LC;
	}

	public Integer getPOSM_EMPR_CONT_FC() {
		return POSM_EMPR_CONT_FC;
	}

	public void setPOSM_EMPR_CONT_FC(Integer pOSM_EMPR_CONT_FC) {
		POSM_EMPR_CONT_FC = pOSM_EMPR_CONT_FC;
	}

	public Integer getPOSM_EMPR_CONT_LC() {
		return POSM_EMPR_CONT_LC;
	}

	public void setPOSM_EMPR_CONT_LC(Integer pOSM_EMPR_CONT_LC) {
		POSM_EMPR_CONT_LC = pOSM_EMPR_CONT_LC;
	}

	public Integer getPOSM_EX_EMP_CONT_FC() {
		return POSM_EX_EMP_CONT_FC;
	}

	public void setPOSM_EX_EMP_CONT_FC(Integer pOSM_EX_EMP_CONT_FC) {
		POSM_EX_EMP_CONT_FC = pOSM_EX_EMP_CONT_FC;
	}

	public Integer getPOSM_EX_EMP_CONT_LC() {
		return POSM_EX_EMP_CONT_LC;
	}

	public void setPOSM_EX_EMP_CONT_LC(Integer pOSM_EX_EMP_CONT_LC) {
		POSM_EX_EMP_CONT_LC = pOSM_EX_EMP_CONT_LC;
	}

	public Integer getPOSM_EX_EMPR_CONT_FC() {
		return POSM_EX_EMPR_CONT_FC;
	}

	public void setPOSM_EX_EMPR_CONT_FC(Integer pOSM_EX_EMPR_CONT_FC) {
		POSM_EX_EMPR_CONT_FC = pOSM_EX_EMPR_CONT_FC;
	}

	public Integer getPOSM_EX_EMPR_CONT_LC() {
		return POSM_EX_EMPR_CONT_LC;
	}

	public void setPOSM_EX_EMPR_CONT_LC(Integer pOSM_EX_EMPR_CONT_LC) {
		POSM_EX_EMPR_CONT_LC = pOSM_EX_EMPR_CONT_LC;
	}

	public Integer getPOSM_DED_BEF_INT_EMP_FC() {
		return POSM_DED_BEF_INT_EMP_FC;
	}

	public void setPOSM_DED_BEF_INT_EMP_FC(Integer pOSM_DED_BEF_INT_EMP_FC) {
		POSM_DED_BEF_INT_EMP_FC = pOSM_DED_BEF_INT_EMP_FC;
	}

	public Integer getPOSM_DED_BEF_INT_EMP_LC() {
		return POSM_DED_BEF_INT_EMP_LC;
	}

	public void setPOSM_DED_BEF_INT_EMP_LC(Integer pOSM_DED_BEF_INT_EMP_LC) {
		POSM_DED_BEF_INT_EMP_LC = pOSM_DED_BEF_INT_EMP_LC;
	}

	public Integer getPOSM_DED_BEF_INT_EMPR_FC() {
		return POSM_DED_BEF_INT_EMPR_FC;
	}

	public void setPOSM_DED_BEF_INT_EMPR_FC(Integer pOSM_DED_BEF_INT_EMPR_FC) {
		POSM_DED_BEF_INT_EMPR_FC = pOSM_DED_BEF_INT_EMPR_FC;
	}

	public Integer getPOSM_DED_BEF_INT_EMPR_LC() {
		return POSM_DED_BEF_INT_EMPR_LC;
	}

	public void setPOSM_DED_BEF_INT_EMPR_LC(Integer pOSM_DED_BEF_INT_EMPR_LC) {
		POSM_DED_BEF_INT_EMPR_LC = pOSM_DED_BEF_INT_EMPR_LC;
	}

	public Integer getPOSM_EX_DED_BEF_INT_EMP_FC() {
		return POSM_EX_DED_BEF_INT_EMP_FC;
	}

	public void setPOSM_EX_DED_BEF_INT_EMP_FC(Integer pOSM_EX_DED_BEF_INT_EMP_FC) {
		POSM_EX_DED_BEF_INT_EMP_FC = pOSM_EX_DED_BEF_INT_EMP_FC;
	}

	public Integer getPOSM_EX_DED_BEF_INT_EMP_LC() {
		return POSM_EX_DED_BEF_INT_EMP_LC;
	}

	public void setPOSM_EX_DED_BEF_INT_EMP_LC(Integer pOSM_EX_DED_BEF_INT_EMP_LC) {
		POSM_EX_DED_BEF_INT_EMP_LC = pOSM_EX_DED_BEF_INT_EMP_LC;
	}

	public Integer getPOSM_EX_DED_BEF_INT_EMPR_FC() {
		return POSM_EX_DED_BEF_INT_EMPR_FC;
	}

	public void setPOSM_EX_DED_BEF_INT_EMPR_FC(Integer pOSM_EX_DED_BEF_INT_EMPR_FC) {
		POSM_EX_DED_BEF_INT_EMPR_FC = pOSM_EX_DED_BEF_INT_EMPR_FC;
	}

	public Integer getPOSM_EX_DED_BEF_INT_EMPR_LC() {
		return POSM_EX_DED_BEF_INT_EMPR_LC;
	}

	public void setPOSM_EX_DED_BEF_INT_EMPR_LC(Integer pOSM_EX_DED_BEF_INT_EMPR_LC) {
		POSM_EX_DED_BEF_INT_EMPR_LC = pOSM_EX_DED_BEF_INT_EMPR_LC;
	}

	public Integer getPOSM_INT_EMP_FC() {
		return POSM_INT_EMP_FC;
	}

	public void setPOSM_INT_EMP_FC(Integer pOSM_INT_EMP_FC) {
		POSM_INT_EMP_FC = pOSM_INT_EMP_FC;
	}

	public Integer getPOSM_INT_EMP_LC() {
		return POSM_INT_EMP_LC;
	}

	public void setPOSM_INT_EMP_LC(Integer pOSM_INT_EMP_LC) {
		POSM_INT_EMP_LC = pOSM_INT_EMP_LC;
	}

	public Integer getPOSM_INT_EMPR_FC() {
		return POSM_INT_EMPR_FC;
	}

	public void setPOSM_INT_EMPR_FC(Integer pOSM_INT_EMPR_FC) {
		POSM_INT_EMPR_FC = pOSM_INT_EMPR_FC;
	}

	public Integer getPOSM_INT_EMPR_LC() {
		return POSM_INT_EMPR_LC;
	}

	public void setPOSM_INT_EMPR_LC(Integer pOSM_INT_EMPR_LC) {
		POSM_INT_EMPR_LC = pOSM_INT_EMPR_LC;
	}

	public Integer getPOSM_EX_INT_EMP_FC() {
		return POSM_EX_INT_EMP_FC;
	}

	public void setPOSM_EX_INT_EMP_FC(Integer pOSM_EX_INT_EMP_FC) {
		POSM_EX_INT_EMP_FC = pOSM_EX_INT_EMP_FC;
	}

	public Integer getPOSM_EX_INT_EMP_LC() {
		return POSM_EX_INT_EMP_LC;
	}

	public void setPOSM_EX_INT_EMP_LC(Integer pOSM_EX_INT_EMP_LC) {
		POSM_EX_INT_EMP_LC = pOSM_EX_INT_EMP_LC;
	}

	public Integer getPOSM_EX_INT_EMPR_FC() {
		return POSM_EX_INT_EMPR_FC;
	}

	public void setPOSM_EX_INT_EMPR_FC(Integer pOSM_EX_INT_EMPR_FC) {
		POSM_EX_INT_EMPR_FC = pOSM_EX_INT_EMPR_FC;
	}

	public Integer getPOSM_EX_INT_EMPR_LC() {
		return POSM_EX_INT_EMPR_LC;
	}

	public void setPOSM_EX_INT_EMPR_LC(Integer pOSM_EX_INT_EMPR_LC) {
		POSM_EX_INT_EMPR_LC = pOSM_EX_INT_EMPR_LC;
	}

	public Integer getPOSM_DED_AFT_INT_EMP_FC() {
		return POSM_DED_AFT_INT_EMP_FC;
	}

	public void setPOSM_DED_AFT_INT_EMP_FC(Integer pOSM_DED_AFT_INT_EMP_FC) {
		POSM_DED_AFT_INT_EMP_FC = pOSM_DED_AFT_INT_EMP_FC;
	}

	public Integer getPOSM_DED_AFT_INT_EMP_LC() {
		return POSM_DED_AFT_INT_EMP_LC;
	}

	public void setPOSM_DED_AFT_INT_EMP_LC(Integer pOSM_DED_AFT_INT_EMP_LC) {
		POSM_DED_AFT_INT_EMP_LC = pOSM_DED_AFT_INT_EMP_LC;
	}

	public Integer getPOSM_DED_AFT_INT_EMPR_FC() {
		return POSM_DED_AFT_INT_EMPR_FC;
	}

	public void setPOSM_DED_AFT_INT_EMPR_FC(Integer pOSM_DED_AFT_INT_EMPR_FC) {
		POSM_DED_AFT_INT_EMPR_FC = pOSM_DED_AFT_INT_EMPR_FC;
	}

	public Integer getPOSM_DED_AFT_INT_EMPR_LC() {
		return POSM_DED_AFT_INT_EMPR_LC;
	}

	public void setPOSM_DED_AFT_INT_EMPR_LC(Integer pOSM_DED_AFT_INT_EMPR_LC) {
		POSM_DED_AFT_INT_EMPR_LC = pOSM_DED_AFT_INT_EMPR_LC;
	}

	public Integer getPOSM_EX_DED_AFT_INT_EMP_FC() {
		return POSM_EX_DED_AFT_INT_EMP_FC;
	}

	public void setPOSM_EX_DED_AFT_INT_EMP_FC(Integer pOSM_EX_DED_AFT_INT_EMP_FC) {
		POSM_EX_DED_AFT_INT_EMP_FC = pOSM_EX_DED_AFT_INT_EMP_FC;
	}

	public Integer getPOSM_EX_DED_AFT_INT_EMP_LC() {
		return POSM_EX_DED_AFT_INT_EMP_LC;
	}

	public void setPOSM_EX_DED_AFT_INT_EMP_LC(Integer pOSM_EX_DED_AFT_INT_EMP_LC) {
		POSM_EX_DED_AFT_INT_EMP_LC = pOSM_EX_DED_AFT_INT_EMP_LC;
	}

	public Integer getPOSM_EX_DED_AFT_INT_EMPR_FC() {
		return POSM_EX_DED_AFT_INT_EMPR_FC;
	}

	public void setPOSM_EX_DED_AFT_INT_EMPR_FC(Integer pOSM_EX_DED_AFT_INT_EMPR_FC) {
		POSM_EX_DED_AFT_INT_EMPR_FC = pOSM_EX_DED_AFT_INT_EMPR_FC;
	}

	public Integer getPOSM_EX_DED_AFT_INT_EMPR_LC() {
		return POSM_EX_DED_AFT_INT_EMPR_LC;
	}

	public void setPOSM_EX_DED_AFT_INT_EMPR_LC(Integer pOSM_EX_DED_AFT_INT_EMPR_LC) {
		POSM_EX_DED_AFT_INT_EMPR_LC = pOSM_EX_DED_AFT_INT_EMPR_LC;
	}

	public Integer getPOSM_TAX_EMP_FC() {
		return POSM_TAX_EMP_FC;
	}

	public void setPOSM_TAX_EMP_FC(Integer pOSM_TAX_EMP_FC) {
		POSM_TAX_EMP_FC = pOSM_TAX_EMP_FC;
	}

	public Integer getPOSM_TAX_EMP_LC() {
		return POSM_TAX_EMP_LC;
	}

	public void setPOSM_TAX_EMP_LC(Integer pOSM_TAX_EMP_LC) {
		POSM_TAX_EMP_LC = pOSM_TAX_EMP_LC;
	}

	public Integer getPOSM_TAX_EMPR_FC() {
		return POSM_TAX_EMPR_FC;
	}

	public void setPOSM_TAX_EMPR_FC(Integer pOSM_TAX_EMPR_FC) {
		POSM_TAX_EMPR_FC = pOSM_TAX_EMPR_FC;
	}

	public Integer getPOSM_TAX_EMPR_LC() {
		return POSM_TAX_EMPR_LC;
	}

	public void setPOSM_TAX_EMPR_LC(Integer pOSM_TAX_EMPR_LC) {
		POSM_TAX_EMPR_LC = pOSM_TAX_EMPR_LC;
	}

	public Integer getPOSM_EX_TAX_EMP_FC() {
		return POSM_EX_TAX_EMP_FC;
	}

	public void setPOSM_EX_TAX_EMP_FC(Integer pOSM_EX_TAX_EMP_FC) {
		POSM_EX_TAX_EMP_FC = pOSM_EX_TAX_EMP_FC;
	}

	public Integer getPOSM_EX_TAX_EMP_LC() {
		return POSM_EX_TAX_EMP_LC;
	}

	public void setPOSM_EX_TAX_EMP_LC(Integer pOSM_EX_TAX_EMP_LC) {
		POSM_EX_TAX_EMP_LC = pOSM_EX_TAX_EMP_LC;
	}

	public Integer getPOSM_EX_TAX_EMPR_FC() {
		return POSM_EX_TAX_EMPR_FC;
	}

	public void setPOSM_EX_TAX_EMPR_FC(Integer pOSM_EX_TAX_EMPR_FC) {
		POSM_EX_TAX_EMPR_FC = pOSM_EX_TAX_EMPR_FC;
	}

	public Integer getPOSM_EX_TAX_EMPR_LC() {
		return POSM_EX_TAX_EMPR_LC;
	}

	public void setPOSM_EX_TAX_EMPR_LC(Integer pOSM_EX_TAX_EMPR_LC) {
		POSM_EX_TAX_EMPR_LC = pOSM_EX_TAX_EMPR_LC;
	}

}
