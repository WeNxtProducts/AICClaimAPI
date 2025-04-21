package com.wenxt.claims.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LTQquotAssuredDtls;

@Repository
public interface LTQQuotAssuredDLTSRepository  extends JpaRepository<LTQquotAssuredDtls, Long>{

//	@Query("SELECT * FROM LT_QQUOT_ASSURED_DTLS e WHERE e.QQAD_QUOT_TRAN_ID = :tranId")
//	Optional<LTQquotAssuredDtls> findByQQAD_QUOT_TRAN_ID(Integer tranId);

}
