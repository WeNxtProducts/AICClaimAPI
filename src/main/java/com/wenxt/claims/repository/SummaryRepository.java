package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LM_GP_POL_SUMMARY;

@Repository
public interface SummaryRepository extends JpaRepository<LM_GP_POL_SUMMARY, Integer> {

}
