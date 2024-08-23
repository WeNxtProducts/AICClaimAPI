package com.wenxt.claims.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_POL_STATUS", schema = "LIFE_DEV")
public class LT_POL_STATUS {

    @Column(name = "PSTAT_POL_TRAN_ID")
    private Integer PSTAT_POL_TRAN_ID;

    @Column(name = "PSTAT_END_NO_IDX")
    private Integer PSTAT_END_NO_IDX;

    @Column(name = "PSTAT_PEMP_TRAN_ID")
    private Long PSTAT_PEMP_TRAN_ID;

    @Column(name = "PSTAT_STATUS_DT")
    private Date PSTAT_STATUS_DT;

    @Column(name = "PSTAT_STATUS_CODE", length = 12)
    private String PSTAT_STATUS_CODE;

    @Column(name = "PSTAT_REASON_CODE", length = 12)
    private String PSTAT_REASON_CODE;

    @Column(name = "PSTAT_REMARKS", length = 4000)
    private String PSTAT_REMARKS;

    @Column(name = "PSTAT_STATUS_TYPE", length = 1)
    private String PSTAT_STATUS_TYPE;

    @Column(name = "PSTAT_REMINDER_NO")
    private Integer PSTAT_REMINDER_NO;

    @Column(name = "PSTAT_STATUS_UID", length = 12)
    private String PSTAT_STATUS_UID;

    @Column(name = "PSTAT_REC_TYPE", length = 1)
    private String PSTAT_REC_TYPE;

    @Id
    @Column(name = "PSTAT_INS_ID", length = 12, nullable = false)
    private String PSTAT_INS_ID;

    @Column(name = "PSTAT_INS_DT", nullable = false)
    private Date PSTAT_INS_DT;

    @Column(name = "PSTAT_MOD_ID", length = 12)
    private String PSTAT_MOD_ID;

    @Column(name = "PSTAT_MOD_DT")
    private Date PSTAT_MOD_DT;

    // Getters and Setters
    public Integer getPSTAT_POL_TRAN_ID() {
        return PSTAT_POL_TRAN_ID;
    }

    public void setPSTAT_POL_TRAN_ID(Integer PSTAT_POL_TRAN_ID) {
        this.PSTAT_POL_TRAN_ID = PSTAT_POL_TRAN_ID;
    }

    public Integer getPSTAT_END_NO_IDX() {
        return PSTAT_END_NO_IDX;
    }

    public void setPSTAT_END_NO_IDX(Integer PSTAT_END_NO_IDX) {
        this.PSTAT_END_NO_IDX = PSTAT_END_NO_IDX;
    }

    public Long getPSTAT_PEMP_TRAN_ID() {
        return PSTAT_PEMP_TRAN_ID;
    }

    public void setPSTAT_PEMP_TRAN_ID(Long PSTAT_PEMP_TRAN_ID) {
        this.PSTAT_PEMP_TRAN_ID = PSTAT_PEMP_TRAN_ID;
    }

    public Date getPSTAT_STATUS_DT() {
        return PSTAT_STATUS_DT;
    }

    public void setPSTAT_STATUS_DT(Date PSTAT_STATUS_DT) {
        this.PSTAT_STATUS_DT = PSTAT_STATUS_DT;
    }

    public String getPSTAT_STATUS_CODE() {
        return PSTAT_STATUS_CODE;
    }

    public void setPSTAT_STATUS_CODE(String PSTAT_STATUS_CODE) {
        this.PSTAT_STATUS_CODE = PSTAT_STATUS_CODE;
    }

    public String getPSTAT_REASON_CODE() {
        return PSTAT_REASON_CODE;
    }

    public void setPSTAT_REASON_CODE(String PSTAT_REASON_CODE) {
        this.PSTAT_REASON_CODE = PSTAT_REASON_CODE;
    }

    public String getPSTAT_REMARKS() {
        return PSTAT_REMARKS;
    }

    public void setPSTAT_REMARKS(String PSTAT_REMARKS) {
        this.PSTAT_REMARKS = PSTAT_REMARKS;
    }

    public String getPSTAT_STATUS_TYPE() {
        return PSTAT_STATUS_TYPE;
    }

    public void setPSTAT_STATUS_TYPE(String PSTAT_STATUS_TYPE) {
        this.PSTAT_STATUS_TYPE = PSTAT_STATUS_TYPE;
    }

    public Integer getPSTAT_REMINDER_NO() {
        return PSTAT_REMINDER_NO;
    }

    public void setPSTAT_REMINDER_NO(Integer PSTAT_REMINDER_NO) {
        this.PSTAT_REMINDER_NO = PSTAT_REMINDER_NO;
    }

    public String getPSTAT_STATUS_UID() {
        return PSTAT_STATUS_UID;
    }

    public void setPSTAT_STATUS_UID(String PSTAT_STATUS_UID) {
        this.PSTAT_STATUS_UID = PSTAT_STATUS_UID;
    }

    public String getPSTAT_REC_TYPE() {
        return PSTAT_REC_TYPE;
    }

    public void setPSTAT_REC_TYPE(String PSTAT_REC_TYPE) {
        this.PSTAT_REC_TYPE = PSTAT_REC_TYPE;
    }

    public String getPSTAT_INS_ID() {
        return PSTAT_INS_ID;
    }

    public void setPSTAT_INS_ID(String PSTAT_INS_ID) {
        this.PSTAT_INS_ID = PSTAT_INS_ID;
    }

    public Date getPSTAT_INS_DT() {
        return PSTAT_INS_DT;
    }

    public void setPSTAT_INS_DT(Date PSTAT_INS_DT) {
        this.PSTAT_INS_DT = PSTAT_INS_DT;
    }

    public String getPSTAT_MOD_ID() {
        return PSTAT_MOD_ID;
    }

    public void setPSTAT_MOD_ID(String PSTAT_MOD_ID) {
        this.PSTAT_MOD_ID = PSTAT_MOD_ID;
    }

    public Date getPSTAT_MOD_DT() {
        return PSTAT_MOD_DT;
    }

    public void setPSTAT_MOD_DT(Date PSTAT_MOD_DT) {
        this.PSTAT_MOD_DT = PSTAT_MOD_DT;
    }
}

