package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_QQUOT_CONDITION;

@Repository
public interface LTQuickQuoteConditionRepository extends JpaRepository<LT_QQUOT_CONDITION, Long> {

}
