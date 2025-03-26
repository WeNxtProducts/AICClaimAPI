package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wenxt.claims.model.LT_Quote;
public interface LT_QuoteRepository extends JpaRepository<LT_Quote, Long>{
	
	  @Query(value = "SELECT FUNC_AGE_CALC(SYSDATE, TO_DATE(:dob, 'DD/MM/YYYY'), '2') FROM DUAL", nativeQuery = true)
	    Integer calculateAge(@Param("dob") String dob);

}
