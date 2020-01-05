package AssingmentSet2;

//Get a input string. reverse it and parse it with '-'.

import java.util.Scanner;

public class Assingment15 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the string");

		String s1 = s.nextLine();

		StringBuffer sb = new StringBuffer(s1);

		sb.reverse();

		StringBuffer sb2 = new StringBuffer();

		for (int i = 0; i < (s1.length() * 2) - 1; i++) {
			if (i % 2 != 0) {
				sb2 = sb.insert(i, "-");

			}

		}

		System.out.println(sb2.toString());
	}

}
