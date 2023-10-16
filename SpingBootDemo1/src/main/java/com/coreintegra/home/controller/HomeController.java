package com.coreintegra.home.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coreintegra.home.domain.Branch;
import com.coreintegra.home.domain.MinWage;
import com.coreintegra.home.service.BranchServiceImpl;
import com.coreintegra.home.service.MinWageServiceImpl;
import com.fasterxml.jackson.databind.JsonNode;

@RestController
public class HomeController {

	@Autowired
	MinWageServiceImpl minWageServiceImpl;
	
	@Autowired
	BranchServiceImpl branchServiceImpl;
	
	@RequestMapping(value="/saveBranch",method = RequestMethod.POST)
	public Branch saveBranch(@RequestBody JsonNode jsonNode) {
		String branchName = jsonNode.get("branchName").asText();
		String address = jsonNode.get("address").asText();
		String state = jsonNode.get("state").asText();
		Branch branch = new Branch();
		branch.setBranchName(branchName);
		branch.setAddress(address);
		MinWage minWage = minWageServiceImpl.getMinWageByStateName(state);
		List<MinWage> listMinWage = new ArrayList<>();
		listMinWage.add(minWage);
		branch.setListMinWage(listMinWage);
		return branchServiceImpl.saveBranch(branch);
	}
	
	@RequestMapping(value="/saveMinWage",method = RequestMethod.POST)
	public MinWage saveMinWage(@RequestBody JsonNode jsonNode) {
		String state = jsonNode.get("state").asText();
		int pf = jsonNode.get("pf").asInt();
		int esic = jsonNode.get("esic").asInt();
		MinWage minWage = new MinWage();
		minWage.setState(state);
		minWage.setPf(pf);
		minWage.setEsic(esic);
		return minWageServiceImpl.saveMinWage(minWage);
	}
	
	@RequestMapping(value="/getMinWageByBranch/{stateName}",method = RequestMethod.GET)
	public List<Branch> getBranchByMinWageState(@PathVariable String stateName) {
		//First Commit by Ankit Arora
		return branchServiceImpl.getBranchByMinWageState(stateName);
	}
	
}
