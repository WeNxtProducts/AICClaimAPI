package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LhClaimEstimate;
import com.wenxt.claims.model.LtClaimDed;

@Repository
public interface ClaimDeducRepo extends JpaRepository<LtClaimDed, Integer>  {

}
