package com.wenxt.claims.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_GP_VESTING_SCALE")
public class LM_GP_VESTING_SCALE {

    @Id
    @Column(name = "PVSC_SYS_ID")
    @SequenceGenerator(name = "VestingScaleSysIdSeq", sequenceName = "PVSC_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VestingScaleSysIdSeq")
    private Integer PVSC_SYS_ID;

    @Column(name = "PVSC_POL_SYS_ID")
    private Integer PVSC_POL_SYS_ID;

    @Column(name = "PVSC_YR_FM")
    private Integer PVSC_YR_FM;

    @Column(name = "PVSC_YR_TO")
    private Integer PVSC_YR_TO;

    @Column(name = "PVSC_RATE")
    private Integer PVSC_RATE;

    @Column(name = "PVSC_RATE_PER")
    private Integer PVSC_RATE_PER;

    // Getters and Setters
    public Integer getPVSC_SYS_ID() {
        return PVSC_SYS_ID;
    }

    public void setPVSC_SYS_ID(Integer PVSC_SYS_ID) {
        this.PVSC_SYS_ID = PVSC_SYS_ID;
    }

    public Integer getPVSC_POL_SYS_ID() {
        return PVSC_POL_SYS_ID;
    }

    public void setPVSC_POL_SYS_ID(Integer PVSC_POL_SYS_ID) {
        this.PVSC_POL_SYS_ID = PVSC_POL_SYS_ID;
    }

    public Integer getPVSC_YR_FM() {
        return PVSC_YR_FM;
    }

    public void setPVSC_YR_FM(Integer PVSC_YR_FM) {
        this.PVSC_YR_FM = PVSC_YR_FM;
    }

    public Integer getPVSC_YR_TO() {
        return PVSC_YR_TO;
    }

    public void setPVSC_YR_TO(Integer PVSC_YR_TO) {
        this.PVSC_YR_TO = PVSC_YR_TO;
    }

    public Integer getPVSC_RATE() {
        return PVSC_RATE;
    }

    public void setPVSC_RATE(Integer PVSC_RATE) {
        this.PVSC_RATE = PVSC_RATE;
    }

    public Integer getPVSC_RATE_PER() {
        return PVSC_RATE_PER;
    }

    public void setPVSC_RATE_PER(Integer PVSC_RATE_PER) {
        this.PVSC_RATE_PER = PVSC_RATE_PER;
    }
}
