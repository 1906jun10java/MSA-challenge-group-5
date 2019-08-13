package com.revature.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reimbursement")
public class Reimbursement {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="reimbursementSequence")
	private int reimId;
	@Column
	private double ammount;
	@Column
	private int empId;
	
	public Reimbursement() {
		super();
	}

	public Reimbursement(int reimId, double ammount, int empId) {
		super();
		this.reimId = reimId;
		this.ammount = ammount;
		this.empId = empId;
	}

	public int getReimId() {
		return reimId;
	}

	public void setReimId(int reimId) {
		this.reimId = reimId;
	}

	public double getAmmount() {
		return ammount;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Reimbursement [reimId=" + reimId + ", ammount=" + ammount + ", empId=" + empId + "]";
	}
}
