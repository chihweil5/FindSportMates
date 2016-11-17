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
		ME.addEvent("basketball","2016-11-03","room1",2);

		sessionfactory.close(); 

	}
	/* Method to CREATE an event in the database */
	public void addEvent(String _type, String _dateTime, String _place, int _createrId){

		
	    Event event = new Event(_type,_dateTime,_place,_createrId);

	    Session session = sessionfactory.openSession();
	    Transaction tx= session.beginTransaction();
	    session.save(event);
	    tx.commit();

	}
	
	public String getInfo(){
	return "0";
	}
	

}
