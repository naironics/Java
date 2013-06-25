package com.naironics.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.naironics.dto.Module;
import com.naironics.dto.Project;
import com.naironics.dto.Task;

public class TestInheritance {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Project p = new Project();
		p.setProjectName("Hibernate");

		Module m = new Module();
		m.setProjectName("Spring Lessons");
		m.setModuleName("AOP");

		Task t = new Task();
		t.setProjectName("Java Lessons");
		t.setModuleName("Collections");
		t.setTaskName("HashMap");

		session.save(p);
		session.save(m);
		session.save(t);

		session.getTransaction().commit();

		session.close();

	}

}
