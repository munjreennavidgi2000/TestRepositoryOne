package com.constructorBased.CustomObject;

public class Driver {

	private int did;
	private String dname;

	public Driver(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public String getDname() {
		return dname;
	}

	@Override
	public String toString() {
		return "Driver [did=" + did + ", dname=" + dname + "]";
	}

}
