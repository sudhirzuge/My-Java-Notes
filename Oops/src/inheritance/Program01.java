package inheritance;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e;

//		e = new Employee(); // NOT OK-> Cannot create object of abstract class
//		e = new Manager();
		e = new Salesman();

		e.accept(sc);
		e.calculateTotalSalary();

		System.out.println(e);
	}

}
