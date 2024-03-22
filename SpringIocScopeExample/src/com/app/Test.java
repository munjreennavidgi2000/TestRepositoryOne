package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/entity/NewFile.xml");
		Student student = (Student) apc.getBean("s");
		System.out.println(student);
		System.out.println(student.hashCode());
		System.out.println(student.getSubject().hashCode());
		System.out.println("==============================================");
		Student student1 = (Student) apc.getBean("s");
		System.out.println(student1);
		System.out.println(student1.hashCode());
		System.out.println(student1.getSubject().hashCode());

	}

}
