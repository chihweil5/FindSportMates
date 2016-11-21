package com.findsportmates.service;

import java.util.List;

import com.findsportmates.model.User;

public interface UserService {
	
	public void addUser(User u);
	public void updateUser(User u);
	public List<User> listUsers();
	public User getUserById(int id);
	public User getUserByName(String username);
	public void removeUser(int id);
	boolean isUserValid(String username, String password);
}
