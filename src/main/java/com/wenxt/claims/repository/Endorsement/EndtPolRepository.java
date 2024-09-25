package com.wenxt.claims.repository.Endorsement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.Endorsement.LT_ENDT_REQ_POL;

@Repository
public interface EndtPolRepository extends JpaRepository<LT_ENDT_REQ_POL, Integer> {

}
