package com.wenxt.claims.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_RCPT_PROCESS;

@Repository
public interface ReceiptProcessRepository extends JpaRepository<LT_RCPT_PROCESS, Integer> {

	@Query("SELECT e from LT_RCPT_PROCESS e WHERE e.RP_TRAN_ID = :tranId AND e.RP_POL_NO = :polNo")
	Optional<LT_RCPT_PROCESS> findByIdAndPolNo(@Param("tranId") Integer tranId, @Param("polNo") String polNo);

}
