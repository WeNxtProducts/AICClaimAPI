package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_CLAIM;

@Repository
public interface LtClaimRepository  extends JpaRepository<LT_CLAIM, Long>{

}
