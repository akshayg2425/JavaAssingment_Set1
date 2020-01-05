package Assignmentset4;

//Enter yout name and return a string "print the title first and then comma and then first letter of initial name.

import java.util.Scanner;

public class Assingment31 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter your Name");

		String a = s.nextLine();

		String[] input = a.split(" ");

		String first = input[0];

		char intial = input[2].charAt(0);

		System.out.println(first + " , " + intial);

	}

}
