package com.wenxt.claims.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_GP_YR_EN_PRO_DET")
public class LM_GP_YR_EN_PRO_DET {

    @Id
    @Column(name = "PYPD_SYS_ID")
    @SequenceGenerator(name = "YearEndProcessDetSysIdSeq", sequenceName = "PYPD_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "YearEndProcessDetSysIdSeq")
    private Integer PYPD_SYS_ID;

    @Column(name = "PYPD_PYPH_SYS_ID")
    private Integer PYPD_PYPH_SYS_ID;

    @Column(name = "PYPD_SR_NO")
    private Integer PYPD_SR_NO;

    @Column(name = "PYPD_CHRG_CODE")
    private String PYPD_CHRG_CODE;

    @Column(name = "PYPD_NC_APP_ON")
    private String PYPD_NC_APP_ON;

    @Column(name = "PYPD_EC_APP_ON")
    private String PYPD_EC_APP_ON;

    @Column(name = "PYPD_RATE")
    private Integer PYPD_RATE;

    @Column(name = "PYPD_RATE_PER")
    private Integer PYPD_RATE_PER;

    @Column(name = "PYPD_UPTO_SR_NO")
    private Integer PYPD_UPTO_SR_NO;

    @Column(name = "PYPD_CUST_SHARE_PERC")
    private Integer PYPD_CUST_SHARE_PERC;

    @Column(name = "PYPD_APP_EVENT")
    private String PYPD_APP_EVENT;

    @Column(name = "PYPD_FC_VALUE")
    private Integer PYPD_FC_VALUE;

    @Column(name = "PYPD_LC_VALUE")
    private Integer PYPD_LC_VALUE;

    @Column(name = "PYPD_CHRG_DESC")
    private String PYPD_CHRG_DESC;

    public Integer getPYPD_SYS_ID() {
        return PYPD_SYS_ID;
    }

    public void setPYPD_SYS_ID(Integer PYPD_SYS_ID) {
        this.PYPD_SYS_ID = PYPD_SYS_ID;
    }

    public Integer getPYPD_PYPH_SYS_ID() {
        return PYPD_PYPH_SYS_ID;
    }

    public void setPYPD_PYPH_SYS_ID(Integer PYPD_PYPH_SYS_ID) {
        this.PYPD_PYPH_SYS_ID = PYPD_PYPH_SYS_ID;
    }

    public Integer getPYPD_SR_NO() {
        return PYPD_SR_NO;
    }

    public void setPYPD_SR_NO(Integer PYPD_SR_NO) {
        this.PYPD_SR_NO = PYPD_SR_NO;
    }

    public String getPYPD_CHRG_CODE() {
        return PYPD_CHRG_CODE;
    }

    public void setPYPD_CHRG_CODE(String PYPD_CHRG_CODE) {
        this.PYPD_CHRG_CODE = PYPD_CHRG_CODE;
    }

    public String getPYPD_NC_APP_ON() {
        return PYPD_NC_APP_ON;
    }

    public void setPYPD_NC_APP_ON(String PYPD_NC_APP_ON) {
        this.PYPD_NC_APP_ON = PYPD_NC_APP_ON;
    }

    public String getPYPD_EC_APP_ON() {
        return PYPD_EC_APP_ON;
    }

    public void setPYPD_EC_APP_ON(String PYPD_EC_APP_ON) {
        this.PYPD_EC_APP_ON = PYPD_EC_APP_ON;
    }

    public Integer getPYPD_RATE() {
        return PYPD_RATE;
    }

    public void setPYPD_RATE(Integer PYPD_RATE) {
        this.PYPD_RATE = PYPD_RATE;
    }

    public Integer getPYPD_RATE_PER() {
        return PYPD_RATE_PER;
    }

    public void setPYPD_RATE_PER(Integer PYPD_RATE_PER) {
        this.PYPD_RATE_PER = PYPD_RATE_PER;
    }

    public Integer getPYPD_UPTO_SR_NO() {
        return PYPD_UPTO_SR_NO;
    }

    public void setPYPD_UPTO_SR_NO(Integer PYPD_UPTO_SR_NO) {
        this.PYPD_UPTO_SR_NO = PYPD_UPTO_SR_NO;
    }

    public Integer getPYPD_CUST_SHARE_PERC() {
        return PYPD_CUST_SHARE_PERC;
    }

    public void setPYPD_CUST_SHARE_PERC(Integer PYPD_CUST_SHARE_PERC) {
        this.PYPD_CUST_SHARE_PERC = PYPD_CUST_SHARE_PERC;
    }

    public String getPYPD_APP_EVENT() {
        return PYPD_APP_EVENT;
    }

    public void setPYPD_APP_EVENT(String PYPD_APP_EVENT) {
        this.PYPD_APP_EVENT = PYPD_APP_EVENT;
    }

    public Integer getPYPD_FC_VALUE() {
        return PYPD_FC_VALUE;
    }

    public void setPYPD_FC_VALUE(Integer PYPD_FC_VALUE) {
        this.PYPD_FC_VALUE = PYPD_FC_VALUE;
    }

    public Integer getPYPD_LC_VALUE() {
        return PYPD_LC_VALUE;
    }

    public void setPYPD_LC_VALUE(Integer PYPD_LC_VALUE) {
        this.PYPD_LC_VALUE = PYPD_LC_VALUE;
    }

    public String getPYPD_CHRG_DESC() {
        return PYPD_CHRG_DESC;
    }

    public void setPYPD_CHRG_DESC(String PYPD_CHRG_DESC) {
        this.PYPD_CHRG_DESC = PYPD_CHRG_DESC;
    }
}
