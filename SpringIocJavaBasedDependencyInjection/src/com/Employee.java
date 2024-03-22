package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int eid;
	private String ename;
	private double salary;
	@Autowired
	@Qualifier(value="d")
	private Department department;
	@Autowired
	@Qualifier(value="d1")
	private Department department1;

	public Department getDepartment1() {
		return department1;
	}

	public void setDepartment1(Department department1) {
		this.department1 = department1;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", department=" + department
				+ ", department1=" + department1 + "]";
	}

}
