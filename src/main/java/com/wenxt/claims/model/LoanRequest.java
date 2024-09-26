package com.wenxt.claims.model;

public class LoanRequest {
	
	private FormFieldsDTO loan;
	
	private FormFieldsDTO loanRepymt;

	public FormFieldsDTO getLoan() {
		return loan;
	}

	public void setLoan(FormFieldsDTO loan) {
		this.loan = loan;
	}

	public FormFieldsDTO getLoanRepymt() {
		return loanRepymt;
	}

	public void setLoanRepymt(FormFieldsDTO loanRepymt) {
		this.loanRepymt = loanRepymt;
	}

}
