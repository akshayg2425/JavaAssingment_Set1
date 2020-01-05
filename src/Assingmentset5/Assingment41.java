package Assingmentset5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assingment41 {

	public static void main(String[] args) {

		int[] input1 = { 1, 2, 3 };

		int[] input2 = { 3, 4, 5 };

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the option....1---union...2---intersection...3--- minus");

		int q = s.nextInt();

		List<Integer> l1 = new ArrayList<Integer>();

		List<Integer> l2 = new ArrayList<>();

		List<Integer> l3 = new ArrayList<>();

		for (int i = 0; i < input1.length; i++) {
			l1.add(input1[i]);
		}

		for (int i = 0; i < input2.length; i++) {
			l2.add(input2[i]);
		}

		switch (q) {
		case 1:
			l1.removeAll(l2);
			l1.addAll(l2);
			Collections.sort(l1);
			l3.addAll(l1);
			break;

		case 2:
			l1.retainAll(l2);
			Collections.sort(l1);
			l3.addAll(l1);
			break;

		case 3:
			if (l1.size() == l2.size()) {
				for (int i = 0; i < l1.size(); i++) {
					l3.add(Math.abs(l2.get(i) - l1.get(i)));
				}
			}

			break;
		}

		int[] output = new int[l3.size()];
		for (int i = 0; i < l3.size(); i++) {
			output[i] = l3.get(i);
			System.out.println(output[i]);
		}

	}

}
