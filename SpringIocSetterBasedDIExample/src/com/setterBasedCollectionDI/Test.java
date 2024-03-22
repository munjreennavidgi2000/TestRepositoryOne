package com.setterBasedCollectionDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("com/setterBasedCollectionDI/NewFile1.xml");
		Student student = (Student) apc.getBean("s");
		System.out.println(student);

	}

}
