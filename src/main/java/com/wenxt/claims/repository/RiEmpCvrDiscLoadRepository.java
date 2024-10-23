package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_RI_EMP_CVR_DISC_LOAD;

@Repository
public interface RiEmpCvrDiscLoadRepository extends JpaRepository<LT_RI_EMP_CVR_DISC_LOAD, Integer> {

}
