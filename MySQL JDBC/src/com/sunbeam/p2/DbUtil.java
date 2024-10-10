package com.sunbeam.p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	private static final String URL = "jdbc:mysql://localhost/dac_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Sudhir@123";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
}
