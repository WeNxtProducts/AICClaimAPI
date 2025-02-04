package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.WITHDRAWAL_SETUP;

@Repository
public interface WithdrawalSetupRepository extends JpaRepository<WITHDRAWAL_SETUP, Integer> {

}
