package Unbounded;

class Box<T> {
	private T obj;

	public void setObj(T obj) {

		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class Program03 {

	// unbounded types -> lower bound
	public static void printBox(Box<? super Integer> b) {
		System.out.println(b.getObj());
	}

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		printBox(b1);
		Box<Number> b2 = new Box<>();
		printBox(b2);
		Box<Double> b3 = new Box<>();
		// printBox(b3); // NOT OK

	}

}
