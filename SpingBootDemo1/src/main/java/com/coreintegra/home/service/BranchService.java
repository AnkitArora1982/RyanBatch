package com.coreintegra.home.service;

import java.util.List;

import com.coreintegra.home.domain.Branch;

public interface BranchService {
	public Branch saveBranch(Branch branch);
	
	public List<Branch> getBranchByMinWageState(String stateName);
}
