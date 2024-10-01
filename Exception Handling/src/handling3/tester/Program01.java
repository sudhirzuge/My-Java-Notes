package handling3.tester;

import java.sql.SQLException;

import handling3.entities.Time;

public class Program01 {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHr(20);
		try {
			t.setMin(55);
			t.setSec(90);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(t);
	}

}
