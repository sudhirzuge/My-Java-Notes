package com.sunbeam.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program02 {

	public static void main(String[] args) {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_db", "root", "Sudhir@123");
			Statement insertstmt = connection.createStatement();
			
			String sql = "INSERT INTO employee(name, salary) VALUES('Suresh', 40000)";
			insertstmt.execute(sql);
			
			insertstmt.close();
			connection.close();
			
			System.out.println("Employee inserted successfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
