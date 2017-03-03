package com.test.service;

import com.test.entity.User;
public interface IUserService {
	
	public User getUserById(int userId);
	public User getUserIdByUser(User user);
	public Boolean getUserIsExist(User user);
}
