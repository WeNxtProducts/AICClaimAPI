package com.wenxt.claims.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wenxt.claims.model.LtDocTodoListStatus;

@Repository
public interface LtDocToDoListRepo extends JpaRepository<LtDocTodoListStatus , Integer> {

}
