package com.naironics.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.naironics.dto.Employee;

public class TestEmployee {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Employee emp1 = new Employee();
		emp1.setEmpId(100);
		emp1.setEmpName("Bruce");

		/*
		 * Here the emp1 object is associated with the session to persist later,
		 * but is not yet saved into database
		 */
		session.save(emp1);
		/*
		 * This is where exactly insert statement is executed and not in the
		 * above statement
		 */
		session.getTransaction().commit();

		// We can close a session object associated with a sessionFactory	
		session.close(); 
		
		/* Never close sessionFactory object in production mode,
		 * as it is a resource intensive object
		 */
	}

}
