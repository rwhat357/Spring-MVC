package com.pluralsight.DAO;

import com.pluralsight.model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class UserDAO {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/fitness_tracker";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "admin";
	
	public  void getAll(){
		Connection conn = null;
		Statement stmt = null;
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
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				String email = rs.getString("email");
				String password = rs.getString("password");

				// Display values
				System.out.print("id: " + id);
				System.out.print(", username: " + username);
				System.out.print(", username: " + username);
				System.out.println(", lastname: " +lastname);
				System.out.println(", email: " +email);
				System.out.println(", password: " + password);
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
		System.out.println("Goodbye!");
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
