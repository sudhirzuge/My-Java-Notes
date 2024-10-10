package genericMethod;

interface Shape {

}

class Circle implements Shape {

}

class Rectangle implements Shape {

}

// only extends keyword is allowed in bounded type parameter
class Box<T extends Shape> {
	private Number obj;
}

public class Program02 {

	public static void main(String[] args) {
		Box<Shape> b1 = new Box<>();

	}

}
