package com.wenxt.claims.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "LT_RCPT_PROCESS", schema = "LIFE_DEV")
public class LT_RCPT_PROCESS {
	
	    @Id
	    @SequenceGenerator(name = "ReceiptProcessTranIdSeq", sequenceName = "RP_TRAN_ID_SEQ", allocationSize = 1)
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ReceiptProcessTranIdSeq")
	    @Column(name = "RP_TRAN_ID")
	    private Integer RP_TRAN_ID;

	    @Column(name = "RP_RH_TRAN_ID")
	    private Integer RP_RH_TRAN_ID;

	    @Column(name = "RP_POL_TRAN_ID")
	    private Integer RP_POL_TRAN_ID;

	    @Column(name = "RP_PROPOSAL_NO")
	    private String RP_PROPOSAL_NO;

	    @Column(name = "RP_POL_NO")
	    private String RP_POL_NO;

	    @Column(name = "RP_END_NO")
	    private String RP_END_NO;

	    @Column(name = "RP_END_NO_IDX")
	    private Integer RP_END_NO_IDX;

	    @Column(name = "RP_MASTER_POL_NO")
	    private String RP_MASTER_POL_NO;

	    @Column(name = "RP_PROCESS_YN")
	    private String RP_PROCESS_YN;

	    @Temporal(TemporalType.DATE)
	    @Column(name = "RP_INS_DT")
	    private Date RP_INS_DT;

	    @Column(name = "RP_INS_ID")
	    private String RP_INS_ID;

	    @Temporal(TemporalType.DATE)
	    @Column(name = "RP_MOD_DT")
	    private Date RP_MOD_DT;

	    @Column(name = "RP_MOD_ID")
	    private String RP_MOD_ID;

	    @Column(name = "RP_BRK_COMM_YN")
	    private String RP_BRK_COMM_YN;

	    @Column(name = "RP_FLEX_01")
	    private String RP_FLEX_01;

	    @Column(name = "RP_FLEX_02")
	    private String RP_FLEX_02;

	    @Column(name = "RP_FLEX_03")
	    private String RP_FLEX_03;

	    @Column(name = "RP_FLEX_04")
	    private String RP_FLEX_04;

	    @Column(name = "RP_FLEX_05")
	    private String RP_FLEX_05;

	    @Column(name = "RP_ORG_PYBL_LC_AMT")
	    private Double RP_ORG_PYBL_LC_AMT;

	    @Column(name = "RP_PYBL_LC_AMT")
	    private Double RP_PYBL_LC_AMT;

	    @Column(name = "RP_RCPT_LC_AMT")
	    private Double RP_RCPT_LC_AMT;

	    @Column(name = "RP_BALANCE_LC_AMT")
	    private Double RP_BALANCE_LC_AMT;

	    @Column(name = "RP_ADJ_LC_AMT")
	    private Double RP_ADJ_LC_AMT;

	    @Column(name = "RP_BRK_LC_COMM")
	    private Double RP_BRK_LC_COMM;

	    @Column(name = "RP_BH_SYS_ID")
	    private Long RP_BH_SYS_ID;

	    @Column(name = "RP_BILL_NO")
	    private String RP_BILL_NO;

	    @Column(name = "RP_MAN_ENT_YN")
	    private String RP_MAN_ENT_YN;

	    @Column(name = "RP_PROPOSAL_TRAN_ID")
	    private Long RP_PROPOSAL_TRAN_ID;

	    @Column(name = "RP_DOC_TYPE")
	    private String RP_DOC_TYPE;

	    @Temporal(TemporalType.DATE)
	    @Column(name = "RP_DUE_DT")
	    private Date RP_DUE_DT;

	    @Column(name = "RP_SHORT_COLL_LC_AMT")
	    private Double RP_SHORT_COLL_LC_AMT;

	    @Column(name = "RP_EXCS_LC_AVLB_AMT")
	    private Double RP_EXCS_LC_AVLB_AMT;

	    @Column(name = "RP_EXCS_UTIL_YN")
	    private String RP_EXCS_UTIL_YN;

	    @Column(name = "RP_DRIP_FLAG")
	    private String RP_DRIP_FLAG;

		public Integer getRP_TRAN_ID() {
			return RP_TRAN_ID;
		}

		public void setRP_TRAN_ID(Integer rP_TRAN_ID) {
			RP_TRAN_ID = rP_TRAN_ID;
		}

