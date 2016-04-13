package com.pluralsight.DAO;

import com.pluralsight.model.User;

public class UserDAO {

	public User getUserById(int id) {
		
		User user = new User();
		user.setId(1);
		user.setUsername("fredywhatley");
		user.setFirstname("Fredy");
		user.setLastname("Whatley");
		user.setEmail("fredywhatley@gmail.com");
		
		return (user);
	}

}
