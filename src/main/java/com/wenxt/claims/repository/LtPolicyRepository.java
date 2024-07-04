package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_POLICY;

@Repository
public interface LtPolicyRepository extends JpaRepository<LT_POLICY, Integer> {

}