		public Integer getRP_RH_TRAN_ID() {
			return RP_RH_TRAN_ID;
		}

		public void setRP_RH_TRAN_ID(Integer rP_RH_TRAN_ID) {
			RP_RH_TRAN_ID = rP_RH_TRAN_ID;
		}

		public Integer getRP_POL_TRAN_ID() {
			return RP_POL_TRAN_ID;
		}

		public void setRP_POL_TRAN_ID(Integer rP_POL_TRAN_ID) {
			RP_POL_TRAN_ID = rP_POL_TRAN_ID;
		}

		public String getRP_PROPOSAL_NO() {
			return RP_PROPOSAL_NO;
		}

		public void setRP_PROPOSAL_NO(String rP_PROPOSAL_NO) {
			RP_PROPOSAL_NO = rP_PROPOSAL_NO;
		}

		public String getRP_POL_NO() {
			return RP_POL_NO;
		}

		public void setRP_POL_NO(String rP_POL_NO) {
			RP_POL_NO = rP_POL_NO;
		}

		public String getRP_END_NO() {
			return RP_END_NO;
		}

		public void setRP_END_NO(String rP_END_NO) {
			RP_END_NO = rP_END_NO;
		}

		public Integer getRP_END_NO_IDX() {
			return RP_END_NO_IDX;
		}

		public void setRP_END_NO_IDX(Integer rP_END_NO_IDX) {
			RP_END_NO_IDX = rP_END_NO_IDX;
		}

		public String getRP_MASTER_POL_NO() {
			return RP_MASTER_POL_NO;
		}

		public void setRP_MASTER_POL_NO(String rP_MASTER_POL_NO) {
			RP_MASTER_POL_NO = rP_MASTER_POL_NO;
		}

		public String getRP_PROCESS_YN() {
			return RP_PROCESS_YN;
		}

		public void setRP_PROCESS_YN(String rP_PROCESS_YN) {
			RP_PROCESS_YN = rP_PROCESS_YN;
		}

		public Date getRP_INS_DT() {
			return RP_INS_DT;
		}

		public void setRP_INS_DT(Date rP_INS_DT) {
			RP_INS_DT = rP_INS_DT;
		}

		public String getRP_INS_ID() {
			return RP_INS_ID;
		}

		public void setRP_INS_ID(String rP_INS_ID) {
			RP_INS_ID = rP_INS_ID;
		}

		public Date getRP_MOD_DT() {
			return RP_MOD_DT;
		}

		public void setRP_MOD_DT(Date rP_MOD_DT) {
			RP_MOD_DT = rP_MOD_DT;
		}

		public String getRP_MOD_ID() {
			return RP_MOD_ID;
		}

		public void setRP_MOD_ID(String rP_MOD_ID) {
			RP_MOD_ID = rP_MOD_ID;
		}

		public String getRP_BRK_COMM_YN() {
			return RP_BRK_COMM_YN;
		}

		public void setRP_BRK_COMM_YN(String rP_BRK_COMM_YN) {
			RP_BRK_COMM_YN = rP_BRK_COMM_YN;
		}

		public String getRP_FLEX_01() {
			return RP_FLEX_01;
		}

		public void setRP_FLEX_01(String rP_FLEX_01) {
			RP_FLEX_01 = rP_FLEX_01;
		}

		public String getRP_FLEX_02() {
			return RP_FLEX_02;
		}

		public void setRP_FLEX_02(String rP_FLEX_02) {
			RP_FLEX_02 = rP_FLEX_02;
		}

		public String getRP_FLEX_03() {
			return RP_FLEX_03;
		}

		public void setRP_FLEX_03(String rP_FLEX_03) {
			RP_FLEX_03 = rP_FLEX_03;
		}

		public String getRP_FLEX_04() {
			return RP_FLEX_04;
		}

		public void setRP_FLEX_04(String rP_FLEX_04) {
			RP_FLEX_04 = rP_FLEX_04;
		}

		public String getRP_FLEX_05() {
			return RP_FLEX_05;
		}

		public void setRP_FLEX_05(String rP_FLEX_05) {
			RP_FLEX_05 = rP_FLEX_05;
		}

		public Double getRP_ORG_PYBL_LC_AMT() {
			return RP_ORG_PYBL_LC_AMT;
		}

		public void setRP_ORG_PYBL_LC_AMT(Double rP_ORG_PYBL_LC_AMT) {
			RP_ORG_PYBL_LC_AMT = rP_ORG_PYBL_LC_AMT;
		}

