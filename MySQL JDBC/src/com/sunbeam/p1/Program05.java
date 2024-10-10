package com.sunbeam.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program05 {

	public static void main(String[] args) {
		
		final String URL = "jdbc:mysql://localhost:3306/dac_db";
		final String USERNAME = "root";
		final String PASSWORD = "Sudhir@123";
		
		//using try with resource
		try ( Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)){
			try(Statement selectstmt = connection.createStatement()){
				String sql = "SELECT * FROM employee";
				selectstmt.execute(sql);
				ResultSet rs = selectstmt.getResultSet();
				while(rs.next()) {
					int empid = rs.getInt(1);
					String name = rs.getString(2);
					double salary = rs.getDouble(3);
					System.out.println(empid +","+ name +","+salary);
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
