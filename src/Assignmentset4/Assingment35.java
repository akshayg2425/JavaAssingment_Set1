package Assignmentset4;

import java.util.StringTokenizer;

public class Assingment35 {

	public static void main(String[] args) {

		String ip = "102.168.192.300";

		int count = 0;

		StringTokenizer st = new StringTokenizer(ip, ".");

		if (st.countTokens() == 4) {

			while (st.hasMoreTokens()) {
				int s = Integer.parseInt(st.nextToken());
				if (s >= 0 && s <= 255) {
					count++;
				}

			}
		}

		if (count == 4) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}
	}

}
