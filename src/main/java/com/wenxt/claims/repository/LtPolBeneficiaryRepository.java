package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_POL_BENEFICIARY;

@Repository
public interface LtPolBeneficiaryRepository extends JpaRepository<LT_POL_BENEFICIARY, Integer> {

}
