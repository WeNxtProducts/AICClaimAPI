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
@Table(name = "LM_GP_PROD_FACTORS")
public class PROD_FACTORS {
	
	@Id
	@Column(name = "FACT_SYS_ID")
	@SequenceGenerator(name = "ProdFactorSysIdSeq", sequenceName = "FACT_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ProdFactorSysIdSeq")
	private Integer FACT_SYS_ID;

    @Column(name = "FACT_LIMIT")
    private Integer FACT_LIMIT;

    @Column(name = "FACT_PROD_SYS_ID")
    private String FACT_PROD_SYS_ID;

    @Column(name = "FACT_NET_CONT_LIMIT")
    private Integer FACT_NET_CONT_LIMIT;

    @Column(name = "FACT_EFF_FM_DT")
    private Date FACT_EFF_FM_DT;

    @Column(name = "FACT_EFF_TO_DT")
    private Date FACT_EFF_TO_DT;

    public Integer getFACT_SYS_ID() {
		return FACT_SYS_ID;
	}

	public void setFACT_SYS_ID(Integer fACT_SYS_ID) {
		FACT_SYS_ID = fACT_SYS_ID;
	}

	public Integer getFACT_LIMIT() {
        return FACT_LIMIT;
    }

    public void setFACT_LIMIT(Integer FACT_LIMIT) {
        this.FACT_LIMIT = FACT_LIMIT;
    }

    public String getFACT_PROD_SYS_ID() {
        return FACT_PROD_SYS_ID;
    }

    public void setFACT_PROD_SYS_ID(String FACT_PROD_SYS_ID) {
        this.FACT_PROD_SYS_ID = FACT_PROD_SYS_ID;
    }

    public Integer getFACT_NET_CONT_LIMIT() {
        return FACT_NET_CONT_LIMIT;
    }

    public void setFACT_NET_CONT_LIMIT(Integer FACT_NET_CONT_LIMIT) {
        this.FACT_NET_CONT_LIMIT = FACT_NET_CONT_LIMIT;
    }

    public Date getFACT_EFF_FM_DT() {
        return FACT_EFF_FM_DT;
    }

    public void setFACT_EFF_FM_DT(Date FACT_EFF_FM_DT) {
        this.FACT_EFF_FM_DT = FACT_EFF_FM_DT;
    }

    public Date getFACT_EFF_TO_DT() {
        return FACT_EFF_TO_DT;
    }

    public void setFACT_EFF_TO_DT(Date FACT_EFF_TO_DT) {
        this.FACT_EFF_TO_DT = FACT_EFF_TO_DT;
    } 
}
