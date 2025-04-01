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
@Table(name = "LT_DOC_TODO_LIST_STATUS")
public class LtDocTodoListStatus {

    @Id
    @SequenceGenerator(name = "ToDoListSeq", sequenceName = "DTLS_TRAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ToDoListSeq")
    @Column(name = "DTLS_TRAN_ID", nullable = false)
    private Integer DTLS_TRAN_ID;

    @Column(name = "DTLS_QUOT_TRAN_ID")
    private Integer DTLS_QUOT_TRAN_ID;

    @Column(name = "DTLS_POL_TRAN_ID")
    private Integer DTLS_POL_TRAN_ID;

    @Column(name = "DTLS_END_NO_IDX")
    private Integer DTLS_END_NO_IDX;

    @Column(name = "DTLS_CLM_TRAN_ID")
    private Integer DTLS_CLM_TRAN_ID;

    @Column(name = "DTLS_SR_NO")
    private Integer DTLS_SR_NO;

    @Column(name = "DTLS_TODO_LIST_ITEM", length = 240)
    private String DTLS_TODO_LIST_ITEM;

    @Column(name = "DTLS_MANDATORY_YN", length = 1)
    private String DTLS_MANDATORY_YN;

    @Column(name = "DTLS_APPR_STS", length = 2)
    private String DTLS_APPR_STS;

    @Column(name = "DTLS_REMARKS", length = 2000)
    private String DTLS_REMARKS;

    @Column(name = "DTLS_INS_DT", nullable = false)
    private Date DTLS_INS_DT;

    @Column(name = "DTLS_INS_ID", length = 10)
    private String DTLS_INS_ID;

    @Column(name = "DTLS_MOD_DT")
    private Date DTLS_MOD_DT;

    @Column(name = "DTLS_MOD_ID", length = 10)
    private String DTLS_MOD_ID;

    @Column(name = "DTLS_GROUP_CODE", length = 12)
    private String DTLS_GROUP_CODE;

    @Column(name = "DTLS_PEMP_TRAN_ID")
    private Long DTLS_PEMP_TRAN_ID;

    @Column(name = "DTLS_REC_TYPE", length = 1)
    private String DTLS_REC_TYPE;

    @Column(name = "DTLS_DOC_REC_DT")
    private Date DTLS_DOC_REC_DT;

    @Column(name = "DTLS_GSMH_TRAN_ID")
    private Long DTLS_GSMH_TRAN_ID;

    // Getters and Setters
    public Integer getDTLS_TRAN_ID() {
        return DTLS_TRAN_ID;
    }

    public void setDTLS_TRAN_ID(Integer DTLS_TRAN_ID) {
        this.DTLS_TRAN_ID = DTLS_TRAN_ID;
    }

    public Integer getDTLS_QUOT_TRAN_ID() {
        return DTLS_QUOT_TRAN_ID;
    }

    public void setDTLS_QUOT_TRAN_ID(Integer DTLS_QUOT_TRAN_ID) {
        this.DTLS_QUOT_TRAN_ID = DTLS_QUOT_TRAN_ID;
    }

    public Integer getDTLS_POL_TRAN_ID() {
        return DTLS_POL_TRAN_ID;
    }

    public void setDTLS_POL_TRAN_ID(Integer DTLS_POL_TRAN_ID) {
        this.DTLS_POL_TRAN_ID = DTLS_POL_TRAN_ID;
    }

    public Integer getDTLS_END_NO_IDX() {
        return DTLS_END_NO_IDX;
    }

    public void setDTLS_END_NO_IDX(Integer DTLS_END_NO_IDX) {
        this.DTLS_END_NO_IDX = DTLS_END_NO_IDX;
    }

    public Integer getDTLS_CLM_TRAN_ID() {
        return DTLS_CLM_TRAN_ID;
    }

    public void setDTLS_CLM_TRAN_ID(Integer DTLS_CLM_TRAN_ID) {
        this.DTLS_CLM_TRAN_ID = DTLS_CLM_TRAN_ID;
    }

