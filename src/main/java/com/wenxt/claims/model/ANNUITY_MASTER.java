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
@Table(name = "LM_GP_ANNUITY_MASTER")
public class ANNUITY_MASTER {

    @Id
    @Column(name = "ANNU_SYS_ID")
	@SequenceGenerator(name = "AnnutiyMasterSysIdSeq", sequenceName = "ANNU_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AnnutiyMasterSysIdSeq")
    private Integer ANNU_SYS_ID;

    @Column(name = "ANNU_PROD_SYS_ID")
    private String ANNU_PROD_SYS_ID;

    @Column(name = "ANNU_AGE_MAT")
    private Integer ANNU_AGE_MAT;

    @Column(name = "ANNU_MOD_PAYMT")
    private String ANNU_MOD_PAYMT;

    @Column(name = "ANNU_GUAR_PER")
    private Integer ANNU_GUAR_PER;

    @Column(name = "ANNU_CATG_CODE")
    private Integer ANNU_CATG_CODE;

    @Column(name = "ANNU_RATE")
    private Integer ANNU_RATE;

    @Column(name = "ANNU_RATE_PER")
    private Integer ANNU_RATE_PER;

    @Column(name = "ANNU_EFF_FM_DT")
    private Date ANNU_EFF_FM_DT;

    @Column(name = "ANNU_EFF_TO_DT")
    private Date ANNU_EFF_TO_DT;

    // Getters and Setters
    public Integer getANNU_SYS_ID() {
        return ANNU_SYS_ID;
    }

    public void setANNU_SYS_ID(Integer ANNU_SYS_ID) {
        this.ANNU_SYS_ID = ANNU_SYS_ID;
    }

    public String getANNU_PROD_SYS_ID() {
        return ANNU_PROD_SYS_ID;
    }

    public void setANNU_PROD_SYS_ID(String ANNU_PROD_SYS_ID) {
        this.ANNU_PROD_SYS_ID = ANNU_PROD_SYS_ID;
    }

    public Integer getANNU_AGE_MAT() {
        return ANNU_AGE_MAT;
    }

    public void setANNU_AGE_MAT(Integer ANNU_AGE_MAT) {
        this.ANNU_AGE_MAT = ANNU_AGE_MAT;
    }

    public String getANNU_MOD_PAYMT() {
        return ANNU_MOD_PAYMT;
    }

    public void setANNU_MOD_PAYMT(String ANNU_MOD_PAYMT) {
        this.ANNU_MOD_PAYMT = ANNU_MOD_PAYMT;
    }

    public Integer getANNU_GUAR_PER() {
        return ANNU_GUAR_PER;
    }

    public void setANNU_GUAR_PER(Integer ANNU_GUAR_PER) {
        this.ANNU_GUAR_PER = ANNU_GUAR_PER;
    }

    public Integer getANNU_CATG_CODE() {
        return ANNU_CATG_CODE;
    }

    public void setANNU_CATG_CODE(Integer ANNU_CATG_CODE) {
        this.ANNU_CATG_CODE = ANNU_CATG_CODE;
    }

    public Integer getANNU_RATE() {
        return ANNU_RATE;
    }

    public void setANNU_RATE(Integer ANNU_RATE) {
        this.ANNU_RATE = ANNU_RATE;
    }

    public Integer getANNU_RATE_PER() {
        return ANNU_RATE_PER;
    }

    public void setANNU_RATE_PER(Integer ANNU_RATE_PER) {
        this.ANNU_RATE_PER = ANNU_RATE_PER;
    }

    public Date getANNU_EFF_FM_DT() {
        return ANNU_EFF_FM_DT;
    }

    public void setANNU_EFF_FM_DT(Date ANNU_EFF_FM_DT) {
        this.ANNU_EFF_FM_DT = ANNU_EFF_FM_DT;
    }

    public Date getANNU_EFF_TO_DT() {
        return ANNU_EFF_TO_DT;
    }

    public void setANNU_EFF_TO_DT(Date ANNU_EFF_TO_DT) {
        this.ANNU_EFF_TO_DT = ANNU_EFF_TO_DT;
    }
}
