package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_RCPT_DTL;

@Repository
public interface ReceiptDetailRepository extends JpaRepository<LT_RCPT_DTL, Integer> {

}
