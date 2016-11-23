package com.findsportmates.service;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.findsportmates.dao.EventDAO;
import com.findsportmates.model.Event;

@Service
public class EventServiceImpl implements EventService {
	
	private EventDAO eventDAO;
	
	public void setEventDAO(EventDAO EventDAO) {
		this.eventDAO = EventDAO;
	}
	
	@Transactional
	public void addEvent(Event e) {
		this.eventDAO.addEvent(e);
	}
	
	@Transactional
	public void updateEvent(Event e) {
		this.eventDAO.updateEvent(e);
	}
	
	@Transactional
	public List<Event> listEvents() {
		return this.eventDAO.listEvents();
	}
	
	@Transactional
	public Event getEventById(int id) {
		return this.eventDAO.getEventById(id);
	}
	
	@Transactional
	public void removeEvent(int id) {
		this.eventDAO.removeEvent(id);
	}
	
	@Transactional
	public List<Event> listUserEvents(int id) {
		return this.eventDAO.listUserEvents(id);
	}
	
	@Transactional
	public List<Event> searchEvent(String type, String date, String num_L, String num_U) {
		int Int_num_L=toIntTime(num_L);
		int Int_num_U=toIntTime(num_U);
		String time;
		final List<Event> list = new LinkedList<Event>();
		for (int i  = Int_num_L ; i <= Int_num_U;i++) {
	
			 time = toSTime(i);
			 List<Event> result=this.eventDAO.SearchTypeAndDateTime(type,date,time);
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
