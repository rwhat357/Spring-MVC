package com.pluralsight.service;

import com.pluralsight.DAO.UserDAO;
import com.pluralsight.model.User;

public class UserService {

	UserDAO userDAO = new UserDAO();
	
	public User getUserById(int id) {
		return userDAO.getUserById(id);
	}
	
	public void getAll() {
		userDAO.getAll();
	}

}
