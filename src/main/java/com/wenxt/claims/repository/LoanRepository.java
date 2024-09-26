package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_LOAN;

@Repository
public interface LoanRepository extends JpaRepository<LT_LOAN, Integer> {

}
