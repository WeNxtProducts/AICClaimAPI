package com.wenxt.claims.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_POL_BROKER_DTL")
public class LT_POL_BROKER_DTL {

    @Id
    @Column(name = "POBD_TRAN_ID", nullable = false)
    private Integer POBD_TRAN_ID;

    @Column(name = "POBD_PBRK_TRAN_ID", nullable = false)
    private Long POBD_PBRK_TRAN_ID;

    @Column(name = "POBD_YEAR_FROM")
    private Integer POBD_YEAR_FROM;

    @Column(name = "POBD_YEAR_TO")
    private Integer POBD_YEAR_TO;

    @Column(name = "POBD_DEL_FLAG", length = 1)
    private String POBD_DEL_FLAG;

    @Column(name = "POBD_INS_DT")
    private Date POBD_INS_DT;

    @Column(name = "POBD_INS_ID", length = 12)
    private String POBD_INS_ID;

    @Column(name = "POBD_MOD_DT")
    private Date POBD_MOD_DT;

    @Column(name = "POBD_MOD_ID", length = 12)
    private String POBD_MOD_ID;

    @Column(name = "POBD_RATE")
    private Double POBD_RATE;

    @Column(name = "POBD_RATE_PER")
    private Integer POBD_RATE_PER;

    @Column(name = "POBD_ORG_COMM_RATE")
    private Double POBD_ORG_COMM_RATE;

    @Column(name = "POBD_COMM_VALUE")
    private Double POBD_COMM_VALUE;

    @Column(name = "POBD_COMM_CODE", length = 12)
    private String POBD_COMM_CODE;

    @Column(name = "POBD_COMM_COVER_CODE", length = 12)
    private String POBD_COMM_COVER_CODE;
    
    public Integer getPOBD_TRAN_ID() {
        return POBD_TRAN_ID;
    }

    public void setPOBD_TRAN_ID(Integer POBD_TRAN_ID) {
        this.POBD_TRAN_ID = POBD_TRAN_ID;
    }

    public Long getPOBD_PBRK_TRAN_ID() {
        return POBD_PBRK_TRAN_ID;
    }

    public void setPOBD_PBRK_TRAN_ID(Long POBD_PBRK_TRAN_ID) {
        this.POBD_PBRK_TRAN_ID = POBD_PBRK_TRAN_ID;
    }

    public Integer getPOBD_YEAR_FROM() {
        return POBD_YEAR_FROM;
    }

    public void setPOBD_YEAR_FROM(Integer POBD_YEAR_FROM) {
        this.POBD_YEAR_FROM = POBD_YEAR_FROM;
    }

    public Integer getPOBD_YEAR_TO() {
        return POBD_YEAR_TO;
    }

    public void setPOBD_YEAR_TO(Integer POBD_YEAR_TO) {
        this.POBD_YEAR_TO = POBD_YEAR_TO;
    }

    public String getPOBD_DEL_FLAG() {
        return POBD_DEL_FLAG;
    }

    public void setPOBD_DEL_FLAG(String POBD_DEL_FLAG) {
        this.POBD_DEL_FLAG = POBD_DEL_FLAG;
    }

    public Date getPOBD_INS_DT() {
        return POBD_INS_DT;
    }

    public void setPOBD_INS_DT(Date POBD_INS_DT) {
        this.POBD_INS_DT = POBD_INS_DT;
    }

    public String getPOBD_INS_ID() {
        return POBD_INS_ID;
    }

    public void setPOBD_INS_ID(String POBD_INS_ID) {
        this.POBD_INS_ID = POBD_INS_ID;
    }

    public Date getPOBD_MOD_DT() {
        return POBD_MOD_DT;
    }

    public void setPOBD_MOD_DT(Date POBD_MOD_DT) {
        this.POBD_MOD_DT = POBD_MOD_DT;
    }

    public String getPOBD_MOD_ID() {
        return POBD_MOD_ID;
    }

    public void setPOBD_MOD_ID(String POBD_MOD_ID) {
        this.POBD_MOD_ID = POBD_MOD_ID;
    }

    public Double getPOBD_RATE() {
        return POBD_RATE;
    }

    public void setPOBD_RATE(Double POBD_RATE) {
        this.POBD_RATE = POBD_RATE;
    }

    public Integer getPOBD_RATE_PER() {
        return POBD_RATE_PER;
    }

    public void setPOBD_RATE_PER(Integer POBD_RATE_PER) {
        this.POBD_RATE_PER = POBD_RATE_PER;
    }

    public Double getPOBD_ORG_COMM_RATE() {
        return POBD_ORG_COMM_RATE;
    }

    public void setPOBD_ORG_COMM_RATE(Double POBD_ORG_COMM_RATE) {
        this.POBD_ORG_COMM_RATE = POBD_ORG_COMM_RATE;
    }

    public Double getPOBD_COMM_VALUE() {
        return POBD_COMM_VALUE;
    }

    public void setPOBD_COMM_VALUE(Double POBD_COMM_VALUE) {
        this.POBD_COMM_VALUE = POBD_COMM_VALUE;
    }

    public String getPOBD_COMM_CODE() {
        return POBD_COMM_CODE;
    }

    public void setPOBD_COMM_CODE(String POBD_COMM_CODE) {
        this.POBD_COMM_CODE = POBD_COMM_CODE;
    }

    public String getPOBD_COMM_COVER_CODE() {
        return POBD_COMM_COVER_CODE;
    }

    public void setPOBD_COMM_COVER_CODE(String POBD_COMM_COVER_CODE) {
        this.POBD_COMM_COVER_CODE = POBD_COMM_COVER_CODE;
    }
}
