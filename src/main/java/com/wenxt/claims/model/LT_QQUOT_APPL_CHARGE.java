package com.wenxt.claims.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "LT_QQUOT_APPL_CHARGE")
public class LT_QQUOT_APPL_CHARGE {

    @Id
    @SequenceGenerator(name = "QuickQuoteApplChargeTranIdSeq", sequenceName = "QQAC_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "QuickQuoteApplChargeTranIdSeq")
    @Column(name = "QQAC_TRAN_ID")
    private Long QQAC_TRAN_ID;

    @Column(name = "QQAC_QUOT_TRAN_ID")
    private Long QQAC_QUOT_TRAN_ID;

    @Column(name = "QQAC_TYPE")
    private String QQAC_TYPE;

    @Column(name = "QQAC_CHRG_CODE")
    private String QQAC_CHRG_CODE;

    @Column(name = "QQAC_FC_CHRG_AMT")
    private BigDecimal QQAC_FC_CHRG_AMT;

    @Column(name = "QQAC_LC_CHRG_AMT")
    private BigDecimal QQAC_LC_CHRG_AMT;

    @Column(name = "QQAC_RATE")
    private BigDecimal QQAC_RATE;

    @Column(name = "QQAC_RATE_PER")
    private Long QQAC_RATE_PER;

    @Column(name = "QQAC_CUST_SHARE_PERC")
    private BigDecimal QQAC_CUST_SHARE_PERC;

    @Column(name = "QQAC_APPLIED_ON")
    private String QQAC_APPLIED_ON;

    @Column(name = "QQAC_APPLY_PERIOD")
    private String QQAC_APPLY_PERIOD;

    @Column(name = "QQAC_INS_DT")
    private Date QQAC_INS_DT;

    @Column(name = "QQAC_INS_ID")
    private String QQAC_INS_ID;

    @Column(name = "QQAC_MOD_DT")
    private Date QQAC_MOD_DT;

    @Column(name = "QQAC_MOD_ID")
    private String QQAC_MOD_ID;

    public Long getQQAC_TRAN_ID() {
        return QQAC_TRAN_ID;
    }

    public void setQQAC_TRAN_ID(Long QQAC_TRAN_ID) {
        this.QQAC_TRAN_ID = QQAC_TRAN_ID;
    }

    public Long getQQAC_QUOT_TRAN_ID() {
        return QQAC_QUOT_TRAN_ID;
    }

    public void setQQAC_QUOT_TRAN_ID(Long QQAC_QUOT_TRAN_ID) {
        this.QQAC_QUOT_TRAN_ID = QQAC_QUOT_TRAN_ID;
    }

    public String getQQAC_TYPE() {
        return QQAC_TYPE;
    }

    public void setQQAC_TYPE(String QQAC_TYPE) {
        this.QQAC_TYPE = QQAC_TYPE;
    }

    public String getQQAC_CHRG_CODE() {
        return QQAC_CHRG_CODE;
    }

    public void setQQAC_CHRG_CODE(String QQAC_CHRG_CODE) {
        this.QQAC_CHRG_CODE = QQAC_CHRG_CODE;
    }

    public BigDecimal getQQAC_FC_CHRG_AMT() {
        return QQAC_FC_CHRG_AMT;
    }

    public void setQQAC_FC_CHRG_AMT(BigDecimal QQAC_FC_CHRG_AMT) {
        this.QQAC_FC_CHRG_AMT = QQAC_FC_CHRG_AMT;
    }

    public BigDecimal getQQAC_LC_CHRG_AMT() {
        return QQAC_LC_CHRG_AMT;
    }

    public void setQQAC_LC_CHRG_AMT(BigDecimal QQAC_LC_CHRG_AMT) {
        this.QQAC_LC_CHRG_AMT = QQAC_LC_CHRG_AMT;
    }

    public BigDecimal getQQAC_RATE() {
        return QQAC_RATE;
    }

    public void setQQAC_RATE(BigDecimal QQAC_RATE) {
        this.QQAC_RATE = QQAC_RATE;
    }

    public Long getQQAC_RATE_PER() {
        return QQAC_RATE_PER;
    }

    public void setQQAC_RATE_PER(Long QQAC_RATE_PER) {
        this.QQAC_RATE_PER = QQAC_RATE_PER;
    }

    public BigDecimal getQQAC_CUST_SHARE_PERC() {
        return QQAC_CUST_SHARE_PERC;
    }

    public void setQQAC_CUST_SHARE_PERC(BigDecimal QQAC_CUST_SHARE_PERC) {
        this.QQAC_CUST_SHARE_PERC = QQAC_CUST_SHARE_PERC;
    }

    public String getQQAC_APPLIED_ON() {
        return QQAC_APPLIED_ON;
    }

    public void setQQAC_APPLIED_ON(String QQAC_APPLIED_ON) {
        this.QQAC_APPLIED_ON = QQAC_APPLIED_ON;
    }

    public String getQQAC_APPLY_PERIOD() {
        return QQAC_APPLY_PERIOD;
    }

    public void setQQAC_APPLY_PERIOD(String QQAC_APPLY_PERIOD) {
        this.QQAC_APPLY_PERIOD = QQAC_APPLY_PERIOD;
    }

    public Date getQQAC_INS_DT() {
        return QQAC_INS_DT;
    }

    public void setQQAC_INS_DT(Date QQAC_INS_DT) {
        this.QQAC_INS_DT = QQAC_INS_DT;
    }

    public String getQQAC_INS_ID() {
        return QQAC_INS_ID;
    }

    public void setQQAC_INS_ID(String QQAC_INS_ID) {
        this.QQAC_INS_ID = QQAC_INS_ID;
    }

    public Date getQQAC_MOD_DT() {
        return QQAC_MOD_DT;
    }

    public void setQQAC_MOD_DT(Date QQAC_MOD_DT) {
        this.QQAC_MOD_DT = QQAC_MOD_DT;
    }

    public String getQQAC_MOD_ID() {
        return QQAC_MOD_ID;
    }

    public void setQQAC_MOD_ID(String QQAC_MOD_ID) {
        this.QQAC_MOD_ID = QQAC_MOD_ID;
    }
}

