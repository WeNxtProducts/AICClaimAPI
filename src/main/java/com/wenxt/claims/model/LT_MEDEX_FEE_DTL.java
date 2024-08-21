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
@Table(name = "LT_MEDEX_FEE_DTL", schema = "LIFE_DEV")
public class LT_MEDEX_FEE_DTL {

    @Id
    @SequenceGenerator(name = "FeeDetailsTranIdSeq", sequenceName = "MFD_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FeeDetailsTranIdSeq")
    @Column(name = "MFD_TRAN_ID", nullable = false)
    private Integer MFD_TRAN_ID;

    @Column(name = "MFD_MH_TRAN_ID", nullable = false)
    private Integer MFD_MH_TRAN_ID;

    @Column(name = "MFD_MD_TRAN_ID", nullable = false)
    private Integer MFD_MD_TRAN_ID;

    @Column(name = "MFD_FEE_CODE")
    private String MFD_FEE_CODE;

    @Column(name = "MFD_EXAM_DT")
    private Date MFD_EXAM_DT;

    @Column(name = "MFD_DOCTOR_CODE")
    private String MFD_DOCTOR_CODE;

    @Column(name = "MFD_CURR_CODE")
    private String MFD_CURR_CODE;

    @Column(name = "MFD_CURR_EXCH_RATE")
    private Double MFD_CURR_EXCH_RATE;

    @Column(name = "MFD_FC_FEE")
    private Double MFD_FC_FEE;

    @Column(name = "MFD_LC_FEE")
    private Double MFD_LC_FEE;

    @Column(name = "MFD_INV_REF_NO")
    private String MFD_INV_REF_NO;

    @Column(name = "MFD_PAID_YN")
    private String MFD_PAID_YN;

    @Column(name = "MFD_FREEZE_YN")
    private String MFD_FREEZE_YN;

    @Column(name = "MFD_TXN_CODE")
    private String MFD_TXN_CODE;

    @Column(name = "MFD_DOC_NO")
    private Integer MFD_DOC_NO;

    @Column(name = "MFD_DOC_DT")
    private Date MFD_DOC_DT;

    @Column(name = "MFD_REMARKS")
    private String MFD_REMARKS;

    @Column(name = "MFD_INS_DT", nullable = false)
    private Date MFD_INS_DT;

    @Column(name = "MFD_INS_ID", nullable = false)
    private String MFD_INS_ID;

    @Column(name = "MFD_MOD_DT")
    private Date MFD_MOD_DT;

    @Column(name = "MFD_MOD_ID")
    private String MFD_MOD_ID;

    @Column(name = "MFD_POL_TRAN_ID")
    private Integer MFD_POL_TRAN_ID;

    @Column(name = "MFD_CLINIC_CODE")
    private String MFD_CLINIC_CODE;

    @Column(name = "MFD_PAY_TO")
    private String MFD_PAY_TO;

    @Column(name = "MFD_PROCESS_YN")
    private String MFD_PROCESS_YN;

    @Column(name = "MFD_EXAM_CODE")
    private String MFD_EXAM_CODE;

    @Column(name = "MFD_PEMP_TRAN_ID")
    private Integer MFD_PEMP_TRAN_ID;

    // Getters and Setters

    public Integer getMFD_TRAN_ID() {
        return MFD_TRAN_ID;
    }

    public void setMFD_TRAN_ID(Integer MFD_TRAN_ID) {
        this.MFD_TRAN_ID = MFD_TRAN_ID;
    }

    public Integer getMFD_MH_TRAN_ID() {
        return MFD_MH_TRAN_ID;
    }

    public void setMFD_MH_TRAN_ID(Integer MFD_MH_TRAN_ID) {
        this.MFD_MH_TRAN_ID = MFD_MH_TRAN_ID;
    }

    public Integer getMFD_MD_TRAN_ID() {
        return MFD_MD_TRAN_ID;
    }

    public void setMFD_MD_TRAN_ID(Integer MFD_MD_TRAN_ID) {
        this.MFD_MD_TRAN_ID = MFD_MD_TRAN_ID;
    }

    public String getMFD_FEE_CODE() {
        return MFD_FEE_CODE;
    }

    public void setMFD_FEE_CODE(String MFD_FEE_CODE) {
        this.MFD_FEE_CODE = MFD_FEE_CODE;
    }

    public Date getMFD_EXAM_DT() {
        return MFD_EXAM_DT;
    }

    public void setMFD_EXAM_DT(Date MFD_EXAM_DT) {
        this.MFD_EXAM_DT = MFD_EXAM_DT;
    }

    public String getMFD_DOCTOR_CODE() {
        return MFD_DOCTOR_CODE;
    }

    public void setMFD_DOCTOR_CODE(String MFD_DOCTOR_CODE) {
        this.MFD_DOCTOR_CODE = MFD_DOCTOR_CODE;
    }

    public String getMFD_CURR_CODE() {
        return MFD_CURR_CODE;
    }

    public void setMFD_CURR_CODE(String MFD_CURR_CODE) {
        this.MFD_CURR_CODE = MFD_CURR_CODE;
    }

