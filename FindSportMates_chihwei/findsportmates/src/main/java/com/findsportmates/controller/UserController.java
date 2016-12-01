package com.findsportmates.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.findsportmates.model.Event;
import com.findsportmates.model.User;
import com.findsportmates.service.UserService;

@Controller
@SessionAttributes("userid") // only use when generic parameter bc it takes memory
public class UserController {
	
	private UserService userService;
	
	@Autowired(required = true)
	@Qualifier(value = "userService")
	public void setUserService(UserService us) {
		this.userService = us;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(){
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String username, @RequestParam String password, ModelMap model){
		if(!userService.isUserValid(username, password)){
			model.put("errorMsg", "Invalid user");
			return "login";
		}
		
		model.addAttribute("userid", Integer.toString(userService.getUserByName(username).getId()));
		return "redirect:/event";
	}
	
	@RequestMapping(value = "/search-user", method = RequestMethod.GET)
	public String showSearchUserPage(ModelMap model){
		//model.addAttribute("user", new User());
		return "searchuser";
	}
	
	@RequestMapping(value = "/search-user", method = RequestMethod.POST)
	public String searchtEvent(ModelMap model,@RequestParam("username") String username) {
		System.out.println("test:  "+ username);
		User result = this.userService.getUserByName(username);
		model.addAttribute("user", result);
		return "searchuser_result";

	}
}
