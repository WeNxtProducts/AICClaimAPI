package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_POL_STATUS;

@Repository
public interface PolStatusRepository extends JpaRepository<LT_POL_STATUS, Integer> {

	@Query("SELECT e FROM LT_POL_STATUS e WHERE e.PSTAT_POL_TRAN_ID = :tranId")
	LT_POL_STATUS findByPolId(@Param("tranId") Integer tranId);

}
