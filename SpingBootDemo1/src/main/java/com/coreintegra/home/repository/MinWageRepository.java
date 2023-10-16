package com.coreintegra.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coreintegra.home.domain.MinWage;

@Repository
public interface MinWageRepository extends JpaRepository<MinWage, Integer>{

	public MinWage findByState(String state);
	
}
