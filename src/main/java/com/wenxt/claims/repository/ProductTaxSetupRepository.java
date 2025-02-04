package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.PROD_TAX_SETUP;

@Repository
public interface ProductTaxSetupRepository extends JpaRepository<PROD_TAX_SETUP, Integer> {

}
