package com.wenxt.claims.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_INSTALL_HDR")
public class LT_INSTALL_HDR {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IH_TRAN_ID")
    private Integer IH_TRAN_ID;

    @Column(name = "IH_POL_TRAN_ID")
    private Long IH_POL_TRAN_ID;

    @Column(name = "IH_POL_NO", length = 40)
    private String IH_POL_NO;

    @Column(name = "IH_END_NO_IDX")
    private Integer IH_END_NO_IDX;

    @Column(name = "IH_END_NO", length = 40)
    private String IH_END_NO;

    @Column(name = "IH_CUST_CODE", length = 12)
    private String IH_CUST_CODE;

    @Column(name = "IH_CUST_CURR_CODE", length = 12)
    private String IH_CUST_CURR_CODE;

    @Column(name = "IH_INST_PYMT_DT")
    private Date IH_INST_PYMT_DT;

    @Column(name = "IH_PAID_DT")
    private Date IH_PAID_DT;

    @Column(name = "IH_APPRV_DT")
    private Date IH_APPRV_DT;

    @Column(name = "IH_PAID_FLAG", length = 2)
    private String IH_PAID_FLAG;

    @Column(name = "IH_INST_NO")
    private Integer IH_INST_NO;

    @Column(name = "IH_PREM_FC_AMT")
    private Double IH_PREM_FC_AMT;

    @Column(name = "IH_PREM_LC_AMT")
    private Double IH_PREM_LC_AMT;

    @Column(name = "IH_LOAD_FC_AMT")
    private Double IH_LOAD_FC_AMT;

    @Column(name = "IH_LOAD_LC_AMT")
    private Double IH_LOAD_LC_AMT;

    @Column(name = "IH_DISC_FC_AMT")
    private Double IH_DISC_FC_AMT;

    @Column(name = "IH_DISC_LC_AMT")
    private Double IH_DISC_LC_AMT;

    @Column(name = "IH_BROK_FC_AMT")
    private Double IH_BROK_FC_AMT;

    @Column(name = "IH_BROK_LC_AMT")
    private Double IH_BROK_LC_AMT;

    @Column(name = "IH_COMP_FC_AMT")
    private Double IH_COMP_FC_AMT;

    @Column(name = "IH_COMP_LC_AMT")
    private Double IH_COMP_LC_AMT;

    @Column(name = "IH_CUST_FC_AMT")
    private Double IH_CUST_FC_AMT;

    @Column(name = "IH_CUST_LC_AMT")
    private Double IH_CUST_LC_AMT;

    @Column(name = "IH_GROSS_FC_AMT")
    private Double IH_GROSS_FC_AMT;

    @Column(name = "IH_GROSS_LC_AMT")
    private Double IH_GROSS_LC_AMT;

    @Column(name = "IH_UNPAID_FC_PREM_INT")
    private Double IH_UNPAID_FC_PREM_INT;

    @Column(name = "IH_UNPAID_LC_PREM_INT")
    private Double IH_UNPAID_LC_PREM_INT;

    @Column(name = "IH_UNPAID_PREMINT_CODE", length = 12)
    private String IH_UNPAID_PREMINT_CODE;

    @Column(name = "IH_REF_NO", length = 20)
    private String IH_REF_NO;

    @Column(name = "IH_INS_DT")
    private Date IH_INS_DT;

    @Column(name = "IH_INS_UID", length = 12)
    private String IH_INS_UID;

    @Column(name = "IH_MOD_DT")
    private Date IH_MOD_DT;

    @Column(name = "IH_MOD_UID", length = 12)
    private String IH_MOD_UID;

    @Column(name = "IH_POL_MASTER_POLICY_NO", length = 40)
    private String IH_POL_MASTER_POLICY_NO;

    @Column(name = "IH_EMPLOYER_CODE", length = 40)
    private String IH_EMPLOYER_CODE;

    @Column(name = "IH_BILL_CR_YN", length = 1)
    private String IH_BILL_CR_YN;

    @Column(name = "IH_YR_CODE", length = 12)
    private String IH_YR_CODE;

    @Column(name = "IH_DRIP_YN", length = 1)
    private String IH_DRIP_YN;

    @Column(name = "IH_DRIP_DT")
    private Date IH_DRIP_DT;

    @Column(name = "IH_SURPLUS_CONSIDER_YN", length = 1)
    private String IH_SURPLUS_CONSIDER_YN;

    @Column(name = "IH_CBC_YN", length = 1)
    private String IH_CBC_YN;

