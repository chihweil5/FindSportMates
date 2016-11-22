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
	private int TimeDiff=2;
	public static void main(String[] args) {
		sessionfactory = new Configuration().configure().buildSessionFactory();
		SearchEvent ME = new SearchEvent();
		////datetime = "yyyy-MM-dd";
	//	ME.addEvent("Basketball","11/05/2016","13:00-15:00","room1",2);
	//	ME.addEvent("Badminton","11/05/2016","18:00-20:00","room2",2);
	//	ME.addEvent("Basketball","11/05/2016","15:00-17:00","room1",2);

		//ME.SearchDateTime(20161105,1350,1500);
		//ME.SearchDateTimeRange("11/05/2016","13:00","18:00");
		//ME.SearchType("Basketball");
		ME.SearchDateTypeAndTimeRange("Volleyball","11/21/2016","07:00","16:00");
		sessionfactory.close(); 

	}
	/* Method to CREATE an event in the database */
	public void addEvent(String _type, String _date, String _time,String _place, int _createrId){

		
	    Event event = new Event(_type,_date, _time,_place,_createrId);

	    Session session = sessionfactory.openSession();
	    Transaction tx= session.beginTransaction();
	    session.save(event);
	    tx.commit();

	}
	
	public void SearchDateTimeRange(String _date,String num_L,String num_U) {
		int Int_num_L=toIntTime(num_L);
		int Int_num_U=toIntTime(num_U);
		String _time;

		for (int i  = Int_num_L ; i <= Int_num_U;i++) {
			_time = toSTime(i);
		    SearchDateTime(_date,_time);

		}
	
	}

	
	
    //public void SearchDateTime(int _date,int num_L,int num_U) {
	public void SearchDateTime(String _date,String  _time) {

		// use HQL to search		
    	Session session = sessionfactory.openSession(); 
	  //  String hql = "from Event event where event.date=" + Integer.toString(_date) +" and " +"event.time between " + Integer.toString(num_L)+ " and " + Integer.toString(num_U);
    
    	String hql = "from Event event where event.date like" + "'%"+_date+"%'" +" and " +"event.time like " + "'%"+_time+"%'";
	    Query query = session.createQuery(hql);
    	
	    Iterator events = query.list().iterator(); 
	    PrintSearchResult(query);
        
	}
	
	public void SearchType(String _type) {

		// use HQL to search		
    	Session session = sessionfactory.openSession(); 
    	String hql = "from Event event where event.type like" + "'%"+_type+"%'";
	    Query query = session.createQuery(hql);
    	
	    PrintSearchResult(query);
	}

	public void SearchDateTypeAndTimeRange(String _type,String _date,String num_L,String num_U) {
		int Int_num_L=toIntTime(num_L);
		int Int_num_U=toIntTime(num_U);
		String _time;

		for (int i  = Int_num_L ; i <= Int_num_U;i++) {
	
			 _time = toSTime(i);
			 SearchDateTypeAndTime(_type,_date,_time);
			
		}
	
	}	
	public void SearchDateTypeAndTime(String _type,String _date,String _time) {

		// use HQL to search		
    	Session session = sessionfactory.openSession(); 
    	String hql = "from Event event where event.type like" + "'%"+_type+"%'" +" and "+ "event.date like" + "'%"+_date+"%'" +" and " +"event.time like " + "'%"+_time+"%'";
	    Query query = session.createQuery(hql);
	   
	    PrintSearchResult(query);
	}	
	
	
	public static int toIntTime(String s) {
	    String[] hourMin = s.split(":");
	    int hour = Integer.parseInt(hourMin[0]);
	    //int mins = Integer.parseInt(hourMin[1]);
	    return hour ;
	}
	public static String toSTime(int _i) {
		String s1;
		String s2;
		if (_i<10){
			s1="0"+Integer.toString(_i);
		} else {
			s1=Integer.toString(_i);
		}
		if (_i+2<10){
			s2="0"+Integer.toString(_i+2);
		} else {
			s2=Integer.toString(_i+2);
		}
		String s = s1 + ":00-" + s2 +":00";
	    return s ;
	}
	public void PrintSearchResult(Query query) {
		Iterator events = query.list().iterator(); 

        while(events.hasNext()) {
            Event event = (Event) events.next(); 
            System.out.println(event.getType()  +event.getDate() + event.getTime() + event.getPlace() + event.getHostid()); 
	   
	    }
	}

}
