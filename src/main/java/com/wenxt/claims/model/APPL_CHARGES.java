package com.wenxt.claims.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_GP_PROD_APPL_CHARGES")
public class APPL_CHARGES {

    @Id
    @Column(name = "APCH_SYS_ID")
	@SequenceGenerator(name = "ApplChargesSysIdSeq", sequenceName = "APCH_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ApplChargesSysIdSeq")
    private Integer APCH_SYS_ID;

    @Column(name = "APCH_PROD_SYS_ID")
    private String APCH_PROD_SYS_ID;

    @Column(name = "APCH_CHRG_CODE")
    private String APCH_CHRG_CODE;

    @Column(name = "APCH_RATE")
    private Integer APCH_RATE;

    @Column(name = "APCH_RATE_PER")
    private Integer APCH_RATE_PER;

    @Column(name = "APCH_APPL_NORM_CONT")
    private String APCH_APPL_NORM_CONT;

    @Column(name = "APCH_EXTR_CONT")
    private String APCH_EXTR_CONT;

    @Column(name = "APCH_TXN_TYPE")
    private String APCH_TXN_TYPE;

    @Column(name = "APCH_APPLY_EVENT")
    private String APCH_APPLY_EVENT;

    @Column(name = "APCH_APPLY_LEVEL")
    private String APCH_APPLY_LEVEL;

    @Column(name = "APCH_CUST_SHARE")
    private Integer APCH_CUST_SHARE;

    // Getters and Setters
    public Integer getAPCH_SYS_ID() {
        return APCH_SYS_ID;
    }

    public void setAPCH_SYS_ID(Integer APCH_SYS_ID) {
        this.APCH_SYS_ID = APCH_SYS_ID;
    }

    public String getAPCH_PROD_SYS_ID() {
        return APCH_PROD_SYS_ID;
    }

    public void setAPCH_PROD_SYS_ID(String APCH_PROD_SYS_ID) {
        this.APCH_PROD_SYS_ID = APCH_PROD_SYS_ID;
    }

    public String getAPCH_CHRG_CODE() {
        return APCH_CHRG_CODE;
    }

    public void setAPCH_CHRG_CODE(String APCH_CHRG_CODE) {
        this.APCH_CHRG_CODE = APCH_CHRG_CODE;
    }

    public Integer getAPCH_RATE() {
        return APCH_RATE;
    }

    public void setAPCH_RATE(Integer APCH_RATE) {
        this.APCH_RATE = APCH_RATE;
    }

    public Integer getAPCH_RATE_PER() {
        return APCH_RATE_PER;
    }

    public void setAPCH_RATE_PER(Integer APCH_RATE_PER) {
        this.APCH_RATE_PER = APCH_RATE_PER;
    }

    public String getAPCH_APPL_NORM_CONT() {
        return APCH_APPL_NORM_CONT;
    }

    public void setAPCH_APPL_NORM_CONT(String APCH_APPL_NORM_CONT) {
        this.APCH_APPL_NORM_CONT = APCH_APPL_NORM_CONT;
    }

    public String getAPCH_EXTR_CONT() {
        return APCH_EXTR_CONT;
    }

    public void setAPCH_EXTR_CONT(String APCH_EXTR_CONT) {
        this.APCH_EXTR_CONT = APCH_EXTR_CONT;
    }

    public String getAPCH_TXN_TYPE() {
        return APCH_TXN_TYPE;
    }

    public void setAPCH_TXN_TYPE(String APCH_TXN_TYPE) {
        this.APCH_TXN_TYPE = APCH_TXN_TYPE;
    }

    public String getAPCH_APPLY_EVENT() {
        return APCH_APPLY_EVENT;
    }

    public void setAPCH_APPLY_EVENT(String APCH_APPLY_EVENT) {
        this.APCH_APPLY_EVENT = APCH_APPLY_EVENT;
    }

    public String getAPCH_APPLY_LEVEL() {
        return APCH_APPLY_LEVEL;
    }

    public void setAPCH_APPLY_LEVEL(String APCH_APPLY_LEVEL) {
        this.APCH_APPLY_LEVEL = APCH_APPLY_LEVEL;
    }

    public Integer getAPCH_CUST_SHARE() {
        return APCH_CUST_SHARE;
    }

    public void setAPCH_CUST_SHARE(Integer APCH_CUST_SHARE) {
        this.APCH_CUST_SHARE = APCH_CUST_SHARE;
    }
}
