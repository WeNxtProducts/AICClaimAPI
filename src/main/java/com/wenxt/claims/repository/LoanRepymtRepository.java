package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_LOAN_REPAYMENT;

@Repository
public interface LoanRepymtRepository extends JpaRepository<LT_LOAN_REPAYMENT, Integer> {

}
