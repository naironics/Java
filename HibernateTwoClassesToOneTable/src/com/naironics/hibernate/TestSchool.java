package com.naironics.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.naironics.dto.School;
import com.naironics.dto.SchoolDetail;

public class TestSchool {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
	
		{
			
		School school = new School();
		
		SchoolDetail schoolDetail = new SchoolDetail();
		
		schoolDetail.setSchoolAddress("Education St.");
		schoolDetail.setPublicSchool(false);
		schoolDetail.setStudentCount(1340);
		
		school.setSchoolName("Don Bosco International School");
		school.setDetails(schoolDetail);
		
		session.save(school);
		
	}
		
		session.getTransaction().commit();
		
		session.close();
	}
}
