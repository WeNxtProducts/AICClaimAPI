package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_POL_EMPLOYEE;

@Repository
public interface LtPolEmployeeRepository extends JpaRepository<LT_POL_EMPLOYEE, Integer> {

}
