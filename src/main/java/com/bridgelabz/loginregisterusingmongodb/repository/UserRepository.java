package com.bridgelabz.loginregisterusingmongodb.repository;

import com.bridgelabz.loginregisterusingmongodb.model.User;
import com.mongodb.DBCollection;

public interface UserRepository {

	public DBCollection getCollection();
	public User getUser(String email);
	public void saveUser(User user);
	
}
