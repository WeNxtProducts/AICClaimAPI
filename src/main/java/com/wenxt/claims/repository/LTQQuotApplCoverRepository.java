package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_QQUOT_APPL_COVER;

@Repository
public interface LTQQuotApplCoverRepository  extends JpaRepository<LT_QQUOT_APPL_COVER, Long> {
	
	@Query("SELECT SUM(QQAC_LC_PREM) FROM LT_QQUOT_APPL_COVER WHERE QQAC_QUOT_TRAN_ID = :id AND QQAC_SELECT_YN = 'Y'")
	public Integer getSumAssured(@Param("id")int id);

}
