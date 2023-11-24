package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Student;
import com.util.HibernateUtil;

public class MainApp {
	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

//		Student s = new Student();
//		s.setId(2);
//		s.setName("pqr");
//		s.setAddress("mumbai");
//		session.save(s);
//		session.beginTransaction().commit();

//		Student student = session.get(Student.class, 1);
//		System.out.println(student.getId());
//		System.out.println(student.getName());

		Student student1 = session.load(Student.class, 1);
		System.out.println(student1.getId());
		System.out.println(student1.getName());

	}

}
