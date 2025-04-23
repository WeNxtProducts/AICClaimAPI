package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_CLMEND_INTIMATION;

@Repository
public interface ClaimIntimationRepository extends JpaRepository<LT_CLMEND_INTIMATION, Integer> {

}
