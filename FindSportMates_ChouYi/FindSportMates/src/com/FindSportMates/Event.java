package com.FindSportMates;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.text.SimpleDateFormat;
import java.util.Date;
@Entity
@Table(name = "Event")
public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "eventid")
	protected int eventid;

	
	@Column(name = "type")
	private String type;
	@Column(name = "date")
	private String date;
	@Column(name = "time")
	private String time;
	//private String mysqlDateString;
	@Column(name = "place")
	private String place;
	@Column(name = "hostid")
	private int hostid;

	public Event(){
		
	}
	public Event(String _type, String _date, String _time, String _place, int _hostid)
    {
        this.type = _type;
        this.date=_date;
        this.time=_time;
      //  setMysqlDateString(_dateTime);
        this.place = _place;
        this.hostid=_hostid;

    }
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	//public String getMysqlDateString() {
		//return mysqlDateString;
	//}


//	public void setMysqlDateString(String pattern) {
		//Date now = new Date();
        //note String pattern = "yyyy-MM-dd";
      //  SimpleDateFormat formatter = new SimpleDateFormat(pattern);
	//	this.mysqlDateString = formatter.format(now);
		
//	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public int getHostid() {
		return hostid;
	}


	public void setHostid(int hostid) {
		this.hostid = hostid;
	}

	public int getEventid() {
	      return eventid;
    }
    public void setEventid( int eventid ) {
	      this.eventid = eventid;
    }

}
