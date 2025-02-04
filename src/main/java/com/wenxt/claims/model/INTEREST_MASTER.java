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
@Table(name = "LM_GP_INTEREST_MASTER")
public class INTEREST_MASTER {

    @Id
    @Column(name = "INMR_SYS_ID")
	@SequenceGenerator(name = "InterestMasterSysIdSeq", sequenceName = "INMR_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "InterestMasterSysIdSeq")
    private Integer INMR_SYS_ID;

    @Column(name = "INMR_PROD_SYS_ID")
    private String INMR_PROD_SYS_ID;

    @Column(name = "INMR_TYPE")
    private String INMR_TYPE;

    @Column(name = "INMR_YEAR")
    private Integer INMR_YEAR;

    @Column(name = "INMR_EFF_FM_DT")
    private Date INMR_EFF_FM_DT;

    @Column(name = "INMR_EFF_TO_DT")
    private Date INMR_EFF_TO_DT;

    @Column(name = "INMR_RATE")
    private Integer INMR_RATE;

    @Column(name = "INMR_RATE_PER")
    private Integer INMR_RATE_PER;

    public Integer getINMR_SYS_ID() {
        return INMR_SYS_ID;
    }

    public void setINMR_SYS_ID(Integer INMR_SYS_ID) {
        this.INMR_SYS_ID = INMR_SYS_ID;
    }

    public String getINMR_PROD_SYS_ID() {
        return INMR_PROD_SYS_ID;
    }

    public void setINMR_PROD_SYS_ID(String INMR_PROD_SYS_ID) {
        this.INMR_PROD_SYS_ID = INMR_PROD_SYS_ID;
    }

    public String getINMR_TYPE() {
        return INMR_TYPE;
    }

    public void setINMR_TYPE(String INMR_TYPE) {
        this.INMR_TYPE = INMR_TYPE;
    }

    public Integer getINMR_YEAR() {
        return INMR_YEAR;
    }

    public void setINMR_YEAR(Integer INMR_YEAR) {
        this.INMR_YEAR = INMR_YEAR;
    }

    public Date getINMR_EFF_FM_DT() {
        return INMR_EFF_FM_DT;
    }

    public void setINMR_EFF_FM_DT(Date INMR_EFF_FM_DT) {
        this.INMR_EFF_FM_DT = INMR_EFF_FM_DT;
    }

    public Date getINMR_EFF_TO_DT() {
        return INMR_EFF_TO_DT;
    }

    public void setINMR_EFF_TO_DT(Date INMR_EFF_TO_DT) {
        this.INMR_EFF_TO_DT = INMR_EFF_TO_DT;
    }

    public Integer getINMR_RATE() {
        return INMR_RATE;
    }

    public void setINMR_RATE(Integer INMR_RATE) {
        this.INMR_RATE = INMR_RATE;
    }

    public Integer getINMR_RATE_PER() {
        return INMR_RATE_PER;
    }

    public void setINMR_RATE_PER(Integer INMR_RATE_PER) {
        this.INMR_RATE_PER = INMR_RATE_PER;
    }
}
