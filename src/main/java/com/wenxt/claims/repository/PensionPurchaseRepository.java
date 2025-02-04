package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LM_GP_PENS_PUR_DET;

@Repository
public interface PensionPurchaseRepository extends JpaRepository<LM_GP_PENS_PUR_DET, Integer> {

}
