package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LtClaimHdr;

@Repository
public interface LtClaimHdrRepo extends JpaRepository<LtClaimHdr, Integer> {

}