    @Column(name = "IH_TEMP_RCPT_NO", length = 40)
    private String IH_TEMP_RCPT_NO;

    @Column(name = "IH_AC_TRAN_CODE", length = 40)
    private String IH_AC_TRAN_CODE;

    @Column(name = "IH_AC_DOC_NO")
    private Long IH_AC_DOC_NO;

    @Column(name = "IH_AC_YEAR")
    private Long IH_AC_YEAR;

    @Column(name = "IH_COLL_TYPE", length = 40)
    private String IH_COLL_TYPE;

    @Column(name = "IH_PREM_HOLIDAY_YN", length = 1)
    private String IH_PREM_HOLIDAY_YN;

    @Column(name = "IH_FLEX_01", length = 2000)
    private String IH_FLEX_01;

	public Integer getIH_TRAN_ID() {
		return IH_TRAN_ID;
	}

	public void setIH_TRAN_ID(Integer iH_TRAN_ID) {
		IH_TRAN_ID = iH_TRAN_ID;
	}

	public Long getIH_POL_TRAN_ID() {
		return IH_POL_TRAN_ID;
	}

	public void setIH_POL_TRAN_ID(Long iH_POL_TRAN_ID) {
		IH_POL_TRAN_ID = iH_POL_TRAN_ID;
	}

	public String getIH_POL_NO() {
		return IH_POL_NO;
	}

	public void setIH_POL_NO(String iH_POL_NO) {
		IH_POL_NO = iH_POL_NO;
	}

	public Integer getIH_END_NO_IDX() {
		return IH_END_NO_IDX;
	}

	public void setIH_END_NO_IDX(Integer iH_END_NO_IDX) {
		IH_END_NO_IDX = iH_END_NO_IDX;
	}

	public String getIH_END_NO() {
		return IH_END_NO;
	}

	public void setIH_END_NO(String iH_END_NO) {
		IH_END_NO = iH_END_NO;
	}

	public String getIH_CUST_CODE() {
		return IH_CUST_CODE;
	}

	public void setIH_CUST_CODE(String iH_CUST_CODE) {
		IH_CUST_CODE = iH_CUST_CODE;
	}

	public String getIH_CUST_CURR_CODE() {
		return IH_CUST_CURR_CODE;
	}

	public void setIH_CUST_CURR_CODE(String iH_CUST_CURR_CODE) {
		IH_CUST_CURR_CODE = iH_CUST_CURR_CODE;
	}

	public Date getIH_INST_PYMT_DT() {
		return IH_INST_PYMT_DT;
	}

	public void setIH_INST_PYMT_DT(Date iH_INST_PYMT_DT) {
		IH_INST_PYMT_DT = iH_INST_PYMT_DT;
	}

	public Date getIH_PAID_DT() {
		return IH_PAID_DT;
	}

	public void setIH_PAID_DT(Date iH_PAID_DT) {
		IH_PAID_DT = iH_PAID_DT;
	}

	public Date getIH_APPRV_DT() {
		return IH_APPRV_DT;
	}

	public void setIH_APPRV_DT(Date iH_APPRV_DT) {
		IH_APPRV_DT = iH_APPRV_DT;
	}

	public String getIH_PAID_FLAG() {
		return IH_PAID_FLAG;
	}

	public void setIH_PAID_FLAG(String iH_PAID_FLAG) {
		IH_PAID_FLAG = iH_PAID_FLAG;
	}

	public Integer getIH_INST_NO() {
		return IH_INST_NO;
	}

	public void setIH_INST_NO(Integer iH_INST_NO) {
		IH_INST_NO = iH_INST_NO;
	}

	public Double getIH_PREM_FC_AMT() {
		return IH_PREM_FC_AMT;
	}

	public void setIH_PREM_FC_AMT(Double iH_PREM_FC_AMT) {
		IH_PREM_FC_AMT = iH_PREM_FC_AMT;
	}

	public Double getIH_PREM_LC_AMT() {
		return IH_PREM_LC_AMT;
	}

	public void setIH_PREM_LC_AMT(Double iH_PREM_LC_AMT) {
		IH_PREM_LC_AMT = iH_PREM_LC_AMT;
	}

	public Double getIH_LOAD_FC_AMT() {
		return IH_LOAD_FC_AMT;
	}

	public void setIH_LOAD_FC_AMT(Double iH_LOAD_FC_AMT) {
		IH_LOAD_FC_AMT = iH_LOAD_FC_AMT;
	}

	public Double getIH_LOAD_LC_AMT() {
		return IH_LOAD_LC_AMT;
	}

