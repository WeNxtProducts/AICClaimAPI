package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_POL_EMP_COVER;

@Repository
public interface LtPolEmpCoverRepository extends JpaRepository<LT_POL_EMP_COVER, Integer> {

}
