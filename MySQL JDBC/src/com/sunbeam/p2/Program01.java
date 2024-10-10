package com.sunbeam.p2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program01 {

	public static void main(String[] args) {
		try(Connection connection = DbUtil.getConnection()){
			double sal = 200000;
			String sql = "SELECT * FROM employee WHERE salary > ?";
			try(PreparedStatement selectstmt = connection.prepareStatement(sql)){
				selectstmt.setDouble(1, sal);
				ResultSet rs = selectstmt.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1) + "," + rs.getString(2) + "," + rs.getDouble(3));
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
