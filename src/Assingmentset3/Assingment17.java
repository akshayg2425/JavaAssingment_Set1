package Assingmentset3;

// A integer input is accepted. find the square of individual digits and find their sum.

import java.util.Scanner;

public class Assingment17 {

	public static void main(String[] args) {

		int n = 125;

		int sum = 0;

		while (n != 0) {
			int p = n % 10;

			System.out.println(p);
			
			sum = sum + (p * p);

			n = n / 10;

		}

		System.out.println("Output is:" + sum);

	}

}
