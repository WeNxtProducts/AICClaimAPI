package com.wenxt.claims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_QUICK_QUOTE;
import com.wenxt.claims.model.PlanDetailsDTO;

@Repository
public interface LTQuickQuoteRepository extends JpaRepository<LT_QUICK_QUOTE, Long> {
	
//	SELECT new com.wenxt.claims.model.PlanDetailsDTO(p.name, p.code) FROM Plan p
	
    @Query(value = "SELECT PAD_COVER_CODE AS coverCode, PAD_SA_TYPE AS saType FROM LM_PROD_APPL_PLAN_DTL WHERE PAD_PLAN_CODE = :planCode",
    	    nativeQuery = true)
    List<PlanDetailsDTO> findCoverDetails(@Param("planCode") String planCode);

}
