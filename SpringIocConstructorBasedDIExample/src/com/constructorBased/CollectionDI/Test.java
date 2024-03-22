package com.constructorBased.CollectionDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("com/constructorBased/CollectionDI/Spring.xml");
		Department e = (Department) apc.getBean("d");
		System.out.println(e);
	}

}
