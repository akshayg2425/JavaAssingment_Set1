package Assignmentset4;

//Find no of characters in a given string which are not repeated.

import java.util.Scanner;

public class Assignment26 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the String");

		String input = s.nextLine();

		int count = 0;

		for (int i = 0; i < input.length() - 1; i++) {

			if (input.charAt(i) != input.charAt(i + 1))

				count++;

		}

		System.out.println("Count of not duplicate charecters is " + count);

	}

}
