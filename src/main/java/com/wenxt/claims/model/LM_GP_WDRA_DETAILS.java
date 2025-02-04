package com.wenxt.claims.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "LM_GP_WDRA_DETAILS", schema = "LIFE_DEV")
public class LM_GP_WDRA_DETAILS {

    @Id
    @Column(name = "PWDD_SYS_ID")
    @SequenceGenerator(name = "WithdrawDtlsSysIdSeq", sequenceName = "PWDD_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WithdrawDtlsSysIdSeq")    
    private Integer PWDD_SYS_ID;

    @Column(name = "PWDD_PWPH_SYS_ID")
    private Integer PWDD_PWPH_SYS_ID;

    @Column(name = "PWDD_PMPH_SYS_ID")
    private Integer PWDD_PMPH_SYS_ID;

    @Column(name = "PWDD_TAX_SLAB_CODE")
    private String PWDD_TAX_SLAB_CODE;

    @Column(name = "PWDD_INT_RATE")
    private Integer PWDD_INT_RATE;

    @Column(name = "PWDD_RATE_PER")
    private Integer PWDD_RATE_PER;

    @Column(name = "PWDD_GRS_PAYABLE_FC")
    private Integer PWDD_GRS_PAYABLE_FC;

    @Column(name = "PWDD_GRS_PAYABLE_LC")
    private Integer PWDD_GRS_PAYABLE_LC;

    @Column(name = "PWDD_GRS_COMM_FC")
    private Integer PWDD_GRS_COMM_FC;

    @Column(name = "PWDD_GRS_COMM_LC")
    private Integer PWDD_GRS_COMM_LC;

    @Column(name = "PWDD_TAX_FC")
    private Integer PWDD_TAX_FC;

    @Column(name = "PWDD_TAX_LC")
    private Integer PWDD_TAX_LC;

    @Column(name = "PWDD_CUST_CHARGE_FC")
    private Integer PWDD_CUST_CHARGE_FC;

    @Column(name = "PWDD_CUST_CHARGE_LC")
    private Integer PWDD_CUST_CHARGE_LC;

    @Column(name = "PWDD_COMP_CHARGE_FC")
    private Integer PWDD_COMP_CHARGE_FC;

    @Column(name = "PWDD_COMP_CHARGE_LC")
    private Integer PWDD_COMP_CHARGE_LC;

    @Column(name = "PWDD_SUM_ASSR_FC_AMT")
    private Integer PWDD_SUM_ASSR_FC_AMT;

    @Column(name = "PWDD_SUM_ASSR_LC_AMT")
    private Integer PWDD_SUM_ASSR_LC_AMT;

    @Column(name = "PWDD_NET_PAYABLE_FC")
    private Integer PWDD_NET_PAYABLE_FC;

    @Column(name = "PWDD_NET_PAYABLE_LC")
    private Integer PWDD_NET_PAYABLE_LC;

    @Column(name = "PWDD_NET_COMM_FC")
    private Integer PWDD_NET_COMM_FC;

    @Column(name = "PWDD_NET_COMM_LC")
    private Integer PWDD_NET_COMM_LC;

    @Column(name = "PWDD_ANNUI_BEF_COMM_FC")
    private Integer PWDD_ANNUI_BEF_COMM_FC;

    @Column(name = "PWDD_ANNUI_BEF_COMM_LC")
    private Integer PWDD_ANNUI_BEF_COMM_LC;

    @Column(name = "PWDD_COST_OF_PENS_FC")
    private Integer PWDD_COST_OF_PENS_FC;

    @Column(name = "PWDD_COST_OF_PENS_LC")
    private Integer PWDD_COST_OF_PENS_LC;

    @Column(name = "PWDD_EMP_ANNU_AMT_FC")
    private Integer PWDD_EMP_ANNU_AMT_FC;

    @Column(name = "PWDD_EMP_ANNU_AMT_LC")
    private Integer PWDD_EMP_ANNU_AMT_LC;

    @Column(name = "PWDD_EMP_ANNU_INST_FC")
    private Integer PWDD_EMP_ANNU_INST_FC;

