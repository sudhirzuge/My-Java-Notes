package scanner;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		
	int n1;
//	Scanner sc = new Scanner(System.in);
//	n1 = sc.nextInt();
//	in above case without sysout statment the program will still run, but it won't show any message before waiting for input,
//	which might confuse the user, as there would be no visible instruction to indicate that the program is waiting for an input.
	
	byte n2;
	short n3;
	long n4;
	
    float n5;
	double n6;
	
	String n7;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	n1 = sc.nextInt();
	System.out.println(n1);
	
	n2 = sc.nextByte();
	n3 = sc.nextShort();
	n4 = sc.nextLong();
	n5 = sc.nextFloat();
	n6 = sc.nextDouble();
	n7 = sc.next();
	
	
	
	
	}

}
