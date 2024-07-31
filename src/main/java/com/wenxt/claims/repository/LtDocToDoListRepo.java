package com.wenxt.claims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LtDocTodoListStatus;

@Repository
public interface LtDocToDoListRepo extends JpaRepository<LtDocTodoListStatus , Integer> {
	
	@Query("SELECT e from LtDocTodoListStatus e WHERE e.DTLS_POL_TRAN_ID = :tranId AND e.DTLS_GROUP_CODE = :groupCode")
	List<LtDocTodoListStatus> getCheckListList(@Param("tranId") Integer tranId, @Param("groupCode") String groupCode);

}
