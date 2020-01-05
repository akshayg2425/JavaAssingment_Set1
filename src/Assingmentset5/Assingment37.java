package Assingmentset5;

import java.util.Scanner;

public class Assingment37 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String to entercrypt..");

		String ip = s.nextLine();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < ip.length(); i++) {
			if (i % 2 != 0) {
				char c = ip.charAt(i);

				if (c == 'z') {
					char c1 = 'a';

					sb.append(c1);

				}

				else if (c == 'Z') {
					char c1 = 'A';

					sb.append(c1);
				} else {

					char c1 = (char) (c + 1);

					sb.append(c1);
				}
			} else {
				sb.append(ip.charAt(i));
			}

		}
		System.out.println(sb);
	}

}
