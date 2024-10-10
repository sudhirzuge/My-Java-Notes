package com.sunbeam.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program01 {

	public static void main(String[] args) {
		
		//load the mysql driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_db", "root", "Sudhir@123");
			System.out.println("connection successfull");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
