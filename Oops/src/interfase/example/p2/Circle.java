package interfase.example.p2;

import java.util.Scanner;

public class Circle implements Shape {

	int radius;
	
	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter the radius");
		radius = sc.nextInt();

	}

	@Override
	public void calculateArea() {
		System.out.println("The area of circle is : "+(radius*radius*3.14));
	}

}
