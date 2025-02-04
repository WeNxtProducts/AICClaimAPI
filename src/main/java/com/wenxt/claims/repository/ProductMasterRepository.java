package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LM_PRODUCT;

@Repository
public interface ProductMasterRepository extends JpaRepository<LM_PRODUCT, String> {

}
