package com.findsportmates.model;

import java.util.Date;

public class Basketball extends Event {
	
	public Basketball(int eventId, int hostId, String eventTime, String eventPlace) {
		setEventType("Basketball");
		setEventId(eventId);
		setHostId(hostId);
		setEventTime(eventTime);
		setEventPlace(eventPlace);
	}

}
