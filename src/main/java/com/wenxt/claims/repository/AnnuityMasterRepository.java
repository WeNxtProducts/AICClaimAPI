package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.wenxt.claims.model.ANNUITY_MASTER;

@Service
public interface AnnuityMasterRepository extends JpaRepository<ANNUITY_MASTER, Integer> {

}
