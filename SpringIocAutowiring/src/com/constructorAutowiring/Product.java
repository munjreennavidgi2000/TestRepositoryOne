package com.constructorAutowiring;

public class Product {

	private int pid;
	private String pname;
	private Customer customer;
	private Customer customer1;

	public Product(int pid, String pname, Customer customer) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.customer = customer;
	}

	public Product(int pid, String pname, Customer customer, Customer customer1) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.customer = customer;
		this.customer1 = customer1;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", customer=" + customer + ", customer1=" + customer1 + "]";
	}

}
