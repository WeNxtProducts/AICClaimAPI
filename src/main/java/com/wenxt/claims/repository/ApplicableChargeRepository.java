package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.APPL_CHARGES;

@Repository
public interface ApplicableChargeRepository extends JpaRepository<APPL_CHARGES, Integer> {

}
