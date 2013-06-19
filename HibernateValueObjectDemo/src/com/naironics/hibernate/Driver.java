package com.naironics.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.naironics.dto.Address;
import com.naironics.dto.VoterInfo;

public class Driver {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		// voter1 
		
		VoterInfo voter1 = new VoterInfo();
		
		Address address1 = new Address();
		
		address1.setStreet("Street 1");
		address1.setCity("City 1");
		address1.setState("State 1");
		address1.setZipcode("1000000");
		
		voter1.setVoterName("Voter 1");
		voter1.setVoterAge(26);
		voter1.setVoterPhoneNumber("123456789");
		voter1.setVoterSex("Male");
		voter1.setVoterAddress(address1);
		
		// voter2
		
		VoterInfo voter2 = new VoterInfo();
		
		Address address2 = new Address();
		
		address2.setStreet("Street 2");
		address2.setCity("City 2");
		address2.setState("State 2");
		address2.setZipcode("2000000");
		
		voter2.setVoterName("Voter 2");
		voter2.setVoterAge(34);
		voter2.setVoterPhoneNumber("345986127");
		voter2.setVoterSex("Male");
		voter2.setVoterAddress(address2);		
		
		session.save(voter1);
		session.save(voter2);
		
		session.getTransaction().commit();
		session.close();
	}

}
