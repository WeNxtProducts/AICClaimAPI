package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.INTEREST_MASTER;

@Repository
public interface InterestMasterRepository extends JpaRepository<INTEREST_MASTER, Integer> {

}
