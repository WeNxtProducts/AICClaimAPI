package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_POL_PLAN_HDR;

@Repository
public interface PlanHeaderRepository extends JpaRepository<LT_POL_PLAN_HDR, Long> {

}
