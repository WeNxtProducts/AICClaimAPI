package com.wenxt.claims.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "LT_QQUOT_BROK_HDR")
public class LT_QQUOT_BROK_HDR {

    @Id
    @SequenceGenerator(name = "QuickQuoteBrokerHeaderTranIdSeq", sequenceName = "QQBH_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "QuickQuoteBrokerHeaderTranIdSeq")
    @Column(name = "QQBH_TRAN_ID")
    private Long QQBH_TRAN_ID;

    @Column(name = "QQBH_QUOT_TRAN_ID")
    private Long QQBH_QUOT_TRAN_ID;

    @Column(name = "QQBH_BROKER_CODE")
    private String QQBH_BROKER_CODE;

    @Column(name = "QQBH_COVER_CODE")
    private String QQBH_COVER_CODE;

    @Column(name = "QQBH_BROKER_CURR_CODE")
    private String QQBH_BROKER_CURR_CODE;

    @Column(name = "QQBH_REMARKS")
    private String QQBH_REMARKS;

    @Column(name = "QQBH_DEL_FLAG")
    private String QQBH_DEL_FLAG;

    @Column(name = "QQBH_INS_DT")
    private Date QQBH_INS_DT;

    @Column(name = "QQBH_INS_ID")
    private String QQBH_INS_ID;

    @Column(name = "QQBH_MOD_DT")
    private Date QQBH_MOD_DT;

    @Column(name = "QQBH_MOD_ID")
    private String QQBH_MOD_ID;

    @Column(name = "QQBH_COMM_CODE")
    private String QQBH_COMM_CODE;

    @Column(name = "QQBH_SRNO")
    private Integer QQBH_SRNO;

    @Column(name = "QQBH_APPLY_ON_SRNO")
    private Integer QQBH_APPLY_ON_SRNO;

    @Column(name = "QQBH_ACTING_AGENT_YN")
    private String QQBH_ACTING_AGENT_YN;

    @Column(name = "QQBH_AGENT_RANK_CODE")
    private String QQBH_AGENT_RANK_CODE;

    @Column(name = "QQBH_AGENT_LEVEL")
    private Double QQBH_AGENT_LEVEL;

    @Column(name = "QQBH_MKT_CODE")
    private String QQBH_MKT_CODE;

    @Column(name = "QQBH_UNIT_CODE")
    private String QQBH_UNIT_CODE;

    @Column(name = "QQBH_AGENCY_BRANCH_CODE")
    private String QQBH_AGENCY_BRANCH_CODE;

    @Column(name = "QQBH_REGION_CODE")
    private String QQBH_REGION_CODE;

    @Column(name = "QQBH_AGENCY_CODE")
    private String QQBH_AGENCY_CODE;

    @Column(name = "QQBH_RECRUITER_CODE")
    private String QQBH_RECRUITER_CODE;

    @Column(name = "QQBH_FC_COMMISSION")
    private Double QQBH_FC_COMMISSION;

    @Column(name = "QQBH_LC_COMMISSION")
    private Double QQBH_LC_COMMISSION;

    @Column(name = "QQBH_EMAIL_ID")
    private String QQBH_EMAIL_ID;

    public Long getQQBH_TRAN_ID() {
        return QQBH_TRAN_ID;
    }

    public void setQQBH_TRAN_ID(Long QQBH_TRAN_ID) {
        this.QQBH_TRAN_ID = QQBH_TRAN_ID;
    }

    public Long getQQBH_QUOT_TRAN_ID() {
        return QQBH_QUOT_TRAN_ID;
    }

    public void setQQBH_QUOT_TRAN_ID(Long QQBH_QUOT_TRAN_ID) {
        this.QQBH_QUOT_TRAN_ID = QQBH_QUOT_TRAN_ID;
    }

    public String getQQBH_BROKER_CODE() {
        return QQBH_BROKER_CODE;
    }

    public void setQQBH_BROKER_CODE(String QQBH_BROKER_CODE) {
        this.QQBH_BROKER_CODE = QQBH_BROKER_CODE;
    }

    public String getQQBH_COVER_CODE() {
        return QQBH_COVER_CODE;
    }

    public void setQQBH_COVER_CODE(String QQBH_COVER_CODE) {
        this.QQBH_COVER_CODE = QQBH_COVER_CODE;
    }

    public String getQQBH_BROKER_CURR_CODE() {
        return QQBH_BROKER_CURR_CODE;
    }

    public void setQQBH_BROKER_CURR_CODE(String QQBH_BROKER_CURR_CODE) {
        this.QQBH_BROKER_CURR_CODE = QQBH_BROKER_CURR_CODE;
    }

    public String getQQBH_REMARKS() {
        return QQBH_REMARKS;
    }

    public void setQQBH_REMARKS(String QQBH_REMARKS) {
        this.QQBH_REMARKS = QQBH_REMARKS;
    }

    public String getQQBH_DEL_FLAG() {
        return QQBH_DEL_FLAG;
    }

    public void setQQBH_DEL_FLAG(String QQBH_DEL_FLAG) {
        this.QQBH_DEL_FLAG = QQBH_DEL_FLAG;
    }

    public Date getQQBH_INS_DT() {
        return QQBH_INS_DT;
    }

    public void setQQBH_INS_DT(Date QQBH_INS_DT) {
        this.QQBH_INS_DT = QQBH_INS_DT;
    }

    public String getQQBH_INS_ID() {
        return QQBH_INS_ID;
    }

    public void setQQBH_INS_ID(String QQBH_INS_ID) {
        this.QQBH_INS_ID = QQBH_INS_ID;
    }

    public Date getQQBH_MOD_DT() {
        return QQBH_MOD_DT;
    }

    public void setQQBH_MOD_DT(Date QQBH_MOD_DT) {
        this.QQBH_MOD_DT = QQBH_MOD_DT;
    }

    public String getQQBH_MOD_ID() {
        return QQBH_MOD_ID;
    }

    public void setQQBH_MOD_ID(String QQBH_MOD_ID) {
        this.QQBH_MOD_ID = QQBH_MOD_ID;
    }

    public String getQQBH_COMM_CODE() {
        return QQBH_COMM_CODE;
    }

    public void setQQBH_COMM_CODE(String QQBH_COMM_CODE) {
        this.QQBH_COMM_CODE = QQBH_COMM_CODE;
    }

    public Integer getQQBH_SRNO() {
        return QQBH_SRNO;
    }

    public void setQQBH_SRNO(Integer QQBH_SRNO) {
        this.QQBH_SRNO = QQBH_SRNO;
    }

    public Integer getQQBH_APPLY_ON_SRNO() {
        return QQBH_APPLY_ON_SRNO;
    }

    public void setQQBH_APPLY_ON_SRNO(Integer QQBH_APPLY_ON_SRNO) {
        this.QQBH_APPLY_ON_SRNO = QQBH_APPLY_ON_SRNO;
    }

    public String getQQBH_ACTING_AGENT_YN() {
        return QQBH_ACTING_AGENT_YN;
    }

    public void setQQBH_ACTING_AGENT_YN(String QQBH_ACTING_AGENT_YN) {
        this.QQBH_ACTING_AGENT_YN = QQBH_ACTING_AGENT_YN;
    }

    public String getQQBH_AGENT_RANK_CODE() {
        return QQBH_AGENT_RANK_CODE;
    }

    public void setQQBH_AGENT_RANK_CODE(String QQBH_AGENT_RANK_CODE) {
        this.QQBH_AGENT_RANK_CODE = QQBH_AGENT_RANK_CODE;
    }

    public Double getQQBH_AGENT_LEVEL() {
        return QQBH_AGENT_LEVEL;
    }

    public void setQQBH_AGENT_LEVEL(Double QQBH_AGENT_LEVEL) {
        this.QQBH_AGENT_LEVEL = QQBH_AGENT_LEVEL;
    }

    public String getQQBH_MKT_CODE() {
        return QQBH_MKT_CODE;
    }

    public void setQQBH_MKT_CODE(String QQBH_MKT_CODE) {
        this.QQBH_MKT_CODE = QQBH_MKT_CODE;
    }

    public String getQQBH_UNIT_CODE() {
        return QQBH_UNIT_CODE;
    }

    public void setQQBH_UNIT_CODE(String QQBH_UNIT_CODE) {
        this.QQBH_UNIT_CODE = QQBH_UNIT_CODE;
    }

    public String getQQBH_AGENCY_BRANCH_CODE() {
        return QQBH_AGENCY_BRANCH_CODE;
    }

    public void setQQBH_AGENCY_BRANCH_CODE(String QQBH_AGENCY_BRANCH_CODE) {
        this.QQBH_AGENCY_BRANCH_CODE = QQBH_AGENCY_BRANCH_CODE;
    }

    public String getQQBH_REGION_CODE() {
        return QQBH_REGION_CODE;
    }

    public void setQQBH_REGION_CODE(String QQBH_REGION_CODE) {
        this.QQBH_REGION_CODE = QQBH_REGION_CODE;
    }

    public String getQQBH_AGENCY_CODE() {
        return QQBH_AGENCY_CODE;
    }

    public void setQQBH_AGENCY_CODE(String QQBH_AGENCY_CODE) {
        this.QQBH_AGENCY_CODE = QQBH_AGENCY_CODE;
    }

    public String getQQBH_RECRUITER_CODE() {
        return QQBH_RECRUITER_CODE;
    }

    public void setQQBH_RECRUITER_CODE(String QQBH_RECRUITER_CODE) {
        this.QQBH_RECRUITER_CODE = QQBH_RECRUITER_CODE;
    }

    public Double getQQBH_FC_COMMISSION() {
        return QQBH_FC_COMMISSION;
    }

    public void setQQBH_FC_COMMISSION(Double QQBH_FC_COMMISSION) {
        this.QQBH_FC_COMMISSION = QQBH_FC_COMMISSION;
    }

    public Double getQQBH_LC_COMMISSION() {
        return QQBH_LC_COMMISSION;
    }

    public void setQQBH_LC_COMMISSION(Double QQBH_LC_COMMISSION) {
        this.QQBH_LC_COMMISSION = QQBH_LC_COMMISSION;
    }

    public String getQQBH_EMAIL_ID() {
        return QQBH_EMAIL_ID;
    }

    public void setQQBH_EMAIL_ID(String QQBH_EMAIL_ID) {
        this.QQBH_EMAIL_ID = QQBH_EMAIL_ID;
    }
}

