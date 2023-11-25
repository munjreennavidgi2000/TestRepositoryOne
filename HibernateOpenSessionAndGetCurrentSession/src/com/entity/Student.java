package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	public Student() {

	}

	@Id
	private int sid;
	private String sname;

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}

}
