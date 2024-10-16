package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_MEDEX_FEE_DTL;

@Repository
public interface LtMedExFeeDtlRepository extends JpaRepository<LT_MEDEX_FEE_DTL, Integer> {

}
