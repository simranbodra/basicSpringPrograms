package com.bridgelabz.loginregisterusingmongodb.service;

import com.bridgelabz.loginregisterusingmongodb.model.User;

public interface UserService {

	public User login(String emailId, String password);
	public boolean register(User user);
	
}
