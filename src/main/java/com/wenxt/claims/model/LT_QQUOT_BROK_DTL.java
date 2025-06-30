package com.wenxt.claims.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "LT_QQUOT_BROK_DTL")
public class LT_QQUOT_BROK_DTL {

    @Id
    @SequenceGenerator(name = "QuickQuoteBrokerDetailTranIdSeq", sequenceName = "QQBD_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "QuickQuoteBrokerDetailTranIdSeq")
    @Column(name = "QQBD_TRAN_ID")
    private Long QQBD_TRAN_ID;

    @Column(name = "QQBD_QQBH_TRAN_ID")
    private Long QQBD_QQBH_TRAN_ID;

    @Column(name = "QQBD_YEAR_FROM")
    private Integer QQBD_YEAR_FROM;

    @Column(name = "QQBD_YEAR_TO")
    private Integer QQBD_YEAR_TO;

    @Column(name = "QQBD_DEL_FLAG")
    private String QQBD_DEL_FLAG;

    @Column(name = "QQBD_INS_DT")
    private Date QQBD_INS_DT;

    @Column(name = "QQBD_INS_ID")
    private String QQBD_INS_ID;

    @Column(name = "QQBD_MOD_DT")
    private Date QQBD_MOD_DT;

    @Column(name = "QQBD_MOD_ID")
    private String QQBD_MOD_ID;

    @Column(name = "QQBD_RATE")
    private BigDecimal QQBD_RATE;

    @Column(name = "QQBD_RATE_PER")
    private Long QQBD_RATE_PER;

    @Column(name = "QQBD_ORG_RATE")
    private BigDecimal QQBD_ORG_RATE;

    public Long getQQBD_TRAN_ID() {
        return QQBD_TRAN_ID;
    }

    public void setQQBD_TRAN_ID(Long QQBD_TRAN_ID) {
        this.QQBD_TRAN_ID = QQBD_TRAN_ID;
    }

    public Long getQQBD_QQBH_TRAN_ID() {
        return QQBD_QQBH_TRAN_ID;
    }

    public void setQQBD_QQBH_TRAN_ID(Long QQBD_QQBH_TRAN_ID) {
        this.QQBD_QQBH_TRAN_ID = QQBD_QQBH_TRAN_ID;
    }

    public Integer getQQBD_YEAR_FROM() {
        return QQBD_YEAR_FROM;
    }

    public void setQQBD_YEAR_FROM(Integer QQBD_YEAR_FROM) {
        this.QQBD_YEAR_FROM = QQBD_YEAR_FROM;
    }

    public Integer getQQBD_YEAR_TO() {
        return QQBD_YEAR_TO;
    }

    public void setQQBD_YEAR_TO(Integer QQBD_YEAR_TO) {
        this.QQBD_YEAR_TO = QQBD_YEAR_TO;
    }

    public String getQQBD_DEL_FLAG() {
        return QQBD_DEL_FLAG;
    }

    public void setQQBD_DEL_FLAG(String QQBD_DEL_FLAG) {
        this.QQBD_DEL_FLAG = QQBD_DEL_FLAG;
    }

    public Date getQQBD_INS_DT() {
        return QQBD_INS_DT;
    }

    public void setQQBD_INS_DT(Date QQBD_INS_DT) {
        this.QQBD_INS_DT = QQBD_INS_DT;
    }

    public String getQQBD_INS_ID() {
        return QQBD_INS_ID;
    }

    public void setQQBD_INS_ID(String QQBD_INS_ID) {
        this.QQBD_INS_ID = QQBD_INS_ID;
    }

    public Date getQQBD_MOD_DT() {
        return QQBD_MOD_DT;
    }

    public void setQQBD_MOD_DT(Date QQBD_MOD_DT) {
        this.QQBD_MOD_DT = QQBD_MOD_DT;
    }

    public String getQQBD_MOD_ID() {
        return QQBD_MOD_ID;
    }

    public void setQQBD_MOD_ID(String QQBD_MOD_ID) {
        this.QQBD_MOD_ID = QQBD_MOD_ID;
    }

    public BigDecimal getQQBD_RATE() {
        return QQBD_RATE;
    }

    public void setQQBD_RATE(BigDecimal QQBD_RATE) {
        this.QQBD_RATE = QQBD_RATE;
    }

    public Long getQQBD_RATE_PER() {
        return QQBD_RATE_PER;
    }

    public void setQQBD_RATE_PER(Long QQBD_RATE_PER) {
        this.QQBD_RATE_PER = QQBD_RATE_PER;
    }

    public BigDecimal getQQBD_ORG_RATE() {
        return QQBD_ORG_RATE;
    }

    public void setQQBD_ORG_RATE(BigDecimal QQBD_ORG_RATE) {
        this.QQBD_ORG_RATE = QQBD_ORG_RATE;
    }
}

