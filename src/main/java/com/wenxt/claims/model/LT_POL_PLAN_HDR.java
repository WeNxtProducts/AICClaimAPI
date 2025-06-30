package com.wenxt.claims.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "LT_POL_PLAN_HDR", schema = "LIFE_DEV")
public class LT_POL_PLAN_HDR {

    @Id
    @Column(name = "PPH_TRAN_ID", nullable = false)
    private Long PPH_TRAN_ID;

    @Column(name = "PPH_POL_TRAN_ID")
    private Long PPH_POL_TRAN_ID;

    @Column(name = "PPH_PROD_CODE", length = 12)
    private String PPH_PROD_CODE;

    @Column(name = "PPH_PLAN_CODE", length = 12)
    private String PPH_PLAN_CODE;

    @Temporal(TemporalType.DATE)
    @Column(name = "PPH_INS_DT")
    private Date PPH_INS_DT;

    @Column(name = "PPH_INS_ID", length = 12)
    private String PPH_INS_ID;

    @Column(name = "PPH_MOD_ID", length = 12)
    private String PPH_MOD_ID;

    @Temporal(TemporalType.DATE)
    @Column(name = "PPH_MOD_DT")
    private Date PPH_MOD_DT;

    @Column(name = "PPH_DEFAULT_YN", length = 1)
    private String PPH_DEFAULT_YN;

    @Column(name = "PPH_DEL_FLAG", length = 1)
    private String PPH_DEL_FLAG;

    @Column(name = "PPH_REC_TYPE", length = 1)
    private String PPH_REC_TYPE;

    @Column(name = "PPH_CUST_PROF", length = 200)
    private String PPH_CUST_PROF;

    @Column(name = "PPH_YR_LIMIT", precision = 12, scale = 3)
    private BigDecimal PPH_YR_LIMIT;

    @Column(name = "PPH_PLAN_DESC", length = 2000)
    private String PPH_PLAN_DESC;

    // Getters and Setters

    public Long getPPH_TRAN_ID() {
        return PPH_TRAN_ID;
    }

    public void setPPH_TRAN_ID(Long PPH_TRAN_ID) {
        this.PPH_TRAN_ID = PPH_TRAN_ID;
    }

    public Long getPPH_POL_TRAN_ID() {
        return PPH_POL_TRAN_ID;
    }

    public void setPPH_POL_TRAN_ID(Long PPH_POL_TRAN_ID) {
        this.PPH_POL_TRAN_ID = PPH_POL_TRAN_ID;
    }

    public String getPPH_PROD_CODE() {
        return PPH_PROD_CODE;
    }

    public void setPPH_PROD_CODE(String PPH_PROD_CODE) {
        this.PPH_PROD_CODE = PPH_PROD_CODE;
    }

    public String getPPH_PLAN_CODE() {
        return PPH_PLAN_CODE;
    }

    public void setPPH_PLAN_CODE(String PPH_PLAN_CODE) {
        this.PPH_PLAN_CODE = PPH_PLAN_CODE;
    }

    public Date getPPH_INS_DT() {
        return PPH_INS_DT;
    }

    public void setPPH_INS_DT(Date PPH_INS_DT) {
        this.PPH_INS_DT = PPH_INS_DT;
    }

    public String getPPH_INS_ID() {
        return PPH_INS_ID;
    }

    public void setPPH_INS_ID(String PPH_INS_ID) {
        this.PPH_INS_ID = PPH_INS_ID;
    }

    public String getPPH_MOD_ID() {
        return PPH_MOD_ID;
    }

    public void setPPH_MOD_ID(String PPH_MOD_ID) {
        this.PPH_MOD_ID = PPH_MOD_ID;
    }

    public Date getPPH_MOD_DT() {
        return PPH_MOD_DT;
    }

    public void setPPH_MOD_DT(Date PPH_MOD_DT) {
        this.PPH_MOD_DT = PPH_MOD_DT;
    }

    public String getPPH_DEFAULT_YN() {
        return PPH_DEFAULT_YN;
    }

    public void setPPH_DEFAULT_YN(String PPH_DEFAULT_YN) {
        this.PPH_DEFAULT_YN = PPH_DEFAULT_YN;
    }

    public String getPPH_DEL_FLAG() {
        return PPH_DEL_FLAG;
    }

    public void setPPH_DEL_FLAG(String PPH_DEL_FLAG) {
        this.PPH_DEL_FLAG = PPH_DEL_FLAG;
    }

    public String getPPH_REC_TYPE() {
        return PPH_REC_TYPE;
    }

    public void setPPH_REC_TYPE(String PPH_REC_TYPE) {
        this.PPH_REC_TYPE = PPH_REC_TYPE;
    }

    public String getPPH_CUST_PROF() {
        return PPH_CUST_PROF;
    }

    public void setPPH_CUST_PROF(String PPH_CUST_PROF) {
        this.PPH_CUST_PROF = PPH_CUST_PROF;
    }

    public BigDecimal getPPH_YR_LIMIT() {
        return PPH_YR_LIMIT;
    }

    public void setPPH_YR_LIMIT(BigDecimal PPH_YR_LIMIT) {
        this.PPH_YR_LIMIT = PPH_YR_LIMIT;
    }

    public String getPPH_PLAN_DESC() {
        return PPH_PLAN_DESC;
    }

    public void setPPH_PLAN_DESC(String PPH_PLAN_DESC) {
        this.PPH_PLAN_DESC = PPH_PLAN_DESC;
    }
}

