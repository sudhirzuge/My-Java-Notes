package reference;

class Time{
	//fields
	int hr;    
	int min;
	
	public void acceptTime() {
		
	}
	
	public void displayTime() {
		
	}
}

public class Program01 {

	public static void main(String[] args) {
		
		Time t1 = null;   //references initialise with null & variables with 0
		t1.acceptTime();
		t1.displayTime();
//		 no error but after compiling it throws null pointer exception
		
//		Time t2;
//		t2.acceptTime();
//		t2.displayTime();
//		as t2 reference not pointing at object it showing error
	}

}
