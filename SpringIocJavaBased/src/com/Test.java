package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = (Student) apc.getBean("stu");
		System.out.println(student);
		System.out.println(student.hashCode());

		System.out.println("======================================");
		Student student1 = (Student) apc.getBean("stu");
		System.out.println(student1);
		System.out.println(student1.hashCode());
	}

}
