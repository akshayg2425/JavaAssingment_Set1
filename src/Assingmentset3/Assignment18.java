package Assingmentset3;

//Two input strings are accepted. If the two strings are of same length concat them and return, if they are not of same length, reduce the longer string to size of smaller one, and concat them

import java.util.Scanner;

public class Assignment18 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first String");

		String one = s.nextLine();

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter the secound string");

		String two = s1.nextLine();

		if (one.length() == two.length()) {

			String three = one.concat(two);

			System.out.println("Result is :" + three);
		}

		if (one.length() > two.length()) {
			String four = one.substring(0, two.length());

			String output = four.concat(two);

			System.out.println("Result for diffrent length of string is :" + output);

		}

		if (two.length() > one.length()) {
			String four = two.substring(0, one.length());

			String output = one.concat(four);

			System.out.println("Result for diffrent length of string is :" + output);

		}
	}

}
