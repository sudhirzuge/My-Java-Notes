package pass.by.value;

public class Test {

	public static void main(String[] args) {
	
		        int num = 10;  // Primitive type
		        System.out.println("Before method call, num = " + num);
		        
		        modifyValue(num);  // Pass the copy of num to the method
		        
		        System.out.println("After method call, num = " + num);
		    }
		    
		    public static void modifyValue(int value) {
		        value = 20;  // This change won't affect the original 'num' in main()
		        System.out.println("Inside method, value = " + value);
		    }
		}


	


