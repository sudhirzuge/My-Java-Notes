package field.initialisation;

class Test1 {
	int n1;
//	static int n2 = 1000; // field initializer
	static int n2;

	// static block
	static {
		System.out.println("Inside static block - ");
		n2 = 2000;
	}

	public Test1() {
		n1 = 10;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public static void setN2(int n2) {
		Test1.n2 = n2;
	}

	void display() {
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
	}
}

public class StaticBlock {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		Test1 t3 = new Test1();
		t2.setN1(20);

		// t2.setN2(3000); // NOT Recommended
		Test1.setN2(3000);

		t1.display();
		t2.display();
	}

}
