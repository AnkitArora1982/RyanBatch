package com.coreintegra.home.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coreintegra.home.domain.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer>{

	public List<Branch> findByListMinWage_State(String stateName);
	
}
