package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_PYMT_DTLS;

@Repository
public interface PaymentDetailsRepository extends JpaRepository<LT_PYMT_DTLS, Integer> {

}
