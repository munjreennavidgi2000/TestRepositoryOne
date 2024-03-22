package com.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("com/entity/NewFile.xml");
		Employee e = (Employee) apc.getBean("e");
		System.out.println(e);

	}

}
