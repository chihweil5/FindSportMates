package com.FindSportMates;

import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session; 
import org.hibernate.cfg.Configuration;
//import org.hibernate.cfg.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SearchEvent {
	private static SessionFactory sessionfactory;
	
	public static void main(String[] args) {
		sessionfactory = new Configuration().configure().buildSessionFactory();
		SearchEvent ME = new SearchEvent();
		////datetime = "yyyy-MM-dd";
		ME.addEvent("Basketball",201611031,1600,"room1",2);
		ME.addEvent("Badminton",20161105,1300,"room2",2);
		ME.addEvent("Basketball",20161105,1400,"room1",2);
        
		ME.SearchDateTime(20161106,1350,1500);
		sessionfactory.close(); 

	}
	/* Method to CREATE an event in the database */
	public void addEvent(String _type, int _date, int _time,String _place, int _createrId){

		
	    Event event = new Event(_type,_date, _time,_place,_createrId);

	    Session session = sessionfactory.openSession();
	    Transaction tx= session.beginTransaction();
	    session.save(event);
	    tx.commit();

	}
	
    public void SearchDateTime(int _date,int num_L,int num_U) {
		
		// use HQL to search		
    	Session session = sessionfactory.openSession(); 
	    String hql = "from Event event where event.date=" + Integer.toString(_date) +" and " +"event.time between " + Integer.toString(num_L)+ " and " + Integer.toString(num_U);
	    Query query = session.createQuery(hql);
	    Iterator events = query.list().iterator(); 

        while(events.hasNext()) {
            Event event = (Event) events.next(); 
            System.out.println(event.getType()  +event.getDate() + event.getTime() + event.getPlace() + event.getCreaterId()); 
        }
	}
	public String getInfo(){
	return "0";
	}
	

}
