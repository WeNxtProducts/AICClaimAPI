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
@Table(name = "LM_GP_MAT_PRO_HDR", schema = "LIFE_DEV")
public class LM_GP_MAT_PRO_HDR {

    @Id
    @Column(name = "PMPH_SYS_ID")
    @SequenceGenerator(name = "MaturityProHdrSysIdSeq", sequenceName = "PMPH_SYS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MaturityProHdrSysIdSeq")
    private Integer PMPH_SYS_ID;

    @Column(name = "PMPH_POL_SYS_ID")
    private Integer PMPH_POL_SYS_ID;

    @Column(name = "PMPH_POL_NO")
    private String PMPH_POL_NO;

    @Column(name = "PMPH_PROD")
    private String PMPH_PROD;

    @Column(name = "PMPH_EMP_ID")
    private Integer PMPH_EMP_ID;

    @Column(name = "PMPH_EAR_PENS_YN")
    private String PMPH_EAR_PENS_YN;

    @Column(name = "PMPH_EAR_PENS_REA")
    private String PMPH_EAR_PENS_REA;

    @Column(name = "PMPH_ACT_RET_DT")
    private Date PMPH_ACT_RET_DT;

    @Column(name = "PMPH_NORM_RET_DT")
    private Date PMPH_NORM_RET_DT;

    @Column(name = "PMPH_DT")
    private Date PMPH_DT;

    @Column(name = "PMPH_CURR_CODE")
    private String PMPH_CURR_CODE;

    @Column(name = "PMPH_COMM_PER")
    private Integer PMPH_COMM_PER;

    @Column(name = "PMPH_ANN_TYPE")
    private String PMPH_ANN_TYPE;

    @Column(name = "PMPH_ANN_MOP")
    private String PMPH_ANN_MOP;

    @Column(name = "PMPH_CUST_CODE")
    private String PMPH_CUST_CODE;

    @Column(name = "PMPH_FC_FIN_SAL")
    private Integer PMPH_FC_FIN_SAL;

    @Column(name = "PMPH_EXCH_RATE")
    private Integer PMPH_EXCH_RATE;

    @Column(name = "PMPH_TAX_BASIS")
    private String PMPH_TAX_BASIS;

    @Column(name = "PMPH_ANN_REPAY_EXCH_FACT")
    private String PMPH_ANN_REPAY_EXCH_FACT;

    @Column(name = "PMPH_GUAR_PER")
    private Integer PMPH_GUAR_PER;

    @Column(name = "PMPH_FREEZE_YN")
    private String PMPH_FREEZE_YN;
    
    @Column(name = "PMPH_POL_NO_DESC")
    private String PMPH_POL_NO_DESC;
    
    @Column(name = "PMPH_PROD_DESC")
    private String PMPH_PROD_DESC;
    
    @Column(name = "PMPH_EMP_ID_DESC")
    private String PMPH_EMP_ID_DESC;
    
    @Column(name = "PMPH_EAR_PENS_REA_DESC")
    private String PMPH_EAR_PENS_REA_DESC;
    
    @Column(name = "PMPH_CURR_CODE_DESC")
    private String PMPH_CURR_CODE_DESC;
    
    @Column(name = "PMPH_CUST_CODE_DESC")
    private String PMPH_CUST_CODE_DESC;
    
    @Column(name = "PMPH_LC_FIN_SAL")
    private Integer PMPH_LC_FIN_SAL; 

    // Getters and Setters
    public Integer getPMPH_SYS_ID() {
        return PMPH_SYS_ID;
    }

    public void setPMPH_SYS_ID(Integer PMPH_SYS_ID) {
        this.PMPH_SYS_ID = PMPH_SYS_ID;
    }

    public Integer getPMPH_POL_SYS_ID() {
        return PMPH_POL_SYS_ID;
    }

    public void setPMPH_POL_SYS_ID(Integer PMPH_POL_SYS_ID) {
        this.PMPH_POL_SYS_ID = PMPH_POL_SYS_ID;
    }

    public String getPMPH_POL_NO() {
        return PMPH_POL_NO;
    }

    public void setPMPH_POL_NO(String PMPH_POL_NO) {
        this.PMPH_POL_NO = PMPH_POL_NO;
    }

    public String getPMPH_PROD() {
        return PMPH_PROD;
    }

    public void setPMPH_PROD(String PMPH_PROD) {
        this.PMPH_PROD = PMPH_PROD;
    }

    public Integer getPMPH_EMP_ID() {
        return PMPH_EMP_ID;
    }

    public void setPMPH_EMP_ID(Integer PMPH_EMP_ID) {
        this.PMPH_EMP_ID = PMPH_EMP_ID;
    }

    public String getPMPH_EAR_PENS_YN() {
        return PMPH_EAR_PENS_YN;
    }

    public void setPMPH_EAR_PENS_YN(String PMPH_EAR_PENS_YN) {
        this.PMPH_EAR_PENS_YN = PMPH_EAR_PENS_YN;
    }

    public String getPMPH_EAR_PENS_REA() {
        return PMPH_EAR_PENS_REA;
    }

    public void setPMPH_EAR_PENS_REA(String PMPH_EAR_PENS_REA) {
        this.PMPH_EAR_PENS_REA = PMPH_EAR_PENS_REA;
    }

    public Date getPMPH_ACT_RET_DT() {
        return PMPH_ACT_RET_DT;
    }

    public void setPMPH_ACT_RET_DT(Date PMPH_ACT_RET_DT) {
        this.PMPH_ACT_RET_DT = PMPH_ACT_RET_DT;
    }

    public Date getPMPH_NORM_RET_DT() {
        return PMPH_NORM_RET_DT;
    }

