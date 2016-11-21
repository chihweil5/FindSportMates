package com.findsportmates.model;

import javax.persistence.*;


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
	private int role;

	public User(){
		super();
	}
	
	public User(int id, String username, String password, int role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
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

	
	
	public int getRole() {
		return role;
	}


	public void setRole(int role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	
	
	
}
