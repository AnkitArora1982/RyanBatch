package com.coreintegra.home.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MinWage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int wageId;
	
	private String state;
	private int pf;
	private int esic;
	public int getWageId() {
		return wageId;
	}
	public void setWageId(int wageId) {
		this.wageId = wageId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	public int getEsic() {
		return esic;
	}
	public void setEsic(int esic) {
		this.esic = esic;
	}
	
	
}
