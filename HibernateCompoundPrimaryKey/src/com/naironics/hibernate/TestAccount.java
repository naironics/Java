package com.naironics.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.naironics.dto.Account;
import com.naironics.dto.CompoundKey;

public class TestAccount {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Account checking = new Account();
		CompoundKey cKey1 = new CompoundKey(131, 100001);
		checking.setAccountBalance(12567);
		checking.setCompoundKey(cKey1);

		Account savings = new Account();
		CompoundKey cKey2 = new CompoundKey(131, 200001);
		savings.setAccountBalance(1463);
		savings.setCompoundKey(cKey2);

		session.save(checking);
		session.save(savings);

		session.getTransaction().commit();

		session.close();

	}

}
