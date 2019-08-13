package com.revature.bean;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="employeeSequence")
	private int empId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String firstName, String lastName) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
