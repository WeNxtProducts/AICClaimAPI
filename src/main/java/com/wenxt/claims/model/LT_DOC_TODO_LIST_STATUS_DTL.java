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
@Table(name = "LT_DOC_TODO_LIST_STATUS_DTL")
public class LT_DOC_TODO_LIST_STATUS_DTL {

	@Id
	@Column(name = "DTLSD_TRAN_ID")
	@SequenceGenerator(name = "docListStatusTranIdSeq", sequenceName = "DTLSD_TRAN_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "docListStatusTranIdSeq")
	private Integer DTLSD_TRAN_ID;

	@Column(name = "DTLSD_TODO_LIST_ITEM")
	private String DTLSD_TODO_LIST_ITEM;

	@Column(name = "DTLSD_VALUE")
	private String DTLSD_VALUE;

	@Column(name = "DTLSD_INS_DT")
	private Date DTLSD_INS_DT;

	@Column(name = "DTLSD_INS_ID")
	private String DTLSD_INS_ID;

	@Column(name = "DTLSD_DTLS_TRAN_ID")
	private Integer DTLSD_DTLS_TRAN_ID;

	public Integer getDTLSD_TRAN_ID() {
		return DTLSD_TRAN_ID;
	}

	public void setDTLSD_TRAN_ID(Integer dTLSD_TRAN_ID) {
		DTLSD_TRAN_ID = dTLSD_TRAN_ID;
	}

	public String getDTLSD_TODO_LIST_ITEM() {
		return DTLSD_TODO_LIST_ITEM;
	}

	public void setDTLSD_TODO_LIST_ITEM(String dTLSD_TODO_LIST_ITEM) {
		DTLSD_TODO_LIST_ITEM = dTLSD_TODO_LIST_ITEM;
	}

	public String getDTLSD_VALUE() {
		return DTLSD_VALUE;
	}

	public void setDTLSD_VALUE(String dTLSD_VALUE) {
		DTLSD_VALUE = dTLSD_VALUE;
	}

	public Date getDTLSD_INS_DT() {
		return DTLSD_INS_DT;
	}

	public void setDTLSD_INS_DT(Date dTLSD_INS_DT) {
		DTLSD_INS_DT = dTLSD_INS_DT;
	}

	public String getDTLSD_INS_ID() {
		return DTLSD_INS_ID;
	}

	public void setDTLSD_INS_ID(String dTLSD_INS_ID) {
		DTLSD_INS_ID = dTLSD_INS_ID;
	}

	public Integer getDTLSD_DTLS_TRAN_ID() {
		return DTLSD_DTLS_TRAN_ID;
	}

	public void setDTLSD_DTLS_TRAN_ID(Integer dTLSD_DTLS_TRAN_ID) {
		DTLSD_DTLS_TRAN_ID = dTLSD_DTLS_TRAN_ID;
	}

}
