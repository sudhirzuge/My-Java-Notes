package handling3.tester;

import handling3.entities.Date;
import handling3.exceptions.InvalidDateException;

public class Program02 {

	public static void main(String[] args) {
		Date d1 = new Date();
		try {
			d1.setDay(25);
			d1.setMonth(10);
			try {
				d1.setYears(1800);
			} catch (InvalidDateException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Program Finished");

	}

}