    public Double getMFD_CURR_EXCH_RATE() {
        return MFD_CURR_EXCH_RATE;
    }

    public void setMFD_CURR_EXCH_RATE(Double MFD_CURR_EXCH_RATE) {
        this.MFD_CURR_EXCH_RATE = MFD_CURR_EXCH_RATE;
    }

    public Double getMFD_FC_FEE() {
        return MFD_FC_FEE;
    }

    public void setMFD_FC_FEE(Double MFD_FC_FEE) {
        this.MFD_FC_FEE = MFD_FC_FEE;
    }

    public Double getMFD_LC_FEE() {
        return MFD_LC_FEE;
    }

    public void setMFD_LC_FEE(Double MFD_LC_FEE) {
        this.MFD_LC_FEE = MFD_LC_FEE;
    }

    public String getMFD_INV_REF_NO() {
        return MFD_INV_REF_NO;
    }

    public void setMFD_INV_REF_NO(String MFD_INV_REF_NO) {
        this.MFD_INV_REF_NO = MFD_INV_REF_NO;
    }

    public String getMFD_PAID_YN() {
        return MFD_PAID_YN;
    }

    public void setMFD_PAID_YN(String MFD_PAID_YN) {
        this.MFD_PAID_YN = MFD_PAID_YN;
    }

    public String getMFD_FREEZE_YN() {
        return MFD_FREEZE_YN;
    }

    public void setMFD_FREEZE_YN(String MFD_FREEZE_YN) {
        this.MFD_FREEZE_YN = MFD_FREEZE_YN;
    }

    public String getMFD_TXN_CODE() {
        return MFD_TXN_CODE;
    }

    public void setMFD_TXN_CODE(String MFD_TXN_CODE) {
        this.MFD_TXN_CODE = MFD_TXN_CODE;
    }

    public Integer getMFD_DOC_NO() {
        return MFD_DOC_NO;
    }

    public void setMFD_DOC_NO(Integer MFD_DOC_NO) {
        this.MFD_DOC_NO = MFD_DOC_NO;
    }

    public Date getMFD_DOC_DT() {
        return MFD_DOC_DT;
    }

    public void setMFD_DOC_DT(Date MFD_DOC_DT) {
        this.MFD_DOC_DT = MFD_DOC_DT;
    }

    public String getMFD_REMARKS() {
        return MFD_REMARKS;
    }

    public void setMFD_REMARKS(String MFD_REMARKS) {
        this.MFD_REMARKS = MFD_REMARKS;
    }

    public Date getMFD_INS_DT() {
        return MFD_INS_DT;
    }

    public void setMFD_INS_DT(Date MFD_INS_DT) {
        this.MFD_INS_DT = MFD_INS_DT;
    }

    public String getMFD_INS_ID() {
        return MFD_INS_ID;
    }

    public void setMFD_INS_ID(String MFD_INS_ID) {
        this.MFD_INS_ID = MFD_INS_ID;
    }

    public Date getMFD_MOD_DT() {
        return MFD_MOD_DT;
    }

    public void setMFD_MOD_DT(Date MFD_MOD_DT) {
        this.MFD_MOD_DT = MFD_MOD_DT;
    }

    public String getMFD_MOD_ID() {
        return MFD_MOD_ID;
    }

    public void setMFD_MOD_ID(String MFD_MOD_ID) {
        this.MFD_MOD_ID = MFD_MOD_ID;
    }

    public Integer getMFD_POL_TRAN_ID() {
        return MFD_POL_TRAN_ID;
    }

    public void setMFD_POL_TRAN_ID(Integer MFD_POL_TRAN_ID) {
        this.MFD_POL_TRAN_ID = MFD_POL_TRAN_ID;
    }

    public String getMFD_CLINIC_CODE() {
        return MFD_CLINIC_CODE;
    }

    public void setMFD_CLINIC_CODE(String MFD_CLINIC_CODE) {
        this.MFD_CLINIC_CODE = MFD_CLINIC_CODE;
    }

    public String getMFD_PAY_TO() {
        return MFD_PAY_TO;
    }

    public void setMFD_PAY_TO(String MFD_PAY_TO) {
        this.MFD_PAY_TO = MFD_PAY_TO;
    }

    public String getMFD_PROCESS_YN() {
        return MFD_PROCESS_YN;
    }

    public void setMFD_PROCESS_YN(String MFD_PROCESS_YN) {
        this.MFD_PROCESS_YN = MFD_PROCESS_YN;
    }

    public String getMFD_EXAM_CODE() {
        return MFD_EXAM_CODE;
    }

    public void setMFD_EXAM_CODE(String MFD_EXAM_CODE) {
        this.MFD_EXAM_CODE = MFD_EXAM_CODE;
    }

    public Integer getMFD_PEMP_TRAN_ID() {
        return MFD_PEMP_TRAN_ID;
    }

    public void setMFD_PEMP_TRAN_ID(Integer MFD_PEMP_TRAN_ID) {
        this.MFD_PEMP_TRAN_ID = MFD_PEMP_TRAN_ID;
    }
}
