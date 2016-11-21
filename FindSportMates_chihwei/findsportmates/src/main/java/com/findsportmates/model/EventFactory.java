package com.findsportmates.model;

import java.util.Date;

public class EventFactory {
	
	public Event createEvent(String type, int eventId, int hostId, String eventTime, String eventPlace) {
		
		if(type == "Volleyball") {
			return new Volleyball(eventId, hostId, eventTime, eventPlace);
		}
		else if (type == "Basketball") {
			return new Basketball(eventId, hostId, eventTime, eventPlace);
		}
		else {
			return null;
		}
	}

}
