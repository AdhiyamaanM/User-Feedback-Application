package com.feedbackform.HRBP.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.feedbackform.HRBP.model.User;
import com.feedbackform.HRBP.repo.UserRepository;

@Service
public class UserSerivceImpl implements UsersService {
	
	UserRepository userRepository; //Instantiate user repository
	

	public UserSerivceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public String createUser(User user) {
		userRepository.save(user);
		return "user feedback saved successfully";
	}

	@Override
	public String updateUser(User user) {
		userRepository.save(user);
		return "updated successfully";
	}

	@Override
	public String deleteUser(Integer userId) {
		userRepository.deleteById(userId);
		return "deleted successfully";
	}

	@Override
	public User getUser(Integer userId) {
		
		return userRepository.findById(userId).get();
	}

	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}

}
