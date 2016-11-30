package com.findsportmates.service;

import java.util.List;

import com.findsportmates.model.Event;
import com.findsportmates.model.User;

public interface EventService {
	
	public void addEvent(Event e);
	public void updateEvent(Event e);
	public List<Event> listEvents();
	public List<Event> listUserEvents(int id);
	public Event getEventById(int id);
	public void removeEvent(int id);
	public List<Event> searchEvent(String type,String date,String num_L,String num_U);
	public void addParticipant(int id, User u);
}
