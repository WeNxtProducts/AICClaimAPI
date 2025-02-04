package com.wenxt.claims.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_GP_TAX_SLAB_RATE")
public class LM_GP_TAX_SLAB_RATE {

    @Id
    @Column(name = "PTSR_SYS_ID", nullable = false)
    @SequenceGenerator(name = "TaxSlabRateSysIdSeq", sequenceName = "PTSR_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TaxSlabRateSysIdSeq")
    private Integer PTSR_SYS_ID;

    @Column(name = "PTSR_PROD_SYS_ID")
    private Integer PTSR_PROD_SYS_ID;

    @Column(name = "PTSR_PTSS_SLAB_CODE")
    private String PTSR_PTSS_SLAB_CODE;

    @Column(name = "PTSR_TYPE")
    private String PTSR_TYPE;

    @Column(name = "PTSR_LIMIT")
    private Integer PTSR_LIMIT;

    @Column(name = "PTSR_RATE")
    private Integer PTSR_RATE;

    @Column(name = "PTSR_RATE_PER")
    private Integer PTSR_RATE_PER;

    public Integer getPTSR_SYS_ID() {
        return PTSR_SYS_ID;
    }

    public void setPTSR_SYS_ID(Integer PTSR_SYS_ID) {
        this.PTSR_SYS_ID = PTSR_SYS_ID;
    }

    public Integer getPTSR_PROD_SYS_ID() {
        return PTSR_PROD_SYS_ID;
    }

    public void setPTSR_PROD_SYS_ID(Integer PTSR_PROD_SYS_ID) {
        this.PTSR_PROD_SYS_ID = PTSR_PROD_SYS_ID;
    }

    public String getPTSR_PTSS_SLAB_CODE() {
        return PTSR_PTSS_SLAB_CODE;
    }

    public void setPTSR_PTSS_SLAB_CODE(String PTSR_PTSS_SLAB_CODE) {
        this.PTSR_PTSS_SLAB_CODE = PTSR_PTSS_SLAB_CODE;
    }

    public String getPTSR_TYPE() {
        return PTSR_TYPE;
    }

    public void setPTSR_TYPE(String PTSR_TYPE) {
        this.PTSR_TYPE = PTSR_TYPE;
    }

    public Integer getPTSR_LIMIT() {
        return PTSR_LIMIT;
    }

    public void setPTSR_LIMIT(Integer PTSR_LIMIT) {
        this.PTSR_LIMIT = PTSR_LIMIT;
    }

    public Integer getPTSR_RATE() {
        return PTSR_RATE;
    }

    public void setPTSR_RATE(Integer PTSR_RATE) {
        this.PTSR_RATE = PTSR_RATE;
    }

    public Integer getPTSR_RATE_PER() {
        return PTSR_RATE_PER;
    }

    public void setPTSR_RATE_PER(Integer PTSR_RATE_PER) {
        this.PTSR_RATE_PER = PTSR_RATE_PER;
    }
}
