package com.example.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="REIMBURSEMENT")
public class Reimbursement {

	
	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reimbursement(int id, double amount, int employeeId) {
		super();
		this.id = id;
		this.amount = amount;
		this.employeeId = employeeId;
	}
	public Reimbursement(double amount, int employeeId) {
		super();
		this.amount = amount;
		this.employeeId = employeeId;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="reimbursementSequence")
	@SequenceGenerator(allocationSize=1, name="reimbursementSequence", sequenceName="SQ_REIMBURSEMENT_PK")
	@Column(name="REIMBURSEMENT_ID")
	private int id;
	@Column(name="AMOUNT")
	private double amount;
	@Column(name="EMPLOYEE_ID")
	private int employeeId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + employeeId;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", amount=" + amount + ", employeeId=" + employeeId + "]";
	}
	
	
}