    public Integer getDTLS_SR_NO() {
        return DTLS_SR_NO;
    }

    public void setDTLS_SR_NO(Integer DTLS_SR_NO) {
        this.DTLS_SR_NO = DTLS_SR_NO;
    }

    public String getDTLS_TODO_LIST_ITEM() {
        return DTLS_TODO_LIST_ITEM;
    }

    public void setDTLS_TODO_LIST_ITEM(String DTLS_TODO_LIST_ITEM) {
        this.DTLS_TODO_LIST_ITEM = DTLS_TODO_LIST_ITEM;
    }

    public String getDTLS_MANDATORY_YN() {
        return DTLS_MANDATORY_YN;
    }

    public void setDTLS_MANDATORY_YN(String DTLS_MANDATORY_YN) {
        this.DTLS_MANDATORY_YN = DTLS_MANDATORY_YN;
    }

    public String getDTLS_APPR_STS() {
        return DTLS_APPR_STS;
    }

    public void setDTLS_APPR_STS(String DTLS_APPR_STS) {
        this.DTLS_APPR_STS = DTLS_APPR_STS;
    }

    public String getDTLS_REMARKS() {
        return DTLS_REMARKS;
    }

    public void setDTLS_REMARKS(String DTLS_REMARKS) {
        this.DTLS_REMARKS = DTLS_REMARKS;
    }

    public Date getDTLS_INS_DT() {
        return DTLS_INS_DT;
    }

    public void setDTLS_INS_DT(Date DTLS_INS_DT) {
        this.DTLS_INS_DT = DTLS_INS_DT;
    }

    public String getDTLS_INS_ID() {
        return DTLS_INS_ID;
    }

    public void setDTLS_INS_ID(String DTLS_INS_ID) {
        this.DTLS_INS_ID = DTLS_INS_ID;
    }

    public Date getDTLS_MOD_DT() {
        return DTLS_MOD_DT;
    }

    public void setDTLS_MOD_DT(Date DTLS_MOD_DT) {
        this.DTLS_MOD_DT = DTLS_MOD_DT;
    }

    public String getDTLS_MOD_ID() {
        return DTLS_MOD_ID;
    }

    public void setDTLS_MOD_ID(String DTLS_MOD_ID) {
        this.DTLS_MOD_ID = DTLS_MOD_ID;
    }

    public String getDTLS_GROUP_CODE() {
        return DTLS_GROUP_CODE;
    }

    public void setDTLS_GROUP_CODE(String DTLS_GROUP_CODE) {
        this.DTLS_GROUP_CODE = DTLS_GROUP_CODE;
    }

    public Long getDTLS_PEMP_TRAN_ID() {
        return DTLS_PEMP_TRAN_ID;
    }

    public void setDTLS_PEMP_TRAN_ID(Long DTLS_PEMP_TRAN_ID) {
        this.DTLS_PEMP_TRAN_ID = DTLS_PEMP_TRAN_ID;
    }

    public String getDTLS_REC_TYPE() {
        return DTLS_REC_TYPE;
    }

    public void setDTLS_REC_TYPE(String DTLS_REC_TYPE) {
        this.DTLS_REC_TYPE = DTLS_REC_TYPE;
    }

    public Date getDTLS_DOC_REC_DT() {
        return DTLS_DOC_REC_DT;
    }

    public void setDTLS_DOC_REC_DT(Date DTLS_DOC_REC_DT) {
        this.DTLS_DOC_REC_DT = DTLS_DOC_REC_DT;
    }

    public Long getDTLS_GSMH_TRAN_ID() {
        return DTLS_GSMH_TRAN_ID;
    }

    public void setDTLS_GSMH_TRAN_ID(Long DTLS_GSMH_TRAN_ID) {
        this.DTLS_GSMH_TRAN_ID = DTLS_GSMH_TRAN_ID;
    }
}

