package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LM_GP_YR_EN_PRO_DET;

@Repository
public interface YearEndProDetRepository extends JpaRepository<LM_GP_YR_EN_PRO_DET, Integer> {

}