    @Column(name = "PWDD_EMP_ANNU_INST_LC")
    private Integer PWDD_EMP_ANNU_INST_LC;

    @Column(name = "PWDD_SPO_ANNU_AMT_FC")
    private Integer PWDD_SPO_ANNU_AMT_FC;

    @Column(name = "PWDD_SPO_ANNU_AMT_LC")
    private Integer PWDD_SPO_ANNU_AMT_LC;

    @Column(name = "PWDD_SPO_ANNU_INST_FC")
    private Integer PWDD_SPO_ANNU_INST_FC;

    @Column(name = "PWDD_SPO_ANNU_INST_LC")
    private Integer PWDD_SPO_ANNU_INST_LC;

    // Getters and Setters

    public Integer getPWDD_SYS_ID() {
        return PWDD_SYS_ID;
    }

    public void setPWDD_SYS_ID(Integer PWDD_SYS_ID) {
        this.PWDD_SYS_ID = PWDD_SYS_ID;
    }

    public Integer getPWDD_PWPH_SYS_ID() {
        return PWDD_PWPH_SYS_ID;
    }

    public void setPWDD_PWPH_SYS_ID(Integer PWDD_PWPH_SYS_ID) {
        this.PWDD_PWPH_SYS_ID = PWDD_PWPH_SYS_ID;
    }

    public Integer getPWDD_PMPH_SYS_ID() {
        return PWDD_PMPH_SYS_ID;
    }

    public void setPWDD_PMPH_SYS_ID(Integer PWDD_PMPH_SYS_ID) {
        this.PWDD_PMPH_SYS_ID = PWDD_PMPH_SYS_ID;
    }

    public String getPWDD_TAX_SLAB_CODE() {
        return PWDD_TAX_SLAB_CODE;
    }

    public void setPWDD_TAX_SLAB_CODE(String PWDD_TAX_SLAB_CODE) {
        this.PWDD_TAX_SLAB_CODE = PWDD_TAX_SLAB_CODE;
    }

    public Integer getPWDD_INT_RATE() {
        return PWDD_INT_RATE;
    }

    public void setPWDD_INT_RATE(Integer PWDD_INT_RATE) {
        this.PWDD_INT_RATE = PWDD_INT_RATE;
    }

    public Integer getPWDD_RATE_PER() {
        return PWDD_RATE_PER;
    }

    public void setPWDD_RATE_PER(Integer PWDD_RATE_PER) {
        this.PWDD_RATE_PER = PWDD_RATE_PER;
    }

    public Integer getPWDD_GRS_PAYABLE_FC() {
        return PWDD_GRS_PAYABLE_FC;
    }

    public void setPWDD_GRS_PAYABLE_FC(Integer PWDD_GRS_PAYABLE_FC) {
        this.PWDD_GRS_PAYABLE_FC = PWDD_GRS_PAYABLE_FC;
    }

    public Integer getPWDD_GRS_PAYABLE_LC() {
        return PWDD_GRS_PAYABLE_LC;
    }

    public void setPWDD_GRS_PAYABLE_LC(Integer PWDD_GRS_PAYABLE_LC) {
        this.PWDD_GRS_PAYABLE_LC = PWDD_GRS_PAYABLE_LC;
    }

    public Integer getPWDD_GRS_COMM_FC() {
        return PWDD_GRS_COMM_FC;
    }

    public void setPWDD_GRS_COMM_FC(Integer PWDD_GRS_COMM_FC) {
        this.PWDD_GRS_COMM_FC = PWDD_GRS_COMM_FC;
    }

    public Integer getPWDD_GRS_COMM_LC() {
        return PWDD_GRS_COMM_LC;
    }

    public void setPWDD_GRS_COMM_LC(Integer PWDD_GRS_COMM_LC) {
        this.PWDD_GRS_COMM_LC = PWDD_GRS_COMM_LC;
    }

    public Integer getPWDD_TAX_FC() {
        return PWDD_TAX_FC;
    }

    public void setPWDD_TAX_FC(Integer PWDD_TAX_FC) {
        this.PWDD_TAX_FC = PWDD_TAX_FC;
    }

    public Integer getPWDD_TAX_LC() {
        return PWDD_TAX_LC;
    }

