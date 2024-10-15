package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_RI_PREM_ALLOC_DTL;

@Repository
public interface RiPremAllocDtlRepository extends JpaRepository<LT_RI_PREM_ALLOC_DTL, Integer> {

}
