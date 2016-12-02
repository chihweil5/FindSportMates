package com.FindSportMates;

import org.hibernate.Session; 
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public abstract class Search {
    
	public int User_id;
	
	public abstract String getInfo();

}
