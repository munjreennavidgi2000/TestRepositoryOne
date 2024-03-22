package com.constructorBased.CustomObject;

public class Car {

	private int cid;
	private String cname;
	private Driver driver;

	public Car(int cid, String cname, Driver driver) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.driver = driver;
	}

	public int getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public Driver getDriver() {
		return driver;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cname=" + cname + ", driver=" + driver + "]";
	}

}
