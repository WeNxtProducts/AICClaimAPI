package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_RCPT_HDR;

@Repository
public interface ReceiptHeaderRepository extends JpaRepository<LT_RCPT_HDR, Integer> {

}
