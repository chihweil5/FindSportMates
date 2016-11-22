package com.findsportmates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

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
}
