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
@Table(name = "LM_GP_PYMT_DETAILS")
public class LM_GP_PYMT_DETAILS {

    @Id
    @Column(name = "PPTD_SYS_ID")
    @SequenceGenerator(name = "PensionPaymentDetailsSysIdSeq", sequenceName = "PPTD_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PensionPaymentDetailsSysIdSeq")
    private Integer PPTD_SYS_ID;

    @Column(name = "PPTD_PWPH_SYS_ID")
    private Integer PPTD_PWPH_SYS_ID;

    @Column(name = "PPTD_PMPH_SYS_ID")
    private Integer PPTD_PMPH_SYS_ID;

    @Column(name = "PPTD_PYMT_DT")
    private Date PPTD_PYMT_DT;

    @Column(name = "PPTD_CURR_CODE")
    private String PPTD_CURR_CODE;

    @Column(name = "PPTD_PAID_FC_AMT")
    private Integer PPTD_PAID_FC_AMT;

    @Column(name = "PPTD_DRF_CHQ_NO")
    private String PPTD_DRF_CHQ_NO;

    @Column(name = "PPTD_BANK_NAME")
    private String PPTD_BANK_NAME;

    @Column(name = "PPTD_CUST_NAME")
    private String PPTD_CUST_NAME;

    @Column(name = "PPTD_CUST_ADD1")
    private String PPTD_CUST_ADD1;

    @Column(name = "PPTD_REMARKS")
    private String PPTD_REMARKS;

    @Column(name = "PPTD_PYMT_MODE")
    private String PPTD_PYMT_MODE;

    @Column(name = "PPTD_CURR_EXCH_RT")
    private Integer PPTD_CURR_EXCH_RT;

    @Column(name = "PPTD_PAID_LC_AMT")
    private Integer PPTD_PAID_LC_AMT;

    @Column(name = "PPTD_DRF_CHQ_DT")
    private Date PPTD_DRF_CHQ_DT;

    @Column(name = "PPTD_BRN_NAME")
    private String PPTD_BRN_NAME;

    @Column(name = "PPTD_CUST_ADD2")
    private String PPTD_CUST_ADD2;

    @Column(name = "PPTD_CUST_ADD3")
    private String PPTD_CUST_ADD3;

    // Getters and Setters
    public Integer getPPTD_SYS_ID() {
        return PPTD_SYS_ID;
    }

    public void setPPTD_SYS_ID(Integer PPTD_SYS_ID) {
        this.PPTD_SYS_ID = PPTD_SYS_ID;
    }

    public Integer getPPTD_PWPH_SYS_ID() {
        return PPTD_PWPH_SYS_ID;
    }

    public void setPPTD_PWPH_SYS_ID(Integer PPTD_PWPH_SYS_ID) {
        this.PPTD_PWPH_SYS_ID = PPTD_PWPH_SYS_ID;
    }

    public Integer getPPTD_PMPH_SYS_ID() {
        return PPTD_PMPH_SYS_ID;
    }

    public void setPPTD_PMPH_SYS_ID(Integer PPTD_PMPH_SYS_ID) {
        this.PPTD_PMPH_SYS_ID = PPTD_PMPH_SYS_ID;
    }

    public Date getPPTD_PYMT_DT() {
        return PPTD_PYMT_DT;
    }

    public void setPPTD_PYMT_DT(Date PPTD_PYMT_DT) {
        this.PPTD_PYMT_DT = PPTD_PYMT_DT;
    }

    public String getPPTD_CURR_CODE() {
        return PPTD_CURR_CODE;
    }

    public void setPPTD_CURR_CODE(String PPTD_CURR_CODE) {
        this.PPTD_CURR_CODE = PPTD_CURR_CODE;
    }

    public Integer getPPTD_PAID_FC_AMT() {
        return PPTD_PAID_FC_AMT;
    }

    public void setPPTD_PAID_FC_AMT(Integer PPTD_PAID_FC_AMT) {
        this.PPTD_PAID_FC_AMT = PPTD_PAID_FC_AMT;
    }

    public String getPPTD_DRF_CHQ_NO() {
        return PPTD_DRF_CHQ_NO;
    }

    public void setPPTD_DRF_CHQ_NO(String PPTD_DRF_CHQ_NO) {
        this.PPTD_DRF_CHQ_NO = PPTD_DRF_CHQ_NO;
    }

    public String getPPTD_BANK_NAME() {
        return PPTD_BANK_NAME;
    }

    public void setPPTD_BANK_NAME(String PPTD_BANK_NAME) {
        this.PPTD_BANK_NAME = PPTD_BANK_NAME;
    }

    public String getPPTD_CUST_NAME() {
        return PPTD_CUST_NAME;
    }

    public void setPPTD_CUST_NAME(String PPTD_CUST_NAME) {
        this.PPTD_CUST_NAME = PPTD_CUST_NAME;
    }

    public String getPPTD_CUST_ADD1() {
        return PPTD_CUST_ADD1;
    }

    public void setPPTD_CUST_ADD1(String PPTD_CUST_ADD1) {
        this.PPTD_CUST_ADD1 = PPTD_CUST_ADD1;
    }

    public String getPPTD_REMARKS() {
        return PPTD_REMARKS;
    }

    public void setPPTD_REMARKS(String PPTD_REMARKS) {
        this.PPTD_REMARKS = PPTD_REMARKS;
    }

    public String getPPTD_PYMT_MODE() {
        return PPTD_PYMT_MODE;
    }

    public void setPPTD_PYMT_MODE(String PPTD_PYMT_MODE) {
        this.PPTD_PYMT_MODE = PPTD_PYMT_MODE;
    }

    public Integer getPPTD_CURR_EXCH_RT() {
        return PPTD_CURR_EXCH_RT;
    }

    public void setPPTD_CURR_EXCH_RT(Integer PPTD_CURR_EXCH_RT) {
        this.PPTD_CURR_EXCH_RT = PPTD_CURR_EXCH_RT;
    }

    public Integer getPPTD_PAID_LC_AMT() {
        return PPTD_PAID_LC_AMT;
    }

    public void setPPTD_PAID_LC_AMT(Integer PPTD_PAID_LC_AMT) {
        this.PPTD_PAID_LC_AMT = PPTD_PAID_LC_AMT;
    }

    public Date getPPTD_DRF_CHQ_DT() {
        return PPTD_DRF_CHQ_DT;
    }

    public void setPPTD_DRF_CHQ_DT(Date PPTD_DRF_CHQ_DT) {
        this.PPTD_DRF_CHQ_DT = PPTD_DRF_CHQ_DT;
    }

    public String getPPTD_BRN_NAME() {
        return PPTD_BRN_NAME;
    }

    public void setPPTD_BRN_NAME(String PPTD_BRN_NAME) {
        this.PPTD_BRN_NAME = PPTD_BRN_NAME;
    }

    public String getPPTD_CUST_ADD2() {
        return PPTD_CUST_ADD2;
    }

    public void setPPTD_CUST_ADD2(String PPTD_CUST_ADD2) {
        this.PPTD_CUST_ADD2 = PPTD_CUST_ADD2;
    }

    public String getPPTD_CUST_ADD3() {
        return PPTD_CUST_ADD3;
    }

    public void setPPTD_CUST_ADD3(String PPTD_CUST_ADD3) {
        this.PPTD_CUST_ADD3 = PPTD_CUST_ADD3;
    }
}
