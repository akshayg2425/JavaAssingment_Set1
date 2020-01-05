package Assingmentset5;

import java.util.Scanner;

public class Assingment44 {

	public static void main(String[] args) {

		int month = 2;
		int year = 2008;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

			System.out.println("No. of Days in the months r 31");

		}

		else if ((month == 2) && (year % 4 == 0)) {
			System.out.println("No. of days in the monts  r 29");
		}

		else if (month == 2) {
			System.out.println("No. of days in the months r 28");
		}

		else {
			System.out.println("No. of days in the months r 30");
		}
	}

}
