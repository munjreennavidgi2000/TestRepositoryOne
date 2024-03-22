package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Student;
import com.util.HibernateUtil;

public class MainApp {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Student s = new Student();
		s.setId(1);
		s.setName("abc");
		s.setAddress("pune");
		session.save(s);
		session.beginTransaction().commit();

	}

}
