package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_CLAIM_BENEFICIARY;

@Repository
public interface LtClaimBeneficiaryRepository extends JpaRepository<LT_CLAIM_BENEFICIARY, Long> {

}
