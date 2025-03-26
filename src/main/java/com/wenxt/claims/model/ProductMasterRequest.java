package com.wenxt.claims.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductMasterRequest {
	
	private FormFieldsDTO productMaster;
	
	private FormFieldsDTO withdrawalSetup;
	
	@JsonProperty("ProductFactor")
	private FormFieldsDTO prodFactor;
	
	private FormFieldsDTO applicableCharges;
	
	private FormFieldsDTO interestMaster;
	
	private FormFieldsDTO prodTaxSetup;
	
	private FormFieldsDTO annuityMaster;
	
	private FormFieldsDTO taxSlabSetup;
	
	private FormFieldsDTO taxSlabRate;

	public FormFieldsDTO getProductMaster() {
		return productMaster;
	}

	public void setProductMaster(FormFieldsDTO productMaster) {
		this.productMaster = productMaster;
	}

	public FormFieldsDTO getWithdrawalSetup() {
		return withdrawalSetup;
	}

	public void setWithdrawalSetup(FormFieldsDTO withdrawalSetup) {
		this.withdrawalSetup = withdrawalSetup;
	}

	public FormFieldsDTO getProdFactor() {
		return prodFactor;
	}

	public void setProdFactor(FormFieldsDTO prodFactor) {
		this.prodFactor = prodFactor;
	}

	public FormFieldsDTO getApplicableCharges() {
		return applicableCharges;
	}

	public void setApplicableCharges(FormFieldsDTO applicableCharges) {
		this.applicableCharges = applicableCharges;
	}

	public FormFieldsDTO getInterestMaster() {
		return interestMaster;
	}

	public void setInterestMaster(FormFieldsDTO interestMaster) {
		this.interestMaster = interestMaster;
	}

	public FormFieldsDTO getProdTaxSetup() {
		return prodTaxSetup;
	}

	public void setProdTaxSetup(FormFieldsDTO prodTaxSetup) {
		this.prodTaxSetup = prodTaxSetup;
	}

	public FormFieldsDTO getAnnuityMaster() {
		return annuityMaster;
	}

	public void setAnnuityMaster(FormFieldsDTO annuityMaster) {
		this.annuityMaster = annuityMaster;
	}

	public FormFieldsDTO getTaxSlabSetup() {
		return taxSlabSetup;
	}

	public void setTaxSlabSetup(FormFieldsDTO taxSlabSetup) {
		this.taxSlabSetup = taxSlabSetup;
	}

	public FormFieldsDTO getTaxSlabRate() {
		return taxSlabRate;
	}

	public void setTaxSlabRate(FormFieldsDTO taxSlabRate) {
		this.taxSlabRate = taxSlabRate;
	}

}
