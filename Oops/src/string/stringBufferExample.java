package string;

public class stringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("sunbeam");
		StringBuffer sb2 = new StringBuffer("sunbeam");

		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb1 == sb2 - " + (sb1 == sb2));
		System.out.println("sb1.equals(sb2) - " + (sb1.equals(sb2)));
	}
}
