package com.naironics.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Driver {
	
	public static void main(String[] args){
		
		StudentInfo student = new StudentInfo();
		student.setName("Ethan Hunt");
		student.setRollNumber(1);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}

}
