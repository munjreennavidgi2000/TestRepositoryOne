package com.entity;

public class Oracle implements DbConnection {

	@Override
	public void conOn() {
		System.out.println("oracle connection on");

	}

	@Override
	public void conOff() {
		System.out.println("oracle connection off");
	}

}
