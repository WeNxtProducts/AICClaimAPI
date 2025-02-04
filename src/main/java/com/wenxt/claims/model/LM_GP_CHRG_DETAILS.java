package com.wenxt.claims.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_GP_CHRG_DETAILS")
public class LM_GP_CHRG_DETAILS {

    @Id
    @Column(name = "PCHD_SYS_ID")
    @SequenceGenerator(name = "ChargeDetailsSysIdSeq", sequenceName = "PCHD_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ChargeDetailsSysIdSeq")
    private Integer PCHD_SYS_ID;

    @Column(name = "PCHD_PWPH_SYS_ID")
    private Integer PCHD_PWPH_SYS_ID;

    @Column(name = "PCHD_PMPH_SYS_ID")
    private Integer PCHD_PMPH_SYS_ID;

    @Column(name = "PCHD_SR_NO")
    private Integer PCHD_SR_NO;

    @Column(name = "PCHD_CODE")
    private String PCHD_CODE;

    @Column(name = "PCHD_DESC")
    private String PCHD_DESC;

    @Column(name = "PCHD_APP_LEVEL")
    private String PCHD_APP_LEVEL;

    @Column(name = "PCHD_APP_EVENT")
    private String PCHD_APP_EVENT;

    @Column(name = "PCHD_TXN_TYPE")
    private String PCHD_TXN_TYPE;

    @Column(name = "PCHD_RATE")
    private Integer PCHD_RATE;

    @Column(name = "PCHD_RATE_PER")
    private Integer PCHD_RATE_PER;

    @Column(name = "PCHD_UPTO")
    private Integer PCHD_UPTO;

    @Column(name = "PCHD_CUST_SHR")
    private Integer PCHD_CUST_SHR;

    @Column(name = "PCHD_FC_AMT")
    private Integer PCHD_FC_AMT;

    @Column(name = "PCHD_LC_AMT")
    private Integer PCHD_LC_AMT;

    // Getters and Setters

    public Integer getPCHD_SYS_ID() {
        return PCHD_SYS_ID;
    }

    public void setPCHD_SYS_ID(Integer PCHD_SYS_ID) {
        this.PCHD_SYS_ID = PCHD_SYS_ID;
    }

    public Integer getPCHD_PWPH_SYS_ID() {
        return PCHD_PWPH_SYS_ID;
    }

    public void setPCHD_PWPH_SYS_ID(Integer PCHD_PWPH_SYS_ID) {
        this.PCHD_PWPH_SYS_ID = PCHD_PWPH_SYS_ID;
    }

    public Integer getPCHD_PMPH_SYS_ID() {
        return PCHD_PMPH_SYS_ID;
    }

    public void setPCHD_PMPH_SYS_ID(Integer PCHD_PMPH_SYS_ID) {
        this.PCHD_PMPH_SYS_ID = PCHD_PMPH_SYS_ID;
    }

    public Integer getPCHD_SR_NO() {
        return PCHD_SR_NO;
    }

    public void setPCHD_SR_NO(Integer PCHD_SR_NO) {
        this.PCHD_SR_NO = PCHD_SR_NO;
    }

    public String getPCHD_CODE() {
        return PCHD_CODE;
    }

    public void setPCHD_CODE(String PCHD_CODE) {
        this.PCHD_CODE = PCHD_CODE;
    }

    public String getPCHD_DESC() {
        return PCHD_DESC;
    }

    public void setPCHD_DESC(String PCHD_DESC) {
        this.PCHD_DESC = PCHD_DESC;
    }

    public String getPCHD_APP_LEVEL() {
        return PCHD_APP_LEVEL;
    }

    public void setPCHD_APP_LEVEL(String PCHD_APP_LEVEL) {
        this.PCHD_APP_LEVEL = PCHD_APP_LEVEL;
    }

    public String getPCHD_APP_EVENT() {
        return PCHD_APP_EVENT;
    }

    public void setPCHD_APP_EVENT(String PCHD_APP_EVENT) {
        this.PCHD_APP_EVENT = PCHD_APP_EVENT;
    }

    public String getPCHD_TXN_TYPE() {
        return PCHD_TXN_TYPE;
    }

    public void setPCHD_TXN_TYPE(String PCHD_TXN_TYPE) {
        this.PCHD_TXN_TYPE = PCHD_TXN_TYPE;
    }

    public Integer getPCHD_RATE() {
        return PCHD_RATE;
    }

    public void setPCHD_RATE(Integer PCHD_RATE) {
        this.PCHD_RATE = PCHD_RATE;
    }

    public Integer getPCHD_RATE_PER() {
        return PCHD_RATE_PER;
    }

    public void setPCHD_RATE_PER(Integer PCHD_RATE_PER) {
        this.PCHD_RATE_PER = PCHD_RATE_PER;
    }

    public Integer getPCHD_UPTO() {
        return PCHD_UPTO;
    }

    public void setPCHD_UPTO(Integer PCHD_UPTO) {
        this.PCHD_UPTO = PCHD_UPTO;
    }

    public Integer getPCHD_CUST_SHR() {
        return PCHD_CUST_SHR;
    }

    public void setPCHD_CUST_SHR(Integer PCHD_CUST_SHR) {
        this.PCHD_CUST_SHR = PCHD_CUST_SHR;
    }

    public Integer getPCHD_FC_AMT() {
        return PCHD_FC_AMT;
    }

    public void setPCHD_FC_AMT(Integer PCHD_FC_AMT) {
        this.PCHD_FC_AMT = PCHD_FC_AMT;
    }

    public Integer getPCHD_LC_AMT() {
        return PCHD_LC_AMT;
    }

    public void setPCHD_LC_AMT(Integer PCHD_LC_AMT) {
        this.PCHD_LC_AMT = PCHD_LC_AMT;
    }
}
