package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.constructorAutowiring.Product;
import com.entity.College;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("byType.xml");
		College college = (College) apc.getBean("c");
		System.out.println(college);
		System.out.println("==================================");
		Product p = (Product) apc.getBean("p");
		System.out.println(p);

	}
}