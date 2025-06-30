package com.wenxt.claims.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "LT_QQUOT_CONDITION")
public class LT_QQUOT_CONDITION {

    @Id
    @Column(name = "QQCOND_TRAN_ID")
    private Long QQCOND_TRAN_ID;

    @Column(name = "QQCOND_QUOT_TRAN_ID")
    private Long QQCOND_QUOT_TRAN_ID;

    @Column(name = "QQCOND_CODE")
    private String QQCOND_CODE;

    @Column(name = "QQCOND_DESC")
    private String QQCOND_DESC;

    @Column(name = "QQCOND_DEL_FLAG")
    private String QQCOND_DEL_FLAG;

    @Column(name = "QQCOND_INS_DT")
    private Date QQCOND_INS_DT;

    @Column(name = "QQCOND_INS_ID")
    private String QQCOND_INS_ID;

    @Column(name = "QQCOND_MOD_DT")
    private Date QQCOND_MOD_DT;

    @Column(name = "QQCOND_MOD_ID")
    private String QQCOND_MOD_ID;

    @Column(name = "QQCOND_COVER_CODE")
    private String QQCOND_COVER_CODE;

    @Column(name = "QQCOND_COND_TYP")
    private String QQCOND_COND_TYP;

    @Column(name = "QQCOND_DISP_SEQ_NO")
    private Long QQCOND_DISP_SEQ_NO;

    public Long getQQCOND_TRAN_ID() {
        return QQCOND_TRAN_ID;
    }

    public void setQQCOND_TRAN_ID(Long QQCOND_TRAN_ID) {
        this.QQCOND_TRAN_ID = QQCOND_TRAN_ID;
    }

    public Long getQQCOND_QUOT_TRAN_ID() {
        return QQCOND_QUOT_TRAN_ID;
    }

    public void setQQCOND_QUOT_TRAN_ID(Long QQCOND_QUOT_TRAN_ID) {
        this.QQCOND_QUOT_TRAN_ID = QQCOND_QUOT_TRAN_ID;
    }

    public String getQQCOND_CODE() {
        return QQCOND_CODE;
    }

    public void setQQCOND_CODE(String QQCOND_CODE) {
        this.QQCOND_CODE = QQCOND_CODE;
    }

    public String getQQCOND_DESC() {
        return QQCOND_DESC;
    }

    public void setQQCOND_DESC(String QQCOND_DESC) {
        this.QQCOND_DESC = QQCOND_DESC;
    }

    public String getQQCOND_DEL_FLAG() {
        return QQCOND_DEL_FLAG;
    }

    public void setQQCOND_DEL_FLAG(String QQCOND_DEL_FLAG) {
        this.QQCOND_DEL_FLAG = QQCOND_DEL_FLAG;
    }

    public Date getQQCOND_INS_DT() {
        return QQCOND_INS_DT;
    }

    public void setQQCOND_INS_DT(Date QQCOND_INS_DT) {
        this.QQCOND_INS_DT = QQCOND_INS_DT;
    }

    public String getQQCOND_INS_ID() {
        return QQCOND_INS_ID;
    }

    public void setQQCOND_INS_ID(String QQCOND_INS_ID) {
        this.QQCOND_INS_ID = QQCOND_INS_ID;
    }

    public Date getQQCOND_MOD_DT() {
        return QQCOND_MOD_DT;
    }

    public void setQQCOND_MOD_DT(Date QQCOND_MOD_DT) {
        this.QQCOND_MOD_DT = QQCOND_MOD_DT;
    }

    public String getQQCOND_MOD_ID() {
        return QQCOND_MOD_ID;
    }

    public void setQQCOND_MOD_ID(String QQCOND_MOD_ID) {
        this.QQCOND_MOD_ID = QQCOND_MOD_ID;
    }

    public String getQQCOND_COVER_CODE() {
        return QQCOND_COVER_CODE;
    }

    public void setQQCOND_COVER_CODE(String QQCOND_COVER_CODE) {
        this.QQCOND_COVER_CODE = QQCOND_COVER_CODE;
    }

    public String getQQCOND_COND_TYP() {
        return QQCOND_COND_TYP;
    }

    public void setQQCOND_COND_TYP(String QQCOND_COND_TYP) {
        this.QQCOND_COND_TYP = QQCOND_COND_TYP;
    }

    public Long getQQCOND_DISP_SEQ_NO() {
        return QQCOND_DISP_SEQ_NO;
    }

    public void setQQCOND_DISP_SEQ_NO(Long QQCOND_DISP_SEQ_NO) {
        this.QQCOND_DISP_SEQ_NO = QQCOND_DISP_SEQ_NO;
    }
}

