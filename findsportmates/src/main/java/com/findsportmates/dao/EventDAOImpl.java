package com.findsportmates.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.findsportmates.model.Event;
import com.findsportmates.model.User;

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
	@SuppressWarnings("unchecked")
	public List<Event> SearchType(String _type) {

		// use HQL to search		
    	Session session = this.sessionFactory.getCurrentSession();
    	String hql = "from Event event where event.eventType like" + "'%"+_type+"%'";
	    Query query = session.createQuery(hql);
	    List<Event> result = query.list();
	    return result;
	}
	@SuppressWarnings("unchecked")
	public List<Event> SearchDateTime(String _date,String  _time) {

		// use HQL to search		
    	Session session = this.sessionFactory.getCurrentSession(); 
    	String hql = "from Event event where event.eventDate like" + "'%"+_date+"%'" +" and " +"event.eventTime like " + "'%"+_time+"%'";
	    Query query = session.createQuery(hql);
    	List<Event> result=query.list();
	    return result;
        
	}
	public List<Event> SearchDateTimeRange(String _date,String num_L,String num_U) {
		int Int_num_L=toIntTime(num_L);
		int Int_num_U=toIntTime(num_U);
		String time;
	    List<Event> list = new LinkedList<Event>();
		for (int i  = Int_num_L ; i <= Int_num_U;i++) {
	
			 time = toSTime(i);
			 List<Event> result=SearchDateTime(_date,time);
			 Iterator<Event> events =result.iterator(); 

		     while(events.hasNext()) {
		            Event event = (Event) events.next(); 
		    		list.add((Event) event);
		    }	
		}
		return list;
		
		
	    }
	public List<Event> SearchTypeAndDateTimeRange(String type, String date, String num_L, String num_U) {
		int Int_num_L=toIntTime(num_L);
		int Int_num_U=toIntTime(num_U);
		String time;
	    List<Event> list = new LinkedList<Event>();
		for (int i  = Int_num_L ; i <= Int_num_U;i++) {
	
			 time = toSTime(i);
			 List<Event> result=SearchTypeAndDateTime(type,date,time);
			 Iterator<Event> events =result.iterator(); 

		     while(events.hasNext()) {
		            Event event = (Event) events.next(); 
		    		list.add((Event) event);
		    }	
		}
		return list;
	}
	
	public static int toIntTime(String s) {
		String[] hourMin = s.split(":");
		int hour = Integer.parseInt(hourMin[0]);
		return hour;
	}

	public static String toSTime(int _i) {
		String s1;
		String s2;
		if (_i < 10) {
			s1 = "0" + Integer.toString(_i);
		} else {
			s1 = Integer.toString(_i);
		}
		if (_i + 2 < 10) {
			s2 = "0" + Integer.toString(_i + 2);
		} else {
			s2 = Integer.toString(_i + 2);
		}
		String s = s1 + ":00-" + s2 + ":00";
		return s;

	
	}
	
}
