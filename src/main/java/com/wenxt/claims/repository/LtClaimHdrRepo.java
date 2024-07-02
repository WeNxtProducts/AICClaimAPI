package com.wenxt.claims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LtClaimHdr;

@Repository
public interface LtClaimHdrRepo extends JpaRepository<LtClaimHdr, Integer> {
	
	@Query("SELECT e FROM LtClaimHdr e WHERE e.CH_TRAN_ID = :tranId")
	LtClaimHdr getById(@Param("tranId") Integer tranId);

}
