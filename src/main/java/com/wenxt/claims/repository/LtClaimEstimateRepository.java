package com.example.aicbaseCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aicbaseCrud.model.LT_CLAIM_ESTIMATE;

@Repository
public interface LtClaimEstimateRepository extends JpaRepository<LT_CLAIM_ESTIMATE, Long> {

}