	public void setIH_LOAD_LC_AMT(Double iH_LOAD_LC_AMT) {
		IH_LOAD_LC_AMT = iH_LOAD_LC_AMT;
	}

	public Double getIH_DISC_FC_AMT() {
		return IH_DISC_FC_AMT;
	}

	public void setIH_DISC_FC_AMT(Double iH_DISC_FC_AMT) {
		IH_DISC_FC_AMT = iH_DISC_FC_AMT;
	}

	public Double getIH_DISC_LC_AMT() {
		return IH_DISC_LC_AMT;
	}

	public void setIH_DISC_LC_AMT(Double iH_DISC_LC_AMT) {
		IH_DISC_LC_AMT = iH_DISC_LC_AMT;
	}

	public Double getIH_BROK_FC_AMT() {
		return IH_BROK_FC_AMT;
	}

	public void setIH_BROK_FC_AMT(Double iH_BROK_FC_AMT) {
		IH_BROK_FC_AMT = iH_BROK_FC_AMT;
	}

	public Double getIH_BROK_LC_AMT() {
		return IH_BROK_LC_AMT;
	}

	public void setIH_BROK_LC_AMT(Double iH_BROK_LC_AMT) {
		IH_BROK_LC_AMT = iH_BROK_LC_AMT;
	}

	public Double getIH_COMP_FC_AMT() {
		return IH_COMP_FC_AMT;
	}

	public void setIH_COMP_FC_AMT(Double iH_COMP_FC_AMT) {
		IH_COMP_FC_AMT = iH_COMP_FC_AMT;
	}

	public Double getIH_COMP_LC_AMT() {
		return IH_COMP_LC_AMT;
	}

	public void setIH_COMP_LC_AMT(Double iH_COMP_LC_AMT) {
		IH_COMP_LC_AMT = iH_COMP_LC_AMT;
	}

	public Double getIH_CUST_FC_AMT() {
		return IH_CUST_FC_AMT;
	}

	public void setIH_CUST_FC_AMT(Double iH_CUST_FC_AMT) {
		IH_CUST_FC_AMT = iH_CUST_FC_AMT;
	}

	public Double getIH_CUST_LC_AMT() {
		return IH_CUST_LC_AMT;
	}

	public void setIH_CUST_LC_AMT(Double iH_CUST_LC_AMT) {
		IH_CUST_LC_AMT = iH_CUST_LC_AMT;
	}

	public Double getIH_GROSS_FC_AMT() {
		return IH_GROSS_FC_AMT;
	}

	public void setIH_GROSS_FC_AMT(Double iH_GROSS_FC_AMT) {
		IH_GROSS_FC_AMT = iH_GROSS_FC_AMT;
	}

	public Double getIH_GROSS_LC_AMT() {
		return IH_GROSS_LC_AMT;
	}

	public void setIH_GROSS_LC_AMT(Double iH_GROSS_LC_AMT) {
		IH_GROSS_LC_AMT = iH_GROSS_LC_AMT;
	}

	public Double getIH_UNPAID_FC_PREM_INT() {
		return IH_UNPAID_FC_PREM_INT;
	}

	public void setIH_UNPAID_FC_PREM_INT(Double iH_UNPAID_FC_PREM_INT) {
		IH_UNPAID_FC_PREM_INT = iH_UNPAID_FC_PREM_INT;
	}

	public Double getIH_UNPAID_LC_PREM_INT() {
		return IH_UNPAID_LC_PREM_INT;
	}

	public void setIH_UNPAID_LC_PREM_INT(Double iH_UNPAID_LC_PREM_INT) {
		IH_UNPAID_LC_PREM_INT = iH_UNPAID_LC_PREM_INT;
	}

	public String getIH_UNPAID_PREMINT_CODE() {
		return IH_UNPAID_PREMINT_CODE;
	}

	public void setIH_UNPAID_PREMINT_CODE(String iH_UNPAID_PREMINT_CODE) {
		IH_UNPAID_PREMINT_CODE = iH_UNPAID_PREMINT_CODE;
	}

	public String getIH_REF_NO() {
		return IH_REF_NO;
	}

	public void setIH_REF_NO(String iH_REF_NO) {
		IH_REF_NO = iH_REF_NO;
	}

	public Date getIH_INS_DT() {
		return IH_INS_DT;
	}

	public void setIH_INS_DT(Date iH_INS_DT) {
		IH_INS_DT = iH_INS_DT;
	}

	public String getIH_INS_UID() {
		return IH_INS_UID;
	}

