package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Student;
import com.entity.Student1;
import com.util.HibernateUtil;

public class MainApp {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		Student s = new Student();
		s.setName("efgh");

		Student1 s1 = new Student1();
		s1.setSname("cdef");

		session.save(s);
		session.save(s1);
		session.beginTransaction().commit();
		System.out.println("Data entered successfully ");
                     System.out.println("entered data successfully");
	}

}
