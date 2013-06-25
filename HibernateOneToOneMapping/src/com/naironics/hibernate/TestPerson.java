package com.naironics.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.naironics.dto.Person;
import com.naironics.dto.PersonDetail;

public class TestPerson {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Person p = new Person();
		p.setPersonName("Scott");
		
		PersonDetail scottDetail = new PersonDetail();
		scottDetail.setJob("Database Admin");
		scottDetail.setZipCode("53124");
		scottDetail.setIncome(74356.50);
		
		p.setpDetail(scottDetail);
		
		session.save(p);		
		session.getTransaction().commit();
		
		session.close();
	}

}
