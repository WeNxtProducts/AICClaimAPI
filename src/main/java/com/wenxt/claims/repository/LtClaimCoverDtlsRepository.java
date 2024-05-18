package com.wenxt.claims.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_CLAIM_COVER_DTLS;

@Repository
public interface LtClaimCoverDtlsRepository extends JpaRepository<LT_CLAIM_COVER_DTLS, Long> {
	
	Optional<LT_CLAIM_COVER_DTLS> findById(Long id); 

}
