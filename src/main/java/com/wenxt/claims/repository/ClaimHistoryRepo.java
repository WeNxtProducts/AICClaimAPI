package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LhClaimEstimate;

@Repository
public interface ClaimHistoryRepo extends JpaRepository<LhClaimEstimate, Integer> {

}
