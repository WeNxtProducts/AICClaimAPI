package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_DEPOSIT;

@Repository
public interface DepositRepository extends JpaRepository<LT_DEPOSIT, Integer> {

}
