package array;

public class Program03 {

//	public static void main(String[] args) {
//		// int arr[] = new int[5];
//		// int[] arr = new int[5];
//		// int[] arr = new int[] { 10, 20, 30, 40, 50 };
//	}

	
//	public static void main(String[] args) {
//		Student arr[] = new Student[5];
//		arr[0] = new Student(1, "sudhir", 34);
//		arr[1] = new Student(2, "gautam", 76);
//		arr[2] = new Student(3, "milind", 97);
//		arr[3] = new Student(4, "mukesh", 45);
//		arr[4] = new Student();
//		arr[4].acceptStudent();
//		
//		for(Student s : arr) {
//			s.displayStudent();
//		}
//	}
	
	
	public static void main(String[] args) {
		
			Student arr[] = new Student[5];

			for (Student s : arr)
				s = new Student();

			arr[0].displayStudent(); // NullPointerException

	}
}
