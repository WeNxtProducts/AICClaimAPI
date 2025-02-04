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
@Table(name = "LM_GP_YR_EN_PRO_HDR")
public class LM_GP_YR_EN_PRO_HDR {

    @Id
    @Column(name = "PYPH_SYS_ID")
    @SequenceGenerator(name = "YearEndProcessHdrSysIdSeq", sequenceName = "PYPH_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "YearEndProcessHdrSysIdSeq")
    private Integer PYPH_SYS_ID;

    @Column(name = "PYPH_POL_SYS_ID")
    private Integer PYPH_POL_SYS_ID;

    @Column(name = "PYPH_POL_NO")
    private String PYPH_POL_NO;

    @Column(name = "PYPH_CUST_NAME")
    private String PYPH_CUST_NAME;

    @Column(name = "PYPH_RUN_DATE")
    private Date PYPH_RUN_DATE;

    @Column(name = "PYPH_PROC_YR")
    private Integer PYPH_PROC_YR;

    @Column(name = "PYPH_RATE_PER")
    private Integer PYPH_RATE_PER;

    @Column(name = "PYPH_RATE")
    private Integer PYPH_RATE;

    @Column(name = "PYPH_TAX_BASIS")
    private String PYPH_TAX_BASIS;

    public Integer getPYPH_SYS_ID() {
        return PYPH_SYS_ID;
    }

    public void setPYPH_SYS_ID(Integer PYPH_SYS_ID) {
        this.PYPH_SYS_ID = PYPH_SYS_ID;
    }

    public Integer getPYPH_POL_SYS_ID() {
        return PYPH_POL_SYS_ID;
    }

    public void setPYPH_POL_SYS_ID(Integer PYPH_POL_SYS_ID) {
        this.PYPH_POL_SYS_ID = PYPH_POL_SYS_ID;
    }

    public String getPYPH_POL_NO() {
        return PYPH_POL_NO;
    }

    public void setPYPH_POL_NO(String PYPH_POL_NO) {
        this.PYPH_POL_NO = PYPH_POL_NO;
    }

    public String getPYPH_CUST_NAME() {
        return PYPH_CUST_NAME;
    }

    public void setPYPH_CUST_NAME(String PYPH_CUST_NAME) {
        this.PYPH_CUST_NAME = PYPH_CUST_NAME;
    }

    public Date getPYPH_RUN_DATE() {
        return PYPH_RUN_DATE;
    }

    public void setPYPH_RUN_DATE(Date PYPH_RUN_DATE) {
        this.PYPH_RUN_DATE = PYPH_RUN_DATE;
    }

    public Integer getPYPH_PROC_YR() {
        return PYPH_PROC_YR;
    }

    public void setPYPH_PROC_YR(Integer PYPH_PROC_YR) {
        this.PYPH_PROC_YR = PYPH_PROC_YR;
    }

    public Integer getPYPH_RATE_PER() {
        return PYPH_RATE_PER;
    }

    public void setPYPH_RATE_PER(Integer PYPH_RATE_PER) {
        this.PYPH_RATE_PER = PYPH_RATE_PER;
    }

    public Integer getPYPH_RATE() {
        return PYPH_RATE;
    }

    public void setPYPH_RATE(Integer PYPH_RATE) {
        this.PYPH_RATE = PYPH_RATE;
    }

    public String getPYPH_TAX_BASIS() {
        return PYPH_TAX_BASIS;
    }

    public void setPYPH_TAX_BASIS(String PYPH_TAX_BASIS) {
        this.PYPH_TAX_BASIS = PYPH_TAX_BASIS;
    }
}
