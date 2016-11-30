package com.findsportmates.dao;

import java.util.List;
import java.util.Set;

import com.findsportmates.model.Event;
import com.findsportmates.model.User;

public interface EventDAO {
	public void addEvent(Event e);
	public void updateEvent(Event e);
	public List<Event> listEvents();
	public List<Event> listUserEvents(int id);
	public Event getEventById(int id);
	public void removeEvent(int id);
	public List<Event> SearchTypeAndDateTimeRange(String type, String date, String num_L, String num_U);
	public List<Event> SearchDateTimeRange(String _date,String num_L,String num_U);
	public List<Event> SearchType(String _type);
	//public Set<User> getParticipants(int id);
}
