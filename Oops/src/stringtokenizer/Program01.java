package stringtokenizer;

import java.util.StringTokenizer;

public class Program01 {

	public static void main(String[] args) {
		String s1 = "www.sunbeaminfo.com";
		StringTokenizer str = new StringTokenizer(s1, ".");
		while (str.hasMoreTokens()) {
			String token = str.nextToken();
			System.out.println(token);
		}
	}

}
