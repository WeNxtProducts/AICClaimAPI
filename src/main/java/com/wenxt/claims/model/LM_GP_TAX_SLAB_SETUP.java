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
@Table(name = "LM_GP_TAX_SLAB_SETUP")
public class LM_GP_TAX_SLAB_SETUP{

    @Id
    @Column(name = "PTSS_SYS_ID", nullable = false)
    @SequenceGenerator(name = "ProductTaxSlabSetupSysIdSeq", sequenceName = "PTSS_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ProductTaxSlabSetupSysIdSeq")
    private Integer PTSS_SYS_ID;

    @Column(name = "PTSS_PROD_SYS_ID")
    private Integer PTSS_PROD_SYS_ID;

    @Column(name = "PTSS_SLAB_CODE")
    private String PTSS_SLAB_CODE;

    @Column(name = "PTSS_DESC")
    private String PTSS_DESC;

    @Column(name = "PTSS_SHORT_DESC")
    private String PTSS_SHORT_DESC;

    @Column(name = "PTSS_LONG_DESC")
    private String PTSS_LONG_DESC;

    @Column(name = "PTSS_EFF_FM_DT")
    private Date PTSS_EFF_FM_DT;

    @Column(name = "PTSS_EFF_TO_DT")
    private Date PTSS_EFF_TO_DT;

    public Integer getPTSS_SYS_ID() {
        return PTSS_SYS_ID;
    }

    public void setPTSS_SYS_ID(Integer PTSS_SYS_ID) {
        this.PTSS_SYS_ID = PTSS_SYS_ID;
    }

    public Integer getPTSS_PROD_SYS_ID() {
        return PTSS_PROD_SYS_ID;
    }

    public void setPTSS_PROD_SYS_ID(Integer PTSS_PROD_SYS_ID) {
        this.PTSS_PROD_SYS_ID = PTSS_PROD_SYS_ID;
    }

    public String getPTSS_SLAB_CODE() {
        return PTSS_SLAB_CODE;
    }

    public void setPTSS_SLAB_CODE(String PTSS_SLAB_CODE) {
        this.PTSS_SLAB_CODE = PTSS_SLAB_CODE;
    }

    public String getPTSS_DESC() {
        return PTSS_DESC;
    }

    public void setPTSS_DESC(String PTSS_DESC) {
        this.PTSS_DESC = PTSS_DESC;
    }

    public String getPTSS_SHORT_DESC() {
        return PTSS_SHORT_DESC;
    }

    public void setPTSS_SHORT_DESC(String PTSS_SHORT_DESC) {
        this.PTSS_SHORT_DESC = PTSS_SHORT_DESC;
    }

    public String getPTSS_LONG_DESC() {
        return PTSS_LONG_DESC;
    }

    public void setPTSS_LONG_DESC(String PTSS_LONG_DESC) {
        this.PTSS_LONG_DESC = PTSS_LONG_DESC;
    }

    public Date getPTSS_EFF_FM_DT() {
        return PTSS_EFF_FM_DT;
    }

    public void setPTSS_EFF_FM_DT(Date PTSS_EFF_FM_DT) {
        this.PTSS_EFF_FM_DT = PTSS_EFF_FM_DT;
    }

    public Date getPTSS_EFF_TO_DT() {
        return PTSS_EFF_TO_DT;
    }

    public void setPTSS_EFF_TO_DT(Date PTSS_EFF_TO_DT) {
        this.PTSS_EFF_TO_DT = PTSS_EFF_TO_DT;
    }
}
