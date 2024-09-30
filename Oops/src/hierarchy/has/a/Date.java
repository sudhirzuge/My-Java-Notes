package hierarchy.has.a;

import java.util.Scanner;

public class Date {
	
	public int day;
	public int month;
	public int year;
	
	public Date() {
		
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year  = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void acceptDate(Scanner sc) {
		System.out.println("Enter day : ");
		day = sc.nextInt();
		System.out.println("Enter month : ");
		month = sc.nextInt();
		System.out.println("Enter year : ");
		year = sc.nextInt();
	}
	
	public String displayDate() {
		return day+"/"+month+"/"+year;
	}
}
