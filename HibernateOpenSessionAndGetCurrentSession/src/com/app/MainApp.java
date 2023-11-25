package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Student;
import com.util.HibernateUtil;

public class MainApp {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();

//		Student student = new Student(2, "pqr");
//		session.save(student);
//		session.beginTransaction().commit();

		System.out.println("******************************************************");
		// by using open session : always opens new session.
		// Session session = sf.openSession();
//		Session session1 = sf.openSession();
//		
//		System.out.println(session.hashCode());
//		System.out.println(session1.hashCode());

		// by using getCurrentSession :first checks session is open or not if open then
		// returns the current session, otherwise opens new session.

		Session session = sf.openSession();
		System.out.println(session.hashCode());

		Session session1 = sf.getCurrentSession();
		System.out.println(session1.hashCode());

		System.out.println("*****************************************************");
//		Student student = session.get(Student.class, 1);
//		System.out.println(student);

		// here when we use constructor for setting values for entity class
		// then, while we retrieve data from db it throws instantiation exception.
		// it throws exception only in the case of retrieving data not in save, update
		// or delete.
		// so we need to add default constructor to the entity class.
	}

}
