package com.naironics.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.naironics.dto.Address;
import com.naironics.dto.VoterInfo;

public class Driver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		VoterInfo voter = new VoterInfo();

		Address address1 = new Address();

		address1.setStreet("Street 1");
		address1.setCity("City 1");
		address1.setState("State 1");
		address1.setZipcode("1000000");

		Address address2 = new Address();

		address2.setStreet("Street 2");
		address2.setCity("City 2");
		address2.setState("State 2");
		address2.setZipcode("2000000");
		

		Address address3 = new Address();

		address3.setStreet("Street 3");
		address3.setCity("City 3");
		address3.setState("State 3");
		address3.setZipcode("3000000");

		voter.setVoterName("Voter");
		voter.setVoterAge(26);
		voter.setVoterPhoneNumber("123456789");
		voter.setVoterSex("Male");
		voter.setVoterHomeAddress(address1);
		voter.setVoterOfficeAddress(address2);
		voter.setVoterNativeAddress(address3);

		session.save(voter);

		session.getTransaction().commit();
		session.close();
	}

}
