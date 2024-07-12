package com.wenxt.claims.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_MEDEX_FEE_DTL;

@Repository
public interface MedExFeeDtlRepository extends JpaRepository<LT_MEDEX_FEE_DTL, Integer> {

	@Query("SELECT e from LT_MEDEX_FEE_DTL e WHERE e.MFD_MD_TRAN_ID = :tranId")
	Optional<LT_MEDEX_FEE_DTL> findByMedId(@Param("tranId") Integer tranId);

}