	public void setIH_INS_UID(String iH_INS_UID) {
		IH_INS_UID = iH_INS_UID;
	}

	public Date getIH_MOD_DT() {
		return IH_MOD_DT;
	}

	public void setIH_MOD_DT(Date iH_MOD_DT) {
		IH_MOD_DT = iH_MOD_DT;
	}

	public String getIH_MOD_UID() {
		return IH_MOD_UID;
	}

	public void setIH_MOD_UID(String iH_MOD_UID) {
		IH_MOD_UID = iH_MOD_UID;
	}

	public String getIH_POL_MASTER_POLICY_NO() {
		return IH_POL_MASTER_POLICY_NO;
	}

	public void setIH_POL_MASTER_POLICY_NO(String iH_POL_MASTER_POLICY_NO) {
		IH_POL_MASTER_POLICY_NO = iH_POL_MASTER_POLICY_NO;
	}

	public String getIH_EMPLOYER_CODE() {
		return IH_EMPLOYER_CODE;
	}

	public void setIH_EMPLOYER_CODE(String iH_EMPLOYER_CODE) {
		IH_EMPLOYER_CODE = iH_EMPLOYER_CODE;
	}

	public String getIH_BILL_CR_YN() {
		return IH_BILL_CR_YN;
	}

	public void setIH_BILL_CR_YN(String iH_BILL_CR_YN) {
		IH_BILL_CR_YN = iH_BILL_CR_YN;
	}

	public String getIH_YR_CODE() {
		return IH_YR_CODE;
	}

	public void setIH_YR_CODE(String iH_YR_CODE) {
		IH_YR_CODE = iH_YR_CODE;
	}

	public String getIH_DRIP_YN() {
		return IH_DRIP_YN;
	}

	public void setIH_DRIP_YN(String iH_DRIP_YN) {
		IH_DRIP_YN = iH_DRIP_YN;
	}

	public Date getIH_DRIP_DT() {
		return IH_DRIP_DT;
	}

	public void setIH_DRIP_DT(Date iH_DRIP_DT) {
		IH_DRIP_DT = iH_DRIP_DT;
	}

	public String getIH_SURPLUS_CONSIDER_YN() {
		return IH_SURPLUS_CONSIDER_YN;
	}

	public void setIH_SURPLUS_CONSIDER_YN(String iH_SURPLUS_CONSIDER_YN) {
		IH_SURPLUS_CONSIDER_YN = iH_SURPLUS_CONSIDER_YN;
	}

	public String getIH_CBC_YN() {
		return IH_CBC_YN;
	}

	public void setIH_CBC_YN(String iH_CBC_YN) {
		IH_CBC_YN = iH_CBC_YN;
	}

	public String getIH_TEMP_RCPT_NO() {
		return IH_TEMP_RCPT_NO;
	}

	public void setIH_TEMP_RCPT_NO(String iH_TEMP_RCPT_NO) {
		IH_TEMP_RCPT_NO = iH_TEMP_RCPT_NO;
	}

	public String getIH_AC_TRAN_CODE() {
		return IH_AC_TRAN_CODE;
	}

	public void setIH_AC_TRAN_CODE(String iH_AC_TRAN_CODE) {
		IH_AC_TRAN_CODE = iH_AC_TRAN_CODE;
	}

	public Long getIH_AC_DOC_NO() {
		return IH_AC_DOC_NO;
	}

	public void setIH_AC_DOC_NO(Long iH_AC_DOC_NO) {
		IH_AC_DOC_NO = iH_AC_DOC_NO;
	}

	public Long getIH_AC_YEAR() {
		return IH_AC_YEAR;
	}

	public void setIH_AC_YEAR(Long iH_AC_YEAR) {
		IH_AC_YEAR = iH_AC_YEAR;
	}

	public String getIH_COLL_TYPE() {
		return IH_COLL_TYPE;
	}

	public void setIH_COLL_TYPE(String iH_COLL_TYPE) {
		IH_COLL_TYPE = iH_COLL_TYPE;
	}

	public String getIH_PREM_HOLIDAY_YN() {
		return IH_PREM_HOLIDAY_YN;
	}

	public void setIH_PREM_HOLIDAY_YN(String iH_PREM_HOLIDAY_YN) {
		IH_PREM_HOLIDAY_YN = iH_PREM_HOLIDAY_YN;
	}

	public String getIH_FLEX_01() {
		return IH_FLEX_01;
	}

	public void setIH_FLEX_01(String iH_FLEX_01) {
		IH_FLEX_01 = iH_FLEX_01;
	}

}
