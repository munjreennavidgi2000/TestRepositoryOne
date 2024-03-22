package com.entity;

public class College {

	private int cid;
	private String cname;
	private Student student;
	private Student student1;

	public Student getStudent1() {
		return student1;
	}

	public void setStudent1(Student student1) {
		this.student1 = student1;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", student=" + student + ", student1=" + student1 + "]";
	}

}
