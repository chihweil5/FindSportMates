package com.findsportmates.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.findsportmates.dao.EventDAO;
import com.findsportmates.model.Event;
import com.findsportmates.model.EventFactory;

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
	public List<Event> searchEvent(String type,String date,String num_L,String num_U) {
		return this.eventDAO.searchEvent(type,date,num_L,num_U);
	}

}
