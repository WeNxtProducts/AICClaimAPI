package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_POL_DISCLOAD;

@Repository
public interface LtPolDiscLoadRepository extends JpaRepository<LT_POL_DISCLOAD, Integer> {

}
