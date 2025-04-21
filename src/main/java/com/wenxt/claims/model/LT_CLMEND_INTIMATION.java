package com.wenxt.claims.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LT_CLMEND_INTIMATION", schema = "LIFE_DEV")
public class LT_CLMEND_INTIMATION {

    @Id
    @Column(name = "CI_CLM_END")
    private String CI_CLM_END;

    @Column(name = "CI_TYPE")
    private String CI_TYPE;

    @Column(name = "CI_TYPE_DESC")
    private String CI_TYPE_DESC;

    @Column(name = "CI_INTM_DT")
    private Date CI_INTM_DT;

    @Column(name = "CI_LOSS_DT")
    private Date CI_LOSS_DT;

    @Column(name = "CI_CONTACT_PER")
    private String CI_CONTACT_PER;

    @Column(name = "CI_CONTACT_NO")
    private Long CI_CONTACT_NO;

    @Column(name = "CI_INS_DT")
    private Date CI_INS_DT;

    @Column(name = "CI_INS_ID")
    private String CI_INS_ID;

	public String getCI_CLM_END() {
		return CI_CLM_END;
	}

	public void setCI_CLM_END(String cI_CLM_END) {
		CI_CLM_END = cI_CLM_END;
	}

	public String getCI_TYPE() {
		return CI_TYPE;
	}

	public void setCI_TYPE(String cI_TYPE) {
		CI_TYPE = cI_TYPE;
	}

	public String getCI_TYPE_DESC() {
		return CI_TYPE_DESC;
	}

	public void setCI_TYPE_DESC(String cI_TYPE_DESC) {
		CI_TYPE_DESC = cI_TYPE_DESC;
	}

	public Date getCI_INTM_DT() {
		return CI_INTM_DT;
	}

	public void setCI_INTM_DT(Date cI_INTM_DT) {
		CI_INTM_DT = cI_INTM_DT;
	}

	public Date getCI_LOSS_DT() {
		return CI_LOSS_DT;
	}

	public void setCI_LOSS_DT(Date cI_LOSS_DT) {
		CI_LOSS_DT = cI_LOSS_DT;
	}

	public String getCI_CONTACT_PER() {
		return CI_CONTACT_PER;
	}

	public void setCI_CONTACT_PER(String cI_CONTACT_PER) {
		CI_CONTACT_PER = cI_CONTACT_PER;
	}

	public Long getCI_CONTACT_NO() {
		return CI_CONTACT_NO;
	}

	public void setCI_CONTACT_NO(Long cI_CONTACT_NO) {
		CI_CONTACT_NO = cI_CONTACT_NO;
	}

	public Date getCI_INS_DT() {
		return CI_INS_DT;
	}

	public void setCI_INS_DT(Date cI_INS_DT) {
		CI_INS_DT = cI_INS_DT;
	}

	public String getCI_INS_ID() {
		return CI_INS_ID;
	}

	public void setCI_INS_ID(String cI_INS_ID) {
		CI_INS_ID = cI_INS_ID;
	}
   
}
