package com.sunbeam.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program04 {

	public static void main(String[] args) {
		
		final String URL = "jdbc:mysql://localhost:3306/dac_db";
		final String USERNAME = "root";
		final String PASSWORD = "Sudhir@123";
		
		//using try with resource
		try ( Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)){
			try(Statement deletestmt = connection.createStatement()){
				String sql = "DELETE FROM employee where empid = 2";
				deletestmt.execute(sql);
				System.out.println("Employee deleted");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
