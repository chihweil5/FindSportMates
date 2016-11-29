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
	    List<Event> list = new LinkedList<Event>();
	    System.out.println(type);
		if (type.equals("unrestricted")){
			System.out.println("Search all sports");
			list=this.eventDAO.SearchDateTimeRange(date,num_L,num_U);
		}else if(num_L.equals("unrestricted") & num_U.equals("unrestricted")){
			list=this.eventDAO.SearchType(type);
		}else{
		    list=this.eventDAO.SearchTypeAndDateTimeRange(type,date,num_L,num_U);
		}

		return list;
	}
	





}
