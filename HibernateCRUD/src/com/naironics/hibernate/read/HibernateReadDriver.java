package com.naironics.hibernate.read;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.naironics.dto.UserDetails;

public class HibernateReadDriver {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//buildSessionFactory() is deprecated , but still works
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.read.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		// pulling out a record from USER_DETAILS table with primary key 6
		UserDetails user = (UserDetails)session.get(UserDetails.class, 6);
		System.out.println("User name pulled out is :"+ user.getUserName());
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		/*This statement also works fine here in spite of session being closed , because it is a
		 first level data and has nothing to do with session. */
		System.out.println("User name pulled out is :"+ user.getUserName());
		
	}
}
