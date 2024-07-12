package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_MEDEX_DTL;

@Repository
public interface MedExDtlRepository extends JpaRepository<LT_MEDEX_DTL, Integer> {

}
