package com.constructorAutowiring;

public class Customer {
	private int cid;
	private String cname;

	public Customer(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	

	public int getCid() {
		return cid;
	}


	public String getCname() {
		return cname;
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + "]";
	}

}
