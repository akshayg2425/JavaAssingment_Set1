package AssingmentSet2;

import java.util.StringTokenizer;

public class Assingment12 {

	public static void main(String[] args) {

		String s = "12:45 yz";

		boolean b = false;

		StringTokenizer st = new StringTokenizer(s, " ");

		String s2 = st.nextToken();

		String s3 = st.nextToken();

		StringTokenizer st1 = new StringTokenizer(s2, ":");

		int n1 = Integer.parseInt(st1.nextToken());

		int n2 = Integer.parseInt(st1.nextToken());

		if (s3.equalsIgnoreCase("am") || s3.equalsIgnoreCase("pm")) {
			if (n1 <= 12 && n2 <= 59) {
				b = true;
			}
		}

		if (b == true) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
