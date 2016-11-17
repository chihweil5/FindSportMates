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
	@Column(name = "id")
	protected int id;

	
	@Column(name = "type")
	private String type;
	@Column(name = "date")
	private int date;
	@Column(name = "time")
	private int time;
	//private String mysqlDateString;
	@Column(name = "place")
	private String place;
	@Column(name = "createrId")
	private int createrId;

	public Event(){
		
	}
	public Event(String _type, int _date, int _time, String _place, int _createrId)
    {
        this.type = _type;
        this.date=_date;
        this.time=_time;
      //  setMysqlDateString(_dateTime);
        this.place = _place;
        this.createrId=_createrId;

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
	
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public int getCreaterId() {
		return createrId;
	}


	public void setCreaterId(int createrId) {
		this.createrId = createrId;
	}

	public int getId() {
	      return id;
    }
    public void setId( int id ) {
	      this.id = id;
    }

}
