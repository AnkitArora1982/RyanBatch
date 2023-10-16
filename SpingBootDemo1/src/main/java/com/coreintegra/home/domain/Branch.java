package com.coreintegra.home.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int branchId;
	private String branchName;
	private String address;
	@OneToMany
	private List<MinWage> listMinWage;
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<MinWage> getListMinWage() {
		return listMinWage;
	}
	public void setListMinWage(List<MinWage> listMinWage) {
		this.listMinWage = listMinWage;
	}
	
	
}