    public void setPWDD_TAX_LC(Integer PWDD_TAX_LC) {
        this.PWDD_TAX_LC = PWDD_TAX_LC;
    }

    public Integer getPWDD_CUST_CHARGE_FC() {
        return PWDD_CUST_CHARGE_FC;
    }

    public void setPWDD_CUST_CHARGE_FC(Integer PWDD_CUST_CHARGE_FC) {
        this.PWDD_CUST_CHARGE_FC = PWDD_CUST_CHARGE_FC;
    }

    public Integer getPWDD_CUST_CHARGE_LC() {
        return PWDD_CUST_CHARGE_LC;
    }

    public void setPWDD_CUST_CHARGE_LC(Integer PWDD_CUST_CHARGE_LC) {
        this.PWDD_CUST_CHARGE_LC = PWDD_CUST_CHARGE_LC;
    }

    public Integer getPWDD_COMP_CHARGE_FC() {
        return PWDD_COMP_CHARGE_FC;
    }

    public void setPWDD_COMP_CHARGE_FC(Integer PWDD_COMP_CHARGE_FC) {
        this.PWDD_COMP_CHARGE_FC = PWDD_COMP_CHARGE_FC;
    }

    public Integer getPWDD_COMP_CHARGE_LC() {
        return PWDD_COMP_CHARGE_LC;
    }

    public void setPWDD_COMP_CHARGE_LC(Integer PWDD_COMP_CHARGE_LC) {
        this.PWDD_COMP_CHARGE_LC = PWDD_COMP_CHARGE_LC;
    }

    public Integer getPWDD_SUM_ASSR_FC_AMT() {
        return PWDD_SUM_ASSR_FC_AMT;
    }

    public void setPWDD_SUM_ASSR_FC_AMT(Integer PWDD_SUM_ASSR_FC_AMT) {
        this.PWDD_SUM_ASSR_FC_AMT = PWDD_SUM_ASSR_FC_AMT;
    }

    public Integer getPWDD_SUM_ASSR_LC_AMT() {
        return PWDD_SUM_ASSR_LC_AMT;
    }

    public void setPWDD_SUM_ASSR_LC_AMT(Integer PWDD_SUM_ASSR_LC_AMT) {
        this.PWDD_SUM_ASSR_LC_AMT = PWDD_SUM_ASSR_LC_AMT;
    }

    public Integer getPWDD_NET_PAYABLE_FC() {
        return PWDD_NET_PAYABLE_FC;
    }

    public void setPWDD_NET_PAYABLE_FC(Integer PWDD_NET_PAYABLE_FC) {
        this.PWDD_NET_PAYABLE_FC = PWDD_NET_PAYABLE_FC;
    }

    public Integer getPWDD_NET_PAYABLE_LC() {
        return PWDD_NET_PAYABLE_LC;
    }

    public void setPWDD_NET_PAYABLE_LC(Integer PWDD_NET_PAYABLE_LC) {
        this.PWDD_NET_PAYABLE_LC = PWDD_NET_PAYABLE_LC;
    }

    public Integer getPWDD_NET_COMM_FC() {
        return PWDD_NET_COMM_FC;
    }

    public void setPWDD_NET_COMM_FC(Integer PWDD_NET_COMM_FC) {
        this.PWDD_NET_COMM_FC = PWDD_NET_COMM_FC;
    }

    public Integer getPWDD_NET_COMM_LC() {
        return PWDD_NET_COMM_LC;
    }

    public void setPWDD_NET_COMM_LC(Integer PWDD_NET_COMM_LC) {
        this.PWDD_NET_COMM_LC = PWDD_NET_COMM_LC;
    }

    public Integer getPWDD_ANNUI_BEF_COMM_FC() {
        return PWDD_ANNUI_BEF_COMM_FC;
    }

    public void setPWDD_ANNUI_BEF_COMM_FC(Integer PWDD_ANNUI_BEF_COMM_FC) {
        this.PWDD_ANNUI_BEF_COMM_FC = PWDD_ANNUI_BEF_COMM_FC;
    }

