package hierarchy.has.a;

import java.util.Scanner;

// employee has-a date of joining
// employee has-a car
public class Employee {
  
	private int empid;
	private String name;
	private Double salary;
	
	private Date doj = new Date(); // Association (composition)
	private Car car = new Car();         // Association (Aggregation)
			
	{
	//	doj = new Date();
	}
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void acceptEmployee(Scanner sc) {
		
		System.out.print("Enter the empid - ");
		empid = sc.nextInt();

		System.out.print("Enter the employee name - ");
		name = sc.next();

		System.out.print("Enter the employee salary - ");
		salary = sc.nextDouble();
		
		System.out.println("Enter date of joining");
		doj.acceptDate(sc);
		
		if(car != null)
			car.acceptCar(sc);
		
	}
	
	public void displayEmployee() {

			System.out.println("Empid - " + empid);
			System.out.println("Name - " + name);
			System.out.println("Salary - " + salary);
			System.out.println("Date Of Joining - " + doj.displayDate());
			if (car != null)
				car.displayCar();
	}
}
