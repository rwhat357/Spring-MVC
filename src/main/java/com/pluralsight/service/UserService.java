package com.pluralsight.service;

import java.util.List;

import com.pluralsight.DAO.UserDAO;
import com.pluralsight.model.User;

public class UserService {

	UserDAO userDAO = new UserDAO();
	
	public User getUserById(int id) {
		return userDAO.getUserById(id);
	}
	
	public List<User> getAll() {
		return userDAO.getAll();
	}

}
