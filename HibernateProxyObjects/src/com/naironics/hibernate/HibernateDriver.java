package com.naironics.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.naironics.dto.Job;
import com.naironics.dto.PersonInfo;

public class HibernateDriver {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();

		// PERSON 1

		PersonInfo person1 = new PersonInfo();
		person1.setPersonName("Daniel");

		Job job1 = new Job();
		job1.setJobTitle("Web Developer");
		job1.setJobCompany("ABC Corp");
		job1.setJobSalary(10000.00);
		job1.setJobLocation("Location 1");

		Job job2 = new Job();
		job2.setJobTitle("Java Developer");
		job2.setJobCompany("DEF Corp");
		job2.setJobSalary(20000.00);
		job2.setJobLocation("Location 2");

		Job job3 = new Job();
		job3.setJobTitle("Java Architect");
		job3.setJobCompany("GHI Corp");
		job3.setJobSalary(30000.00);
		job3.setJobLocation("Location 3");

		person1.getListOfJobs().add(job1);
		person1.getListOfJobs().add(job2);
		person1.getListOfJobs().add(job3);

		// PERSON 2

		PersonInfo person2 = new PersonInfo();
		person2.setPersonName("Jack");

		Job job4 = new Job();
		job4.setJobTitle("Research Scientist");
		job4.setJobCompany("CBA Corp");
		job4.setJobSalary(20000.00);
		job4.setJobLocation("Location 4");

		Job job5 = new Job();
		job5.setJobTitle("Data Engineer");
		job5.setJobCompany("FED Corp");
		job5.setJobSalary(40000.00);
		job5.setJobLocation("Location 5");

		Job job6 = new Job();
		job6.setJobTitle("Data Scientist");
		job6.setJobCompany("IHG Corp");
		job6.setJobSalary(60000.00);
		job6.setJobLocation("Location 6");

		person2.getListOfJobs().add(job4);
		person2.getListOfJobs().add(job5);
		person2.getListOfJobs().add(job6);

		session.beginTransaction();
		session.save(person1);
		session.save(person2);
		session.getTransaction().commit();

		session.close();
		
		person1 = null;
		
		session = sessionFactory.openSession();
		person1 = (PersonInfo)session.get(PersonInfo.class,1);		
		System.out.println(person1.getListOfJobs().size());
		
		

	}

}
