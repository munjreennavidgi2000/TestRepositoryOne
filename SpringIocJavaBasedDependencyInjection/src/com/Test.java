package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = (Employee) apc.getBean("e");
		System.out.println(employee);

		System.out.println("======================================");

		List<Student> slist = (List<Student>) apc.getBean("st");
		System.out.println(slist);
	}
}
