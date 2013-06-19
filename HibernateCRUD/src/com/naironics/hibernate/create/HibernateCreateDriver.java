package com.naironics.hibernate.create;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.naironics.dto.UserDetails;

public class HibernateCreateDriver {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//buildSessionFactory() is deprecated , but still works
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.create.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		for (int i = 0; i < 10; i++) {
			UserDetails user = new UserDetails();
			user.setUserName("User " + i);
			session.save(user);

		}

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}
}
