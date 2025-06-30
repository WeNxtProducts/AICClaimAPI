package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_QQUOT_BROK_DTL;

@Repository
public interface LTQuickQuoteBrokerDetailRepository extends JpaRepository<LT_QQUOT_BROK_DTL, Long> {

}
