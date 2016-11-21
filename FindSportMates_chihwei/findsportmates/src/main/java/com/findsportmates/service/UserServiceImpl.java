package com.findsportmates.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.findsportmates.dao.UserDAO;
import com.findsportmates.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;
	
	public void setuserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Transactional
	public void addUser(User u) {
		this.userDAO.addUser(u);
	}
	
	@Transactional
	public void updateUser(User u) {
		this.userDAO.updateUser(u);
	}
	
	@Transactional
	public List<User> listUsers() {
		return this.userDAO.listUsers();
	}
	
	@Transactional
	public User getUserById(int id) {
		return this.userDAO.getUserById(id);
	}
	
	@Transactional
	public void removeUser(int id) {
		this.userDAO.removeUser(id);
	}
	
	@Transactional
	public boolean isUserValid(String username, String password) {
		System.out.println("checking the user......");
		User myUser = this.userDAO.getUserByName(username);
		if (username.equals(myUser.getUsername()) && password.equals(myUser.getPassword()))
			return true;
		return false;
	}

}
