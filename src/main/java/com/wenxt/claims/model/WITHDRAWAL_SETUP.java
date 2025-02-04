package com.wenxt.claims.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_GP_WITHDRAWAL_SETUP")
public class WITHDRAWAL_SETUP {

    @Id
    @Column(name = "WDRA_SYS_ID")
	@SequenceGenerator(name = "WdraSetupSysIdSeq", sequenceName = "WDRA_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WdraSetupSysIdSeq")
    private Integer WDRA_SYS_ID;

    @Column(name = "WDRA_CLAC_MET")
    private String WDRA_CLAC_MET;

    @Column(name = "WDRA_REF_COMP_YRS")
    private Integer WDRA_REF_COMP_YRS;

    @Column(name = "WDRA_REF_BRO_PER")
    private Integer WDRA_REF_BRO_PER;

    @Column(name = "WDRA_MIN_MON")
    private Integer WDRA_MIN_MON;
    
    public Integer getWDRA_SYS_ID() {
        return WDRA_SYS_ID;
    }

    public void setWDRA_SYS_ID(Integer WDRA_SYS_ID) {
        this.WDRA_SYS_ID = WDRA_SYS_ID;
    }

    public String getWDRA_CLAC_MET() {
        return WDRA_CLAC_MET;
    }

    public void setWDRA_CLAC_MET(String WDRA_CLAC_MET) {
        this.WDRA_CLAC_MET = WDRA_CLAC_MET;
    }

    public Integer getWDRA_REF_COMP_YRS() {
        return WDRA_REF_COMP_YRS;
    }

    public void setWDRA_REF_COMP_YRS(Integer WDRA_REF_COMP_YRS) {
        this.WDRA_REF_COMP_YRS = WDRA_REF_COMP_YRS;
    }

    public Integer getWDRA_REF_BRO_PER() {
        return WDRA_REF_BRO_PER;
    }

    public void setWDRA_REF_BRO_PER(Integer WDRA_REF_BRO_PER) {
        this.WDRA_REF_BRO_PER = WDRA_REF_BRO_PER;
    }

    public Integer getWDRA_MIN_MON() {
        return WDRA_MIN_MON;
    }

    public void setWDRA_MIN_MON(Integer WDRA_MIN_MON) {
        this.WDRA_MIN_MON = WDRA_MIN_MON;
    }
}

