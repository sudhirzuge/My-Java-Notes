package array;

import java.util.Scanner;

public class Student {

	int rollno;
	String name;
	double marks;
	
	public Student() {
		
	}
	
	public Student(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void displayStudent() {
		System.out.println("Roll no :"+ rollno);
		System.out.println("name :"+ name);
		System.out.println("marks :"+ marks);
	}
	
	public void acceptStudent() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a roll no");
		rollno = sc.nextInt();
		System.out.println("Enter a name");
		name = sc.next();
		System.out.println("Enter a marks");
		marks = sc.nextDouble();
		
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
