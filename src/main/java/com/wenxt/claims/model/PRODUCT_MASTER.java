package com.wenxt.claims.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "PRODUCT_MASTER", schema = "LIFE_DEV")
public class PRODUCT_MASTER {

    @Id
    @Column(name = "PROD_SYS_ID")
	@SequenceGenerator(name = "ProductSysIdSeq", sequenceName = "PROD_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ProductSysIdSeq")
    private Long PROD_SYS_ID;

    @Column(name = "PROD_CODE")
    private String PROD_CODE;

    @Column(name = "PROD_DESC")
    private String PROD_DESC;

    @Column(name = "PROD_SH_DESC")
    private String PROD_SH_DESC;

    @Column(name = "PROD_LN_DESC")
    private String PROD_LN_DESC;

    @Column(name = "PROD_TYPE")
    private String PROD_TYPE;

    @Column(name = "PROD_SUB_TYPE")
    private String PROD_SUB_TYPE;

    @Column(name = "PROD_CONT_FR")
    private String PROD_CONT_FR;

    @Column(name = "PROD_SPO_PEN")
    private String PROD_SPO_PEN;

    @Column(name = "PROD_NOR_TAX")
    private String PROD_NOR_TAX;

    @Column(name = "PROD_EXT_TAX")
    private String PROD_EXT_TAX;

    @Column(name = "PROD_COMM_TAX")
    private String PROD_COMM_TAX;

    @Column(name = "PROD_WITHDR_TAX")
    private String PROD_WITHDR_TAX;

    @Column(name = "PROD_ANN_TAX_YN")
    private String PROD_ANN_TAX_YN;

    @Column(name = "PROD_INT_CALC_YN")
    private String PROD_INT_CALC_YN;

    @Column(name = "PROD_PEN_PUR_YN")
    private String PROD_PEN_PUR_YN;

    @Column(name = "PROD_SA_YN")
    private String PROD_SA_YN;

    @Column(name = "PROD_SA_AMT")
    private Integer PROD_SA_AMT;

    @Column(name = "PROD_FR_DT")
    private Timestamp PROD_FR_DT;

    @Column(name = "PROD_TO_DT")
    private Timestamp PROD_TO_DT;

    // Getters and Setters
    public Long getPROD_SYS_ID() {
        return PROD_SYS_ID;
    }

    public void setPROD_SYS_ID(Long PROD_SYS_ID) {
        this.PROD_SYS_ID = PROD_SYS_ID;
    }

    public String getPROD_CODE() {
        return PROD_CODE;
    }

    public void setPROD_CODE(String PROD_CODE) {
        this.PROD_CODE = PROD_CODE;
    }

    public String getPROD_DESC() {
        return PROD_DESC;
    }

    public void setPROD_DESC(String PROD_DESC) {
        this.PROD_DESC = PROD_DESC;
    }

    public String getPROD_SH_DESC() {
        return PROD_SH_DESC;
    }

    public void setPROD_SH_DESC(String PROD_SH_DESC) {
        this.PROD_SH_DESC = PROD_SH_DESC;
    }

    public String getPROD_LN_DESC() {
        return PROD_LN_DESC;
    }

    public void setPROD_LN_DESC(String PROD_LN_DESC) {
        this.PROD_LN_DESC = PROD_LN_DESC;
    }

    public String getPROD_TYPE() {
        return PROD_TYPE;
    }

    public void setPROD_TYPE(String PROD_TYPE) {
        this.PROD_TYPE = PROD_TYPE;
    }

    public String getPROD_SUB_TYPE() {
        return PROD_SUB_TYPE;
    }

    public void setPROD_SUB_TYPE(String PROD_SUB_TYPE) {
        this.PROD_SUB_TYPE = PROD_SUB_TYPE;
    }

    public String getPROD_CONT_FR() {
        return PROD_CONT_FR;
    }

    public void setPROD_CONT_FR(String PROD_CONT_FR) {
        this.PROD_CONT_FR = PROD_CONT_FR;
    }

    public String getPROD_SPO_PEN() {
        return PROD_SPO_PEN;
    }

    public void setPROD_SPO_PEN(String PROD_SPO_PEN) {
        this.PROD_SPO_PEN = PROD_SPO_PEN;
    }

    public String getPROD_NOR_TAX() {
        return PROD_NOR_TAX;
    }

    public void setPROD_NOR_TAX(String PROD_NOR_TAX) {
        this.PROD_NOR_TAX = PROD_NOR_TAX;
    }

    public String getPROD_EXT_TAX() {
        return PROD_EXT_TAX;
    }

    public void setPROD_EXT_TAX(String PROD_EXT_TAX) {
        this.PROD_EXT_TAX = PROD_EXT_TAX;
    }

    public String getPROD_COMM_TAX() {
        return PROD_COMM_TAX;
    }

    public void setPROD_COMM_TAX(String PROD_COMM_TAX) {
        this.PROD_COMM_TAX = PROD_COMM_TAX;
    }

    public String getPROD_WITHDR_TAX() {
        return PROD_WITHDR_TAX;
    }

    public void setPROD_WITHDR_TAX(String PROD_WITHDR_TAX) {
        this.PROD_WITHDR_TAX = PROD_WITHDR_TAX;
    }

    public String getPROD_ANN_TAX_YN() {
        return PROD_ANN_TAX_YN;
    }

    public void setPROD_ANN_TAX_YN(String PROD_ANN_TAX_YN) {
        this.PROD_ANN_TAX_YN = PROD_ANN_TAX_YN;
    }

    public String getPROD_INT_CALC_YN() {
        return PROD_INT_CALC_YN;
    }

    public void setPROD_INT_CALC_YN(String PROD_INT_CALC_YN) {
        this.PROD_INT_CALC_YN = PROD_INT_CALC_YN;
    }

    public String getPROD_PEN_PUR_YN() {
        return PROD_PEN_PUR_YN;
    }

    public void setPROD_PEN_PUR_YN(String PROD_PEN_PUR_YN) {
        this.PROD_PEN_PUR_YN = PROD_PEN_PUR_YN;
    }

    public String getPROD_SA_YN() {
        return PROD_SA_YN;
    }

    public void setPROD_SA_YN(String PROD_SA_YN) {
        this.PROD_SA_YN = PROD_SA_YN;
    }

    public Integer getPROD_SA_AMT() {
        return PROD_SA_AMT;
    }

    public void setPROD_SA_AMT(Integer PROD_SA_AMT) {
        this.PROD_SA_AMT = PROD_SA_AMT;
    }

    public Timestamp getPROD_FR_DT() {
        return PROD_FR_DT;
    }

    public void setPROD_FR_DT(Timestamp PROD_FR_DT) {
        this.PROD_FR_DT = PROD_FR_DT;
    }

    public Timestamp getPROD_TO_DT() {
        return PROD_TO_DT;
    }

    public void setPROD_TO_DT(Timestamp PROD_TO_DT) {
        this.PROD_TO_DT = PROD_TO_DT;
    }
}
