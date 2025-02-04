package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LM_GP_MAT_PRO_HDR;

@Repository
public interface MaturityProcessHeaderRepository extends JpaRepository<LM_GP_MAT_PRO_HDR, Integer> {

}
