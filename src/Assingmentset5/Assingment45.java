package Assingmentset5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assingment45 {
	public static void main(String[] args) {

		int s1, s2, flag = 0;

		int sum = 0;

		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<>();

		Scanner s = new Scanner(System.in);
		System.out.println("Enter  input1 ----");
		s1 = s.nextInt();
		System.out.println("Enter input2 ----");
		s2 = s.nextInt();
		System.out.println("Sum of non prime nos. is");
		for (int i = s1; i <= s2; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else {
					flag = 1;
				}
			}

			if (flag == 1) {

				l1.add(i);
			}
		}

		for (int i = s1 + 1; i <= s2; i++) {
			l2.add(i);
		}
		l2.removeAll(l1);

		/*
		 * for (int i = 0; i < l2.size(); i++) { System.out.println(l2.get(i)); }
		 */

		for (int i = 0; i < l2.size(); i++) {
			sum += l2.get(i);
		}
		System.out.println(sum);
	}

}
