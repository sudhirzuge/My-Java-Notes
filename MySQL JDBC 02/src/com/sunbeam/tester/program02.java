package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.List;

import com.sunbeam.dao.EmployeeDao;
import com.sunbeam.entities.Employee;

public class program02 {
	
	public static void main(String[] args) {
		try (EmployeeDao employeeDao = new EmployeeDao()) {
			List<Employee> empList = employeeDao.getAllEmployees();
			empList.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
