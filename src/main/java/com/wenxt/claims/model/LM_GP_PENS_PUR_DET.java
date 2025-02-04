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
@Table(name = "LM_GP_PENS_PUR_DET", schema = "LIFE_DEV")
public class LM_GP_PENS_PUR_DET {

    @Id
    @Column(name = "PEPD_SYS_ID")
    @SequenceGenerator(name = "PensionPurchaseDetailsSysIdSeq", sequenceName = "PEPD_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PensionPurchaseDetailsSysIdSeq")
    private Integer PEPD_SYS_ID;

    @Column(name = "PEPD_POL_SYS_ID")
    private Integer PEPD_POL_SYS_ID;

    @Column(name = "PEPD_POL_YR")
    private Integer PEPD_POL_YR;

    @Column(name = "PEPD_PROC_DT")
    private Date PEPD_PROC_DT;

    @Column(name = "PEPD_EMP_PEN_PUR_AMT")
    private Integer PEPD_EMP_PEN_PUR_AMT;

    @Column(name = "PEPD_EMPR_PEN_PUR_AMT")
    private Integer PEPD_EMPR_PEN_PUR_AMT;

    @Column(name = "PEPD_TOTAL")
    private Integer PEPD_TOTAL;

    public Integer getPEPD_SYS_ID() {
        return PEPD_SYS_ID;
    }

    public void setPEPD_SYS_ID(Integer PEPD_SYS_ID) {
        this.PEPD_SYS_ID = PEPD_SYS_ID;
    }

    public Integer getPEPD_POL_SYS_ID() {
        return PEPD_POL_SYS_ID;
    }

    public void setPEPD_POL_SYS_ID(Integer PEPD_POL_SYS_ID) {
        this.PEPD_POL_SYS_ID = PEPD_POL_SYS_ID;
    }

    public Integer getPEPD_POL_YR() {
        return PEPD_POL_YR;
    }

    public void setPEPD_POL_YR(Integer PEPD_POL_YR) {
        this.PEPD_POL_YR = PEPD_POL_YR;
    }

    public Date getPEPD_PROC_DT() {
        return PEPD_PROC_DT;
    }

    public void setPEPD_PROC_DT(Date PEPD_PROC_DT) {
        this.PEPD_PROC_DT = PEPD_PROC_DT;
    }

    public Integer getPEPD_EMP_PEN_PUR_AMT() {
        return PEPD_EMP_PEN_PUR_AMT;
    }

    public void setPEPD_EMP_PEN_PUR_AMT(Integer PEPD_EMP_PEN_PUR_AMT) {
        this.PEPD_EMP_PEN_PUR_AMT = PEPD_EMP_PEN_PUR_AMT;
    }

    public Integer getPEPD_EMPR_PEN_PUR_AMT() {
        return PEPD_EMPR_PEN_PUR_AMT;
    }

    public void setPEPD_EMPR_PEN_PUR_AMT(Integer PEPD_EMPR_PEN_PUR_AMT) {
        this.PEPD_EMPR_PEN_PUR_AMT = PEPD_EMPR_PEN_PUR_AMT;
    }

    public Integer getPEPD_TOTAL() {
        return PEPD_TOTAL;
    }

    public void setPEPD_TOTAL(Integer PEPD_TOTAL) {
        this.PEPD_TOTAL = PEPD_TOTAL;
    }
}
