package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LT_DOC_TODO_LIST_STATUS_DTL;

@Repository
public interface DocToDoListStatusDtlRepository extends JpaRepository<LT_DOC_TODO_LIST_STATUS_DTL, Integer> {

}
