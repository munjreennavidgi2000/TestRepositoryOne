package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Employee e() {
		Employee emp = new Employee();
		emp.setEid(1);
		emp.setEname("abc");
		emp.setSalary(1000.33);
		return emp;
	}

	@Bean
	public Department d() {
		Department dp = new Department();
		dp.setDid(1);
		dp.setDname("developer");
		return dp;

	}
	@Bean
	public Department d1() {
		Department dp = new Department();
		dp.setDid(2);
		dp.setDname("developer");
		return dp;

	}

	@Bean
	public List<Student> st() {
		List<Student> list = new ArrayList<>();
		Student s = new Student();
		s.setId(1);
		s.setName("abc");

		Student s1 = new Student();
		s1.setId(2);
		s1.setName("pqr");
		list.add(s1);
		list.add(s);
		return list;

	}
}
