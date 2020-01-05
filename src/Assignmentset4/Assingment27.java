package Assignmentset4;

//Get a input string. Find if it is a negative number, if true return the absolute value, in other cases return -1.

import java.util.Scanner;

public class Assingment27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the String");

		String s = input.nextLine();

		String p = "";

		if (s.indexOf("-") == 0) {

			p = s.substring(1, s.length());
			System.out.println("output is " + p);
			System.out.println(" true");
		} else {
			System.out.println("-1");
		}

	}

}
