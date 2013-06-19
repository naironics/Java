package com.naironics.hibernate.delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.naironics.dto.UserDetails;

public class HibernateDeleteDriver {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//buildSessionFactory() is deprecated , but still works
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.delete.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		/* next 2 statements are , pulling out a record from USER_DETAILS table
		 *  with primary key 6, so that it can be deleted */
		 
		UserDetails user = (UserDetails)session.get(UserDetails.class, 6);
		session.delete(user);
		System.out.println("User name deleted is :"+ user.getUserName());
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		/*This statement also works fine here in spite of session being closed , because it is a
		 first level data and has nothing to do with session. */
		System.out.println("User name deleted is :"+ user.getUserName());
		
	}
}
