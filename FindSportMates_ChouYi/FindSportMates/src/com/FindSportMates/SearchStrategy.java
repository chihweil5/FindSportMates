package com.FindSportMates;

import org.hibernate.SessionFactory;

public interface SearchStrategy {

	 public void SearchRequire(int _date,int num_L,int num_U, String _type);

}
