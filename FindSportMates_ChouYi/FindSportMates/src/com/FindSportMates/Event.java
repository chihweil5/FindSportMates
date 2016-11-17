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
	private String time;
	public Event(){
		
	}


	public int getId() {
	      return id;
    }
    public void setId( int id ) {
	      this.id = id;
    }

}
