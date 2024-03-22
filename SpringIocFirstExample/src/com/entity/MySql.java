package com.entity;

public class MySql implements DbConnection {

	@Override
	public void conOn() {
		System.out.println("mysql connection on");
	}

	@Override
	public void conOff() {
		System.out.println("mysql connection off");

	}

}
