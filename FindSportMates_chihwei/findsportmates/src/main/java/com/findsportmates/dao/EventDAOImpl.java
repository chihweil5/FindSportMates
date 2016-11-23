package com.findsportmates.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.findsportmates.model.Event;

@Repository
public class EventDAOImpl implements EventDAO {

	private static final Logger logger = LoggerFactory.getLogger(EventDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public void addEvent(Event e) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(e);
		logger.info("Event saved successfully, Event Details=" + e);
	}

	public void updateEvent(Event e) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(e);
		logger.info("Event updated successfully, Event Details=" + e);
	}

	@SuppressWarnings("unchecked")
	public List<Event> listEvents() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Event> eventsList = session.createQuery("from Event").list();
		for (Event e : eventsList) {
			logger.info("Event List::" + e);
		}
		return eventsList;
	}

	@SuppressWarnings("unchecked")
	public List<Event> listUserEvents(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		List<Event> eventsList = session.createQuery("from Event e where e.hostId =" + id).list();
		for (Event e : eventsList) {
			logger.info("Event List::" + e);
		}
		return eventsList;
	}

	public Event getEventById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Event e = (Event) session.load(Event.class, new Integer(id));
		logger.info("Event loaded successfully, Event details=" + e);
		return e;
	}

	public void removeEvent(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Event e = (Event) session.load(Event.class, new Integer(id));
		if (null != e) {
			session.delete(e);
		}
		logger.info("Event deleted successfully, Event details=" + e);

	}
	
	@SuppressWarnings("unchecked")
	public List<Event> SearchTypeAndDateTime(String _type, String _date, String _time) {

		// use HQL to search
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from Event event where event.eventType like" + "'%" + _type + "%'" + " and " + "event.eventDate like" + "'%"
				+ _date + "%'" + " and " + "event.eventTime like " + "'%" + _time + "%'";
		Query query = session.createQuery(hql);
		List<Event> result = query.list();
		return result;

	}
}