    public void setPMPH_NORM_RET_DT(Date PMPH_NORM_RET_DT) {
        this.PMPH_NORM_RET_DT = PMPH_NORM_RET_DT;
    }

    public Date getPMPH_DT() {
        return PMPH_DT;
    }

    public void setPMPH_DT(Date PMPH_DT) {
        this.PMPH_DT = PMPH_DT;
    }

    public String getPMPH_CURR_CODE() {
        return PMPH_CURR_CODE;
    }

    public void setPMPH_CURR_CODE(String PMPH_CURR_CODE) {
        this.PMPH_CURR_CODE = PMPH_CURR_CODE;
    }

    public Integer getPMPH_COMM_PER() {
        return PMPH_COMM_PER;
    }

    public void setPMPH_COMM_PER(Integer PMPH_COMM_PER) {
        this.PMPH_COMM_PER = PMPH_COMM_PER;
    }

    public String getPMPH_ANN_TYPE() {
        return PMPH_ANN_TYPE;
    }

    public void setPMPH_ANN_TYPE(String PMPH_ANN_TYPE) {
        this.PMPH_ANN_TYPE = PMPH_ANN_TYPE;
    }

    public String getPMPH_ANN_MOP() {
        return PMPH_ANN_MOP;
    }

    public void setPMPH_ANN_MOP(String PMPH_ANN_MOP) {
        this.PMPH_ANN_MOP = PMPH_ANN_MOP;
    }

    public String getPMPH_CUST_CODE() {
        return PMPH_CUST_CODE;
    }

    public void setPMPH_CUST_CODE(String PMPH_CUST_CODE) {
        this.PMPH_CUST_CODE = PMPH_CUST_CODE;
    }

    public Integer getPMPH_FC_FIN_SAL() {
        return PMPH_FC_FIN_SAL;
    }

    public void setPMPH_FC_FIN_SAL(Integer PMPH_FC_FIN_SAL) {
        this.PMPH_FC_FIN_SAL = PMPH_FC_FIN_SAL;
    }

    public Integer getPMPH_EXCH_RATE() {
        return PMPH_EXCH_RATE;
    }

    public void setPMPH_EXCH_RATE(Integer PMPH_EXCH_RATE) {
        this.PMPH_EXCH_RATE = PMPH_EXCH_RATE;
    }

    public String getPMPH_TAX_BASIS() {
        return PMPH_TAX_BASIS;
    }

    public void setPMPH_TAX_BASIS(String PMPH_TAX_BASIS) {
        this.PMPH_TAX_BASIS = PMPH_TAX_BASIS;
    }

    public String getPMPH_ANN_REPAY_EXCH_FACT() {
        return PMPH_ANN_REPAY_EXCH_FACT;
    }

    public void setPMPH_ANN_REPAY_EXCH_FACT(String PMPH_ANN_REPAY_EXCH_FACT) {
        this.PMPH_ANN_REPAY_EXCH_FACT = PMPH_ANN_REPAY_EXCH_FACT;
    }

    public Integer getPMPH_GUAR_PER() {
        return PMPH_GUAR_PER;
    }

    public void setPMPH_GUAR_PER(Integer PMPH_GUAR_PER) {
        this.PMPH_GUAR_PER = PMPH_GUAR_PER;
    }

    public String getPMPH_FREEZE_YN() {
        return PMPH_FREEZE_YN;
    }

    public void setPMPH_FREEZE_YN(String PMPH_FREEZE_YN) {
        this.PMPH_FREEZE_YN = PMPH_FREEZE_YN;
    }

	public String getPMPH_POL_NO_DESC() {
		return PMPH_POL_NO_DESC;
	}

	public void setPMPH_POL_NO_DESC(String pMPH_POL_NO_DESC) {
		PMPH_POL_NO_DESC = pMPH_POL_NO_DESC;
	}

	public String getPMPH_PROD_DESC() {
		return PMPH_PROD_DESC;
	}

	public void setPMPH_PROD_DESC(String pMPH_PROD_DESC) {
		PMPH_PROD_DESC = pMPH_PROD_DESC;
	}

	public String getPMPH_EMP_ID_DESC() {
		return PMPH_EMP_ID_DESC;
	}

	public void setPMPH_EMP_ID_DESC(String pMPH_EMP_ID_DESC) {
		PMPH_EMP_ID_DESC = pMPH_EMP_ID_DESC;
	}

	public String getPMPH_EAR_PENS_REA_DESC() {
		return PMPH_EAR_PENS_REA_DESC;
	}

	public void setPMPH_EAR_PENS_REA_DESC(String pMPH_EAR_PENS_REA_DESC) {
		PMPH_EAR_PENS_REA_DESC = pMPH_EAR_PENS_REA_DESC;
	}

	public String getPMPH_CURR_CODE_DESC() {
		return PMPH_CURR_CODE_DESC;
	}

	public void setPMPH_CURR_CODE_DESC(String pMPH_CURR_CODE_DESC) {
		PMPH_CURR_CODE_DESC = pMPH_CURR_CODE_DESC;
	}

	public String getPMPH_CUST_CODE_DESC() {
		return PMPH_CUST_CODE_DESC;
	}

	public void setPMPH_CUST_CODE_DESC(String pMPH_CUST_CODE_DESC) {
		PMPH_CUST_CODE_DESC = pMPH_CUST_CODE_DESC;
	}

	public Integer getPMPH_LC_FIN_SAL() {
		return PMPH_LC_FIN_SAL;
	}

	public void setPMPH_LC_FIN_SAL(Integer pMPH_LC_FIN_SAL) {
		PMPH_LC_FIN_SAL = pMPH_LC_FIN_SAL;
	}
    
}
