package com.sunbeam.p2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Program02 {

	public static void addData() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name-");
		String name = sc.next();
		
		System.out.println("Enter Salary-");
		double sal = sc.nextDouble();
		
		try(Connection connection = DbUtil.getConnection()){
			
			String sql = "INSERT INTO employee(name, salary) VALUES(?, ?)";
			try(PreparedStatement insertstmt = connection.prepareStatement(sql)){
				insertstmt.setString(1, name);
				insertstmt.setDouble(2, sal);
				insertstmt.executeUpdate();
				System.out.println("Employee added..");
			}
		}
	}
	
	public static void main(String[] args) {
		
		try {
			addData();
			addData();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
