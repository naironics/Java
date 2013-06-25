package com.naironics.hibernate;

import java.sql.Date;
import java.util.GregorianCalendar;

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

		{
			Employee emp1 = new Employee();

			// emp1.setEmpId(100); // Hibernate will generate primary key

			emp1.setEmpName("Harris");
			emp1.setEmpEmailAddress("harris@hibernate.com");
			emp1.setEmpPassword("harrispass");
			emp1.setPermanent(true);
			emp1.setEmpJoinDate(new GregorianCalendar(2013, 06, 24));
			emp1.setEmpLoginTime(Date.valueOf("2013-06-24"));

			session.save(emp1);
		}

		{
			Employee emp2 = new Employee();
			emp2.setEmpName("Jonathan");
			emp2.setEmpEmailAddress("jonathan@hibernate.com");
			emp2.setEmpPassword("jonathanpass");
			emp2.setPermanent(true);
			emp2.setEmpJoinDate(new GregorianCalendar(2013, 06, 24));
			emp2.setEmpLoginTime(Date.valueOf("2013-06-24"));

			session.save(emp2);
		}

		{
			Employee emp3 = new Employee();
			emp3.setEmpName("Richard");
			emp3.setEmpEmailAddress("richard@hibernate.com");
			emp3.setEmpPassword("richardpass");
			emp3.setPermanent(true);
			emp3.setEmpJoinDate(new GregorianCalendar(2013, 06, 24));
			emp3.setEmpLoginTime(Date.valueOf("2013-06-24"));

			session.save(emp3);
		}
		

		{
			Employee emp4 = new Employee();
			emp4.setEmpName("Thomas");
			emp4.setEmpEmailAddress("thomas@hibernate.com");
			emp4.setEmpPassword("thomaspass");
			emp4.setPermanent(true);
			emp4.setEmpJoinDate(new GregorianCalendar(2013, 06, 24));
			emp4.setEmpLoginTime(Date.valueOf("2013-06-24"));

			session.save(emp4);
		}
		
		

		{
			Employee emp5 = new Employee();
			emp5.setEmpName("Samson");
			emp5.setEmpEmailAddress("samson@hibernate.com");
			emp5.setEmpPassword("samsonpass");
			emp5.setPermanent(false);
			emp5.setEmpJoinDate(new GregorianCalendar(2013, 06, 24));
			emp5.setEmpLoginTime(Date.valueOf("2013-06-24"));

			session.save(emp5);
		}
		
		

		{
			Employee emp6 = new Employee();
			emp6.setEmpName("Raymond");
			emp6.setEmpEmailAddress("raymond@hibernate.com");
			emp6.setEmpPassword("raymondpass");
			emp6.setPermanent(false);
			emp6.setEmpJoinDate(new GregorianCalendar(2013, 06, 24));
			emp6.setEmpLoginTime(Date.valueOf("2013-06-24"));

			session.save(emp6);
		}

		session.getTransaction().commit();
		session.close();

	}

}
