package com.wenxt.claims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_POL_EMPLOYEE;

@Repository
public interface LtPolEmployeeRepository extends JpaRepository<LT_POL_EMPLOYEE, Integer> {
	
	@Query("SELECT e FROM LT_POL_EMPLOYEE e WHERE e.PEMP_POL_TRAN_ID = :tranId")
	List<LT_POL_EMPLOYEE> getPrimaryEmployee(@Param("tranId") Integer tranId);

}
