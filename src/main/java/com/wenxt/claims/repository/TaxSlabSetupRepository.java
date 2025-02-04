package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LM_GP_TAX_SLAB_SETUP;

@Repository
public interface TaxSlabSetupRepository extends JpaRepository<LM_GP_TAX_SLAB_SETUP, Integer> {

}
