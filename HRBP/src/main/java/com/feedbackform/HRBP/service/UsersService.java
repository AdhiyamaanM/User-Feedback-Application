package com.feedbackform.HRBP.service;

import java.util.List;

import com.feedbackform.HRBP.model.User;

public interface UsersService {
	public String createUser(User user);
	public String updateUser(User user);
	public String deleteUser(Integer userId);
	public User getUser(Integer userId);
	public List<User>getAllUser(); //used to fetch all the data from the user data base
	
	

}
