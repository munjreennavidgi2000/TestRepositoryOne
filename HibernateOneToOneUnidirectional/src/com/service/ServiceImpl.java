package com.service;

import java.util.Scanner;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.PanCard;
import com.entity.Person;
import com.util.HibernateUtil;

public class ServiceImpl implements Services {
	SessionFactory sf = HibernateUtil.getSessionFactory();
	Session session = sf.openSession();
	Scanner sc = new Scanner(System.in);

	@Override
	public void savePersonDataWithPanCard() {
		Person p = new Person();
		PanCard pn = new PanCard();

		System.out.println("Enter name ");
		String name = sc.next();
		p.setPname(name);
		System.out.println("Enter Pan number");
		String panNo = sc.next();
		pn.setPanNo(panNo);
		p.setPanCard(pn);
		session.save(p);
		System.out.println("data saved successfully");

	}

	@Override
	public void GetPersonDataWithPanCard() {
		System.out.println("Ente id of person to get info : ");
		int id = sc.nextInt();
		Person p = session.get(Person.class, id);
		if (p != null) {
			System.out.println(p);
		} else {
			System.out.println("id not found");
		}
	}

	@Override
	public void updatePersonDataOnly() {
		System.out.println("enter id of person to update data :");
		int id = sc.nextInt();
		Person p = session.get(Person.class, id);
		if (p != null) {
			System.out.println(p);
			System.out.println("Enter name");
			p.setPname(sc.next());
			session.update(p);
			session.beginTransaction().commit();
			System.out.println("updated " + p);
		} else {
			System.out.println("updated " + p);

		}
	}

	@Override
	public void updatePanOnly() {
		System.out.println("enter person  id ");
		int id = sc.nextInt();
		Person p = session.get(Person.class, id);
		if (p != null) {
			System.out.println("Enter pan number to update");
			p.getPanCard().setPanNo(sc.next());
			session.update(p);
			session.beginTransaction().commit();
		} else {
			System.out.println("not found");
		}

	}

	@Override
	public void deletePersonOnlyUsingPersonId() {
		System.out.println("Enter person id to delete it");
		int id = sc.nextInt();
		Person p = session.get(Person.class, id);
		if (p != null) {
			System.out.println(p);
			session.delete(p);
			session.beginTransaction().commit();
			System.out.println("deleted id is " + id);
		} else {
			System.out.println("id not found");
		}
	}

	@Override
	public void deletePanCardOnlyUsingPersonId() {
		System.out.println("Enter person id ");
		int id = sc.nextInt();
		Person p = session.get(Person.class, id);
		if (p != null) {
			System.out.println(p);
			PanCard pn = p.getPanCard();
		//	session.update(p);
			session.delete(pn);
			session.beginTransaction().commit();
		} else {
			System.out.println("id not found");
		}

	}

}
