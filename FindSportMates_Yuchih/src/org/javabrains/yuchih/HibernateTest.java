package org.javabrains.yuchih;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.yuchih.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		String userName = "user5";
		Query query = session.createQuery("from UserDetails where username = ?");
		query.setString(0, userName);
		List<UserDetails> users = (List<UserDetails>) query.list();
		session.getTransaction().commit();
		session.close();
		for (UserDetails user : users) 
			System.out.println("The user id is : " + user.getUserId());
		
		
		/*
		//create a session to fetch Id created before
		user = null;
		
		session = sessionFactory.openSession();
		session.beginTransaction();		//begin the transaction
		user = (UserDetails) session.get(UserDetails.class, 1);
		System.out.println("User Name we found is " + user.getUsername());
		session.close();
		*/

		
		
		
	}

}
