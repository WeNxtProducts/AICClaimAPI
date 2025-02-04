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
@Table(name = "LM_GP_PROD_TAX_SETUP")
public class PROD_TAX_SETUP {

    @Id
    @Column(name = "PTSE_SYS_ID")
	@SequenceGenerator(name = "ProductTaxSetupSysIdSeq", sequenceName = "PTSE_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ProductTaxSetupSysIdSeq")
    private Integer PTSE_SYS_ID;

    @Column(name = "PTSE_PROD_SYS_ID")
    private String PTSE_PROD_SYS_ID;

    @Column(name = "PTSE_TYPE")
    private String PTSE_TYPE;

    @Column(name = "PTSE_WDRA_PER_FM")
    private Date PTSE_WDRA_PER_FM;

    @Column(name = "PTSE_WDRA_PER_TO")
    private Date PTSE_WDRA_PER_TO;

    @Column(name = "PTSE_MOD_PYMT")
    private String PTSE_MOD_PYMT;

    @Column(name = "PTSE_APP_ON")
    private String PTSE_APP_ON;

    @Column(name = "PTSE_TAX_SLB_CODE")
    private String PTSE_TAX_SLB_CODE;

    @Column(name = "PTSE_EFF_FM_DT")
    private Date PTSE_EFF_FM_DT;

    @Column(name = "PTSE_EFF_TO_DT")
    private Date PTSE_EFF_TO_DT;

    // Getters and Setters
    public Integer getPTSE_SYS_ID() {
        return PTSE_SYS_ID;
    }

    public void setPTSE_SYS_ID(Integer PTSE_SYS_ID) {
        this.PTSE_SYS_ID = PTSE_SYS_ID;
    }

    public String getPTSE_PROD_SYS_ID() {
        return PTSE_PROD_SYS_ID;
    }

    public void setPTSE_PROD_SYS_ID(String PTSE_PROD_SYS_ID) {
        this.PTSE_PROD_SYS_ID = PTSE_PROD_SYS_ID;
    }

    public String getPTSE_TYPE() {
        return PTSE_TYPE;
    }

    public void setPTSE_TYPE(String PTSE_TYPE) {
        this.PTSE_TYPE = PTSE_TYPE;
    }

    public Date getPTSE_WDRA_PER_FM() {
        return PTSE_WDRA_PER_FM;
    }

    public void setPTSE_WDRA_PER_FM(Date PTSE_WDRA_PER_FM) {
        this.PTSE_WDRA_PER_FM = PTSE_WDRA_PER_FM;
    }

    public Date getPTSE_WDRA_PER_TO() {
        return PTSE_WDRA_PER_TO;
    }

    public void setPTSE_WDRA_PER_TO(Date PTSE_WDRA_PER_TO) {
        this.PTSE_WDRA_PER_TO = PTSE_WDRA_PER_TO;
    }

    public String getPTSE_MOD_PYMT() {
        return PTSE_MOD_PYMT;
    }

    public void setPTSE_MOD_PYMT(String PTSE_MOD_PYMT) {
        this.PTSE_MOD_PYMT = PTSE_MOD_PYMT;
    }

    public String getPTSE_APP_ON() {
        return PTSE_APP_ON;
    }

    public void setPTSE_APP_ON(String PTSE_APP_ON) {
        this.PTSE_APP_ON = PTSE_APP_ON;
    }

    public String getPTSE_TAX_SLB_CODE() {
        return PTSE_TAX_SLB_CODE;
    }

    public void setPTSE_TAX_SLB_CODE(String PTSE_TAX_SLB_CODE) {
        this.PTSE_TAX_SLB_CODE = PTSE_TAX_SLB_CODE;
    }

    public Date getPTSE_EFF_FM_DT() {
        return PTSE_EFF_FM_DT;
    }

    public void setPTSE_EFF_FM_DT(Date PTSE_EFF_FM_DT) {
        this.PTSE_EFF_FM_DT = PTSE_EFF_FM_DT;
    }

    public Date getPTSE_EFF_TO_DT() {
        return PTSE_EFF_TO_DT;
    }

    public void setPTSE_EFF_TO_DT(Date PTSE_EFF_TO_DT) {
        this.PTSE_EFF_TO_DT = PTSE_EFF_TO_DT;
    }
}
