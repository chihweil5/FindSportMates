package com.findsportmates.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "User")
public class User {
	
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	@Column(name = "userid")  
	private int id;
	
	@Column(name = "username")  
	private String username;
	
	@Column(name = "password") 
	private String password;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "department")
	private String department;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "participants")
	private Set<Event> events = new HashSet<Event>(0);

	public User(){
		super();
	}
	
	public User(int id, String username, String password, String role, String department, String phone, String year) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.department = department;
		this.phone = phone;
		this.year = year;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}
	
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + ", phone="
				+ phone + ", year=" + year + ", department=" + department + ", events=" + events + "]";
	}

	
	
}
