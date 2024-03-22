package com.setterBasedCollectionDI;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int sid;
	List<String> name;
	Set<String> address;
	Map<Integer, String> div;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<Integer, String> getDiv() {
		return div;
	}

	public void setDiv(Map<Integer, String> div) {
		this.div = div;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", address=" + address + ", div=" + div + "]";
	}

}
