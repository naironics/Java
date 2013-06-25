package com.naironics.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.naironics.dto.Customer;

public class TestCustomer {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		Customer c1 = new Customer();
		c1.setCustomerName("Alex");
		c1.setCustomerAddress("Derby St.");
		c1.setCreditScore(995);
		c1.setRewardPoints(17445);
		
		session.save(c1);
		
		session.getTransaction().commit();
	}
}
