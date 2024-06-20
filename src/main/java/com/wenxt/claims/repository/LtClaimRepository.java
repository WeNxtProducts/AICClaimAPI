package com.wenxt.claims.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_CLAIM;

@Repository
public interface LtClaimRepository  extends JpaRepository<LT_CLAIM, Integer>{

	Optional<LT_CLAIM> findById(Integer id);

	@Query("SELECT e.CLM_POL_NO FROM LT_CLAIM e WHERE e.CLM_CH_TRAN_ID = :tranId")
	List<String> getListOfPolicies(@Param("tranId") Integer tranId);

}