		public Double getRP_PYBL_LC_AMT() {
			return RP_PYBL_LC_AMT;
		}

		public void setRP_PYBL_LC_AMT(Double rP_PYBL_LC_AMT) {
			RP_PYBL_LC_AMT = rP_PYBL_LC_AMT;
		}

		public Double getRP_RCPT_LC_AMT() {
			return RP_RCPT_LC_AMT;
		}

		public void setRP_RCPT_LC_AMT(Double rP_RCPT_LC_AMT) {
			RP_RCPT_LC_AMT = rP_RCPT_LC_AMT;
		}

		public Double getRP_BALANCE_LC_AMT() {
			return RP_BALANCE_LC_AMT;
		}

		public void setRP_BALANCE_LC_AMT(Double rP_BALANCE_LC_AMT) {
			RP_BALANCE_LC_AMT = rP_BALANCE_LC_AMT;
		}

		public Double getRP_ADJ_LC_AMT() {
			return RP_ADJ_LC_AMT;
		}

		public void setRP_ADJ_LC_AMT(Double rP_ADJ_LC_AMT) {
			RP_ADJ_LC_AMT = rP_ADJ_LC_AMT;
		}

		public Double getRP_BRK_LC_COMM() {
			return RP_BRK_LC_COMM;
		}

		public void setRP_BRK_LC_COMM(Double rP_BRK_LC_COMM) {
			RP_BRK_LC_COMM = rP_BRK_LC_COMM;
		}

		public Long getRP_BH_SYS_ID() {
			return RP_BH_SYS_ID;
		}

		public void setRP_BH_SYS_ID(Long rP_BH_SYS_ID) {
			RP_BH_SYS_ID = rP_BH_SYS_ID;
		}

		public String getRP_BILL_NO() {
			return RP_BILL_NO;
		}

		public void setRP_BILL_NO(String rP_BILL_NO) {
			RP_BILL_NO = rP_BILL_NO;
		}

		public String getRP_MAN_ENT_YN() {
			return RP_MAN_ENT_YN;
		}

		public void setRP_MAN_ENT_YN(String rP_MAN_ENT_YN) {
			RP_MAN_ENT_YN = rP_MAN_ENT_YN;
		}

		public Long getRP_PROPOSAL_TRAN_ID() {
			return RP_PROPOSAL_TRAN_ID;
		}

		public void setRP_PROPOSAL_TRAN_ID(Long rP_PROPOSAL_TRAN_ID) {
			RP_PROPOSAL_TRAN_ID = rP_PROPOSAL_TRAN_ID;
		}

		public String getRP_DOC_TYPE() {
			return RP_DOC_TYPE;
		}

		public void setRP_DOC_TYPE(String rP_DOC_TYPE) {
			RP_DOC_TYPE = rP_DOC_TYPE;
		}

		public Date getRP_DUE_DT() {
			return RP_DUE_DT;
		}

		public void setRP_DUE_DT(Date rP_DUE_DT) {
			RP_DUE_DT = rP_DUE_DT;
		}

		public Double getRP_SHORT_COLL_LC_AMT() {
			return RP_SHORT_COLL_LC_AMT;
		}

		public void setRP_SHORT_COLL_LC_AMT(Double rP_SHORT_COLL_LC_AMT) {
			RP_SHORT_COLL_LC_AMT = rP_SHORT_COLL_LC_AMT;
		}

		public Double getRP_EXCS_LC_AVLB_AMT() {
			return RP_EXCS_LC_AVLB_AMT;
		}

		public void setRP_EXCS_LC_AVLB_AMT(Double rP_EXCS_LC_AVLB_AMT) {
			RP_EXCS_LC_AVLB_AMT = rP_EXCS_LC_AVLB_AMT;
		}

		public String getRP_EXCS_UTIL_YN() {
			return RP_EXCS_UTIL_YN;
		}

		public void setRP_EXCS_UTIL_YN(String rP_EXCS_UTIL_YN) {
			RP_EXCS_UTIL_YN = rP_EXCS_UTIL_YN;
		}

		public String getRP_DRIP_FLAG() {
			return RP_DRIP_FLAG;
		}

		public void setRP_DRIP_FLAG(String rP_DRIP_FLAG) {
			RP_DRIP_FLAG = rP_DRIP_FLAG;
		}

}


