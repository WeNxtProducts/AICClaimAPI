package com.wenxt.claims.repository.Endorsement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.Endorsement.LT_ENDT_REQ_BENF;

@Repository
public interface EndtBeneficiaryRepository extends JpaRepository<LT_ENDT_REQ_BENF, Integer> {

}
