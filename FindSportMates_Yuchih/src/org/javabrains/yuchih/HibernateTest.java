package org.javabrains.yuchih;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.yuchih.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUsername("First User");
		user.setAddress("First User's address");
		user.setJoinedDate(new Date());
		user.setDescription("Description of the user goes here");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();		//begin the transaction
		session.save(user);		//save the user object		
		session.getTransaction().commit();
		session.close();
		
		user = null;
		
		//create a session to fetch the objects created before
		session = sessionFactory.openSession();
		session.beginTransaction();		//begin the transaction
		user = (UserDetails) session.get(UserDetails.class, 1);
		System.out.println("User Name we found is " + user.getUsername());
		
	}

}
