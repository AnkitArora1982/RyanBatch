package com.coreintegra.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coreintegra.home.domain.MinWage;
import com.coreintegra.home.repository.MinWageRepository;

@Service
public class MinWageServiceImpl implements MinWageService{

	@Autowired
	MinWageRepository minWageRepository;
	
	@Override
	public MinWage saveMinWage(MinWage minWage) {
		// TODO Auto-generated method stub
		return minWageRepository.save(minWage);
	}

	@Override
	public MinWage getMinWageByStateName(String state) {
		// TODO Auto-generated method stub
		return minWageRepository.findByState(state);
	}

}
