package com.entity;

public class Subject {
	public Subject() {
		System.out.println("subject constructor");
	}

	private int sid;
	private String sname;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Subject [sid=" + sid + ", sname=" + sname + "]";
	}

}
