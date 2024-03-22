package com.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {

		Resource resource = new ClassPathResource("Spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		DbConnection db = (DbConnection) beanFactory.getBean("m");
		db.conOn();
		db.conOff();

		System.out.println("==============================================");

		ApplicationContext apc = new ClassPathXmlApplicationContext("Spring.xml");
		DbConnection dbc = (DbConnection) apc.getBean("o");
		dbc.conOff();
		dbc.conOn();
	}

}
