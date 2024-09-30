package type.conversions;

public class Boxing {

	public static void main(String[] args) {
		
		int n1 = 10;
		Integer i1 = new Integer(n1); // Boxing
		// Converting the primitive type (value type)
		// into Non Primitive types (Reference type) is called as Boxing

		Integer i2 = new Integer(20);
		int n2 = i2.intValue(); // UnBoxing
		System.out.println(n2);
		// Converting the Non Primitive type (Reference type)
		// into Primitive type (Value type) is called as UnBoxing
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
	}

}
