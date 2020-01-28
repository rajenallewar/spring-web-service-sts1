package com.syne.api.service;

import com.syne.api.model.User;

public interface UserService {
	 public User getUserInfo(String userId);
	 public void saveUserInfo(User user);
}