    public Integer getPWDD_ANNUI_BEF_COMM_LC() {
        return PWDD_ANNUI_BEF_COMM_LC;
    }

    public void setPWDD_ANNUI_BEF_COMM_LC(Integer PWDD_ANNUI_BEF_COMM_LC) {
        this.PWDD_ANNUI_BEF_COMM_LC = PWDD_ANNUI_BEF_COMM_LC;
    }

    public Integer getPWDD_COST_OF_PENS_FC() {
        return PWDD_COST_OF_PENS_FC;
    }

    public void setPWDD_COST_OF_PENS_FC(Integer PWDD_COST_OF_PENS_FC) {
        this.PWDD_COST_OF_PENS_FC = PWDD_COST_OF_PENS_FC;
    }

    public Integer getPWDD_COST_OF_PENS_LC() {
        return PWDD_COST_OF_PENS_LC;
    }

    public void setPWDD_COST_OF_PENS_LC(Integer PWDD_COST_OF_PENS_LC) {
        this.PWDD_COST_OF_PENS_LC = PWDD_COST_OF_PENS_LC;
    }

    public Integer getPWDD_EMP_ANNU_AMT_FC() {
        return PWDD_EMP_ANNU_AMT_FC;
    }

    public void setPWDD_EMP_ANNU_AMT_FC(Integer PWDD_EMP_ANNU_AMT_FC) {
        this.PWDD_EMP_ANNU_AMT_FC = PWDD_EMP_ANNU_AMT_FC;
    }

    public Integer getPWDD_EMP_ANNU_AMT_LC() {
        return PWDD_EMP_ANNU_AMT_LC;
    }

    public void setPWDD_EMP_ANNU_AMT_LC(Integer PWDD_EMP_ANNU_AMT_LC) {
        this.PWDD_EMP_ANNU_AMT_LC = PWDD_EMP_ANNU_AMT_LC;
    }

    public Integer getPWDD_EMP_ANNU_INST_FC() {
        return PWDD_EMP_ANNU_INST_FC;
    }

    public void setPWDD_EMP_ANNU_INST_FC(Integer PWDD_EMP_ANNU_INST_FC) {
        this.PWDD_EMP_ANNU_INST_FC = PWDD_EMP_ANNU_INST_FC;
    }

    public Integer getPWDD_EMP_ANNU_INST_LC() {
        return PWDD_EMP_ANNU_INST_LC;
    }

    public void setPWDD_EMP_ANNU_INST_LC(Integer PWDD_EMP_ANNU_INST_LC) {
        this.PWDD_EMP_ANNU_INST_LC = PWDD_EMP_ANNU_INST_LC;
    }

    public Integer getPWDD_SPO_ANNU_AMT_FC() {
        return PWDD_SPO_ANNU_AMT_FC;
    }

    public void setPWDD_SPO_ANNU_AMT_FC(Integer PWDD_SPO_ANNU_AMT_FC) {
        this.PWDD_SPO_ANNU_AMT_FC = PWDD_SPO_ANNU_AMT_FC;
    }

    public Integer getPWDD_SPO_ANNU_AMT_LC() {
        return PWDD_SPO_ANNU_AMT_LC;
    }

    public void setPWDD_SPO_ANNU_AMT_LC(Integer PWDD_SPO_ANNU_AMT_LC) {
        this.PWDD_SPO_ANNU_AMT_LC = PWDD_SPO_ANNU_AMT_LC;
    }

    public Integer getPWDD_SPO_ANNU_INST_FC() {
        return PWDD_SPO_ANNU_INST_FC;
    }

    public void setPWDD_SPO_ANNU_INST_FC(Integer PWDD_SPO_ANNU_INST_FC) {
        this.PWDD_SPO_ANNU_INST_FC = PWDD_SPO_ANNU_INST_FC;
    }

    public Integer getPWDD_SPO_ANNU_INST_LC() {
        return PWDD_SPO_ANNU_INST_LC;
    }

    public void setPWDD_SPO_ANNU_INST_LC(Integer PWDD_SPO_ANNU_INST_LC) {
        this.PWDD_SPO_ANNU_INST_LC = PWDD_SPO_ANNU_INST_LC;
    }
}
