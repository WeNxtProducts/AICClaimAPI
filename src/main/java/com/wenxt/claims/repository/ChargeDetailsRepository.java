package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LM_GP_CHRG_DETAILS;

@Repository
public interface ChargeDetailsRepository extends JpaRepository<LM_GP_CHRG_DETAILS, Integer> {

}
