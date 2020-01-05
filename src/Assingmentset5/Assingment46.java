package Assingmentset5;

import java.util.Scanner;

public class Assingment46 {

	public static void main(String[] args) {

		int input = 15;
		int sum = 0;
		int[] iarray = { 10, 15, 20, 25, 30 };

		for (int i = 0; i < iarray.length; i++) {
			if (iarray[i] >= input) {
				sum = sum + iarray[i];

			}
		}

		String sum1 = String.valueOf(sum);

		StringBuffer sb = new StringBuffer();
		sb.append(sum1);
		System.out.println(sb.reverse());

	}

}
