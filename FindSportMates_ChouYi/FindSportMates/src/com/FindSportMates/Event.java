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
	@Column(name = "dateTime")
	private String mysqlDateString;
	@Column(name = "place")
	private String place;
	@Column(name = "createrId")
	private int createrId;

	public Event(){
		
	}
	public Event(String _type, String _dateTime, String _place, int _createrId)
    {
        this.type = _type;
        //this.mysqlDateString=_dateTime;
        setMysqlDateString(_dateTime);
        this.place = _place;
        this.createrId=_createrId;

    }
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getMysqlDateString() {
		return mysqlDateString;
	}


	public void setMysqlDateString(String pattern) {
		Date now = new Date();
        //note String pattern = "yyyy-MM-dd";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		this.mysqlDateString = formatter.format(now);
		//this.mysqlDateString = pattern;
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
