package com.constructorBased.CollectionDI;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int id;

	private List<String> name;

	private Set<String> dept;

	private Map<Integer, String> address;

	public Employee(int id, List<String> name, Set<String> dept, Map<Integer, String> address) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public List<String> getName() {
		return name;
	}

	public Set<String> getDept() {
		return dept;
	}

	public Map<Integer, String> getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", address=" + address + "]";
	}

}
