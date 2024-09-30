package hierarchy.has.a;

import java.util.Scanner;

public class Car {
	
	private String name;
	private String number;
	
	public Car() {
		
	}
	
	public Car(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	public void acceptCar(Scanner sc) {
		
		System.out.println("Enter Vehicle name : ");
		name = sc.next();
		
		System.out.println("Enter Vehicle number : ");
		number = sc.next();
		
	}
	public void displayCar() {
		System.out.println("Enter Vehicle details");
		System.out.println("Vehicle name : "+name);
		System.out.println("Vehicle number : "+number);
	}

}
