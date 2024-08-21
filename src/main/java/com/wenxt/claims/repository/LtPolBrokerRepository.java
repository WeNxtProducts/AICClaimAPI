package com.wenxt.claims.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_POL_BROKER;

@Repository
public interface LtPolBrokerRepository extends JpaRepository<LT_POL_BROKER, Integer> {
	
	@Query("SELECT e FROM LT_POL_BROKER e WHERE e.PBRK_POL_TRAN_ID = :tranId")
	List<LT_POL_BROKER> findByPolId(@Param("tranId") Integer tranId);

}
