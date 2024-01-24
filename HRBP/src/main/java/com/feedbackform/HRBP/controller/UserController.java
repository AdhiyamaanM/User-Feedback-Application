package com.feedbackform.HRBP.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feedbackform.HRBP.model.User;
//import com.feedbackform.HRBP.service.UserService;
import com.feedbackform.HRBP.service.UsersService;



@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/test")
	public String test() {
		return "up";
	}
	
	UsersService usersService;
	
	public UserController(UsersService usersService) {
		 
		this.usersService = usersService;
	}
	
	//read specific user details. 
	
	@GetMapping("{userId}")
	public User getUser(@PathVariable("userId") Integer userId) {
		return usersService.getUser(userId);
	}
	
	// to read all the user details
	@GetMapping()
	public List<User> getAllUser() {
		return usersService.getAllUser();
	}
	
	
	@PostMapping("/saveuser")
	public String createUser(@RequestBody User user) { 
		return usersService.createUser(user);
		
	}

}
