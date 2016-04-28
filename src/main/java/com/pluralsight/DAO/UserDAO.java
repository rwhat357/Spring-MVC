package com.pluralsight.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.User;
public class UserDAO {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/fitness_tracker";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "admin";
	
	public  List<User> getAll(){
		Connection conn = null;
		Statement stmt = null;
		List<User> users = new ArrayList<User>();
		try {
			// STEP 2: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT id, username, firstname, lastname, email, password FROM user";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			User user;
			while (rs.next()) {
				user = new User();
				
				// Retrieve by column name
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setFirstname(rs.getString("firstname"));
				user.setLastname(rs.getString("lastname"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				users.add(user);
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		
		return users;
		
		
	}
	
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
