package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean(name="stu")
	@Scope("prototype")
	public Student s() {
		Student student = new Student();
		student.setId(1);
		student.setName("abc");
		student.setAddress("pune");
		return student;
	}

}
