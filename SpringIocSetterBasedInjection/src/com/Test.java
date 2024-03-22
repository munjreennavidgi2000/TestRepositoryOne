package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Spring.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		Student student = (Student) bf.getBean("s");
		System.out.println(student);

		System.out.println("======================================");
		ApplicationContext apc = new ClassPathXmlApplicationContext("Spring.xml");
		Student student1 = (Student) apc.getBean("s");
		System.out.println(student1);

	}

}
