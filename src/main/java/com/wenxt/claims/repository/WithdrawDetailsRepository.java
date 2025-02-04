package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LM_GP_WDRA_DETAILS;

@Repository
public interface WithdrawDetailsRepository extends JpaRepository<LM_GP_WDRA_DETAILS, Integer> {

}
