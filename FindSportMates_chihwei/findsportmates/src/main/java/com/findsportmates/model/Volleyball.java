package com.findsportmates.model;

import java.util.Date;

public class Volleyball extends Event {

	public Volleyball(int eventId, int hostId, String eventTime, String eventPlace) {
		setEventType("Volleyball");
		setEventId(eventId);
		setHostId(hostId);
		setEventTime(eventTime);
		setEventPlace(eventPlace);
	}
	
	

}
