package type.conversions;

public class AutoBoxing {

	public static void main(String[] args) {
		

		int n1 = 10;
		Integer i1 = n1; // Auto-Boxing
		System.out.println(i1);

		Integer i2 = 20; // Auto-Boxing
		int n2 = i2; // Auto-UnBoxing
		System.out.println(n2);
	}

}
