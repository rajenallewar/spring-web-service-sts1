package com.syne.api.service.impl;

import com.syne.api.model.User;
import com.syne.api.repository.UserRepository;
import com.syne.api.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUserInfo(String userId) {
		 return userRepository.findByUserId(userId);
	}
	
	@Override
	public void saveUserInfo(User user) {
		userRepository.save(user);
	}
}
