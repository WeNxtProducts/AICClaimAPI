package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.PROD_FACTORS;

@Repository
public interface ProductFactorRepository extends JpaRepository<PROD_FACTORS, Integer> {

}
