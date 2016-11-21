package com.findsportmates.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.findsportmates.model.Event;
import com.findsportmates.model.User;

@Repository
public class UserDAOImpl implements UserDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addUser(User u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(u);
		logger.info("User saved successfully, User Details="+u);
	}

	public void updateUser(User u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(u);
		logger.info("Event updated successfully, Event Details="+u);	
	}

	@SuppressWarnings("unchecked")
	public List<User> listUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> usersList = session.createQuery("from User").list();
		for(User u : usersList){
			logger.info("User List::"+u);
		}
		return usersList;
	}

	public User getUserById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		User u = (User)session.load(User.class, new Integer(id));
		logger.info("User loaded successfully, User details="+u);
		return u;
	}

	public void removeUser(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		User u = (User) session.load(User.class, new Integer(id));
		if(null != u){
			session.delete(u);
		}
		logger.info("User deleted successfully, User details="+u);
		
	}

	@SuppressWarnings("unchecked")
	public User getUserByName(String username ) {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> usersList = session.createQuery("from User user where user.username='" + username +"'").list();
		logger.info("User loaded successfully, User details="+ usersList.get(0));
		return usersList.get(0);
	}

	
}
