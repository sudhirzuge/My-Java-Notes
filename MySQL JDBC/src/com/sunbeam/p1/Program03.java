package com.sunbeam.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program03 {

	public static void main(String[] args) {
		
		final String URL = "jdbc:mysql://localhost:3306/dac_db";
		final String USERNAME = "root";
		final String PASSWORD = "Sudhir@123";
		
		//using try with resource
		try ( Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)){
			try(Statement updatestmt = connection.createStatement()){
				String sql = "UPDATE employee SET salary = 50000 where empid = 2";
				updatestmt.execute(sql);
				System.out.println("Employee updated");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
