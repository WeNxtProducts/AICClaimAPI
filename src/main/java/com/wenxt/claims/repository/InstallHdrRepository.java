package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_INSTALL_HDR;

@Repository
public interface InstallHdrRepository extends JpaRepository<LT_INSTALL_HDR, Integer> {

}
