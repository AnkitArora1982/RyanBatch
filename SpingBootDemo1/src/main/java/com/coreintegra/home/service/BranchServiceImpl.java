package com.coreintegra.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coreintegra.home.domain.Branch;
import com.coreintegra.home.repository.BranchRepository;


@Service
public class BranchServiceImpl implements BranchService{

	@Autowired
	BranchRepository branchRepository;
	
	@Override
	public Branch saveBranch(Branch branch) {
		// TODO Auto-generated method stub
		return branchRepository.save(branch);
	}

	@Override
	public List<Branch> getBranchByMinWageState(String stateName) {
		// TODO Auto-generated method stub
		return branchRepository.findByListMinWage_State(stateName);
	}

}
