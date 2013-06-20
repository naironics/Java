package com.naironics.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.naironics.dto.Address;
import com.naironics.dto.UserData;

public class HibernateDriver {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		UserData user = new UserData();

		user.setName("David Boetha");

		Address addr1 = new Address();
		addr1.setStreet("Street 1");
		addr1.setCity("City 1");
		addr1.setState("State 1");
		addr1.setZipcode("1000001");

		Address addr2 = new Address();
		addr2.setStreet("Street 2");
		addr2.setCity("City 2");
		addr2.setState("State 2");
		addr2.setZipcode("2000002");

		user.getListOfAddresses().add(addr1);
		user.getListOfAddresses().add(addr2);

		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();

		session.close();
	}

}
