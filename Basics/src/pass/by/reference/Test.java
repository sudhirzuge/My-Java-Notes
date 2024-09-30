package pass.by.reference;

public class Test {

	 public static void modifyObject(MyObject objRef) {
	        objRef.value = 20;  // This modifies the original object
	        System.out.println("Inside method, objRef.value = " + objRef.value);
	    }
	
	public static void main(String[] args) {
		
		        MyObject obj = new MyObject();
		        obj.value = 10;
		        
		        System.out.println("Before method call, obj.value = " + obj.value);
		        
		        modifyObject(obj);  // Pass the reference to the object
		        
		        System.out.println("After method call, obj.value = " + obj.value);
		    }
		    
	}

class MyObject {
    int value;
}

