package type.conversions;

public class Widening {

	public static void main(String[] args) {
		
	  int n1 = 10;
	  double n2 =n1;   // widening
	  System.out.println(n1);
	  System.out.println(n2);
	  
	  double n3 = 23.5665;
	  int n4 = (int)n3;   // narrowing
	  
	  System.out.println(n3);
	  System.out.println(n4);
	  

		char ch = 'a';
		int n5 = ch; // type conversion
		System.out.println(n5);
		double n6 = ch;
		// short n7 = ch;
//		byte n7 = ch;
		// byte n7 = 65;
//		ch = (char) n7;

	}

}
