package com.constructorBased.CollectionDI;

import java.util.List;

public class Department {

	private int did;
	private String dname;

	private List<Employee> elist;

	public Department(int did, String dname, List<Employee> elist) {
		super();
		this.did = did;
		this.dname = dname;
		this.elist = elist;
	}

	
	public int getDid() {
		return did;
	}

	public String getDname() {
		return dname;
	}
	

	public List<Employee> getElist() {
		return elist;
	}


	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", elist=" + elist + "]";
	}

}
