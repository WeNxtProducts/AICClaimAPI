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
@Table(name = "LM_GP_WDRA_PRO_HDR", schema = "LIFE_DEV")
public class LM_GP_WDRA_PRO_HDR {

    @Id
    @Column(name = "PWPH_SYS_ID")
    @SequenceGenerator(name = "WithdrawProHdrSysIdSeq", sequenceName = "PWPH_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WithdrawProHdrSysIdSeq")
    private Integer PWPH_SYS_ID;

    @Column(name = "PWPH_POL_SYS_ID")
    private Integer PWPH_POL_SYS_ID;

    @Column(name = "PWPH_POL_NO")
    private String PWPH_POL_NO;

    @Column(name = "PWPH_PROD")
    private String PWPH_PROD;

    @Column(name = "PWPH_EMP_ID")
    private Integer PWPH_EMP_ID;

    @Column(name = "PWPH_TYPE")
    private String PWPH_TYPE;

    @Column(name = "PWPH_DATE")
    private Date PWPH_DATE;

    @Column(name = "PWPH_LOSS_DATE")
    private Date PWPH_LOSS_DATE;

    @Column(name = "PWPH_INTM_DATE")
    private Date PWPH_INTM_DATE;

    @Column(name = "PWPH_CURR_CODE")
    private String PWPH_CURR_CODE;

    @Column(name = "PWPH_EXCH_RATE")
    private Integer PWPH_EXCH_RATE;

    @Column(name = "PWPH_TAX_BASIS")
    private String PWPH_TAX_BASIS;

    @Column(name = "PWPH_FREEZE")
    private String PWPH_FREEZE;

    public Integer getPWPH_SYS_ID() {
        return PWPH_SYS_ID;
    }

    public void setPWPH_SYS_ID(Integer PWPH_SYS_ID) {
        this.PWPH_SYS_ID = PWPH_SYS_ID;
    }

    public Integer getPWPH_POL_SYS_ID() {
        return PWPH_POL_SYS_ID;
    }

    public void setPWPH_POL_SYS_ID(Integer PWPH_POL_SYS_ID) {
        this.PWPH_POL_SYS_ID = PWPH_POL_SYS_ID;
    }

    public String getPWPH_POL_NO() {
        return PWPH_POL_NO;
    }

    public void setPWPH_POL_NO(String PWPH_POL_NO) {
        this.PWPH_POL_NO = PWPH_POL_NO;
    }

    public String getPWPH_PROD() {
        return PWPH_PROD;
    }

    public void setPWPH_PROD(String PWPH_PROD) {
        this.PWPH_PROD = PWPH_PROD;
    }

    public Integer getPWPH_EMP_ID() {
        return PWPH_EMP_ID;
    }

    public void setPWPH_EMP_ID(Integer PWPH_EMP_ID) {
        this.PWPH_EMP_ID = PWPH_EMP_ID;
    }

    public String getPWPH_TYPE() {
        return PWPH_TYPE;
    }

    public void setPWPH_TYPE(String PWPH_TYPE) {
        this.PWPH_TYPE = PWPH_TYPE;
    }

    public Date getPWPH_DATE() {
        return PWPH_DATE;
    }

    public void setPWPH_DATE(Date PWPH_DATE) {
        this.PWPH_DATE = PWPH_DATE;
    }

    public Date getPWPH_LOSS_DATE() {
        return PWPH_LOSS_DATE;
    }

    public void setPWPH_LOSS_DATE(Date PWPH_LOSS_DATE) {
        this.PWPH_LOSS_DATE = PWPH_LOSS_DATE;
    }

    public Date getPWPH_INTM_DATE() {
        return PWPH_INTM_DATE;
    }

    public void setPWPH_INTM_DATE(Date PWPH_INTM_DATE) {
        this.PWPH_INTM_DATE = PWPH_INTM_DATE;
    }

    public String getPWPH_CURR_CODE() {
        return PWPH_CURR_CODE;
    }

    public void setPWPH_CURR_CODE(String PWPH_CURR_CODE) {
        this.PWPH_CURR_CODE = PWPH_CURR_CODE;
    }

    public Integer getPWPH_EXCH_RATE() {
        return PWPH_EXCH_RATE;
    }

    public void setPWPH_EXCH_RATE(Integer PWPH_EXCH_RATE) {
        this.PWPH_EXCH_RATE = PWPH_EXCH_RATE;
    }

    public String getPWPH_TAX_BASIS() {
        return PWPH_TAX_BASIS;
    }

    public void setPWPH_TAX_BASIS(String PWPH_TAX_BASIS) {
        this.PWPH_TAX_BASIS = PWPH_TAX_BASIS;
    }

    public String getPWPH_FREEZE() {
        return PWPH_FREEZE;
    }

    public void setPWPH_FREEZE(String PWPH_FREEZE) {
        this.PWPH_FREEZE = PWPH_FREEZE;
    }
}
