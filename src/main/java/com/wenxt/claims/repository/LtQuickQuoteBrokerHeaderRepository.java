package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_QQUOT_BROK_HDR;
import com.wenxt.claims.model.LT_QUICK_QUOTE;

@Repository
public interface LtQuickQuoteBrokerHeaderRepository extends JpaRepository<LT_QQUOT_BROK_HDR, Long> {

}
