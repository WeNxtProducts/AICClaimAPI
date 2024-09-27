package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_SURR_MAT_VALUES;

@Repository
public interface SurrMattValuesRepository extends JpaRepository<LT_SURR_MAT_VALUES, Integer> {

}
