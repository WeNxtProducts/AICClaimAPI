package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LM_PROD_APPL_PLAN_DTL;

@Repository
public interface PlanDetailMasterRepository extends JpaRepository<LM_PROD_APPL_PLAN_DTL, Integer> {

}
