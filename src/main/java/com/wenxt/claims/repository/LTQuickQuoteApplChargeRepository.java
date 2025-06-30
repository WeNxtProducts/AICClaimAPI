package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_QQUOT_APPL_CHARGE;

@Repository
public interface LTQuickQuoteApplChargeRepository extends JpaRepository<LT_QQUOT_APPL_CHARGE, Long> {

}
