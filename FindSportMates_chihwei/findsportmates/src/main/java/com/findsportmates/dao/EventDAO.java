package com.findsportmates.dao;

import java.util.List;

import com.findsportmates.model.Event;

public interface EventDAO {
	public void addEvent(Event e);
	public void updateEvent(Event e);
	public List<Event> listEvents();
	public List<Event> listUserEvents(int id);
	public Event getEventById(int id);
	public void removeEvent(int id);
	public List<Event> SearchTypeAndDateTime(String _type, String _date, String _time);
}
