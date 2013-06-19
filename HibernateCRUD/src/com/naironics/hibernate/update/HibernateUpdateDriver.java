package com.naironics.hibernate.update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.naironics.dto.UserDetails;

public class HibernateUpdateDriver {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// buildSessionFactory() is deprecated , but still works
		SessionFactory sessionFactory = new Configuration().configure(
				"hibernate.cfg.update.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		/*
		 * next 3 statements (ignoring the print statement) are , pulling out a
		 * record from USER_DETAILS table with primary key 4, so that it can be
		 * set to a new name and updated
		 */

		UserDetails user = (UserDetails) session.get(UserDetails.class, 4);
		System.out.println("User name with primary key " + user.getUserId()
				+ " currently has following username :" + user.getUserName());
		user.setUserName("New Username");
		session.update(user);

		System.out.println("User name with primary key " + user.getUserId()
				+ " updated to following username :" + user.getUserName());

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

		/*
		 * This statement also works fine here in spite of session being closed
		 * , because it is a first level data and has nothing to do with
		 * session.
		 */
		System.out.println("User name with primary key " + user.getUserId()
				+ " updated to following username :" + user.getUserName());
	}
}
