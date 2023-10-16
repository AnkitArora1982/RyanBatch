package com.coreintegra.home.service;

import com.coreintegra.home.domain.MinWage;

public interface MinWageService {
	public MinWage saveMinWage(MinWage minWage);
	
	public MinWage getMinWageByStateName(String state);
}
